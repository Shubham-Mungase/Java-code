package servletdemo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Cal
 */
@WebServlet("/Cal")
public class Cal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cal() {
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
		response.setContentType("text/html");
		int fno=Integer.parseInt(request.getParameter("txfno"));
		int sno=Integer.parseInt(request.getParameter("txsno"));
		int res=0;
		String but=request.getParameter("but");
		PrintWriter pout=response.getWriter();
		if(but.equals("Add"))
		{
			res=fno+sno;
			pout.println("Addition="+res);
		}
		else if(but.equals("Sub"))
		{
			res=fno-sno;
			pout.println("SubStraction="+res);
		}
		else if(but.equals("Mul"))
		{
			res=fno*sno;
			pout.println("Multiplication="+res);
		}
		else if(but.equals("Div"))
		{
			res=fno/sno;
			pout.println("Division="+res);
		}
		
		pout.close();
	}

}
