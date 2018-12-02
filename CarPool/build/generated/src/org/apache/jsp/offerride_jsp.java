package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class offerride_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title> Find a ride </title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script> \n");
      out.write("    <style type=\"text/css\">\n");
      out.write("  \n");
      out.write("\t.offer-ride {\n");
      out.write("\t\twidth: 370px;\n");
      out.write("    \tmargin: 130px auto;\n");
      out.write("       }\n");
      out.write("    .offer-ride form {\n");
      out.write("    \tmargin-bottom: 15px;\n");
      out.write("        padding: -10px;\n");
      out.write("    }\n");
      out.write("    .offer-ride h2 {\n");
      out.write("        margin: 0 0 15px;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    .form-control, .btn {\n");
      out.write("        min-height: 38px;\n");
      out.write("        border-radius: 2px;\n");
      out.write("    }\n");
      out.write("    .btn {        \n");
      out.write("        font-size: 15px;\n");
      out.write("        font-weight: bold;\n");
      out.write("    }\n");
      out.write("    body{\n");
      out.write("        background-image: url('img6.png');\n");
      out.write("    }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("        <div class=\"offer-ride\">\n");
      out.write("            <form action=\"resultofferride.jsp\" method=\"post\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><div class=\"form-group\">\n");
      out.write("\t\t    <input type=\"text\" class=\"form-control\" name=\"pickUp\" placeholder=\"PICK UP\" required=\"required\">\n");
      out.write("                            </div>\t</td>\t\t\n");
      out.write("                            <td><div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"destination\" placeholder=\"DROP OFF\" required=\"required\">\n");
      out.write("                                </div></td></tr>\n");
      out.write("                </table>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"stopover1\" placeholder=\"stopover1\" >\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"stopover2\" placeholder=\"stopover2\" >\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"stopover3\" placeholder=\"stopover3\" >\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                      <input type=\"text\" class=\"form-control\" name=\"UserName\" placeholder=\"UserName\" >\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"date\" class=\"form-control\" name=\"date\" required=\"required\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"time\" class=\"form-control\" name=\"time\" required=\"required\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"number\" class=\"form-control\" name=\"seats\" placeholder=\"Number of Seats\" required=\"required\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"number\" class=\"form-control\" name=\"price\" placeholder=\"Price per co-traveller\" required=\"required\">\n");
      out.write("                </div>\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-primary btn-block\" value=\"Submit\"><br><br>\n");
      out.write("\t    </form>\n");
      out.write("\t</div>\t\t        \n");
      out.write("</body>\n");
      out.write("</html>");
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
