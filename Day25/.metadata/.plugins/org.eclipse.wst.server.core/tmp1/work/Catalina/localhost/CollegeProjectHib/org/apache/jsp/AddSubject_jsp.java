/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2019-09-05 04:30:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hcl.hib.CollegeCRUD;
import com.hcl.hib.Subject;

public final class AddSubject_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.hcl.hib.CollegeCRUD");
    _jspx_imports_classes.add("com.hcl.hib.Subject");
  }

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
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form method=\"get\" action=\"AddSubject.jsp\" name=\"subjectForm\" >\r\n");
      out.write("\r\n");
      out.write("<select name=\"subject\" id=\"dropdown\" onchange=\"change()\">\r\n");
      out.write(" <option value=\"maths\">Maths</option>\r\n");
      out.write(" <option value=\"science\">Science</option>\r\n");
      out.write(" <option value=\"social\">Social</option>\r\n");
      out.write(" <option value=\"civics\">Civics</option>\r\n");
      out.write(" <option value=\"geography\">Geography</option>\r\n");
      out.write("</select>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <p>Theory  &nbsp;&nbsp;<input type=\"text\" name=\"theory\" readonly=\"readonly\"/></p>\r\n");
      out.write(" <p>Practical  &nbsp;&nbsp;<input type=\"text\" name=\"practical\" readonly=\"readonly\"/></p>\r\n");
      out.write(" <p>Year  &nbsp;&nbsp;<input type=\"text\" name=\"year\"/></p>\r\n");
      out.write(" <p>Instructor  &nbsp;&nbsp;<input type=\"text\" name=\"instructor\"/></p>\r\n");
      out.write(" <input type=\"submit\" value=\"click\"/>\r\n");
      out.write("  \r\n");
      out.write("    <script>\r\n");
      out.write("        function change(){\r\n");
      out.write("        var a= document.getElementById(\"dropdown\").value;\r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("        if(a ==\"maths\"){\r\n");
      out.write("        \tsubjectForm.theory.value=\"42\";\r\n");
      out.write("        \tsubjectForm.practical.value=\"14\";\r\n");
      out.write("        }\r\n");
      out.write("        if(a ==\"science\"){\r\n");
      out.write("        \tsubjectForm.theory.value=\"90\";\r\n");
      out.write("        \tsubjectForm.practical.value=\"50\";\r\n");
      out.write("        }\r\n");
      out.write("        if(a ==\"social\"){\r\n");
      out.write("        \tsubjectForm.theory.value=\"69\";\r\n");
      out.write("        \tsubjectForm.practical.value=\"41\";\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        if(a ==\"civics\"){\r\n");
      out.write("        \tsubjectForm.theory.value=\"79\";\r\n");
      out.write("        \tsubjectForm.practical.value=\"41\";\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        if(a ==\"geography\"){\r\n");
      out.write("        \tsubjectForm.theory.value=\"107\";\r\n");
      out.write("        \tsubjectForm.practical.value=\"93\";\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        }\r\n");
      out.write("        </script>\r\n");
      out.write("        ");
 
        if(request.getParameter("year") !=null && 
         request.getParameter("instructor") !=null &&
         request.getParameter("subject") !=null &&
         request.getParameter("theory") !=null &&
         request.getParameter("practical") !=null){
	     Subject s=new Subject();
	     s.setYear(Integer.parseInt(request.getParameter("year")));
	     s.setInstructor(request.getParameter("instructor"));
	     s.setSubject(request.getParameter("subject"));
	     s.setTheory(Integer.parseInt(request.getParameter("theory")));
	     s.setPractical(Integer.parseInt(request.getParameter("practical")));
	     CollegeCRUD crud=new CollegeCRUD();
	     out.println(crud.insertSubject(s));
} 
	
      out.write("\r\n");
      out.write("</form>\r\n");
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
}
