package com.bobjo.mini.controller;



import com.bobjo.mini.view.Option;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FoodData {
    private Random random;

    private List<String> koreanMenu = new ArrayList<>();
    private List<String> chineseMenu = new ArrayList<>();
    private List<String> japaneseMenu = new ArrayList<>();
    private List<String> westernMenu = new ArrayList();
    private static FoodData instance;

    private FoodData() {
        random = new Random();
        koreanMenu.addAll(List.of("비빔밥", "김밥","육회","불고기", "김치찌개", "된장찌개", "순두부찌개", "떡볶이", "닭갈비", "치킨", "육개장", "돌솥비빔밥","돈까스", "삼겹살", "갈비","쭈꾸미 볶음","순대국밥","설렁탕", "고기국밥", "뼈해장국", "철판볶음밥", "보쌈", "낙지볶음밥", "오므라이스", "국수"));
        chineseMenu.addAll(List.of("짜장면", "짬뽕", "탕수육", "우육면","양장피", "마파두부",  "중식볶음밥", "마라탕", "마라샹궈", "꿔바로우", "지삼선", "꽁바오지띵","훠궈", "만두", "차오미엔"));
        japaneseMenu.addAll(List.of("스시", "라멘", "돈카츠", "우동", "회", "알밥", "야키토리(닭꼬치구이)", "오코노미야끼", "타코야끼", "야키니쿠", "샤브샤브", "밀푀유나베", "오니기리", "돈부리","우동","텐동"));
        westernMenu.addAll(List.of("치킨 키예프", "피자", "소고기 스테이크", "토마토 파스타","알리오 올리오","크림 파스타", "해물 파스타", "햄버거", "봉골레 스파게티", "랍스터 비스크", " 피쉬 앤 칩스", "비프 타코", "바베큐", "치킨 마살라", "에그 베네딕트"));
    }

    public static FoodData getInstance() {
        if (instance == null) {
            instance = new FoodData();
        }
        return instance;
    }

    public void addMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("추가할 메뉴의 카테고리를 입력하세요.");
        System.out.println("");
        System.out.println("1. 한식");
        System.out.println("2. 일식");
        System.out.println("3. 양식");
        System.out.println("4. 중식");
        System.out.println("");
        System.out.print("카테고리 : ");

        try {
            int categoryForNewMenu = sc.nextInt();
            System.out.print("추가할 메뉴명을 입력하세요 : ");
            String newMenu = sc.next();

            switch (categoryForNewMenu) {
                case 1:
                    koreanMenu.add(newMenu);
                    System.out.println(newMenu + " 이(가) 추가되었습니다.");
                    break;

                case 2:
                    japaneseMenu.add(newMenu);
                    System.out.println(newMenu + " 이(가) 추가되었습니다.");
                    break;

                case 3:
                    westernMenu.add(newMenu);
                    System.out.println(newMenu + " 이(가) 추가되었습니다.");
                    break;

                case 4:
                    chineseMenu.add(newMenu);
                    System.out.println(newMenu + " 이(가) 추가되었습니다.");
                    break;
                default:
                    System.out.println("유효하지 않은 카테고리입니다.");
                    return;
            }
            } catch(InputMismatchException e){
                System.out.println("숫자를 입력해야 합니다.");
            }
    }

    public void randomFromAll() {
        List<String> mergedList = Stream.of(koreanMenu, chineseMenu, japaneseMenu, westernMenu)
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

            if(answer != 2) {
                break;
            }

        } while (true);

        if(previous.size() == mergedList.size()) {
            System.out.println("원하시는 메뉴가 없으면 직접 추가해주세요.");
            addMenu();
        }
    }

        public void categoryRandom() {

            String Category;

            int categoryChoice;
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
                System.out.print("\u001B[0m");
                System.out.print("☆☆ 위의 카테고리 중 1개를 선택하세요 ☆☆ --- ▷" + " ");
                System.out.print("");

                Scanner sc = new Scanner(System.in);
                categoryChoice = sc.nextInt();
                Random random = new Random();

                switch (categoryChoice) {
                    case 1: // 한식
                        int randomIndexKorean = random.nextInt(koreanMenu.size());
                        Category = koreanMenu.get(randomIndexKorean);
                        next(Category);
                        break;
                    case 2: // 일식
                        int randomIndexJapanese = random.nextInt(japaneseMenu.size());
                        Category = japaneseMenu.get(randomIndexJapanese);
                        next(Category);
                        break;
                    case 3: // 양식
                        int randomIndexWestern = random.nextInt(westernMenu.size());
                        Category = westernMenu.get(randomIndexWestern);
                        next(Category);
                        break;
                    case 4: // 중식
                        int randomIndexChinese = random.nextInt(chineseMenu.size());
                        Category = chineseMenu.get(randomIndexChinese);
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
            Option op = new Option();

            System.out.println("");
            System.out.println("");
            System.out.println("  ※※※※※※※※※※※※※※※※※※※※  오늘 메뉴는  ※※※※※※※※※※※※※※※※※※※※");
            System.out.println("");
            System.out.println("");
            System.out.println("     =============     ==============       =============     ============== ");
            System.out.println("     ∥                              ∥      ∥                               ∥ ");
            System.out.println("     ∥                              ∥      ∥                               ∥ ");
            System.out.println("     =============                          =============                     ");
            System.out.println("                     ==================                     ================== ");
            System.out.println("    ===============                        ===============                     ");
            System.out.println("           ∥            ∥                         ∥            ∥               ");
            System.out.println("           ∥            ∥                         ∥            ∥               ");
            System.out.println("           ∥            =============             ∥            =============  ");
            System.out.println("");
            System.out.println("");
            System.out.println("  ※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("             ★★★★★★★★★★★★ " + "( " + st + " )" + " 당첨 ★★★★★★★★★★★★");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            op.mainmenu();
        }


    public void viewAllmenu() {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        System.out.println("=============== 한식 ===============");

        for (int i = 0; i < koreanMenu.size(); i++) {
            count1++;
            if (count1 % 5 == 0) {
                System.out.println();
            } else {
                System.out.print(koreanMenu.get(i) + "   ");
            }
        }

        if (count1 % 5 != 0) {
            System.out.println();
        }

        System.out.println("=============== 일식 ===============");

        for (int y = 0; y < japaneseMenu.size(); y++) {
            count3++;
            if (count3 % 5 == 0) {
                System.out.println();
            } else {
                System.out.print(japaneseMenu.get(y) + "   ");
            }
        }

        if (count3 % 5 != 0) {
            System.out.println();
        }

        System.out.println("=============== 양식 ===============");

        for (int k = 0; k < westernMenu.size(); k++) {
            count4++;
            if (count4 % 5 == 0) {
                System.out.println();
            } else {
                System.out.print(westernMenu.get(k) + "   ");
            }
        }

        if (count4 % 5 != 0) {
            System.out.println();
        }

        System.out.println("=============== 중식 ===============");

        for (int u = 0; u < chineseMenu.size(); u++) {
            count2++;
            if (count2 % 5 == 0) {
                System.out.println();
            } else {
                System.out.print(chineseMenu.get(u) + "   ");
            }
        }

        if (count2 % 5 != 0) {
            System.out.println();
        }
    }

}



