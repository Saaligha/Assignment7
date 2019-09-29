package za.ac.cput.factory.users;

import za.ac.cput.domain.users.Student;

public class StudentFactory {
    public static Student getStudent(String userID, String firstName, String lastName, String email) {
        return new Student.Builder().userID(userID).firstName(firstName).lastName(lastName).email(email).build();
    }
}


