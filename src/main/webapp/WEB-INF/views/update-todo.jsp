<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<script type="text/javascript" src="<c:url value="/resources/JS/main.js" />"> </script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<title>Login Page</title>
</head>
<body>
	<div class="col-md-6 offset-md-3">
    	<div class="card card-outline-secondary">
       		<div class="card-header">
            	<h3 class="mb-0 text-center" > <b> Edit To do no. ${id} </b></h3>
            </div>
            <div class="card-body">
    			<form action="/update-todo" method="POST" class="form anchor">
     				<div class="form-group text-center">
        				<div class="form-group">
        					Title: <pre> <textarea name="title" type="text" class="form-control"  style="height: 50px;white-space:pre-wrap; word-wrap:break-word" required>${title}</textarea> </pre>
        				<br> </br>
        				<p>Description : <textarea name="description" type="text" id="string" class="form-control"  style="height: 100px;" required>${description}</textarea> </p>
        				<p>High Priority : 
        					<input name="priority" value="HIGH" type="radio"> 
       		 					<label for="HIGH"> High </label>
        					<input name="priority" value="MEDIUM" type="radio"> 
       		 					<label for="MEDIUM"> Medium </label>
        					<input name="priority" value="LOW" type="radio"> 
       		 					<label for="LOW"> Low </label>
       	 				<p>Due in : 			<textarea type="text"  id = "targetDate" name = "targetDate" class="form-control" value ="${targetDate}" placeholder=" Please follow this format: mm/dd/yyyy" required="required" />${targetDate}</textarea> </p>
       	 					<form:errors path="targetDate" cssClass="text-warning" />
						</div>
       					<input type="submit" class="btn btn-info" value="Add" id="demo" />
        			</div>
    			</form>
 			</div>
		</div>
	</div>
</body>
<%@ include file="common/footer.jspf"%>
</html>