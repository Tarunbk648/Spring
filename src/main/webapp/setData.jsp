<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored = "false" %><html>
<html>
    <body>
       <form action="set" method="post">
          </label><input type="hidden" name="driveId" value="${ById.getDriveId()}" placeholder="Enter the Drive Id"></input>
          <label>Drive Name:</label><input type="text" name="driveName" value="${ById.getDriveName()}" placeholder="Enter the Drive Name"></input>
          <label>Drive Date:</label><input type="text" name="driveDate" value="${ById.getDriveDate()}" placeholder="Enter the Drive Date"></input>
          <label>Drive Address:</label><input type="text" name="driveAddress" value="${ById.getDriveAddress()}" placeholder="Enter the Drive Address"></input>

          <button type="submit">SET</button>

       </form>
    </body>
  </html>