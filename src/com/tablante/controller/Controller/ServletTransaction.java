package com.tablante.controller.Controller;

import com.tablante.controller.Model.mathm;
import com.tablante.controller.jdbc.StoreDbc;
import sun.plugin.javascript.navig.Document;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class ServletTransaction extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList fruits =new  ArrayList<String>();
        StoreDbc storeDbc = new StoreDbc();
        storeDbc.Store();
String a = req.getParameter("Fruits");
int quantity = Integer.parseInt(req.getParameter("quantity"));
        mathm math = new mathm();

         int b =   math.Sump(a,quantity);

        req.setAttribute("value",b);
        req.setAttribute("value2",a);
        RequestDispatcher r = req.getRequestDispatcher("recommended.jsp");
        r.forward(req,resp);


    }
}
