package test.com.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet({"/index.do"})
public class IndexController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String sPath = request.getServletPath();
        System.out.println("sPath: " + sPath);

        if (sPath.equals("/index.do")) {
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");

        }

    }


}
