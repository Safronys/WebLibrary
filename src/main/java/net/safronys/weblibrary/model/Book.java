package net.safronys.weblibrary.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "books")
public class Book extends BaseEntity{
    @Column(name = "book_name")
    private String bookName;

    @Column(name = "author")
    private String author;
}
