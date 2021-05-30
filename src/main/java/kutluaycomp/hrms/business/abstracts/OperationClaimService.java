package kutluaycomp.hrms.business.abstracts;

import java.util.List;

import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.Result;
import kutluaycomp.hrms.entities.concretes.OperationClaim;

public interface OperationClaimService {
	Result add(OperationClaim operationClaim);
	DataResult<List<OperationClaim>> getAll();
	DataResult<OperationClaim> getById(int id);

}
