/**
 * 
 */
package org.home.spring.dao;

import org.home.spring.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Dao para usuarios extiende de springboot CrudRepository
 * 
 * @author pablo.quilca
 *
 */
public interface UserDao extends CrudRepository<User, Long> {

	/**
	 * login de usuario
	 * 
	 * @param email
	 * @param password
	 * @return
	 */
	public User getByEmailAndPassword(String email, String password);

}
