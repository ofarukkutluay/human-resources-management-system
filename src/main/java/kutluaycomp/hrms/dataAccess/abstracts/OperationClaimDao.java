package kutluaycomp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kutluaycomp.hrms.entities.concretes.OperationClaim;

public interface OperationClaimDao extends JpaRepository<OperationClaim, Integer> {

}
