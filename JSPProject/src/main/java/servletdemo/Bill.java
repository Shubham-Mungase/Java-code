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
 * Servlet implementation class Bill
 */
@WebServlet("/Bill")
public class Bill extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String itmname;
	int qty,rate,tamt ;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bill() {
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
		HttpSession hs=request.getSession(true);
		itmname=request.getParameter("txiname");
		qty=Integer.parseInt(request.getParameter("txqty"));
		rate=Integer.parseInt(request.getParameter("txrate"));
		String str=(String)hs.getAttribute("totalamt");
		
		if(str==null)
		{
			tamt=0;
		}
		else
			tamt=Integer.parseInt(str);
		tamt=tamt+qty*rate;
		hs.setAttribute("totalamt",Integer.toString(tamt));
		hs.setAttribute("itemname", itmname);
		hs.setAttribute("qty", ""+qty);
		pw.println("<a href=Bill.html>Back</a>");
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<form action=Bill1 method=get>");
		pw.println("<input type=submit value=Print>");
		pw.print("</body>");
		pw.print("</html");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
