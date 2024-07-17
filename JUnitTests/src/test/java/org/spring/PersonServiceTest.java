package org.spring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonServiceTest {
    private PersonService personService;
    private List<Person> people;

    @BeforeEach
    public void setUp() {
        personService = new PersonService();
        people = new ArrayList();
        people.add(new Person("Николай", 18));
        people.add(new Person("Дмитрий", 16));
        people.add(new Person("Никита", 25));
    }

    @Test
    public void testGetFirstElement() {
        Person person = new Person("Николай", 18);
        Assertions.assertEquals(person, personService.getFirstElement(people));
    }

    @Test
    public void testGetFirstElementIfListIsEmpty() {
        people.clear();
        Assertions.assertNull(personService.getFirstElement(people));
    }

    @Test
    public void calculateAge() {
        Assertions.assertEquals(19, personService.calculateAge(people)) ;
    }


    @Test
    public void filterAdultsTest(){
    }



}
