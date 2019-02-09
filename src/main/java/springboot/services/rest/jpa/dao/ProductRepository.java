package springboot.services.rest.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.services.rest.jpa.entitiy.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
