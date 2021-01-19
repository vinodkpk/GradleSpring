<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    Alien  ${obj.aid} , ${obj.name}, ${obj.lang}

    <form action="addAlien">
    <input type="text" name="name"><br>
    <input type="text" name="lang"><br>
    <input type="submit"><br>
    </form>
</body>
</html>

