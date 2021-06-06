package kutluaycomp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kutluaycomp.hrms.business.abstracts.CityService;
import kutluaycomp.hrms.business.constants.Messages;
import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.SuccessDataResult;
import kutluaycomp.hrms.dataAccess.abstracts.CityDao;
import kutluaycomp.hrms.entities.concretes.City;

@Service
public class CityManager implements CityService {
	
	private CityDao cityDao;
	
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getAll() {
		var result = this.cityDao.findAll();
		return new SuccessDataResult<List<City>>(result, Messages.listed("Şehirler"));
	}

	@Override
	public DataResult<City> getById(int id) {
		var result = this.cityDao.findById(id).get();
		return new SuccessDataResult<City>(result,Messages.listed);
	}

}
