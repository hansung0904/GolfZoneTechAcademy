package test.com.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet({"/insert.do","/delete.do","/selectAll.do","/update.do"})
public class MemberController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sPath = request.getServletPath();
        System.out.println("sPath: " + sPath);

        if (sPath.equals("/insert.do")) {
            RequestDispatcher rd = request.getRequestDispatcher("member/insert.jsp");
        } else if (sPath.equals("/delete.do")) {
            RequestDispatcher rd = request.getRequestDispatcher("member/delete.jsp");
        } else if (sPath.equals("/selectAll.do")) {
            RequestDispatcher rd = request.getRequestDispatcher("member/selectAll.jsp");
        } else if (sPath.equals("/update.do")) {
            RequestDispatcher rd = request.getRequestDispatcher("member/update.jsp");
        }

    }
}