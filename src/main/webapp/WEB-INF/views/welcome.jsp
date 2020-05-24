<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<title>To-do list Welcome Page</title>
</head>
<body>
<div class="container">
 <h1>Welcome, ${name} </h1>

<h2> <a href="/list-todos"> Here</a> you can manage the To-do list.</h2>
 </div>

</body>
<%@ include file="common/footer.jspf"%>
</html>