package com.curso.validado.services;

import com.curso.validado.models.Person;
import com.curso.validado.repositories.PersonRepository;
import org.aspectj.apache.bcel.classfile.SourceFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    //Dependencia
    @Autowired
    private PersonRepository personRepository;

    //Metod0 para listar todas as pessoas
    public List<Person> listAllPerson(){

        List<Person> allPerson = new ArrayList<>();

        personRepository.findAll().forEach(person -> {
            allPerson.add(person);
            System.out.println(person);

        });
        return allPerson;
    }

    //Métod0 para criar novo registro de pessoas

    public Person create(Person person){

        try{
            personRepository.save(person);
            System.out.println("Registro criado com sucesso.");
        }
        catch (Exception exception){
            System.out.println(exception);
        }

        return person;
    }
}
