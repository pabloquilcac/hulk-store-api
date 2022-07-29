/**
 * 
 */
package org.home.spring.servicio;

import java.util.ArrayList;
import java.util.List;

import org.home.spring.dao.CategoryDao;
import org.home.spring.model.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author casa
 *
 */
@SpringBootTest
public class CategoryServiceTest {

	@Autowired
	private CategoryService categoryService;
	@Mock
	private CategoryDao categoryDao;

	@Test
	public void should_list_all_categories() {
		List<Category> categories = new ArrayList<>();
		categories.add(new Category());
		Iterable<Category> categories_I = categories;
		categoryDao = Mockito.mock(CategoryDao.class);
		Mockito.when(categoryDao.findAll()).thenReturn(categories_I);
		Assertions.assertNotNull(categoryService.getAll());
	}

	@Test
	public void should_get_category() {
		Assertions.assertNotNull(categoryService.getById(1l));
	}
}
