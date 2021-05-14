package kutluaycomp.hrms.business.abstracts;

import java.util.List;

import kutluaycomp.hrms.entities.concretes.Employer;


public interface EmployerService {
	void add(Employer employer);
	void update(Employer employer);
	void delete(Employer employer);
	Employer getById(int id);
	List<Employer> getAll();
}
