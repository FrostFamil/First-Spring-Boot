package com.example.demo.demo.dao;

import com.example.demo.demo.model.Person;
import java.util.*;

public interface PersonDao {

    int insertPerson(UUID id, Person person);

    default int addPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
