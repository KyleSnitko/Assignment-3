<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
<link href="Styles/Main.css" rel=stylesheet>
<!DOCTYPE html>



<link href="Styles/tobaCSS.css" rel=stylesheet>

<title>Titan Online Banking Application</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial scale=1.0">

<body>
<div id="wrapper">
<header>
<h1>Account Activity</h1>
</header>
    <p>
            
      
        <c:if test="${user.firstName != null}">
        <p>
            Welcome, ${user.firstName} ${user.lastName}!
        </p>
        </c:if>
        <c:if test="${user.firstName == null}">
            <p>
                Sorry, You are not logged in.
            </p>
        </c:if>
    </p>
    
    
    
</body>
</div>
</html>

<c:import url="/includes/footer.jsp" />