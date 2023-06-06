<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1px">
<tr>
<th>Id</th>
<th>Name</th>
<th>Salary</th>
<th>Phone</th>
</tr>
<c:forEach var="employee" items="${employee}">
<tr>
<td>${employee.id}</td>
<td>${employee.name}</td>
<td>${employee.salary}</td>
<td>${employee.phone}</td>
</tr>
</c:forEach>
</table>


</body>
</html>