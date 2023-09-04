package com.folksdev.fdproduction.service.impl;

import com.folksdev.fdproduction.dto.BookListItemResponse;
import com.folksdev.fdproduction.dto.SaveBookRequest;
import com.folksdev.fdproduction.model.Book;
import com.folksdev.fdproduction.repository.BookRepository;
import com.folksdev.fdproduction.service.BookCUDService;
import com.folksdev.fdproduction.service.CategoryService;
import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;

@RequiredArgsConstructor  //bu lombok annotationu kullanırsak contructor injection yazmayız.
public class BookCUDServiceImpl implements BookCUDService {

    private final BookRepository bookRepository;
    private final CategoryService categoryService;


    @Override
    @Transactional
    public BookListItemResponse save(SaveBookRequest saveBookRequest) {
        final Book book = Book.builder()
                .authorName(saveBookRequest.getAuthorName())
                .bookStatus(saveBookRequest.getBookStatus())
                .title(saveBookRequest.getTitle())
                .publisher(saveBookRequest.getPublisher())
                .category(categoryService.loadCategory(saveBookRequest.getCategoryId()))
                .totalPage(saveBookRequest.getLastPageNumber())
                .build();
        final Book fromDb = bookRepository.save(book);

        return BookListItemResponse.builder()
                .id(fromDb.getId())
                .lastPageNumber(fromDb.getLastPageNumber())
                .categoryName(fromDb.getCategory().getName())
                .authorName(fromDb.getAuthorName())
                .bookStatus(fromDb.getBookStatus())
                .title(fromDb.getTitle())
                .totalPage(fromDb.getTotalPage())
                .build();
    }
}
