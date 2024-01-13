package com.example.Productservice.Service;

import com.example.Productservice.Service.impl.ProductServiceImpl;
import com.example.Productservice.dto.ProductRequestDto;

public interface ProductService {
    String addProduct(ProductRequestDto productRequestDto);
}
