
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit Page</title>
</head>
<body>
    <h1>
        Edit Page
    </h1>

    <form action="/update" method="post">
        Name : <input type="text" name="name" value="${item.name}">
        Price : <input type="number" name="price" value="${item.price}">
        <input type="hidden" value="${item.id}" name="id">
        <input type="submit" value="Save">
    </form>
</body>
</html>
