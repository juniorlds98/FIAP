package com.example.gameapi.models;

import jakarta.persistence.*;

import java.time.Year;

@Entity //Responsável por levar uma classe como uma tabela (entidade) para o Banco de Dados
public class Game {
    //Propriedades

    @Id //Indica chave primária - PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Indica campo auto-gerado
    private Integer id;

    @Column //Indica um campo/coluna em uma entidade
    private String title;

    @Column
    private String publisher;

    @Column
    private String gender;

    @Column(name = "release_year")
    private Year year;

    public Game(){
        
    }

    //Construtores

    public Game(Integer id, String title, String publisher, String gender, Year year) {
        this.title = title;
        this.publisher = publisher;
        this.gender = gender;
        this.year = year;
    }

    //Getters

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGender() {
        return gender;
    }

    public Year getYear() {
        return year;
    }

    //Setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setYear(Year year) {
        this.year = year;
    }


    //Métodos sobrescritos

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", gender='" + gender + '\'' +
                ", year=" + year +
                '}';
    }
}
