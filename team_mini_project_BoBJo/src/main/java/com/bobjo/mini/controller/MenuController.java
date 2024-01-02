package com.bobjo.mini.controller;

import com.bobjo.mini.model.dto.MenuDTO;
import com.bobjo.mini.service.MenuService;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MenuController {

    /*
    * 1. 사용자가 선택한 기능을 실행시켜주는 기능
    * 2. 사용자가 전달한 값을 정제또는 새롭게 생성한 후에 필요한 서비스를 요청
    * 3. 서비스에서 전달받은 결과값에 따라서 성공/실패의 화면을 결정짓는 역할
    * */
    private final PrintResult printResult;
    private final MenuService menuService;

    public MenuController() {

        printResult = new PrintResult();
        menuService = new MenuService();
    }

    public void selectAllMenu() {

        List<MenuDTO> menuList = menuService.selectAllMenu();

        if(menuList != null) {
            printResult.printMenuList(menuList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }
//
//    public void selectMenuByCode(Map<String, String> parameter) {
//
//        int code = Integer.parseInt(parameter.get("code"));
//        System.out.println("code = " + code);
//
//        MenuDTO menu = menuService.selectMenuByCode(code);
//
//        if(menu != null) {
//            printResult.printMenu(menu);
//        } else {
//            printResult.printErrorMessage("selectOne");
//        }
//    }
//
    public void registMenu(Map<String, String> parameter) {

        String menuName = parameter.get("menuName");
        int categoryNum = Integer.parseInt(parameter.get("categoryNum"));

        MenuDTO menu = new MenuDTO();
        menu.setMenuName(menuName);
        menu.setCategoryNum(categoryNum);

        System.out.println("menu = " + menu);

        if(menuService.insertMenu(menu)){
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }

    public void getRandomMenu() {
            Scanner scanner = new Scanner(System.in);
            int answer;

            do {
                MenuDTO randomMenu = menuService.getRandomMenu();

                if (randomMenu != null) {
                    System.out.println("♡ " + randomMenu.getMenuName() + " ♡");
                    System.out.println("");
                    System.out.println("'1' 입력 : 이 메뉴로 결정하기");
                    System.out.println("'2' 입력 : 메뉴 새로 뽑기");
                    System.out.println();

                    System.out.print("입력 : ");
                    answer = scanner.nextInt();

                    if (answer == 1) {
                        // 선택된 메뉴로 결정하는 작업
                        System.out.println("메뉴를 선택했습니다: " + randomMenu.getMenuName());
                        break;
                    }
                } else {
                    System.out.println("No menu available.");
                    answer = 0;  // 메뉴가 없으면 루프를 종료
                }
            } while (answer == 2);

            // 이걸로 결정할 건지 다시 뽑을 건지에 대한 작업 추가
            // 예를 들어, 선택된 메뉴를 가지고 다른 작업을 수행하거나 메뉴를 저장하는 등의 로직을 추가할 수 있습니다.
        }
    }
//
//    public void modifyMenu(Map<String, String> parameter) {
//
//        int code = Integer.parseInt(parameter.get("code"));
//        String name = parameter.get("name");
//        int price = Integer.parseInt(parameter.get("price"));
//        int categoryCode = Integer.parseInt(parameter.get("categoryCode"));
//
//        MenuDTO menu = new MenuDTO();
//        menu.setCode(code);
//        menu.setName(name);
//        menu.setPrice(price);
//        menu.setCategoryCode(categoryCode);
//
//        System.out.println("menu = " + menu);
//
//        if(menuService.modifyMenu(menu)){
//            printResult.printSuccessMessage("update");
//        } else {
//            printResult.printErrorMessage("update");
//        }
//    }
//
//    public void deleteMenu(Map<String, String> parameter) {
//
//        int code = Integer.parseInt(parameter.get("code"));
//
//        if(menuService.deleteMenu(code)){
//            printResult.printSuccessMessage("delete");
//        } else {
//            printResult.printErrorMessage("delete");
//        }
//    }

