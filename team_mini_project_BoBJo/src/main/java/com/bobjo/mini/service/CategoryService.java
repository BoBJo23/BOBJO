package com.bobjo.mini.service;

import com.bobjo.mini.model.dao.FoodDAO;
import com.bobjo.mini.model.dto.CategoryDTO;
import com.bobjo.mini.model.dto.Food;
import com.bobjo.mini.view.Option;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

import static com.bobjo.mini.common.JDBCTemplate.close;
import static com.bobjo.mini.common.JDBCTemplate.getConnection;

public class CategoryService {
    private FoodDAO foodDAO = new FoodDAO();

    Scanner sc = new Scanner(System.in);
    int categoryChoice;

    public void categoryRandom() {

    }

    public List<CategoryDTO> selectCategoryList() {

        Connection con = getConnection();

        List<CategoryDTO> categoryList = foodDAO.selectCategoryList(con);

        close(con);

        return categoryList;
    }

    public List<Food> selectMenuByCode(int code) {

        Connection con = getConnection();

        List<Food> foodList = foodDAO.selectMenuByCode(con, code);

        close(con);

        return foodList;
    }
}
