package com.correa.microservices.product.service;

import com.correa.microservices.product.dto.ProductRequest;
import com.correa.microservices.product.dto.ProductResponse;
import com.correa.microservices.product.model.Product;
import com.correa.microservices.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public ProductResponse create(ProductRequest request) {
        log.info("Creating product {}", request);
        Product newProduct = Product
                .builder()
                .name(request.name())
                .description(request.description())
                .price(request.price())
                .build();
        productRepository.save(newProduct);
        log.info("Product created: {}", newProduct);
        return new ProductResponse(
                newProduct.getId(),
                newProduct.getName(),
                newProduct.getDescription(),
                newProduct.getPrice()
        );
    }

    @Override
    public List<ProductResponse> getAll() {
        return productRepository
                .findAll()
                .stream()
                .map(product -> new ProductResponse(
                        product.getId(),
                        product.getName(),
                        product.getDescription(),
                        product.getPrice()
                ))
                .toList();
    }
}
