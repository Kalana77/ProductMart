package com.example.Productservice.Service.impl;

import com.example.Productservice.Service.ProductService;
import com.example.Productservice.dto.ProductRequestDto;
import com.example.Productservice.model.Product;
import com.example.Productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public String addProduct(ProductRequestDto productRequestDto) {
        Product product = Product.builder()
                .name(productRequestDto.getName())
                .description(productRequestDto.getDescription())
                .price(productRequestDto.getPrice())
                .build();

        productRepository.save(product);
        return null;
    }
}
