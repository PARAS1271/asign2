package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class resultfindride_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("#customers {\n");
      out.write("    font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#customers td, #customers th {\n");
      out.write("    border: 1px solid #ddd;\n");
      out.write("    padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#customers tr:nth-child(even){background-color: #f2f2f2;}\n");
      out.write("\n");
      out.write("#customers tr:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write("#customers th {\n");
      out.write("    padding-top: 12px;\n");
      out.write("    padding-bottom: 12px;\n");
      out.write("    text-align: left;\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<table id=\"customers\">\n");
      out.write("    <tr>\n");
      out.write("    <th>Pick Up : </th>\n");
      out.write("    <th>Destination : </th>\n");
      out.write("    <th>Date : </th>\n");
      out.write("    <th>time : </th>\n");
      out.write("    <th>Price : </th>\n");
      out.write("    <th>User : </th>\n");
      out.write("    <th> </th>\n");
      out.write("    </tr>\n");
 
           
         try{
         String leavingfrom = request.getParameter("pickUp");
         String destination = request.getParameter("destination");
         String date = request.getParameter("date");
         String time = request.getParameter("time");
         
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carpool",
            "root", "");
         Statement st = con.createStatement();
         ResultSet rs;
         rs = st.executeQuery("select * from registerride where place1='" + leavingfrom + "' and place2='" + destination + "' and date = '" + date + "' and time = '" + time + "'"); 
          while (rs.next()){ 
           
      out.write("\n");
      out.write("           <tr>\n");
      out.write("             <td> ");
      out.print( rs.getString("place1") );
      out.write("</td>\n");
      out.write("             <td>");
      out.print(rs.getString("place2") );
      out.write("</td>\n");
      out.write("             <td>");
      out.print(rs.getString("date") );
      out.write("</td>\n");
      out.write("             <td>");
      out.print(rs.getString("time") );
      out.write("</td>\n");
      out.write("             <td>");
      out.print(rs.getString("price") );
      out.write("</td>\n");
      out.write("             <td>");
      out.print(rs.getString("username") );
      out.write("</td>\n");
      out.write("             <td> <a href=\"bookride.jsp\" > Book </a> </td>\n");
      out.write("           </tr>\n");
      out.write("           ");

         } 
         st.close();
        
      out.write("        \n");
      out.write("         </table> ");

         } catch(Exception exe){
           
                 
                   out.println(exe); 
      out.write("\n");
      out.write("           \n");
      out.write("                   <a href=\"findride.jsp\" > TRY AGAIN </a> \n");
      out.write("                   ");

                    
         }
    
      out.write("\n");
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
