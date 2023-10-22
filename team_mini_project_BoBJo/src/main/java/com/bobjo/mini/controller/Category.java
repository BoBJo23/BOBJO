package com.bobjo.mini.controller;

import com.bobjo.mini.model.dto.Food;
import com.bobjo.mini.view.Option;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Category {
    FoodData foodDatad = new FoodData();
    Option op = new Option();
    Scanner sc = new Scanner(System.in);
    int categoryChoice;
    int number;

    Food fd = new Food();

    public void categoryRandom() {

        String Category;


        do {
            System.out.println("\u001B[32m ┌---------┐");
            System.out.println("\u001B[32m〈" + "\u001B[32m 1. 한 식 │ ");
            System.out.println("\u001B[32m └---------┘");
            System.out.println("\u001B[31m ┌---------┐");
            System.out.println("\u001B[31m〈" + "\u001B[31m 2. 일 식 │ ");
            System.out.println("\u001B[31m └---------┘");
            System.out.println("\u001B[33m ┌---------┐");
            System.out.println("\u001B[33m〈" + "\u001B[33m 3. 양 식 │ ");
            System.out.println("\u001B[33m └---------┘");
            System.out.println("\u001B[34m ┌---------┐");
            System.out.println("\u001B[34m〈" + "\u001B[34m 4. 중 식 │ ");
            System.out.println("\u001B[34m └---------┘");
            System.out.println("\u001B[36m ┌------------┐");
            System.out.println("\u001B[36m〈" + "\u001B[36m 5. 돌아가기  │ ");
            System.out.println("\u001B[36m └------------┘");
            System.out.print("\u001B[0m");
            System.out.print("☆☆ 위의 카테고리 중 1개를 선택하세요 ☆☆ --- ▷" + " ");
            System.out.print("");




            try {
                int categoryChoice = sc.nextInt();
                Random random = new Random();

                switch (categoryChoice) {
                    case 1: // 한식
                        int randomIndexKorean = random.nextInt(fd.getKoreanMenu().size());
                        Category = fd.getKoreanMenu().get(randomIndexKorean);
                        next(Category);
                        break;

                    case 2: // 일식
                        int randomIndexJapanese = random.nextInt(fd.getJapaneseMenu().size());
                        Category = fd.getJapaneseMenu().get(randomIndexJapanese);
                        next(Category);
                        break;

                    case 3: // 양식
                        int randomIndexWestern = random.nextInt(fd.getWesternMenu().size());
                        Category = fd.getWesternMenu().get(randomIndexWestern);
                        next(Category);
                        break;

                    case 4: // 중식
                        int randomIndexChinese = random.nextInt(fd.getChineseMenu().size());
                        Category = fd.getChineseMenu().get(randomIndexChinese);
                        next(Category);
                        break;

                    case 5: // 돌아가기
                        return;

                    default:
                        System.out.println("유효하지 않은 선택입니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해야 합니다.");
                sc.next();  // 잘못된 입력 버퍼 지우기
            }
        } while (categoryChoice != 5);
    }





    public void next(String st) {

        System.out.println("\u001B[33m              ※※※※※※※※※※※※※※※※※※  오늘 메뉴는  ※※※※※※※※※※※※※※※※※※");
        System.out.println("\u001B[33m                     ===========    ===========     ===========     ===========");
        System.out.println("\u001B[33m                     ∥                        ∥     ∥                         ∥ ");
        System.out.println("\u001B[33m                     ===========                    ===========                 ");
        System.out.println("\u001B[33m                                   =============                   ============= ");
        System.out.println("\u001B[33m                    =============                  =============                 ");
        System.out.println("\u001B[33m                         ∥           ∥                   ∥           ∥          ");
        System.out.println("\u001B[33m                         ∥           ===========         ∥           ===========");
        System.out.println("\u001B[33m               ※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
        System.out.print("\u001B[0m");
        System.out.println("");
        System.out.println("                         ★★★★★★★★★★★★ " + "( " + st + " )" + " 당첨 ★★★★★★★★★★★★");
        do {
            System.out.print("\u001B[0m        >" + " 1. 카테고리 다시 뽑기 <  ");
            System.out.print("         >" + " 2. 메인으로 돌아가기 <   ");
            System.out.println("        >" + " 3. 프로그램 종료 <  ");
            System.out.print("                              \u001B[36m※ 필요한 메뉴가 있으면 위에서 골라주세요 ※ : ");
            System.out.print("\u001B[0m");
            int number = sc.nextInt();

            if (number >= 4) {
                System.out.print("                          \u001B[31m※ 메뉴에서 없는 번호를 선택하였음으로 프로그램 종료합니다 ※");
                System.out.println("\u001B[0m");
                System.exit(0);
            }
            switch (number) {
                case 1:
                    categoryRandom();
                    break;
                case 2:
                    op.mainmenu();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        } while (number != 3);
    }

}





