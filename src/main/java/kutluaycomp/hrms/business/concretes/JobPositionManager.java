package kutluaycomp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kutluaycomp.hrms.business.abstracts.JobPositionService;
import kutluaycomp.hrms.business.constants.Messages;
import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.Result;
import kutluaycomp.hrms.core.utilities.results.SuccessDataResult;
import kutluaycomp.hrms.core.utilities.results.SuccessResult;
import kutluaycomp.hrms.dataAccess.abstracts.JobPositionDao;
import kutluaycomp.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		this.jobPositionDao=jobPositionDao;
	}

	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult(Messages.added("İş Pozisyonları"));
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		var result = this.jobPositionDao.findAll();
		return new SuccessDataResult<List<JobPosition>>(result, Messages.listed("İş Posizyonları"));
	}

}
