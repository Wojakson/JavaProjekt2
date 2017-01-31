<%@page import="java.util.List"%>
<%@page import="com.example.eDoc.model.Pacjent"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Konto eDoc</title>
</head>
<body>
<%
		Pacjent pacjent = (Pacjent) session.getAttribute("pacjent") ;
		
%>
		Twoje dane to:
	<h2><%=pacjent.getName()%> <%=pacjent.getSurname()%><br>
		<%=pacjent.getAdress()%><br>
		<%=pacjent.getZipcode()%>, <%=pacjent.getCity()%><br>
		<%=pacjent.getRegion()%>, <%=pacjent.getCountry()%><br>
		<%=pacjent.getPhone()%>, <%=pacjent.getEmail()%></h2> <br>
	<br>
	
	<a href="finalize">Save</a>
</body>
</html>