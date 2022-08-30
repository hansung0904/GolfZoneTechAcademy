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
import java.util.List;

@WebServlet({"/b_selectAll.do"})
public class BoardSelectAllController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public BoardSelectAllController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sPath = request.getServletPath();
        System.out.println("doGet:" + sPath);

        BoardDAO dao = new BoardDAOimpl();

        List<BoardVO> vos = dao.selectAll();
        System.out.println("vos.size():" + vos.size());


        request.setAttribute("vos", vos);

        request.getRequestDispatcher("board/selectAll.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }//end doPost

}
