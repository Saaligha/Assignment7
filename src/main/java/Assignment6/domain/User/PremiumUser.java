package Assignment6.domain.User;

public class PremiumUser {

    private String userId, userName, userSname;

    private PremiumUser(){ }

    PremiumUser(Builder builder){
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.userSname = builder.userSname;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSname() {
        return userSname;
    }

    public void setUserSname(String userSname) {
        this.userSname = userSname;
    }

    public static class Builder{
        private String userId,userName, userSname;

        public Builder userId(String userId){
            this.userId = userId;
            return this;
        }

        public Builder userName(String userName){
            this.userName = userName;
            return this;
        }

        public Builder userSname(String userSname){
            this.userSname = userSname;
            return this;
        }

        public PremiumUser build(){return new PremiumUser(this);}
    }
}