package demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class ImageDisplay
 */
@WebServlet("/DisplayImage")
public class DisplayImage extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayImage() {
        super();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");

        int id;
        try {
            id = Integer.parseInt(request.getParameter("txid"));
        } catch (NumberFormatException e) {
            pw.println("Invalid ID format.");
            return;
        }

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            String url = "jdbc:mysql://localhost:3306/suhani";
            Connection cn = DriverManager.getConnection(url, "root", "7777");

            // Prepare the SQL query
            String query = "SELECT iname, filename FROM imgae where imgid=?";
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setInt(1, id);

            // Execute the query
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String name = rs.getString("iname");
                String filename = rs.getString("filename");

                // Set session attributes and redirect
                HttpSession session = request.getSession();
                session.setAttribute("name", name);
                session.setAttribute("filename", filename);
                response.sendRedirect("DisplayImage.jsp");
            } else {
                pw.println("Record not found.");
            }

            // Close resources
            rs.close();
            ps.close();
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
            pw.println("An error occurred while processing your request.");
        }
    }
}
