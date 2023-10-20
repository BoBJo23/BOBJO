package com.bobjo.mini.controller;


import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class RandomFoodInput {
    public void FoodPeaker() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> menuList = new ArrayList<>();
        Random random = new Random();

        System.out.println("╭───────────────────────────╮");
        String text = "3. 메뉴 직접 입력 후 랜덤";

        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(150);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("╰───────────────────────────╯");

        System.out.println();
        System.out.println();

        System.out.println("음식 메뉴를 하나씩 입력하고 엔터를 눌러주세요! " );
        System.out.println( "(입력이 끝난 후 \"\u001B[34m끝\u001B[0m\" 을 입력하세요):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("끝")) {
                if (menuList.isEmpty()) {
                    System.out.println("메뉴가 입력되지 않았습니다. 다시 입력해주세요.");
                } else {
                    boolean keepChoosing = true;

                    while (keepChoosing) {
                        int randomIndex = random.nextInt(menuList.size());
                        String selectedFood = menuList.get(randomIndex);

                        System.out.println();
                        System.out.println();

                        String loadingtxt = "LOADING...";

                        for (int i = 0; i < loadingtxt.length(); i++) {
                            System.out.print(loadingtxt.charAt(i));
                            try {
                                Thread.sleep(150);

                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println();
                        System.out.println();
                        System.out.print("오늘의 메뉴는 ");
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println( "  "+selectedFood  + "   입니다!");
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println("다시 뽑으시겠습니까? (y/n):");
                        String answer = scanner.nextLine();

                        if (answer.equalsIgnoreCase("n")) {
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
