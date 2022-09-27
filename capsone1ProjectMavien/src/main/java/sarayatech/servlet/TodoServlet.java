package sarayatech.servlet;

import sarayatech.model.Todo;
import sarayatech.service.ServletService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet(urlPatterns = "/login.do")
public class TodoServlet extends HttpServlet {
    final String  RESOURCES_PAGE_LOGIN = "/WEB-INF/view/login.jsp";
    final String  RESOURCES_PAGE_WELCOME = "/WEB-INF/view/welcome.jsp";
    ServletService servletService = new ServletService();
    RequestDispatcher requestDispatcher;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher(RESOURCES_PAGE_LOGIN).forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("username",request.getParameter("username"));
        session.setAttribute("password",request.getParameter("password"));

        String username = (String) request.getSession().getAttribute("username");
        String password = (String) request.getSession().getAttribute("password");
        System.out.println("username = " + username + ", password = " + password);

        boolean valid = this.servletService.isAuthentificated("ibrahim","admin");
        System.out.println("valid = " + valid);
        if (!valid) {

           requestDispatcher =  request.getRequestDispatcher(RESOURCES_PAGE_LOGIN);
        }else {


            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            String name = request.getParameter("name");
            String createDate =request.getParameter("createDate");
            String endDate= request.getParameter("endDate");


            if (name!=null && createDate!=null && endDate!=null){

                LocalDate createAt = LocalDate.parse(createDate, formatter);
                LocalDate endAt = LocalDate.parse(endDate, formatter);
                boolean status = Boolean.parseBoolean(request.getParameter("status"));

                Todo todo = new Todo(name,createAt,endAt,status);

                this.servletService.addTodo(todo);

                System.out.println(this.servletService.getTodos());

                request.setAttribute("todos",this.servletService.getTodos());

            }

           requestDispatcher = request.getRequestDispatcher(RESOURCES_PAGE_WELCOME);
        }
        requestDispatcher.forward(request,response);
    }
}
