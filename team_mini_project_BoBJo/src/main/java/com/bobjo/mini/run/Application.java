package com.bobjo.mini.run;
import com.bobjo.mini.view.Option;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.bobjo.mini.common.JDBCTemplate.close;
import static com.bobjo.mini.common.JDBCTemplate.getConnection;


public class Application {

    public static void main(String[] args) {
//        Connection con = getConnection();
//        PreparedStatement pstmt = null;
//        ResultSet rset = null;
//
//
//        try {
//        String query = "SELECT * FROM tbl_menu;";
//            pstmt = con.prepareStatement(query);
//            rset = pstmt.executeQuery();
//            if(rset.next()){
//                System.out.println(rset);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            close(rset);
//            close(pstmt);
//            close(con);
//        }


        Option fm = new Option();
        fm.mainmenu();

    }
}
