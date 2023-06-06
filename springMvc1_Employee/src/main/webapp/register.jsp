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
<!-- <form:form action="save" modelAttribute="employee">
Id:<form:input path="id"/>
Name:<form:input path="name"/>
Salary:<form:input path="salary"/>
Phone:<form:input path="phone"/>
<input type="submit">
</form:form>  -->

<form action="save" modelAttribute="employee" method="get">
<table>
<tr>
 <td> Id <input type="number" name="id"> </td> <br>


 <td> Name <input type="text" name="name"> </td> <br>

 <td> Salary <input type="number" name="salary">  </td> <br>

 <td>  Phone <input type="number" name="phone">  </td> <br>

 <td> <input type="submit" value="submit"> </td>
 </tr>
 </table>
</form>
</body>
</html>