package com.bobjo.mini.service;

import com.bobjo.mini.model.dao.FoodDAO;
import com.bobjo.mini.model.dto.CategoryDTO;
import com.bobjo.mini.model.dto.Food;
import com.bobjo.mini.view.Option;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

import static com.bobjo.mini.common.JDBCTemplate.close;
import static com.bobjo.mini.common.JDBCTemplate.getConnection;

public class CategoryService {
    private FoodDAO foodDAO = new FoodDAO();

    Scanner sc = new Scanner(System.in);
    int categoryChoice;

    public void categoryRandom() {


    }

    public List<CategoryDTO> selectCategoryList() {

        Connection con = getConnection();

        List<CategoryDTO> categoryList = foodDAO.selectCategoryList(con);

        close(con);

        return categoryList;
    }

    public List<Food> selectMenuByCode(int code) {

        Connection con = getConnection();

        List<Food> foodList = foodDAO.selectMenuByCode(con, code);

        close(con);

        return foodList;
    }
}
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
//            System.out.println("");
//            System.out.print("                              \u001B[36m※ 필요한 메뉴가 있으면 위에서 골라주세요 ※ : ");
//            System.out.print("\u001B[0m");
//
//            if (!sc.hasNextInt()) {
//                sc.next();
//                System.out.print("             \u001B[31m───────────────────────────── 올바른 숫자를 입력하세요 ─────────────────────────────");
//                System.out.println("\u001B[0m");
//            } else {
//
//            }
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
