package kutluaycomp.hrms.api.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kutluaycomp.hrms.business.abstracts.EmployerService;
import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.Result;
import kutluaycomp.hrms.entities.concretes.Employer;

@CrossOrigin
@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	private EmployerService employerService;

	@Autowired
	public EmployersController(EmployerService employerService) {
		this.employerService = employerService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		return this.employerService.add(employer);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
	}
	
	@PostMapping("/employerActivate")
	public Result employerActivate(@RequestParam int systemPersonnelId,@RequestParam int employerId) {
		return this.employerService.employerActivate(systemPersonnelId,employerId);
	}
	
	@GetMapping("/getbyactivatedtrue")
	public DataResult<List<Employer>> getByActivatedTrue(){
		return this.employerService.getByActivatedTrue();
	}
	
	@GetMapping("/getbyactivatedfalse")
	public DataResult<List<Employer>> getByActivatedFalse(){
		return this.employerService.getByActivatedFalse();
	}
	
}
