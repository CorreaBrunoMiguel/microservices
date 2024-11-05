package com.correa.microservices.product.controller;

import com.correa.microservices.product.dto.ProductRequest;
import com.correa.microservices.product.dto.ProductResponse;
import com.correa.microservices.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService service;

    @PostMapping
    @ResponseStatus(CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest request) {
        return service.create(request);
    }

    @GetMapping
    @ResponseStatus(OK)
    public List<ProductResponse> getProducts() {
        return service.getAll();
    }
}
