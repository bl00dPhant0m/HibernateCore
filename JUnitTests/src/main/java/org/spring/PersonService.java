package org.spring;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonService {
    public Person getFirstElement(List<Person> list) {
        if (list.size() == 0) return null;
        return list.get(0);
    }

    public List<Person> filterAdults(List<Person> list) {
        return list.stream().
                filter(person -> person.getAge() >= 18).
                collect(Collectors.toList());
    }

    public Integer calculateAge(List<Person> list) {
        if (list.isEmpty()) return null;
        int ages = 0;
        for (Person person : list) ages += person.getAge();
        return ages/list.size();
    }

    public List<Person> mergePersonList(List<Person> list, List<Person> list2) {
        list.addAll(list2);
        return list;
    }

    public List<Person> sortPersonsByAge(List<Person> list) {
        return list.stream().
                sorted(Comparator.comparingInt(Person::getAge)).
                collect(Collectors.toList());

    }
}
