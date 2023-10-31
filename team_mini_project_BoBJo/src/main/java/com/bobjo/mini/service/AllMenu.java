package com.bobjo.mini.service;



import com.bobjo.mini.model.dao.FoodDAO;
import com.bobjo.mini.model.dto.Food;

import java.sql.Connection;
import java.util.List;

import static com.bobjo.mini.common.JDBCTemplate.close;
import static com.bobjo.mini.common.JDBCTemplate.getConnection;


public class AllMenu {

    private FoodDAO foodDAO = new FoodDAO();

    public void viewAllmenu() {
        Connection con = getConnection();


        List<Food> foodList = foodDAO.selectAllMenu(con);
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;


        System.out.println("======================= 한식 =========================");
        for (Food fd : foodList) {
            if (fd.getCategoryNum() == 1) {
                System.out.print(fd.getMenuName() + " ");
                count1++;
                if (count1 % 5 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("======================= 일식 =========================");
        for (Food fd : foodList) {
            if (fd.getCategoryNum() == 2) {
                System.out.print(fd.getMenuName() + " ");
                count2++;
                if (count2 % 5 == 0) {
                    System.out.println();
                }

            }
        }
            System.out.println();
            System.out.println("======================= 중식 =========================");
            for (Food fd : foodList) {

                if (fd.getCategoryNum() == 3) {
                    System.out.print(fd.getMenuName() + " ");
                    count3++;
                    if (count3 % 5 == 0) {
                        System.out.println();
                    }
                }
            }
                System.out.println();
                System.out.println("======================= 양식 =========================");
                for (Food fd : foodList) {

                    if (fd.getCategoryNum() == 4) {
                        System.out.print(fd.getMenuName() + " ");
                        count4++;
                        if (count4 % 5 == 0) {
                            System.out.println();
                        }
                    }




                }
        System.out.println("");
        close(con);
    }
}




