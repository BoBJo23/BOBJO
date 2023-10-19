package com.bobjo.mini.run;

import com.bobjo.mini.controller.FoodData;
import com.bobjo.mini.controller.RandomFromAll;
import com.bobjo.mini.view.Option;

import java.util.Random;

public class Application {

    public static void main(String[] args) {

//        Option fm = new Option();
//        fm.mainmenu();

        RandomFromAll rfa = new RandomFromAll();
        rfa.allMenu();
    }
}
