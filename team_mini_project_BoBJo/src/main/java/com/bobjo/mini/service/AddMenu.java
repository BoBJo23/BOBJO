package com.bobjo.mini.service;

import com.bobjo.mini.model.dto.Food;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddMenu{



    public void addMenu(Food food) {
        Scanner sc = new Scanner(System.in);
        System.out.println("추가할 메뉴의 카테고리를 입력하세요.");
        System.out.println("1. 한식");
        System.out.println("2. 일식");
        System.out.println("3. 양식");
        System.out.println("4. 중식");
        System.out.print("카테고리: ");

//        try {
//            int categoryForNewMenu = sc.nextInt();
//            System.out.print("추가할 메뉴명을 입력하세요: ");
//            String newMenu = sc.next();
//
//            switch (categoryForNewMenu) {
//                case 1:
//                    food.addKoreanList(newMenu);
//                    System.out.println(newMenu + " 이(가) 추가되었습니다.");
//                    break;
//
//                case 2:
//                    food.addJapaneseList(newMenu);
//                    System.out.println(newMenu + " 이(가) 추가되었습니다.");
//                    break;
//
//                case 3:
//                    food.addWesternList(newMenu);
//                    System.out.println(newMenu + " 이(가) 추가되었습니다.");
//                    break;
//
//                case 4:
//                    food.addChineseList(newMenu);
//                    System.out.println(newMenu + " 이(가) 추가되었습니다.");
//                    break;
//
//                default:
//                    System.out.println("유효하지 않은 카테고리입니다.");
//                    return;
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("숫자를 입력해야 합니다.");
//        }
    }
}