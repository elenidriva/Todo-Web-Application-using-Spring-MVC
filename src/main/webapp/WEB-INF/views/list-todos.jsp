<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
<title>${name}'s To-do List </title>
</head>
<body>
	<p> </p>
	<h1 class="text-center text-info"> To-do List </h1>

 	<div class="table-responsive" style="text-align: center">
 			<table class="table table-dark table-hover">
 				<thead style="color:#6bc4c4;">
 						<tr>
 							<th> ID </th>
 							<th> Title </th>
 							<th> Description </th>
 							<th> Priority </th>
 							<th> Status </th>
 						</tr>
 				</thead>
 				<tbody>
 				<!-- Need to add jstl tag in order to implement this -->
 					<c:forEach items="${todos}" var ="todo">
 						<tr>
 							<td>${todo.id} </td>
 							<td>${todo.title} </td>
 							<td>${todo.description} </td>
 							<td>${todo.priority} </td>
 							<td>${todo.done} </td>
 							<td>
 								<a type="button" class="btn " style="color: #009da9;"
								href="/delete-todo?id=${todo.id}">Delete</a>
 							<!-- <a class="button" href="<c:url value= '/delete-todo/${todo.id}'/>" > Delete </a>	 -->
 							</td>
 						</tr>
 					
 					</c:forEach>
 				</tbody>
 			</table>
 			<a href="/add-todo" class="btn btn-info large" style="background-color: #009da9;" > Add </a>

 		</div>				

</body>
</html>



