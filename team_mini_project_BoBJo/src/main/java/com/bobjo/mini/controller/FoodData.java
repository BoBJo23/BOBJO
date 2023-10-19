package com.bobjo.mini.controller;

import com.bobjo.mini.model.dto.Food;

public class FoodData {


    private Food[] flist = new Food[4];
    {
//        flist[0] 한식
//        flist[1] 일식
//        flist[2] 양식
//        flist[3] 중식
        flist[0] = new Food("비빔밥", "불고기", "김치찌개", "된장찌개", "순두부찌개", "떡볶이", "닭갈비", "치킨", "육개장", "돌곹비빔밥", "삼겹살", "갈비");
        flist[1] = new Food("스시", "라멘", "돈까스", "우동", "모츠나베", "알밥", "야키토리(닭꼬치구이)", "돈까스", "오코노미야끼", "타코야끼", "교자", "야키니쿠");
        flist[2] = new Food("치킨 키예프", "피자", "소고기 스테이크", "파스타", "햄버거", "봉골레 스파게티", "랍스터 비스크", " 피쉬 앤 칩스", "비프 타코", "바베큐", "치킨 마살라","에그 베네딕트");
        flist[3] = new Food("짜장면", "짬봉", "탕수육", "양장피", "마파두부", "홍샤오로우", "회이궈로우", "볶음밥", "마라탕", "마라샹궈", "꿔바로우", "지삼선");
    }

    public Food[] viewallMenu(){


        return flist;
    }


}
