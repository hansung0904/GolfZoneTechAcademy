package com.test.maven;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.XSlf4j;

import java.io.IOException;

@WebServlet(name="setCookieServlet", urlPatterns = "/set-cookie")
@XSlf4j
public class SetCookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String locale = req.getParameter("locale");

        Cookie cookie = new Cookie("locale",locale);
        cookie.setPath("/");
        resp.addCookie(cookie);

        resp.getWriter().println("cookie ok");

    }
}
