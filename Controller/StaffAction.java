package controller;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import model.user;

public class StaffAction extends user{

	String function;
	public StaffAction(int id, String name, String actor) {
		super(id, name, actor);
	}
		// TODO Auto-generated constructor stub
		String updateStatus(String asset_id,String status)
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/asset";
				String user="root";
				String pass="Chythu123@";
				String res="error occured";
				String id="";
				Connection con=(Connection) DriverManager.getConnection(url,user,pass);
				con.setAutoCommit(false);
				String sql="Select max(TransID) from status";
				PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					res=rs.getString(1);
				}
				String letter=res.substring(0,1);
				res=res.substring(1);
				String id1="";
				int num=Integer.parseInt(res);
				num=num+1;
				id1=letter+num;
				
				sql="Select prod_id from assets where asset_id=?";
				ps=(PreparedStatement) con.prepareStatement(sql);
				ps.setString(1, asset_id);
				rs=ps.executeQuery();
				while(rs.next())
					id=rs.getString(1);
				
				
				sql="update assets set status=? where asset_id=? ";
				ps=(PreparedStatement) con.prepareStatement(sql);
				ps.setString(1, status);
				ps.setString(2, asset_id);
				ps.executeUpdate();
				
				
				sql="insert into status values(?,?,?,?,?,?)";
				ps=(PreparedStatement) con.prepareStatement(sql);
				time obj=new time();
				String datetime=obj.getCurrentTimeStamp();
				ps.setString(1,id1);
				ps.setString(2,id);
				ps.setString(3,asset_id);
				ps.setString(4,status);
				
				String user_id=Integer.toString(super.getId());
				if(super.getId()<10)
					user_id="0000"+user_id;
				if(super.getId()>9 && super.getId()<100)
					user_id="000"+user_id;
				ps.setString(5,user_id);
				ps.setString(6, datetime);
				ps.executeUpdate();
				
				
				
				con.commit();
				con.close();
				return "Updated";
			}catch(Exception e)
			{
				return "error occured";
			}
		}
		String updateLocation(String asset_id,String location,String room)
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/asset";
				String user="root";
				String pass="Chythu123@";
				String res="error occured";
				String id="";
				Connection con=(Connection) DriverManager.getConnection(url,user,pass);
				con.setAutoCommit(false);
				String sql="Select max(TransID) from location";
				PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					res=rs.getString(1);
				}
				String letter=res.substring(0,1);
				res=res.substring(1);
				String id1="";
				int num=Integer.parseInt(res);
				num=num+1;
				id1=letter+num;
				System.out.println("trans id ="+id1);
				
				sql="Select prod_id from assets where asset_id=?";
				ps=(PreparedStatement) con.prepareStatement(sql);
				ps.setString(1, asset_id);
				rs=ps.executeQuery();
				while(rs.next())
					id=rs.getString(1);
				System.out.println("prod id ="+id);
				
				sql="insert into location values(?,?,?,?,?,?,?)";
				ps=(PreparedStatement) con.prepareStatement(sql);
				time obj=new time();
				String datetime=obj.getCurrentTimeStamp();
				ps.setString(1,id1);
				ps.setString(2,id);
				ps.setString(3,asset_id);
				ps.setString(4,location);
				ps.setString(5,room);
				String user_id=Integer.toString(super.getId());
				if(super.getId()<10)
					user_id="0000"+user_id;
				if(super.getId()>9 && super.getId()<100)
					user_id="000"+user_id;
				ps.setString(5,user_id);
				ps.setString(6,user_id);
				ps.setString(7, datetime);
				ps.executeUpdate();
				System.out.println("inserted in location ");
				
				sql="update assets set location=?, room=? where asset_id=? ";
				ps=(PreparedStatement) con.prepareStatement(sql);
				ps.setString(1, location);
				ps.setString(2, room);
				ps.setString(3,asset_id);
				ps.executeUpdate();
				System.out.println("updated in assets");
				con.commit();
				con.close();
				return "Updated";
			}catch(Exception e)
			{
				return "error occured";
			}
		}
	
}
