<%@ page import="java.util.List" %>
<%@ page import="java.util.Objects" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="numberList" scope="request" type="java.util.List<java.lang.Integer>" class="java.util.ArrayList">
    <jsp:useBean id = "user1" scope="request" class="com.golfzon.session.User" />
    <jsp:setProperty name="user1" property="age" value="35" />
    THIS IS pageContext.jsp.<br/>
    <%
        String type = request.getParameter("type");
        if ("include".equals(type)) {
            pageContext.include("sub.jsp");

        } else if ("forward".equals(type)) {
            pageContext.forward("sub.jsp");
        } else {
            out.println("type parameter is needed");
        }
    %>


    THIS IS SUB PAGE. TYPE IS <%= request.getParameter("type")%>.

    <%--<%--%>
    <%--    List<Integer> numberList = request.getAttribute("numberList");--%>
    <%--    if(Objects.isNull(numberList)) {--%>
    <%--        numberList = new ArrayList<>();--%>
    <%--        request.setAttribute("numberList",numberList);--%>
    <%--    }--%>
    <%--%>--%>

