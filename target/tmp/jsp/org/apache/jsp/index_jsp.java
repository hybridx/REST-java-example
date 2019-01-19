package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<meta content=\"text/html;charset=utf-8\" http-equiv=\"Content-Type\">\r\n");
      out.write("<meta content=\"utf-8\" http-equiv=\"encoding\">\r\n");
      out.write("<html ng-app=\"assignment\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>Student Managment</title>\r\n");
      out.write("\t\t<!-- Scripts -->\r\n");
      out.write("\t\t<script src=\"https://code.angularjs.org/1.7.5/angular.js\"></script>\r\n");
      out.write("\t\t<script src=\"https://code.angularjs.org/1.7.5/angular-messages.js\"></script>\r\n");
      out.write("\t\t<script src=\"https://code.angularjs.org/1.7.5/angular-route.js\"></script>\r\n");
      out.write("\t\t<script src=\"https://code.angularjs.org/1.7.5/angular-animate.js\"></script>\r\n");
      out.write("\t\t<script src=\"https://code.angularjs.org/1.7.5/angular-aria.js\"></script>\r\n");
      out.write("\t\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/angular-material/1.1.12/angular-material.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"//angular-ui.github.io/bootstrap/ui-bootstrap-tpls-1.2.4.js\"></script>\r\n");
      out.write("\t\t<script src=\"resources/js/app/app.js\"></script>\r\n");
      out.write("\t\t<script src=\"/resources/js/app/services.js\"></script>\r\n");
      out.write("\t\t<script src=\"/resources/js/contollers/studentController.js\"></script>\r\n");
      out.write("\t\t<script src=\"/resources/js/contollers/subjectController.js\"></script>\r\n");
      out.write("\t\t<script src=\"/resources/js/contollers/marksController.js\"></script>\r\n");
      out.write("\t\t<!-- CSS -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/angular-material/1.1.12/angular-material.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/styles/style.css\" />\r\n");
      out.write("\t\t<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"resources/images/title_icon.png\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\t</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"grids\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<table  width=\"100%\" border=\"2\" class=\"table\" style=\"text-align: center; box-shadow: 5px 5px #888888;\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#!/student\" >\r\n");
      out.write("\t\t\t\t\t\t\tStudent\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#!/subject\">\r\n");
      out.write("\t\t\t\t\t\t\tSubject\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#!/marks\" >\r\n");
      out.write("\t\t\t\t\t\t\tMarks\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<main ng-view>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</main>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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
