package za.ac.cput.domain.users;

public class StudentSponsor {
    private String userID, firstName, lastName, email;

    public StudentSponsor(Builder builder) {
        this.userID = builder.userID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
    }

    public StudentSponsor(){

    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public static class Builder{
        private String userID, firstName, lastName, email;

        public Builder userID(String userID){
            this.userID = userID;
            return this;
        }

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public StudentSponsor.Builder copy(StudentSponsor studentSponsor){
            this.userID = studentSponsor.userID;
            this.firstName = studentSponsor.firstName;
            this.lastName = studentSponsor.lastName;
            this.email = studentSponsor.email;
            return this;
        }

        public StudentSponsor build(){
            return new StudentSponsor(this);
        }
    }

    @Override
    public String toString() {
        return "StudentSponsorFactory{" +
                "userID='" + userID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentSponsor)) return false;

        StudentSponsor studentSponsor = (StudentSponsor) o;

        if (getUserID() != null ? !getUserID().equals(studentSponsor.getUserID()) : studentSponsor.getUserID() != null) return false;
        if (getFirstName() != null ? !getFirstName().equals(studentSponsor.getFirstName()) : studentSponsor.getFirstName() != null)
            return false;
        if (getLastName() != null ? !getLastName().equals(studentSponsor.getLastName()) : studentSponsor.getLastName() != null)
            return false;
        return getEmail() != null ? getEmail().equals(studentSponsor.getEmail()) : studentSponsor.getEmail() == null;
    }

    @Override
    public int hashCode() {
        int result = getUserID() != null ? getUserID().hashCode() : 0;
        result = 31 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        return result;
    }
}


