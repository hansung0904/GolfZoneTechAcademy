<%--
  Created by IntelliJ IDEA.
  User: Chs
  Date: 2022-08-31
  Time: 오후 1:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>fileUploadWithJsp</title>
</head>

<body>

<h1>fileUpload</h1>

<form action="/fileUpload.do" enctype="multipart/form-data">

  <input type="text" name="name" value="kim">
  <input type="text" name="age" value="33">
  <input type="file" name="upFile">
  <input type="submit">

</form>

</body>
</html>
