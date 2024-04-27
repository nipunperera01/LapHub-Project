package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("   <!doctype html>\n");
      out.write("   <html lang=\"en\">\n");
      out.write("     <head>\n");
      out.write("       <title>Title</title>\n");
      out.write("       <!-- Required meta tags -->\n");
      out.write("       <meta charset=\"utf-8\">\n");
      out.write("       <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("   \n");
      out.write("       <!-- Bootstrap CSS -->\n");
      out.write("       <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("       <style>\n");
      out.write("            body\n");
      out.write("                {background-image: url(laphub2.jpg); }\n");
      out.write("            button {\n");
      out.write("                 background: color-mix( #cf00c2);\n");
      out.write("                width: 100%;\n");
      out.write("                color: #cf00c2;\n");
      out.write("                padding: 15px;\n");
      out.write("                margin: 10px 0px;\n");
      out.write("                border: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                  }\n");
      out.write("\n");
      out.write("                  button:hover {\n");
      out.write("\t\t\topacity: 0.7;\n");
      out.write("\t\t\tbackground: #6bbff2;}\n");
      out.write("\n");
      out.write("            input[type=text],\n");
      out.write("\t\t    input[type=password],\n");
      out.write("\t\t    input[type=email] {\n");
      out.write("\t\t\twidth: 35%;\n");
      out.write("\t\t\tmargin: 8px 0;\n");
      out.write("\t\t\tpadding: 12px 20px;\n");
      out.write("            background-color: transparent;\n");
      out.write("\n");
      out.write("\t\t\tborder: 2px solid black;\n");
      out.write("\t\t\tborder-radius: 8px;\n");
      out.write("\t\t\tbox-sizing: border-box;\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.cancelbtn:hover {\n");
      out.write("\t\t\topacity: 1.0;\n");
      out.write("\t\t\tbackground-color: red;\n");
      out.write("\t\t\tcolor: black;\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.cancelbtn {\n");
      out.write("\t\t\twidth: auto;\n");
      out.write("\t\t\tcolor: black;\n");
      out.write("\t\t\tbackground: #24a0ed;\n");
      out.write("\t\t\tborder-radius: 8px;\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.col-md-12 {\n");
      out.write("\t\t\tpadding: 20px;\n");
      out.write("\t\t\tborder: #cf00c2;\n");
      out.write("\t\t\tborder-radius: 20px;\n");
      out.write("        \n");
      out.write("\t\t}\n");
      out.write("\t\t.table{\n");
      out.write("\t\t\t\n");
      out.write("                        align-items:center;\n");
      out.write("                        box-sizing: border-box;\n");
      out.write("                        padding:20px;\n");
      out.write("                        border-radius: 25%;\n");
      out.write("\t\t}\n");
      out.write("\t\t.row {\n");
      out.write("\t\t\tpadding: 25px;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.col-md-12 {\n");
      out.write("\t\t\tborder-radius: 40px;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\thr {\n");
      out.write("\t\t\twidth: 90%;\n");
      out.write("\t\t\tborder: none;\n");
      out.write("\t\t\theight: 1.5px;\n");
      out.write("\t\t\tcolor: black;\n");
      out.write("\t\t\tbackground-color: black;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.logbr {\n");
      out.write("\t\t\tborder-radius: 20px;\n");
      out.write("\t\t}\n");
      out.write("        .signupb{\n");
      out.write("            color: #cf00c2;\n");
      out.write("            width: 35%;\n");
      out.write("\t\t\tmargin: 8px 0;\n");
      out.write("\t\t\tpadding: 12px 20px;\n");
      out.write("        }\n");
      out.write("        .s1{\n");
      out.write("                color: black;\n");
      out.write("\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("           \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("       </style> \n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("     <body>\n");
      out.write("          <br>\n");
      out.write("          <div class=\"container-fluid\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("               <table  width=\"100%\" border=\"1\" >\n");
      out.write("                <tbody align=\"center\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"logbr\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <div calss=\"card-col-md-12\"></div>\n");
      out.write("                                        <form action=\"signup\" method=\"post\">\n");
      out.write("                                            <center>\n");
      out.write("\n");
      out.write("                                                <h2 div class=\"s1\"> Sign Up</h2>\n");
      out.write("                                                <hr>\n");
      out.write("                                                <input type=\"text\" placeholder=\"User id\"  name=\"C_id\"  required><br/>\n");
      out.write("                                                <input type=\"text\" placeholder=\"User name\"  name=\"C_name\"  required><br/>\n");
      out.write("                                                <input type=\"text\" placeholder=\"Email\" name=\"C_mail\" required><br/>\n");
      out.write("                                                <input type=\"password\" placeholder=\"Password\" name=\"C_password\" required>\n");
      out.write("                                               \n");
      out.write("                                                <br>\n");
      out.write("                                                <button type=\"submit\" class=\"signupb\"> Sign Up </button>\n");
      out.write("                                                <br>\n");
      out.write("                                                <button type=\"reset\" class=\"cancelbtn btn-sm\"> Clear&nbsp;</button>\n");
      out.write("                                                <a href=\"index.html\"><button type=\"button\" class=\"cancelbtn btn-sm\">Cancel</button></a>\n");
      out.write("                                                <br>\n");
      out.write("                                                 have a account? <a href=\"signin.php\">LogIn</a>\n");
      out.write("                                                </center>\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    \n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>  \n");
      out.write("            </div>\n");
      out.write("       <!-- Optional JavaScript -->\n");
      out.write("       <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("       <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("       <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("       <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("     </body>\n");
      out.write("   </html>\n");
      out.write("\t\n");
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
