<%@ page import="java.util.List" %>
<%@ page import="java.util.Objects" %>
<%@ page import="java.util.Collections" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Chs
  Date: 2022-08-29
  Time: 오후 2:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/src/main/webapp/index2j.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>></title>
</head>
<body>
<%!
    private List<String> getClasses(Class<?> clazz) {
        if (Objects.isNull(clazz)) {
            return Collections.emptyList();
        }

        List<String> classes = new ArrayList<>();

        while (clazz != null) {
            classes.add(clazz.getName());
            clazz = clazz.getSuperclass();
        }
        return classes;
    }
%>
<%
    response.setContentType("text/plain"); // response
    out.println("Hello " + request.getParameter("name")); // request
    out.println("servlet name = " + config.getServletName()); //config
    out.println("context path = " + application.getContext("practice")); // application
    out.println("this == page?" + (this == page));
    List<String> classes = getClasses(getClass()); //page
    out.println("page classes = " + String.join(" > ", classes));
    classes = getClasses(pageContext.getClass()); // pagecontext
    out.println("pageContext classes = " + String.join(" > ", classes));
%>

}
%>
</body>
</html>
