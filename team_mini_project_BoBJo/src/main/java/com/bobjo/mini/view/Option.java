package com.bobjo.mini.view;

import com.bobjo.mini.controller.Controller;
import com.bobjo.mini.model.dto.Food;
import com.bobjo.mini.service.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Option {
    private Controller controller = new Controller();


    public void mainmenu() {
        List<Food> foodList = new ArrayList<>();
        int choice;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("\u001B[34m︵‿︵‿︵＼ʕ •ᴥ•ʔ／︵‿︵‿︵\u001B[0m");
            System.out.println("      오늘 뭐 먹지?");
            System.out.println("\u001B[34m︵‿︵‿︵((ฅ)  (ฅ))︵‿︵‿︵\u001B[0m");
            System.out.println("");
            System.out.println(" 1. 전체 메뉴에서 랜덤 뽑기");
            System.out.println(" 2. 카테고리 선택 후 랜덤 메뉴 추천");
            System.out.println(" 3. 메뉴 직접 입력 후 랜덤");
            System.out.println(" 4. 계산할 사람 고르기");
            System.out.println(" 5. 1/N 계산하기");
            System.out.println(" 6. 전체 메뉴 보기");
            System.out.println(" 7. 직접 메뉴 추가하기");
            System.out.println(" 0. 프로그램 종료");
            System.out.println("");
            System.out.print("번호를 입력해 주세요 : ");
            choice = sc.nextInt();

            AllMenu fd = new AllMenu();
            Category cg = new Category();
            MolppangRandom rd = new MolppangRandom();
            Dutchpay dp = new Dutchpay();
            RandomFoodInput rfi = new RandomFoodInput();
            AddMenu am = new AddMenu();

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println("<전체 메뉴에서 랜덤 뽑기>");
                    System.out.println();
                    controller.randomFromAll();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("<카테고리 선택 후 랜덤 메뉴 추천>");
                    controller.category();

                    break;
                case 3:
                    System.out.println();
                    System.out.println("<메뉴 직접 입력 후 랜덤>");
                    rfi.FoodPeaker();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("<계산할 사람 고르기>");
                    rd.molppangRandom();
                    break;
                case 5:
                    System.out.println();
                    System.out.println("<1/N 계산하기>");
                    dp.Dutchpay();
                    break;
                case 6:
                    System.out.println();
                    System.out.println("<전체 메뉴 보기>");
                    controller.allMenu();
                    break;
                case 7:
                    System.out.println();
                    System.out.println("<직접 메뉴 추가하기>");
                    controller.addMenu();
                    break;
                case 0:
                    System.out.println();
                    System.out.println("<프로그램 종료>");
                    return;
                default:
                    System.out.println();
                    System.out.println("\u001B[31m유효하지 않은 선택지입니다. 다시 선택해 주세요.\u001B[0m");
                    break;
            }
        } while (choice != 0);
    }

}