package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("    background-color: #E3E7E8;\n");
      out.write("    font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;\n");
      out.write("}\n");
      out.write(".container{\n");
      out.write("    width: 1000px;\n");
      out.write("    margin: auto;\n");
      out.write("    transition: 0.5s;\n");
      out.write("}\n");
      out.write("header{\n");
      out.write("    display: grid;\n");
      out.write("    grid-template-columns: 1fr 50px;\n");
      out.write("    margin: 50px;\n");
      out.write("}\n");
      out.write("header .shopping{\n");
      out.write("    position: relative;\n");
      out.write("    text-align: right;\n");
      out.write("}\n");
      out.write("header .shopping img{\n");
      out.write("    width: 40px;\n");
      out.write("}\n");
      out.write("header .shopping span{\n");
      out.write("    background-color: red;\n");
      out.write("    border-radius: 50%;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    color: #fff;\n");
      out.write("    position: absolute;\n");
      out.write("    top: -5px;\n");
      out.write("    left: 80%;\n");
      out.write("    padding: 3px 10px;\n");
      out.write("}\n");
      out.write(".list{\n");
      out.write("    display: grid;\n");
      out.write("    grid-template-columns: repeat(3, 1fr);\n");
      out.write("    column-gap: 20px;\n");
      out.write("    row-gap: 20px;\n");
      out.write("    margin-top: 50px;\n");
      out.write("}\n");
      out.write(".card{\n");
      out.write("    position: fixed;\n");
      out.write("    top: 0;\n");
      out.write("    left: 100%;\n");
      out.write("    width: 500px;\n");
      out.write("    background-color: #453E3B;\n");
      out.write("    height: 100vh;\n");
      out.write("    transition: 0.5s;\n");
      out.write("}\n");
      out.write(".card h1{\n");
      out.write("    color: #E8BC0E;\n");
      out.write("    font-weight: 100;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0 20px;\n");
      out.write("    height: 80px;\n");
      out.write("    display: flex;\n");
      out.write("    align-items: center;\n");
      out.write("}\n");
      out.write(".card .checkOut{\n");
      out.write("    position: absolute;\n");
      out.write("    bottom: 0;\n");
      out.write("    width: 100%;\n");
      out.write("    display: grid;\n");
      out.write("    grid-template-columns: repeat(2, 1fr);\n");
      out.write("}\n");
      out.write(".card .checkOut div{\n");
      out.write("    background-color: #E8BC0E;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 70px;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    font-weight: bold;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write(".card .checkOut div:nth-child(2){\n");
      out.write("    background-color: #1C1F25;\n");
      out.write("    color: #fff;\n");
      out.write("}\n");
      out.write(".active .card{\n");
      out.write("    left: calc(100% - 500px);\n");
      out.write("}\n");
      out.write(".active .container{\n");
      out.write("    transform: translateX(-200px);\n");
      out.write("}\n");
      out.write(".list .item{\n");
      out.write("    text-align: center;\n");
      out.write("    background-color: #DCE0E1;\n");
      out.write("    padding: 20px;\n");
      out.write("    box-shadow: 0 50px 50px #757676;\n");
      out.write("    letter-spacing: 1px;\n");
      out.write("}\n");
      out.write(".list .item img{\n");
      out.write("    width: 90%;\n");
      out.write("}\n");
      out.write(".list .item .title{\n");
      out.write("    font-weight: 600;\n");
      out.write("}\n");
      out.write(".list .item .price{\n");
      out.write("    margin: 10px;\n");
      out.write("}\n");
      out.write(".list .item button{\n");
      out.write("    background-color: #1C1F25;\n");
      out.write("    color: #fff;\n");
      out.write("    padding: 10px;\n");
      out.write("    width: 100px;\n");
      out.write("}\n");
      out.write(".listCard li{\n");
      out.write("    display: grid;\n");
      out.write("    grid-template-columns: 100px repeat(3, 1fr);\n");
      out.write("    color: #fff;\n");
      out.write("    row-gap: 10px;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("}\n");
      out.write(".listCard li div{\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("}\n");
      out.write(".listCard li img{\n");
      out.write("    width: 90%;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".listCard button{\n");
      out.write("    width: auto;\n");
      out.write("    background-color: #fff5;\n");
      out.write("    border: none;\n");
      out.write("}\n");
      out.write(".listCard .count{\n");
      out.write("    margin: 0 10px;\n");
      out.write("}\n");
      out.write("@media screen and (max-width: 992px) {\n");
      out.write("    .card{\n");
      out.write("        grid-template-columns: repeat(3,1fr);\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"container\">\n");
      out.write("        <header>\n");
      out.write("            <h1>PRODUCTS</h1>\n");
      out.write("            <div class=\"shopping\">\n");
      out.write("                <svg  aria-hidden=\"true\" xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" fill=\"none\" viewBox=\"0 0 24 24\">\n");
      out.write("                    <path stroke=\"currentColor\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" d=\"M5 4h1.5L9 16m0 0h8m-8 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4Zm8 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4Zm-8.5-3h9.25L19 7H7.312\"/>\n");
      out.write("                  </svg>\n");
      out.write("                  <span class=\"quantity\">0</span>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"list\"></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"card\">\n");
      out.write("        <h1>Shopping Cart</h1>\n");
      out.write("        <ul class=\"listCard\"></ul>\n");
      out.write("        <div class=\"checkOut\">\n");
      out.write("            <div class=\"total\">0</div>\n");
      out.write("            <div class=\"closeShopping\">Close</div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        <script src=\"app2.js\"></script>\n");
      out.write("    </body>\n");
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
