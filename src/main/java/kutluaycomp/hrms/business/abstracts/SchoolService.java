package kutluaycomp.hrms.business.abstracts;

import java.util.List;

import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.entities.concretes.School;

public interface SchoolService {
	public DataResult<List<School>> getAll();

}
