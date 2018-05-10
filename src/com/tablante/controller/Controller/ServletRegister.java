package com.tablante.controller.Controller;

import com.sun.tools.javac.comp.Check;
import com.tablante.controller.Math.CheckData;
import com.tablante.controller.Model.User;
import com.tablante.controller.jdbc.StoreDbc;
import com.tablante.controller.jdbc.UserDbc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;


public class ServletRegister extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User(req.getParameter("user"), req.getParameter("pass"), req.getParameter("email"),
                req.getParameter("fname"), req.getParameter("lname"));
        ArrayList fruit = new ArrayList<String>();
        Boolean bool = false;
        UserDbc userDbc = new UserDbc();
        StoreDbc storeDbc =new StoreDbc();
      bool =  userDbc.UserRegister(user);
      fruit = storeDbc.gatherDatabase();
      if(bool) {
          RequestDispatcher rd = req.getRequestDispatcher("login.jsp");


          req.setAttribute("value",fruit);

          rd.include(req, resp);
          rd.forward(req, resp);
      }

      else{
          RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
          rd.include(req, resp);
          rd.forward(req, resp);
      }
    }
}
