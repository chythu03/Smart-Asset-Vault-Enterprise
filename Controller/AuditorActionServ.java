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
 * Servlet implementation class AuditorActionServ
 */
@WebServlet("/AuditorActionServ")
public class AuditorActionServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuditorActionServ() {
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
		AuditorAction obj=(AuditorAction)session.getAttribute("userObj");
		
		switch(function)
		{
			
			case "ViewStatus":String id=request.getParameter("asset_id");
							View obj1=new View();
							 String res=obj1.ViewStatus(id);
							 view=request.getRequestDispatcher("index2.1.jsp");
							 view.include(request, response);
							 out.println("<script>");
							  out.println(" alert(\"Status: "+res+"\");");
							  out.println("</script>");
							break;
			case "ViewLocation":String id1=request.getParameter("asset_id");
								View obj2=new View();
								 String res3=obj2.ViewLocation(id1);
								 view=request.getRequestDispatcher("index2.2.jsp");
								 view.include(request, response);
								 out.println("<script>");
								  out.println(" alert(\"Location: "+res3+" \");");
								  out.println("</script>");
								  break;
			case "ViewAsset":String id2=request.getParameter("asset_id");
								View obj3=new View();
								 String res2=obj3.ViewAsset(id2);
								 view=request.getRequestDispatcher("index2.3.jsp");
								 view.include(request, response);
								 out.println("<script>");
								  out.println(" alert(\"Asset: "+res2+"\");");
								  out.println("</script>");
								break;
			case "ReportByAssetID":	String asset=request.getParameter("asset_id");
									session.setAttribute("function", function);
									session.setAttribute("asset_id", asset);
									view=request.getRequestDispatcher("Report.jsp");
			 						view.include(request, response);	
			 						break;
			case "ReportByStaffID":	String staff=request.getParameter("staff_id");
									session.setAttribute("function", function);
									session.setAttribute("staff_id", staff);
									view=request.getRequestDispatcher("Report.jsp");
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
			case "ViewByDate":String frdt=request.getParameter("FrDt");
							  String todt=request.getParameter("ToDt");
							  session.setAttribute("function", function);
							  session.setAttribute("FrDt", frdt);
							  session.setAttribute("ToDt", todt);
							  System.out.println(frdt+" - "+todt);
							  view=request.getRequestDispatcher("ViewAssetShifting.jsp");
								view.include(request, response);
								break;
			case "Remove":String id3=request.getParameter("asset_id");
						  String res4=obj.remove(id3);
						  view=request.getRequestDispatcher("index2.7.jsp");
						  view.include(request, response);
						  out.println("<script>");
						  out.println(" alert(\""+res4+" \");");
						  out.println("</script>");
						  break;
			default:break;
		}
	}

}
