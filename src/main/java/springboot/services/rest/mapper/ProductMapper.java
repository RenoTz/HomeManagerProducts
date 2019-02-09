package springboot.services.rest.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import springboot.services.rest.jpa.entitiy.Product;
import springboot.services.rest.model.ProductResource;

@Mapper(componentModel = "spring")
public interface ProductMapper {

	Product resourceToEntity(ProductResource resource);

	ProductResource entityToResource(Product entity);

	List<ProductResource> entitiesToListResources(List<Product> entities);

	List<Product> resourcesToListEntities(List<ProductResource> resources);
}
