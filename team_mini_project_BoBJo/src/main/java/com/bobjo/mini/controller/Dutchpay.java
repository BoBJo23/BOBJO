package com.bobjo.mini.controller;

import java.util.Scanner;

public class Dutchpay {
    public void Dutchpay() {

        int people = 0;
        int money = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("인원수를 입력하세요 : ");
            if (sc.hasNextInt()) {
                people = sc.nextInt();

                if (people > 0) {
                    sc.nextLine();
                }
                break;
            } else {
                System.out.println("유효한 숫자를 입력해 주세요.");
                sc.nextLine();
            }

        } while (true);

        do {
            System.out.print("총 금액을 입력하세요 : ");
            if (sc.hasNextInt()) {
                money = sc.nextInt();

                if (money >= 0) {
                    int bboom = (money / people);
                    System.out.println("총 인원 " + people + "명 금액 " + money + " 으로 나눈금액 " + bboom + "원 입니다.");
                }
                break;
                } else {
                    System.out.println("유효한 숫자를 입력해 주세요.");
                    sc.nextLine();
                }
            }while (true) ;
        }
    }

