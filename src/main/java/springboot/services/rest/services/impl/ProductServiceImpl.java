package springboot.services.rest.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springboot.services.rest.jpa.Product;
import springboot.services.rest.jpa.ProductRepository;
import springboot.services.rest.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;

	@Transactional(readOnly = true)
	@Override
	public List<Product> getAllProducts() {

		return this.repository.findAll();
	}

	@Transactional
	@Override
	public Product save(Product product) {

		return this.repository.save(product);
	}

	@Transactional
	@Override
	public List<Product> save(List<Product> products) {

		return products.stream().map(p -> this.save(p)).collect(Collectors.toList());
	}

}
