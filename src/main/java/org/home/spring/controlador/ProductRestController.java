/**
 * 
 */
package org.home.spring.controlador;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.home.spring.model.Product;
import org.home.spring.servicio.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Publica los servicios rest de productos
 * 
 * 
 * @author pablo.quilca
 *
 */
@RestController
@RequestMapping(value = "/api/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductRestController {

	@Autowired
	private ProductService productService;

	/**
	 * Lista productos para la tienda
	 * 
	 * 
	 * @return Lista productos
	 * 
	 */
	@GetMapping(value = "/actives", produces = "application/json;charset=utf-8")
	public ResponseEntity<?> getActives() {
		try {
			List<Product> products = productService.getActives();
			return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
		} catch (DataAccessException e) {
			Map<String, String> respuesta = new HashMap<>();
			respuesta.put("error", "get Actives Error");
			return new ResponseEntity<Map<String, String>>(respuesta, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * Obtener producto por id
	 * 
	 * @param id
	 * @return producto
	 * 
	 */
	@GetMapping(value = "/product/{id}", produces = "application/json;charset=utf-8")
	public ResponseEntity<?> getById(@PathVariable Long id) {
		try {
			Product product = productService.getById(id);
			if (product == null) {
				Map<String, String> respuesta = new HashMap<>();
				respuesta.put("error", "Producto no existe");
				return new ResponseEntity<Map<String, String>>(respuesta, HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<Product>(product, HttpStatus.OK);
		} catch (DataAccessException e) {
			Map<String, String> respuesta = new HashMap<>();
			respuesta.put("error", "Error al obtener producto");
			return new ResponseEntity<Map<String, String>>(respuesta, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * Permite grabar producto
	 * 
	 * @param product
	 * @return producto grabado
	 * 
	 */
	@PostMapping(value = "/save")
	public ResponseEntity<?> save(@RequestBody Product product) {
		try {
			product = productService.save(product);
			return new ResponseEntity<Product>(product, HttpStatus.OK);
		} catch (DataAccessException e) {
			Map<String, String> respuesta = new HashMap<>();
			respuesta.put("error", "Error al grabar producto");
			return new ResponseEntity<Map<String, String>>(respuesta, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * Pemrmite consultar existencias
	 * 
	 * @param id
	 * @return valor de existencias o mapa con error
	 * 
	 */
	@GetMapping(value = "/stock/{id}")
	public ResponseEntity<?> getStock(@PathVariable Long id) {
		try {
			Integer stock = productService.getStock(id);
			return new ResponseEntity<Integer>(stock, HttpStatus.OK);
		} catch (DataAccessException e) {
			Map<String, String> respuesta = new HashMap<>();
			respuesta.put("error", "Error al obtener existencias del producto");
			return new ResponseEntity<Map<String, String>>(respuesta, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
