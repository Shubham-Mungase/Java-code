package servletdemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TabulatedFormat
 */
@WebServlet("/TabulatedFormat")
public class TabulatedFormat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Connection cn=null;
	PreparedStatement st=null;
	ResultSet rs=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TabulatedFormat() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
			PrintWriter pout=response.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/suhani";
			cn = DriverManager.getConnection(url, "root", "7777");
			st=cn.prepareStatement("SELECT * FROM EMP ORDER BY EMPNAME");
			rs=st.executeQuery();
			pout.println("<html>");
			pout.println("<body>");
			pout.println("<table border=2px>");
			pout.println("<thead");
			pout.println("<tr>");
			pout.println("<th>");
				pout.println("Emp Id");
			pout.println("</th>");
			pout.println("<th>");
			pout.println("Emp Name");
		pout.println("</th>");
		pout.println("<th>");
		pout.println("Emp Salalry");
	pout.println("</th>");
			pout.println("</tr>");
			pout.println("<thead");
			pout.println("<tbody>");
			while(rs.next())
			{
				pout.println("<tr>");
				pout.println("<td>"+rs.getInt(1)+"</td>");
				pout.println("<td>"+rs.getString(2)+"</td>");
				pout.println("<td>"+rs.getInt(3)+"</td>");
				pout.println("</tr>");
			}
			pout.println("</tbody>");
			pout.println("</table>");
			pout.println("</body>");
			pout.println("</html>");
			
			
		} catch (ClassNotFoundException e) {
			
		}
		catch (SQLException e) {
			// TODO: handle exception
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
