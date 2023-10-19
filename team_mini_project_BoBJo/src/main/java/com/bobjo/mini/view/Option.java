package com.bobjo.mini.view;

import com.bobjo.mini.controller.Category;
import com.bobjo.mini.controller.FoodData;

import java.util.Scanner;

public class Option {

    Scanner sc = new Scanner(System.in);
    public void mainmenu() {

        int choice;
        do {
            System.out.println("=========================================================");
            System.out.println("||                                          　　　　　　　||");
            System.out.println("||            ㅇ  ㄴ   ㅁ          　            　　 　  ||");
            System.out.println("||            ㅗ  ㅡ   ㅜ ㅓ   ㅁ ㅓ   ㅈ ㅣ ?　　         ||");
            System.out.println("||　 　　　　       ㄹ            ㄱ 　   　        　     ||");
            System.out.println("||                                　　                  ||");
            System.out.println("||    　 　　    1. 올랜덤 메뉴 추천　　                    ||");
            System.out.println("||              2. 카테고리 선택 후 랜덤 메뉴 추천 　     　 ||");
            System.out.println("||              3. 원하는 메뉴 직접 입력 후 랜덤! 　        ||");
            System.out.println("||              4. 한명 몰빵!           　  　           ||");
            System.out.println("||              5. 더치페이!             　 　           ||");
            System.out.println("||              6. 전체 메뉴 보기           　 　         ||");
            System.out.println("||              0. 프로그램 종료            　 　         ||");
            System.out.println("||    () ()                                  () ()  　　||");
            System.out.println("||    ('.')                                  ('.') 　　 ||");
            System.out.println("=========================================================");
            System.out.print("번호를 입력해 주세요 : ");
            choice = sc.nextInt();

            FoodData fd = new FoodData();
            Category cg = new Category();


            switch (choice){
                case 1 :
                    System.out.println("전체 메뉴중 랜덤으로 돌린다!");

                    break;
                case 2 :
                    System.out.println("한식, 일식, 양식, 중식 중에 골라봐~");
                    cg.categoryRandom();
                    break;
                case 3 :
                    System.out.println("너가 원하는 음식들을 적어봐 내가 골라줄게!");

                    break;
                case 4 :
                    System.out.println("한명한테 몰빵 !!! 과연 누구!!!?");

                    break;
                case 5 :
                    System.out.println("무조건 더치페이지~");

                    break;
                case 6 :
                    System.out.println("전체 메뉴");
                    fd.viewOfAllMenu();
                    break;
                case 0 :
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("메뉴 똑바로 골라;;");
            }

        }while(choice != 0);
    }
}
