package kutluaycomp.hrms.business.abstracts;

import java.util.List;

import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.Result;
import kutluaycomp.hrms.entities.concretes.Employer;
import kutluaycomp.hrms.entities.concretes.SystemPersonnel;


public interface EmployerService {
	Result add(Employer employer);
	DataResult<List<Employer>> getAll();
	DataResult<Employer> getById(int id);
	Result employerActivate(int employerId,SystemPersonnel systemPersonnel);
}
