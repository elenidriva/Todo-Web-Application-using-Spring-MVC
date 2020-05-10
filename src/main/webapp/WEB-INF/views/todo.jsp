<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Login Page</title>
</head>
<body>
    <form action="/add-todo" method="POST">
        <fieldset class="form-group">
        Title: <input name="title" type="text" />
        <p>Description : <input name="description" type="text" /> </p>
        <p>High Priority : 
        	<input name="priority" value="HIGH" type="radio"> 
       		 <label for="HIGH"> High </label>
        	<input name="priority" value="MEDIUM" type="radio"> 
       		 <label for="MEDIUM"> Medium </label>
        	<input name="priority" value="LOW" type="radio"> 
       		 <label for="LOW"> Low </label>
       	 	
       	 	<!-- <label for="targetDate">Deadline : </label> 
       	 	<input type="targetDate" name="targetDate"> -->
		</fieldset>
       	<input type="submit" class="btn btn-info" value="Add" />
        </p>
    </form>
</body>
</html>