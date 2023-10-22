package com.bobjo.mini.model.dto;

import java.util.ArrayList;
import java.util.List;

public class Food {

    private List<String> koreanMenu = new ArrayList<>();
    private List<String> chineseMenu = new ArrayList<>();
    private List<String> japaneseMenu = new ArrayList<>();
    private List<String> westernMenu = new ArrayList();

    public Food() {
    }

    public Food(List<String> koreanMenu, List<String> chineseMenu, List<String> japaneseMenu, List<String> westernMenu) {
        this.koreanMenu = koreanMenu;
        this.chineseMenu = chineseMenu;
        this.japaneseMenu = japaneseMenu;
        this.westernMenu = westernMenu;
    }

    public List<String> getKoreanMenu() {
        return koreanMenu;
    }

    public void setKoreanMenu(List<String> koreanMenu) {
        this.koreanMenu = koreanMenu;
    }

    public List<String> getChineseMenu() {
        return chineseMenu;
    }

    public void setChineseMenu(List<String> chineseMenu) {
        this.chineseMenu = chineseMenu;
    }

    public List<String> getJapaneseMenu() {
        return japaneseMenu;
    }

    public void setJapaneseMenu(List<String> japaneseMenu) {
        this.japaneseMenu = japaneseMenu;
    }

    public List<String> getWesternMenu() {
        return westernMenu;
    }

    public void setWesternMenu(List<String> westernMenu) {
        this.westernMenu = westernMenu;
    }

    @Override
    public String toString() {
        return "Food{" +
                "koreanMenu=" + koreanMenu +
                ", chineseMenu=" + chineseMenu +
                ", japaneseMenu=" + japaneseMenu +
                ", westernMenu=" + westernMenu +
                '}';
    }
}
