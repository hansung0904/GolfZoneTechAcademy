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

@WebServlet({"/b_delete.do", "/b_deleteOK.do"})
public class BoardDeleteController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public BoardDeleteController() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String sPath = request.getServletPath();
        System.out.println("doGet:" + sPath);

        if (sPath.equals("/b_delete.do")) {

            request.getRequestDispatcher("board/delete.jsp").forward(request, response);
        } else if (sPath.equals("/b_deleteOK.do")) {
            System.out.println(request.getParameter("num"));

            BoardDAO dao = new BoardDAOimpl();

            BoardVO vo = new BoardVO();
            vo.setNum(Integer.parseInt(request.getParameter("num")));

            int result = dao.delete(vo);
            if (result == 1) {
                response.sendRedirect("b_selectAll.do");
            } else {
                response.sendRedirect("b_delete.do?num" + request.getParameter("num"));
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

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
        int result = dao.delete(vo);
        System.out.println("result:" + result);

        if (result == 1)
            response.sendRedirect("b_selectAll.do");
        else
            response.sendRedirect("b_delete.do");

    }// end doPost
}