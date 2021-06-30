package kutluaycomp.hrms.business.abstracts;

import java.util.List;

import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.entities.concretes.ForeignLanguage;

public interface ForeignLanguageService {
	public DataResult<List<ForeignLanguage>> getAll();

}
