<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="save" modelAttribute="employee" method = "get">
@Id:<form:input path="id"/>
Name:<form:input path="name"/>
Salary:<form:input path="salary"/>
Phone:<form:input path="phone"/>
<input type="submit">
</form:form>
</body>
</html>