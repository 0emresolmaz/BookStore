package com.folksdev.fdproduction.dto;

import com.folksdev.fdproduction.model.BookStatus;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public final class SaveBookRequest {

    @NotEmpty(message = "title can't be empty")
    private String title;
    @NotEmpty
    private String authorName;
    @NotBlank
    private BookStatus bookStatus;
    @NotNull
    private String publisher;
    @NotNull
    private Integer lastPageNumber;
    @NotNull
    private Long categoryId;
    @NotNull
    private Integer totalPage;
}
