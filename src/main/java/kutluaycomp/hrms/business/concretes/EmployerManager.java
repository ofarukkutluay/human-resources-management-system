package kutluaycomp.hrms.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kutluaycomp.hrms.business.abstracts.EmployerService;
import kutluaycomp.hrms.business.constants.Messages;
import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.ErrorResult;
import kutluaycomp.hrms.core.utilities.results.Result;
import kutluaycomp.hrms.core.utilities.results.SuccessDataResult;
import kutluaycomp.hrms.core.utilities.results.SuccessResult;
import kutluaycomp.hrms.core.utilities.validations.CustomValidators;
import kutluaycomp.hrms.dataAccess.abstracts.EmployerDao;
import kutluaycomp.hrms.entities.concretes.Employer;
import kutluaycomp.hrms.entities.concretes.SystemPersonnel;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}

	@Override
	public Result add(Employer employer) {
		System.out.println(employer.toString());

		if (CustomValidators.doHaveEmail(employer.getEmail())) {

			this.employerDao.save(employer);
			return new SuccessResult(Messages.added("İş veren"));
		}

		return new ErrorResult(Messages.emailDomainError);
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		var result = this.employerDao.findAll();
		return new SuccessDataResult<List<Employer>>(result, Messages.listed("İş verenler"));
	}

	@Override
	public DataResult<Employer> getById(int id) {
		var result = this.employerDao.getOne(id);
		return new SuccessDataResult<Employer>(result);
	}

	@Override
	public Result employerActivate(int systemPersonnelId,int employerId) {
		var employer = this.employerDao.findById(employerId).get();
		SystemPersonnel systemPersonnel = new SystemPersonnel();
		systemPersonnel.setId(systemPersonnelId);
		employer.setActivated(true);
		employer.setSystemPersonnel(systemPersonnel);
		employer.setActivationDate(LocalDate.now());
		this.employerDao.save(employer);
		
		return new SuccessResult("Firma aktif edildi");
	}

	@Override
	public DataResult<List<Employer>> getByActivatedTrue() {
		var result = this.employerDao.getByActivatedTrue();
		return new SuccessDataResult<List<Employer>>(result, Messages.listed("Aktif firmalar"));
	}

	@Override
	public DataResult<List<Employer>> getByActivatedFalse() {
		var result = this.employerDao.getByActivatedFalse();
		return new SuccessDataResult<List<Employer>>(result, Messages.listed("Pasif firmalar"));
	}

}
