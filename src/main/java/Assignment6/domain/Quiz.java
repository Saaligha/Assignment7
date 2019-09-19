package Assignment6.domain;

import java.util.Objects;

public class Quiz {
    private String quizId, quizDescr, quizP;

    private Quiz(Builder builder) {
        this.quizId = builder.quizId;
        this.quizDescr = builder.quizDescr;
        this.quizP = builder.quizP;
    }

    public String getQuizId() {
        return quizId;
    }

    public String getQuizP() {
        return quizP;
    }

    public String getQuizDescr() {
        return quizDescr;
    }

    public void setQuizId(String quizId) {
        this.quizId = quizId;
    }

    public void setQuizDescr(String quizDescr) {
        this.quizDescr = quizDescr;
    }

    public void setQuizP(String quizP) {
        this.quizP = quizP;
    }

    public static class Builder {
        private String quizId, quizDescr, quizP;

        public Builder QuizId(String quizId) {
            this.quizId = quizId;
            return this;
        }


        public Builder QuizDescr(String quizDescr) {
            this.quizDescr = quizDescr;
            return this;
        }


        public Builder QuizP(String quizP) {
            this.quizP = quizP;
            return this;
        }
        public Quiz build(){
            return new Quiz(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Quiz)) return false;
        Quiz quiz = (Quiz) o;
        return Objects.equals(getQuizId(), quiz.getQuizId()) &&
                Objects.equals(getQuizDescr(), quiz.getQuizDescr()) &&
                Objects.equals(getQuizP(), quiz.getQuizP());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuizId(), getQuizDescr(), getQuizP());
    }
}