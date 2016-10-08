<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main page Shopbook</title>
</head>
<body>
<h3 align="center">WELCOME TO SHOPBOOK</h3>
<br/>
<p align="center">
    <a href="<c:url value="/books"/>" target="_blank">BOOK LIST</a>
    <br/>
    <a href="<c:url value="/authors"/>" target="_blank">AUTHOR LIST</a>

</p>
<br/>
</body>
</html>