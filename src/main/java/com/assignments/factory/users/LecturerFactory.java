package za.ac.cput.factory.users;

import za.ac.cput.domain.users.Lecturer;

public class LecturerFactory {
    public static Lecturer getLecturer(String userID, String firstName, String lastName, String email) {
        return new Lecturer.Builder().userID(userID).firstName(firstName).lastName(lastName).email(email).build();
    }
}


