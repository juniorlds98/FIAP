package com.curso.validado;

import com.curso.validado.models.Person;
import com.curso.validado.services.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValidadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidadoApplication.class, args);

		testador();
	}

	//=========== ZONA DE TESTE ===========//
	private static PersonService personService;

	public ValidadoApplication(PersonService personService){
		this.personService = personService;
	}

	public static void testador(){

		Person personA = new Person("Joaquim", 35, "jo@quim.com", "54672960866");
		personService.create(personA);
    }

	//=========== ZONA DE TESTE ===========//

}
