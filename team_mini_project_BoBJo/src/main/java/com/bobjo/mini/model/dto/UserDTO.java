package com.bobjo.mini.model.dto;

public class UserDTO implements java.io.Serializable{

    private int age;

    private int userNum;

    private char gender;
    private int menuNum;

    public UserDTO() {
    }

    public UserDTO(int age, int userNum, char gender, int menuNum) {
        this.age = age;
        this.userNum = userNum;
        this.gender = gender;
        this.menuNum = menuNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getUserNum() {
        return userNum;
    }

    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getMenuNum() {
        return menuNum;
    }

    public void setMenuNum(int menuNum) {
        this.menuNum = menuNum;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "age=" + age +
                ", userNum=" + userNum +
                ", gender=" + gender +
                ", menuNum=" + menuNum +
                '}';
    }
}
