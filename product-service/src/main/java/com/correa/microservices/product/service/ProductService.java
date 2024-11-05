package com.correa.microservices.product.service;

import com.correa.microservices.product.dto.ProductRequest;
import com.correa.microservices.product.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    ProductResponse create(ProductRequest request);

    List<ProductResponse> getAll();


}
