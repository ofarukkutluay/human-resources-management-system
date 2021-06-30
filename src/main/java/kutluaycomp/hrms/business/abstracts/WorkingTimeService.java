package kutluaycomp.hrms.business.abstracts;

import java.util.List;

import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.entities.concretes.WorkingTime;

public interface WorkingTimeService {
	public DataResult<List<WorkingTime>> getAll();
	

}
