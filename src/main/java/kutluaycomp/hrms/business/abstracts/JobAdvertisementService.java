package kutluaycomp.hrms.business.abstracts;

import java.time.LocalDate;
import java.util.List;

import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.Result;
import kutluaycomp.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	Result add(JobAdvertisement jobAdvertisement);
	DataResult<List<JobAdvertisement>> getAll();
	DataResult<JobAdvertisement> getById(int id);
	DataResult<List<JobAdvertisement>> getByEmployerId(int id);
	DataResult<List<JobAdvertisement>> getActivated();
	DataResult<List<JobAdvertisement>> getByDateRange(LocalDate startDate,LocalDate finalDate,boolean activated);
}
