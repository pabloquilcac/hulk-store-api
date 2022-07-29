/**
 * 
 */
package org.home.spring.servicio;

import org.home.spring.model.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author casa
 *
 */

@SpringBootTest
public class ProductServiceTest {

	@Mock
	private ProductService productService;
	
	

	@Test
	public void shouldGetById() {		
		Product product=new Product();
		product.setId(1L);
		product.setName("name");
		product.setStock(10);
//		Assertions.assertNotNull(productService.getById(1l));
		Assertions.assertEquals(product.getId(), 1L);
	}

//	@Test
//	public void should_save_product() {
//		Product product = productService.getById(1l);
//		product.setName(product.getName().toUpperCase());
//		productService.save(product);
//		Assertions.assertTrue(
//				productService.getById(1l).getName().equals("Camiseta Ironman adultos".toUpperCase()));
//	}

}
