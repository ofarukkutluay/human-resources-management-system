package kutluaycomp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kutluaycomp.hrms.business.abstracts.UserService;
import kutluaycomp.hrms.core.utilities.Validators;
import kutluaycomp.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@PostMapping("/add")
	public void add(@RequestBody User user) {
		if (Validators.isItEqual(user.getPassword(), user.getPassword())&&
				Validators.isThisAnEmail(user.getEmail())) {
			userService.add(user);
		}
		
	}
	
	@GetMapping("/getall")
	public List<User> getAll(){
		return this.userService.getAll();
	}
	

}
