package com.folksdev.fdproduction.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
@Data
public class Category extends BaseEntity {
    private String name;
    @OneToMany(mappedBy = "category")
    @JsonIgnore //category eklediğimde kitap eklememi istemesin
    private List<Book> books;
}
