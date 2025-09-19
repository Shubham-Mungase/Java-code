package servletdemo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Circle
 */
@WebServlet("/Circle")
public class Circle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Circle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int radius=0;
		final float PI=3.14f;
		float area=0f;
		radius=Integer.parseInt(request.getParameter("txfno"));
		area=PI*(radius*radius);
		PrintWriter pout=response.getWriter();
		response.setContentType("text/html");
		pout.println("Area Of Circle ="+area);
		pout.close();
		
		
	}

	
}
