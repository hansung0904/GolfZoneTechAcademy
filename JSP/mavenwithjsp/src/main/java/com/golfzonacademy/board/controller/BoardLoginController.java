package com.golfzonacademy.board.controller;


import com.golfzonacademy.board.model.BoardDAO;
import com.golfzonacademy.board.model.BoardDAOimpl;
import com.golfzonacademy.board.model.BoardVO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet({"/login.do", "/logout.do", "/loginOK.do"})
public class BoardLoginController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public BoardLoginController() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String sPath = request.getServletPath();
        System.out.println("doGet:" + sPath);

        if (sPath.equals("/login.do")) {
            request.getRequestDispatcher("board/login.do");

        } else if (sPath.equals("/logout.do")) {
            request.getRequestDispatcher("board/logout.do");
            HttpSession session = request.getSession();
            session.removeAttribute("user_id");
            response.sendRedirect("home.do");
        }
        request.getRequestDispatcher("board/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String sPath = request.getServletPath();
        System.out.println("doPost:" + sPath);

        if (sPath.equals("/loginOK.do")) {
            HttpSession session = request.getSession();
            session.setAttribute("user_id", "admin");
            response.sendRedirect("home.do");
        }

    }// end doPost
}