package kutluaycomp.hrms.business.abstracts;

import java.util.List;

import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.entities.concretes.WayOfWorking;

public interface WayOfWorkingService {
	public DataResult<List<WayOfWorking>> getAll();
	

}
