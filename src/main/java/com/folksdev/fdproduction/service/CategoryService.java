package com.folksdev.fdproduction.service;

import com.folksdev.fdproduction.dto.CategoryDto;
import com.folksdev.fdproduction.model.Category;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {

    Category loadCategory(Long id);
    //CategoryDto save(Category category);
}
