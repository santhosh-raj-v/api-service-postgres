package com.srv.controller;

import com.srv.model.Product;
import com.srv.service.ProductService;
import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping
  ResponseEntity<List<Product>> getAllProducts() {
    List<Product> list = productService.getAllProducts();
    return ResponseEntity.of(Optional.ofNullable(list));
  }
}
