package demo;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 10, maxFileSize = 1024 * 1024 * 50, maxRequestSize = 1024 * 1024
		* 100)
/**
 * Servlet implementation class fileservlet1
 */
@WebServlet("/FileUpload")
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FileUpload() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		Part file = request.getPart("image");
		String but = request.getParameter("but");
		String filename = file.getSubmittedFileName();
		System.out.println(filename);
		String uploadPath = "G:\\Shubham-java-codes\\JSP_Project\\src\\main\\webapp\\images\\" + filename;
		System.out.println(uploadPath);

		try {

			FileOutputStream fout = new FileOutputStream(uploadPath);
			InputStream is = file.getInputStream();
			byte[] data = new byte[is.available()];
			is.read(data);
			fout.write(data);
			fout.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/suhani";
			Connection cn = DriverManager.getConnection(url, "root", "7777");
				PreparedStatement ps = cn.prepareStatement("insert into imgae(imgid,iname,filename) values(?,?,?)");
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3, filename);
				int result = ps.executeUpdate();

				if (result == 1) {
					pw.print("insert user");
				} else {
					pw.print("record not insert");
				}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}