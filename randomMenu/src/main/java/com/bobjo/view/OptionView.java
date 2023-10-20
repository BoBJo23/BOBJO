package com.bobjo.view;

import com.bobjo.controller.MenuData;

import java.util.Scanner;

public class OptionView {
    Scanner sc = new Scanner(System.in);
    public void mainmenu() {

        int choice;
        do {
            System.out.print("번호를 입력해 주세요 : ");
            choice = sc.nextInt();

            MenuData md = new MenuData();

            switch (choice){
                case 1 :
                    System.out.println("전체 메뉴중 랜덤으로 돌린다!");

                    break;
                case 2 :
                    System.out.println("한식, 일식, 양식, 중식 중에 골라봐~");

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
