package com.folksdev.fdproduction.service.impl;

import com.folksdev.fdproduction.dto.BookResponse;
import com.folksdev.fdproduction.dto.BookSearchRequest;
import com.folksdev.fdproduction.repository.BookRepository;
import com.folksdev.fdproduction.repository.CategoryRepository;
import com.folksdev.fdproduction.service.BookListService;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.stream.Collectors;

public class BookListServiceImpl implements BookListService {
    private CategoryRepository categoryRepository;
    private BookRepository bookRepository;

    public List<BookResponse> bookList(BookSearchRequest bookSearchRequest) {
        return bookRepository.findAll(PageRequest.of(bookSearchRequest.getPage(), bookSearchRequest.getSize()))
                .getContent()
                .stream()
                .map(model -> BookResponse.builder()
                        .authorName(model.getAuthorName())
                        .title(model.getTitle())
                        .build())
                .collect(Collectors.toList());
    }
}
