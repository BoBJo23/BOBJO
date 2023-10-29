package com.bobjo.mini.model.service;

import com.bobjo.mini.model.dao.FoodDAO;
import com.bobjo.mini.model.dto.Food;

import java.sql.Connection;
import java.util.Scanner;

import static com.bobjo.mini.common.JDBCTemplate.getConnection;

public class MenuService {

    public void registNewMenu(){
        Scanner sc = new Scanner(System.in);

        Connection con = getConnection();

        FoodDAO foodDAO = new FoodDAO();

        Food food = new Food();

        System.out.print("메뉴 이름을 등록하세요 : ");
        String menuname = sc.nextLine();
        System.out.println("1. 한식  2. 일식  3. 중식  4.양식");
        System.out.print("카테고리 번호를 선택해주세요 : ");
        int categoryNum = sc.nextInt();


    }
}
