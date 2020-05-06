<html>
<head>
<title>Login Page</title>
</head>
<body>
    <form action="/add-todo" method="POST">
        
        Title: <input name="title" type="text" />
        <p>Description : <input name="description" type="text" /> </p>
        <p>High Priority : 
        	<input name="priority" value="HIGH" type="radio"> 
       		 <label for="HIGH"> High </label>
        	<input name="priority" value="MEDIUM" type="radio"> 
       		 <label for="MEDIUM"> Medium </label>
        	<input name="priority" value="LOW" type="radio"> 
       		 <label for="LOW"> Low </label>
       	 	
       	 	<!-- <label for="targetDate">Deadline : </label>  -->

<input type="targetDate" name="targetDate">
       	<input type="submit" value="Add" />
        </p>
    </form>
</body>
</html>