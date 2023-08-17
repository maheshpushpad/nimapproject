package com.example.nimapproject.Repository;


import com.example.nimapproject.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}