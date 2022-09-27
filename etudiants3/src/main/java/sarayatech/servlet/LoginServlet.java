package sarayatech.servlet;

import sarayatech.services.ServiceValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
    private ServiceValidation serviceValidation = new ServiceValidation();

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        //super.doGet(httpServletRequest, httpServletResponse);
        httpServletRequest.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(httpServletRequest,httpServletResponse);
    }

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String name = httpServletRequest.getParameter("name");
        String password = httpServletRequest.getParameter("password");
        boolean valid = serviceValidation.userValidation(name,password);
        if(valid){
            httpServletRequest.getSession().setAttribute("username",name);
            httpServletRequest.setAttribute("name",name);
            httpServletRequest.setAttribute("password",password);
            httpServletRequest.getRequestDispatcher("/WEB-INF/view/welecom.jsp").forward(httpServletRequest,httpServletResponse);
        }else {
            httpServletRequest.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(httpServletRequest, httpServletResponse);
        }
    }
}
