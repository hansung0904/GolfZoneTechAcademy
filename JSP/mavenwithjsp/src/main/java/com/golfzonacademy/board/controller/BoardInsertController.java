package com.golfzonacademy.board.controller;


import com.golfzonacademy.board.model.BoardDAO;
import com.golfzonacademy.board.model.BoardDAOimpl;
import com.golfzonacademy.board.model.BoardVO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet({"/b_insert.do", "/b_insertOK.do"})
public class BoardInsertController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public BoardInsertController() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String sPath = request.getServletPath();
        System.out.println("doGet:" + sPath);

        request.getRequestDispatcher("board/insert.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String sPath = request.getServletPath();
        System.out.println("doPost:" + sPath);

        System.out.println(request.getParameter("title"));
        System.out.println(request.getParameter("content"));
        System.out.println(request.getParameter("writer"));

        BoardDAO dao = new BoardDAOimpl();

        BoardVO vo = new BoardVO();
        vo.setTitle(request.getParameter("title"));
        vo.setContent(request.getParameter("content"));
        vo.setWriter(request.getParameter("writer"));
        int result = dao.insert(vo);
        System.out.println("result:" + result);

        if (result == 1)
            response.sendRedirect("b_selectAll.do");
        else
            response.sendRedirect("b_insert.do");

    }// end doPost
}