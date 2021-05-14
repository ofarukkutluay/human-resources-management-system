package kutluaycomp.hrms.business.abstracts;

import java.util.List;

import kutluaycomp.hrms.entities.concretes.OperationClaim;

public interface OperationClaimService {
	void add(OperationClaim operationClaim);
	List<OperationClaim> getAll();
	OperationClaim getById(int id);

}
