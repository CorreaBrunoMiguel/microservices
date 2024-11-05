package com.correa.microservices.product.dto;

public record ProductRequest(
        String name,
        String description,
        Double price
) {
}
