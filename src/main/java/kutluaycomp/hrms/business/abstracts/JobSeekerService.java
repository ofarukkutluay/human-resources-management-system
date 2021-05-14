package kutluaycomp.hrms.business.abstracts;

import java.util.List;

import kutluaycomp.hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	void add(JobSeeker jobSeeker);
	void update(JobSeeker jobSeeker);
	void delete(JobSeeker jobSeeker);
	JobSeeker getById(int id);
	List<JobSeeker> getAll();

}
