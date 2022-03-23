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
    <title>Update Location</title>
    
    <link rel="stylesheet" href="design3.3.css">
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
            <li><a href="Staff.jsp"><i class="fa fa-home" aria-hidden="true"></i>Home</a></li>
            <li><a href="#"><i class="fa fa-eye" aria-hidden="true"></i> View </a>
            <ul class="sub1">
            <li><a href="index3.4.jsp">Status</a></li>
            <li><a href="index3.1.jsp">Location</a></li>
            
            </ul>
            </li>
            <li><a href="#"><i class="fa fa-pencil-square-o" aria-hidden="true"></i> Update</a>
            <ul class="sub1">
           <li><a href="index3.2.jsp">Status</a></li>
                <li><a href="index3.3.jsp">Location</a></li>
            </ul>
            </li>
            
            
            <li><a href="Logout.jsp"><i class="fa fa-sign-out" aria-hidden="true"></i>Logout</a></li>
                
            
        
            </ul>
             </div>
        </div>
              <div class="box">
                 <h2>Update Location</h2>
    
        <form action="StaffActionServ" method="post">
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