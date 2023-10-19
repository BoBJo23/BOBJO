package com.bobjo.mini.controller;


import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomFromAll {
    public void allMenu() {
        FoodData fd = new FoodData();
        fd.foodlist();
        List<String> mergedList = Stream.of(fd.koreanList, fd.chineseList, fd.japaneseList, fd.westernList)
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        //랜덤
        int answer;
        do {
            Random randomFromAll = new Random();
            int randomIndex = randomFromAll.nextInt(mergedList.size());
            System.out.println(mergedList.get(randomIndex));
            System.out.println("'1' 입력 : 이 메뉴로 결정하기");
            System.out.println("'2' 입력 : 메뉴 새로 뽑기");
            Scanner sc = new Scanner(System.in);
            System.out.print("입력 : ");
            answer = sc.nextInt();

        } while (answer == 2);

        //이걸로 결정할 건지 다시 뽑을 건지

    }
}
