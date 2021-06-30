package kutluaycomp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kutluaycomp.hrms.business.abstracts.SchoolService;
import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.entities.concretes.School;

@CrossOrigin
@RestController
@RequestMapping("/api/schools")
public class SchoolsController {
	private SchoolService schoolService;
	
	@Autowired
	public SchoolsController(SchoolService schoolService) {
		super();
		this.schoolService = schoolService;
	}

	@GetMapping("/getall")
	public DataResult<List<School>> getAll(){
		return this.schoolService.getAll();
	}

}
