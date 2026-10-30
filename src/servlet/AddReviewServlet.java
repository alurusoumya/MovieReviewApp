package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddReviewServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String review = request.getParameter("review");
        String rating = request.getParameter("rating");

        response.getWriter().println("Review added for: " + name);
    }
}