package kutluaycomp.hrms.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import kutluaycomp.hrms.business.abstracts.JobAdvertisementService;
import kutluaycomp.hrms.business.constants.Messages;
import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.Result;
import kutluaycomp.hrms.core.utilities.results.SuccessDataResult;
import kutluaycomp.hrms.core.utilities.results.SuccessResult;
import kutluaycomp.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kutluaycomp.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
	
	private JobAdvertisementDao jobAdvertisementDao;
	

	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		jobAdvertisement.setCreationDate(LocalDate.now());
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult(Messages.added("İş ilanı"));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		var result = this.jobAdvertisementDao.findAll();
		return new SuccessDataResult<List<JobAdvertisement>>(result,Messages.listed("İş ilanları"));
	}

	@Override
	public DataResult<JobAdvertisement> getById(int id) {
		var result = this.jobAdvertisementDao.findById(id).get();
		return new SuccessDataResult<JobAdvertisement>(result,Messages.listed);
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByEmployerId(int id) {
		var result = this.jobAdvertisementDao.getByEmployer_Id(id);
		return new SuccessDataResult<List<JobAdvertisement>>(result,Messages.listed("Firmanın iş ilanları"));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getActivated() {
		var result = this.jobAdvertisementDao.getByActivatedTrue();
		return new SuccessDataResult<List<JobAdvertisement>>(result, Messages.listed("Aktif iş ilanları"));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByDateRange(String startDate, String finalDate,
			boolean activated) {
		LocalDate startDate1 = LocalDate.parse(startDate);
		LocalDate finalDate1 = LocalDate.parse(finalDate);
		var result = this.jobAdvertisementDao.getByCreationDateBetweenAndActivated(startDate1, finalDate1, activated);
		return new SuccessDataResult<List<JobAdvertisement>>(result,Messages.listed);
	}

}
