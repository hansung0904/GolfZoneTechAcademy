package com.test.maven;

import lombok.extern.slf4j.XSlf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "setCookieServlet", urlPatterns = "/set-cookie")
@XSlf4j
public class SetCookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String locale = req.getParameter("locale");

        Cookie cookie = new Cookie("locale", locale);
        cookie.getPath("/");
        resp.addCookie(cookie);

        resp.getWriter().println("cookie ok");

    }
}
