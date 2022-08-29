package com.golfzon.session;

import javax.servlet.ServletContext;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspWriter;
import java.util.List;

/*
 * pageContext 내장 객체 (JspContext API)
 * */
public abstract class PracticeSession {

    abstract public Object getAttribute(String name, int scope);

    abstract public void setAttribute(String name, Object Value, int scope);

    abstract public JspWriter getOut();

    abstract public SevletRequest getRequest();

    abstract public ServletResponse getResponse();

    abstract public HttpSession getSession();

    abstract public ServletContext getServletContext();

    abstract public Exception getException();

    abstract public void forward(String relativeUrlPath) /*..*/;

    abstract public void include(String relativeUrlPath) /*..*/;

    // 다음 두 개의 차이점은 뭘까?
    // /pageContext.jsp?type=include
    // /pageContext.jsp?type=forward


}
