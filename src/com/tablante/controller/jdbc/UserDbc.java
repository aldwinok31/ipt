package com.tablante.controller.jdbc;

import com.tablante.controller.Math.CheckData;
import com.tablante.controller.Model.User;

import javax.servlet.RequestDispatcher;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UserDbc{

    Connection connection = null;

    public UserDbc(){
try {
    Class.forName("com.mysql.jdbc.Driver");
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "aldwinok30");
    Statement statement = connection.createStatement();
    String sqlcommand =  "create table if not exists user(username varchar(50)" +
            ",password varchar(50)" +
            ",firstname varchar(50)" +
            ",lastname varchar(50)" +
            ",email varchar(50))";
    statement.execute(sqlcommand);
}
catch (Exception e){
    e.printStackTrace();
}

    }



    public Boolean UserRegister(User user){
        Boolean bool = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            CheckData check = new CheckData();
            bool= check.checkUser(user.getUsername(),user.getPassword());
            Statement statement = connection.createStatement();

            if(!bool) {
                String sql = "insert into user values('" + user.getUsername() + "','" + user.getPassword() + "','" + user.getFname() + "'" +
                        ",'" + user.getLname() + "','" + user.getEmail() + "')";
                statement.executeUpdate(sql);
              bool = true;
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

return bool;
    }




}
