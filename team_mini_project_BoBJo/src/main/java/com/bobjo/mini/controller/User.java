package com.bobjo.mini.controller;

public class User {
    private int age;
    private char gender;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", gender=" + gender +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public User() {
    }
}
