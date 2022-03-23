<%@page import="javax.swing.JOptionPane"%>
<%@page import="model.user"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	//user obj=(user)request.getAttribute("userObj");
	
	user obj=(user)session.getAttribute("userObj");
	String actor=(String)session.getAttribute("actor");
	String name=obj.getName();
	int id=obj.getId();
	
	
	if(actor.equalsIgnoreCase("admin"))
	{
		//out.println("<h1>welcome admin</h1><br> ");
		//out.println("Name:"+name+"<br>");
		//out.println("User ID: "+id);
		RequestDispatcher view=request.getRequestDispatcher("Admin.jsp");
		view.forward(request, response);
	}
	else if (actor.equalsIgnoreCase("staff")) {
		/*out.println("<html>");
		out.println("<body>");
		out.println("<h1>welcome staff user </h1><br>");
		out.println("Name:"+name+"<br>");
		out.println("User ID: "+id);
		out.println("</body>");
		out.println("</html>");*/
		RequestDispatcher view=request.getRequestDispatcher("Staff.jsp");
		view.forward(request, response);
	}
	else if (actor.equalsIgnoreCase("audit manager")) {
		/*out.println("<html>");
		out.println("<body>");
		out.println("<h1>welcome Audit Manager</h1><br> ");
		out.println("Name:"+name+"<br>");
		out.println("User ID: "+id);
		out.println("</body>");
		out.println("</html>");*/
		RequestDispatcher view=request.getRequestDispatcher("Auditor.jsp");
		view.forward(request, response);
	}
	else
	{	
		
		RequestDispatcher view=request.getRequestDispatcher("index.html");
		view.forward(request, response);
	}
	
%>
</body>
</html>