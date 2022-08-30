package com.golfzonacademy.score;


import com.golfzonacademy.score.model.ScoreDAO;
import com.golfzonacademy.score.model.ScoreDAOimpl;
import com.golfzonacademy.score.model.ScoreVO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet({"/s_delete.do", "/s_deleteOK.do"})
public class ScoreDeleteController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public ScoreDeleteController() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String sPath = request.getServletPath();
        System.out.println("doGet:" + sPath);

        if (sPath.equals("/s_delete.do")) {

            request.getRequestDispatcher("board/delete.jsp").forward(request, response);
        } else if (sPath.equals("/s_deleteOK.do")) {
            System.out.println(request.getParameter("num"));

            ScoreDAO dao = new ScoreDAOimpl();

            ScoreVO vo = new ScoreVO();
            vo.setNum(Integer.parseInt(request.getParameter("num")));

            int result = dao.delete(vo);
            if (result == 1) {
                response.sendRedirect("s_selectAll.do");
            } else {
                response.sendRedirect("s_delete.do?num" + request.getParameter("num"));
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String sPath = request.getServletPath();
        System.out.println("doPost:" + sPath);

        System.out.println(request.getParameter("kor"));
        System.out.println(request.getParameter("eng"));
        System.out.println(request.getParameter("math"));

        ScoreDAO dao = new ScoreDAOimpl();

        ScoreVO vo = new ScoreVO();
        vo.setKor(Integer.parseInt(request.getParameter("kor")));
        vo.setMath(Integer.parseInt(request.getParameter("eng")));
        vo.setEng(Integer.parseInt(request.getParameter("math")));
        int result = dao.delete(vo);
        System.out.println("result:" + result);

        if (result == 1)
            response.sendRedirect("s_selectAll.do");
        else
            response.sendRedirect("s_delete.do");

    }// end doPost
}