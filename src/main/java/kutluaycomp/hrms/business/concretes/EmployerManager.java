package kutluaycomp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kutluaycomp.hrms.business.abstracts.EmployerService;
import kutluaycomp.hrms.dataAccess.abstracts.EmployerDao;
import kutluaycomp.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}

	@Override
	public void add(Employer employer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Employer employer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Employer employer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employer getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employer> getAll() {
		// TODO Auto-generated method stub
		return this.employerDao.findAll();
	}

}
