package springboot.services.rest.services;

import java.util.List;

import springboot.services.rest.jpa.entitiy.Product;
import springboot.services.rest.model.ProductResource;

public interface ProductService {

	List<ProductResource> getAllProducts();

	ProductResource save(final Product product);

	List<ProductResource> save(final List<Product> products);
}
