package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class piePagina_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <nav aria-label=\"Page navigation\">\n");
      out.write("  <ul class=\"pagination\">\n");
      out.write("    <li>\n");
      out.write("      <a href=\"#\" aria-label=\"Previous\">\n");
      out.write("        <span aria-hidden=\"true\">&laquo;</span>\n");
      out.write("      </a>\n");
      out.write("    </li>\n");
      out.write("    <li><a href=\"frmAgregarLibro.jsp\">1</a></li>\n");
      out.write("    <li><a href=\"frmListarLibro.jsp\">2</a></li>\n");
      out.write("    <li><a href=\"#\">3</a></li>\n");
      out.write("    <li><a href=\"#\">4</a></li>\n");
      out.write("    <li><a href=\"#\">5</a></li>\n");
      out.write("    <li>\n");
      out.write("      <a href=\"#\" aria-label=\"Next\">\n");
      out.write("        <span aria-hidden=\"true\">&raquo;</span>\n");
      out.write("      </a>\n");
      out.write("    </li>\n");
      out.write("  </ul>\n");
      out.write("</nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
