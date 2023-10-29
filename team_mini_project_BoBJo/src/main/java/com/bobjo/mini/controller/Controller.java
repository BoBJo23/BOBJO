package com.bobjo.mini.controller;

import com.bobjo.mini.model.dto.Food;
import com.bobjo.mini.service.AllMenu;

import java.util.List;

public class Controller {

    private AllMenu aM = new AllMenu();
    public void allMenu() {
        aM.viewAllmenu();


    }
}
