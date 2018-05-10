package com.tablante.controller.Controller;

import com.tablante.controller.Math.CheckData;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

public class ServletLogin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

  Boolean bool = false;


        try{
            String user = req.getParameter("user");
            String password = req.getParameter("pass");
            CheckData check = new CheckData();
            bool = check.checkUser(user.toLowerCase(),password.toLowerCase());
            String fname = check.getname();
            if(bool){

                req.setAttribute("value",fname);
                RequestDispatcher r = req.getRequestDispatcher("result.jsp");
                r.forward(req,resp);

            }

            else {

                RequestDispatcher r = req.getRequestDispatcher("index.jsp");
                r.forward(req,resp);
            }

        }

        catch (Exception e){
            e.printStackTrace();
        }
    }
}
