<%-- 
    Document   : login
    Created on : Mar 26, 2017, 1:12:17 PM
    Author     : LW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" media="all" href="${pageContext.request.contextPath}/css/reset.css">
        <link rel="stylesheet" media="all" href="${pageContext.request.contextPath}/css/project.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
	<div id="login-box">

            
		<h2>Login with Username and Password</h2>
                <p>${error}</p>
		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>

		<form name='loginForm'
		  action="${pageContext.request.contextPath}/login" method='POST'>

		  <table>
			<tr>
				<td>User:</td>
				<td><input id='username' type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input id='password' type='password' name='password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input id='submitbutton' name="submit" type="submit"
					value="submit" /></td>
			</tr>
		  </table>

		  <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />

		</form>
	</div>
    </body>
</html>
