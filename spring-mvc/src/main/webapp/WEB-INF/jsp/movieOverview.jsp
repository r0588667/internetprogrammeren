<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="nl">
<head>
<meta charset="UTF-8">
<title>Overzicht Films</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
<link rel="stylesheet" media="all" href="${pageContext.request.contextPath}/css/reset.css">
<link rel="stylesheet" media="all" href="${pageContext.request.contextPath}/css/project.css">
<link href='https://fonts.googleapis.com/css?family=Roboto'
	rel='stylesheet' type='text/css'>
</head>

<body>
<%@include file="header.jspf"%>
<a href="<c:url value='/j_spring_security_logout'/>">Logout</a>
	<div class="container">
		<main>
		<section>
                    <br>
			<h2>Overzicht Films</h2>
			<table id="overview">
				<thead>
					<tr>
                                                <th>ID</th>
						<th>Name</th>
						<th>Genre</th>
                                                <th class="getal">Rating</th>
						<th>Verwijder</th>
						<th>Update</th>
					</tr>
				</thead>
				<tbody>
                                    <c:forEach var="movie" items="${movies}">
					<tr id="movieInfo">
                                                <td>${movie.id}</td>
						<td>${movie.name}</td>
						<td>${movie.genre}</td>
						<td class="getal">${movie.rating}</td>
						<td><a href="${pageContext.request.contextPath}/movie/${movie.id}/delete.htm">Verwijder</a></td>
						<td><a href="${pageContext.request.contextPath}/movie/${movie.id}/update.htm">Update</a></td>
					</tr>
                                    </c:forEach>
				</tbody>
			</table>
                        <p> The Average Rating of all Films is : ${avg} </p>
                        <a href="<c:url value='/movie/login.htm?logout'/>">Logout</a>
                        <a href="${pageContext.request.contextPath}/movie/getTXT.htm" download>GetTXT</a>
                        <a href="${pageContext.request.contextPath}/movie/getCSV.htm" download>GetCSV</a>
			</article>
		</main>
</body>
</html>