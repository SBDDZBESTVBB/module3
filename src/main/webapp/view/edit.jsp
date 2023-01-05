<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Create Customer</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h2>Create Form</h2>
    <form action="/createServlet1?id=${employ.id}" method="post">
        <div class="form-group">
            <label>Name:</label>
            <input  class="form-control" placeholder="Enter name" name="name">
        </div>
        <div class="form-group">
            <label>Email:</label>
            <input  class="form-control" placeholder="Enter email" name="email">
        </div>
        <div class="form-group">
            <label>Address:</label>
            <input  class="form-control"  placeholder="Enter address" name="address">
        </div>
        <div class="form-group">
            <label>Phone number:</label>
            <input  class="form-control" placeholder="Enter phone" name="phone">
        </div>
        <div class="form-group">
            <label>Salary:</label>
            <input  class="form-control"  placeholder="Enter salary" name="salary">
        </div>
        <div class="form-group">
            <label>Salary:</label>
            <input  class="form-control"  placeholder="Enter department" name="department">
        </div>

        <button type="submit" class="btn btn-default">Save</button>
    </form>
</div>

</body>
</html>