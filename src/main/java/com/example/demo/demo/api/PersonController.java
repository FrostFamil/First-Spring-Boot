package com.example.demo.demo.api;

import com.example.demo.demo.model.Person;
import com.example.demo.demo.service.PersonService;

public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}
