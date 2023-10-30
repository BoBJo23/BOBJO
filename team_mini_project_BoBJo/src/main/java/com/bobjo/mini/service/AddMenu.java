package com.bobjo.mini.service;

import com.bobjo.mini.model.dao.FoodDAO;
import com.bobjo.mini.model.dto.Food;

import java.sql.Connection;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static com.bobjo.mini.common.JDBCTemplate.getConnection;

public class AddMenu{


    private FoodDAO foodDAO = new FoodDAO();
    public void addMenu() {


        Scanner sc = new Scanner(System.in);


        try {
        Connection con = getConnection();

        System.out.println("추가할 메뉴의 카테고리를 입력하세요.");
        System.out.println("1. 한식");
        System.out.println("2. 일식");
        System.out.println("3. 양식");
        System.out.println("4. 중식");
        System.out.print("카테고리: ");
            int categoryForNewMenu = sc.nextInt();
            System.out.print("추가할 메뉴명을 입력하세요: ");
            String newMenu = sc.next();
        foodDAO.addMenu(con, newMenu, categoryForNewMenu);

            switch (categoryForNewMenu) {
                case 1:

                    System.out.println(newMenu + " 이(가) 추가되었습니다.");
                    break;

                case 2:

                    System.out.println(newMenu + " 이(가) 추가되었습니다.");
                    break;

                case 3:

                    System.out.println(newMenu + " 이(가) 추가되었습니다.");
                    break;

                case 4:

                    System.out.println(newMenu + " 이(가) 추가되었습니다.");
                    break;

                default:
                    System.out.println("유효하지 않은 카테고리입니다.");
                    return;
            }
        } catch (InputMismatchException e) {
            System.out.println("숫자를 입력해야 합니다.");
        }
    }
}