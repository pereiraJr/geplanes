package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.linkcom.sined.util.tag.TagFunctions;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/tld/c.tld");
    _jspx_dependants.add("/WEB-INF/tld/neo.tld");
    _jspx_dependants.add("/WEB-INF/tld/template.tld");
    _jspx_dependants.add("/WEB-INF/tld/sined.tld");
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>ERRO - SINDIS</title>\r\n");
      out.write("\t");
      if (_jspx_meth_n_head_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/sined.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/tabela.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<BODY leftmargin=\"0\" topmargin=\"0\" rightmargin=\"0\" style=\"padding:0px; margin:0px;\" class=\"erro\">\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<div id=\"corpo\">\r\n");
      out.write("\t\t<div class=\"cabecalho\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br><br><br>\r\n");
      out.write("\t\t<br><br><br>\r\n");
      out.write("\t\t<table align=\"center\" width=\"500\"><tr><td>\r\n");
      out.write("\t\t<div class=\"dialog\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"flash_alert\" style=\"height: 20px; vertical-align: middle; border:1px solid #CCCCCC; font-size:12px;margin-bottom:12px;padding:5px 5px 5px 30px;text-align:left;\">\r\n");
      out.write("\t\t\t\tErro no processamento da página.\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<a href=\"javascript:history.back()\">Retornar para o sistema</a><br>\r\n");
      out.write("\t\t\t<input type=\"checkbox\" onclick=\"mostraErro()\" id=\"mostra\">Mostrar erro</input>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t<div id=\"scroll\" style=\"display:none;\">\r\n");
      out.write("\t\t\t\t");
      out.print(pageContext.getException().getMessage());
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</td></tr></table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\r\n");
      out.write("\tfunction mostraErro(){\r\n");
      out.write("\t\tif($(\"#mostra\").attr(\"checked\")) {\r\n");
      out.write("\t\t\t$(\"#scroll\").fadeIn();\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(\"#scroll\").fadeOut();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_n_head_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:head
    br.com.linkcom.neo.view.HeadTag _jspx_th_n_head_0 = new br.com.linkcom.neo.view.HeadTag();
    _jspx_th_n_head_0.setJspContext(_jspx_page_context);
    _jspx_th_n_head_0.setSearchJsDir(false);
    _jspx_th_n_head_0.doTag();
    return false;
  }
}
