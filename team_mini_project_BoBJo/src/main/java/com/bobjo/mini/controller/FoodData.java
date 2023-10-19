package com.bobjo.mini.controller;



import java.util.ArrayList;
import java.util.List;


public class FoodData {
    List<String> koreanList = new ArrayList<>();
    List<String> chineseList = new ArrayList<>();
    List<String> japaneseList = new ArrayList<>();
    List<String> westernList = new ArrayList<>();


    public void foodlist(){
        List<String> koreanToAdd = List.of("비빔밥", "불고기", "김치찌개", "된장찌개", "순두부찌개", "떡볶이", "닭갈비", "치킨", "육개장", "돌곹비빔밥", "삼겹살", "갈비", "순대국밥", "고기국밥", "뼈해장국", "철판볶음밥", "보쌈", "낙지볶음밥", "오므라이스", "국수");
        List<String> chineseToAdd = List.of("짜장면", "짬봉", "탕수육", "양장피", "마파두부", "홍샤오로우", "회이궈로우", "볶음밥", "마라탕", "마라샹궈", "꿔바로우", "지삼선", "꽁바오지띵", "춘권", "꽃빵", "교자", "차오미엔");
        List<String> japaneseToAdd = List.of("스시", "라멘", "돈까스", "우동", "회", "알밥", "야키토리(닭꼬치구이)", "돈까스", "오코노미야끼", "타코야끼", "교자", "야키니쿠", "샤브샤브", "밀푀유나베", "오니기리", "돈부리");
        List<String> westernToAdd = List.of("치킨 키예프", "피자", "소고기 스테이크", "파스타", "햄버거", "봉골레 스파게티", "랍스터 비스크", " 피쉬 앤 칩스", "비프 타코", "바베큐", "치킨 마살라", "에그 베네딕트");

        koreanList.addAll(koreanToAdd);
        chineseList.addAll(chineseToAdd);
        japaneseList.addAll(japaneseToAdd);
        westernList.addAll(westernToAdd);

    }


    public void viewOfAllMenu() {
        foodlist();
        // 다시 할거에여!!!!
        System.out.println(koreanList);
        System.out.println(chineseList);
        System.out.println(japaneseList);
        System.out.println(westernList);
    }


}



