package org.home.spring.controlador;

import java.util.HashMap;
import java.util.Map;

import org.home.spring.model.User;
import org.home.spring.servicio.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practica.hulkstore.dto.LoginDTO;

/**
 * 
 * Controlador rest para usuarios
 * 
 * @author Pablo.Quilca
 *
 */
@RestController
@RequestMapping(value = "api/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserRestController {

	@Autowired
	private UserService userService;

	@PostMapping(value = "login")
	public ResponseEntity<?> obtenerPorLogin(@RequestParam("email") String email,
			@RequestParam("password") String password) {
		try {
			LoginDTO login = new LoginDTO();
			login.setEmail(email);
			login.setPassword(password);
			User user = userService.login(login);
			if (user == null) {
				Map<String, String> respuesta = new HashMap<>();
				respuesta.put("error", "Email o password no validos");
				return new ResponseEntity<Map<String, String>>(respuesta, HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<User>(user, HttpStatus.OK);

		} catch (Exception e) {
			Map<String, String> respuesta = new HashMap<>();
			respuesta.put("error", "Error en login");
			return new ResponseEntity<Map<String, String>>(respuesta, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping(value = "/save")
	public ResponseEntity<?> saveUser(@RequestBody User user) {
		try {
			System.out.println("Ingresa a saveUser");
			System.out.println(user.getEmail());
			System.out.println(user.getName());
			user = userService.save(user);
			System.out.println("Grabo");
			return new ResponseEntity<User>(user, HttpStatus.OK);
		} catch (DataAccessException e) {
			e.printStackTrace();
			Map<String, String> respuesta = new HashMap<>();
			respuesta.put("error", "Error al grabar user");
			return new ResponseEntity<Map<String, String>>(respuesta, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
