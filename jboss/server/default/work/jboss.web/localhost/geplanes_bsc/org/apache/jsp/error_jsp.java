package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

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
 
	String app = request.getContextPath();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t");
      if (_jspx_meth_n_head_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<TABLE class=\"tabelaBase base_tabelabase\">\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t\t<TD style=\"height: 82px;\">\r\n");
      out.write("\t\t\t\t\t<TABLE class=\"tabelaBase\" style=\"width: 1000px;\">\r\n");
      out.write("\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TD rowspan=\"2\" class=\"base_logo\">&nbsp;</TD>\r\n");
      out.write("\t\t\t\t\t\t\t<TD class=\"base_user\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<SPAN class=\"txt_normal\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${USER.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</SPAN>\r\n");
      out.write("\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TD class=\"base_menu\" align=\"right\" valign=\"top\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t\t<TD class=\"base_conteudo\">\r\n");
      out.write("\t\t\t\t    ");
br.com.linkcom.neo.core.web.NeoWeb.getRequestContext().addError(pageContext.getException());
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_messages_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t\t<TD class=\"base_baixo\" valign=\"middle\"><a href=\"http://www.linkcom.com.br\" target=\"blank\"><IMG src=\"");
      out.print( app );
      out.write("/images/ico_linkcom.jpg\"></a></TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t</TABLE>\r\n");
      out.write("\t</body>\r\n");
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
    _jspx_th_n_head_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_messages_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:messages
    br.com.linkcom.neo.view.MessagesTag _jspx_th_n_messages_0 = new br.com.linkcom.neo.view.MessagesTag();
    _jspx_th_n_messages_0.setJspContext(_jspx_page_context);
    _jspx_th_n_messages_0.doTag();
    return false;
  }
}
