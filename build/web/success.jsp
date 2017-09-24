<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
<link href="Styles/Main.css" rel=stylesheet>
<title>Titan Online Banking Application</title>

<h1>Success!</h1>
<p> Congratulations on successfully creating an account!</p>
<p>Here is the information that you entered:</p>

<label>First Name:</label>
<span>${user.firstName}</span><br>
<label>Last Name:</label>
<span>${user.lastName}</span><br>
<label>Phone Number:</label>
<span>${user.num}</span><br>
<label>Address:</label>
<span>${user.address}</span><br>
<label>City:</label>
<span>${user.city}</span><br>
<label>State:</label>
<span>${user.state}</span><br>
<label>Zip Code:</label>
<span>${user.zipCode}</span><br>
<label>Email:</label>
<span>${user.email}</span><br>
<br>
<hr>
<br>
<label>Username:</label>
<span>${username}</span><br>
<label>Password:</label>
<span>${password}</span>


<form action="" method="post">
    <input type="hidden" name="action" value="join">
    <input type="submit" value="Return">
</form>
<c:import url="/includes/footer.jsp" />