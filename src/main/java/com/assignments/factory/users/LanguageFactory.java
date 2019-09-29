package za.ac.cput.factory.users;

import za.ac.cput.domain.users.Language;

public class LanguageFactory {
    public static Language getAttendance(String userID, String firstName, String lastName, String email) {
        return new Language.Builder().userID(userID).firstName(firstName).lastName(lastName).email(email).build();
    }
}


