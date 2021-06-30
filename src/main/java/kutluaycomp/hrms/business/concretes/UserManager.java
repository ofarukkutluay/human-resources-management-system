package kutluaycomp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kutluaycomp.hrms.business.abstracts.UserService;
import kutluaycomp.hrms.business.constants.Messages;
import kutluaycomp.hrms.core.utilities.results.DataResult;
import kutluaycomp.hrms.core.utilities.results.ErrorResult;
import kutluaycomp.hrms.core.utilities.results.Result;
import kutluaycomp.hrms.core.utilities.results.SuccessDataResult;
import kutluaycomp.hrms.core.utilities.results.SuccessResult;
import kutluaycomp.hrms.dataAccess.abstracts.UserDao;
import kutluaycomp.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService {
	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		if(this.userDao.findByEmail(user.getEmail()) != null) {
			return new ErrorResult(Messages.userExistsError);
		}
		this.userDao.save(user);
		return new SuccessResult(Messages.added("Kullanıcılar"));
	}

	@Override
	public DataResult<List<User>> getAll() {
		var result = this.userDao.findAll();
		return new SuccessDataResult<List<User>>(result,Messages.listed("Kullanıcılar"));
	}



}
