package Assignment6.domain.Results;

import java.util.Objects;

public class Results {
    private String finalResults, semesterResults;
    private String passOrFail;


    private Results(){}

    private Results(Builder builder){

        this.finalResults = builder.finalResults;
        this.semesterResults = builder.semesterResults;
        this.passOrFail = builder.passOrFail;

   }

    public String getFinalResults() {
        return finalResults;
    }

    public String getSemesterResults() {
        return semesterResults;
    }

    public String isPassOrFail() {
        return passOrFail;
    }
    public static class Builder {
        private String finalResults,semesterResults;
        private String passOrFail;

        public Builder FinalResults(String finalResults) {
            this.finalResults = finalResults;
            return this;
        }

        public Builder SemesterResults(String semesterResults) {
            this.semesterResults = semesterResults;
            return this;
        }

        public Builder PassOrFail(String passOrFail) {
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
