/**
 * 
 */
package org.home.spring.dao;

import org.home.spring.model.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Category DAO extiende de Spring CrudRepository
 * 
 * @author pablo.quilca
 *
 */
public interface CategoryDao extends CrudRepository<Category, Long> {

}
