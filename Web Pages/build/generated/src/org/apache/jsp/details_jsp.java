package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.util.Base64;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class details_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    
    try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myshop", "root", "101010");
        
        
                String query = "SELECT * FROM product where P_id=17";
                PreparedStatement pstmt = con.prepareStatement(query);
                ResultSet rs = pstmt.executeQuery();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>About</title>\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("\t<link href=\"css/bootstrap-4.4.1.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<style>\n");
      out.write("    \n");
      out.write("\n");
      out.write(":root {\n");
      out.write("    --card-height: 300px;\n");
      out.write("    --card-width: 450px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  body {\n");
      out.write("   \n");
      out.write("\n");
      out.write("    padding: 0px;\n");
      out.write("    background: linear-gradient(to bottom, #33ccff 0%, #ffffff 100%);\n");
      out.write("  }\n");
      out.write("  .column {\n");
      out.write("    float: left;\n");
      out.write("    padding: 210px;\n");
      out.write("    height: 700px; \n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .left {\n");
      out.write("    width: 35%;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .right {\n");
      out.write("    width: 65%;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .row:after {\n");
      out.write("    content: \"\";\n");
      out.write("    display: table;\n");
      out.write("    clear: both;\n");
      out.write("  }\n");
      out.write("  .card {\n");
      out.write("    width: var(--card-width);\n");
      out.write("    height: var(--card-height);\n");
      out.write("    position: relative;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: flex-end;\n");
      out.write("    padding: 0 36px;\n");
      out.write("    perspective: 2500px;\n");
      out.write("    margin: 0;\n");
      out.write("    margin-left: -145px;\n");
      out.write("    margin-top: 60px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .cover-image {\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100%;\n");
      out.write("    object-fit: cover;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .wrapper {\n");
      out.write("    transition: all 0.5s;\n");
      out.write("    position: absolute;\n");
      out.write("    width: 100%;\n");
      out.write("    z-index: -1;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .card:hover .wrapper {\n");
      out.write("    transform: perspective(900px) translateY(-5%) rotateX(25deg) translateZ(0);\n");
      out.write("    box-shadow: 2px 35px 32px -8px rgba(0, 0, 0, 0.75);\n");
      out.write("    -webkit-box-shadow: 2px 35px 32px -8px rgba(0, 0, 0, 0.75);\n");
      out.write("    -moz-box-shadow: 2px 35px 32px -8px rgba(0, 0, 0, 0.75);\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .wrapper::before,\n");
      out.write("  .wrapper::after {\n");
      out.write("    content: \"\";\n");
      out.write("    opacity: 0;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 80px;\n");
      out.write("    transition: all 0.5s;\n");
      out.write("    position: absolute;\n");
      out.write("    left: 0;\n");
      out.write("  }\n");
      out.write("  .wrapper::before {\n");
      out.write("    top: 0;\n");
      out.write("    height: 100%;\n");
      out.write("    background-image: linear-gradient(\n");
      out.write("      to top,\n");
      out.write("      transparent 46%,\n");
      out.write("      rgba(12, 13, 19, 0.5) 68%,\n");
      out.write("      rgba(12, 13, 19) 97%\n");
      out.write("    );\n");
      out.write("  }\n");
      out.write("  .wrapper::after {\n");
      out.write("    bottom: 0;\n");
      out.write("    opacity: 1;\n");
      out.write("    background-image: linear-gradient(\n");
      out.write("      to bottom,\n");
      out.write("      transparent 46%,\n");
      out.write("      rgba(12, 13, 19, 0.5) 68%,\n");
      out.write("      rgba(12, 13, 19) 97%\n");
      out.write("    );\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .card:hover .wrapper::before,\n");
      out.write("  .wrapper::after {\n");
      out.write("    opacity: 1;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .card:hover .wrapper::after {\n");
      out.write("    height: 120px;\n");
      out.write("  }\n");
      out.write("  .title {\n");
      out.write("    width: 100%;\n");
      out.write("    transition: transform 0.5s;\n");
      out.write("  }\n");
      out.write("  .card:hover .title {\n");
      out.write("    transform: translate3d(0%, -50px, 100px);\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .character {\n");
      out.write("    width: 100%;\n");
      out.write("    opacity: 0;\n");
      out.write("    transition: all 0.5s;\n");
      out.write("    position: absolute;\n");
      out.write("    z-index: -1;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .card:hover .character {\n");
      out.write("    opacity: 1;\n");
      out.write("    transform: translate3d(0%, -30%, 100px);\n");
      out.write("  }\n");
      out.write("  span.head{\n");
      out.write("    display: flex;\n");
      out.write("    font-size: 40px;\n");
      out.write("    letter-spacing: 0.1em;\n");
      out.write("    font-family: poppins;\n");
      out.write("    text-shadow: 3px 3px 6px rgba(5, 99, 242, 0.5);\n");
      out.write("    margin-top: -170px;\n");
      out.write("  }\n");
      out.write("  h2{\n");
      out.write("    font-size: 2em;\n");
      out.write("    text-align: center;\n");
      out.write("    line-height: 10px;\n");
      out.write("  }\n");
      out.write("  .column.right {\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button{\n");
      out.write("    \n");
      out.write("  }\n");
      out.write("  button.adc {\n");
      out.write("    background-color:rgb(0, 157, 255);\n");
      out.write("    color: white; \n");
      out.write("    font-size: 22px;\n");
      out.write("    transition: transform 0.3s ease;\n");
      out.write("    box-shadow: 0px 4px 30px rgba(69, 210, 223, 0.35);\n");
      out.write("    margin: 20px;\n");
      out.write("    padding: 10px;\n");
      out.write("    border-radius: 30px;\n");
      out.write("    width: 300px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    border: none;\n");
      out.write("}\n");
      out.write("button.adc:hover {\n");
      out.write("  transform: scale(1.2); /* Scale button on hover */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".warranty{\n");
      out.write("    font-size: 1rem;\n");
      out.write("    font-weight: 800;\n");
      out.write("    line-height: 1.5;\n");
      out.write("    color: #212529;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("h3{\n");
      out.write("    text-align: left;\n");
      out.write("    font-weight: 500;\n");
      out.write("    color: grey;\n");
      out.write("}\n");
      out.write("p{\n");
      out.write("  text-align: left;\n");
      out.write("  font-size: 16px;\n");
      out.write("  line-height: 30px;\n");
      out.write("  letter-spacing: 0.1em;\n");
      out.write("  font-weight: 400;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("</style>\n");
      out.write("  </head>\n");
      out.write("  <body background=\"cover.jpg\">\n");
      out.write("\t  \n");
      out.write("\t  <!--nav bar -->\n");
      out.write("\t  \n");
      out.write("\t  <nav class=\"navbar navbar-expand-lg navbar-dark w3-large\"> <a href=\"index.jsp\"><img src=\"logo.png\" height=\"100\" ></a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent1\" aria-controls=\"navbarSupportedContent1\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"> <span class=\"navbar-toggler-icon\"></span> </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent1\">\n");
      out.write("          <ul class=\"navbar-nav ml-auto\">\n");
      out.write("            <li class=\"nav-item \"> <a class=\"nav-link\" href=\"index.jsp\">Home <span class=\"sr-only\">(current)</span></a> </li>\n");
      out.write("\t\t\t  <li class=\"nav-item\"> <a class=\"nav-link\" href=\"product.jsp\">Products</a> </li>\n");
      out.write("\t\t\t  <li class=\"nav-item\"> <a class=\"nav-link\" href=\"contact.html\">Contact Us</a> </li>\n");
      out.write("\t\t\t  <li class=\"nav-item active\"> <a class=\"nav-link\" href=\"about.jsp\">About Us</a> </li>\n");
      out.write("\t\t\t  &nbsp;\n");
      out.write("\t\t\t  <a href=\"##\" style=\"text-decoration: none;\"><button type=\"button\" class=\"btn btn-light\"><svg  aria-hidden=\"true\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" fill=\"none\" viewBox=\"0 0 24 24\">\n");
      out.write("\t\t\t\t<path stroke=\"currentColor\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" d=\"M5 4h1.5L9 16m0 0h8m-8 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4Zm8 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4Zm-8.5-3h9.25L19 7H7.312\"/>\n");
      out.write("\t\t\t  </svg></button>&nbsp; &nbsp;</a><br>\n");
      out.write("\t\t\t  <a href=\"signup.jsp\" style=\"text-decoration: none;\"><button type=\"button\" class=\"btn btn-light\">Sign Up</button>&nbsp; &nbsp;</a>\n");
      out.write("                           <a href=\"login.jsp\" style=\"text-decoration: none;\"><button type=\"button\" class=\"btn btn-light\">Login</button>&nbsp; &nbsp;</a>\n");
      out.write("\t\t  </ul>\n");
      out.write("\t\t  </div>\t  \n");
      out.write("      </nav>\n");
      out.write("\t  \n");
      out.write("\t  <!--navbar end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t  <table width=\"100%\" border=\"0\">\n");
      out.write("  <tbody>\n");
      out.write("    <div class=\"row\">\n");
      out.write("         ");
 
                if (rs.next()) {
            
      out.write("\n");
      out.write("        <div class=\"column left\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"wrapper\">\n");
      out.write("                 \n");
      out.write("                  ");
                
                    Blob blob = rs.getBlob("P_img"); 
                    byte[] imageBytes = blob.getBytes(1, (int) blob.length());
                    String base64Image = Base64.getEncoder().encodeToString(imageBytes);
                    String imageData = "data:image/jpeg;base64," + base64Image; 
                    out.println("<img src='" + imageData + "' width='150'>");
                
      out.write(" \n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("              </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"column right\">\n");
      out.write("          <span class=\"head\">");
      out.print( rs.getString("P_name") );
      out.write("</span><br><hr />\n");
      out.write("\n");
      out.write("          <h2 style=\"color: crimson;\">");
      out.print( rs.getString("P_price") );
      out.write("LKR</h2>\n");
      out.write("         \n");
      out.write("          \n");
      out.write("          <a href=\"#\">\n");
      out.write("            <button class=\"adc\"> Add to Cart </button>\n");
      out.write("            </a><br>\n");
      out.write("            <hr />\n");
      out.write("        \n");
      out.write("            <span class=\"warranty\">\n");
      out.write("                01 YEAR HARDWARE WARRANTY + 02 YEARS SERVICE WARRANTY \n");
      out.write("            </span><br><br>\n");
      out.write("            <h3 class=\"spc\">\n");
      out.write("                Product Specifications\n");
      out.write("            </h3><hr />\n");
      out.write("            <p>\n");
      out.write("                ");
      out.print( rs.getString("P_desc") );
      out.write("\n");
      out.write("            </p>\n");
      out.write("            ");
 } else { 
      out.write("\n");
      out.write("            <p>No data found for the specified product ID</p>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- body code goes here -->\n");
      out.write("\n");
      out.write("<!-- footer goes here -->\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3\" align=\"center\"><img src=\"logo.png\" height=\"150\">\n");
      out.write("              <br>\n");
      out.write("                  <p class=\"slogan\">\"Good Products, Good quality\"</p></div>\n");
      out.write("             <div class=\"col-md-3\">\n");
      out.write("                 <br>\n");
      out.write("              <h6>Quick Links</h6>\n");
      out.write("              <hr class=\"footer_hr\">\n");
      out.write("              \n");
      out.write("              <ul> <a class=\"flink\" href=\"index.php\"> Home </a><br>\n");
      out.write("                 <a class=\"flink\" href=\"product.php\"> Products </a><br>\n");
      out.write("                 <a class=\"flink\" href=\"contact.php\"> Contact Us </a><br>\n");
      out.write("                 <a class=\"flink\" href=\"about.php\"> About Us </a><br>\n");
      out.write("                <a class=\"flink\" href=\"signin.php\"> SignIn </a></ul><br>\n");
      out.write("          \n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("                     <div class=\"col-md-3\">\n");
      out.write("                 <br>\n");
      out.write("            <h6>About Us</h6>\n");
      out.write("              <hr class=\"footer_hr\">\n");
      out.write("                <p class=\"about\"> \" Your go-to for top-tier laptops & accessories. Catering to gamers, students, and professionals, we deliver quality products and stellar service for an elevated digital experience.\" </p>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("          </div> \n");
      out.write("         \n");
      out.write("          <div class=\"col-md-3\">\n");
      out.write("              <br>\n");
      out.write("              <h6>Get In Touch</h6>\n");
      out.write("              <hr class=\"footer_hr\">\n");
      out.write("              <br>\n");
      out.write("              <ul><img src=\"images/icons/location.png\" width=\"19\">&nbsp; 123 Street,Homagama,Colombo<br>\n");
      out.write("              <img src=\"images/icons/phone.png\" width=\"19\">&nbsp; +9411678900<br>\n");
      out.write("              <a href=\"\"><img src=\"images/icons/email.png\" width=\"19\"></a> &nbsp;Info@example.com<br>\n");
      out.write("              <img src=\"images/icons/time.png\" width=\"19\"> &nbsp;Mon - Fri (9AM - 9PM)</ul><br>\n");
      out.write("              <center>\n");
      out.write("                  \n");
      out.write("              <a href=\"\" style=\"text-decoration: none;\"><img src=\"images/icons/instagram.png\" width=\"19\">&nbsp;</a>\n");
      out.write("              <a href=\"\" style=\"text-decoration: none;\"><img src=\"images/icons/facebook.png\" width=\"19\">&nbsp;</a>\n");
      out.write("              <a href=\"\" style=\"text-decoration: none;\"><img src=\"images/icons/twitter.png\" width=\"19\">&nbsp;</a>\n");
      out.write("              <a href=\"\" style=\"text-decoration: none;\"><img src=\"images/icons/linkdin.png\" width=\"19\">&nbsp;</a>\n");
      out.write("              <a href=\"\" style=\"text-decoration: none;\"><img src=\"images/icons/youtube.png\" width=\"19\">&nbsp;</a>\n");
      out.write("              <a href=\"\" style=\"text-decoration: none;\"><img src=\"images/icons/printerest.png\" width=\"19\">&nbsp;</a>\n");
      out.write("              <a href=\"\" style=\"text-decoration: none;\"><img src=\"images/icons/whatsapp.png\" width=\"19\">&nbsp;</a>\n");
      out.write("             \n");
      out.write("              </center>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("    \n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("                <footer class=\"footer_1\" align=\"center\"><br>Copyright @ 2023 All Rights Reserved by <a class=\"flink\" href=\"\"> LapHub</a><br>&nbsp;</footer>\n");
      out.write("    \n");
      out.write("        </footer>\n");
      out.write("\t\n");
      out.write("\t<!-- jQuery (necessary for Bootstrap's JavaScript plugins) --> \n");
      out.write("\t<script src=\"js/jquery-3.4.1.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("\t<script src=\"js/popper.min.js\"></script> \n");
      out.write("  <script src=\"js/bootstrap-4.4.1.js\"></script>\n");
      out.write("   ");

    
    rs.close();
    pstmt.close();
    con.close();
    

}catch (SQLException ex) {
            out.println("<h3>Error closing resources: " + ex.getMessage() + "</h3>");
        }

      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
