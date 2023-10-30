package com.bobjo.mini.model.dto;

public class UserDTO implements java.io.Serializable {


    private int age;
    private Integer userNum;
    private String userName;
    private char gender;

    public UserDTO() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getUserNum() {
        return userNum;
    }

    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public UserDTO(int age, Integer userNum, String userName, char gender) {
        this.age = age;
        this.userNum = userNum;
        this.userName = userName;
        this.gender = gender;


    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "age=" + age +
                ", userNum=" + userNum +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
