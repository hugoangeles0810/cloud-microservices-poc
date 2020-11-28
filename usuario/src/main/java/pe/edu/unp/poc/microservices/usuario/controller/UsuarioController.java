package pe.edu.unp.poc.microservices.usuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.unp.poc.microservices.usuario.bean.User;
import pe.edu.unp.poc.microservices.usuario.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping("/username/${name}")
	public User getUserByUsername(@RequestParam("name") String username) {
		return this.service.getUser(username);
	}

}
