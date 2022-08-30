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
import java.util.List;

@WebServlet({"/s_selectAll.do"})
public class ScoreSelectAllController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public ScoreSelectAllController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sPath = request.getServletPath();
        System.out.println("doGet:" + sPath);

        ScoreDAO dao = new ScoreDAOimpl();

        List<ScoreVO> vos = dao.selectAll();
        System.out.println("vos.size():" + vos.size());


        request.setAttribute("vos", vos);

        request.getRequestDispatcher("score/selectAll.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }//end doPost

}
