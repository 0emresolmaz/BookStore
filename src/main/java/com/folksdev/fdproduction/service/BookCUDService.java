package com.folksdev.fdproduction.service;

import com.folksdev.fdproduction.dto.BookListItemResponse;
import com.folksdev.fdproduction.dto.SaveBookRequest;
import org.springframework.stereotype.Service;

@Service
public interface BookCUDService {
    BookListItemResponse save(SaveBookRequest saveBookRequest);
}
