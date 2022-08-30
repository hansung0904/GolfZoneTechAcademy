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

@WebServlet({"/b_update.do", "/b_updateOK.do"})
public class BoardUpdateController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public BoardUpdateController() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String sPath = request.getServletPath();
        System.out.println("doGet:" + sPath);

        request.getRequestDispatcher("board/update.jsp").forward(request, response);

        System.out.println(request.getParameter("num"));

        BoardVO vo = new BoardVO();
        vo.setNum(Integer.parseInt(request.getParameter("num")));

        BoardDAO dao = new BoardDAOimpl();

        BoardVO vo2 = dao.selectOne(vo);
        System.out.println("vos.size():" + vo2);


        request.setAttribute("vos", vo2);

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
        System.out.println(Integer.parseInt(request.getParameter("num")));
        vo.setTitle(request.getParameter("title"));
        vo.setContent(request.getParameter("content"));
        vo.setWriter(request.getParameter("writer"));
        int result = dao.update(vo);
        System.out.println("result:" + result);

        if (result == 1)
            response.sendRedirect("b_selectOne.do?num=" + request.getParameter("num"));
        else
            response.sendRedirect("b_update.do?num=" + request.getParameter("num"));

    }// end doPost
}