package com.tablante.controller.Math;

import sun.rmi.runtime.Log;

import javax.servlet.RequestDispatcher;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CheckData {

    String fname = "";


    public Boolean checkUser(String name , String pass){

        String user = name ;
        Boolean bool = false;
        String password = pass ;

        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","aldwinok30");
            Statement statement = connection.createStatement();
            String sql = " Select username, password, firstname from user where username = '"+user.toLowerCase()+"' and password= '" +password.toLowerCase() +"' ";
            statement.executeQuery(sql);
            ResultSet rs = statement.executeQuery(sql);
            rs.next();

            user = rs.getString("username");
            password = rs.getString("password");
           fname = rs.getString("firstname");


            if( user != null && password!= null ){
                bool=true;
            }


        }

        catch (Exception e){

            e.printStackTrace();
        }
        return bool;
    }


  public String  getname(){
         return fname;

  }
}

