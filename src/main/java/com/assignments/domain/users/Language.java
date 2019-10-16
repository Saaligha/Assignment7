package za.ac.cput.domain.users;

public class Language {
    private String userID, firstName, lastName, email;

    public Language(Builder builder) {
        this.userID = builder.userID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
    }

    public Language(){

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

        public Language.Builder copy(Language language){
            this.userID = language.userID;
            this.firstName = language.firstName;
            this.lastName = language.lastName;
            this.email = language.email;
            return this;
        }

        public Language build(){
            return new Language(this);
        }
    }

    @Override
    public String toString() {
        return "AttendanceFactory{" +
                "userID='" + userID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Language)) return false;

        Language language = (Language) o;

        if (getUserID() != null ? !getUserID().equals(language.getUserID()) : language.getUserID() != null) return false;
        if (getFirstName() != null ? !getFirstName().equals(language.getFirstName()) : language.getFirstName() != null)
            return false;
        if (getLastName() != null ? !getLastName().equals(language.getLastName()) : language.getLastName() != null)
            return false;
        return getEmail() != null ? getEmail().equals(language.getEmail()) : language.getEmail() == null;
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


