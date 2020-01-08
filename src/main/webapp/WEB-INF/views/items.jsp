<%@ page import="java.util.List" %>
<%@ page import="com.item.model.Item" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Item Page</title>
</head>
<body>

    <form action="/add" method="post">
        Name : <input type="text" name="name">
        Price : <input type="number" name="price">
        <input type="submit" value="Add">
    </form>

    <table cellpadding="20">
        <tr>
            <td>
                ID
            </td>
            <td>
                NAME
            </td>
            <td>
                PRICE
            </td>
            <td>
                DELETE
            </td>
        </tr>
        <c:forEach items="${items}" var="item">
            <tr>
                <td>
                        ${item.id}
                </td>
                <td>
                        ${item.name}
                </td>
                <td>
                        ${item.price}
                </td>
                <td>
                    <a href="edit/${item.id}">EDIT</a>
                </td>
                <td>
                    <a href="delete/${item.id}">DELETE</a>
                </td>
            </tr>
        </c:forEach>
    </table>


</body>
</html>
