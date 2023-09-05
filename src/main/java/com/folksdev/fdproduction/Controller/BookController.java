package com.folksdev.fdproduction.Controller;

import com.folksdev.fdproduction.dto.BookListItemResponse;
import com.folksdev.fdproduction.dto.SaveBookRequest;
import com.folksdev.fdproduction.service.BookCUDService;
import com.folksdev.fdproduction.service.BookListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/book")
@RequiredArgsConstructor

public class BookController {
    private final BookCUDService bookCUDService;
    private final BookListService bookListService;


    @PostMapping
    public ResponseEntity<BookListItemResponse> saveBook(@RequestBody SaveBookRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bookCUDService.save(request));
    }
}
