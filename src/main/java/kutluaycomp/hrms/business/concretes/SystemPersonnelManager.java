package kutluaycomp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kutluaycomp.hrms.business.abstracts.SystemPersonnelService;
import kutluaycomp.hrms.business.constants.Messages;
import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.Result;
import kutluaycomp.hrms.core.utilities.results.SuccessDataResult;
import kutluaycomp.hrms.core.utilities.results.SuccessResult;
import kutluaycomp.hrms.dataAccess.abstracts.SystemPersonnelDao;
import kutluaycomp.hrms.entities.concretes.SystemPersonnel;

@Service
public class SystemPersonnelManager implements SystemPersonnelService {
	private SystemPersonnelDao systemPersonnelDao;
	
	@Autowired
	public SystemPersonnelManager(SystemPersonnelDao systemPersonnelDao) {
		super();
		this.systemPersonnelDao = systemPersonnelDao;
	}

	@Override
	public Result add(SystemPersonnel systemPersonnel) {
		this.systemPersonnelDao.save(systemPersonnel);
		return new SuccessResult(Messages.added("Sistem Personeli"));
	}

	@Override
	public DataResult<List<SystemPersonnel>> getAll() {
		var result = this.systemPersonnelDao.findAll();
		return new SuccessDataResult<List<SystemPersonnel>>(result);
	}

	

}
