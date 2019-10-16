package za.ac.cput.factory.users;

import za.ac.cput.domain.users.User;

public class UserFactory {
    public static User getUser(String userID, String firstName, String lastName, String email) {
        return new User.Builder().userID(userID).firstName(firstName).lastName(lastName).email(email).build();
    }
}


