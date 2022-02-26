package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.user;

/**
 * Servlet implementation class mainView
 */
@WebServlet("/mainView")

//didn't used this java class 

public class mainView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mainView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//user obj=(user)request.getAttribute("userObj");
		HttpSession session=request.getSession();
		user obj=(user)session.getAttribute("userObj");
		String actor=obj.getActor();
		String name=obj.getName();
		int id=obj.getId();
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		if(actor.equalsIgnoreCase("admin"))
		{
			out.println("<h1>welcome admin</h1><br> ");
			out.println("Name:"+name+"<br>");
			out.println("User ID: "+id);
		}
		else if (actor.equalsIgnoreCase("staff")) {
			out.println("<h1>welcome staff user </h1><br>");
			out.println("Name:"+name+"<br>");
			out.println("User ID: "+id);
		}
		else if (actor.equalsIgnoreCase("audit manager")) {
			out.println("<h1>welcome Audit Manager</h1><br> ");
			out.println("Name:"+name+"<br>");
			out.println("User ID: "+id);
		}
		else
		{
			out.println("wrong username or password  ");
		}
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
