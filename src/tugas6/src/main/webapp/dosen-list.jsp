<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored = "false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Database Dosen</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<style rel="stylesheet" type="text/css" href="style.css">
.table {
    font-family: sans-serif;
    color: #444;
    border-collapse: collapse;
    width: 50%;
    border: 1px solid #f2f5f7;
}
 
.table tr th{
    background: #35A9DB;
    color: #fff;
    font-weight: normal;
}
 
.table, th, td {
    padding: 8px 20px;
    text-align: center;
}
 
.table tr:hover {
    background-color: #f5f5f5;
}
 
.table tr:nth-child(even) {
    background-color: #f2f2f2;
}
</style>

</head>
<body>
	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color:turquoise;">
			<div>
				<a href="https://www.javaguides.net" class="navbar-brand">
					Database Dosen </a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Dosen</a></li>
			</ul>
		</nav>
	</header>
	<br>
		<div class="row">

		<div class="container">
			<h3 class="text-center">Database Dosen</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add
					New Dosen</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="dosen" items="${listDosen}">

						<tr>
							<td><c:out value="${dosen.id}" /></td>
							<td><c:out value="${dosen.nama}" /></td>
							<td><a href="edit?id=<c:out value='${dosen.id}' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; 
								<a href="delete?id=<c:out value='${dosen.id}' />"
								onclick="return confirm('Are you sure you want to delete this data?')">
								Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>