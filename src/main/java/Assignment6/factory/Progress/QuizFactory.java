package Assignment6.factory.Progress;

import Assignment6.domain.Progress.Quiz;

public class QuizFactory {

    public static Quiz getQuiz(String quiz){
        return new Quiz.Builder().QuizId(quiz).build();
    }
}
