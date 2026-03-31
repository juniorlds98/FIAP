package com.curso.validado.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
public class Person {

    //Propriedades
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Nome não pode ser em branco")
    private String name;

    @Min(value = 0, message = "A idade deve ser no mínimo 0")
    private Integer age;

    @Email(message = "O email deve ser válido")
    private String email;

    @Pattern(regexp = "\\d{11}", message = "O CPF deve ter 11 digitos")
    private String cpf;

    //Construtores

    public Person(String name, Integer age, String email, String cpf) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.cpf = cpf;
    }

    public  Person(){

    }


    //Getters

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    //To String

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
