package kutluaycomp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kutluaycomp.hrms.business.abstracts.SchoolService;
import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.SuccessDataResult;
import kutluaycomp.hrms.dataAccess.abstracts.SchoolDao;
import kutluaycomp.hrms.entities.concretes.School;

@Service
public class SchoolManager implements SchoolService {
	private SchoolDao schoolDao;
	
	@Autowired
	public SchoolManager(SchoolDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}


	@Override
	public DataResult<List<School>> getAll() {
		var result = this.schoolDao.findAll();
		return new SuccessDataResult<List<School>>(result);
	}

}
