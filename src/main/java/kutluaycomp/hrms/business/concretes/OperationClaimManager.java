package kutluaycomp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kutluaycomp.hrms.business.abstracts.OperationClaimService;
import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.Result;
import kutluaycomp.hrms.dataAccess.abstracts.OperationClaimDao;
import kutluaycomp.hrms.entities.concretes.OperationClaim;

@Service
public class OperationClaimManager implements OperationClaimService {
	
	private OperationClaimDao operationClaimDao;
	
	@Autowired
	public OperationClaimManager(OperationClaimDao operationClaimDao) {
		super();
		this.operationClaimDao = operationClaimDao;
	}

	@Override
	public Result add(OperationClaim operationClaim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<OperationClaim>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<OperationClaim> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}



}
