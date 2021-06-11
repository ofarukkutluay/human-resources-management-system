package kutluaycomp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kutluaycomp.hrms.business.abstracts.OperationClaimService;
import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.entities.concretes.OperationClaim;

@RestController
@RequestMapping("/api/operationclaims")
public class OperationClaimsController {
	
	private OperationClaimService operationClaimService;
	
	@Autowired
	public OperationClaimsController(OperationClaimService operationClaimService) {
		this.operationClaimService=operationClaimService;
	}
	
	public DataResult<List<OperationClaim>> getAll(){
		return this.operationClaimService.getAll();
	}
	
	

}
