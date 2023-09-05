package com.folksdev.fdproduction.service.impl;

import com.folksdev.fdproduction.model.Category;
import com.folksdev.fdproduction.repository.CategoryRepository;
import com.folksdev.fdproduction.service.CategoryService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public Category loadCategory(Long id) {
        return categoryRepository.findById(id).orElseThrow();
    }
}
