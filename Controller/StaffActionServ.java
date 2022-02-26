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

/**
 * Servlet implementation class StaffActionServ
 */
@WebServlet("/StaffActionServ")
public class StaffActionServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffActionServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
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
		StaffAction obj=(StaffAction)session.getAttribute("userObj");
		switch(function)
		{
					case "UpdateStatus":String asset4=request.getParameter("asset_id");
										String stat=request.getParameter("status");
										String res6=obj.updateStatus(asset4, stat);
										out.println("<script>");
										out.println(" alert(\""+res6+"\");");
										out.println("</script>");
										view=request.getRequestDispatcher("index3.2.jsp");
										view.include(request, response);
										break;
					case "UpdateLocation":String asset5=request.getParameter("asset_id");
										String loc=request.getParameter("location");
										String room=request.getParameter("room");
										String res7=obj.updateLocation(asset5,loc,room);
										out.println("<script>");
										out.println(" alert(\""+res7+"\");");
										out.println("</script>");
										view=request.getRequestDispatcher("index3.3.jsp");
										view.include(request, response);
										break;
					case "ViewLocation":String id1=request.getParameter("asset_id");
										View obj2=new View();
										 String res3=obj2.ViewLocation(id1);
										 view=request.getRequestDispatcher("index3.1.jsp");
										 view.include(request, response);
										 out.println("<script>");
										 out.println(" alert(\"Location:"+res3+" \");");
										 out.println("</script>");
										 break;
					case "ViewStatus":String id=request.getParameter("asset_id");
									  View obj1=new View();
									  String res=obj1.ViewStatus(id);
									  view=request.getRequestDispatcher("index3.4.jsp");
									  view.include(request, response);
									  out.println("<script>");
									  out.println(" alert(\"Status: "+res+"\");");
									  out.println("</script>");
									  break;
					default:break;
		}
	}

}
