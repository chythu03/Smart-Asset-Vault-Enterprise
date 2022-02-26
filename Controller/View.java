package controller;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class View {
	
	String ViewStatus(String id)
	{
		String status="";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/asset";
			String user="root";
			String pass="Chythu123@";
			Connection con=(Connection) DriverManager.getConnection(url,user,pass);
			String sql1="Select status from assets where asset_id=?";
			PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql1);
			ps.setString(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
				status=rs.getString(1);
			
		}
		catch (Exception e) {
			e.printStackTrace();
			status="error occured";
			return status;
		}
		return status;
	}
	String ViewLocation(String id)
	{
		String location="";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/asset";
			String user="root";
			String pass="Chythu123@";
			Connection con=(Connection) DriverManager.getConnection(url,user,pass);
			String sql1="Select location,room from assets where asset_id=?";
			PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql1);
			ps.setString(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
				location=rs.getString(1)+" "+rs.getString(2);
			
		}
		catch (Exception e) {
			e.printStackTrace();
			location="error occured";
			return location;
		}
		return location;
	}
	String ViewAsset(String id)
	{
		String asset="";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/asset";
			String user="root";
			String pass="Chythu123@";
			Connection con=(Connection) DriverManager.getConnection(url,user,pass);
			String sql1="Select * from assets where asset_id=?";
			PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql1);
			ps.setString(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
				asset=rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getTimestamp(7);
			
		}
		catch (Exception e) {
			e.printStackTrace();
			asset="error occured";
			return asset;
		}
		return asset;
	}
}
