package com.bobjo.mini.controller;


import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomFromAll {
    public void allMenu(){
        FoodData fd = new FoodData();
        fd.foodlist();
        List<String> mergedList = Stream.of(fd.koreanList, fd.chineseList,fd.japaneseList, fd.westernList)
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        //랜덤
        Random randomFromAll = new Random();
        int randomIndex = randomFromAll.nextInt(mergedList.size());
        System.out.println(mergedList.get(randomIndex));
    }
}
