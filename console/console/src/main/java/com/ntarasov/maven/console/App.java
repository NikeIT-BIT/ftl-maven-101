package com.ntarasov.maven.console;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tarasov.maven.core.Person;
import com.tarasov.maven.service.PersonService;

public class App {
    private static PersonService personService = new PersonService();

    public static void main(String[] args) throws JsonProcessingException {
        Person person = new Person();
        person.setLastName("Smith");
        person.setFirstName("Jon");
        System.out.println(person);

        String json = personService.convert(person);
        System.out.println(json);

        Person afterParse = personService.parse(json);
        System.out.println(afterParse);


    }
}
