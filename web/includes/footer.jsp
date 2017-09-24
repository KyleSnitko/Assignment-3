<%@ page import="java.util.GregorianCalendar, java.util.Calendar, java.util.Date" %>
<%  
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
%>
<p>&copy; Copyright  <%=new java.util.Date()%> Titan Online Bank</p>
</body>
</html>
