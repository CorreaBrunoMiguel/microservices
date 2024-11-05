package com.correa.microservices.product.controller;

import com.correa.microservices.product.dto.ProductRequest;
import com.correa.microservices.product.dto.ProductResponse;
import com.correa.microservices.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

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
}
