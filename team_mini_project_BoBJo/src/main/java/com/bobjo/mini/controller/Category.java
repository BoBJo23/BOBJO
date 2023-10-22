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

        String Category;

        do {

            System.out.println("     \u001B[32m┌──────────────┐" + "     \u001B[31m┌──────────────┐" + "     \u001B[33m┌──────────────┐" + "     \u001B[34m┌──────────────┐" + "     \u001B[36m┌─────────────────┐");
            System.out.println("     \u001B[32m│  1.　한  식   │" + "     \u001B[31m│  2.　일  식   │" + "　　 \u001B[33m│  3.  양　 식  │" + "　　　\u001B[34m│  4. 중 　식   │" + "     \u001B[36m│  5. 돌 아 가 기  │");
            System.out.println("     \u001B[32m└──────────────┘" + "     \u001B[31m└──────────────┘" + "     \u001B[33m└──────────────┘" + "     \u001B[34m└──────────────┘" + "     \u001B[36m└─────────────────┘");
            System.out.print("\u001B[0m");
            System.out.print("     ─────────────────────────────────  위의 카테고리 중 1개를 선택하세요  ───────────────────────────────── ▷" + " ");
            System.out.print("");

//            int categoryChoice = sc.nextInt();
            try {
                categoryChoice = Integer.parseInt(sc.next());
            } catch (NumberFormatException e) {
                System.out.println("                               \u001B[31m숫자가 아닌 걸 입력하셨군요 ! 숫자로 다시 입력해 주세요 ! ");
                System.out.print("\u001B[0m");
                sc.nextLine();
                continue;
            }
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
                    System.out.println("                                   \u001B[31m※※※※※유효하지 않은 선택입니다.※※※※※");
                    System.out.println("     \u001B[0m──────────────────────────────────────────  다시 골라주세요 ────────────────────────────────────────── ");
            }
        } while (categoryChoice != 5);
    }

    int number;

    public void next(String st) {

        System.out.println("\u001B[33m                 ─────────────────────────────  오늘 메뉴는  ─────────────────────────────");
        System.out.println("\u001B[33m                       ⣿⣿⣿⣿⣿⣿⣿⣿⣿    ⣿⣿⣿⣿⣿⣿⣿⣿⣿     ⣿⣿⣿⣿⣿⣿⣿⣿⣿     ⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("\u001B[33m                       ⣿                        ⣿     ⣿                         ⣿ ");
        System.out.println("\u001B[33m                       ⣿⣿⣿⣿⣿⣿⣿⣿⣿                    ⣿⣿⣿⣿⣿⣿⣿⣿⣿                 ");
        System.out.println("\u001B[33m                                    ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿                  ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿ ");
        System.out.println("\u001B[33m                      ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿                 ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿                ");
        System.out.println("\u001B[33m                            ⣿          ⣿                   ⣿          ⣿          ");
        System.out.println("\u001B[33m                            ⣿          ⣿⣿⣿⣿⣿⣿⣿⣿⣿         ⣿          ⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("\u001B[33m                 ────────────────────────────────────────────────────────────────────────");
        System.out.println("\u001B[33m                 ────────────────────────────────────────────────────────────────────────");
        System.out.println("                              ★★★★★★★★★★★★ " + "( " + st + " )" + " 당첨 ★★★★★★★★★★★★");
        System.out.println("\u001B[33m                 ────────────────────────────────────────────────────────────────────────");
        System.out.print("\u001B[0m");
        do {
            System.out.print("\u001B[0m        >" + " 1. 카테고리 다시 뽑기 <  ");
            System.out.print("         >" + " 2. 메인으로 돌아가기 <   ");
            System.out.println("        >" + " 3. 프로그램 종료 <  ");
            System.out.print("                              \u001B[36m※ 필요한 메뉴가 있으면 위에서 골라주세요 ※ : ");
            System.out.print("\u001B[0m");

            if (!sc.hasNextInt()) {
                sc.next();
                System.out.print("             \u001B[31m───────────────────────────── 올바른 숫자를 입력하세요 ─────────────────────────────");
                System.out.println("\u001B[0m");
            } else {
                int number = sc.nextInt();

                if (number >= 4) {
                    System.out.print("                          \u001B[31m※ 메뉴에서 없는 번호를 선택하였음으로 프로그램 종료합니다 ※");
                    System.out.println("\u001B[0m");
                    System.out.println("⠄⠀                                  ⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣴⣶⣶⣶⣶⣶⠶⣶⣤⣤⣀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀                                 ⠀⠀⠀⠀⠀⢀⣤⣾⣿⣿⣿⠁⠀⢀⠈⢿⢀⣀⠀⠹⣿⣿⣿⣦⣄⠀⠀⠀\n" +
                            "⠀⠀                                ⠀⠀⠀⠀⣴⣿⣿⣿⣿⣿⠿⠀⠀⣟⡇⢘⣾⣽⠀⠀⡏⠉⠙⢛⣿⣷⡖⠀\n" +
                            "⠀⠀                                ⠀⠀⠀⣾⣿⣿⡿⠿⠷⠶⠤⠙⠒⠀⠒⢻⣿⣿⡷⠋⠀⠴⠞⠋⠁⢙⣿⣄\n" +
                            "⠀⠀                                ⠀⠀⢸⣿⣿⣯⣤⣤⣤⣤⣤⡄⠀⠀⠀⠀⠉⢹⡄⠀⠀⠀⠛⠛⠋⠉⠹⡇\n" +
                            "⠀⠀                                ⠀⠀⢸⣿⣿⠀⠀⠀⣀⣠⣤⣤⣤⣤⣤⣤⣤⣼⣇⣀⣀⣀⣛⣛⣒⣲⢾⡷\n" +
                            "                               ⢀⠤⠒⠒⢼⣿⣿⠶⠞⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⣼⠃\n" +
                            "                               ⢮⠀⠀⠀⠀⣿⣿⣆⠀⠀⠻⣿⡿⠛⠉⠉⠁⠀⠉⠉⠛⠿⣿⣿⠟⠁⠀⣼⠃⠀\n" +
                            "                               ⠈⠓⠶⣶⣾⣿⣿⣿⣧⡀⠀⠈⠒⢤⣀⣀⡀⠀⠀⣀⣀⡠⠚⠁⠀⢀⡼⠃⠀⠀\n" +
                            "                               ⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣷⣤⣤⣤⣤⣭⣭⣭⣭⣭⣥⣤⣤⣤⣴⣟⠁");
                    System.out.printf("\u001B[31m" + "\n%60s", "┌─────────────────┐");
                    System.out.printf("\u001B[31m" + "\n%60s", "|  T H E   E N D  |");
                    System.out.printf("\u001B[31m" + "\n%61s", "└─────────────────┘\n");
                    System.out.print("\u001B[0m");
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
            }
        }    while (number != 3) ;
    }
}


