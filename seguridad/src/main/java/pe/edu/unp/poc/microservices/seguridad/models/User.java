package pe.edu.unp.poc.microservices.seguridad.models;

public class User {
	  	private String id;
	    private String username;
	    private Password password;
	    private String email;
	    
		public User(String id, String username, Password password, String email) {
			// TODO Auto-generated constructor stub
			this.id=id;
			this.username=username;
			this.password=password;
			this.email=email;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public Password getPassword() {
			return password;
		}
		public void setPassword(Password password) {
			this.password = password;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	    
	    
	    
}
