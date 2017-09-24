<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
<link href="Styles/Main.css" rel=stylesheet>

<title>New Customer Registration</title>

<h1>Enter your information below</h1>


<c:if test="${message != null}">
    <p><i>${message}</i></p>
</c:if>

<form action="newcust" method="post">
    <input type="hidden" name="action" value="add">        
    
    <label class="pad_top">First Name:</label>
    <input type="text" name="firstName" value="${user.firstName}"><br>
    <label class="pad_top">Last Name:</label>
    <input type="text" name="lastName" value="${user.lastName}"><br> 
    <label class="pad_top">Phone Number:</label>
    <input type="text" name="num" value="${user.num}"><br> 
    <label class="pad_top">Address:</label>
    <input type="text" name="address" value="${user.address}"><br>
    <label class="pad_top">City:</label>
    <input type="text" name="city" value="${user.city}"><br>
    <label class="pad_top">State:</label>
    <input type="text" name="state" value="${user.state}"><br>
    <label class="pad_top">Zip Code:</label>
    <input type="text" name="zipCode" value="${user.zipCode}"><br>    
    <label class="pad_top">Email:</label>
    <input type="email" name="email" value="${user.email}"><br>
    <br>
    <hr>
    <br>
    <label>&nbsp;</label>
    <input type="submit" value="Join Now" class="margin_left">
</form>
<c:import url="/includes/footer.jsp" />