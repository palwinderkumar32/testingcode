package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;

public final class uploadimage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String islogin=(String)session.getAttribute("islogin");
if(islogin==null){
request.setAttribute("notlogin_msg","Sorry,Please do Login first");


      out.write('\r');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("index.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

}

      out.write('\r');
      out.write('\n');

java.util.Date sqdate=Calendar.getInstance().getTime();
	java.sql.Date dat =new java.sql.Date(sqdate.getTime());
String country=request.getParameter("slist1");
String state=request.getParameter("slist2");
String district=request.getParameter("slist3");
String police=request.getParameter("slist4");
String report=request.getParameter("report");
String status=request.getParameter("status");
String email=(String)session.getAttribute("email");
System.out.print(country);
System.out.print(state);
System.out.print(district);
System.out.print(police);
System.out.print(report);
System.out.print(status);
System.out.print(email);
	try{
  Class.forName("oracle.jdbc.driver.OracleDriver");
  Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
  PreparedStatement ps =con.prepareStatement("insert into forumrep(country,state,district,police_station,report,status,email,postedon)"+"values(?,?,?,?,?,?,?,?)");
ps.setString(1,country);
ps.setString(2,state);
	ps.setString(3,district);
	ps.setString(4,police);
	ps.setString(5,report);
	ps.setString(6,status);
	ps.setString(7,email);
		ps.setDate(8,dat);
		
int s=	ps.executeUpdate();
if(s>0){
System.out.print("save");

      out.write("\r\n");
      out.write("\r\n");
      if (true) {
        _jspx_page_context.forward("uploadpic.jsp");
        return;
      }
      out.write("\r\n");
      out.write("\r\n");

}
else{System.out.print("sorry!try again");}	
 }catch(Exception e){}
   
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
