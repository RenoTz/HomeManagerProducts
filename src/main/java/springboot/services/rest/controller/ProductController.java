package springboot.services.rest.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springboot.services.rest.jpa.Product;
import springboot.services.rest.services.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/products")
	public List<Product> retrieveAllProducts() {

		return this.productService.getAllProducts();
	}

	@PostMapping("/products")
	@Transactional
	public List<Product> addProducts(@RequestBody final List<Product> products) {

		return this.productService.save(products);
	}

}
