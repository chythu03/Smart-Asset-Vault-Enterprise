package controller;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

//import com.itextpdf.text.Document;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.Phrase;
//import com.itextpdf.text.pdf.PdfPCell;
//import com.itextpdf.text.pdf.PdfPTable;
//import com.itextpdf.text.pdf.PdfWriter;
//
//
//
//public class GenerateReport {
//	Context ctx;
//	DataSource ds;
//	Connection con;
//	Statement stmt;
//	ResultSet rs;
//	String GenReport(String function,String required,String todt) {	
//		try {
//			System.out.println("In rep func");
//
//			String filename="D:\\"+function+".pdf";
//			Document document=new Document();
//			PdfWriter.getInstance(document, new FileOutputStream(filename));
//			System.out.println("in gen ");
//
//			document.open();
//			
//			
//				ctx=new InitialContext();
//				ds=(DataSource)ctx.lookup("java:comp/env/jdbc/asset");
//				con=ds.getConnection();
//				con.setAutoCommit(false);
//				if(function.equalsIgnoreCase("ReportByAssetId"))
//				{
//					Paragraph para=new Paragraph("Shifting");
//					document.add(para);
//					PdfPTable table=new PdfPTable(3);
//					PdfPCell c1=new PdfPCell(new Phrase("Location"));
//					table.addCell(c1);
//					c1=new PdfPCell(new Phrase("Room"));
//					table.addCell(c1);
//					c1=new PdfPCell(new Phrase("Time"));
//					table.addCell(c1);
//					table.setHeaderRows(1);
//					
//					
//					String sql1="Select tolocation,toroom,time from location where asset_id=?";
//					
//					System.out.println(required);
//					PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql1);
//					ps.setString(1,required);
//					rs=ps.executeQuery();
//					/*out.println("<table class=\"table\">");
//					out.println(" <tbody>");*/
//					//out.println("<h1>Report of "+required+"</h1>");
//					//out.println("<h3>Shifting</h3>");
//					
//					
//					
//					while(rs.next())
//					{
//						//out.println("<h5>"+rs.getString(1)+" - "+rs.getString(2)+" - "+rs.getString(3)+"</h5>");
//						//out.println("\n");
//						table.addCell(rs.getString(1));
//						table.addCell(rs.getString(2));
//						table.addCell(rs.getString(3));
//						
//						
//					}
//					document.add(table);
//					
//					Paragraph para1=new Paragraph("Status");
//					document.add(para1);
//					PdfPTable table1=new PdfPTable(3);
//					PdfPCell c=new PdfPCell(new Phrase("Status"));
//					table.addCell(c);
//					c=new PdfPCell(new Phrase("Time"));
//					table1.addCell(c);
//					table1.setHeaderRows(1);
//					
//					sql1="Select status,time from status where asset_id=?";
//					ps=(PreparedStatement) con.prepareStatement(sql1);
//					ps.setString(1,required);
//					rs=ps.executeQuery();
//					//out.println("<h3>Status</h3>");
//					
//					while(rs.next()) {
//						//out.println("<h5>"+rs.getString(1)+" - "+rs.getString(2)+"</h5>");
//						table1.addCell(rs.getString(1));
//						table1.addCell(rs.getString(2));
//					}
//					document.add(table1);
//				}
//				if(function.equalsIgnoreCase("ReportByStaffId"))
//				{
//					String sql1="Select asset_id,tolocation,toroom,time from location where UserId=?";
//					
//					Paragraph para=new Paragraph("Shifting");
//					document.add(para);
//					PdfPTable table=new PdfPTable(3);
//					PdfPCell c1=new PdfPCell(new Phrase("Asset Id"));
//					table.addCell(c1);
//					c1=new PdfPCell(new Phrase("Location"));
//					table.addCell(c1);
//					c1=new PdfPCell(new Phrase("Room"));
//					table.addCell(c1);
//					c1=new PdfPCell(new Phrase("Time"));
//					table.addCell(c1);
//					table.setHeaderRows(1);
//					
//					
//					
//					PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql1);
//					ps.setString(1,required);
//					rs=ps.executeQuery();
//					/*out.println("<table class=\"table\">");
//					out.println(" <tbody>");*/
//					//out.println("<h1>Report of "+required+"</h1>");
//					//out.println("<h3>Shifting</h3>");
//					while(rs.next())
//					{
//						//out.println("<h5>"+rs.getString(1)+" - "+rs.getString(2)+" - "+rs.getString(3)+" - "+rs.getString(4)+"</h5>");
//						table.addCell(rs.getString(1));
//						table.addCell(rs.getString(2));
//						table.addCell(rs.getString(3));
//						table.addCell(rs.getString(4));
//						
//					}
//					document.add(table);
//					sql1="Select asset_id,status,time from status where UserId=?";
//					
//					Paragraph para1=new Paragraph("Status");
//					document.add(para1);
//					PdfPTable table1=new PdfPTable(3);
//					PdfPCell c=new PdfPCell(new Phrase("Status"));
//					table.addCell(c);
//					c=new PdfPCell(new Phrase("Time"));
//					table1.addCell(c);
//					table1.setHeaderRows(1);
//					
//					ps=(PreparedStatement) con.prepareStatement(sql1);
//					ps.setString(1,required);
//					rs=ps.executeQuery();
//					//out.println("<h3>Status</h3>");
//					while(rs.next()) {
//						//out.println("<h5>"+rs.getString(1)+" - "+rs.getString(2)+" - "+rs.getString(3)+"</h5>");
//						table1.addCell(rs.getString(1));
//						table1.addCell(rs.getString(2));
//						table1.addCell(rs.getString(3));
//					}
//					document.add(table1);
//				}
//				if(function.equalsIgnoreCase("ReportByDate"))
//				{
//					String sql1="Select asset_id,tolocation,toRoom,time,userid from location where time>=? and time<=?";
//					System.out.println("in gen By date");
//					Paragraph para=new Paragraph("Shifting");
//					document.add(para);
//					PdfPTable table=new PdfPTable(3);
//					PdfPCell c1=new PdfPCell(new Phrase("Asset Id"));
//					table.addCell(c1);
//					c1=new PdfPCell(new Phrase("Location"));
//					table.addCell(c1);
//					c1=new PdfPCell(new Phrase("Room"));
//					table.addCell(c1);
//					c1=new PdfPCell(new Phrase("Time"));
//					table.addCell(c1);
//					c1=new PdfPCell(new Phrase("UserId"));
//					table.addCell(c1);
//					table.setHeaderRows(1);
//					
//					required=required+" 00:00:00";
//					
//							
//					todt=todt+" 24:59:59";
//					
//					PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql1);
//					ps.setString(1,required);
//					ps.setString(2,todt);
//					rs=ps.executeQuery();
//					/*out.println("<table class=\"table\">");
//					out.println(" <tbody>");*/
//					//out.println("<h1>Report from "+required+" to "+todt+"</h1>");
//					//out.println("<h3>Shifting</h3>");
//					while(rs.next())
//					{
//						//out.println("<h5>"+rs.getString(1)+" - "+rs.getString(2)+" - "+rs.getString(3)+" - "+rs.getString(4)+" - "+rs.getString(5)+"</h5>");
//						table.addCell(rs.getString(1));
//						table.addCell(rs.getString(2));
//						table.addCell(rs.getString(3));
//						table.addCell(rs.getString(4));
//						table.addCell(rs.getString(5));
//					}
//					sql1="Select asset_id,status,time,userid from status where time>=? and time<=?";
//					Paragraph para1=new Paragraph("Status");
//					document.add(para1);
//					PdfPTable table1=new PdfPTable(3);
//					PdfPCell c=new PdfPCell(new Phrase("Status"));
//					table.addCell(c);
//					c=new PdfPCell(new Phrase("Time"));
//					table1.addCell(c);
//					table1.setHeaderRows(1);
//					
//					ps=(PreparedStatement) con.prepareStatement(sql1);
//					ps.setString(1,required);
//					ps.setString(2,todt);
//					rs=ps.executeQuery();
//					//out.println("<h3>Status</h3>");
//					while(rs.next()) {
//						//out.println("<h5>"+rs.getString(1)+" - "+rs.getString(2)+" - "+rs.getString(3)+" - "+rs.getString(4)+"</h5>");
//						table1.addCell(rs.getString(1));
//						table1.addCell(rs.getString(2));
//						table1.addCell(rs.getString(3));
//						table1.addCell(rs.getString(4));
//					}
//					document.add(table1);
//					document.close();
//					return "generated";
//					
//				}
//			}catch(Exception e){
//				e.printStackTrace();
//				
//				return "error occured";
//			}
//		
//	return "error occured";
//	}
//}
