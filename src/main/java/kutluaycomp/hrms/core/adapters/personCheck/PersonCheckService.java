package kutluaycomp.hrms.core.adapters.personCheck;

import kutluaycomp.hrms.entities.concretes.JobSeeker;

public interface PersonCheckService {
	boolean checkIfRealPerson(JobSeeker jobSeeker);
}
