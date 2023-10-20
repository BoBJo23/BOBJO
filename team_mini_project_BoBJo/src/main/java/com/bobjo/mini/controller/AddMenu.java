package com.bobjo.mini.controller;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddMenu {

    public void addMenu() {
        FoodData fd = new FoodData();
        fd.foodlist();
        Scanner sc = new Scanner(System.in);
        System.out.println("추가할 메뉴의 카테고리를 입력하세요.");
        System.out.println("");
        System.out.println("1. 한식");
        System.out.println("2. 일식");
        System.out.println("3. 양식");
        System.out.println("4. 중식");
        System.out.println("");
        System.out.print("카테고리 : ");
        int categoryForNewMenu = sc.nextInt();
        System.out.print("추가할 메뉴명을 입력하세요 : ");
        String newMenu = sc.next();

            switch (categoryForNewMenu) {
                case 1:
                    fd.koreanList.add(newMenu);
                    System.out.println(newMenu + " 이(가) 추가되었습니다.");
                    return;

                case 2:
                    fd.chineseList.add(newMenu);
                    System.out.println(newMenu + " 이(가) 추가되었습니다.");
                    return;

                case 3:
                    fd.japaneseList.add(newMenu);
                    System.out.println(newMenu + " 이(가) 추가되었습니다.");
                    return;

                case 4:
                    fd.westernList.add(newMenu);
                    System.out.println(newMenu + " 이(가) 추가되었습니다.");
                    return;
            }
    }

}
