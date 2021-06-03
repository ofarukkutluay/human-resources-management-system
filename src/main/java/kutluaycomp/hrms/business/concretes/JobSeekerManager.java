package kutluaycomp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kutluaycomp.hrms.business.abstracts.JobSeekerService;
import kutluaycomp.hrms.business.constants.Messages;
import kutluaycomp.hrms.core.adapters.personCheck.MernisCheckManager;
import kutluaycomp.hrms.core.adapters.personCheck.PersonCheckService;
import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.ErrorResult;
import kutluaycomp.hrms.core.utilities.results.Result;
import kutluaycomp.hrms.core.utilities.results.SuccessDataResult;
import kutluaycomp.hrms.core.utilities.results.SuccessResult;
import kutluaycomp.hrms.dataAccess.abstracts.JobSeekerDao;
import kutluaycomp.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	private JobSeekerDao jobSeekerDao;

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		System.out.println(jobSeeker.toString());
		PersonCheckService personCheckService = new MernisCheckManager();

		
			if (personCheckService.fakeCheckIfRealPerson(jobSeeker)) {
				this.jobSeekerDao.save(jobSeeker);
				return new SuccessResult(Messages.added("İş Arayanlar"));
			}
			
			return new ErrorResult(Messages.mernisError);

	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		var result = this.jobSeekerDao.findAll();
		return new SuccessDataResult<List<JobSeeker>>(result, Messages.listed("İş Arayanlar"));
	}

}
