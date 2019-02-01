package springboot.services.rest.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springboot.services.rest.jpa.ProductRepository;
import springboot.services.rest.mapper.ProductMapper;
import springboot.services.rest.model.ProductResource;
import springboot.services.rest.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private final ProductMapper mapper = Mappers.getMapper(ProductMapper.class);

	@Autowired
	private ProductRepository repository;

	@Transactional(readOnly = true)
	@Override
	public List<ProductResource> getAllProducts() {

		return this.mapper.entitiesToListResources(this.repository.findAll());
	}

	@Transactional
	@Override
	public ProductResource save(ProductResource product) {

		return this.mapper
				.entityToResource(this.repository.save(this.mapper.resourceToEntity(product)));
	}

	@Transactional
	@Override
	public List<ProductResource> save(List<ProductResource> products) {

		return products.stream().map(p -> this.save(p)).collect(Collectors.toList());
	}

}
