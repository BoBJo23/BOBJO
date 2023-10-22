package com.bobjo.mini.controller;

import com.bobjo.mini.model.dto.Food;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomFromAll {
    public void allMenu(Food food)  {


        List<String> mergedList = Stream.of(food.getKoreanList(), food.getJapaneseList(), food.getWesternList(), food.getChineseList())
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        //랜덤
        int answer;
        Set<Integer> previous = new HashSet<>();
        do {
            Random randomFromAll = new Random();
            int randomIndex;
            do{
                randomIndex = randomFromAll.nextInt(mergedList.size());
            } while (previous.contains(randomIndex));  // 중복이면 다시 뽑게하기

            previous.add(randomIndex); // 이전에 뽑은 목록 저장

            System.out.println("♡ " +mergedList.get(randomIndex) + " ♡");
            System.out.println("");
            System.out.println("'1' 입력 : 이 메뉴로 결정하기");
            System.out.println("'2' 입력 : 메뉴 새로 뽑기");
            System.out.println();
            Scanner sc = new Scanner(System.in);
            System.out.print("입력 : ");
            answer = sc.nextInt();


        } while (answer == 2);

        //이걸로 결정할 건지 다시 뽑을 건지

    }
}
