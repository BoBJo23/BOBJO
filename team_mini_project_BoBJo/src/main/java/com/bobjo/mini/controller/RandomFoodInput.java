package com.bobjo.mini.controller;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class RandomFoodInput {
    public void FoodPicker() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> menuList = new ArrayList<>();
        Random random = new Random();

        System.out.println("  ");
        System.out.println("음식 메뉴를 하나씩 입력하고 엔터를 눌러주세요!");
        System.out.println("(입력이 끝난 후 \"끝\" 을 입력하세요)");
        System.out.println("  ");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("끝")) {
                if (menuList.isEmpty()) {
                    System.out.println("메뉴가 입력되지 않았습니다. 다시 입력해주세요.");
                } else {
                    boolean keepChoosing = true;
                    System.out.println(" ");

                    while (keepChoosing) {
                        int randomIndex = random.nextInt(menuList.size());
                        String selectedFood = menuList.get(randomIndex);
                        String Loading = "LOADING....";

                        for (int i = 0; i < Loading.length(); i++) {
                            System.out.print(Loading.charAt(i));
                            try {
                                Thread.sleep(250); // 글자 간의 시간 간격 (200 밀리초)

                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println("            오늘의 메뉴는 " + selectedFood + "입니다!");

                        System.out.println("              다시 뽑으시겠습니까? (번호 입력) ");
                        System.out.print("\u001B[0m       >" + " 1. 예 <  ");
                        System.out.print("         >" + " 2. 아니요 <   ");
                        System.out.println(" ");
                        String answer = scanner.nextLine();

                        while (!answer.equals("1") && !answer.equals("2")) {
                            System.out.println("                                   \u001B[31m※※※※※유효하지 않은 선택입니다.※※※※※");
                            System.out.println("     \u001B[0m──────────────────────────────────────────  다시 골라주세요 ────────────────────────────────────────── ");
                            System.out.println("              다시 뽑으시겠습니까? ");
                            System.out.println("");
                            System.out.println("");
                            System.out.print("\u001B[0m       >" + " 1. 예 <  ");
                            System.out.print("         >" + " 2. 아니요 <   ");
                            answer = scanner.nextLine();
                        }

                        if (answer.equals("2")) {
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
