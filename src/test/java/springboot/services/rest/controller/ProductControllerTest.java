package springboot.services.rest.controller;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.only;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import springboot.services.rest.model.ProductResource;
import springboot.services.rest.services.ProductService;

@RunWith(MockitoJUnitRunner.class)
public class ProductControllerTest {

	@InjectMocks
	private ProductController controller;

	@Mock
	private ProductService service;

	@Test
	public void testRetrieveAllProducts() throws Exception {

		// Arrange
		when(this.service.getAllProducts()).thenReturn(Lists.newArrayList());
		// Act
		final List<ProductResource> retour = this.controller.retrieveAllProducts();
		// Assert
		assertNotNull(retour);
		verify(this.service, only()).getAllProducts();
	}

	@Test
	public void testAddProducts() throws Exception {

		// Arrange
		when(this.service.save(anyList())).thenReturn(Lists.newArrayList());
		// Act
		final List<ProductResource> retour = this.controller.addProducts(Lists.newArrayList(new ProductResource()));
		// Assert
		assertNotNull(retour);
		verify(this.service, only()).save(anyList());

	}
}
