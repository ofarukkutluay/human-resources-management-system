package kutluaycomp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kutluaycomp.hrms.business.abstracts.JobSeekerService;
import kutluaycomp.hrms.dataAccess.abstracts.JobSeekerDao;
import kutluaycomp.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {
	
	private JobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public void add(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);

	}

	@Override
	public void update(JobSeeker jobSeeker) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(JobSeeker jobSeeker) {
		// TODO Auto-generated method stub

	}

	@Override
	public JobSeeker getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<JobSeeker> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}