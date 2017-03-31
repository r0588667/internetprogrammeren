<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.Collection"%>
<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="nl">
<head>
<meta charset="UTF-8">
<title>Voeg een Film toe</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
<link rel="stylesheet" media="all" href="${pageContext.request.contextPath}/css/reset.css">
<link rel="stylesheet" media="all" href="${pageContext.request.contextPath}/css/project.css">
<link href='https://fonts.googleapis.com/css?family=Roboto'
	rel='stylesheet' type='text/css'>
</head>

<body>
<%@include file="header.jspf"%>
	<div class="container">
            <main>
		<section>
                    <br>
                    <h2>Voeg een Film toe</h2>
                    <c:choose>
                        <c:when test="${empty movie.name}">
                            <%@include file="addForm.jspf"%>
                        </c:when>
                        <c:otherwise>
                            <%@include file="updateForm.jspf"%>
                        </c:otherwise>
                        </c:choose>
			</section>
		</main>
</body>
</html>