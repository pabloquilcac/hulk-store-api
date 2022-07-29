/**
 * 
 */
package org.home.spring.dao;

import java.util.List;

import org.home.spring.model.Kardex;
import org.home.spring.model.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Dao para registrar las operaciones de kardex CrudRepository
 * 
 * @author pablo.quilca
 *
 */
public interface KardexDAO extends CrudRepository<Kardex, Long> {

	public List<Kardex> getByProduct(Product product);
	

}
