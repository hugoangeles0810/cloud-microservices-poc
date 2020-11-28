package pe.edu.unp.poc.microservices.seguridad.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.unp.poc.microservices.seguridad.models.User;
import pe.edu.unp.poc.microservices.seguridad.services.UserService;

import java.util.List;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("users")
	@ResponseBody
	   public List<User> getAllUsers() {
		
		return userService.getAllUsers();
		
	   }
	@RequestMapping(value = "/users/{id}")
	public User getUser(@PathVariable String id) {
	    return userService.getUser(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/users")
    public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	@RequestMapping(value="/users/{id}", method = RequestMethod.PUT)
	public void getUser(@PathVariable String id, @RequestBody User user) {
	    userService.updateUser(id, user);

	}
	 @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	 public void deleteUser(@PathVariable String id) {
	      userService.deleteUser(id);
	 }
	
	

}
