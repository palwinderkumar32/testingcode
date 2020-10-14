package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class setform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("function get(obj) {\r\n");
      out.write("      var poststr = \"id=\" + encodeURI( document.getElementsByName(\"id\").value );\r\n");
      out.write("                    \"&name=\" + encodeURI( document.getElementsByName(\"name\").value );\r\n");
      out.write("                    \"&course=\" + encodeURI( document.getElementsByName(\"course\").value );\r\n");
      out.write("                    \"&mobile=\" + encodeURI( document.getElementsByName(\"mobile\").value );\r\n");
      out.write("                    \"&fathername=\" + encodeURI( document.getElementsByName(\"fathername\").value );\r\n");
      out.write("                    \"&mothername=\" + encodeURI( document.getElementsByName(\"mothername\").value );\r\n");
      out.write("                    \"&qualification=\" + encodeURI( document.getElementsByName(\"qualification\").value );\r\n");
      out.write("                    \"&dateofbirth=\" + encodeURI( document.getElementsByName(\"dateofbirth\").value );\r\n");
      out.write("                    \"&dateofjoining=\" + encodeURI( document.getElementsByName(\"dateofjoining\").value );\r\n");
      out.write("                    \"&feesub=\" + encodeURI( document.getElementsByName(\"feesub\").value );\r\n");
      out.write("                    \"&paid=\" + encodeURI( document.getElementsByName(\"paid\").value );\r\n");
      out.write("                    \"&fee=\" + encodeURI( document.getElementsByName(\"fee\").value );\r\n");
      out.write("                    \"&balance=\" + encodeURI( document.getElementsByName(\"balance\").value );\r\n");
      out.write("                    \"&address=\" + encodeURI( document.getElementsByName(\"address\").value );\r\n");
      out.write("                    \"&description=\" + encodeURI( document.getElementsByName(\"description\").value );\r\n");
      out.write("                    \"&trainer=\" + encodeURI( document.getElementsByName(\"trainer\").value );\r\n");
      out.write("                    \r\n");
      out.write("      makePOSTRequest(\"save.jsp\", poststr);\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("function makePOSTRequest(url, parameters) {\r\n");
      out.write("    http_request=false;\r\n");
      out.write("      if (window.XMLHttpRequest) { // Mozilla, Safari,...\r\n");
      out.write("         http_request = new XMLHttpRequest();\r\n");
      out.write("         if (http_request.overrideMimeType) {\r\n");
      out.write("         \t// set type accordingly to anticipated content type\r\n");
      out.write("            //http_request.overrideMimeType('text/xml');\r\n");
      out.write("            http_request.overrideMimeType('text/html');\r\n");
      out.write("         }\r\n");
      out.write("      } else if (window.ActiveXObject) { // IE\r\n");
      out.write("         try {\r\n");
      out.write("            http_request = new ActiveXObject(\"Msxml2.XMLHTTP\");\r\n");
      out.write("         } catch (e) {\r\n");
      out.write("            try {\r\n");
      out.write("               http_request = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("            } catch (e) {}\r\n");
      out.write("         }\r\n");
      out.write("      }\r\n");
      out.write("      if (!http_request) {\r\n");
      out.write("         alert('Cannot create XMLHTTP instance');\r\n");
      out.write("         return false;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("\t\thttp_request.onreadystatechange = alertContents;\r\n");
      out.write("     \thttp_request.open('POST', url, true);\r\n");
      out.write("     \thttp_request.setRequestHeader(\"Content-type\", \"application/x-www-form-urlencoded\");\r\n");
      out.write("      http_request.setRequestHeader(\"Content-length\", parameters.length);\r\n");
      out.write("      http_request.setRequestHeader(\"Connection\", \"close\");\r\n");
      out.write("      http_request.send(parameters);\r\n");
      out.write("    \r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<form action=\"javascript:get(document.getElementById('myform1'));\" name=\"myform\" id=\"myform1\" method=\"post\">\r\n");
      out.write("<table cellspacing=15 cellpadding=15\">\r\n");
      out.write("<tr><td><font style=\"color:navy\"><B>Student Detail:</B></font></td></tr>\r\n");
      out.write("<tr><td><B>ID:</B></td><td><input type=\"text\" name=\"id\"></input></td></tr>\r\n");
      out.write("<tr><td><B>Name:</B></td><td><input type=\"text\" name=\"name\" ></input></td></tr>\r\n");
      out.write("<tr><td><B>Course:</B></td><td><input type=\"text\" name=\"course\"></input></td></tr>\r\n");
      out.write("<tr><td><B>Mobile:</B></td><td><input type=\"text\" name=\"mobile\"></input></td></tr>\r\n");
      out.write("<tr><td><B>Father's Name:</B></td><td><input type=\"text\" name=\"fathername\"></input></td></tr>\r\n");
      out.write("<tr><td><B>Mother's Name:</B></td><td><input type=\"text\" name=\"mothername\"></input></td></tr>\r\n");
      out.write("<tr><td><B>Qualification:</B></td><td><input type=\"text\" name=\"qualification\"></input></td></tr>\r\n");
      out.write("<tr><td><B>Date of Birth:</B></td><td><input type=\"text\" name=\"dateofbirth\"></input></td></tr>\r\n");
      out.write("<tr><td><B>Date of Joining:</B></td><td><input type=\"text\" name=\"dateofjoining\" ></input></td></tr>\r\n");
      out.write("<tr><td><B>Date of Submission:</B></td><td><input type=\"text\" name=\"feesub\" ></input></td></tr>\r\n");
      out.write("<tr><td><B>Paid:</B></td><td><input type=\"text\" name=\"paid\" ></input></td></tr>\r\n");
      out.write("<tr><td><B>Fee:</B></td><td><input type=\"text\" name=\"fee\" ></input></td></tr>\r\n");
      out.write("<tr><td><B>Balance:</B></td><td><input type=\"text\" name=\"balance\" ></input></td></tr>\r\n");
      out.write("<tr><td><B>Address:</B></td><td><input type=\"text\" name=\"address\"></input></td></tr>\r\n");
      out.write("<tr><td><B>Description:</B></td><td><input type=\"text\" name=\"description\"></input></td></tr>\r\n");
      out.write("<tr><td><B>Trainer:</B></td><td><input type=\"text\" name=\"trainer\"></input></td></tr>\r\n");
      out.write("<tr><td></td><td><input style=\"padding:3px 3px\" value=\"Save\" type=\"submit\"></td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
