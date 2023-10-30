package com.bobjo.mini.model.dto;

import java.util.ArrayList;
import java.util.List;

public class Food {

    private List<String> chineseList = new ArrayList<>(List.of("짜장면", "짬뽕", "탕수육", "우육면","양장피", "마파두부",  "중식볶음밥", "마라탕", "마라샹궈", "꿔바로우", "지삼선", "꽁바오지띵","훠궈", "만두", "차오미엔"));
//    private List<String> chineseList = new ArrayList<>(List.of("짜장면"));
    private List<String> japaneseList = new ArrayList<>(List.of("스시", "라멘", "돈카츠", "우동", "회", "알밥", "야키토리(닭꼬치구이)", "오코노미야끼", "타코야끼", "야키니쿠", "샤브샤브", "밀푀유나베", "오니기리", "돈부리","우동","텐동"));
//    private List<String> japaneseList = new ArrayList<>(List.of("스시"));
    private List<String> westernList = new ArrayList<>(List.of("치킨 키예프", "피자", "소고기 스테이크", "토마토 파스타","알리오 올리오","크림 파스타", "해물 파스타", "햄버거", "봉골레 스파게티", "랍스터 비스크", " 피쉬 앤 칩스", "비프 타코", "바베큐", "치킨 마살라", "에그 베네딕트"));
//    private List<String> westernList = new ArrayList<>(List.of("치킨 키예프"));
    private List<String> koreanList = new ArrayList<>(List.of("비빔밥", "김밥","육회","불고기", "김치찌개", "된장찌개", "순두부찌개", "떡볶이", "닭갈비", "치킨", "육개장", "돌솥비빔밥","돈까스", "삼겹살", "갈비","쭈꾸미 볶음","순대국밥","설렁탕", "고기국밥", "뼈해장국", "철판볶음밥", "보쌈", "낙지볶음밥", "오므라이스", "국수"));
//    private List<String> koreanList = new ArrayList<>(List.of("비빔밥"));


    public Food() {
    }

    public List<String> getChineseList() {
        return chineseList;
    }

    public List<String> getJapaneseList() {
        return japaneseList;
    }

    public List<String> getWesternList() {
        return westernList;
    }

    public List<String> getKoreanList() {
        return koreanList;
    }

    public void addChineseList(String chineseList) {
        this.chineseList.add(chineseList);
    }

    public void addJapaneseList(String japaneseList) {
        this.japaneseList.add(japaneseList);
    }

    public void addWesternList(String westernList) {
        this.westernList.add(westernList);
    }

    public void addKoreanList(String koreanList) {
        this.koreanList.add(koreanList);
    }

    public String randommenuch(int catecogy , int num ) {
        if (catecogy == 1) {
            return chineseList.get(num);
        }else if (catecogy == 2){
            return japaneseList.get(num);
        }
        else return "sorry";
    }

}
