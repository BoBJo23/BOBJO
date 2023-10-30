package com.bobjo.mini.model.dto;

import java.util.ArrayList;
import java.util.List;

public class Food implements java.io.Serializable {
    private Integer menuNum;
    private String menuName;
    private int categoryNum;
    private int countingChoice;

    public Food() {
    }

    public Food(Integer menuNum, String menuName, int categoryNum, int countingChoice) {
        this.menuNum = menuNum;
        this.menuName = menuName;
        this.categoryNum = categoryNum;
        this.countingChoice = countingChoice;
    }

    public Integer getMenuNum() {
        return menuNum;
    }

    public void setMenuNum(Integer menuNum) {
        this.menuNum = menuNum;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getCategoryNum() {
        return categoryNum;
    }

    public void setCategoryNum(int categoryNum) {
        this.categoryNum = categoryNum;
    }

    public int getCountingChoice() {
        return countingChoice;
    }

    public void setCountingChoice(int countingChoice) {
        this.countingChoice = countingChoice;
    }

    @Override
    public String toString() {
        return "Food{" +
                "menuNum=" + menuNum +
                ", menuName='" + menuName + '\'' +
                ", categoryNum=" + categoryNum +
                ", countingChoice=" + countingChoice +
                '}';
    }
}
