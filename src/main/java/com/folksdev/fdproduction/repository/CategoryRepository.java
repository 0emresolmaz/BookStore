package com.folksdev.fdproduction.repository;

import com.folksdev.fdproduction.model.Book;
import com.folksdev.fdproduction.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CategoryRepository extends JpaRepository<Category, Long>, JpaSpecificationExecutor<Category> {
}
