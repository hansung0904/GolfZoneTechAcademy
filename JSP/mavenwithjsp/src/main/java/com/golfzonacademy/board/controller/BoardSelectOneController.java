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

@WebServlet({"/b_selectOne.do"})
public class BoardSelectOneController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public BoardSelectOneController() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sPath = request.getServletPath();
        System.out.println("doGet:" + sPath);

        System.out.println(request.getParameter("num"));

        BoardVO vo = new BoardVO();
        vo.setNum(Integer.parseInt(request.getParameter("num")));

        BoardDAO dao = new BoardDAOimpl();

        BoardVO vo2 = dao.selectOne(vo);
        System.out.println("vos.size():" + vo2);


        request.setAttribute("vos", vo2);

        request.getRequestDispatcher("board/selectOne.jsp").forward(request, response);

    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }//end doPost
}
