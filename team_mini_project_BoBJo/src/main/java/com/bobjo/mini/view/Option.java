package com.bobjo.mini.view;

import com.bobjo.mini.controller.Controller;
import com.bobjo.mini.model.dto.CategoryDTO;
import com.bobjo.mini.model.dto.Food;
import com.bobjo.mini.service.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Option {
    private Controller controller = new Controller();

    public void mainmenu() {
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\u001B[34m︵‿︵‿︵＼ʕ •ᴥ•ʔ／︵‿︵‿︵\u001B[0m");
            System.out.println("      오늘 뭐 먹지?");
            System.out.println("\u001B[34m︵‿︵‿︵((ฅ)  (ฅ))︵‿︵‿︵\u001B[0m");
            System.out.println("");
            System.out.println(" 1. 전체 메뉴에서 랜덤 뽑기");
            System.out.println(" 2. 카테고리 선택 후 랜덤 메뉴 추천");
            System.out.println(" 3. 메뉴 직접 입력 후 랜덤");
            System.out.println(" 4. 계산할 사람 고르기");
            System.out.println(" 5. 1/N 계산하기");
            System.out.println(" 6. 전체 메뉴 보기");
            System.out.println(" 7. 직접 메뉴 추가하기");
            System.out.println(" 0. 프로그램 종료");
            System.out.println("");
            System.out.print("번호를 입력해 주세요 : ");
            choice = sc.nextInt();

            MolppangRandom rd = new MolppangRandom();
            Dutchpay dp = new Dutchpay();
            RandomFoodInput rfi = new RandomFoodInput();

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println("<전체 메뉴에서 랜덤 뽑기>");
                    System.out.println();
                    controller.randomFromAll();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("<카테고리 선택 후 랜덤 메뉴 추천>");
                    showCategoryList();
                    selectCatoryByMenuList();

                    break;
                case 3:
                    System.out.println();
                    System.out.println("<메뉴 직접 입력 후 랜덤>");
                    rfi.FoodPicker();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("<계산할 사람 고르기>");
                    rd.molppangRandom();
                    break;
                case 5:
                    System.out.println();
                    System.out.println("<1/N 계산하기>");
                    dp.Dutchpay();
                    break;
                case 6:
                    System.out.println();
                    System.out.println("<전체 메뉴 보기>");
                    controller.allMenu();
                    break;
                case 7:
                    System.out.println();
                    System.out.println("<직접 메뉴 추가하기>");
                    controller.addMenu();
                    break;
                case 0:
                    System.out.println();
                    System.out.println("<프로그램 종료>");
                    return;
                default:
                    System.out.println();
                    System.out.println("\u001B[31m유효하지 않은 선택지입니다. 다시 선택해 주세요.\u001B[0m");
                    break;
            }
        } while (choice != 0);
    }

    /**
     * 사용자에게 카테고리목록을 보여주고 선택하기 위한 용도의 메소드
     * */
    private void selectCatoryByMenuList() {
        Scanner sc = new Scanner(System.in);

        int categoryChoice = 0;
        do {

            System.out.println("     \u001B[32m┌──────────────┐" + "     \u001B[31m┌──────────────┐" + "     \u001B[33m┌──────────────┐" + "     \u001B[34m┌──────────────┐" + "     \u001B[36m┌────────────────┐");
            System.out.println("     \u001B[32m   1.　한  식    " + "     \u001B[31m   2.　일  식    " + "　　  \u001B[33m   3.　양  식    " + "　　　\u001B[34m   4.　중  식    " + "     \u001B[36m   5. 돌 아 가 기    ");
            System.out.println("     \u001B[32m└──────────────┘" + "     \u001B[31m└──────────────┘" + "     \u001B[33m└──────────────┘" + "     \u001B[34m└──────────────┘" + "     \u001B[36m└────────────────┘");
            System.out.print("\u001B[0m");
            System.out.print("     ──────────────────────────────────  위의 카테고리 중 1개를 선택하세요  ────────────────────────────────── ▷" + " ");
            System.out.print("");

            try {
                categoryChoice = Integer.parseInt(sc.next());
            } catch (NumberFormatException e) {
                System.out.println("                               \u001B[31m숫자가 아닌 걸 입력하셨군요 ! 숫자로 다시 입력해 주세요 ! ");
                System.out.print("\u001B[0m");
                sc.nextLine();
                continue;
            }

            List<Food> categoryByCodeList = controller.selectMenuByCode(categoryChoice); // 카테고리 코드를 이용한 메뉴
//            System.out.println("========================================");
//            for (Food f : categoryByCodeList) {
//                System.out.println(f);
//            }
//            System.out.println("========================================");
            switch (categoryChoice) {

                case 1: // 한식
                    printResult(categoryByCodeList);
                    break;
                case 2: // 일식
                    printResult(categoryByCodeList);
                    break;

                case 3: // 양식
                    printResult(categoryByCodeList);
                    break;

                case 4: // 중식
                    printResult(categoryByCodeList);
                    break;

                case 5: // 돌아가기
                    return;

                default:
                    System.out.println("                                   \u001B[31m※※※※※유효하지 않은 선택입니다.※※※※※");
                    System.out.println("     \u001B[0m──────────────────────────────────────────  다시 골라주세요 ────────────────────────────────────────── ");
            }
        } while (categoryChoice != 5);
    }

    /**
     * 카테고리 선택 후 랜덤 메뉴 추천 에서
     * 카테고리 리스트 조회용 메소드
     * */
    private void showCategoryList() {
        List<CategoryDTO> categoryList = controller.selectCategoryList();

        for(CategoryDTO f : categoryList) { // 항상된 for문
//            System.out.println("     \u001B[32m┌─────────┐");
            System.out.println("       " + f.getCategoryNum()+ ". " + f.getCategoryName()+"   ");
//            System.out.println("     \u001B[32m└─────────┘");
        }
    }

    private void printResult(List<Food> categoryByCodeList) {

        int randomcate = (int) (Math.random() * categoryByCodeList.size());

        Food result = categoryByCodeList.get(randomcate);

        System.out.println("\u001B[33m                 ─────────────────────────────  오늘 메뉴는  ─────────────────────────────");
        System.out.println("\u001B[33m                       ⣿⣿⣿⣿⣿⣿⣿⣿⣿    ⣿⣿⣿⣿⣿⣿⣿⣿⣿     ⣿⣿⣿⣿⣿⣿⣿⣿⣿     ⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("\u001B[33m                       ⣿                        ⣿     ⣿                          ⣿ ");
        System.out.println("\u001B[33m                       ⣿⣿⣿⣿⣿⣿⣿⣿⣿                    ⣿⣿⣿⣿⣿⣿⣿⣿⣿                 ");
        System.out.println("\u001B[33m                                    ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿                  ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿ ");
        System.out.println("\u001B[33m                      ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿                 ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿                ");
        System.out.println("\u001B[33m                            ⣿          ⣿                   ⣿           ⣿          ");
        System.out.println("\u001B[33m                            ⣿          ⣿⣿⣿⣿⣿⣿⣿⣿⣿         ⣿           ⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("\u001B[33m                 ────────────────────────────────────────────────────────────────────────");
        System.out.println("\u001B[33m                 ────────────────────────────────────────────────────────────────────────");
        System.out.println("                              ★★★★★★★★★★★★ " + "( " + result.getMenuName() + " )" + " 당첨 ★★★★★★★★★★★★");
        System.out.println("\u001B[33m                 ────────────────────────────────────────────────────────────────────────");
        System.out.print("\u001B[0m");

        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.print("\u001B[0m        >" + " 1. 카테고리 다시 뽑기 <  ");
            System.out.print("         >" + " 2. 메인으로 돌아가기 <   ");
            System.out.println("        >" + " 3. 프로그램 종료 <  ");
            System.out.println("");
            System.out.print("                              \u001B[36m※ 필요한 메뉴가 있으면 위에서 골라주세요 ※ : ");
            System.out.print("\u001B[0m");

            if (!sc.hasNextInt()) {
                sc.next();
                System.out.print("             \u001B[31m───────────────────────────── 올바른 숫자를 입력하세요 ─────────────────────────────");
                System.out.println("\u001B[0m");
            } else {
            }
            number = sc.nextInt();

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
                    showCategoryList();
                    break;
                case 2:
                    mainmenu();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        } while (number == 3 || number == 2);
    }
}