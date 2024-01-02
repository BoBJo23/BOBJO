package com.bobjo.mini.model.dto;

public class MenuDTO {

    private int menuNum;
    private String menuName;
    private int categoryNum;
    private int countingChoices;

    public MenuDTO() {
    }

    public MenuDTO(int menuNum, String menuName, int categoryNum, int countingChoices) {
        this.menuNum = menuNum;
        this.menuName = menuName;
        this.categoryNum = categoryNum;
        this.countingChoices = countingChoices;
    }

    public int getMenuNum() {
        return menuNum;
    }

    public void setMenuNum(int menuNum) {
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

    public int getCountingChoices() {
        return countingChoices;
    }

    public void setCountingChoices(int countingChoices) {
        this.countingChoices = countingChoices;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "menuNum=" + menuNum +
                ", menuName='" + menuName + '\'' +
                ", categoryNum=" + categoryNum +
                ", countingChoices=" + countingChoices +
                '}';
    }
}
