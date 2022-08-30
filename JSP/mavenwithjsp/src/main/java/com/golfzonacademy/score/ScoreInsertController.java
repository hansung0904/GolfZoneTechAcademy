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

@WebServlet({"/s_insert.do", "/s_insertOK.do"})
public class ScoreInsertController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public ScoreInsertController() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String sPath = request.getServletPath();
        System.out.println("doGet:" + sPath);

        request.getRequestDispatcher("score/insert.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String sPath = request.getServletPath();
        System.out.println("doPost:" + sPath);

        System.out.println(request.getParameter("kor"));
        System.out.println(request.getParameter("eng"));
        System.out.println(request.getParameter("math"));

        ScoreDAO dao = new ScoreDAOimpl();

        ScoreVO vo = new ScoreVO();
        vo.setKor(Integer.parseInt(request.getParameter("33")));
        vo.setEng(Integer.parseInt(request.getParameter("77")));
        vo.setMath(Integer.parseInt(request.getParameter("88")));
        int result = dao.insert(vo);
        System.out.println("result:" + result);

        if (result == 1)
            response.sendRedirect("s_selectAll.do");
        else
            response.sendRedirect("s_insert.do");

    }// end doPost
}