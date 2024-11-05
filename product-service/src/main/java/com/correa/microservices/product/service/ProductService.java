package com.correa.microservices.product.service;

import com.correa.microservices.product.dto.ProductRequest;
import com.correa.microservices.product.dto.ProductResponse;
import com.correa.microservices.product.model.Product;

public interface ProductService {

    ProductResponse create(ProductRequest request);


}
