package springboot.services.rest.services;

import java.util.List;

import springboot.services.rest.jpa.Product;

public interface ProductService {

	List<Product> getAllProducts();

	Product save(final Product product);

	List<Product> save(final List<Product> products);
}
