package kutluaycomp.hrms.business.abstracts;

import java.util.List;

import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.entities.concretes.City;

public interface CityService {
	DataResult<List<City>> getAll();
	DataResult<City> getById(int id);

}
