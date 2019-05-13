package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class escolhaAnomalia_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t");
      if (_jspx_meth_n_head_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t<script language=\"JavaScript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/tooltip/wz_tooltip.js\"></script>\r\n");
      out.write("\t<TABLE class=\"tabelaBase base_tabelabase\" style=\"width: 100%;\">\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t\t<TD style=\"height: 82px;\">\r\n");
      out.write("\t\t\t\t<TABLE class=\"tabelaBase\" style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TD rowspan=\"2\" class=\"base_logo\" \r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"cursor: pointer;\" >&nbsp;</TD>\r\n");
      out.write("\t\t\t\t\t\t\t<TD class=\"base_user\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<SPAN class=\"txt_normal\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${USER.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</SPAN>\r\n");
      out.write("\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t<TD class=\"base_menu\"valign=\"top\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t\t <div class=\"menuGeplanes\" onmouseover=\"esconderTabela()\" onmouseout=\"esconderTabela();\">\r\n");
      out.write("\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t</TABLE> \t\t\r\n");
      out.write("\t\t\t\t</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t\t<TD align=\"center\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_link_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_link_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_link_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tfunction salvarSemAnomalia(){\r\n");
      out.write("\t\t\t\t\t\t\tparent.submitSemAnomalia();\r\n");
      out.write("\t\t\t\t\t\t\tparent.$.akModalRemove();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tfunction salvarComAnomalia(){\r\n");
      out.write("\t\t\t\t\t\t\tparent.submitComAnomalia();\r\n");
      out.write("\t\t\t\t\t\t\tparent.$.akModalRemove();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tfunction cancelar(){\r\n");
      out.write("\t\t\t\t\t\t\tparent.$.akModalRemove();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t</TD>\r\n");
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

  private boolean _jspx_meth_n_link_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_0 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_0.setJspContext(_jspx_page_context);
    _jspx_th_n_link_0.setType("button");
    _jspx_th_n_link_0.setDynamicAttribute(null, "class", new String("botao_normal"));
    _jspx_th_n_link_0.setUrl("javascript:salvarSemAnomalia();");
    _jspx_th_n_link_0.setJspBody(new escolhaAnomalia_jspHelper( 0, _jspx_page_context, _jspx_th_n_link_0, null));
    _jspx_th_n_link_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_link_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_1 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_1.setJspContext(_jspx_page_context);
    _jspx_th_n_link_1.setType("button");
    _jspx_th_n_link_1.setDynamicAttribute(null, "class", new String("botao_normal"));
    _jspx_th_n_link_1.setUrl("javascript:salvarComAnomalia();");
    _jspx_th_n_link_1.setJspBody(new escolhaAnomalia_jspHelper( 1, _jspx_page_context, _jspx_th_n_link_1, null));
    _jspx_th_n_link_1.doTag();
    return false;
  }

  private boolean _jspx_meth_n_link_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_2 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_2.setJspContext(_jspx_page_context);
    _jspx_th_n_link_2.setType("button");
    _jspx_th_n_link_2.setDynamicAttribute(null, "class", new String("botao_normal"));
    _jspx_th_n_link_2.setUrl("javascript:cancelar();");
    _jspx_th_n_link_2.setJspBody(new escolhaAnomalia_jspHelper( 2, _jspx_page_context, _jspx_th_n_link_2, null));
    _jspx_th_n_link_2.doTag();
    return false;
  }

  private class escolhaAnomalia_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public escolhaAnomalia_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("Salvar registro");
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("Salvar registro e tratar anomalia");
      return false;
    }
    public boolean invoke2( JspWriter out ) 
      throws Throwable
    {
      out.write("Cancelar");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
          case 2:
            invoke2( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
