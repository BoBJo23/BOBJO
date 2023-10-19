package com.bobjo.mini.run;


import java.util.Scanner;


public class DutchPay {
    public void Dutch() {


        Scanner sc = new Scanner(System.in);

        System.out.print("인원수를 입력하세요 : ");         //인원수 입력
        int random = sc.nextInt();

        System.out.print("총 금액을 입력하세요 : ");        //총금액 입력
        int money = sc.nextInt();

        int bboom = (int) (money / random);               //금액 나누기

        System.out.println("총 금액 " + money + "원 인원수 " + random + " 명 으로 나눈금액 " + bboom + "원 입니다.");          //나눈 금액 출력

    }
}