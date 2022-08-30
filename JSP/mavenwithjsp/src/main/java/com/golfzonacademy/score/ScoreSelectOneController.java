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

@WebServlet({"/s_selectOne.do"})
public class ScoreSelectOneController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public ScoreSelectOneController() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sPath = request.getServletPath();
        System.out.println("doGet:" + sPath);

        System.out.println(request.getParameter("num"));

        ScoreVO vo = new ScoreVO();
        vo.setNum(Integer.parseInt(request.getParameter("num")));

        ScoreDAO dao = new ScoreDAOimpl() {
        };

        ScoreVO vo2 = dao.selectOne(vo);
        System.out.println("vos.size():" + vo2);


        request.setAttribute("vos", vo2);

        request.getRequestDispatcher("score/selectOne.jsp").forward(request, response);

    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }//end doPost
}
