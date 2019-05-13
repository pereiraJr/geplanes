package org.apache.jsp.WEB_002dINF.classes.br.com.linkcom.neo.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FormTag_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<form method=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tag.method}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tag.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" enctype=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tag.enctype}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tag.url}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write('"');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tag.dynamicAttributesToString}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" onsubmit=\"return false;\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tag.actionParameter}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tag.action}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t<input type=\"hidden\" name=\"suppressValidation\" value=\"false\"/>\r\n");
      out.write("\t<input type=\"hidden\" name=\"suppressErrors\" value=\"false\"/>\r\n");
      out.write("\t<script language=\"javascript\">\r\n");
      out.write("\t\tvar ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tag.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" = document.forms[\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tag.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"];\r\n");
      out.write("\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tag.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(".validate ='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tag.validate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';\r\n");
      out.write("\t\tfunction ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tag.submitFunction}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("() {\r\n");
      out.write("\t\t\tvar validar = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tag.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(".validate;\r\n");
      out.write("\t\t\ttry {\r\n");
      out.write("\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tag.validateFunction}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\t\t\t} catch (e) {\r\n");
      out.write("\t\t\t\tvalidar = false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\ttry {\r\n");
      out.write("\t\t\t\tclearMessages();//limpa as mensagens que vieram do servidor\r\n");
      out.write("\t\t\t} catch(e){\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(validar == 'true') {\r\n");
      out.write("\t\t\t\tvar valid = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tag.validateFunction}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("();\r\n");
      out.write("\t\t\t\tif(valid) {\r\n");
      out.write("\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tag.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(".submit();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tag.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(".submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t");
      if (_jspx_meth_n_doBody_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</form>");
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

  private boolean _jspx_meth_n_doBody_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:doBody
    br.com.linkcom.neo.view.DoBodyTag _jspx_th_n_doBody_0 = new br.com.linkcom.neo.view.DoBodyTag();
    _jspx_th_n_doBody_0.setJspContext(_jspx_page_context);
    _jspx_th_n_doBody_0.doTag();
    return false;
  }
}
