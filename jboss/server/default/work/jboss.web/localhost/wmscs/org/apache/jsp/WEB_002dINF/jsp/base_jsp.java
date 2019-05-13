package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.linkcom.wms.util.WmsUtil;

public final class base_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/classes/META-INF/neo.tld");
    _jspx_dependants.add("/WEB-INF/classes/META-INF/template.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t");
      if (_jspx_meth_n_head_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t<link rel=\"StyleSheet\"        href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tema_wms}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/app.css\" type=\"text/css\">\r\n");
      out.write("\t\t<link rel=\"StyleSheet\"        href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tema_wms}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/app-ie.css\" type=\"text/css\">\r\n");
      out.write("\t\t<link rel=\"StyleSheet\"        href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tema_wms}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/theme.css\" type=\"text/css\">\r\n");
      out.write("\t\t<link rel=\"StyleSheet\"        href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tema_wms}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/default.css\" type=\"text/css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" \t\t  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/jquery-ui-1.7.3.custom.css\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("\t\t<title>");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write(" - Módulo ");
      out.print(WmsUtil.getNomeModulo());
      out.write("</title>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/tabela.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/wms.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.serialize.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.blockUI.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-ui-1.7.3.custom.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar neofecharcarregando = function(){$w.hideLoading()};\r\n");
      out.write("\t\t\tvar neoabrircarregando = function(){$w.showLoading()};\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div id=\"loadmsg\">\r\n");
      out.write("\t\t\t<span class=\"message\">Carregando...</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<script language=\"JavaScript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/wz_tooltip.js\"></script>\r\n");
      out.write("\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t<div id=\"corpo\">\r\n");
      out.write("\t\t\t\t<div class=\"cabecalho\">\r\n");
      out.write("\t\t\t\t\t<div class=\"logo\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/imagens/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tema_wms}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/sys/logo_wave.gif\"></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"cabecalho\" class=\"right\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"menu\">");
      if (_jspx_meth_n_menu_0(_jspx_page_context))
        return;
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"notificacao\">Você está logado como <b>");
      out.print(WmsUtil.getUsuarioLogado().getNomeForBase());
      out.write("</b> no depósito <b>");
      out.print(WmsUtil.getDeposito().getNomeForBase());
      out.write("</b><span class=\"spacer\">&nbsp;&nbsp;|&nbsp;</span>\r\n");
      out.write("\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<b>Suporte&nbsp;</b>\r\n");
      out.write("\t\t\t\t\t\t  \t\t  <!-- http://www.LiveZilla.net Chat Button Link Code -->\r\n");
      out.write("\t\t\t\t\t\t    \t");
      if (_jspx_meth_n_link_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t    \t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"conteudo\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_hasMessages_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"dynamic_messages\"></div>\r\n");
      out.write("\t\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bodyPage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false), out, false);
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<a name=\"bottom\">\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script>\r\n");
      out.write("\tvar plus = {help : {}};\r\n");
      out.write("\t\r\n");
      out.write("\t$.getScript(\"http://suporte.linkcom.com.br/image.php?plus=1\", function(){\r\n");
      out.write("  \t\tif (typeof plus_ajuda_status != 'undefined' && plus_ajuda_status){\r\n");
      out.write("  \t\t\tdocument.getElementById(\"suporteImage\").src = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/imagens/icone/ico_chat_on.png\";\r\n");
      out.write("  \t\t}else{\r\n");
      out.write("  \t\t\tdocument.getElementById(\"suporteImage\").src = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/imagens/icone/ico_chat_off.png\";\r\n");
      out.write("  \t\t}\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
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
    _jspx_th_n_head_0.setSearchCssDir(false);
    _jspx_th_n_head_0.setIncludeDefaultCss(false);
    _jspx_th_n_head_0.setIncludeThemeCss(false);
    _jspx_th_n_head_0.setIncludeAutocomplete(true);
    _jspx_th_n_head_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(null);
    _jspx_th_fmt_message_0.setKey("aplicacao.titulo");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      return true;
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_n_menu_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:menu
    br.com.linkcom.neo.view.menu.MenuTag _jspx_th_n_menu_0 = new br.com.linkcom.neo.view.menu.MenuTag();
    _jspx_th_n_menu_0.setJspContext(_jspx_page_context);
    _jspx_th_n_menu_0.setMenupath("/WEB-INF/menu/menu.xml");
    _jspx_th_n_menu_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_link_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_0 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_0.setJspContext(_jspx_page_context);
    _jspx_th_n_link_0.setUrl("javascript:void(window.open('http://suporte.linkcom.com.br/livezilla.php','','width=600,height=600,left=0,top=0,resizable=yes,menubar=no,location=yes,status=yes,scrollbars=yes'))");
    _jspx_th_n_link_0.setJspBody(new base_jspHelper( 0, _jspx_page_context, _jspx_th_n_link_0, null));
    _jspx_th_n_link_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_hasMessages_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:hasMessages
    br.com.linkcom.neo.view.HasMessagesTag _jspx_th_n_hasMessages_0 = new br.com.linkcom.neo.view.HasMessagesTag();
    _jspx_th_n_hasMessages_0.setJspContext(_jspx_page_context);
    _jspx_th_n_hasMessages_0.setJspBody(new base_jspHelper( 1, _jspx_page_context, _jspx_th_n_hasMessages_0, null));
    _jspx_th_n_hasMessages_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_messages_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:messages
    br.com.linkcom.neo.view.MessagesTag _jspx_th_n_messages_0 = new br.com.linkcom.neo.view.MessagesTag();
    _jspx_th_n_messages_0.setJspContext(_jspx_page_context);
    _jspx_th_n_messages_0.setParent(_jspx_parent);
    _jspx_th_n_messages_0.doTag();
    return false;
  }

  private class base_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public base_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/imagens/icone/ico_chat_off.png' style='border: 0px;' id=\"suporteImage\"/>\r\n");
      out.write("\t\t\t\t\t\t    \t");
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<table align=\"center\" width=\"100%\"><tr><td align=\"center\"><br>");
      if (_jspx_meth_n_messages_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("<br></td></tr></table>\r\n");
      out.write("\t\t\t\t\t");
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
