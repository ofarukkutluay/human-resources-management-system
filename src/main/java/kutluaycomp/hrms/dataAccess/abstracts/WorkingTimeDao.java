package kutluaycomp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kutluaycomp.hrms.entities.concretes.WorkingTime;

public interface WorkingTimeDao extends JpaRepository<WorkingTime, Integer> {

}
