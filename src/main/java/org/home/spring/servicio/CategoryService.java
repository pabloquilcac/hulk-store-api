/**
 * 
 */
package org.home.spring.servicio;

import java.util.List;

import org.home.spring.dao.CategoryDao;
import org.home.spring.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Servicio para la tabla de categoria
 * 
 * 
 * @author pablo.quilca
 *
 */

@Service
public class CategoryService {

	@Autowired
	private CategoryDao categoryDao;

	/**
	 * Metodo que lista todas las categorias
	 * 
	 * @return lista de categorias
	 */
	@Transactional(readOnly = true)
	public List<Category> getAll() {
		return (List<Category>) categoryDao.findAll();
	}

	/**
	 * Metodo que categoria por id
	 * 
	 * @param id
	 * @return Category
	 */
	@Transactional(readOnly = true)
	public Category getById(Long id) {
		return categoryDao.findById(id).orElse(null);
	}
}
