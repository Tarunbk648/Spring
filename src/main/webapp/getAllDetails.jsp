<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored = "false" %><html>
<html>
<body>
  <table border=1>
   <tr>
     <th>SI.NO</th>
     <th>Drive Name</th>
     <th>Drive Date</th>
     <th>Drive Address</th>
     <th colspan=2>Action</th>
   </tr>
   <c:forEach var="dto" items="${dtos}" varStatus="status">
     <tr>
       <td>${status.count}</td>
       <td>${dto.getDriveName()}</td>
       <td>${dto.getDriveDate()}</td>
       <td>${dto.getDriveAddress()}</td>
       <td><a href="update?id=${dto.getDriveId()}">UPDATE</a></td>
       <td><a href="delete?id=${dto.getDriveId()}">DELETE</a></td>
     </tr>
   </c:forEach>
   </table>
</body>
</html>
