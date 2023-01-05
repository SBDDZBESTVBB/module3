<%--
  Created by IntelliJ IDEA.
  User: TEO
  Date: 12/24/2022
  Time: 4:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Customer Management</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h2>Student Management Service</h2>
    <div class="search-bar">
        <form class="search-form d-flex align-items-center" method="get" action="/Search">
            <input type="text" name="search" placeholder="Enter name of student" title="Enter search keyword">
            <button type="submit" title="Search"><i class="bi bi-search"></i>Search</button>
        </form>
    </div>
    <br>
    <div>
        <a href="/view/add.jsp"><button type="button" name="create" class="btn btn-success">Create</button></a>
    </div>
    <br>
    <table class="table" border="1" >
        <thead>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            <th>Phone Number</th>
            <th>Salary</th>
            <th>Department</th>
            <th colspan="2">Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="p" items="${employee}">
            <tr>
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>${p.email}</td>
                <td>${p.address}</td>
                <td>${p.phoneNumber}</td>
                <td>${p.salary}</td>
                <td>${p.department}</td>
                <td><a href="/editServlet?id=${p.id}" class="btn btn-warning" >Edit</a></td>
                <td><a href="/DeleteServlet?id=${p.id}" class="btn btn-danger">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>

    </table>
</div>

</body>
</html>