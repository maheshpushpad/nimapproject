package com.example.nimapproject.Service;

import com.example.nimapproject.Dto.ProductDTO;

public interface ProductService {

    ProductDTO getProductById(Long id);

    ProductDTO createProduct(ProductDTO productDTO);

    ProductDTO updateProduct(Long id, ProductDTO productDTO);

    void deleteProduct(Long id);

}
