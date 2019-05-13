package org.apache.jsp.WEB_002dINF.jsp.popup;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class conferenciacegaPopUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\t/*Author: Pedro Gonçalves: pef.goncalves@gmail.com */\r\n");
      out.write("\t\r\n");
      out.write("\tvar selectedIndex = 0;\r\n");
      out.write("\t\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\"#osId\").hide();\r\n");
      out.write("\t\t$(\"#servicoUsuario\").hide();\r\n");
      out.write("\t\tmakeJson();\r\n");
      out.write("\t\t$(\"input\").each(function(){\r\n");
      out.write("\t\t\t$(this).attr(\"disabled\",\"disabled\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\"select\").each(function(){\r\n");
      out.write("\t\t\t$(this).attr(\"disabled\",\"disabled\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction makeJson(){\r\n");
      out.write("\t\t$w.getJSON(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/popup/Conferencia\", {\"ACAO\":\"getInfoProdutos\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\"recebimento.cdrecebimento\":");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.recebimento.cdrecebimento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\"ordemservico.cdordemservico\":");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.ordemservico.cdordemservico}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\"ultimaOs\":");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.ultimaOs}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("}, \r\n");
      out.write("\t\t\tfunction(json) {\r\n");
      out.write("\t\t\t\tif(json.lista.length > 0) {\r\n");
      out.write("\t\t\t\t\tvar lista = json.lista;\r\n");
      out.write("\t\t\t\t\tvar i = 0;\r\n");
      out.write("\t\t\t\t\tvar row = \"\";\r\n");
      out.write("\t\t\t\t\tfor(i=0; i< lista.length; i++){\r\n");
      out.write("\t\t\t\t\t\trow += makeRow(i,lista[i]);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t$(\"#produtos tbody\").empty().append(row);\r\n");
      out.write("\t\t\t\t\t$(\"#mensagem\").hide();\r\n");
      out.write("\t\t\t\t\t$(\"#osId\").show();\r\n");
      out.write("\t\t\t\t\t$(\"#servicoUsuario\").show();\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$(\"#btn_confirmar\").show();\r\n");
      out.write("\t\t\t\t\tvar row = null;\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$(\"#produtos tbody\").empty();\r\n");
      out.write("\t\t\t\t\t$(\"#mensagem\").show();\r\n");
      out.write("\t\t\t\t\t$(\"#osId\").hide();\r\n");
      out.write("\t\t\t\t\t$(\"#servicoUsuario\").hide();\r\n");
      out.write("\t\t\t\t\t$w.hideLoading();\r\n");
      out.write("\t\t\t\t\t$(\"#btn_confirmar\").hide();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t/* Cria a linha do Datagrid */\r\n");
      out.write("\tfunction makeRow(i,obj) {\r\n");
      out.write("\t\tvar row = \"<tr ordem='\"+i+\"' class='\"+(i % 2 == 0 ? \"dataGridBody1\" : \"dataGridBody2\")+\"'>\";\t\t\r\n");
      out.write("\t\trow += \"<td style='text-align: right'>\"+obj.ordemservico.cdordemservico + \" / \" + obj.ordemservico.ordem+\"</td>\";\r\n");
      out.write("\r\n");
      out.write("\t\tif (obj.ordemservicoproduto.produto.produtoprincipal && obj.ordemservicoproduto.produto.produtoprincipal.codigo){\r\n");
      out.write("\t\t\trow += \"<td style='text-align: right'>\"+obj.ordemservicoproduto.produto.produtoprincipal.codigo+\"</td>\";\r\n");
      out.write("\t\t\trow += \"<td>\"+obj.ordemservicoproduto.produto.produtoprincipal.descricao+\"</td>\";\r\n");
      out.write("\t\t\tvar complementoCB = obj.ordemservicoproduto.produto.complementocodigobarras;\r\n");
      out.write("\t\t\tcomplementoCB = complementoCB.substring(0,2) + \"/\" + complementoCB.substring(2); \r\n");
      out.write("\t\t\trow += \"<td>\"+complementoCB+\"</td>\";\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\trow += \"<td style='text-align: right'>\"+obj.ordemservicoproduto.produto.codigo+\"</td>\";\r\n");
      out.write("\t\t\trow += \"<td>\"+obj.ordemservicoproduto.produto.descricao+\"</td>\";\r\n");
      out.write("\t\t\trow += \"<td></td>\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\trow += \"<td style='text-align: right'>\"+obj.ordemservicoproduto.qtdeesperada+\"</td>\";\r\n");
      out.write("\t\trow += \"<td style='text-align: right'>\"+obj.qtde+\"</td>\";\r\n");
      out.write("\t\trow += \"<td style='text-align: right'>\"+obj.qtdefracionada+\"</td>\";\r\n");
      out.write("\t\trow += \"<td style='text-align: right'>\"+obj.qtdeavaria+\"</td>\";\r\n");
      out.write("\t\trow += \"</tr>\";\r\n");
      out.write("\t\treturn row;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>");
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
    _jspx_th_t_tela_0.setTitulo((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("Recebimento: ${filtro.recebimento.cdrecebimento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_t_tela_0.setJspBody(new conferenciacegaPopUp_jspHelper( 0, _jspx_page_context, _jspx_th_t_tela_0, null));
    _jspx_th_t_tela_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_bean_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:bean
    br.com.linkcom.neo.view.BeanTag _jspx_th_n_bean_0 = new br.com.linkcom.neo.view.BeanTag();
    _jspx_th_n_bean_0.setJspContext(_jspx_page_context);
    _jspx_th_n_bean_0.setParent(_jspx_parent);
    _jspx_th_n_bean_0.setName("filtro");
    _jspx_th_n_bean_0.setJspBody(new conferenciacegaPopUp_jspHelper( 1, _jspx_page_context, _jspx_th_n_bean_0, null));
    _jspx_th_n_bean_0.doTag();
    return false;
  }

  private boolean _jspx_meth_t_propertyConfig_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:propertyConfig
    br.com.linkcom.neo.view.template.PropertyConfigTag _jspx_th_t_propertyConfig_0 = new br.com.linkcom.neo.view.template.PropertyConfigTag();
    _jspx_th_t_propertyConfig_0.setJspContext(_jspx_page_context);
    _jspx_th_t_propertyConfig_0.setParent(_jspx_parent);
    _jspx_th_t_propertyConfig_0.setRenderAs("doubleline");
    _jspx_th_t_propertyConfig_0.setShowLabel(new Boolean(true));
    _jspx_th_t_propertyConfig_0.setMode("input");
    _jspx_th_t_propertyConfig_0.setJspBody(new conferenciacegaPopUp_jspHelper( 2, _jspx_page_context, _jspx_th_t_propertyConfig_0, null));
    _jspx_th_t_propertyConfig_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_dataGrid_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:dataGrid
    br.com.linkcom.neo.view.DataGridTag _jspx_th_n_dataGrid_0 = new br.com.linkcom.neo.view.DataGridTag();
    _jspx_th_n_dataGrid_0.setJspContext(_jspx_page_context);
    _jspx_th_n_dataGrid_0.setParent(_jspx_parent);
    _jspx_th_n_dataGrid_0.setId("produtos");
    _jspx_th_n_dataGrid_0.setHeaderStyleClass("dgh");
    _jspx_th_n_dataGrid_0.setJspBody(new conferenciacegaPopUp_jspHelper( 3, _jspx_page_context, _jspx_th_n_dataGrid_0, null));
    _jspx_th_n_dataGrid_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_column_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:column
    br.com.linkcom.neo.view.ColumnTag _jspx_th_n_column_0 = new br.com.linkcom.neo.view.ColumnTag();
    _jspx_th_n_column_0.setJspContext(_jspx_page_context);
    _jspx_th_n_column_0.setParent(_jspx_parent);
    _jspx_th_n_column_0.setHeader("Ordem Serviço");
    _jspx_th_n_column_0.setJspBody(new conferenciacegaPopUp_jspHelper( 4, _jspx_page_context, _jspx_th_n_column_0, null));
    _jspx_th_n_column_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_column_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:column
    br.com.linkcom.neo.view.ColumnTag _jspx_th_n_column_1 = new br.com.linkcom.neo.view.ColumnTag();
    _jspx_th_n_column_1.setJspContext(_jspx_page_context);
    _jspx_th_n_column_1.setParent(_jspx_parent);
    _jspx_th_n_column_1.setHeader("Cód. Produto");
    _jspx_th_n_column_1.setJspBody(new conferenciacegaPopUp_jspHelper( 5, _jspx_page_context, _jspx_th_n_column_1, null));
    _jspx_th_n_column_1.doTag();
    return false;
  }

  private boolean _jspx_meth_n_column_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:column
    br.com.linkcom.neo.view.ColumnTag _jspx_th_n_column_2 = new br.com.linkcom.neo.view.ColumnTag();
    _jspx_th_n_column_2.setJspContext(_jspx_page_context);
    _jspx_th_n_column_2.setParent(_jspx_parent);
    _jspx_th_n_column_2.setHeader("Nome Produto");
    _jspx_th_n_column_2.setJspBody(new conferenciacegaPopUp_jspHelper( 6, _jspx_page_context, _jspx_th_n_column_2, null));
    _jspx_th_n_column_2.doTag();
    return false;
  }

  private boolean _jspx_meth_n_column_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:column
    br.com.linkcom.neo.view.ColumnTag _jspx_th_n_column_3 = new br.com.linkcom.neo.view.ColumnTag();
    _jspx_th_n_column_3.setJspContext(_jspx_page_context);
    _jspx_th_n_column_3.setParent(_jspx_parent);
    _jspx_th_n_column_3.setHeader("Volume");
    _jspx_th_n_column_3.setJspBody(new conferenciacegaPopUp_jspHelper( 7, _jspx_page_context, _jspx_th_n_column_3, null));
    _jspx_th_n_column_3.doTag();
    return false;
  }

  private boolean _jspx_meth_n_column_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:column
    br.com.linkcom.neo.view.ColumnTag _jspx_th_n_column_4 = new br.com.linkcom.neo.view.ColumnTag();
    _jspx_th_n_column_4.setJspContext(_jspx_page_context);
    _jspx_th_n_column_4.setParent(_jspx_parent);
    _jspx_th_n_column_4.setHeader("Quantidade esperada");
    _jspx_th_n_column_4.setJspBody(new conferenciacegaPopUp_jspHelper( 8, _jspx_page_context, _jspx_th_n_column_4, null));
    _jspx_th_n_column_4.doTag();
    return false;
  }

  private boolean _jspx_meth_n_column_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:column
    br.com.linkcom.neo.view.ColumnTag _jspx_th_n_column_5 = new br.com.linkcom.neo.view.ColumnTag();
    _jspx_th_n_column_5.setJspContext(_jspx_page_context);
    _jspx_th_n_column_5.setParent(_jspx_parent);
    _jspx_th_n_column_5.setHeader("Quantidade recebida");
    _jspx_th_n_column_5.setJspBody(new conferenciacegaPopUp_jspHelper( 9, _jspx_page_context, _jspx_th_n_column_5, null));
    _jspx_th_n_column_5.doTag();
    return false;
  }

  private boolean _jspx_meth_n_column_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:column
    br.com.linkcom.neo.view.ColumnTag _jspx_th_n_column_6 = new br.com.linkcom.neo.view.ColumnTag();
    _jspx_th_n_column_6.setJspContext(_jspx_page_context);
    _jspx_th_n_column_6.setParent(_jspx_parent);
    _jspx_th_n_column_6.setHeader("Quantidade fracionada");
    _jspx_th_n_column_6.setJspBody(new conferenciacegaPopUp_jspHelper( 10, _jspx_page_context, _jspx_th_n_column_6, null));
    _jspx_th_n_column_6.doTag();
    return false;
  }

  private boolean _jspx_meth_n_column_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:column
    br.com.linkcom.neo.view.ColumnTag _jspx_th_n_column_7 = new br.com.linkcom.neo.view.ColumnTag();
    _jspx_th_n_column_7.setJspContext(_jspx_page_context);
    _jspx_th_n_column_7.setParent(_jspx_parent);
    _jspx_th_n_column_7.setHeader("Quantidade avariada");
    _jspx_th_n_column_7.setJspBody(new conferenciacegaPopUp_jspHelper( 11, _jspx_page_context, _jspx_th_n_column_7, null));
    _jspx_th_n_column_7.doTag();
    return false;
  }

  private class conferenciacegaPopUp_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public conferenciacegaPopUp_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
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
      if (_jspx_meth_n_bean_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t\r\n");
      out.write("\t<div align=\"right\">\r\n");
      out.write("\t\t<a href=\"javascript: window.close()\" title=\"\" id=\"btn_fechar\" onmouseover='Tip(\"Fechar\")'>Fechar</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<br>\r\n");
      out.write("\t\r\n");
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t<div id=\"selecao\">\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_t_propertyConfig_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t");
      return false;
    }
    public boolean invoke2( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_dataGrid_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div id=\"mensagem\">Nenhum resultado encontrado.</div>\r\n");
      out.write("\t\t\t");
      return false;
    }
    public boolean invoke3( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_column_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_column_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_column_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_column_3(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_column_4(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_column_5(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_column_6(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_column_7(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      return false;
    }
    public boolean invoke4( JspWriter out ) 
      throws Throwable
    {
      out.write(' ');
      return false;
    }
    public boolean invoke5( JspWriter out ) 
      throws Throwable
    {
      out.write(' ');
      return false;
    }
    public boolean invoke6( JspWriter out ) 
      throws Throwable
    {
      out.write(' ');
      return false;
    }
    public boolean invoke7( JspWriter out ) 
      throws Throwable
    {
      out.write(' ');
      return false;
    }
    public boolean invoke8( JspWriter out ) 
      throws Throwable
    {
      out.write(' ');
      return false;
    }
    public boolean invoke9( JspWriter out ) 
      throws Throwable
    {
      out.write(' ');
      return false;
    }
    public boolean invoke10( JspWriter out ) 
      throws Throwable
    {
      out.write(' ');
      return false;
    }
    public boolean invoke11( JspWriter out ) 
      throws Throwable
    {
      out.write(' ');
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
          case 6:
            invoke6( out );
            break;
          case 7:
            invoke7( out );
            break;
          case 8:
            invoke8( out );
            break;
          case 9:
            invoke9( out );
            break;
          case 10:
            invoke10( out );
            break;
          case 11:
            invoke11( out );
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
