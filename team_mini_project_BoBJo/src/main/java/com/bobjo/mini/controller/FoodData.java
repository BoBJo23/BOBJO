package com.bobjo.mini.controller;



import com.bobjo.mini.model.dto.Food;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FoodData {


    public void viewAllmenu(Food food) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;


        System.out.println("=============== 한식 ===============");

        for (int i = 0; i < food.getKoreanList().size(); i++) {
            count1++;
            if (count1 % 5 == 0) {
                System.out.println();
            } else {
                System.out.print(food.getKoreanList().get(i) + "   ");
            }
        }

        if (count1 % 5 != 0) {
            System.out.println();
        }

        System.out.println("=============== 일식 ===============");

        for (int y = 0; y < food.getJapaneseList().size(); y++) {
            count3++;
            if (count3 % 5 == 0) {
                System.out.println();
            } else {
                System.out.print(food.getJapaneseList().get(y) + "   ");
            }

        }
        System.out.println();
        System.out.println("=============== 양식 ===============");

        for (int k = 0; k < food.getWesternList().size(); k++) {
            count4++;
            if (count4 % 5 == 0) {
                System.out.println();
            } else {
                System.out.print(food.getWesternList().get(k) + "   ");
            }

        }

        System.out.println("=============== 중식 ===============");

        for (int u = 0; u < food.getChineseList().size(); u++) {
            count2++;
            if (count2 % 5 == 0) {
                System.out.println();
            } else {
                System.out.print(food.getChineseList().get(u) + "   ");
            }
        }

        if (count2 % 5 != 0) {
            System.out.println();
        }
    }
}



