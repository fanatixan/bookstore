<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form modelAttribute="login" method="post" action="spring_security_check">
		Felhasználónév:
		<form:input path="username" />
		<br />
		Jelszó:
		<form:password path="password" />
		<br />
		<form:button>Bejelentkezés</form:button>
	</form:form>

</body>
</html>