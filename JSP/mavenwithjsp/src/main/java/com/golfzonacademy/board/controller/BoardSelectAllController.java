package com.golfzonacademy.board.controller;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({"/b_selectAll.do"})
public class BoardSelectAllController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        String sPath = request.getServletPath();
        System.out.println("doGet: " + sPath);

        request.getRequestDispatcher("board/selectAll.jsp").forward(request, resp);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {


    }

}
