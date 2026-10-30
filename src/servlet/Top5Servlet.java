package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Top5Servlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.getWriter().println("Top 5 movies (dummy)");
    }
}