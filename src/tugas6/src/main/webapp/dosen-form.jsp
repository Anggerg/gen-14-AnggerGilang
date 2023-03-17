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
			style="background-color: turquoise;">
			<div>
				<a href="https://www.javaguides.net" class="navbar-brand"> Database Dosen </a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Dosen</a></li>
			</ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${dosen != null}">
					<form action="update" method="post"><
				</c:if>
				<c:if test="${dosen == null}">
					<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
					<c:if test="${dosen != null}">
            			Edit Dosen
            		</c:if>
						<c:if test="${dosen == null}">
            			Add new Dosen
            		</c:if>
					</h2>
				</caption>

				<c:if test="${dosen != null}">
					<input type="hidden" name="id" value="<c:out value='${dosen.id}' />" />
				</c:if>

				<fieldset class="form-group">
					<label>ID</label> <input type="text"
						value="<c:out value='${dosen.id}' />" class="form-control"
						name="id" required="required">
					<label>Nama Dosen</label> <input type="text"
						value="<c:out value='${dosen.nama}' />" class="form-control"
						name="nama" required="required">
				</fieldset>
				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
	
</body>
</html>