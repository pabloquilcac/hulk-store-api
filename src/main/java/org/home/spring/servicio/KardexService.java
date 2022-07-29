/**
 * 
 */
package org.home.spring.servicio;

import org.home.spring.dao.KardexDAO;
import org.home.spring.model.Kardex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Servicio para operaciones con kardex
 * 
 * 
 * @author pablo.quilca
 *
 */

@Service
public class KardexService {

	@Autowired
	private KardexDAO kardexDao;

	/**
	 * Grabar kardex de ingreso de de egreso
	 * @param kardex
	 * @return
	 */
	@Transactional
	public Kardex save(Kardex kardex) {
		return kardexDao.save(kardex);
	}

}
