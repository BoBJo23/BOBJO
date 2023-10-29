package com.bobjo.mini.service;



import com.bobjo.mini.model.dao.FoodDAO;
import com.bobjo.mini.model.dto.Food;

import java.sql.Connection;
import java.util.List;

import static com.bobjo.mini.common.JDBCTemplate.close;
import static com.bobjo.mini.common.JDBCTemplate.getConnection;


public class AllMenu {

    private  FoodDAO foodDAO = new FoodDAO();
    public void  viewAllmenu() {
        Connection con = getConnection();

        List<Food> foodList = foodDAO.selectAllMenu(con);

        for(Food fd : foodList){
            System.out.println(fd.getMenuNum() + ". " + fd.getMenuName() + "");
        }



        close(con);



    }

}


