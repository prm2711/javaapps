/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.24
 * Generated at: 2018-01-30 05:32:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.zilker.dto.*;
import java.util.ArrayList;

public final class userhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/front-user.jsp", Long.valueOf(1517224288287L));
    _jspx_dependants.put("jar:file:/C:/Users/Priyamvada%20Mukund/eclipse-workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Tournament/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1516618636542L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("com.zilker.dto");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Home</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/front.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<ul>\r\n");
      out.write(" <li class=\"home\">\r\n");
      out.write("  ");

		if (session.getAttribute("name").equals("admin")) {
	
      out.write("\r\n");
      out.write("\t<form method=\"post\" action=\"home.jsp\" class=\"form-button-home\">\r\n");
      out.write("\t\t<input class=\"button-add\" type=\"submit\" name=\"link\" value=\"Home\">\r\n");
      out.write("\t</form>");

		} else if (session.getAttribute("name").equals("user")) {
	
      out.write("<form method=\"post\" action=\"userhome.jsp\" class=\"form-button-home\">\r\n");
      out.write("\t\t<input class=\"button-add\" type=\"submit\" name=\"link\" value=\"Home\">\r\n");
      out.write("\t</form>");
} 
      out.write("</li>\r\n");
      out.write("\r\n");
      out.write("  <li class=\"twoplayers\"><form method=\"post\" action=\"RetrievePlayerServlet\" class=\"form-button\">\r\n");
      out.write("\t\t<input class=\"button-add\" type=\"submit\" value=\"Retrieve Players\">\r\n");
      out.write("\t</form></li>\r\n");
      out.write("\t<li class=\"twoplayers\"><form method=\"post\" action=\"ListServlet\" class=\"form-button-match\">\r\n");
      out.write("\t\t<input class=\"button-add\" type=\"submit\" name=\"link\" value=\"Player vs Player\">\r\n");
      out.write("\t</form></li>\r\n");
      out.write("\t<li class=\"playertour\"><form method=\"post\" action=\"ListServlet\" class=\"form-button-match\">\r\n");
      out.write("\t\t<input class=\"button-add\" type=\"submit\" name=\"link\" value=\"Player in Tournament\">\r\n");
      out.write("\t</form></li>\r\n");
      out.write("\t<li class=\"country\"><form method=\"post\" action=\"playercountry.jsp\"\r\n");
      out.write("\t\tclass=\"form-button-match\">\r\n");
      out.write("\t\t<input class=\"button-add\" type=\"submit\" value=\"View Player by Country\">\r\n");
      out.write("\t</form></li>\r\n");
      out.write("\t<li class=\"logout-user\"><form method=\"post\" action=\"LogoutServlet\" class=\"form-button\">\r\n");
      out.write("\t\t<input class=\"button-add\" type=\"submit\" value=\"Logout\">\r\n");
      out.write("\t</form></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>User Home</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/button-style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/home.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"blink();\">\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\t<h1 class=\"head\">\r\n");
      out.write("\t\t\tWelcome to E-Tournica <img class=\"shuttle\"\r\n");
      out.write("\t\t\t\tsrc=\"https://cdn1.iconfinder.com/data/icons/video-game-solid-2/48/82-512.png\"\r\n");
      out.write("\t\t\t\talt=\"shuttle\">\r\n");
      out.write("\t\t</h1>\r\n");
      out.write("\t</center>\r\n");
      out.write("\t<h2 class=\"head\">Welcome ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h2>\r\n");
      out.write("\t<div class=\"updates\">\r\n");
      out.write("\t<img src=\"https://dab1nmslvvntp.cloudfront.net/wp-content/uploads/2014/11/1415490092badge.png\" alt=\"rank\" class=\"rank-img\">\r\n");
      out.write("\t<p class=\"update\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${play.get(0).getPlayerName() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" has maximum points and is #1 on bidding list!!</b></p>\r\n");
      out.write("\t</div>\r\n");
      out.write("   <p class=\"heading1\">Top 5 Players</p>\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>Player</th>\r\n");
      out.write("\t\t\t<th>Points</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<div class=\"event-list\">\r\n");
      out.write("\t\t<p class=\"heading\">Tournaments</p>\r\n");
      out.write("\t\t<div class=\"events\">\r\n");
      out.write("\t\t\t<img\r\n");
      out.write("\t\t\t\tsrc=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRWU-Oz1pXSynWg6CCSDYklaxGWPFMIjlxm7hPbC1-PmwYk0nqdFA\"\r\n");
      out.write("\t\t\t\talt=\"shuttle\" class=\"event-img\"> <br>\r\n");
      out.write("\t\t\t<p class=\"text\">London Open</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"events\">\r\n");
      out.write("\t\t\t<img\r\n");
      out.write("\t\t\t\tsrc=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJ0QvZmSiGaA-jBv-UmdRDHn3GNyATKeGhf8BsxMBeuhrvZIFJmA\"\r\n");
      out.write("\t\t\t\talt=\"shuttle\" class=\"event-img\"> <br>\r\n");
      out.write("\t\t\t<p class=\"text\">Asian Open</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"events\">\r\n");
      out.write("\t\t\t<img\r\n");
      out.write("\t\t\t\tsrc=\"http://images1.cpcache.com/image/106026055_350x350.png\"\r\n");
      out.write("\t\t\t\talt=\"shuttle\" class=\"event-img\"> <br>\r\n");
      out.write("\t\t\t<p class=\"text\">US Open</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<p class=\"text-more\">And More...</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /userhome.jsp(35,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("p");
      // /userhome.jsp(35,2) name = begin type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setBegin(0);
      // /userhome.jsp(35,2) name = end type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setEnd(4);
      // /userhome.jsp(35,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/userhome.jsp(35,2) '${play}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${play}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t<tr>\r\n");
            out.write("\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.getPlayerName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.getNew()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\r\n");
            out.write("\t\t\t</tr>\r\n");
            out.write("\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}