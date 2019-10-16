package za.ac.cput.factory.users;

import za.ac.cput.domain.users.Person;

public class PersonFactory {
    public static Person getPerson(String userID, String firstName, String lastName, String email) {
        return new Person.Builder().userID(userID).firstName(firstName).lastName(lastName).email(email).build();
    }
}


