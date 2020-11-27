package pe.edu.unp.poc.microservices.seguridad.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.edu.unp.poc.microservices.seguridad.models.Password;
import pe.edu.unp.poc.microservices.seguridad.models.User;

@Service
public class UserService {

	User user1 = new User(
			"u1", 
			"Admin",			
			new Password("u1", "admin"),
			"admin@admin.com");
			
		User user2 = new User(
				"u2", 
				"beta",			
				new Password("u2", "beta"),
				"admin@admin.com");
			
		/*private List<User> users = Arrays.asList(user1, user2);	*/
		List<User> users = new ArrayList<>(Arrays.asList(user1, user2));
		
		   public List<User> getAllUsers() {
			return users;
		   }
		
	
		   public User getUser(String id) {
			    User user = users.stream()
					.filter(t -> id.equals(t.getId()))
					.findFirst()
					.orElse(null);
					
			    return user;
			}


		public void addUser(User user) {
			// TODO Auto-generated method stub
			users.add(user);
		}
		public void updateUser(String id, User user) {

		    for(int i = 0; i < users.size(); i++) {

			User u = users.get(i);

			if(u.getId().equals(id)) {

			     users.set(i, user);

			     return;
				}
		    }
		}
		public void deleteUser(String id) {
		     users.removeIf(u -> u.getId().equals(id));		
		}
}
