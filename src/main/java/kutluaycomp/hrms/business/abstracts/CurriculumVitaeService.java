package kutluaycomp.hrms.business.abstracts;

import java.util.List;

import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.Result;
import kutluaycomp.hrms.entities.concretes.CurriculumVitae;

public interface CurriculumVitaeService {
	Result add(CurriculumVitae curriculumVitae);
	Result update(CurriculumVitae curriculumVitae);
	DataResult<List<CurriculumVitae>> getAll();
	DataResult<CurriculumVitae> getById(int id);
	DataResult<List<CurriculumVitae>> getByJobSeekerId(int jobSeekerId);
}
