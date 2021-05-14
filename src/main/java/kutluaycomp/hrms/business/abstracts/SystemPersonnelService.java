package kutluaycomp.hrms.business.abstracts;

import java.util.List;

import kutluaycomp.hrms.entities.concretes.SystemPersonnel;

public interface SystemPersonnelService {
	void add(SystemPersonnel systemPersonnel);
	void update(SystemPersonnel systemPersonnel);
	void delete(SystemPersonnel systemPersonnel);
	SystemPersonnel getById(int id);
	List<SystemPersonnel> getAll();

}
