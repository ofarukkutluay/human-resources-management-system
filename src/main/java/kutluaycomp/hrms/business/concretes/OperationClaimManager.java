package kutluaycomp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kutluaycomp.hrms.business.abstracts.OperationClaimService;
import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.Result;
import kutluaycomp.hrms.core.utilities.results.SuccessDataResult;
import kutluaycomp.hrms.core.utilities.results.SuccessResult;
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
		this.operationClaimDao.save(operationClaim);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<OperationClaim>> getAll() {
		var result = this.operationClaimDao.findAll();
		return new SuccessDataResult<List<OperationClaim>>(result);
	}

	@Override
	public DataResult<OperationClaim> getById(int id) {
		var result = this.operationClaimDao.findById(id).get();
		return new SuccessDataResult<OperationClaim>(result);
	}



}
