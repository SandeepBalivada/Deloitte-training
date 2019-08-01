<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Students page</title>
</head>
<body>
  <table border="2">
      <tr>
          <th><b>Regno</b><th><b>Stdname</b><th><b>Marks</b>
       </th>
       <c:forEach var="std" items="${list}">
           <tr>
               <td><c:out value="${std.regno}"></c:out></td>
               <td><c:out value="${std.stdname}"></c:out></td>
               <td><c:out value="${std.marks}"></c:out></td>
               <td><a href="update?rno=${std.regno}">Update</a></td>
               <td><a href="delete?rno=${std.regno}">Delete</a></td>
           </tr>
         </c:forEach>
  </table> <br>
  <a href="addstd">Add new Student</a>
</body>
</html>