package com.bobjo.mini.controller;


import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class RandomFoodInput {
    public void FoodPeaker() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> menuList = new ArrayList<>();
        Random random = new Random();

        System.out.println("음식 메뉴를 하나씩 입력하고 엔터를 눌러주세요! (입력이 끝난 후 \"끝\" 을 입력하세요):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("끝")) {
                if (menuList.isEmpty()) {
                    System.out.println("메뉴가 입력되지 않았습니다. 다시 입력해주세요.");
                } else {
                    boolean keepChoosing = true;

                    while (keepChoosing) {
                        int randomIndex = random.nextInt(menuList.size());
                        String selectedFood = menuList.get(randomIndex);
                        System.out.println("오늘의 메뉴는 " + selectedFood + "입니다!");

                        System.out.println("다시 뽑으시겠습니까? (예/아니요):");
                        String answer = scanner.nextLine();

                        if (answer.equals("아니요")) {
                            keepChoosing = false;
                        }
                    }
                }
                break;
            }

            menuList.add(input);
        }

    }
}
