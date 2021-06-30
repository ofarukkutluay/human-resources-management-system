package kutluaycomp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kutluaycomp.hrms.business.abstracts.WayOfWorkingService;
import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.SuccessDataResult;
import kutluaycomp.hrms.dataAccess.abstracts.WayOfWorkingDao;
import kutluaycomp.hrms.entities.concretes.WayOfWorking;

@Service
public class WayOfWorkingManager implements WayOfWorkingService {
	
	private WayOfWorkingDao wayOfWorkingDao;
	
	@Autowired
	public WayOfWorkingManager(WayOfWorkingDao wayOfWorkingDao) {
		super();
		this.wayOfWorkingDao = wayOfWorkingDao;
	}


	@Override
	public DataResult<List<WayOfWorking>> getAll() {
		var result = this.wayOfWorkingDao.findAll();
		return new SuccessDataResult<List<WayOfWorking>>(result);
	}

}
