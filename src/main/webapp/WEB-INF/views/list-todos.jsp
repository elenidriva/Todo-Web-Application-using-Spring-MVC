<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">

<title>${name}'s To-do List </title>
</head>
<body>
	<h1> To-dos</h1>
 	<div>
 			<table class="table table-hover table-dark">
 				<thead>
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
 						</tr>
 					</c:forEach>
 				</tbody>
 			</table>
 		</div>				
 	<a class="button" href="/add-todo"> Add </a>
</body>
</html>



