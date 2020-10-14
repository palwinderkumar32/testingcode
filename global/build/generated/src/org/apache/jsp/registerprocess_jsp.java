package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class registerprocess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
try{

String username=request.getParameter("username");
String userpass=request.getParameter("userpass");
String email=request.getParameter("email");
String mobile=request.getParameter("mobile");
String address=request.getParameter("address");
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");

PreparedStatement ps=con.prepareStatement("select username,email from forumreg where username ='"+username+"' or email='"+email+"'");
//ps.setString(1,n);
out.print("<br>");
ResultSet rs=ps.executeQuery();
if(rs.next()){
if(username.equals(rs.getString(1))|| email.equals(rs.getString(2))){
request.setAttribute("regerr","Sorry! Username or Email Already Exists");

      out.write("\r\n");
      out.write("\r\n");
      if (true) {
        _jspx_page_context.forward("register.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

}

else{

if(email.equals(rs.getString(2))){
request.setAttribute("regerr","Sorry!Username or Email id Already Exists");

      out.write("\r\n");
      out.write("\r\n");
      if (true) {
        _jspx_page_context.forward("register.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

}

}
}
else{
PreparedStatement ps1=con.prepareStatement("insert into forumreg values(?,?,?,?,?,?)");
ps1.setInt(1,3);
ps1.setString(2,username);
ps1.setString(3,userpass);
ps1.setString(4,email);

ps1.setString(5,mobile);
ps1.setString(6,address);
int s=ps1.executeUpdate();
System.out.print(s);
if(s>0){
request.setAttribute("reg","Successfully Registered,Please Login");

      out.write('\r');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("index.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

}
else{
request.setAttribute("regerr","Sorry! some errors occur,Please follow constraints");

      out.write("\r\n");
      out.write("\r\n");
      if (true) {
        _jspx_page_context.forward("register.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

}


}



con.close();


}catch(SQLException e2){
e2.printStackTrace();
request.setAttribute("regerr","Sorry! some errors occur,Please Fill Correct Detail");
  
      out.write("\r\n");
      out.write("\r\n");
      if (true) {
        _jspx_page_context.forward("register.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');


}

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
