package com.nisum.productcatalog.controller;

import com.nisum.productcatalog.data.Product;
import com.nisum.productcatalog.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class ProductController {

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() throws CustomException {
        Product product1 = new Product(UUID.randomUUID(), "Shirt");
        Product product2 = new Product(UUID.randomUUID(), "Pants");
        Product product3 = new Product(UUID.randomUUID(), "Socks");
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

}
