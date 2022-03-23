package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.user;

/**
 * Servlet implementation class Action
 */
@WebServlet("/Action")
public class Action extends HttpServlet{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Action() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String function;
		String name=request.getParameter("name");
		String category=request.getParameter("category");
		function=(String)request.getParameter("func");
		
		HttpSession session=request.getSession();
		String actor=(String)session.getAttribute("actor");
		System.out.println(actor);
		if(actor.equalsIgnoreCase("admin"))
		{
			AdminAction obj=(AdminAction)session.getAttribute("userObj");
			switch(function)
			{
				case "create":obj.create(name,category);
							RequestDispatcher view=request.getRequestDispatcher("AdminCreate.jsp");
							view.include(request, response);
				default:
			}
		}
		
		
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String function;
		
		function=(String)request.getParameter("func");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		String actor=(String)session.getAttribute("actor");
		System.out.println(actor);
		RequestDispatcher view;
		
			AdminAction obj=(AdminAction)session.getAttribute("userObj");
			switch(function)
			{
				case "create":
								String name=request.getParameter("assetname");
								String category=request.getParameter("category");
								String res1=obj.create(name,category);
							  view=request.getRequestDispatcher("AdminCreate.jsp");
							  view.include(request, response);
							  if(res1==null)
							  {
								  out.println("<script>");
								  out.println(" alert(\"error occured\");");
								  out.println("</script>");
							  }
							  else
							  {
								  out.println("<script>");
								  out.println(" alert(\""+res1+" Created \");");
								  out.println("</script>");
							  }
							  break;
				case "ViewStatus":String id=request.getParameter("id");
								View obj1=new View();
								 String res=obj1.ViewStatus(id);
								 view=request.getRequestDispatcher("index1.4.jsp");
								 view.include(request, response);
								 out.println("<script>");
								 out.println(" alert(\"Status: "+res+"\");");
								  out.println("</script>");
								break;
				case "ViewLocation":String id1=request.getParameter("id");
									View obj2=new View();
									 String res3=obj2.ViewLocation(id1);
									 view=request.getRequestDispatcher("index1.4.jsp");
									 view.include(request, response);
									 out.println("<script>");
									  out.println(" alert(\"Location:"+res3+" \");");
									  out.println("</script>");
									  break;
				case "ViewAsset":String id2=request.getParameter("id");
									View obj3=new View();
									 String res2=obj3.ViewAsset(id2);
									 view=request.getRequestDispatcher("index1.4.jsp");
									 view.include(request, response);
									 out.println("<script>");
									  out.println(" alert(\"Asset: "+res2+"\");");
									  out.println("</script>");
									break;
				case "ReportByAssetID":	String asset=request.getParameter("AssetId");
										session.setAttribute("function", function);
										session.setAttribute("asset_id", asset);
										view=request.getRequestDispatcher("Report.jsp");
				 						view.include(request, response);	
				 						break;
				case "ReportByStaffID":	String staff=request.getParameter("StaffId");
										session.setAttribute("function", function);
										session.setAttribute("staff_id", staff);
										view=request.getRequestDispatcher("Report.jsp");
										view.include(request, response);
										break;
				case "ViewByAssetID": String asset_id=request.getParameter("asset_id");
										session.setAttribute("function", function);
										session.setAttribute("asset_id", asset_id);
										view=request.getRequestDispatcher("ViewAssetShifting.jsp");
										view.include(request, response);
										break;
				case "ViewByStaffID": String staff_id=request.getParameter("staff_id");
										session.setAttribute("function", function);
										session.setAttribute("staff_id", staff_id);
										view=request.getRequestDispatcher("ViewAssetShifting.jsp");
										view.include(request, response);
										break;
				case "AddAsset":  String asset2=request.getParameter("asset");
									String res4=obj.addasset(asset2);
									out.println("<script>");
									out.println(" alert(\""+res4+"\");");
									out.println("</script>");
									view=request.getRequestDispatcher("index1.2.jsp");
									view.include(request, response);
									break;
				case "Add":String asset3=request.getParameter("asset");
							int count=Integer.parseInt(request.getParameter("count")); 
							String res5=obj.add(asset3,count);
							out.println("<script>");
							out.println(" alert(\""+res5+"\");");
							out.println("</script>");
							view=request.getRequestDispatcher("index1.2.jsp");
							view.include(request, response);
							break;
				case "UpdateStatus":String asset4=request.getParameter("asset_id");
									String stat=request.getParameter("status");
									String res6=obj.updateStatus(asset4, stat);
									out.println("<script>");
									out.println(" alert(\""+res6+"\");");
									out.println("</script>");
									view=request.getRequestDispatcher("index1.10.jsp");
									view.include(request, response);
									break;
				case "UpdateLocation":String asset5=request.getParameter("asset_id");
									String loc=request.getParameter("location");
									String room=request.getParameter("room");
									String res7=obj.updateLocation(asset5,loc,room);
									out.println("<script>");
									out.println(" alert(\""+res7+"\");");
									out.println("</script>");
									view=request.getRequestDispatcher("index1.11.jsp");
									view.include(request, response);
									break;
				case "ViewByDate":String frdt=request.getParameter("FrDt");
								  String todt=request.getParameter("ToDt");
								  session.setAttribute("function", function);
								  session.setAttribute("FrDt", frdt);
								  session.setAttribute("ToDt", todt);
								  System.out.println(frdt+" - "+todt);
								  view=request.getRequestDispatcher("ViewAssetShifting.jsp");
									view.include(request, response);
									break;
				case"ReportByDate":String frdt1=request.getParameter("FrDt");
									  String todt1=request.getParameter("ToDt");
									  System.out.println(frdt1+" - "+todt1);
									  session.setAttribute("function", function);
									  session.setAttribute("FrDt", frdt1);
									  session.setAttribute("ToDt", todt1);
									  view=request.getRequestDispatcher("Report.jsp");
										view.include(request, response);
										break;
				default:break;
			}
		}
		
	}