//package com.bobjo.mini.service;
//
//import com.bobjo.mini.model.dao.FoodDAO;
//import com.bobjo.mini.model.dto.Food;
//import com.bobjo.mini.view.Option;
//import com.mysql.cj.x.protobuf.MysqlxSql;
//import com.sun.source.tree.NewArrayTree;
//
//import java.sql.Connection;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//import java.util.Scanner;
//
//import static com.bobjo.mini.common.JDBCTemplate.close;
//import static com.bobjo.mini.common.JDBCTemplate.getConnection;
//
//public class Category {
//    private FoodDAO foodDAO = new FoodDAO();
//
//
//    Option op = new Option();
//    Scanner sc = new Scanner(System.in);
//    int categoryChoice;
//
//    public void categoryRandom() {
//
//        Connection con = getConnection();
//        List<Food> categoryList = foodDAO.category(con);
//        for (Food cate : categoryList) {
//            System.out.println(cate.getCategoryNum());
//        }
//
//        String Category;
//
//        do {
//
//            System.out.println("     \u001B[32m┌──────────────┐" + "     \u001B[31m┌──────────────┐" + "     \u001B[33m┌──────────────┐" + "     \u001B[34m┌──────────────┐" + "     \u001B[36m┌────────────────┐");
//            System.out.println("     \u001B[32m   1.　한  식    " + "     \u001B[31m   2.　일  식    " + "　　  \u001B[33m   3.　양  식    " + "　　　\u001B[34m   4.　중  식    " + "     \u001B[36m   5. 돌 아 가 기    ");
//            System.out.println("     \u001B[32m└──────────────┘" + "     \u001B[31m└──────────────┘" + "     \u001B[33m└──────────────┘" + "     \u001B[34m└──────────────┘" + "     \u001B[36m└────────────────┘");
//            System.out.print("\u001B[0m");
//            System.out.print("     ──────────────────────────────────  위의 카테고리 중 1개를 선택하세요  ────────────────────────────────── ▷" + " ");
//            System.out.print("");
//
//            try {
//                categoryChoice = Integer.parseInt(sc.next());
//            } catch (NumberFormatException e) {
//                System.out.println("                               \u001B[31m숫자가 아닌 걸 입력하셨군요 ! 숫자로 다시 입력해 주세요 ! ");
//                System.out.print("\u001B[0m");
//                sc.nextLine();
//                continue;
//            }
//            Food food = new Food();
//            Random random = new Random();
//
//
//        switch (categoryChoice) {
//
//            case 1: // 한식
//                int randomIndexKorean = random.nextInt(categoryList.size());
//                Category = String.valueOf(categoryList.get(randomIndexKorean).getCategoryNum());
//                next(Category, food);
//                break;
////                    if (categoryChoice == 1) {
////                        int randomIndexKorean = random.nextInt();
////                        System.out.println(randomIndexKorean);
////                    }
////                    break;
////                    food.getCategoryNum();
//
//////                    Category = food.getCategoryNum();
////                    categoryList(categoryList);
////                next(Category, food);
////                    break;
////                case 2: // 일식
////                    int randomIndexJapanese = random.nextInt(food.getJapaneseList().size());
////                    Category = food.getJapaneseList().get(randomIndexJapanese);
////                    next(Category, food);
////                    break;
////                case 3: // 양식
////                    int randomIndexWestern = random.nextInt(food.getWesternList().size());
////                    Category = food.getWesternList().get(randomIndexWestern);
////                    next(Category, food);
////                    break;
////                case 4: // 중식
////                    int randomIndexChinese = random.nextInt(food.getChineseList().size());
////                    Category = food.getChineseList().get(randomIndexChinese);
////                    next(Category, food);
////                    break;
//            case 5: // 돌아가기
//                return;
//
//            default:
//                System.out.println("                                   \u001B[31m※※※※※유효하지 않은 선택입니다.※※※※※");
//                System.out.println("     \u001B[0m──────────────────────────────────────────  다시 골라주세요 ────────────────────────────────────────── ");
//        }
//        while (categoryChoice != 5) ;
////    }
////}
////        System.out.println(" 1부터 5 까지의 숫자를 입력하세요.");
//
//
//
//
//
//
//
////    public void categoryList (List<Food> categoryList) {
////        Food food = new Food();
////        if (categoryList.ge = 1) {
////            return;
////        }
////        ;
////    }
//    int number;
//
//    public void next(String st , Food food) {
//
//        System.out.println("\u001B[33m                 ─────────────────────────────  오늘 메뉴는  ─────────────────────────────");
//        System.out.println("\u001B[33m                       ⣿⣿⣿⣿⣿⣿⣿⣿⣿    ⣿⣿⣿⣿⣿⣿⣿⣿⣿     ⣿⣿⣿⣿⣿⣿⣿⣿⣿     ⣿⣿⣿⣿⣿⣿⣿⣿⣿");
//        System.out.println("\u001B[33m                       ⣿                        ⣿     ⣿                         ⣿ ");
//        System.out.println("\u001B[33m                       ⣿⣿⣿⣿⣿⣿⣿⣿⣿                    ⣿⣿⣿⣿⣿⣿⣿⣿⣿                 ");
//        System.out.println("\u001B[33m                                    ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿                  ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿ ");
//        System.out.println("\u001B[33m                      ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿                 ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿                ");
//        System.out.println("\u001B[33m                            ⣿          ⣿                   ⣿          ⣿          ");
//        System.out.println("\u001B[33m                            ⣿          ⣿⣿⣿⣿⣿⣿⣿⣿⣿         ⣿          ⣿⣿⣿⣿⣿⣿⣿⣿⣿");
//        System.out.println("\u001B[33m                 ────────────────────────────────────────────────────────────────────────");
//        System.out.println("\u001B[33m                 ────────────────────────────────────────────────────────────────────────");
//        System.out.println("                              ★★★★★★★★★★★★ " + "( " + st + " )" + " 당첨 ★★★★★★★★★★★★");
//        System.out.println("\u001B[33m                 ────────────────────────────────────────────────────────────────────────");
//        System.out.print("\u001B[0m");
//        System.out.println("");
//        do {
//            System.out.print("\u001B[0m        >" + " 1. 카테고리 다시 뽑기 <  ");
//            System.out.print("         >" + " 2. 메인으로 돌아가기 <   ");
//            System.out.println("        >" + " 3. 프로그램 종료 <  ");
//            System.out.print("                              \u001B[36m※ 필요한 메뉴가 있으면 위에서 골라주세요 ※ : ");
//            System.out.print("\u001B[0m");
//            int number = sc.nextInt();
//
//            if (number >= 4) {
//                System.out.print("                          \u001B[31m※ 메뉴에서 없는 번호를 선택하였음으로 프로그램 종료합니다 ※");
//                System.out.println("\u001B[0m");
//                System.out.println("⠄⠀                                  ⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣴⣶⣶⣶⣶⣶⠶⣶⣤⣤⣀⠀⠀⠀⠀⠀⠀\n" +
//                        "⠀⠀                                 ⠀⠀⠀⠀⠀⢀⣤⣾⣿⣿⣿⠁⠀⢀⠈⢿⢀⣀⠀⠹⣿⣿⣿⣦⣄⠀⠀⠀\n" +
//                        "⠀⠀                                ⠀⠀⠀⠀⣴⣿⣿⣿⣿⣿⠿⠀⠀⣟⡇⢘⣾⣽⠀⠀⡏⠉⠙⢛⣿⣷⡖⠀\n" +
//                        "⠀⠀                                ⠀⠀⠀⣾⣿⣿⡿⠿⠷⠶⠤⠙⠒⠀⠒⢻⣿⣿⡷⠋⠀⠴⠞⠋⠁⢙⣿⣄\n" +
//                        "⠀⠀                                ⠀⠀⢸⣿⣿⣯⣤⣤⣤⣤⣤⡄⠀⠀⠀⠀⠉⢹⡄⠀⠀⠀⠛⠛⠋⠉⠹⡇\n" +
//                        "⠀⠀                                ⠀⠀⢸⣿⣿⠀⠀⠀⣀⣠⣤⣤⣤⣤⣤⣤⣤⣼⣇⣀⣀⣀⣛⣛⣒⣲⢾⡷\n" +
//                        "                               ⢀⠤⠒⠒⢼⣿⣿⠶⠞⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⣼⠃\n" +
//                        "                               ⢮⠀⠀⠀⠀⣿⣿⣆⠀⠀⠻⣿⡿⠛⠉⠉⠁⠀⠉⠉⠛⠿⣿⣿⠟⠁⠀⣼⠃⠀\n" +
//                        "                               ⠈⠓⠶⣶⣾⣿⣿⣿⣧⡀⠀⠈⠒⢤⣀⣀⡀⠀⠀⣀⣀⡠⠚⠁⠀⢀⡼⠃⠀⠀\n" +
//                        "                               ⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣷⣤⣤⣤⣤⣭⣭⣭⣭⣭⣥⣤⣤⣤⣴⣟⠁");
//                System.out.printf("\u001B[31m" + "\n%60s", "┌─────────────────┐");
//                System.out.printf("\u001B[31m" + "\n%60s", "|  T H E   E N D  |");
//                System.out.printf("\u001B[31m" + "\n%61s", "└─────────────────┘\n");
//                System.out.print("\u001B[0m");
//                System.exit(0);
//            }
//            switch (number) {
//                case 1:
//                    categoryRandom();
//                    break;
//                case 2:
//                    op.mainmenu();
//                    break;
//                case 3:
//                    System.exit(0);
//                    break;
//            }
//
//        } while (number == 3 || number == 2);
//    }
//}
