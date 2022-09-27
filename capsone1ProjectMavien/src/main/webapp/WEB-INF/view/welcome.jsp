<%@ page import="sarayatech.model.Todo" %>
<%@ page import="java.util.List" %>

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
    <title>todo list</title>
</head>
<body>
        <h1>add todo</h1>
        <form method="post">
            <label>Name :</label> <input type="text" name="name">
            <label>create date :</label> <input type="date" name="createDate">
            <label>end date :</label> <input type="date" name="endDate">
            <label>Status :</label>
            <select name="status">
                <option value="true">oui</option>
                <option value="false">nom</option>
            </select>
            <button type="submit">Add</button>
        </form>
        <h1>Todo list</h1>
        <table>
            <thead>
                <th>Name</th>
                <th>Create date</th>
                <th>End date</th>
                <th>Status</th>
                <th>Actions</th>
            </thead>
            <tbody>

            <%
                List<Todo> todos = (List<Todo>) request.getAttribute("todos");

                if(todos!=null) {
            %>
            <% for (Todo todo: todos) { %>

            <tr>
                <td> <%= todo.getName() %></td>
                <td> <%= todo.getCreatedAt() %></td>
                <td> <%= todo.getEnbdAt() %></td>

                <td> <%= todo.isStatus() %></td>
                <td>
                  <a href="#"><button type="button">delele</button></a>
                </td>
            </tr>
            <%    }} %>

            </tbody>
        </table>
</body>
</html>
