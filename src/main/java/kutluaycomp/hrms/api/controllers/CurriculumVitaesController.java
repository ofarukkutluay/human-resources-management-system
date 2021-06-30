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
import org.springframework.web.multipart.MultipartFile;

import kutluaycomp.hrms.business.abstracts.CurriculumVitaeService;
import kutluaycomp.hrms.core.adapters.imageManager.cloudinary.CloudinaryFileManager;
import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.Result;
import kutluaycomp.hrms.entities.concretes.CurriculumVitae;

@CrossOrigin
@RestController
@RequestMapping("/api/curriculumvitaes")
public class CurriculumVitaesController {
	
	private CurriculumVitaeService curriculumVitaeService;

	@Autowired
	public CurriculumVitaesController(CurriculumVitaeService curriculumVitaeService) {
		super();
		this.curriculumVitaeService = curriculumVitaeService;
	}
	
	@PostMapping("/uploadImage")
	public Result uploadImage(@RequestParam("image") MultipartFile multipartFile , @RequestParam("cv_id") int id) {
		CloudinaryFileManager cloudinaryFileManager = new CloudinaryFileManager();
		var result = cloudinaryFileManager.upload(multipartFile);
		CurriculumVitae cv =  this.curriculumVitaeService.getById(id).getData();
		cv.setImageUrl(result);
		return this.curriculumVitaeService.add(cv);
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CurriculumVitae curriculumVitae) {
		
		return this.curriculumVitaeService.add(curriculumVitae);
	}
	
	@GetMapping("/getall")
	public DataResult<List<CurriculumVitae>> getAll(){
		return this.curriculumVitaeService.getAll();
	}

}
