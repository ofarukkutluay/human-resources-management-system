package kutluaycomp.hrms.business.abstracts;

import java.util.List;

import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.Result;
import kutluaycomp.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	Result add(JobSeeker jobSeeker);
	DataResult<List<JobSeeker>> getAll();

}
