package com.folksdev.fdproduction.dto;

import com.folksdev.fdproduction.model.BookStatus;
import com.folksdev.fdproduction.model.Category;
import lombok.Data;

@Data
public final class SaveBookRequest {

    private String title;
    private String authorName;
    private BookStatus bookStatus;
    private String publisher;
    private Integer lastPageNumber;
    private Long categoryId;
    private Integer totalPage;
}
