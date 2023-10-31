package com.bobjo.mini.model.dao;

import com.bobjo.mini.common.JDBCTemplate;
import com.bobjo.mini.model.dto.CategoryDTO;
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

import static com.bobjo.mini.common.JDBCTemplate.close;

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
                food.setCategoryNum(rset.getInt("categoryNum"));


                foodList.add(food);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(rset);
            close(pstmt);
        }
    return foodList;
    }

    public int addMenu(Connection con, String menuName, int categoryNum) {
        PreparedStatement pstmt = null;
        int result = 0;


        String query = prop.getProperty("addMenu");

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, null);
            pstmt.setString(2, menuName);
            pstmt.setInt(3, categoryNum);

            result = pstmt.executeUpdate();



        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(pstmt);

        }
        return result;
    }

    public List<CategoryDTO> selectCategoryList(Connection con) {

        PreparedStatement pstmt = null;
        ResultSet rset = null;

        List<CategoryDTO> categoryList = null;

        String query = prop.getProperty("category");

        try {
            pstmt = con.prepareStatement(query);
            rset = pstmt.executeQuery();

            categoryList = new ArrayList<>();

            while (rset.next()){

                CategoryDTO categoryDTO = new CategoryDTO();
                categoryDTO.setCategoryNum(rset.getInt("categoryNum"));
                categoryDTO.setCategoryName(rset.getString("categoryName"));

                categoryList.add(categoryDTO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rset);
            close(pstmt);
        }
        return categoryList;
    }

    public List<Food> selectMenuByCode(Connection con, int code) {
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        List<Food> categoryList = null;

        String query = prop.getProperty("categoryByCode");

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, code);
            rset = pstmt.executeQuery();

            categoryList = new ArrayList<>();

            while (rset.next()){

                Food food = new Food();
                food.setMenuNum(rset.getInt("menuNum"));
                food.setMenuName(rset.getString("menuName"));
                food.setCategoryNum(rset.getInt("categoryNum"));

                categoryList.add(food);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rset);
            close(pstmt);
        }
        return categoryList;
    }
}
