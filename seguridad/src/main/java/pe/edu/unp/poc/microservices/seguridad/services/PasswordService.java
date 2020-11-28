package pe.edu.unp.poc.microservices.seguridad.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import pe.edu.unp.poc.microservices.seguridad.bean.LogInRequest;
import pe.edu.unp.poc.microservices.seguridad.config.Properties;
import pe.edu.unp.poc.microservices.seguridad.models.Password;
import pe.edu.unp.poc.microservices.seguridad.models.User;

@Service
public class PasswordService {

	private Password pass1 = new Password("123456", new User("u1", "Admin", "admin@admin.com"));
	private Password pass2 = new Password("abcdef", new User("u2", "beta", "admin@admin.com"));

	private List<Password> passwords = new ArrayList<>(Arrays.asList(pass1, pass2));

	@Autowired
	private RestTemplate usuarioRest;

	@Autowired
	private Properties props;

	public User logIn(LogInRequest request) {
		User user = usuarioRest.getForObject(this.props.getWsUsuarioConsulta(request.getUsername()), User.class);
		Password pass = passwords.stream().filter(p -> user.equals(user)).findFirst().orElse(null);
		return pass != null ? user : null;
	}

}
