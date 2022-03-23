<%@page import="controller.AuditorAction"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="design2.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<%
AuditorAction obj=(AuditorAction)session.getAttribute("userObj");
String name=obj.getName();
String position=obj.getActor();
int userId=obj.getId();
%>
 <div class="homepage">
       <div class="menu">
           
            <div class="leftmenu">
            <h4>ASSET MANAGEMENT SYSTEM</h4>
            </div>
        <div class="rightmenu">
        
            
           
        
        <ul id="navmenu">
            <li><a href="Auditor.jsp"><i class="fa fa-home" aria-hidden="true"></i>Home</a></li>
            <li><a href="#"><i class="fa fa-eye" aria-hidden="true"></i> View </a>
            <ul class="sub1">
            <li><a href="index2.1.jsp">Status</a></li>
            <li><a href="index2.2.jsp">Location</a></li>
            <li><a href="index2.3.jsp">Asset</a></li>
            <li><a href="#">Shift</a><span class="rarrow">&#9654;</span>
            <ul class="sub2">
                <li><a href="index2.4.jsp">Date</a></li>
                <li><a href="index2.5.jsp">AssetId</a></li>
                <li><a href="index2.6.jsp">StaffId</a></li>
                
                </ul>
                </li>
            
            </ul>
            </li>
            <li><a href="#"><i class="fa fa-pencil-square-o" aria-hidden="true"></i> Update</a>
            <ul class="sub1">
            <li><a href="index2.7.jsp">Remove</a></li>
            </ul>
            
            <li><a href="#"><i class="fa fa-flag" aria-hidden="true"></i> Report</a>
             <ul class="sub1">
                <li><a href="index2.8.jsp">Date</a></li>
            <li><a href="index2.9.jsp">AssetId</a></li>
                 <li><a href="index2.10.jsp">StaffId</a></li>
                
       
            </ul>
            </li>
            <li><a href="Logout.jsp"><i class="fa fa-sign-out" aria-hidden="true"></i>Logout</a>
               
            </li>
        
            </ul>
             </div>
        </div>
             <div class="container">
  <h2>Auditor Details</h2>
             </div>
        
 <table class="table">
  
    <tbody>
      <tr>
        <td>Name</td>
        <td><%=name %></td>
        </tr>
        <tr>
            <td>User Id</td>
        <td><%=userId %></td>
        </tr>

        <tr>
        <td>Position</td>
          <td><%=position %><td>
        </tr>
    </tbody>
  </table>


        
        </div>
</body>
</html>