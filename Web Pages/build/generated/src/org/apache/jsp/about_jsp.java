package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\tp.abp\n");
      out.write("\t{\n");
      out.write("\t\tcolor: azure;\n");
      out.write("\t\tfont-family: 'Times New Roman', Times, serif;\n");
      out.write("\t\tpadding-left:20px;\n");
      out.write("\t\tpadding-right:20px;\n");
      out.write("\t\talign:justify;\n");
      out.write("\t}\n");
      out.write("\th1.modify\n");
      out.write("\t{\n");
      out.write("\t\ttext-align: center;\n");
      out.write("\t}\n");
      out.write("\tdiv.align\n");
      out.write("\t{\n");
      out.write("\t\tmargin: auto;\n");
      out.write("\t}\n");
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
      out.write("\t\t\t  <a href=\"#\" style=\"text-decoration: none;\"><button type=\"button\" class=\"btn btn-light\"><svg  aria-hidden=\"true\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" fill=\"none\" viewBox=\"0 0 24 24\">\n");
      out.write("\t\t\t\t<path stroke=\"currentColor\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" d=\"M5 4h1.5L9 16m0 0h8m-8 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4Zm8 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4Zm-8.5-3h9.25L19 7H7.312\"/>\n");
      out.write("\t\t\t  </svg><span class=\"quantity\">0</span></button>&nbsp; &nbsp;</a><br>\n");
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
      out.write("    <tr align=\"center\">\n");
      out.write("      <td class=\"table5\" height=\"500\" >\n");
      out.write("\t\t</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td class=\"bg_c\">\n");
      out.write("\n");
      out.write("\t  \n");
      out.write("\t  <div class=\"container\" style=\"text-align: center;\">\n");
      out.write("\t<!--new row start at here-->  \n");
      out.write("  <div class=\"row\">\n");
      out.write("  <div class=\"align\">\n");
      out.write("  <h1 class=\"modify\"  style=\"text-align: center;\">About Us</h1>\n");
      out.write("  </div>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("  <!-- 2 row start at here-->\n");
      out.write("  <div class=\"row\">\n");
      out.write("  <div class=\"align\">\n");
      out.write("  <h1 class=\"modify\"  style=\"text-align: center;\">NSBM Green University</h1>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"continer\">\n");
      out.write("  <img src=\"images/nsbm.jpg\" width=\"70%\">\n");
      out.write("  </div>\n");
      out.write("    <br>\n");
      out.write("    <p class=\"abp\">NSBM Green University, the nation?s premier degree-awarding institute, is the first of\n");
      out.write("its kind in South Asia. It is a government-owned self-financed institute that operates\n");
      out.write("under the purview of the Ministry of Education. As a leading educational centre in the\n");
      out.write("country, NSBM has evolved into becoming a highly responsible higher education\n");
      out.write("institute that offers unique opportunities and holistic education on par with international\n");
      out.write("standards while promoting sustainable living.</p>\n");
      out.write("<p class=\"abp\">NSBM offers a plethora of undergraduate and postgraduate degree programmes under\n");
      out.write("five faculties: Business, Computing, Engineering, Science and Postgraduate &\n");
      out.write("Professional Advancement. These study programmes at NSBM are either its own\n");
      out.write("programmes recognised by the University Grants Commission and the Ministry of\n");
      out.write("Higher Education or world-class international programmes conducted in affiliation with\n");
      out.write("top-ranked foreign universities such as University of Plymouth, UK, and Victoria\n");
      out.write("University, Australia.</p>\n");
      out.write("<p class=\"abp\">Focused on producing competent professionals and innovative entrepreneurs for the\n");
      out.write("increasingly globalising world, NSBM nurtures its graduates to become productive\n");
      out.write("citizens of society with their specialisation ranging in study fields such as Business,\n");
      out.write("Management, Computing, IT, Engineering, Science, Psychology, Nursing, Interior\n");
      out.write("design, Quantity Surveying, Law and Multimedia.</p>\n");
      out.write("<p class=\"abp\">Inspired by the vision of being Sri Lanka?s best-performing graduate school and being\n");
      out.write("recognised internationally, NSBM currently achieves approximately 3000 new\n");
      out.write("enrollments per year and houses above 11,000 students reading over 50 degree\n");
      out.write("programmes under 4 faculties. Moreover, over the years, NSBM Green University has\n");
      out.write("gifted the nation with 14,000+ graduates and has proved its global presence with an\n");
      out.write("alumni network spread all across the world.</p>\n");
      out.write("<p class=\"abp\">Nestling on a 40-acre land amidst the greenery and serenity in Pitipana, Homagama,\n");
      out.write("NSBM Green University, is an ultra-modern university complex constructed with state-\n");
      out.write("of-the-art facilities and amenities that provides the perfect setting for high-quality\n");
      out.write("\t\t\t\tteaching, learning and research.</p>\n");
      out.write("<p class=\"abp\"><a href=\"https://www.nsbm.ac.lk/story-of-nsbm/\">Read more...</a></p>\n");
      out.write("  </div>\n");
      out.write("    \n");
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
      out.write("   <script src=\"app2.js\"></script>\n");
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
