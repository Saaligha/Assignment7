package Assignment6.domain.Results;

import java.util.Objects;

public class Results {
    private int finalResults, semesterResults;
    private boolean passOrFail;


    private Results(){}

    private Results(Builder builder){

        this.finalResults = builder.finalResults;
        this.semesterResults = builder.semesterResults;
        this.passOrFail = builder.passOrFail;

   }

    public int getFinalResults() {
        return finalResults;
    }

    public int getSemesterResults() {
        return semesterResults;
    }

    public boolean isPassOrFail() {
        return passOrFail;
    }
    public static class Builder {
        private int finalResults,semesterResults;
        private boolean passOrFail;

        public Builder FinalResults(int finalResults) {
            this.finalResults = finalResults;
            return this;
        }

        public Builder SemesterResults(int semesterResults) {
            this.semesterResults = semesterResults;
            return this;
        }

        public Builder PassOrFail(boolean passOrFail) {
            this.passOrFail = passOrFail;
            return this;
        }
        public Results build(){return new Results(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Results)) return false;
        Results results = (Results) o;
        return getFinalResults() == results.getFinalResults() &&
                getSemesterResults() == results.getSemesterResults() &&
                isPassOrFail() == results.isPassOrFail();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFinalResults(), getSemesterResults(), isPassOrFail());
    }
}
