package com.bobjo.mini.controller;

import com.bobjo.mini.model.dto.Food;
import com.bobjo.mini.service.AddMenu;
import com.bobjo.mini.service.AllMenu;
import com.bobjo.mini.service.Category;

import java.util.List;

public class Controller {

    private AllMenu aM = new AllMenu();
    private AddMenu ad = new AddMenu();

    private Category ct = new Category();
    public void allMenu() {
        aM.viewAllmenu();


    }

    public void addMenu() {
        ad.addMenu();

    }

    public void category() {
        ct.categoryRandom();
    }
}
