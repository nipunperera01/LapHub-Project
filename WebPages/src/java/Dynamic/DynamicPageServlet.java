/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class DynamicPageServlet extends HttpServlet {
    // Database connection parameters
    private static final String DB_URL = "jdbc:mysql://localhost:3306/myshop";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "101010";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page = request.getParameter("index.html"); // Get the requested page parameter
        String dbDetails = getDatabaseDetailsForPage(page); // Get database details for the requested page
        String htmlContent = generatePageContent(dbDetails); // Generate HTML content based on the database details
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println(htmlContent); // Send the HTML response back to the client
    }

    // Method to get database details based on the requested page
    private String getDatabaseDetailsForPage(String page) {
        String dbDetails = "Default database details"; // Default value
        
        // Establish database connection
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            // Execute query to retrieve database details based on the requested page
            String query = "SELECT db_details FROM page_details WHERE page = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, page);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        dbDetails = resultSet.getString("db_details");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle database connection or query errors
        }
        
        return dbDetails;
    }

    // Method to generate HTML content for the page based on database details
    private String generatePageContent(String dbDetails) {
        // You can dynamically generate HTML content here using the database details
        // For simplicity, I'm returning a basic HTML string
        return "<html><head><title>Dynamic Page</title></head><body>" +
                "<h1>Dynamic Page Content</h1>" +
                "<p>Database Details: " + dbDetails + "</p>" +
                "</body></html>";
    }
}
