package za.ac.cput.factory.users;

import za.ac.cput.domain.users.StudentSponsor;

public class StudentSponsorFactory {
    public static StudentSponsor getStudentSponsor(String userID, String firstName, String lastName, String email) {
        return new StudentSponsor.Builder().userID(userID).firstName(firstName).lastName(lastName).email(email).build();
    }
}


