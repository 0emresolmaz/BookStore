package com.folksdev.fdproduction.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@MappedSuperclass
@Entity
@Data
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @CreationTimestamp
    private LocalDate createDate = LocalDate.now();

    @UpdateTimestamp
    private LocalDate updateTime;


}
