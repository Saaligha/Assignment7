package za.ac.cput.domain.users;

public class Subject {
    private String subjectID, subjectName, subjectDisc, subjectLevel;

    public Subject(Builder builder) {
        this.subjectID = builder.subjectID;
        this.subjectName = builder.subjectName;
        this.subjectDisc = builder.subjectDisc;
        this.subjectLevel = builder.subjectLevel;
    }

    public Subject(){

    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectDisc() {
        return subjectDisc;
    }

    public void setSubjectDisc(String subjectDisc) {
        this.subjectDisc = subjectDisc;
    }

    public String getSubjectLevel() {
        return subjectLevel;
    }

    public void setSubjectLevel(String subjectLevel) {
        this.subjectLevel = subjectLevel;
    }
    public static class Builder{
        private String subjectID, subjectName, subjectDisc, subjectLevel;

        public Builder subjectID(String subjectID){
            this.subjectID = subjectID;
            return this;
        }

        public Builder subjectName(String subjectName){
            this.subjectName = subjectName;
            return this;
        }

        public Builder subjectDisc(String subjectDisc){
            this.subjectDisc = subjectDisc;
            return this;
        }

        public Builder subjectLevel(String subjectLevel){
            this.subjectLevel = subjectLevel;
            return this;
        }

        public Subject.Builder copy(Subject subject){
            this.subjectID = subject.subjectID;
            this.subjectName = subject.subjectName;
            this.subjectDisc = subject.subjectDisc;
            this.subjectLevel = subject.subjectLevel;
            return this;
        }

        public Subject build(){
            return new Subject(this);
        }
    }

    @Override
    public String toString() {
        return "SubjectRepository{" +
                "subjectID='" + subjectID + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", subjectDisc='" + subjectDisc + '\'' +
                ", subjectLevel='" + subjectLevel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subject)) return false;

        Subject subject = (Subject) o;

        if (getSubjectID() != null ? !getSubjectID().equals(subject.getSubjectID()) : subject.getSubjectID() != null) return false;
        if (getSubjectName() != null ? !getSubjectName().equals(subject.getSubjectName()) : subject.getSubjectName() != null)
            return false;
        if (getSubjectDisc() != null ? !getSubjectDisc().equals(subject.getSubjectDisc()) : subject.getSubjectDisc() != null)
            return false;
        return getSubjectLevel() != null ? getSubjectLevel().equals(subject.getSubjectLevel()) : subject.getSubjectLevel() == null;
    }

    @Override
    public int hashCode() {
        int result = getSubjectID() != null ? getSubjectID().hashCode() : 0;
        result = 31 * result + (getSubjectName() != null ? getSubjectName().hashCode() : 0);
        result = 31 * result + (getSubjectDisc() != null ? getSubjectDisc().hashCode() : 0);
        result = 31 * result + (getSubjectLevel() != null ? getSubjectLevel().hashCode() : 0);
        return result;
    }
}


