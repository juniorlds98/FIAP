package com.livroseleitores.models;

import jakarta.persistence.*;
import jdk.jfr.Category;
@Table(name = "book") @Entity
public class Books {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "Id")
    private Integer bookId;
    @Column (name = "title")
    private String title;
    @Column (name = "author")
    private String author;
    @Column (name = "category")
    private BookCategory category;

    public Books(Integer bookId, String title, String author, BookCategory category) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
    }
    public Books(){

    }

    public Integer getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public BookCategory getCategory() {
        return category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(BookCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category=" + category +
                '}';
    }
}





