package com.bobjo.mini.model.dao;

import com.bobjo.mini.common.JDBCTemplate;
import com.bobjo.mini.model.dto.Food;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class FoodDAO {
    private Properties prop = new Properties();

    public FoodDAO() {
        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/bobjo/mini/mapper/menu-query.xml"));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public List<Food> selectAllMenu(Connection con) {
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        List<Food> foodList = null;

        String query = prop.getProperty("selectAllMenu");

        try {
            pstmt = con.prepareStatement(query);
            rset = pstmt.executeQuery();
            foodList = new ArrayList<>();

            while(rset.next()){
                Food food = new Food();
                food.setMenuName(rset.getString("menuName"));
                food.setMenuNum(rset.getInt("menuNum"));


                foodList.add(food);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCTemplate.close(rset);
            JDBCTemplate.close(pstmt);
        }
    return foodList;
    }
}