package com.assignments.domain;

import java.util.Objects;

public class AdminUser {


    private String userId,  userName,  userSname;

    public AdminUser(AdminUser.Builder builder) {
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
        private String userId,  userName,  userSname;

        public Builder() {

        }

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


        public Builder copy(AdminUser User){
            this.userId = User.userId;
            this.userName = User.userName;
            this.userSname = User.userSname;
            return this;
        }



        public Builder(String userId, String userName, String userSname) {
            this.userId = userId;
            this.userName = userName;
            this.userSname = userSname;
        }


        public AdminUser build() { return new AdminUser(this);
        }
    }

}
