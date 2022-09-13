package com.golfzonacademy.controller;

import com.model.EmpDAO;
import com.model.EmpDAOimpl;
import com.model.EmpVO;
import org.json.simple.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class DeptController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private EmpDAO dao = new EmpDAOimpl();

    public DeptController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet....");
        String sPath = request.getServletPath();
        System.out.println(sPath);

        if (sPath.equals("/d_selectAll.do")) {

            List<EmpVO> vos = dao.selectAll();
            System.out.println("vos.size():" + vos.size());

            request.setAttribute("vos", vos);

            request.getRequestDispatcher("dept/selectAll.jsp")
                    .forward(request, response);
        } else if (sPath.equals("/d_insert.do")) {

            request.getRequestDispatcher("dept/insert.jsp")
                    .forward(request, response);
        } else if (sPath.equals("/json_dept_id.do")) {

            List<Integer> dept_ids = dao.selectDeptID();
            System.out.println(dept_ids);

            PrintWriter out = response.getWriter();
            out.print(dept_ids.toString());

        } else if (sPath.equals("/json_job_id.do")) {

            List<String> job_ids = dao.selectJobID();
            System.out.println(job_ids);
//			String txt = "[";
//			for (int i=0;i<job_ids.size();i++) {
//				txt += "\""+job_ids.get(i)+"\"";
//				if(i<job_ids.size()-1)txt += ",";
//			}
//			txt += "]";

            //simple-json.jar 라이브러리사용
            JSONArray arr = new JSONArray();
            arr.addAll(job_ids);
            PrintWriter out = response.getWriter();
//            out.print(arr);
            out.print("[1500,1700,1800]");

        }


    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
