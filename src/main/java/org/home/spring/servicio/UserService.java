/**
 * 
 */
package org.home.spring.servicio;

import org.home.spring.dao.UserDao;
import org.home.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practica.hulkstore.dto.LoginDTO;

/**
 * Servicio para usuarios login y registro
 * 
 * 
 * @author pablo.quilca
 *
 */

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	/**
	 * Metodo login
	 * 
	 * @return token o null
	 */
	@Transactional(readOnly = true)
	public User login(LoginDTO login) {
		return (User) userDao.getByEmailAndPassword(login.getEmail(), login.getPassword());
	}

	/**
	 * Metodo para grabar user
	 * 
	 * @param user
	 * @return
	 */
	@Transactional
	public User save(User user) {
		return userDao.save(user);
	}

}
