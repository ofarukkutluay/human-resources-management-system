package kutluaycomp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kutluaycomp.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
	
}
