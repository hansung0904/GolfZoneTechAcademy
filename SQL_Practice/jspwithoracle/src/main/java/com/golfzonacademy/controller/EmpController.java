package com.golfzonacademy.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.EmpDAO;
import com.model.EmpDAOimpl;
import com.model.EmpVO;
import org.json.simple.JSONArray;


@WebServlet({"/e_selectAll.do"
        , "/e_insert.do", "/e_insertOK.do", "/e_selectAll_join.do",
        "/json_dept_id.do", "/json_job_id.do"})
public class EmpController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private EmpDAO dao = new EmpDAOimpl();

    public EmpController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet....");
        String sPath = request.getServletPath();
        System.out.println(sPath);

        if (sPath.equals("/e_selectAll.do")) {

            List<EmpVO> vos = dao.selectAll();
            System.out.println("vos.size():" + vos.size());

            request.setAttribute("vos", vos);

            request.getRequestDispatcher("emp/selectAll.jsp")
                    .forward(request, response);
        } else if (sPath.equals("/e_insert.do")) {

            request.getRequestDispatcher("emp/insert.jsp")
                    .forward(request, response);
        } else if (sPath.equals("/e_insertOK.do")) {

            String fname = request.getParameter("first_name");
            String lname = request.getParameter("last_name");
            String sal = request.getParameter("salary");
            String job = request.getParameter("job_id");
            String dept = request.getParameter("department_id");

            EmpVO vo = new EmpVO();
            vo.setFirst_name(fname);
            vo.setLast_name(lname);
            vo.setSalary(Integer.parseInt(sal));
            vo.setJob_id(job);
            vo.setDepartment_id(dept);

            int result = dao.insert(vo);
            if (result == 1)
                response.sendRedirect("e_selectAll.do");
            else
                response.sendRedirect("e_insert.do");
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

            //simple-json.jar 라이브러리사용 --> maven project이기 때문에 dependency 잡아줌
            JSONArray arr = new JSONArray();
            arr.addAll(job_ids);
            PrintWriter out = response.getWriter();
            out.print(arr);

        } else if (sPath.equals("/e.selectAll.join.do")) {
            List<String> job_ids = dao.selectJobID();
            System.out.println(job_ids);
        } else if (sPath.equals("/e.emp_dept_job")) {
            List<String> job_ids = dao.selectJobID();
            System.out.println(job_ids);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
