package pe.edu.unp.poc.microservices.seguridad.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.unp.poc.microservices.seguridad.bean.LogInRequest;
import pe.edu.unp.poc.microservices.seguridad.models.User;
import pe.edu.unp.poc.microservices.seguridad.services.PasswordService;

@RestController
@RequestMapping("/seguridad")
public class PasswordController {

	@Autowired
	private PasswordService service;

	@PostMapping(value = "/logIn", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public User logIn(@RequestBody LogInRequest request) {
		return this.service.logIn(request);
	}

}
