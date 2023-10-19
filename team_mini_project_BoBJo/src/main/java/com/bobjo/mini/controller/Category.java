package com.bobjo.mini.controller;

import com.bobjo.mini.view.Option;

import java.util.Random;
import java.util.Scanner;

public class Category {
    FoodData fd = new FoodData();
    Option op = new Option();
    Scanner sc = new Scanner(System.in);
    int categoryChoice;
    public void categoryRandom() {

        String Category ;

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

            int categoryChoice = sc.nextInt();
            Random random = new Random();

            fd.foodlist();
            switch (categoryChoice) {
                case 1: // 한식
                    int randomIndexKorean = random.nextInt(fd.koreanList.size());
                    Category = fd.koreanList.get(randomIndexKorean);
                    next(Category);
                    break;
                case 2: // 일식
                    int randomIndexJapanese = random.nextInt(fd.japaneseList.size());
                    Category = fd.japaneseList.get(randomIndexJapanese);
                    next(Category);
                    break;
                case 3: // 양식
                    int randomIndexWestern = random.nextInt(fd.westernList.size());
                    Category = fd.westernList.get(randomIndexWestern);
                    next(Category);
                    break;
                case 4: // 중식
                    int randomIndexChinese = random.nextInt(fd.chineseList.size());
                    Category = fd.chineseList.get(randomIndexChinese);
                    next(Category);
                    break;
                case 5: // 돌아가기
                    return;

                default:
                    System.out.println("\u001B[31m※※※※유효하지 않는 선택입니다.※※※※");
                    System.out.println("\u001B[0m☆☆ 다시 골라주세요 ☆☆ --- ▷");
            }
        } while (categoryChoice != 5);
    }
    public void next(String st) {
        System.out.println("");
        System.out.println("");
        System.out.println("  ※※※※※※※※※※※※※※※※※※※※  오늘 메뉴는  ※※※※※※※※※※※※※※※※※※※※");
        System.out.println("");
        System.out.println("");
        System.out.println("     =============     ==============       =============     ============== ");
        System.out.println("     ∥                              ∥      ∥                               ∥ ");
        System.out.println("     ∥                              ∥      ∥                               ∥ ");
        System.out.println("     =============                          =============                     ");
        System.out.println("                     ==================                     ================== ");
        System.out.println("    ===============                        ===============                     ");
        System.out.println("           ∥            ∥                         ∥            ∥               ");
        System.out.println("           ∥            ∥                         ∥            ∥               ");
        System.out.println("           ∥            =============             ∥            =============  ");
        System.out.println("");
        System.out.println("");
        System.out.println("  ※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("             ★★★★★★★★★★★★ " + "( " + st + " )" + " 당첨 ★★★★★★★★★★★★");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        op.mainmenu();
    }
}

