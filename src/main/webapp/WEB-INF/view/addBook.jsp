<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form modelAttribute="addBookRequest" action="addBook"
		method="post">
        Cím: <form:input path="title" />
		<form:errors path="title" element="div" cssStyle="color:red;" />
		<br />
        Műfaj:
        <form:select path="genre">
			<c:forEach items="${addBookModel.genres}" var="g">
				<form:option value="${g.code}">
					<c:out value="${g}" />
				</form:option>
			</c:forEach>
		</form:select>
		<form:errors path="genre" element="div" cssStyle="color:red;" />
		<br />
        
        Szerző:
        <form:select path="authorId">
			<c:forEach items="${addBookModel.authors}" var="a">
				<form:option value="${a.id}">
					<c:out value="${a.name}" />
				</form:option>
			</c:forEach>
		</form:select>
		<form:errors path="authorId" element="div" cssStyle="color:red;" />
		<br />

		<form:button name="save" value="save">Mentés</form:button>
	</form:form>

</body>
</html>