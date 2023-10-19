package com.bobjo.mini.controller;

import com.bobjo.mini.view.Option;

import java.util.Random;
import java.util.Scanner;

public class Category {
    FoodData fd = new FoodData();
    Option op = new Option();

    Scanner sc = new Scanner(System.in);
    int categoryChoice;
    public void categoryRandom() {

        // 카테고리 중 하나를 입력하세요
        // 입력한 카테고리 숫자 중 랜덤으로 돌리기
        String Category ;
//        String[] koreanMenu = {"비빔밥", "불고기", "김치찌개", "된장찌개", "순두부찌개", "떡볶이", "닭갈비", "치킨", "육개장", "돌솥비빔밥", "삼겹살", "갈비", "국밥", "뼈해장국", "철판볶음밥", "보쌈", "낙지볶음밥", "오므라이스", "국수"};
//        String[] japaneseMenu = {"스시", "라멘", "돈까스", "우동", "회", "알밥", "야키토리(닭꼬치구이)", "돈까스", "오코노미야끼", "타코야끼", "교자", "야키니쿠", "샤브샤브", "밀푀유나베", "오니기리", "돈부리"};
//        String[] westernMenu = {"치킨 키예프", "피자", "소고기 스테이크", "파스타", "햄버거", "봉골레 스파게티", "랍스터 비스크", " 피쉬 앤 칩스", "비프 타코", "바베큐", "치킨 마살라", "에그 베네딕트"};
//        String[] chineseMenu = {"짜장면", "짬뽕", "탕수육", "양장피", "마파두부", "홍샤오로우", "회이궈로우", "볶음밥", "마라탕", "마라샹궈", "꿔바로우", "지삼선", "꽁바오지띵", "춘권", "꽃빵", "교자", "차오미엔",};
//
        do {
            System.out.println("\u001B[32m ┌---------┐");
            System.out.println("\u001B[32m〈" + "\u001B[32m 1. 한 식 │ ");
            System.out.println("\u001B[32m └---------┘");
            System.out.println("\u001B[31m ┌---------┐");
            System.out.println("\u001B[31m〈" + "\u001B[31m 2. 일 식 │ ");
            System.out.println("\u001B[31m └---------┘");
            System.out.println("\u001B[33m ┌---------┐");
            System.out.println("\u001B[33m〈" + "\u001B[33m 3. 양 식 │ ");
            System.out.println("\u001B[33m └---------┘");
            System.out.println("\u001B[34m ┌---------┐");
            System.out.println("\u001B[34m〈" + "\u001B[34m 4. 중 식 │ ");
            System.out.println("\u001B[34m └---------┘");
            System.out.println("\u001B[36m ┌------------┐");
            System.out.println("\u001B[36m〈" + "\u001B[36m 5. 돌아가기  │ ");
            System.out.println("\u001B[36m └------------┘");
//        System.out.println("\u001B[32m 1. 한식");
//        System.out.println("\u001B[31m 2. 일식");
//        System.out.println("\u001B[33m 3. 양식");
//        System.out.println("\u001B[34m 4. 중식");
            System.out.print("\u001B[0m");
            System.out.print("☆☆ 위의 카테고리 중 1개를 선택하세요 ☆☆ --- ▷" + " ");
            System.out.print("");
            System.out.print("");


            int categoryChoice = sc.nextInt();
            Random random = new Random();
            fd.foodlist();
            switch (categoryChoice) {
                case 1: // 한식
                    int randomIndexKorean = random.nextInt(fd.koreanList.size());
                    Category = fd.koreanList.get(randomIndexKorean);
                    next(Category);
                    break;
                case 2: // 일식
                    int randomIndexJapanese = random.nextInt(fd.japaneseList.size());
                    Category = fd.japaneseList.get(randomIndexJapanese);
                    next(Category);
                    break;
                case 3: // 양식
                    int randomIndexWestern = random.nextInt(fd.westernList.size());
                    Category = fd.westernList.get(randomIndexWestern);
                    next(Category);
                    break;
                case 4: // 중식
                    int randomIndexChinese = random.nextInt(fd.chineseList.size());
                    Category = fd.chineseList.get(randomIndexChinese);
                    next(Category);
                    break;
                case 5: // 돌아가기
                    return;

                default:
                    System.out.println("\u001B[31m※※※※유효하지 않는 선택입니다.※※※※");
                    System.out.println("\u001B[0m☆☆ 다시 골라주세요 ☆☆ --- ▷");
            }
        } while (categoryChoice != 5);
    }
    public void next(String st) {
        System.out.println("                                  오늘 메뉴는 !!!");
        System.out.println("");
        System.out.println(" =============     ==============       =============     ============== ");
        System.out.println(" ∥                              ∥      ∥                               ∥ ");
        System.out.println(" ∥                              ∥      ∥                               ∥ ");
        System.out.println(" =============                          =============                     ");
        System.out.println("                 ==================                     ================== ");
        System.out.println("===============                        ===============                     ");
        System.out.println("       ∥            ∥                         ∥            ∥               ");
        System.out.println("       ∥            ∥                         ∥            ∥               ");
        System.out.println("       ∥            =============             ∥            =============  ");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("       ★★★★★★★★★★★★ " + "( " + st + " )" + " 당첨 ★★★★★★★★★★★★");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        op.mainmenu();
    }
}

