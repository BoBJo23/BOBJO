package com.bobjo.mini.model.dto;

public class CategoryDTO {

    private int categoryNum;
    private String categoryName;

    public CategoryDTO() {
    }

    public CategoryDTO(int categoryNum, String categoryName) {
        this.categoryNum = categoryNum;
        this.categoryName = categoryName;
    }

    public int getCategoryNum() {
        return categoryNum;
    }

    public void setCategoryNum(int categoryNum) {
        this.categoryNum = categoryNum;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "categoryNum=" + categoryNum +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
