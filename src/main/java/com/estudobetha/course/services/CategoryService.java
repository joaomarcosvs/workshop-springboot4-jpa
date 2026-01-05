package com.estudobetha.course.services;

import com.estudobetha.course.entities.Category;
import com.estudobetha.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {

        return repository.findAll();
    }

    public Category findeById(Long id) {

        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
