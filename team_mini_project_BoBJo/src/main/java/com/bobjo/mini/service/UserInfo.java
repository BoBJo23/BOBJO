package com.bobjo.mini.service;

import com.bobjo.mini.model.dao.UserDAO;

import java.sql.Connection;
import java.util.Scanner;

import static com.bobjo.mini.common.JDBCTemplate.getConnection;

public class UserInfo  {

    private UserDAO userDAO = new UserDAO();
    public void userInfo(){
        Scanner sc = new Scanner(System.in);
        Connection con = getConnection();

        System.out.println(" ");
        System.out.println("\u001B[32m     ┌------------┐\u001B[0m");
        System.out.println("       유저정보입력  ");
        System.out.println("\u001B[32m     └------------┘\u001B[0m");

        System.out.println(" ");
        System.out.print("이름을 입력하세요 : ");
        String name =sc.next();

        System.out.println(" ");

        System.out.print("성별을 입력하세요 : ");
        String gender = sc.next();
        System.out.println(" ");

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println(" ");
        System.out.println(" ");

        userDAO.userInfo(con,name,gender,age);


    }
}



