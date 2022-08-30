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

@WebServlet({"/s_update.do", "/s_updateOK.do"})
public class ScoreUpdateController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public ScoreUpdateController() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String sPath = request.getServletPath();
        System.out.println("doGet:" + sPath);

        request.getRequestDispatcher("score/update.jsp").forward(request, response);

        System.out.println(request.getParameter("num"));

        ScoreVO vo = new ScoreVO();
        vo.setNum(Integer.parseInt(request.getParameter("num")));

        ScoreDAO dao = new ScoreDAOimpl();

        ScoreVO vo2 = dao.selectOne(vo);
        System.out.println("vos.size():" + vo2);


        request.setAttribute("vos", vo2);

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
        System.out.println(Integer.parseInt(request.getParameter("num")));
        vo.setKor(Integer.parseInt(request.getParameter("44")));
        vo.setEng(Integer.parseInt(request.getParameter("55")));
        vo.setMath(Integer.parseInt(request.getParameter("77")));
        int result = dao.update(vo);
        System.out.println("result:" + result);

        if (result == 1)
            response.sendRedirect("s_selectOne.do?num=" + request.getParameter("num"));
        else
            response.sendRedirect("s_update.do?num=" + request.getParameter("num"));

    }// end doPost
}