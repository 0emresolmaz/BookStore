package com.folksdev.fdproduction.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import javax.persistence.*;

@Entity
@Table(name = "book")
@Data
@NoArgsConstructor
@SuperBuilder

public class Book extends BaseEntity {
    private String title;
    private String authorName;

    @Enumerated(value = EnumType.STRING)  //EnumType.ORDINAL dersek sıralı da tutar.
    private BookStatus bookStatus;
    private String publisher;
    private Integer lastPageNumber;
    private Integer totalPage;
    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

}
