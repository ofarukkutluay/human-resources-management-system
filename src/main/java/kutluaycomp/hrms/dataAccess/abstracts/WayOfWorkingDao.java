package kutluaycomp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kutluaycomp.hrms.entities.concretes.WayOfWorking;

public interface WayOfWorkingDao extends JpaRepository<WayOfWorking, Integer> {

}
