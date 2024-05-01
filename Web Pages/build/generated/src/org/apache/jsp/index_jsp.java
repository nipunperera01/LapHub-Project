package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Base64;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    
    try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myshop", "root", "101010");
        
        
                String query = "SELECT * FROM product";
                PreparedStatement pstmt = con.prepareStatement(query);
                ResultSet rs = pstmt.executeQuery();

      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>index</title>\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("\t<link href=\"css/bootstrap-4.4.1.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\t<link href=\"css/prcss.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  </head>\n");
      out.write("  <style>\n");
      out.write("\tp.product-price\n");
      out.write("\t{\n");
      out.write("\t\tcolor: black;\n");
      out.write("\t}\n");
      out.write("  </style>\n");
      out.write("  <body background=\"cover.jpg\">\n");
      out.write("\t  \n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark w3-large\" ><a href=\"index.jsp\"><img src=\"logo.png\" height=\"100\" ></a>\n");
      out.write("\t    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent1\" aria-controls=\"navbarSupportedContent1\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"> <span class=\"navbar-toggler-icon\"></span> </button>\n");
      out.write("\t    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent1\">\n");
      out.write("\t      <ul class=\"navbar-nav ml-auto\">\n");
      out.write("\t        <li class=\"nav-item active\"> <a class=\"nav-link\" href=\"index.jsp\">Home </a> </li>\n");
      out.write("\t\t\t<li class=\"nav-item \"> <a class=\"nav-link\" href=\"product.jsp\">Products<span class=\"sr-only\">(current)</span></a> </li>\n");
      out.write("\t\t\t<li class=\"nav-item\"> <a class=\"nav-link\" href=\"contact.html\">Contact Us</a> </li>\n");
      out.write("\t\t\t<li class=\"nav-item\"> <a class=\"nav-link\" href=\"about.jsp\">About Us</a> </li>\n");
      out.write("\t\t\t &nbsp;\n");
      out.write("\t\t\t  <a href=\"##\" style=\"text-decoration: none;\"><button type=\"button\" class=\"btn btn-light\"><svg  aria-hidden=\"true\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" fill=\"none\" viewBox=\"0 0 24 24\">\n");
      out.write("\t\t\t\t<path stroke=\"currentColor\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" d=\"M5 4h1.5L9 16m0 0h8m-8 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4Zm8 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4Zm-8.5-3h9.25L19 7H7.312\"/>\n");
      out.write("\t\t\t  </svg></button>&nbsp; &nbsp;</a><br>\n");
      out.write("\t\t\t  <a href=\"signup.jsp\" style=\"text-decoration: none;\"><button type=\"button\" class=\"btn btn-light\">Sign Up</button>&nbsp; &nbsp;</a>\n");
      out.write("                           <a href=\"login.jsp\" style=\"text-decoration: none;\"><button type=\"button\" class=\"btn btn-light\">Login</button>&nbsp; &nbsp;</a>\n");
      out.write("\t\t\t</ul>\n");
      out.write("      </div>\n");
      out.write("  </nav>\n");
      out.write("\t  \n");
      out.write("\t  <table width=\"100%\" border=\"0\">\n");
      out.write("  <tbody>\n");
      out.write("    <tr align=\"center\">\n");
      out.write("      <td class=\"table3\" height=\"500\">\n");
      out.write("\t\t  <br>\n");
      out.write("\t\t  \n");
      out.write("    </tr>\n");
      out.write("    <tr><td class=\"bg_c\">\n");
      out.write("        <section class=\"products\">\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t<h1 align=\"center\"> Our sales </h1>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<div class=\"all-products\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"product\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"product-info\">\n");
      out.write("\t\t\t\t\t<img class='tokenImage' src=\"assests/msi.png\" alt=\"Msi\" />\n");
      out.write("                                        <h2>MSI</h2>\n");
      out.write("                                        <hr />\n");
      out.write("                                        <div class=\"btn\">\n");
      out.write("                                         <a href=\"product.jsp\">\n");
      out.write("                                        <button>See All</button>\n");
      out.write("                                        </a>\n");
      out.write("                                  </div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"product\">\n");
      out.write("\t\t\t\t\t<img class='tokenImage' src=\"assests/f1472cd9f017531ed6c575beeeabb368.png\" alt=\"asus\" />\n");
      out.write("                                        <h2>Asus</h2>\n");
      out.write("                                        <hr />\n");
      out.write("                                        <div class=\"btn\">\n");
      out.write("                                         <a href=\"product.jsp\">\n");
      out.write("                                         <button>See All</button>\n");
      out.write("                                        </a>\n");
      out.write("                                  </div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"product\">\n");
      out.write("\t\t\t\t\t<img class='tokenImage' src=\"assests/Lenovo.webp\" alt=\"Lenovo\" />\n");
      out.write("                                        <h2>Lenovo</h2>\n");
      out.write("                                        <hr />\n");
      out.write("                                        <div class=\"btn\">\n");
      out.write("                                         <a href=\"product.jsp\">\n");
      out.write("                                        <button>See All</button>\n");
      out.write("                                        </a>\n");
      out.write("                                  </div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("            \n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</section><br>\n");
      out.write("    <center><a href=\"product.jsp\"><button type=\"button\" class=\"btn btn-light btn-lg\">View more</button></a></center>\n");
      out.write("<br>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("    <tr><td height=\"200\" bgcolor=\"black\">\n");
      out.write("\n");
      out.write("    </td></tr>\n");
      out.write("\n");
      out.write("    <tr>\n");
      out.write("      <td class=\"bg_c\">\n");
      out.write("\t\t  \n");
      out.write("\t\t <table width=\"80%\" border=\"0\" align=\"center\">\n");
      out.write("        <tbody>\n");
      out.write("\t   <tr width=\"40\"><td></td></tr>\n");
      out.write("       <tr align=\"center\">\n");
      out.write("\t   <td>\n");
      out.write("\t\t\n");
      out.write("\t\t<section class=\"products\">\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t<h1 align=\"center\">Our Products</h1>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<div class=\"all-products\">\n");
      out.write("                        ");
 while(rs.next()) { 
      out.write("\n");
      out.write("\t\t\t<div class=\"product\">\n");
      out.write("\t\t\t\t");
                
                    Blob blob = rs.getBlob("P_img"); 
                    byte[] imageBytes = blob.getBytes(1, (int) blob.length());
                    String base64Image = Base64.getEncoder().encodeToString(imageBytes);
                    String imageData = "data:image/jpeg;base64," + base64Image; 
                    out.println("<img src='" + imageData + "' width='150'>");
                
      out.write("\n");
      out.write("\t\t\t\t<div class=\"product-info\">\n");
      out.write("                                    <h4 class=\"product-title\">");
      out.print( rs.getString("P_name") );
      out.write("</h4>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<p class=\"product-price\">");
      out.print( rs.getString("P_price") );
      out.write("</p>\n");
      out.write("\t\t\t\t\t<a class=\"product-btn\" href=\"details.jsp\">view more..</a>\n");
      out.write("                                        <a class=\"product-btn\" href=\"##\">Add to cart</a>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("                                         ");
 } 
      out.write(" \n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("               \n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("         \n");
      out.write("\t\t\n");
      out.write("\t</section><br>\n");
      out.write("\t\t\t<center><a href=\"product.jsp\"><button type=\"button\" class=\"btn btn-light btn-lg\">View more</button></a></center>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t</td>\n");
      out.write("\t  </tr>\n");
      out.write("\n");
      out.write("\t\t\t </tbody>\n");
      out.write("\t\t</table>\n");
      out.write("\t\t</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr><td height=\"175\">\n");
      out.write("\n");
      out.write("    </td></tr>\n");
      out.write("    \n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- body code goes here -->\n");
      out.write("\n");
      out.write("\t  <!-- footer goes here -->\n");
      out.write(" \n");
      out.write("\t  <footer>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-3\" align=\"center\"><img src=\"logo.png\" height=\"150\">\n");
      out.write("\t\t  <br>\n");
      out.write("\t\t      <p class=\"slogan\">\"Good Products, Good quality\"</p></div>\n");
      out.write("\t\t <div class=\"col-md-3\">\n");
      out.write("\t\t\t <br>\n");
      out.write("\t\t  <h6>Quick Links</h6>\n");
      out.write("\t\t  <hr class=\"footer_hr\">\n");
      out.write("\t\t  \n");
      out.write("\t\t  <ul> <a class=\"flink\" href=\"index.php\"> Home </a><br>\n");
      out.write("\t\t\t <a class=\"flink\" href=\"product.php\"> Products </a><br>\n");
      out.write("\t\t\t <a class=\"flink\" href=\"contact.php\"> Contact Us </a><br>\n");
      out.write("\t\t\t <a class=\"flink\" href=\"about.php\"> About Us </a><br>\n");
      out.write("\t\t\t<a class=\"flink\" href=\"signin.php\"> SignIn </a></ul><br>\n");
      out.write("\t  \n");
      out.write("\t  </div>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t <div class=\"col-md-3\">\n");
      out.write("\t\t\t <br>\n");
      out.write("\t\t<h6>About Us</h6>\n");
      out.write("\t\t  <hr class=\"footer_hr\">\n");
      out.write("\t\t\t<p class=\"about\"> \" Your go-to for top-tier laptops & accessories. Catering to gamers, students, and professionals, we deliver quality products and stellar service for an elevated digital experience.\" </p>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t  </div> \n");
      out.write("     \n");
      out.write("      <div class=\"col-md-3\">\n");
      out.write("\t\t  <br>\n");
      out.write("\t\t  <h6>Get In Touch</h6>\n");
      out.write("\t\t  <hr class=\"footer_hr\">\n");
      out.write("\t\t  <br>\n");
      out.write("\t\t  <ul><img src=\"images/icons/location.png\" width=\"19\">&nbsp; 123 Street,Homagama,Colombo<br>\n");
      out.write("\t\t  <img src=\"images/icons/phone.png\" width=\"19\">&nbsp; +9411678900<br>\n");
      out.write("\t\t  <a href=\"\"><img src=\"images/icons/email.png\" width=\"19\"></a> &nbsp;Info@example.com<br>\n");
      out.write("\t\t  <img src=\"images/icons/time.png\" width=\"19\"> &nbsp;Mon - Fri (9AM - 9PM)</ul><br>\n");
      out.write("\t\t  <center>\n");
      out.write("\t\t\t  \n");
      out.write("\t\t  <a href=\"\" style=\"text-decoration: none;\"><img src=\"images/icons/instagram.png\" width=\"19\">&nbsp;</a>\n");
      out.write("\t\t  <a href=\"\" style=\"text-decoration: none;\"><img src=\"images/icons/facebook.png\" width=\"19\">&nbsp;</a>\n");
      out.write("\t\t  <a href=\"\" style=\"text-decoration: none;\"><img src=\"images/icons/twitter.png\" width=\"19\">&nbsp;</a>\n");
      out.write("\t\t  <a href=\"\" style=\"text-decoration: none;\"><img src=\"images/icons/linkdin.png\" width=\"19\">&nbsp;</a>\n");
      out.write("\t      <a href=\"\" style=\"text-decoration: none;\"><img src=\"images/icons/youtube.png\" width=\"19\">&nbsp;</a>\n");
      out.write("\t      <a href=\"\" style=\"text-decoration: none;\"><img src=\"images/icons/printerest.png\" width=\"19\">&nbsp;</a>\n");
      out.write("\t      <a href=\"\" style=\"text-decoration: none;\"><img src=\"images/icons/whatsapp.png\" width=\"19\">&nbsp;</a>\n");
      out.write("\t\t \n");
      out.write("\t\t  </center>\n");
      out.write("\t\t  \n");
      out.write("\t\t  \n");
      out.write("\t\t  \n");
      out.write("\t  </div>\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\t<br>\n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write("\t\t\t<footer class=\"footer_1\" align=\"center\"><br>Copyright @ 2023 All Rights Reserved by <a class=\"flink\" href=\"\"> LapHub</a><br>&nbsp;</footer>\n");
      out.write("\n");
      out.write("    </footer>\n");
      out.write("\t<!-- jQuery (necessary for Bootstrap's JavaScript plugins) --> \n");
      out.write("\t<script src=\"js/jquery-3.4.1.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("\t<script src=\"js/popper.min.js\"></script> \n");
      out.write("\t<script src=\"js/bootstrap-4.4.1.js\"></script>\n");
      out.write("        ");

    
    rs.close();
    pstmt.close();
    con.close();
    
} catch (Exception e) {
    e.printStackTrace();
}

      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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
