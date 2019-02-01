package springboot.services.rest.services;

import java.util.List;

import springboot.services.rest.model.ProductResource;

public interface ProductService {

	List<ProductResource> getAllProducts();

	ProductResource save(final ProductResource product);

	List<ProductResource> save(final List<ProductResource> products);
}
