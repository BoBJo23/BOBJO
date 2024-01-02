package com.bobjo.mini.view;

import com.bobjo.mini.controller.MenuController;
import com.bobjo.mini.service.Dutchpay;
import com.bobjo.mini.service.MolppangRandom;
import com.bobjo.mini.service.RandomFoodInput;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MenuController menuController = new MenuController();

        do {
            System.out.println("\u001B[34m︵‿︵‿︵＼ʕ •ᴥ•ʔ／︵‿︵‿︵\u001B[0m");
            System.out.println("      오늘 뭐 먹지?");
            System.out.println("\u001B[34m︵‿︵‿︵((ฅ)  (ฅ))︵‿︵‿︵\u001B[0m");
            System.out.println("");
            System.out.println("1. 메뉴 전체 조회");
            System.out.println("2. 전체 메뉴에서 랜덤 뽑기 ");
            System.out.println("3. 신규 메뉴 추가");
            System.out.println("4. 계산할 사람 고르기");
            System.out.println("5. 1/N 계산하기");
            System.out.println("6. 메뉴 직접 입력 후 랜덤");
            System.out.println("0. 프로그램 종료");
            System.out.print("메뉴 관리 번호를 입력하세요 : ");
            int no = sc.nextInt();

            MolppangRandom rd = new MolppangRandom();
            Dutchpay dp = new Dutchpay();
            RandomFoodInput rfi = new RandomFoodInput();

            switch (no) {
                case 1 : menuController.selectAllMenu(); break;
                case 2 : menuController.getRandomMenu(); break;
                case 3 : menuController.registMenu(inputMenu());  break;
                case 4 : rd.molppangRandom(); break;
                case 5 : dp.Dutchpay(); break;
                case 6 : rfi.FoodPicker(); break;
                case 0 : return;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다."); break;
            }
        } while (true);

    }


    private static Map<String, String> inputMenu() {

        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 이름을 입력하세요 : ");
        String menuName = sc.nextLine();
        System.out.print("카테고리 코드를 입력하세요(1번 한식, 2번 일식, 3번 양식, 4번 중식) : ");
        String categoryNum = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("menuName", menuName);
        parameter.put("categoryNum", categoryNum);

        return parameter;
    }


}










