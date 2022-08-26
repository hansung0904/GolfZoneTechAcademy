package com.test.maven;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import lombok.extern.slf4j.XSlf4j;

import java.util.logging.LogRecord;

@WebFilter(filterName = "characterEncodingFilter", urlPatterns = "/*", initParams = {
        @WebInitParam(name = "encoding", value = "UTF-8")
})

@XSlf4j
public class CharacterEncodingFilter  implements Filter {
    private String encoding;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        encoding = filterConfig.getInitParameter("encoding");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.error("CharacterEncoding doFilter() before");
        (servletRequest).setCharacterEncoding(encoding);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }
}
