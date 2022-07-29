/**
 * 
 */
package org.home.spring.controlador;

import java.util.List;

import org.home.spring.model.Category;
import org.home.spring.servicio.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador rest para categorias
 * 
 * 
 * @author pablo.quilca
 *
 */
@RestController
@RequestMapping(value = "api/category")
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryRestController {

	@Autowired
	private CategoryService categoryService;

	/**
	 * Servicio que permite listar las categorias
	 * 
	 * @return
	 */
	@GetMapping(value = "/actives")
	public List<Category> listarCategorias() {
		return categoryService.getAll();
	}
}
