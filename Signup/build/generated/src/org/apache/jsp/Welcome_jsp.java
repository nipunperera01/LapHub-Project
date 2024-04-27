package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  \n");
      out.write("\t<link href=\"css/bootstrap-4.4.1.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"lapcss.css\">\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("       \tdiv {\n");
      out.write("\t\t\tpadding-top: 50px;\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("\t\t\tpadding-left: 150px;\n");
      out.write("\t\t\tpadding-right: 150px;\n");
      out.write("\t\t\tpadding-bottom: 50px;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tbody {\n");
      out.write("\t\t\tbackground-attachment: fixed;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfont {\n");
      out.write("\t\t\tfont-size: 7.0rem;\n");
      out.write("\t\t\tcolor: #B66F39;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.ss {\n");
      out.write("\t\t\tbackground:#F2F0E4;\n");
      out.write("\t\t\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\th5,\n");
      out.write("\t\th6,h2 {\n");
      out.write("\t\t\tcolor: #3D3028;\n");
      out.write("\t\t}\n");
      out.write("                .btn-info{\n");
      out.write("                   color: #3D3028;\n");
      out.write("                    width: 18%;\n");
      out.write("                    margin: 8px 0;\n");
      out.write("                    padding: 12px 20px;\n");
      out.write("                   \n");
      out.write("        }  \n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("        \n");
      out.write("\t  </head>\n");
      out.write("<body>\n");
      out.write("    <div\n");
      out.write("\t<div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"ss\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<font>WELCOME</font>\n");
      out.write("\t\t\t<h2>\n");
      out.write("\t\t\t\t<p>Thank you for Joining with Us</p>\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</h2>\n");
      out.write("                        \n");
      out.write("\t<img src=\"laphub.png\"  height=\"200\">\n");
      out.write("\t\t\t<h6>\n");
      out.write("\n");
      out.write("\t\t\t\tThe LapHub Team<br>\n");
      out.write("\n");
      out.write("\t\t\t\t<br>\n");
      out.write("\t\t\t\t<a href=\"Login.jsp\"><button type=\"button\" class=\"btn btn-info\">Shop Now </button></a>\n");
      out.write("\t\t\t</h6>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </body>\n");
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
