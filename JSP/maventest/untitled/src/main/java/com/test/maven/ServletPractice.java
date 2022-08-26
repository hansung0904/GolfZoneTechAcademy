package com.test.maven;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*  sendError method는 porotocol 상의 errormsg를 보낼 수 있다.
 *  ex) 404 , "요청하신 페이지를 찾을 수 없습니다."
 *  parameter에 각종 에러코드를 넣어보고 msg에 String으로 에러메세지를 출력해보자
 * */
public class ServletPractice extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendError(getMethodNotSupportedCode(protocol), msg);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendError(getMethodNotSupportedCode(protocol), msg);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendError(getMethodNotSupportedCode(protocol), msg);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendError(getMethodNotSupportedCode(protocol), msg);
    }

}