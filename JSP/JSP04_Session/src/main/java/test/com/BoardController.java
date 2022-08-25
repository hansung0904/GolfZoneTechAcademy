package test.com;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({"/insert.do","/delete.do","/selectAll.do","/update.do","/searchList.do","/searchOne.do"})
public class BoardController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sPath = request.getServletPath();
        System.out.println("sPath: " + sPath);

        if (sPath.equals("/insert.do")) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("board/insert.jsp");
        } else if (sPath.equals(("/delete.do"))) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("board/delete.jsp");
        } else if (sPath.equals("/selectAll.do")) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("board/selectAll.jsp");
        } else if (sPath.equals("/update.do")) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("board/update.jsp");
        } else if(sPath.equals("/searchList.do")){
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("board/searchList.do");
        } else if (sPath.equals("/searchOne.do")) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(("board/searchOne.do"));
        }

    }

}
