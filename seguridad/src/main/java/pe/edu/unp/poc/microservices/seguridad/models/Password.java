package pe.edu.unp.poc.microservices.seguridad.models;

public class Password {

	private User user;
	private String password;

	public Password(String password, User user) {
		// TODO Auto-generated constructor stub
		this.user = user;
		this.password = password;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
