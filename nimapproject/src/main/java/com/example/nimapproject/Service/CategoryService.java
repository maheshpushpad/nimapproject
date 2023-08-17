package com.example.nimapproject.Service;


import com.example.nimapproject.Dto.CategoryDTO;

public interface CategoryService {
    CategoryDTO getCategoryById(Long id);
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    CategoryDTO updateCategory(Long id, CategoryDTO categoryDTO);
    void deleteCategory(Long id);
}

