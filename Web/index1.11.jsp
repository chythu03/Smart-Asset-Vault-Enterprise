<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <title>Update locatiion</title>
    
    <link rel="stylesheet" href="design1.11.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
   
</head>
<body>
<div class="homepage">
       <div class="menu">
           
            <div class="leftmenu">
            <h4>ASSET MANAGEMENT SYSTEM</h4>
            </div>
        <div class="rightmenu">
        
            
           
        
        <ul id="navmenu">
            <li><a href="Admin.jsp"><i class="fa fa-home" aria-hidden="true"></i>Home</a></li>
            <li><a href="AdminCreate.jsp"><i class="fa fa-plus" aria-hidden="true"></i> Create</a></li>
            <li><a href="#"><i class="fa fa-puzzle-piece" aria-hidden="true"></i> ADD</a>
            <ul class="sub1">
			<li><a href="index1.2.jsp">Asset</a></li>
            <li><a href="index1.3.jsp">Multiple assets</a></li>
            </ul>
            </li>
            <li><a href="#"><i class="fa fa-eye" aria-hidden="true"></i> View </a>
            <ul class="sub1">
             <li><a href="index1.4.jsp">Status</a></li>
            <li><a href="index1.5.jsp">Location</a></li>
            <li><a href="index1.6.jsp">Asset</a></li>
            <li><a href="#">Shift</a><span class="rarrow">&#9654;</span>
            <ul class="sub2">
                <li><a href="index1.7.jsp">Date</a></li>
                <li><a href="index1.8.jsp">AssetId</a></li>
                 <li><a href="index1.9.jsp">StaffId</a></li>
                
                </ul>
                </li>
            
            </ul>
            </li>
            <li><a href="#"><i class="fa fa-pencil-square-o" aria-hidden="true"></i> Update</a>
            <ul class="sub1">
            <li><a href="index1.10.jsp">Status</a></li>
                 <li><a href="index1.11.jsp">Location</a></li>
            </ul>
            
            <li><a href="#"><i class="fa fa-flag" aria-hidden="true"></i> Report</a>
             <ul class="sub1">
                <li><a href="index1.12.jsp">Date</a></li>
            <li><a href="index1.13.jsp">AssetId</a></li>
                 <li><a href="index1.14.jsp">StaffId</a></li>
                
       
            </ul>
            </li>
            <li><a href="Logout.jsp"><i class="fa fa-sign-out" aria-hidden="true"></i>Logout</a>
                
            </li>
        
            </ul>
             </div>
        </div>
          <div class="box">
                 <h2>Update Location</h2>
    
        <form action="Action" method="post">
        <div class="inputBox">
             <input type="text" name="asset_id"required>
            <label>AssetID</label>
    </div>
          
          <div class="boxx">
          <label for="Location">Location: </label>
	  <input list="Location" name="location">
 		<datalist id="Location">
 		<%
 		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/asset";
			String user="root";
			String pass="lokesh1999";
			
			Connection con=(Connection) DriverManager.getConnection(url,user,pass);
			String sql="Select location from loc";
			PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				out.println("<option value=\""+rs.getString(1)+"\">");
			}
 		}catch(Exception e)
 		{
 			e.printStackTrace();
 		}
 		%>

</datalist> 
            </div>
            <div class="inputBox">
             <input type="text" name="room"required>
            <label>Room No</label>
    </div>
<div class="sub">
   <input type="submit" class="button" name="func" value="UpdateLocation">

    </div>
          
        </form>
        </div>   
 
        
        </div>
</body>
</html>