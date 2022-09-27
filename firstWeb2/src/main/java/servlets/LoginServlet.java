package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        System.out.println("req = " + req + ", resp = " + resp);

       /* PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<header>");
        out.println("<title>Hello</title>");
        out.println("</header>");
        out.println("<body>");
        out.println("<h1>my title</h1>");
        out.println("<body>");
        out.println("</html>");*/

        req.getRequestDispatcher("/WEB-INF/view/login.html").forward(req,resp);
    }

}
