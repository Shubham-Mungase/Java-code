package servletdemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpDemo1
 */
@WebServlet("/EmpDemo1")
public class EmpDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PreparedStatement st = null;
	ResultSet rs = null;
	Connection cn = null;
	int empid=0, empsal=0;
	String empname="", gender="";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmpDemo1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		response.setContentType("text/html");
		PrintWriter pout = response.getWriter();
		pout.println(" <!DOCTYPE html>" + "<html>" + "<head>" + "<meta charset=UTF-8>");
		pout.println("<title>Insert title here</title>" + "</head>" + "<body>");
		pout.println("<form method=post action=EmpDemo1>");
		pout.println("<label>Enter Emp Id : </label><input type=text name=empid value=" + empid + "><br>");
		pout.println("<label>Enter Emp Name : </label><input type=text name=empname value=" + empname + "><br>");
		pout.println("<label>Enter Emp Salary : </label><input type=text name=empsal value=" + empsal + "><br>");
		pout.println("<label>Select Emp Gender : </label><br>");
//		pout.println("<input type=radio name=empgend >Male<br>");
//		pout.println("<input type=radio name=empgend >Female<br>");
		if (gender.equalsIgnoreCase("male")) {
			pout.println("<input type=radio name=empgend value=male checked>Male<br>");
			pout.println("<input type=radio name=empgend value=female>Female<br>");
		} else if (gender.equalsIgnoreCase("female")) {
			pout.println("<input type=radio name=empgend value=male >Male<br>");
			pout.println("<input type=radio name=empgend value=female checked>Female<br>");

		} else {
			pout.println("<input type=radio name=empgend value=male >Male<br>");
			pout.println("<input type=radio name=empgend value=female>Female<br>");
		}
		pout.println("<input type=submit name=but value=Insert>");
		pout.println("<input type=submit name=but value=Update>");
		pout.println("<input type=submit name=but value=Delete>");
		pout.println("<input type=submit name=but value=Search>");
		pout.println("</form>" + "</body>" + "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter pout = response.getWriter();
		String but = request.getParameter("but");

		if (but.equalsIgnoreCase("insert")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/db4";
				cn = DriverManager.getConnection(url, "root", "7777");
				st = cn.prepareStatement("INSERT INTO EMP VALUES(?,?,?,?)");
				empid = Integer.parseInt(request.getParameter("empid"));
				empname = request.getParameter("empname");
				empsal = Integer.parseInt(request.getParameter("empsal"));
				gender = request.getParameter("empgend");
				st.setInt(1, empid);
				st.setString(2, empname);
				st.setInt(3, empsal);
				st.setString(4, gender);
				int res = st.executeUpdate();
				if (res == 1) {
					pout.println("<script>alert(\"Record Inserted Successfully...!\")</script>;");
				} else {
					pout.println("<script>alert(\"Record Not Inserted ..!\")</script>");
				}

			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				try {
					st.close();
					cn.close();
				} catch (Exception e) {
					pout.println("Exp=" + e);
				}
			}
		} else if (but.equalsIgnoreCase("update")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/db4";
				cn = DriverManager.getConnection(url, "root", "7777");
				empid = Integer.parseInt(request.getParameter("empid"));
				empsal = Integer.parseInt(request.getParameter("empsal"));
				st = cn.prepareStatement("UPDATE EMP SET SALARY=? WHERE EMPID=?");
				st.setInt(1, empsal);
				st.setInt(2, empid);
				int res = st.executeUpdate();
				if (res == 1) {
					pout.println("<script>alert('Record Updated Successfully...')</script>");
				} else {
					pout.println("<script>alert('Record Not Found For Update..')</script>");
				}

			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				try {
					st.close();
					cn.close();

				} catch (Exception e2) {
					pout.println("Exp=" + e2);
				}
			}
		} else if (but.equalsIgnoreCase("delete")) {
			try {

				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/db4";
				cn = DriverManager.getConnection(url, "root", "7777");
				empid = Integer.parseInt(request.getParameter("empid"));
				st = cn.prepareStatement("DELETE FROM EMP WHERE EMPID=?");
				st.setInt(1, empid);
				int res = st.executeUpdate();
				if (res == 1) {
					empid = 0;
					empname = "";
					empsal = 0;
					gender = "";
					pout.println("<script>alert('Record Deleted Successfully...')</script>");
				} else {
					
					pout.println("<script>alert('Record Not Found For Delete..')</script>");
				}

			} catch (Exception e) {
				pout.println("Exp=" + e);
			} finally {
				try {
					st.close();
					cn.close();
				} catch (Exception e2) {
					pout.println("Exp=" + e2);

				}
			}
		} else if (but.equalsIgnoreCase("search")) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/db4";
				cn = DriverManager.getConnection(url, "root", "7777");
				empid = Integer.parseInt(request.getParameter("empid"));
				st = cn.prepareStatement("SELECT * FROM EMP WHERE EMPID=" + empid);
				rs = st.executeQuery();
				if (rs.next()) {
					empid = rs.getInt(1);
					empname = rs.getString(2);
					empsal = rs.getInt(3);
					gender = rs.getString(4);
					pout.println("Emp Id=" + rs.getInt(1));
					pout.println("Emp Name=" + rs.getString(2));
					pout.println("Emp Salary=" + rs.getInt(3));
					pout.println("Emp Gender=" + rs.getString(4));
				} else {
					pout.println("<script>alert('Recond not present')</script>");
				}

			} catch (Exception e) {
				pout.println("Exp=" + e);
			}
		}

		doGet(request, response);

	}

}
