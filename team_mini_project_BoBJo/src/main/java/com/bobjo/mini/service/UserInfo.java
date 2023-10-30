package com.bobjo.mini.service;

import com.bobjo.mini.model.dao.UserDAO;

import java.sql.Connection;
import java.util.Scanner;

import static com.bobjo.mini.JDBCTemplate.JDBCTemplate.getConnection;

public class UserInfo  {

    private UserDAO userDAO = new UserDAO();
    public void userInfo(){
        Scanner sc = new Scanner(System.in);
        Connection con = getConnection();

        System.out.println("회원정보입력");

        System.out.print("이름을 입력하세요 : ");
        String name =sc.next();

        System.out.print("성별을 입력하세요 : ");
        String gender = sc.next();

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();

        userDAO.userInfo(con,name,gender,age);


    }
}



