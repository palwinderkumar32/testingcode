package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Test</title>\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<link href=\"styles.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"lib/jquery-1.3.2.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"lib/jquery.easing.1.3.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"lib/jquery.coda-slider-2.0.js\"></script>\r\n");
      out.write("<!-- Initialize each slider on the page. Each slider must have a unique id -->\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t$().ready(function() {\r\n");
      out.write("\t$('#coda-slider-2').codaSlider({\r\n");
      out.write("\t\tautoSlide: true,\r\n");
      out.write("\t\tautoSlideInterval: 6000,\r\n");
      out.write("\t\tautoSlideStopWhenClicked: true\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t});\r\n");
      out.write(" });\r\n");
      out.write("</script>\r\n");
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
      out.write("\t\r\n");
      out.write("\t\t\t\t\t");

					 System.out.print("hur"+session.getAttribute("username"));
					 
      out.write("\r\n");
      out.write("\t\t\t\t\t<div>Hi,");
if(session.getAttribute("username")!=null){
					out.print((String)session.getAttribute("username"));
					} 
      out.write("<form action=\"logout.jsp\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" align=\"left\" value=\"Logout\" id=\"login-submit\"/></form></div></div>\r\n");
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
      out.write("\t\t\t\t\t\t<div class=\"index_prev_bot\"></div>");
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