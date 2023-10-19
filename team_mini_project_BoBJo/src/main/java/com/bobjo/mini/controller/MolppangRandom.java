package com.bobjo.mini.controller;
import java.util.Random;
import java.util.Scanner;

public class MolppangRandom {
    public void molppangRandom() {

        Scanner scanner = new Scanner(System.in);
        Random random = new java.util.Random();

        int number = 0;
        String[] people = null;

        do {
            System.out.print("인원 수를 입력하세요: ");

            if (scanner.hasNextInt()) {
                number = scanner.nextInt();

                if (number > 0)
                    scanner.nextLine();
                break;


            } else {
                System.out.println("유효한 숫자를 입력해 주세요.");
                scanner.nextLine();
            }
        } while (true);

        people = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("참여자 #" + (i + 1) + "의 이름을 입력하세요: ");
            people[i] = scanner.nextLine();
        }

        int random2 = random.nextInt(number);
        String winner = people[random2];

        System.out.println("주인공은 " + winner + " 입니다!");
    }
}