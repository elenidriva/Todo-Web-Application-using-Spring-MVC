<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
</head>

<body>

	<h1 class="text-center text-info"> ${name}'s To-do List </h1>
 	<div class="table-responsive" style="text-align: center" id="demo1">
 			<table class="table table-dark table-hover">
 				<thead style="color:#6bc4c4;">
 						<tr>
 							<th> ID </th>
 							<th> <b> Title </b> </th>
 							<th> Description </th>
 							<th> Priority </th>
 							<th> Due In </th>
 							<th> Done </th>
 						</tr>
 				</thead>
 				<tbody>
 				<!-- Need to add jstl tag in order to implement this -->
 					<c:forEach items="${todos}" var ="todo">
 						<tr>
 							<td>${todo.id} </td>
 							<td style="white-space:pre;"><b>${todo.title}</b> </td>
 							<td style="white-space:pre;">${todo.description} </td>
 							<td class="textholder">${todo.priority}</td>
 							<td>${todo.targetDate}</td>
 							<td>${todo.done}</td>
 							<td>
 								<a type="button" class="btn btn-info large " style="background-color: #009da9;"
 								href="/update-todo?id=${todo.id}&title=${todo.title}&description=${todo.description}">Edit</a>
 								<a type="button" class="btn btn-info large " style="background-color: #A81B08; border-color:#A81B08"
								href="/delete-todo?id=${todo.id}" onclick="return confirm('Are you sure you want to delete this task?')">Delete</a>
 							<!-- <a class="button" href="<c:url value= '/delete-todo/${todo.id}'/>" > Delete </a>	 -->
 							</td>
 						</tr>
 					
 					</c:forEach>
 				</tbody>
 			</table>
 			<a href="/add-todo" class="btn btn-info large" style="background-color: #009da9;" > Add </a>
			<!-- <a id="addButton" class="btn btn-info large" style="background-color: #009da9;" >  JS Add </a>  -->
 		</div>				
</body>
<script type="text/javascript" src="<c:url value="/resources/JS/extras.js" />"></script>
<%@ include file="common/footer.jspf"%>
</html>



