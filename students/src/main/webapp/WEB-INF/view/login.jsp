<%--
  Created by IntelliJ IDEA.
  User: ibrah
  Date: 14/04/2022
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Form login</h1>
    <i style="Color: red">${error}</i>
    <form action="/login.do" method="post">
      name: <input type="text" name="name">
      password: <input type="password" name="password">
      <button type="submit">Valider</button>
    </form>
</body>
</html>
