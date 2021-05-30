package kutluaycomp.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kutluaycomp.hrms.business.abstracts.OperationClaimService;

@RestController
@RequestMapping("/api/operationclaims")
public class OperationClaimsController {
	
	private OperationClaimService operationClaimService;
	
	@Autowired
	public OperationClaimsController(OperationClaimService operationClaimService) {
		this.operationClaimService=operationClaimService;
	}
	
	

}
