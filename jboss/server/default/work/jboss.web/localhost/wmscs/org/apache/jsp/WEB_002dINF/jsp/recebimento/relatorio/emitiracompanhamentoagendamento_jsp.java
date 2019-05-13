package org.apache.jsp.WEB_002dINF.jsp.recebimento.relatorio;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class emitiracompanhamentoagendamento_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/classes/META-INF/neo.tld");
    _jspx_dependants.add("/WEB-INF/classes/META-INF/template.tld");
    _jspx_dependants.add("/WEB-INF/tld/wms.tld");
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
      if (_jspx_meth_t_tela_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction gerarRelatorio(){\r\n");
      out.write("\t\tvar dtinicio = $w.trim($(\"input[name=dtinicioagendamento]\").val());\r\n");
      out.write("\t\tvar dtfim = $w.trim($(\"input[name=dtfimagendamento]\").val());\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(dtinicio != '' && dtfim != '') {\r\n");
      out.write("\t\t\tvar comparacaoData = $w.comparaData(dtinicio, dtfim);\r\n");
      out.write("\t\t\tif(comparacaoData == -1) {\r\n");
      out.write("\t\t\t\talert('A data inicial deve ser menor ou igual à data final.\\n');\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tvar dtinicioR = $w.trim($(\"input[name=dtiniciorecebimento]\").val());\r\n");
      out.write("\t\tvar dtfimR = $w.trim($(\"input[name=dtfimrecebimento]\").val());\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(dtinicioR != '' && dtfimR != '') {\r\n");
      out.write("\t\t\tvar comparacaoDataR = $w.comparaData(dtinicioR, dtfimR);\r\n");
      out.write("\t\t\tif(comparacaoDataR == -1) {\r\n");
      out.write("\t\t\t\talert('A data inicial de recebimento deve ser menor ou igual à data final de recebimento.\\n');\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tform.ACAO.value='gerar';\r\n");
      out.write("\t\tform.action='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/recebimento/report/Acompanhamentoagendamento';\r\n");
      out.write("\t\tsubmitForm()\r\n");
      out.write("\t}\r\n");
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

  private boolean _jspx_meth_t_tela_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tela
    br.com.linkcom.neo.view.template.TelaTag _jspx_th_t_tela_0 = new br.com.linkcom.neo.view.template.TelaTag();
    _jspx_th_t_tela_0.setJspContext(_jspx_page_context);
    _jspx_th_t_tela_0.setTitulo("Relatório de acompanhamento de agendamento");
    _jspx_th_t_tela_0.setJspBody(new emitiracompanhamentoagendamento_jspHelper( 0, _jspx_page_context, _jspx_th_t_tela_0, null));
    _jspx_th_t_tela_0.doTag();
    return false;
  }

  private boolean _jspx_meth_t_tabelaRelatorio_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tabelaRelatorio
    br.com.linkcom.neo.view.template.TabelaRelatorioTag _jspx_th_t_tabelaRelatorio_0 = new br.com.linkcom.neo.view.template.TabelaRelatorioTag();
    _jspx_th_t_tabelaRelatorio_0.setJspContext(_jspx_page_context);
    _jspx_th_t_tabelaRelatorio_0.setParent(_jspx_parent);
    _jspx_th_t_tabelaRelatorio_0.setJspBody(new emitiracompanhamentoagendamento_jspHelper( 1, _jspx_page_context, _jspx_th_t_tabelaRelatorio_0, null));
    _jspx_th_t_tabelaRelatorio_0.doTag();
    return false;
  }

  private boolean _jspx_meth_t_janelaFiltro_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:janelaFiltro
    br.com.linkcom.neo.view.template.JanelaFiltroTag _jspx_th_t_janelaFiltro_0 = new br.com.linkcom.neo.view.template.JanelaFiltroTag();
    _jspx_th_t_janelaFiltro_0.setJspContext(_jspx_page_context);
    _jspx_th_t_janelaFiltro_0.setParent(_jspx_parent);
    _jspx_th_t_janelaFiltro_0.setJspBody(new emitiracompanhamentoagendamento_jspHelper( 2, _jspx_page_context, _jspx_th_t_janelaFiltro_0, null));
    _jspx_th_t_janelaFiltro_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panelGrid_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panelGrid
    br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_0 = new br.com.linkcom.neo.view.PanelGridTag();
    _jspx_th_n_panelGrid_0.setJspContext(_jspx_page_context);
    _jspx_th_n_panelGrid_0.setParent(_jspx_parent);
    _jspx_th_n_panelGrid_0.setColumns(new Integer(3));
    _jspx_th_n_panelGrid_0.setColumnStyleClasses("labelColumn,labelColumn");
    _jspx_th_n_panelGrid_0.setColumnStyles("width:auto;,width:auto;");
    _jspx_th_n_panelGrid_0.setJspBody(new emitiracompanhamentoagendamento_jspHelper( 3, _jspx_page_context, _jspx_th_n_panelGrid_0, null));
    _jspx_th_n_panelGrid_0.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_0 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_0.setJspContext(_jspx_page_context);
    _jspx_th_t_property_0.setParent(_jspx_parent);
    _jspx_th_t_property_0.setName("deposito");
    _jspx_th_t_property_0.setRenderAs("doubleline");
    _jspx_th_t_property_0.setDynamicAttribute(null, "style", new String("width:115px;"));
    _jspx_th_t_property_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_0 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_0.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_0.setParent(_jspx_parent);
    _jspx_th_n_panel_0.setJspBody(new emitiracompanhamentoagendamento_jspHelper( 4, _jspx_page_context, _jspx_th_n_panel_0, null));
    _jspx_th_n_panel_0.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_1 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_1.setJspContext(_jspx_page_context);
    _jspx_th_t_property_1.setParent(_jspx_parent);
    _jspx_th_t_property_1.setName("dtinicioagendamento");
    _jspx_th_t_property_1.setRenderAs("single");
    _jspx_th_t_property_1.setShowLabel(new Boolean(false));
    _jspx_th_t_property_1.setLabelStyleClass("labelColumn");
    _jspx_th_t_property_1.setDynamicAttribute(null, "style", new String("width:80px;"));
    _jspx_th_t_property_1.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_2 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_2.setJspContext(_jspx_page_context);
    _jspx_th_t_property_2.setParent(_jspx_parent);
    _jspx_th_t_property_2.setName("dtfimagendamento");
    _jspx_th_t_property_2.setRenderAs("single");
    _jspx_th_t_property_2.setShowLabel(new Boolean(false));
    _jspx_th_t_property_2.setLabelStyleClass("labelColumn");
    _jspx_th_t_property_2.setDynamicAttribute(null, "style", new String("width:80px;"));
    _jspx_th_t_property_2.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_1 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_1.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_1.setParent(_jspx_parent);
    _jspx_th_n_panel_1.setJspBody(new emitiracompanhamentoagendamento_jspHelper( 5, _jspx_page_context, _jspx_th_n_panel_1, null));
    _jspx_th_n_panel_1.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_3 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_3.setJspContext(_jspx_page_context);
    _jspx_th_t_property_3.setParent(_jspx_parent);
    _jspx_th_t_property_3.setName("dtiniciorecebimento");
    _jspx_th_t_property_3.setRenderAs("single");
    _jspx_th_t_property_3.setShowLabel(new Boolean(false));
    _jspx_th_t_property_3.setLabelStyleClass("labelColumn");
    _jspx_th_t_property_3.setDynamicAttribute(null, "style", new String("width:80px;"));
    _jspx_th_t_property_3.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_4 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_4.setJspContext(_jspx_page_context);
    _jspx_th_t_property_4.setParent(_jspx_parent);
    _jspx_th_t_property_4.setName("dtfimrecebimento");
    _jspx_th_t_property_4.setRenderAs("single");
    _jspx_th_t_property_4.setShowLabel(new Boolean(false));
    _jspx_th_t_property_4.setLabelStyleClass("labelColumn");
    _jspx_th_t_property_4.setDynamicAttribute(null, "style", new String("width:80px;"));
    _jspx_th_t_property_4.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_5 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_5.setJspContext(_jspx_page_context);
    _jspx_th_t_property_5.setParent(_jspx_parent);
    _jspx_th_t_property_5.setName("fornecedor");
    _jspx_th_t_property_5.setType(new String("autocomplete"));
    _jspx_th_t_property_5.setDynamicAttribute(null, "includeConfirmExcludeAutocomplete", new String("false"));
    _jspx_th_t_property_5.setRenderAs("doubleline");
    _jspx_th_t_property_5.setColspan(new Integer(2));
    _jspx_th_t_property_5.setDynamicAttribute(null, "style", new String("width:300px;"));
    _jspx_th_t_property_5.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_6 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_6.setJspContext(_jspx_page_context);
    _jspx_th_t_property_6.setParent(_jspx_parent);
    _jspx_th_t_property_6.setName("numeropedido");
    _jspx_th_t_property_6.setRenderAs("doubleline");
    _jspx_th_t_property_6.doTag();
    return false;
  }

  private class emitiracompanhamentoagendamento_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public emitiracompanhamentoagendamento_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_t_tabelaRelatorio_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t<span>\r\n");
      out.write("\t\t<div style=\"text-align : right;\">\r\n");
      out.write("\t\t\t<a href=\"#\" onclick=\"gerarRelatorio()\" onmouseover=\"Tip('Gerar relatório')\" id='btn_engrenagem'>gerar</a></div>\r\n");
      out.write("\t</span>\r\n");
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_t_janelaFiltro_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write('\r');
      out.write('\n');
      out.write('	');
      return false;
    }
    public boolean invoke2( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_n_panelGrid_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t");
      return false;
    }
    public boolean invoke3( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_property_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_panel_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_panel_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_property_5(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_property_6(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      return false;
    }
    public boolean invoke4( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\tData de agendamento<br/>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_t_property_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t<span class=\"labelColumn1\" style=\"font-weight: normal;\"> até </span> \r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_t_property_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      return false;
    }
    public boolean invoke5( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\tData de recebimento<br/>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_t_property_3(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t<span class=\"labelColumn1\" style=\"font-weight: normal;\"> até </span> \r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_t_property_4(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
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
          case 3:
            invoke3( out );
            break;
          case 4:
            invoke4( out );
            break;
          case 5:
            invoke5( out );
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
