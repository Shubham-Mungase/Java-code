package servletdemo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HitCountCookie
 */
@WebServlet("/HitCountCookie")
public class HitCountCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HitCountCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		Cookie[] ck= request.getCookies();
		int ct=0;
		if(ck==null)
			ct=0;
		else
		{
			for(int i=0;i<ck.length;i++)
			{
				if(ck[i].getName().equals("count"))
				{
					ct=Integer.parseInt(""+ck[i].getValue());
				}
			}
			
			
		}
		ct=ct+1;
		pw.print("Page Hit Count="+ct);
		
		Cookie ck1=new Cookie("count",""+ct);
		ck1.setMaxAge(60*60*24*365);
		response.addCookie(ck1);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
