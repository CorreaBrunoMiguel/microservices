package com.correa.microservices.product.dto;

public record ProductResponse(
        String message,
        Object data
) {
}
