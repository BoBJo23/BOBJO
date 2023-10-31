
package com.bobjo.mini.service;

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

            if(answer == 1) {
                break;
            }
            if(previous.size() == mergedList.size()) {
                System.out.println("준비된 메뉴는 여기까지입니다.");
                System.out.println("'1' 입력 : 직접 메뉴 추가하기");
                System.out.println("'2' 입력 : 메인 메뉴로 돌아가기");
                System.out.println("'3' 입력 : 프로그램 종료하기");
                System.out.println("");
                System.out.print("입력 : ");
                int finishedanswer;
                finishedanswer = sc.nextInt();
                switch (finishedanswer) {
                    case 1:

                    AddMenu addmenu = new AddMenu();
                    addmenu.addMenu(food);
                    return;

                    case 2:
                        break;

                    case 3:
                    System.exit(0);

                    default:
                        System.out.println("유효하지 않은 선택입니다. 메인 메뉴로 돌아갑니다.");
                        System.out.println("");
                        return;
                }
            }
            if(answer != 1 &&  answer !=2) {
                System.out.println("유효하지 않은 선택입니다. 메인 메뉴로 돌아갑니다.");
                System.out.println("");
                break;
            }

            } while (answer == 2);

        //이걸로 결정할 건지 다시 뽑을 건지

    }
}
