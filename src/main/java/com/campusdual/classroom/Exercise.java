package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise {

    public static List<Person> getPeopleList() {
        Person person = new Person("John", "Smith");
        Teacher teacher = new Teacher("María", "Montessori", "Educación");
        PoliceOfficer police = new PoliceOfficer("Jake", "Peralta", "B-99");
        Doctor doctor = new Doctor("Gregory", "House", "Nefrología e Infectología");

        List<Person> personList = new ArrayList<>();

        personList.add(person);
        personList.add(teacher);
        personList.add(police);
        personList.add(doctor);

        return personList;
    }

    public static void showPeopleDetails(List<Person> stringList) {
        for (Person personString : stringList) {
            personString.getDetails();
        }
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }
}
