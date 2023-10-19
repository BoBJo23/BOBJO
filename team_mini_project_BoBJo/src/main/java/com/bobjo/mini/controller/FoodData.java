package com.bobjo.mini.controller;



import java.util.ArrayList;
import java.util.List;


public class FoodData {
    List<String> koreanList = new ArrayList<>();
    List<String> chineseList = new ArrayList<>();
    List<String> japaneseList = new ArrayList<>();
    List<String> westernList = new ArrayList<>();


    public void foodlist(){
        List<String> koreanToAdd = List.of("비빔밥", "김밥","육회","불고기", "김치찌개", "된장찌개", "순두부찌개", "떡볶이", "닭갈비", "치킨", "육개장", "돌솥비빔밥","돈까스", "삼겹살", "갈비","쭈꾸미 볶음","순대국밥","설렁탕", "고기국밥", "뼈해장국", "철판볶음밥", "보쌈", "낙지볶음밥", "오므라이스", "국수");
        List<String> chineseToAdd = List.of("짜장면", "짬뽕", "탕수육", "우육면","양장피", "마파두부",  "중식볶음밥", "마라탕", "마라샹궈", "꿔바로우", "지삼선", "꽁바오지띵","훠궈", "만두", "차오미엔");
        List<String> japaneseToAdd = List.of("스시", "라멘", "돈카츠", "우동", "회", "알밥", "야키토리(닭꼬치구이)", "오코노미야끼", "타코야끼", "야키니쿠", "샤브샤브", "밀푀유나베", "오니기리", "돈부리","우동","텐동");
        List<String> westernToAdd = List.of("치킨 키예프", "피자", "소고기 스테이크", "토마토 파스타","알리오 올리오","크림 파스타", "해물 파스타", "햄버거", "봉골레 스파게티", "랍스터 비스크", " 피쉬 앤 칩스", "비프 타코", "바베큐", "치킨 마살라", "에그 베네딕트");

        koreanList.addAll(koreanToAdd);
        chineseList.addAll(chineseToAdd);
        japaneseList.addAll(japaneseToAdd);
        westernList.addAll(westernToAdd);

    }


    public void viewOfAllMenu() {
        foodlist();
        int count1= 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        System.out.println("=============== 한식 ===============");

        for(int i = 0; i < koreanList.size(); i++){
            count1 ++;
            if(count1 % 5 == 0){
                System.out.println();
            }else {
                System.out.print(koreanList.get(i) + "   ");
            }

        }
        System.out.println();
        System.out.println("=============== 중식 ===============");

        for(int u = 0; u < chineseList.size(); u++){
            count2 ++;
            if(count2 % 5 == 0){
                System.out.println();
            }else {
                System.out.print(chineseList.get(u) + "   ");
            }

        }
        System.out.println();
        System.out.println("=============== 일식 ===============");

        for(int y = 0; y < japaneseList.size(); y++){
            count3 ++;
            if(count3 % 5 == 0){
                System.out.println();
            }else {
                System.out.print(japaneseList.get(y) + "   ");
            }

        }
        System.out.println();
        System.out.println("=============== 양식 ===============");

        for(int k = 0; k < westernList.size(); k++){
            count4 ++;
            if(count4 % 5 == 0){
                System.out.println();
            }else {
                System.out.print(westernList.get(k) + "   ");
            }

        }
        System.out.println("");





    }


}



