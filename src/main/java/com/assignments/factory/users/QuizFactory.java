package za.ac.cput.factory.users;

import za.ac.cput.domain.users.Quiz;

public class QuizFactory {
    public static Quiz getQuiz(String userID, String firstName, String lastName, String email) {
        return new Quiz.Builder().userID(userID).firstName(firstName).lastName(lastName).email(email).build();
    }
}


