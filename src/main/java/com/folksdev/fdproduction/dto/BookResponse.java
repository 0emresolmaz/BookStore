package com.folksdev.fdproduction.dto;

import com.folksdev.fdproduction.model.BookStatus;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class BookResponse {
    private String title;
    private String authorName;
    private BookStatus bookStatus;
    private String publisher;
    private Integer lastPageNumber;
    private Integer totalPage;
    private String categoryName;
}
