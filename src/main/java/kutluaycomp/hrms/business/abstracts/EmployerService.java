package kutluaycomp.hrms.business.abstracts;

import java.util.List;

import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.Result;
import kutluaycomp.hrms.entities.concretes.Employer;


public interface EmployerService {
	Result add(Employer employer);
	DataResult<List<Employer>> getAll();
	DataResult<List<Employer>> getByActivatedTrue();
	DataResult<List<Employer>> getByActivatedFalse();
	DataResult<Employer> getById(int id);
	Result employerActivate(int systemPersonnelId,int employerId);
}
