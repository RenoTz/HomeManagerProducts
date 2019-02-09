package springboot.services.rest.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springboot.services.rest.jpa.dao.ProductRepository;
import springboot.services.rest.jpa.entitiy.Product;
import springboot.services.rest.mapper.ProductMapper;
import springboot.services.rest.model.ProductResource;
import springboot.services.rest.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper mapper;

	@Autowired
	private ProductRepository repository;

	@Transactional(readOnly = true)
	@Override
	public List<ProductResource> getAllProducts() {

		final List<Product> products = this.repository.findAll();

		return this.mapper.entitiesToListResources(products);
	}

	@Transactional
	@Override
	public ProductResource save(Product product) {

		final Product saveProduct = this.repository.save(product);

		return this.mapper.entityToResource(saveProduct);
	}

	@Transactional
	@Override
	public List<ProductResource> save(List<Product> products) {

		final List<Product> saveProducts = this.repository.saveAll(products);

		return this.mapper.entitiesToListResources(saveProducts);
	}

}
