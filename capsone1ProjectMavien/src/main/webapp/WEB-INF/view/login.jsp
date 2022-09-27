<%--
  Created by IntelliJ IDEA.
  User: ibrah
  Date: 16/04/2022
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login sign</title>
</head>
<body>
<h1>Login </h1>
<form action="login.do" method="post">
    <label>Nom</label>
    <input type="text" name="username">
    <label>password</label>
    <input type="password" name="password">
    <button type="submit">Ok</button>
</form>
</body>
</html>