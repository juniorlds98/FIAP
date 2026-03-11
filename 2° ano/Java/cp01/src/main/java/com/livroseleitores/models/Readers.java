package com.livroseleitores.models;
import jakarta.persistence.*;

import java.util.Set;

@Entity @Table(name = "readers")
public class Readers {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer readerId;
    @Column(name = "name")
    private String name;
    @ManyToMany @JoinTable(
            name = "readBooks",
            joinColumns = @JoinColumn(name = "readerId"),
            inverseJoinColumns = @JoinColumn(name = "bookId")
    )
    private Set<Books> readBooks;

    //Constructor
    public Readers(String name, Books readBooks) {
        this.readerId = readerId;
        this.name = name;
        this.readBooks = (Set<Books>) readBooks;
    }
    public Readers(){
    }

    //Getters
    public Integer getReaderId() {
        return readerId;
    }

    public String getName() {
        return name;
    }

    public Set<Books> getReadBooks() {
        return readBooks;
    }

    //Seters
    public void setName(String name) {
        this.name = name;
    }

    public void setReadBooks(Books readBooks) {
        this.readBooks = (Set<Books>) readBooks;
    }

    //ToString
    @Override
    public String toString() {
        return "Readers{" +
                "readerId=" + readerId +
                ", name='" + name + '\'' +
                ", readBooks=" + readBooks +
                '}';
    }
}
