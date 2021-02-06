package com.example.demo.demo.service;

import com.example.demo.demo.dao.PersonDao;
import com.example.demo.demo.model.Person;

public class PersonService {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.addPerson(person);
    }
}
