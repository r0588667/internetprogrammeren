
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="nl">
<head>
<meta charset="UTF-8">
<title>Zoek een Film op</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
<link rel="stylesheet" media="all" href="css/reset.css">
<link rel="stylesheet" media="all" href="css/project.css">
<link href='https://fonts.googleapis.com/css?family=Roboto'
	rel='stylesheet' type='text/css'>
</head>

<body>
        <%@include file="header.jspf"%>
	<header>
		<h1>
			<img src="images/studenten.jpg" alt="banner studenten">
		</h1>
	</header>

	<div class="container">
		<main>
		<section>
                    <br>
			<h2>Vind een Film</h2>
			<form method="post" action="" novalidate>
				<fieldset>
					<legend>Welke Film wil je zoeken?</legend>
					<p>
						<label for="naam">Naam (verplicht)</label> <input type="text"
							id="naam" name="naam" required>
					</p>
					<p>
						<label for="voornaam">Voornaam (verplicht)</label> <input
							type="text" id="voornaam" name="voornaam" required>
					</p>
				</fieldset>
				<p>
					<input type="submit" value="Zoek student">
				</p>

			</form>
		</section>
		</main>

	</div>
</body>
</html>