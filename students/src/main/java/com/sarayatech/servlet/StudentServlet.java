package com.sarayatech.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value="/login.do")
public class StudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("request = " + request + ", response = " + response);
        request.setAttribute("name",request.getParameter("name"));
        request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


       String name = request.getParameter("name");
       String password =  request.getParameter("password");

        if (password.equalsIgnoreCase("admin") && name.equalsIgnoreCase("ibrahim")) {
            request.setAttribute("name",name);
            request.getRequestDispatcher("/WEB-INF/view/welecome.jsp").forward(request,response);
        }else {
            request.setAttribute("error","Incorrect password or username");
            request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request,response);

        }


    }
}
