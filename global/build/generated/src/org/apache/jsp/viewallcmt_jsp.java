package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public final class viewallcmt_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Test</title>\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<link href=\"styles.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("  $(\"button\").click(function(){\r\n");
      out.write("    $(\"#comment\").append(\"<table><tr><td>\"+document.getElementById(\"cmt\").value+\"</td></tr></table>\");\r\n");
      out.write("  document.getElementById('cmt').value=\"\";  \r\n");
      out.write("  });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"lib/jquery-1.3.2.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"lib/jquery.easing.1.3.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"lib/jquery.coda-slider-2.0.js\"></script>\r\n");
      out.write("<!-- Initialize each slider on the page. Each slider must have a unique id -->\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t$().ready(function() {\r\n");
      out.write("\t$('#coda-slider-2').codaSlider({\r\n");
      out.write("\t\tautoSlide: true,\r\n");
      out.write("\t\tautoSlideInterval: 6000,\r\n");
      out.write("\t\tautoSlideStopWhenClicked: true\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t});\r\n");
      out.write(" });\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function post(a){\r\n");
      out.write("var id=a;\r\n");
      out.write("var cmt=document.getElementById(\"cmt\").value;\r\n");
      out.write("\r\n");
      out.write("if(cmt == \"\"){\r\n");
      out.write("alert(\"Please Enter some text\");\r\n");
      out.write("}\r\n");
      out.write("else{\r\n");
      out.write("var url=\"findname5.jsp?id=\"+id+\"&cmt=\"+cmt;\r\n");
      out.write("if(window.XMLHttpRequest){\r\n");
      out.write("request=new XMLHttpRequest();\r\n");
      out.write("}\r\n");
      out.write("else if(window.ActiveXObject){\r\n");
      out.write("request=new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("try\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("request.open(\"GET\",url,true);\r\n");
      out.write("request.send();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("catch(e){alert(\"Unable to connect to server\");}\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/pirobox.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("\t$().piroBox({\r\n");
      out.write("\t\t\tmy_speed: 400, //animation speed\r\n");
      out.write("\t\t\tbg_alpha: 0.1, //background opacity\r\n");
      out.write("\t\t\tslideShow : false, // true == slideshow on, false == slideshow off\r\n");
      out.write("\t\t\tslideSpeed : 4, //slideshow duration in seconds(3 to 6 Recommended)\r\n");
      out.write("\t\t\tclose_all : '.piro_close,.piro_overlay'// add class .piro_overlay(with comma)if you want overlay click close piroBox\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" /> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\t<div id=\"bg_img\">\r\n");
      out.write("\t\t\t<div id=\"site_div\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/page1-img3.png\" align=\"left\"></img>\r\n");
      out.write("\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t<br/><span><font style=\"color:maroon\" size=\"32\"><b>Connect Globe</b></font></span>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t");

					if(session.getAttribute("username")!=null){
					out.print("Hi,"+(String)session.getAttribute("username"));
	
					out.print("<form action='logout.jsp'>");
					
					out.print("<input type='submit' align='left' value='Logout' id='login-submit'/>");
					out.print("</form>");
					
					}
					 
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"post.jsp\">Post Report</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"status.jsp\">View Status</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"area.jsp\">Your Area</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"advice.jsp\">Your Advice</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"discuss.jsp\">Discuss</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"register.jsp\">Register</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"admin.jsp\">Admin</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"inner_copy\"><div class=\"inner_copy\">Best selection of premium <a href=\"http://www.templatemonster.com/pack/joomla-1-6-templates/\">Joomla 1.6 templates</a></div></div>\r\n");
      out.write("\t\t\t\t<div id=\"main\">\r\n");
      out.write("\t\t\t\t\t<div class=\"index_main_top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"main_bg\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"index_prev_grad\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"coda-slider-wrapper\">\r\n");
      out.write("\t<div class=\"coda-slider preload\" id=\"coda-slider-2\">\r\n");
      out.write("\t\t<div class=\"panel\">\r\n");
      out.write("\t\t\t<div class=\"panel-wrapper\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"prev_but_center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"prev_but_center_left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"prev_img\"><img src=\"images/pic-01.jpg\" alt=\"\" title=\"\"/></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"prev_but_center_right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. </a><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tNam justo odio, congue id fermentum sit amet, placerat sed nibh. Vestibulum pharetra nibh eu magna accumsan tristique. Sed ac velit urna, venenatis vulputate purus.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"read\"><a href=\"#\">read more</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">Vivamus id lobortis nisi. Duis semper porta justo, vel sodales velit vehicula vel. </a><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tDonec non vulputate odio. Quisque tellus augue, tristique vel lobortis ut, convallis vel est. Nam vel congue lectus. Suspendisse ullamcorper odio et leo congue eu semper </p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"read\"><a href=\"#\">read more</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"panel\">\r\n");
      out.write("\t\t\t<div class=\"panel-wrapper\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"prev_but_center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"prev_but_center_left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"prev_img\"><img src=\"images/header_scroll.jpg\" alt=\"\" title=\"\"/></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"prev_but_center_right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">Vivamus id lobortis nisi. Duis semper porta justo, vel sodales velit vehicula vel. </a><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tDonec non vulputate odio. Quisque tellus augue, tristique vel lobortis ut, convallis vel est. Nam vel congue lectus. Suspendisse ullamcorper odio et leo congue eu semper Lorem ipsum dolor sit amet, consectetur adipiscing elit. <br/><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tNam justo odio, congue id fermentum sit amet, placerat sed nibh. Vestibulum pharetra nibh eu magna accumsan tristique. Sed ac velit urna, venenatis vulputate purus.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"read\"><a href=\"#\">read more</a></div>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"panel\">\r\n");
      out.write("\t\t\t<div class=\"panel-wrapper\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"prev_but_center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"prev_but_center_left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"prev_img\"><img src=\"images/header_scroll2.jpg\" alt=\"\" title=\"\"/></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"prev_but_center_right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. </a><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tNam justo odio, congue id fermentum sit amet, placerat sed nibh. Vestibulum pharetra nibh eu magna accumsan tristique. Sed ac velit urna, venenatis vulputate purus.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"read\"><a href=\"#\">read more</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">Vivamus id lobortis nisi. Duis semper porta justo, vel sodales velit vehicula vel. </a><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tDonec non vulputate odio. Quisque tellus augue, tristique vel lobortis ut, convallis vel est. Nam vel congue lectus. Suspendisse ullamcorper odio et leo congue eu semper </p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"read\"><a href=\"#\">read more</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"panel\">\r\n");
      out.write("\t\t\t<div class=\"panel-wrapper\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"prev_but_center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"prev_but_center_left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"prev_img\"><img src=\"images/header_scroll3.jpg\" alt=\"\" title=\"\"/></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"prev_but_center_right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"#\">Vivamus id lobortis nisi. Duis semper porta justo, vel sodales velit vehicula vel. </a><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tDonec non vulputate odio. Quisque tellus augue, tristique vel lobortis ut, convallis vel est. Nam vel congue lectus. Suspendisse ullamcorper odio et leo congue eu semper Lorem ipsum dolor sit amet, consectetur adipiscing elit. <br/><br/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tNam justo odio, congue id fermentum sit amet, placerat sed nibh. Vestibulum pharetra nibh eu magna accumsan tristique. Sed ac velit urna, venenatis vulputate purus.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"read\"><a href=\"#\">read more</a></div>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</div><!-- .coda-slider -->\r\n");
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"index_prev_bot\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div id=\"index_box\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"index_box_top\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"index_box_bg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Now You can Share Your Social Problem such as some kind of Harassment,Bribe matters.</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Simply just Register Yourself and Do login After that click on Post Report Link as shown above.And After selecting Your subject and location YOu can post Your matter Simply .This will be visible to every visitors and our Supporters will try to proceed it further</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"readred\"><a href=\"#\">read more</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"index_box_bot\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t");
 
							
							String id=request.getParameter("id");
							try{
							Class.forName("oracle.jdbc.driver.OracleDriver");
							Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
							PreparedStatement ps= con.prepareStatement("select country,state,district,police_station,report,status,email,postedon,id from forumrep where id='"+id+"'");
							ResultSet rs=ps.executeQuery();
						
							while(rs.next()){
							out.print("</br><div id='index_box_top'></div>");
								out.print("<div id='index_box_bg'>");
								out.print("<B><font style='color:navy' size='2'>Country:&nbsp;&nbsp;&nbsp;&nbsp;</font></B><B>"+rs.getString(1)+"</B></br>");
								out.print("<B><font style='color:navy' size='2'>State:&nbsp;&nbsp;&nbsp;&nbsp;</font></B><B>"+rs.getString(2)+"</B></br>");	
								out.print("<B><font style='color:navy' size='2'>District:&nbsp;&nbsp;&nbsp;&nbsp;</font></B><B>"+rs.getString(3)+"</B></br>");
								out.print("<B><font style='color:navy' size='2'>Police Station:&nbsp;&nbsp;&nbsp;&nbsp;</font></B><B>"+rs.getString(4)+"</B></br>");
								out.print("<B><font style='color:navy' size='2'>Report:&nbsp;&nbsp;&nbsp;&nbsp;</font></B></br><B>"+rs.getString(5)+"</B></br>");	
								out.print("<B><font style='color:navy' size='2'>Status:&nbsp;&nbsp;&nbsp;&nbsp;</font></B><B>"+rs.getString(6)+"</B></br>");	
								out.print("<B><font style='color:navy' size='2'>Email:&nbsp;&nbsp;&nbsp;&nbsp;</font></B><B>"+rs.getString(7)+"</B>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<B><font style='color:navy' size='2'><span>Posted On:&nbsp;&nbsp;&nbsp;&nbsp;</font></B><B>"+rs.getDate(8)+"</B></span></br>");		
								
								ps= con.prepareStatement("SELECT max(id) FROM FORUMADVC where rid='"+rs.getString(9)+"' ");
								ResultSet rs3=	ps.executeQuery();
								rs3.next();
									int limit=rs3.getInt(1);
								System.out.print(limit);
									PreparedStatement ps1= con.prepareStatement("SELECT * FROM FORUMADVC WHERE id <= '"+limit+"' and rid = '"+rs.getString(9)+"' " );
										ResultSet rs2=	ps1.executeQuery();
										while(rs2.next()){
								
								
								out.print("<br/>"+rs2.getString(3));
								
								out.print("<br/>By:-"+rs2.getString(4));
									out.print("<hr></hr>");
										}
								
							
							
								
								out.print("<div id='comment'></div>");
								out.print("<textarea id='cmt' cols='50' rows='3'></textarea><br/>");
								out.print("<br/><button onclick='post(this.name)' name='"+rs.getString(9)+"'>Comment</button>");
							
									out.print("</div>");
							out.print("<div id='index_box_bot'></div>");	
							}
						
							 }
							catch(Exception e){e.printStackTrace();
							}
							
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"main_bot\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div></div>\r\n");
      out.write("\t\t\t\t<body><br><br></body>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
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
