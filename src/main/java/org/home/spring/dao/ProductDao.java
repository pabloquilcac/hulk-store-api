/**
 * 
 */
package org.home.spring.dao;

import java.util.List;

import org.home.spring.model.Product;
import org.home.spring.model.enumeration.ActiveEnum;
import org.springframework.data.repository.CrudRepository;

/**
 * Da para productos
 * extiende de springboot  CrudRepository
 * 
 * @author pablo.quilca
 *
 */
public interface ProductDao extends CrudRepository<Product, Long> {

	public List<Product> getByActive(ActiveEnum active);

}
