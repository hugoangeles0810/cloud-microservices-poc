package pe.edu.unp.poc.microservices.seguridad.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Properties {
	
	@Value("${web.usuario.consulta}")
	private String wsUsuarioConsulta;

	public String getWsUsuarioConsulta() {
		return wsUsuarioConsulta;
	}

}
