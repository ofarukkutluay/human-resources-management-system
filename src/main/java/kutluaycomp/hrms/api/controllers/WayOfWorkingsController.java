package kutluaycomp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kutluaycomp.hrms.business.abstracts.WayOfWorkingService;
import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.entities.concretes.WayOfWorking;

@CrossOrigin
@RestController
@RequestMapping("/api/wayofworkings")
public class WayOfWorkingsController {
	
	private WayOfWorkingService wayOfWorkingService;

	@Autowired
	public WayOfWorkingsController(WayOfWorkingService wayOfWorkingService) {
		super();
		this.wayOfWorkingService = wayOfWorkingService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<WayOfWorking>> getAll() {
		return this.wayOfWorkingService.getAll();
	}

}
