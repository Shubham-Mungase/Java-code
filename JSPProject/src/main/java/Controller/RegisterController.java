package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import Dao.RegisterDao;
import Model.RegisterModel;
import helper.ConnectionProvoider;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
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
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String n=request.getParameter("name");
		String e=request.getParameter("email");
		String p=request.getParameter("pass");
		String d=request.getParameter("dob");
		RegisterModel rm=new RegisterModel();
		rm.setName(n);
		rm.setEmail(e);
		rm.setPass(p);
		rm.setDob(d);
		RegisterDao dao=new RegisterDao(ConnectionProvoider.getConnection());
		int status=RegisterDao.registerUser(rm);
		if(status==1)
		{
			out.println("Insert Successfull");
		}
		else
		{
			out.println("Insert not Successfull");
		}
		
	}

}
