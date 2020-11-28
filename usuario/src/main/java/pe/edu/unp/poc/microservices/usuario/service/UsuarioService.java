package pe.edu.unp.poc.microservices.usuario.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pe.edu.unp.poc.microservices.usuario.bean.User;

public class UsuarioService {

	private User user1 = new User("u1", "Admin", "admin@admin.com");

	private User user2 = new User("u2", "beta", "admin@admin.com");

	private List<User> users = new ArrayList<>(Arrays.asList(user1, user2));

	public List<User> getAllUsers() {
		return this.users;
	}

	public User getUser(String id) {
		User user = this.users.stream().filter(t -> id.equals(t.getId())).findFirst().orElse(null);
		return user;
	}

	public void addUser(User user) {
		this.users.add(user);
	}

	public void updateUser(String id, User user) {
		for (int i = 0; i < this.users.size(); i++) {
			User u = this.users.get(i);
			if (u.getId().equals(id)) {
				this.users.set(i, user);
				return;
			}
		}
	}

	public void deleteUser(String id) {
		this.users.removeIf(u -> u.getId().equals(id));
	}

}
