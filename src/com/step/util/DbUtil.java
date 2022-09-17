package com.step.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DbUtil {

    public static Connection getConnection(){
      Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/swing";
            String userName ="root";
            String password = "12345";
            con = DriverManager.getConnection(url,userName,password);
        }catch (Exception e){
            e.printStackTrace();

        }

        return con;

       }
    public static void closeAll(Connection con, PreparedStatement ps, ResultSet rs){
        try{
            if (con!=null){
                con.close();
            }
            if (ps!=null){
                ps.close();
            }
            if (rs!=null){
                rs.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

}}
