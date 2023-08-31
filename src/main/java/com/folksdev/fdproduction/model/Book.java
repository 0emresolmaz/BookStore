package com.folksdev.fdproduction.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Book")
@Getter
@Setter
@NoArgsConstructor

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String authorName;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

}
