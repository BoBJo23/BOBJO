package com.bobjo.mini.service;

import com.bobjo.mini.model.dao.FoodDAO;
import com.bobjo.mini.model.dto.Food;

import java.sql.Connection;
import java.util.*;


import static com.bobjo.mini.common.JDBCTemplate.getConnection;

public class RandomFromAll {
    private FoodDAO foodDAO = new FoodDAO();
    public void randomFromAll() {
        Connection con = getConnection();

        List<Food> foodList = foodDAO.selectAllMenu(con);

        //랜덤
        int answer;
        Set<Integer> previous = new HashSet<>();
        do {
            Random randomFromAll = new Random();
            int randomIndex;
            do{
                randomIndex = randomFromAll.nextInt(foodList.size());
            } while (previous.contains(randomIndex));  // 중복이면 다시 뽑게하기

            previous.add(randomIndex); // 이전에 뽑은 목록 저장

            System.out.println("♡ " + foodList.get(randomIndex).getMenuName() + " ♡");
            System.out.println("");
            System.out.println("'1' 입력 : 이 메뉴로 결정하기");
            System.out.println("'2' 입력 : 메뉴 새로 뽑기");
            System.out.println();
            Scanner sc = new Scanner(System.in);
            System.out.print("입력 : ");
            answer = sc.nextInt();


        } while (answer == 2);

        //이걸로 결정할 건지 다시 뽑을 건지

    }
}
