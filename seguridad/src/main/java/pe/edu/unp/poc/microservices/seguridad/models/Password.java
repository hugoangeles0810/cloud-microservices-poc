package pe.edu.unp.poc.microservices.seguridad.models;

public class Password {
		private String userid;
	    private String password;
	    
	    public Password(String userid, String password) {
			// TODO Auto-generated constructor stub
	    	this.userid=userid;
	    	this.password=password;
		}
	    
		public String getUserid() {
			return userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
}
