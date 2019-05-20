package Assignment6.factory;

import Assignment6.domain.Quiz;

public class QuizFactory {

    public static Quiz getQuiz(String quiz){
        return new Quiz.Builder().QuizId(quiz).build();
    }
}
