package kutluaycomp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kutluaycomp.hrms.business.abstracts.CurriculumVitaeService;
import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.Result;
import kutluaycomp.hrms.core.utilities.results.SuccessDataResult;
import kutluaycomp.hrms.core.utilities.results.SuccessResult;
import kutluaycomp.hrms.dataAccess.abstracts.CurriculumVitaeDao;
import kutluaycomp.hrms.entities.concretes.CurriculumVitae;

@Service
public class CurriculumVitaeManager implements CurriculumVitaeService {
	
	private CurriculumVitaeDao curriculumVitaeDao;

	@Autowired
	public CurriculumVitaeManager(CurriculumVitaeDao curriculumVitaeDao) {
		super();
		this.curriculumVitaeDao = curriculumVitaeDao;
	}

	@Override
	public Result add(CurriculumVitae curriculumVitae) {
		this.curriculumVitaeDao.save(curriculumVitae);
		return new SuccessResult();
	}

	@Override
	public Result update(CurriculumVitae curriculumVitae) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<CurriculumVitae>> getAll() {
		var result = this.curriculumVitaeDao.findAll();
		return new SuccessDataResult<List<CurriculumVitae>>(result);
	}

	@Override
	public DataResult<List<CurriculumVitae>> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<CurriculumVitae>> getByJobSeekerId(int jobSeekerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
