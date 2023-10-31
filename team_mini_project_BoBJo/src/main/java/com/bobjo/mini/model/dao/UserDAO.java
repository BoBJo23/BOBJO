package com.bobjo.mini.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import static com.bobjo.mini.common.JDBCTemplate.close;

public class UserDAO {
    private Properties Prop = new Properties();

    public UserDAO() {
        try {
            Prop.loadFromXML(new FileInputStream("src/main/java/com/bobjo/mini/mapper/menu-query.xml"));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    public int userInfo(Connection con,String userName, String gender, int age){
        PreparedStatement pstmt = null;
        int result = 0;

        String query = Prop.getProperty("userInfo");
        try {
            pstmt=con.prepareStatement(query);
            pstmt.setString(1,null);
            pstmt.setString(2,userName);
            pstmt.setString(3, gender);
            pstmt.setInt(4,age);

            result = pstmt.executeUpdate();   //INSERT, UPDATE 또는 DELETE 쿼리를 실행할 때 사용.
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            close(pstmt);
        }
        return result;

    }
}
