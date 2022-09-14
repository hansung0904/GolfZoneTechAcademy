package test.com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;

import test.com.model.DeptDAO;
import test.com.model.DeptVO;
import test.com.model.EmpDAO;
import test.com.model.EmpDAOimpl;
import test.com.model.EmpVO;

/**
 * Servlet implementation class EmpController
 */
@WebServlet({"/d_selectAll.do","/d_insert.do",
	"/d_insertOK.do",
	"/json_emp_id.do","/json_loc_id.do"})
public class DeptController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DeptDAO dao = new DeptDAOimpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeptController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet....");
		String sPath = request.getServletPath();
		System.out.println(sPath);
		
		if(sPath.equals("/d_selectAll.do")) {
			
			List<DeptVO> vos = dao.selectAll();
			System.out.println("vos.size():"+vos.size());
			
			request.setAttribute("vos", vos);
			
			request.getRequestDispatcher("dept/selectAll.jsp")
								.forward(request, response);
		}else if(sPath.equals("/d_insert.do")) {
			
			request.getRequestDispatcher("dept/insert.jsp")
								.forward(request, response);
		}else if(sPath.equals("/d_insertOK.do")) {
			
			String department_name = request.getParameter("department_name");
			String manager_id = request.getParameter("manager_id");
			String location_id = request.getParameter("location_id");
			
			DeptVO vo = new DeptVO();
			vo.setDepartment_name(department_name);
			vo.setManager_id(Integer.parseInt(manager_id));
			vo.setLocation_id(Integer.parseInt(location_id));
			
			int result = dao.insert(vo);	
			if(result==1)
				response.sendRedirect("d_selectAll.do");
			else 
				response.sendRedirect("d_insert.do");
		}else if(sPath.equals("/json_emp_id.do")) {
			
			List<Integer> emp_ids = dao.selectEmpID();
			System.out.println("emp_ids.size():"+emp_ids.size());
//			
			PrintWriter out = response.getWriter();
			out.print(emp_ids.toString());
//			out.print("[100,101,102]");

		}else if(sPath.equals("/json_loc_id.do")) {
			List<Integer> loc_ids = dao.selectLocID();
			System.out.println("loc_ids.size():"+loc_ids.size());
//			
			PrintWriter out = response.getWriter();
			out.print(loc_ids.toString());
//			out.print("[100,101,102]");
			
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
