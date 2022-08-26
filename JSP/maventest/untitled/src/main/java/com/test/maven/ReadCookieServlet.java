package com.test.maven;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.XSlf4j;

import javax.servlet.http.Cookie;


import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;

@WebServlet(name = "readCookieServlet", urlPatterns = "/read-cookie")
@XSlf4j

public class ReadCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        jakarta.servlet.http.Cookie[] cookies = req.getCookies();

        // req에서는 쿠키 1개만 읽어오는 메소드는 제공하지 x
        // 아래 arrays로 뽑아낸다.

        Cookie cookie = Arrays.stream(cookies).filter(e - > e.getName().equals(e.getName())).findFirst().orElse(null);

        if (Objects.isNull(cookie)) {
            resp.sendError(500, "cookie not found");
            return;
        }

        // 쿠키의 value에 따라 msg번역
        String locale = cookie.getValue();
        String helloValue = ResourceBundle.getBundle("message", new Locale(locale)).getString("hello");

        resp.setContentType("text/plain");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().println(helloValue);

    }
}
