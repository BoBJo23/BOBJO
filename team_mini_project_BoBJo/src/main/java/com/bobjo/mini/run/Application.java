package com.bobjo.mini.run;
import com.bobjo.mini.controller.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.bobjo.mini.common.JDBCTemplate.close;
import static com.bobjo.mini.common.JDBCTemplate.getConnection;


public class Application {

    public static void main(String[] args) {



        Option fm = new Option();
        fm.mainmenu();

    }
}
