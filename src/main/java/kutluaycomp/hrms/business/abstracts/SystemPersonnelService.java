package kutluaycomp.hrms.business.abstracts;

import java.util.List;

import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.Result;
import kutluaycomp.hrms.entities.concretes.SystemPersonnel;

public interface SystemPersonnelService {
	Result add(SystemPersonnel systemPersonnel);
	DataResult<List<SystemPersonnel>> getAll();
	
}
