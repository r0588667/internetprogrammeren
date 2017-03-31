<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="nl">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
<title>Bevestiging verwijderen gegevens</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
<link rel="stylesheet" media="all" href="css/reset.css">
<link rel="stylesheet" media="all" href="css/project.css">
<link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
</head>
<body>
	<nav class="nav">
		<ul>
			<li><a href="index.html">Home</a></li>
			<li class="current"><a href="studentForm.jsp">Voeg een
					student toe</a></li>
			<li><a href="findStudentForm.jsp">Zoek een student op</a></li>
			<li><a href="StudentInfo?action=read">Overzicht</a></li>
		</ul>
	</nav>

	<header>
		<h1>
			<img src="images/studenten.jpg" alt="banner studenten">
		</h1>
		<p>
			<span class="bron">Studenten, met dank aan <a
				href="http://www.ucll.be/">UCLL</a>.
			</span>
		</p>
	</header>
    
<main>
<section>
<h2>Bevestiging te verwijderen gegevens</h2>
 <p>Ben je zeker dat je de student met de naam <%=request.getParameter("naam")%> wil verwijderen?</p>   
    <form method="post" action="StudentInfo?action=deleteConfirmed"> 
    <p>
        <input type="submit" name="submit" value="Zeker">
        <input type="submit" name="submit" value="Neen, toch niet">
        <input type="hidden" name="naam" value="<%=request.getParameter("naam")%>">
    </p>
</form>
</section>
</main>

</body>
</html>