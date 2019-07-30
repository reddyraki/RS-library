<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body, html {
	height: 100%;
	font-family: Arial, Helvetica, sans-serif;
}

* {
	box-sizing: border-box;
}

.bg-img {
	/* The image used */
	background-image: url("C:\Users\Rakesh\Downloads\projectpic1.jpg");
	min-height: 400px;
	/* Center and scale the image nicely */
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
	position: relative;
}

/* Add styles to the form container */
.container {
	position: absolute;
	right: 0;
	margin: 20px;
	max-width: 300px;
	padding: 16px;
	background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
	background-color: #ddd;
	outline: none;
}

/* Set a style for the submit button */
.btn {
	background-color: #4CAF50;
	color: white;
	padding: 16px 20px;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

.btn:hover {
	opacity: 1;
}
</style>
</head>
<body>

	<h2>A Book is alwaya a Best Friend</h2>
	<div class="bg-img">
		<form action="LoginUser" class="container">
			<h1>Login</h1>

			<label for="UserName"><b>Email</b></label> <input type="text"
				placeholder="Enter Email" name="UserName" required> <label
				for="Password"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="Password" required>

			<button type="submit" class="btn">Login</button>
		</form>
	</div>
	<div class="bg-img">
		<form action="RigesterNewUser" class="container">


			<label for="Registration"><b>New Registration</b></label>
			<!-- <input type="text" placeholder="Enter Email" name="UserName" required> -->



			<button type="submit" class="btn">Register</button>
		</form>
	</div>


	<p>this is login page</p>

</body>
</html>


















<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action= "LoginUser">
User Name:<input type="text" name="UserName"><br>
Password:<input type="password" name="Password"><br>
<input type="submit" value="Login">

</form>

</body>
</html> --%>