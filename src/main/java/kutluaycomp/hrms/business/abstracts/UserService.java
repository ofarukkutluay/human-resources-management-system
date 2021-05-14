package kutluaycomp.hrms.business.abstracts;

import java.util.List;

import kutluaycomp.hrms.entities.concretes.User;

public interface UserService {
	void add(User user);
	void update(User user);
	void delete(User user);
	User getById(int id);
	List<User> getAll();
	User getByEmail(String email);

}
