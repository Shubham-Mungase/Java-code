package servletdemo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SessionDemo1
 */
@WebServlet("/SessionDemo1")
public class SessionDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionDemo1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		HttpSession hs=request.getSession();
		int ct;
		String str=(String)hs.getAttribute("count");
		if(str==null)
		{
			ct=0;
		}
		else
		{
			ct=Integer.parseInt(str);
		}
		ct=ct+1;
		pw.print("<br>Count="+ct);
		hs.setAttribute("count", Integer.toString(ct));
		pw.print("<br>Session id="+hs.getId());
		pw.print("<br>Creation Time="+hs.getCreationTime());
		pw.print("<br>Last Access Time="+hs.getLastAccessedTime());
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
