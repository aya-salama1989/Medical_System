package com.esolutions.msystem.register;

public class User {
    private String userId;
    private String userName;
    private String password;
    private UserType userType;

    public enum UserType {Patient, Doctor}

    public User() {
    }

    public User(String userId, String userName, String password, UserType userType) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.userType = userType;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
