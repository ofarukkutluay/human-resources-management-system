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

import kutluaycomp.hrms.business.abstracts.JobAdvertisementService;
import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.Result;
import kutluaycomp.hrms.entities.concretes.JobAdvertisement;

@CrossOrigin
@RestController
@RequestMapping("/api/jobadvertisements")
public class JobAdvertisementsController {
	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll() {
		return this.jobAdvertisementService.getAll();
	}
	
	@GetMapping("/getbyid")
	public DataResult<JobAdvertisement> getById(@RequestParam int id) {
		return this.jobAdvertisementService.getById(id);
	}
	
	@GetMapping("/getbyemployerid")
	public DataResult<List<JobAdvertisement>> getByEmployerId(@RequestParam int id){
		return this.jobAdvertisementService.getByEmployerId(id);
	}
	
	@GetMapping("/getbyactivatedtrue")
	public DataResult<List<JobAdvertisement>> getByActivatedTrue() {
		return this.jobAdvertisementService.getByActivatedTrue();
	}
	
	@GetMapping("/getbyactivatedfalse")
	public DataResult<List<JobAdvertisement>> getByActivatedFalse() {
		return this.jobAdvertisementService.getByActivatedFalse();
	}
	
	@GetMapping("/getBayDateRange")
	public DataResult<List<JobAdvertisement>> getByDateRange(@RequestParam String startDate, @RequestParam String finalDate,
			@RequestParam boolean activated) {
		return this.jobAdvertisementService.getByDateRange(startDate, finalDate, activated);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@PostMapping("/activateJobAdvertisment")
	public Result activateJobAdvertisment(@RequestParam int systemPersonnelId,@RequestParam int jobAdvertisementId) {
		return this.jobAdvertisementService.activateJobAdvertisment(systemPersonnelId, jobAdvertisementId);
	}

}
