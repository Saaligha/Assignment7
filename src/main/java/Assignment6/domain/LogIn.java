package Assignment6.domain;

public class LogIn {
    private String userId, password;

    private LogIn(){}

    private LogIn(Builder builder){
        this.password = builder.password;
        this.userId = builder.userId;
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
}
