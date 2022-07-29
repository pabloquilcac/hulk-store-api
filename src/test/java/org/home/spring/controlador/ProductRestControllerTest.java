/**
 * 
 */
package org.home.spring.controlador;

import org.home.spring.model.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

/**
 * @author casa
 *
 */
@SpringBootTest
public class ProductRestControllerTest {

	@Autowired
	private ProductRestController productRestController;

//	@Test
//	public void should_list_products() {
//		Assertions.assertNotNull(productRestController.getActives());
//	}
//
//	@Test
//	public void should_Get_By_Id() {
//		Assertions.assertNotNull(productRestController.getById(1l));
//	}
//
//	@Test
//	public void should_Get_Stock() {
//		ResponseEntity<?> respuesta = productRestController.getStock(1l);
//		Long stock = (Long) respuesta.getBody();
//		Assertions.assertTrue(stock > 0l);
//	}
//
//	@Test
//	public void should_save_product() {
//		ResponseEntity<?> respuesta = productRestController.getById(1l);
//		Product product = (Product) respuesta.getBody();
//		product.setStock(10);
//		Assertions.assertNotNull(productRestController.save(product));
//	}
}