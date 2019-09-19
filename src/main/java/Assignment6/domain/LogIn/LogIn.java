package Assignment6.domain.LogIn;

import java.util.Objects;

public class LogIn {
    private String userId, password;

    private LogIn(){}

    private LogIn(Builder builder){
        this.password = builder.password;
        this.userId = builder.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }
    public String getPassword() {
        return password;
    }

    public static class Builder {
    private String userId, password;

        public Builder UserId(String userId) {
            this.userId = userId;
            return this;
        }


        public Builder Password(String password) {
            this.password = password;
            return this;
        }
        public LogIn build(){return new LogIn(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LogIn)) return false;
        LogIn logIn = (LogIn) o;
        return Objects.equals(getUserId(), logIn.getUserId()) &&
                Objects.equals(getPassword(), logIn.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getPassword());
    }
}
