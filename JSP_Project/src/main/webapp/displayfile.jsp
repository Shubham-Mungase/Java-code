<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
    <title>Display Uploaded Files</title>
</head>
<body>
    <h1>Uploaded Files</h1>

    <table border="1">
        <tr>
            <th>File Name</th>
        </tr>

        <%
            // Database connection parameters
            String dbURL = "jdbc:mysql://localhost:3306/suhani";
            String dbUser = "root";
            String dbPassword = "7777";

            try (Connection cn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
                 Statement stmt = cn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT iname, filename FROM imgae")) {

                while (rs.next()) {
                    String iname = rs.getString("iname");
                    String filename = rs.getString("filename");
                    String fileURL = request.getContextPath() + "/images/" + filename; // Dynamic URL for file access
        %>
        <tr>
            <td><%= iname %></td>
            <td>
                <% 
                    // Display file preview if it is an image
                    if (filename.endsWith(".jpg") || filename.endsWith(".png") || filename.endsWith(".gif")) { 
                %>
                <img src="<%= fileURL %>" alt="<%= iname %>" width="500" height="500">
                <% } %>
            </td>
        </tr>
        <%
                } // End of while loop
            } catch (Exception e) {
                e.printStackTrace();
        %>
        <tr>
            <td colspan="3">Error retrieving file list: <%= e.getMessage() %></td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>
