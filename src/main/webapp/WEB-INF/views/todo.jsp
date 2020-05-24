<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<title>Login Page</title>
</head>
<body>

                <div class="col-md-6 offset-md-3">
                    <div class="card card-outline-secondary">
                        <div class="card-header">
                            <h3 class="mb-0 text-center" >Add a to-do</h3>
                        </div>
                        <div class="card-body">
    <form action="/add-todo" method="POST" class="form anchor">
     <div class="form-group text-center">
        <div class="form-group">
        Title: <input name="title" type="text" class="form-control" value="${title}" required="required" />
        <br> </br>
        <p>Description : <input name="description" type="text" class="form-control"  value="${description}" required="required" /> </p>
        <p>Priority :  
        	<input name="priority" value="HIGH" type="radio"> 
       		 <label for="HIGH"> High </label>
        	<input name="priority" value="MEDIUM" type="radio"> 
       		 <label for="MEDIUM"> Medium </label>
        	<input name="priority" value="LOW" type="radio"> 
       		 <label for="LOW"> Low </label>
       	 <p>Due in : 			<input type="text"  id = "targetDate" name = "targetDate" class="form-control" value ="${targetDate}" placeholder=" Please follow this format: 20/20/2020" required="required" /> </p>
       	 	<form:errors path="targetDate" cssClass="text-warning" />
       	 	<!-- <label for="targetDate">Deadline : </label> 
       	 	<input type="targetDate" name="targetDate"> -->
		</div>
       	<input type="submit" class="btn btn-info" value="Add" />
        </div>
    </form>
 </div>
            </div>

</div>

</body>
<%@ include file="common/footer.jspf"%>
<script>
	$('#targetDate').datepicker({
		format : 'dd/mm/yyyy'
	});
</script>
</html>