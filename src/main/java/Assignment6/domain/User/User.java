package Assignment6.domain.User;


import java.util.Objects;

public class User {

    private String userId, userName, userSname;

    private User() { }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserSname(String userSname) {
        this.userSname = userSname;
    }

    User(Builder builder) {

        this.userId = builder.userId;
        this.userName = builder.userName;
        this.userSname = builder.userSname;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSname() {
        return userSname;
    }

    public static class Builder {
        private String userId, userName, userSname;


        public Builder UserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder UserName(String userName) {
            this.userName = userName;
            return this;
        }


        public Builder UserSname(String userSname) {
            this.userSname = userSname;
            return this;
        }

        public User build() {
            return new User(this);
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Builder)) return false;
            Builder builder = (Builder) o;
            return userId.equals(builder.userId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(userId);
        }
    }
}