package org.home.spring.controlador;

import java.util.HashMap;
import java.util.Map;

import org.home.spring.model.Kardex;
import org.home.spring.model.User;
import org.home.spring.servicio.KardexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * Controlador rest para operaciones de kardex
 * 
 * @author Pablo.Quilca
 *
 */
@RestController
@RequestMapping(value = "api/kardex")
@CrossOrigin(origins = "http://localhost:4200")
public class KardexRestController {

	@Autowired
	private KardexService kardexService;

	@PostMapping(value = "/save")
	public ResponseEntity<?> saveUser(@RequestBody Kardex kardex) {
		try {
			System.out.println("Ingresa a saveKardex");
			kardex = kardexService.save(kardex);
			System.out.println("Grabo");
			return new ResponseEntity<Kardex>(kardex, HttpStatus.OK);
		} catch (DataAccessException e) {
			e.printStackTrace();
			Map<String, String> respuesta = new HashMap<>();
			respuesta.put("error", "Error al grabar kardex");
			return new ResponseEntity<Map<String, String>>(respuesta, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
