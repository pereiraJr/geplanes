package org.apache.jsp.WEB_002dINF.jsp.expedicao.crud;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class boxexpedicaoListagem_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("w:concatenar", br.com.linkcom.wms.util.tag.TagFunctions.class, "concatenar", new Class[] {java.util.List.class, java.lang.String.class, java.lang.String.class});
}

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/classes/META-INF/neo.tld");
    _jspx_dependants.add("/WEB-INF/classes/META-INF/template.tld");
    _jspx_dependants.add("/WEB-INF/tld/wms.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      if (_jspx_meth_t_acao_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_t_listagem_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"componente-dialog\" style=\"display:none;\" title=\"Gerenciar expedição\">\r\n");
      out.write("\t<table class=\"labelColumn\" style=\"width:100%;\" >\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t<div id=\"div-tabela-componentes\"></div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function gerarSeparacao(){\r\n");
      out.write("\tif($dg.getSelectedValues() == ''){\r\n");
      out.write("\t\talert('Nenhum Box foi selecionado.');\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tdocument.location = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Gerarseparacaoexpedicao?selectedItens='+$dg.getSelectedValues();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function visualizarCarregamentos(cdbox){\r\n");
      out.write("\t$.getJSON(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/crud/Carregamentoexpedicao?ACAO=getCountCarregamentos\", {\"cdbox\" : cdbox}, function(json){\r\n");
      out.write("\t\tif(json.count > 0)\r\n");
      out.write("\t\t\tdocument.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/crud/Carregamentoexpedicao?cdbox=\" + cdbox;\r\n");
      out.write("\t\telse{\t\r\n");
      out.write("\t\t\talert(\"Não há carregamentos pendentes para este box.\");\r\n");
      out.write("\t\t}\t\r\n");
      out.write("\t});\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("   \t$(\"#componente-dialog\").dialog(\"destroy\");\r\n");
      out.write("\t$(\"#componente-dialog\").dialog({\r\n");
      out.write("\t\tautoOpen: false,\r\n");
      out.write("\t\theight: 300,\r\n");
      out.write("\t\twidth: 700,\r\n");
      out.write("\t\tmodal: true,\r\n");
      out.write("\t\tbuttons: {\r\n");
      out.write("\t\t\t'Cancelar': function() {\r\n");
      out.write("\t\t\t\t$(\"#componente-dialog\").dialog('close');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function carregarExpedicoes(cdbox, event){\r\n");
      out.write("\t//Tratamento especial para IE e Firefox\r\n");
      out.write("\tif (event.preventDefault)\r\n");
      out.write("\t\tevent.preventDefault();\r\n");
      out.write("\telse\r\n");
      out.write("\t\tevent.returnValue = false;\r\n");
      out.write("\t\r\n");
      out.write("\t$.getJSON(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/crud/Expedicao?ACAO=listarExpedicoesAjax\", {\"cdbox\" : cdbox}, function(json){\r\n");
      out.write("\t\tif(json.lista.length == 1)\r\n");
      out.write("\t\t\tdocument.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Gerenciarexpedicao?cdexpedicao=\" + json.lista[0].cdexpedicao;\r\n");
      out.write("\t\telse{\t\r\n");
      out.write("\t\t\t$(\"#componente-dialog\").dialog(\"open\");\r\n");
      out.write("\t\t\t///GIF indicativo de operação em progresso, será substituído pelo conteúdo que chegar como resposta.\r\n");
      out.write("\t\t\t$(\"#div-tabela-componentes table tbody\").empty();\r\n");
      out.write("\t\t\t$(\"#div-tabela-componentes table\").append('<tr><td colspan=\"4\" align=\"center\"><br/><br/><br/><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/imagens/loading.gif\" style=\"top:120px;left:200px;\"/></td></tr>');\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/crud/Expedicao?ACAO=listarExpedicoes&cdbox=\"+cdbox;\r\n");
      out.write("\t\t\t$(\"#div-tabela-componentes\").load(url);\r\n");
      out.write("\t\t}\t\r\n");
      out.write("\t});\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_t_acao_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:acao
    br.com.linkcom.neo.view.template.AcaoTag _jspx_th_t_acao_0 = new br.com.linkcom.neo.view.template.AcaoTag();
    _jspx_th_t_acao_0.setJspContext(_jspx_page_context);
    _jspx_th_t_acao_0.setJspBody(new boxexpedicaoListagem_jspHelper( 0, _jspx_page_context, _jspx_th_t_acao_0, null));
    _jspx_th_t_acao_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PERMITIR_GERAR_SEPARACAO}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<a href=\"#\" id='btn_engrenagem' onmouseover='Tip(\"Gerar separação\")' onclick=\"gerarSeparacao()\">Gerar separação</a>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_t_listagem_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:listagem
    br.com.linkcom.neo.view.template.ListagemTag _jspx_th_t_listagem_0 = new br.com.linkcom.neo.view.template.ListagemTag();
    _jspx_th_t_listagem_0.setJspContext(_jspx_page_context);
    _jspx_th_t_listagem_0.setShowNewLink(false);
    _jspx_th_t_listagem_0.setDynamicAttribute(null, "showdeletelink", new String("false"));
    _jspx_th_t_listagem_0.setTitulo("Box de expedição");
    _jspx_th_t_listagem_0.setJspBody(new boxexpedicaoListagem_jspHelper( 1, _jspx_page_context, _jspx_th_t_listagem_0, null));
    _jspx_th_t_listagem_0.doTag();
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
    _jspx_th_t_janelaFiltro_0.setJspBody(new boxexpedicaoListagem_jspHelper( 2, _jspx_page_context, _jspx_th_t_janelaFiltro_0, null));
    _jspx_th_t_janelaFiltro_0.doTag();
    return false;
  }

  private boolean _jspx_meth_t_tabelaFiltro_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tabelaFiltro
    br.com.linkcom.neo.view.template.TabelaFiltroTag _jspx_th_t_tabelaFiltro_0 = new br.com.linkcom.neo.view.template.TabelaFiltroTag();
    _jspx_th_t_tabelaFiltro_0.setJspContext(_jspx_page_context);
    _jspx_th_t_tabelaFiltro_0.setParent(_jspx_parent);
    _jspx_th_t_tabelaFiltro_0.setJspBody(new boxexpedicaoListagem_jspHelper( 3, _jspx_page_context, _jspx_th_t_tabelaFiltro_0, null));
    _jspx_th_t_tabelaFiltro_0.doTag();
    return false;
  }

  private boolean _jspx_meth_w_tableGroup_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  w:tableGroup
    br.com.linkcom.wms.util.tag.TableGroupTag _jspx_th_w_tableGroup_0 = new br.com.linkcom.wms.util.tag.TableGroupTag();
    _jspx_th_w_tableGroup_0.setJspContext(_jspx_page_context);
    _jspx_th_w_tableGroup_0.setParent(_jspx_parent);
    _jspx_th_w_tableGroup_0.setColumns(new Integer(3));
    _jspx_th_w_tableGroup_0.setPanelgridWidth("30%");
    _jspx_th_w_tableGroup_0.setJspBody(new boxexpedicaoListagem_jspHelper( 4, _jspx_page_context, _jspx_th_w_tableGroup_0, null));
    _jspx_th_w_tableGroup_0.doTag();
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
    _jspx_th_t_property_0.setName("nome");
    _jspx_th_t_property_0.setDynamicAttribute(null, "onKeypress", new String("$w.permiteNumeros(event);"));
    _jspx_th_t_property_0.setDynamicAttribute(null, "style", new String("text-align: right; width: 118px;"));
    _jspx_th_t_property_0.doTag();
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
    _jspx_th_t_property_1.setName("boxstatus");
    _jspx_th_t_property_1.doTag();
    return false;
  }

  private boolean _jspx_meth_t_janelaResultados_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:janelaResultados
    br.com.linkcom.neo.view.template.JanelaResultadosTag _jspx_th_t_janelaResultados_0 = new br.com.linkcom.neo.view.template.JanelaResultadosTag();
    _jspx_th_t_janelaResultados_0.setJspContext(_jspx_page_context);
    _jspx_th_t_janelaResultados_0.setParent(_jspx_parent);
    _jspx_th_t_janelaResultados_0.setJspBody(new boxexpedicaoListagem_jspHelper( 5, _jspx_page_context, _jspx_th_t_janelaResultados_0, null));
    _jspx_th_t_janelaResultados_0.doTag();
    return false;
  }

  private boolean _jspx_meth_t_tabelaResultados_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tabelaResultados
    br.com.linkcom.neo.view.template.TabelaResultadosTag _jspx_th_t_tabelaResultados_0 = new br.com.linkcom.neo.view.template.TabelaResultadosTag();
    _jspx_th_t_tabelaResultados_0.setJspContext(_jspx_page_context);
    _jspx_th_t_tabelaResultados_0.setParent(_jspx_parent);
    _jspx_th_t_tabelaResultados_0.setShowConsultarLink(false);
    _jspx_th_t_tabelaResultados_0.setJspBody(new boxexpedicaoListagem_jspHelper( 6, _jspx_page_context, _jspx_th_t_tabelaResultados_0, null));
    _jspx_th_t_tabelaResultados_0.doTag();
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
    _jspx_th_t_property_2.setName("nome");
    _jspx_th_t_property_2.setOrder("");
    _jspx_th_t_property_2.setBodyStyle("width: 250px;");
    _jspx_th_t_property_2.doTag();
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
    _jspx_th_t_property_3.setName("boxstatus");
    _jspx_th_t_property_3.setOrder("");
    _jspx_th_t_property_3.doTag();
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
    _jspx_th_n_column_0.setHeader("Carregamentos");
    _jspx_th_n_column_0.setDynamicAttribute(null, "style", new String("white-space: normal;"));
    _jspx_th_n_column_0.setJspBody(new boxexpedicaoListagem_jspHelper( 7, _jspx_page_context, _jspx_th_n_column_0, null));
    _jspx_th_n_column_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_body_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:body
    br.com.linkcom.neo.view.BodyTag _jspx_th_n_body_0 = new br.com.linkcom.neo.view.BodyTag();
    _jspx_th_n_body_0.setJspContext(_jspx_page_context);
    _jspx_th_n_body_0.setParent(_jspx_parent);
    _jspx_th_n_body_0.setJspBody(new boxexpedicaoListagem_jspHelper( 8, _jspx_page_context, _jspx_th_n_body_0, null));
    _jspx_th_n_body_0.doTag();
    return false;
  }

  private boolean _jspx_meth_t_acao_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:acao
    br.com.linkcom.neo.view.template.AcaoTag _jspx_th_t_acao_1 = new br.com.linkcom.neo.view.template.AcaoTag();
    _jspx_th_t_acao_1.setJspContext(_jspx_page_context);
    _jspx_th_t_acao_1.setParent(_jspx_parent);
    _jspx_th_t_acao_1.setJspBody(new boxexpedicaoListagem_jspHelper( 9, _jspx_page_context, _jspx_th_t_acao_1, null));
    _jspx_th_t_acao_1.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!box.expedicaoemandamento}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<a href='#' id='btn_engrenagem' onmouseover='Tip(\"Visualizar carregamentos\")' onclick='visualizarCarregamentos(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${box.cdbox}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(")'>Visualizar carregamentos</a>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${box.expedicaoemandamento}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<a href='#' id='btn_engrenagem' onmouseover='Tip(\"Gerenciar expedição\")' onclick='carregarExpedicoes(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${box.cdbox}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(", event)'>Gerenciar expedição</a>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private class boxexpedicaoListagem_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public boxexpedicaoListagem_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
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
      if (_jspx_meth_c_if_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write('\r');
      out.write('\n');
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_t_janelaFiltro_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_t_janelaResultados_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write('\r');
      out.write('\n');
      return false;
    }
    public boolean invoke2( JspWriter out ) 
      throws Throwable
    {
      out.write(" \r\n");
      out.write("\t\t");
      if (_jspx_meth_t_tabelaFiltro_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write('\r');
      out.write('\n');
      out.write('	');
      return false;
    }
    public boolean invoke3( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_w_tableGroup_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t");
      return false;
    }
    public boolean invoke4( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_property_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_property_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      return false;
    }
    public boolean invoke5( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_t_tabelaResultados_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write('\r');
      out.write('\n');
      out.write('	');
      return false;
    }
    public boolean invoke6( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_t_property_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_t_property_3(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_n_column_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_t_acao_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t");
      return false;
    }
    public boolean invoke7( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_body_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      return false;
    }
    public boolean invoke8( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${w:concatenar(box.listaCarregamentos, 'cdcarregamento', ', ')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\r\n");
      out.write("\t\t\t\t");
      return false;
    }
    public boolean invoke9( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_if_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_if_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
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
