package kutluaycomp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kutluaycomp.hrms.business.abstracts.ForeignLanguageService;
import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.SuccessDataResult;
import kutluaycomp.hrms.dataAccess.abstracts.ForeignLanguageDao;
import kutluaycomp.hrms.entities.concretes.ForeignLanguage;

@Service
public class ForeignLanguageManager implements ForeignLanguageService {
	private ForeignLanguageDao foreignLanguageDao;
	
	@Autowired
	public ForeignLanguageManager(ForeignLanguageDao foreignLanguageDao) {
		super();
		this.foreignLanguageDao = foreignLanguageDao;
	}

	@Override
	public DataResult<List<ForeignLanguage>> getAll() {
		var result = this.foreignLanguageDao.findAll();
		return new SuccessDataResult<List<ForeignLanguage>>(result);
	}

}
