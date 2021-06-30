package kutluaycomp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kutluaycomp.hrms.business.abstracts.WorkingTimeService;
import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.SuccessDataResult;
import kutluaycomp.hrms.dataAccess.abstracts.WorkingTimeDao;
import kutluaycomp.hrms.entities.concretes.WorkingTime;

@Service
public class WorkingTimeManager implements WorkingTimeService {
	
	private WorkingTimeDao workingTimeDao;
	
	@Autowired
	public WorkingTimeManager(WorkingTimeDao workingTimeDao) {
		super();
		this.workingTimeDao = workingTimeDao;
	}



	@Override
	public DataResult<List<WorkingTime>> getAll() {
		var result = this.workingTimeDao.findAll();
		return new SuccessDataResult<List<WorkingTime>>(result);
	}

}
