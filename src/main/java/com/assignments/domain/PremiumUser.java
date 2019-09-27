package com.assignments.domain;

import java.util.Objects;

public class PremiumUser {
    private String userId, userName, userSname;

    public PremiumUser(Builder builder) {
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

    public static class Builder {
        private String userId, userName, userSname;

        public Builder(String userId, String userName, String userSname) {
            this.userId = userId;
            this.userName = userName;
            this.userSname = userSname;
        }

        public Builder() {
            this.userId = userId;
            this.userName = userName;
            this.userSname = userSname;
        }


        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder userSname(String userSname) {
            this.userSname = userSname;
            return this;
        }

        public PremiumUser build(){
            return new PremiumUser(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PremiumUser that = (PremiumUser) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(userSname, that.userSname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userSname);
    }

    @Override
    public String toString() {
        return "PremiumUser{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userSname='" + userSname + '\'' +
                '}';
    }
}