package servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCkk
 */
@WebServlet("/AddCkk")
public class AddCkk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCkk() {
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
		String str=request.getParameter("tx");
		Cookie ck1=new Cookie("ckname1",str);
		ck1.setMaxAge(3600);
		ck1.setVersion(1);
		Cookie ck2=new Cookie("ckname2","wel");
		ck2.setMaxAge(60);
		ck2.setVersion(1);
		ck2.setPath("/servletdemo");
		Cookie ck3=new Cookie("ckname3","bye");
		response.addCookie(ck2);
		response.addCookie(ck3);
		response.addCookie(ck1);
		pw.println("Cookie Set");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
