//package com.bobjo.mini.service;
//
//import com.bobjo.mini.model.dao.FoodDAO;
//import com.bobjo.mini.model.dto.Food;
//import com.bobjo.mini.view.Option;
//
//import java.sql.Connection;
//import java.util.List;
//import java.util.Scanner;
//
//import static com.bobjo.mini.common.JDBCTemplate.getConnection;
//
//public class NNN {
//    private FoodDAO foodDAO = new FoodDAO();
//    Connection con = getConnection();
//    List<Food> categoryList = foodDAO.category(con);
//
//    public void categoryList (FoodDAO foodDAO) {
//        this.foodDAO = foodDAO;
//
//    }
//    public static void main(String[] args) {
//
//
//
//
//            public void categoryRandom() {
//            Option op = new Option();
//            Scanner sc = new Scanner(System.in);
//            int categoryChoice;
//
////                Connection con = getConnection();
////                List<Food> categoryList = foodDAO.(con);
//                for (Food cate : categoryList) {
//                    System.out.println(cate.getCategoryNum());
//                }
//
//                String Category;
//
//                do {
//
//                    System.out.println("     \u001B[32m┌──────────────┐" + "     \u001B[31m┌──────────────┐" + "     \u001B[33m┌──────────────┐" + "     \u001B[34m┌──────────────┐" + "     \u001B[36m┌────────────────┐");
//                    System.out.println("     \u001B[32m   1.　한  식    " + "     \u001B[31m   2.　일  식    " + "　　  \u001B[33m   3.　양  식    " + "　　　\u001B[34m   4.　중  식    " + "     \u001B[36m   5. 돌 아 가 기    ");
//                    System.out.println("     \u001B[32m└──────────────┘" + "     \u001B[31m└──────────────┘" + "     \u001B[33m└──────────────┘" + "     \u001B[34m└──────────────┘" + "     \u001B[36m└────────────────┘");
//                    System.out.print("\u001B[0m");
//                    System.out.print("     ──────────────────────────────────  위의 카테고리 중 1개를 선택하세요  ────────────────────────────────── ▷" + " ");
//                    System.out.print("");
//
//                    try {
//                        categoryChoice = Integer.parseInt(sc.next());
//                    } catch (NumberFormatException e) {
//                        System.out.println("                               \u001B[31m숫자가 아닌 걸 입력하셨군요 ! 숫자로 다시 입력해 주세요 ! ");
//                        System.out.print("\u001B[0m");
//                        sc.nextLine();
//                        continue;
//                    }
//
////            Random random = new Random();
//                    List<Food> categoryByCodeList = foodDAO.category(con, categoryChoice);
//
////            int randomcate = (int) (Math.random() * categoryByCodeList.size());
//
//                    switch (categoryChoice) {
//
//                        case 1: // 한식
//                            int randomcate = (int) (Math.random() * categoryByCodeList.size());
//                            Food result = categoryByCodeList.get(randomcate);
//                            System.out.println("result = " + result);
//                            break;
//                        case 2: // 일식
//                            int randomcate1 = (int) (Math.random() * categoryByCodeList.size());
//                            Food result1 = categoryByCodeList.get(randomcate1);
//                            System.out.println("result = " + result1);
//                            break;
//
//                        case 3: // 양식
//                            int randomcate2 = (int) (Math.random() * categoryByCodeList.size());
//                            Food result2 = categoryByCodeList.get(randomcate2);
//                            System.out.println("result = " + result2);
//                            break;
//
//                        case 4: // 중식
//                            int randomcate3 = (int) (Math.random() * categoryByCodeList.size());
//                            Food result3 = categoryByCodeList.get(randomcate3);
//                            System.out.println("result = " + result3);
//                            break;
//
//                        case 5: // 돌아가기
//                            return;
//
//                        default:
//                            System.out.println("                                   \u001B[31m※※※※※유효하지 않은 선택입니다.※※※※※");
//                            System.out.println("     \u001B[0m──────────────────────────────────────────  다시 골라주세요 ────────────────────────────────────────── ");
//                    }
//                } while (categoryChoice != 5);
//            }
//        }
////    int number;
////
////    public void next(String st , Food food) {
////
////        System.out.println("\u001B[33m                 ─────────────────────────────  오늘 메뉴는  ─────────────────────────────");
////        System.out.println("\u001B[33m                       ⣿⣿⣿⣿⣿⣿⣿⣿⣿    ⣿⣿⣿⣿⣿⣿⣿⣿⣿     ⣿⣿⣿⣿⣿⣿⣿⣿⣿     ⣿⣿⣿⣿⣿⣿⣿⣿⣿");
////        System.out.println("\u001B[33m                       ⣿                        ⣿     ⣿                         ⣿ ");
////        System.out.println("\u001B[33m                       ⣿⣿⣿⣿⣿⣿⣿⣿⣿                    ⣿⣿⣿⣿⣿⣿⣿⣿⣿                 ");
////        System.out.println("\u001B[33m                                    ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿                  ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿ ");
////        System.out.println("\u001B[33m                      ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿                 ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿                ");
////        System.out.println("\u001B[33m                            ⣿          ⣿                   ⣿          ⣿          ");
////        System.out.println("\u001B[33m                            ⣿          ⣿⣿⣿⣿⣿⣿⣿⣿⣿         ⣿          ⣿⣿⣿⣿⣿⣿⣿⣿⣿");
////        System.out.println("\u001B[33m                 ────────────────────────────────────────────────────────────────────────");
////        System.out.println("\u001B[33m                 ────────────────────────────────────────────────────────────────────────");
////        System.out.println("                              ★★★★★★★★★★★★ " + "( " + st + " )" + " 당첨 ★★★★★★★★★★★★");
////        System.out.println("\u001B[33m                 ────────────────────────────────────────────────────────────────────────");
////        System.out.print("\u001B[0m");
////        System.out.println("");
////        do {
////            System.out.print("\u001B[0m        >" + " 1. 카테고리 다시 뽑기 <  ");
////            System.out.print("         >" + " 2. 메인으로 돌아가기 <   ");
////            System.out.println("        >" + " 3. 프로그램 종료 <  ");
////            System.out.println("");
////            System.out.print("                              \u001B[36m※ 필요한 메뉴가 있으면 위에서 골라주세요 ※ : ");
////            System.out.print("\u001B[0m");
////
////            if (!sc.hasNextInt()) {
////                sc.next();
////                System.out.print("             \u001B[31m───────────────────────────── 올바른 숫자를 입력하세요 ─────────────────────────────");
////                System.out.println("\u001B[0m");
////            } else {
////
////            }
////            int number = sc.nextInt();
////
////            if (number >= 4) {
////                System.out.print("                          \u001B[31m※ 메뉴에서 없는 번호를 선택하였음으로 프로그램 종료합니다 ※");
////                System.out.println("\u001B[0m");
////                System.out.println("⠄⠀                                  ⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣴⣶⣶⣶⣶⣶⠶⣶⣤⣤⣀⠀⠀⠀⠀⠀⠀\n" +
////                        "⠀⠀                                 ⠀⠀⠀⠀⠀⢀⣤⣾⣿⣿⣿⠁⠀⢀⠈⢿⢀⣀⠀⠹⣿⣿⣿⣦⣄⠀⠀⠀\n" +
////                        "⠀⠀                                ⠀⠀⠀⠀⣴⣿⣿⣿⣿⣿⠿⠀⠀⣟⡇⢘⣾⣽⠀⠀⡏⠉⠙⢛⣿⣷⡖⠀\n" +
////                        "⠀⠀                                ⠀⠀⠀⣾⣿⣿⡿⠿⠷⠶⠤⠙⠒⠀⠒⢻⣿⣿⡷⠋⠀⠴⠞⠋⠁⢙⣿⣄\n" +
////                        "⠀⠀                                ⠀⠀⢸⣿⣿⣯⣤⣤⣤⣤⣤⡄⠀⠀⠀⠀⠉⢹⡄⠀⠀⠀⠛⠛⠋⠉⠹⡇\n" +
////                        "⠀⠀                                ⠀⠀⢸⣿⣿⠀⠀⠀⣀⣠⣤⣤⣤⣤⣤⣤⣤⣼⣇⣀⣀⣀⣛⣛⣒⣲⢾⡷\n" +
////                        "                               ⢀⠤⠒⠒⢼⣿⣿⠶⠞⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⣼⠃\n" +
////                        "                               ⢮⠀⠀⠀⠀⣿⣿⣆⠀⠀⠻⣿⡿⠛⠉⠉⠁⠀⠉⠉⠛⠿⣿⣿⠟⠁⠀⣼⠃⠀\n" +
////                        "                               ⠈⠓⠶⣶⣾⣿⣿⣿⣧⡀⠀⠈⠒⢤⣀⣀⡀⠀⠀⣀⣀⡠⠚⠁⠀⢀⡼⠃⠀⠀\n" +
////                        "                               ⠀⠀⠀⠈⢿⣿⣿⣿⣿⣿⣷⣤⣤⣤⣤⣭⣭⣭⣭⣭⣥⣤⣤⣤⣴⣟⠁");
////                System.out.printf("\u001B[31m" + "\n%60s", "┌─────────────────┐");
////                System.out.printf("\u001B[31m" + "\n%60s", "|  T H E   E N D  |");
////                System.out.printf("\u001B[31m" + "\n%61s", "└─────────────────┘\n");
////                System.out.print("\u001B[0m");
////                System.exit(0);
////            }
////            switch (number) {
////                case 1:
////                    categoryRandom();
////                    break;
////                case 2:
////                    op.mainmenu();
////                    break;
////                case 3:
////                    System.exit(0);
////                    break;
////            }
////
////        } while (number == 3 || number == 2);
////    }
////}
//
//
//    }
//}
