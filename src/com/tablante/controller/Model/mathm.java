package com.tablante.controller.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class mathm {

    public mathm() {
    }

    public int Sump(String a,int b){
        Connection connection = null;
try {
    Class.forName("com.mysql.jdbc.Driver");
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "aldwinok30");
    Statement statement = connection.createStatement();
    String sql = " Select name, price from store where name = '" + a + "'  ";
    statement.executeQuery(sql);
    ResultSet rs = statement.executeQuery(sql);
    rs.next();
    int value = rs.getInt("price");
    b = b * value;


}
catch (Exception e){

    e.printStackTrace();
}






        return b;
    }


    public ArrayList<String> recommendations(String a){
        ArrayList string = new ArrayList<String>();


        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "aldwinok30");
            Statement statement = connection.createStatement();
            String sql = " Select name, price from store where name != '" + a + "'  ";

            statement.executeQuery(sql);
            ResultSet rs = statement.executeQuery(sql);

            rs.next();
            String value = rs.getString("name");
            string.add(value);



        }
        catch (Exception e){

            e.printStackTrace();
        }


        return string;

    }

}
