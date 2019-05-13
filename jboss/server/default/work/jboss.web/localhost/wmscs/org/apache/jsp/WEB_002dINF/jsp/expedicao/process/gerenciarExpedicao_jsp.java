package org.apache.jsp.WEB_002dINF.jsp.expedicao.process;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.linkcom.wms.geral.bean.Expedicao;

public final class gerenciarExpedicao_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("n:ognl", br.com.linkcom.neo.view.NeoFunctions.class, "ognl", new Class[] {java.lang.String.class});
}

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/classes/META-INF/neo.tld");
    _jspx_dependants.add("/WEB-INF/classes/META-INF/template.tld");
    _jspx_dependants.add("/WEB-INF/tld/wms.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_otherwise.release();
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
      out.write("<style>\r\n");
      out.write(".labelColumn span {\r\n");
      out.write("\tfont-weight:normal;\r\n");
      out.write("\tfont-family:verdana,arial,helvetica,sans-serif;\r\n");
      out.write("\ttext-transform:none;\r\n");
      out.write("\ttext-size:11px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dataGrid{\r\n");
      out.write("\tfont-family:verdana,arial,helvetica,sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      //  t:tela
      br.com.linkcom.neo.view.template.TelaTag _jspx_th_t_tela_0 = new br.com.linkcom.neo.view.template.TelaTag();
      _jspx_th_t_tela_0.setJspContext(_jspx_page_context);
      _jspx_th_t_tela_0.setTitulo("GERENCIAR EXPEDIÇÃO");
      _jspx_th_t_tela_0.setDynamicAttribute(null, "botoes", (java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${botao}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      _jspx_th_t_tela_0.setJspBody(new gerenciarExpedicao_jspHelper( 0, _jspx_page_context, _jspx_th_t_tela_0, null));
      _jspx_th_t_tela_0.doTag();
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"cancelar-dialog\" style=\"display:none;\" title=\"Cancelar expedição\">\r\n");
      out.write("\t<form method=\"POST\" name=\"formCancel\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Gerenciarexpedicao\" onsubmit=\"return false;\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"ACAO\" value=\"cancelar\"/>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"cdexpedicao\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${expedicao.cdexpedicao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"suppressValidation\" value=\"false\"/>\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"suppressErrors\" value=\"false\"/>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<span style=\"font-family:verdana,arial,helvetica,sans-serif;\">\r\n");
      out.write("\t\t\t\tA expedição e todos os seus carregamentos serão cancelados. Deseja continuar?\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<label for=\"confirmacao_usuario\" class=\"labelColumn\">Senha:</label>\r\n");
      out.write("\t\t\t<input id=\"confirmacao_usuario\" name=\"confirmacao_usuario\" type=\"password\" style=\"width:230px;\" />\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("   \t$(\"#cancelar-dialog\").dialog(\"destroy\");\r\n");
      out.write("\t$(\"#cancelar-dialog\").dialog({\r\n");
      out.write("\t\tautoOpen: false,\r\n");
      out.write("\t\theight: 200,\r\n");
      out.write("\t\twidth: 400,\r\n");
      out.write("\t\tmodal: true,\r\n");
      out.write("\t\tbuttons: {\r\n");
      out.write("\t\t\t'Cancelar': function() {\r\n");
      out.write("\t\t\t\t$(\"#cancelar-dialog\").dialog('close');\r\n");
      out.write("\t\t\t\t$(\"#confirmacao_usuario\").val(\"\");\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t'Confirmar': function() {\r\n");
      out.write("\t\t\t\tdocument.forms[\"formCancel\"].submit();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function lancarCorte(ordemservico){\r\n");
      out.write("\t$w.showLoading();\r\n");
      out.write("\t\r\n");
      out.write("\t$.ajax({url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Gerenciarexpedicao?ACAO=validarLancamentoCorte\",\r\n");
      out.write("      global: false, type: \"POST\", data: ({\"cdordemservico\" : ordemservico}),\r\n");
      out.write("      dataType: \"json\", async:false,\r\n");
      out.write("      success: function(resposta){\r\n");
      out.write("\t\t$w.hideLoading();\r\n");
      out.write("\r\n");
      out.write("\t\tif (resposta.erro){\r\n");
      out.write("\t\t\talert(resposta.mensagem);\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\topenPopUp(ordemservico);\r\n");
      out.write("\t\t}\r\n");
      out.write("      }\r\n");
      out.write("   });   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function openPopUpDetalhes(ordemservico) {\r\n");
      out.write("\t$w.openPopup(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Visualizardetalhes?cdordemservico=\" + ordemservico + \"&isGerenciarcarregamento=false\", 1000, 600);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function refresh(){\r\n");
      out.write("\tdocument.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Gerenciarexpedicao?cdexpedicao=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${expedicao.cdexpedicao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function imprimirMapasSelecionados() {\r\n");
      out.write("\tvar os = \"\";\r\n");
      out.write("\t\r\n");
      out.write("\tos = getCheks(os); \r\n");
      out.write("\t\r\n");
      out.write("\tif(os == \"\")\r\n");
      out.write("\t\talert(\"Nenhum mapa foi selecionado\");\r\n");
      out.write("\t\t\r\n");
      out.write("\telse {\r\n");
      out.write("\t\t$w.showLoading();\r\n");
      out.write("\t\twindow.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/report/Emitirmapasseparacao?ACAO=gerar&cdsOS=\" + os+\"&expedicao.cdexpedicao=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${expedicao.cdexpedicao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\t$w.hideLoading();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function getCheks(os){\r\n");
      out.write("\t$(\"#listaOrdensservico tbody tr\").each(function() {\r\n");
      out.write("\t\tif($(this).find(\"input[type=checkbox][name$=selecteditens]\").attr(\"checked\")) {\r\n");
      out.write("\t\t\tvar cdordemservico = $w.converterNumeroInt($(this).find(\"input[type=checkbox][name$=selecteditens]\").val());\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tos += cdordemservico + \",\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\treturn os;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function imprimirEtiquetasOS(){\r\n");
      out.write("\t$w.showLoading();\r\n");
      out.write("\twindow.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/report/Emitiretiquetaexpedicao?ACAO=gerar&expedicao.cdexpedicao=\" + form['cdexpedicao'].value;\r\n");
      out.write("\t$w.hideLoading();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function imprimirLiberacaoVeiculo(){\r\n");
      out.write("\t$w.showLoading();\r\n");
      out.write("\twindow.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/report/Emitirliberacaoveiculo?ACAO=gerar&clearFilter=true&cdexpedicao=\" + form['cdexpedicao'].value;\r\n");
      out.write("\t$w.hideLoading();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function imprimirEtiquetasEmbalagem(cdordemservico){\r\n");
      out.write("\t$w.showLoading();\r\n");
      out.write("\twindow.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/report/Emitiretiquetaembalagem?ACAO=gerar&cdordemservico=\" + cdordemservico;\r\n");
      out.write("\t$w.hideLoading();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function imprimirEtiquetas(impressaoOnda){\r\n");
      out.write("\t$w.showLoading();\r\n");
      out.write("\twindow.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/report/Emitiretiquetaprodutoseparacao?ACAO=gerar&expedicao.cdexpedicao=\" + form['cdexpedicao'].value + \"&impressaoOnda=\" + impressaoOnda;\r\n");
      out.write("\t$w.hideLoading();\r\n");
      out.write("}\r\n");
      out.write("function liberarReimpressao(){\r\n");
      out.write("\t$w.showLoading();\r\n");
      out.write("\twindow.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/LiberarReimpressaoEtiqueta?ACAO=indexExpedicao&CODIGO=\" + form['cdexpedicao'].value + \"&TIPOETIQUETA=expedicao\";\r\n");
      out.write("\t$w.hideLoading();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function getOrdensServico(){\r\n");
      out.write("\tvar cdordemsservico = '';\r\n");
      out.write("\t$(\"input[name$=cdordemservico]\").each(function() {\r\n");
      out.write("\t\tcdordemsservico += $(this).val() + ', ';\r\n");
      out.write("\t});\r\n");
      out.write("\tif(cdordemsservico != '')\r\n");
      out.write("\t\tcdordemsservico = cdordemsservico.substring(0, cdordemsservico.length - 2);\r\n");
      out.write("\t\t\r\n");
      out.write("\treturn cdordemsservico;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function openPopUp(ordemservico) {\r\n");
      out.write("\t$w.openPopup(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Lancarcortebox?ACAO=index&cdordemservico=\" + ordemservico, 1010, 670);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function cancelarExpedicao(){\r\n");
      out.write("\t$(\"#confirmacao_usuario\").val(\"\");\r\n");
      out.write("\t$(\"#cancelar-dialog\").dialog(\"open\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function openPopUpFinalizarReabastecimento(ordemservico) {\r\n");
      out.write("\t$w.openPopup(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Gerenciarcarregamento?ordemservico.cdordemservico=\" + ordemservico + \"&ACAO=popUpFinalizarOrdemReabastecimento\", 700, 250);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function doFilter(){\r\n");
      out.write("\trefresh();\r\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("botao");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_set_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_set_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t<div style=\"text-align: right;\">\r\n");
        out.write("\t\t");
        if (_jspx_meth_c_choose_0(_jspx_th_c_set_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t</div>\r\n");
        int evalDoAfterBody = _jspx_th_c_set_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_set_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_set_0);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_when_0(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_otherwise_0(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fromCarregamento}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<a id=\"btn_voltar\" onmouseover=\"Tip('Voltar')\" title=\"\" href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/expedicao/crud/Carregamento\">Retornar à listagem</a>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<a id=\"btn_voltar\" onmouseover=\"Tip('Voltar')\" title=\"\" href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/expedicao/crud/Expedicao\">Retornar à listagem</a>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_t_janelaEntrada_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:janelaEntrada
    br.com.linkcom.neo.view.template.JanelaEntradaTag _jspx_th_t_janelaEntrada_0 = new br.com.linkcom.neo.view.template.JanelaEntradaTag();
    _jspx_th_t_janelaEntrada_0.setJspContext(_jspx_page_context);
    _jspx_th_t_janelaEntrada_0.setParent(_jspx_parent);
    _jspx_th_t_janelaEntrada_0.setJspBody(new gerenciarExpedicao_jspHelper( 2, _jspx_page_context, _jspx_th_t_janelaEntrada_0, null));
    _jspx_th_t_janelaEntrada_0.doTag();
    return false;
  }

  private boolean _jspx_meth_t_tabelaEntrada_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tabelaEntrada
    br.com.linkcom.neo.view.template.TabelaEntradaTag _jspx_th_t_tabelaEntrada_0 = new br.com.linkcom.neo.view.template.TabelaEntradaTag();
    _jspx_th_t_tabelaEntrada_0.setJspContext(_jspx_page_context);
    _jspx_th_t_tabelaEntrada_0.setParent(_jspx_parent);
    _jspx_th_t_tabelaEntrada_0.setColumns(1);
    _jspx_th_t_tabelaEntrada_0.setJspBody(new gerenciarExpedicao_jspHelper( 3, _jspx_page_context, _jspx_th_t_tabelaEntrada_0, null));
    _jspx_th_t_tabelaEntrada_0.doTag();
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
    _jspx_th_n_panelGrid_0.setColumns(new Integer(2));
    _jspx_th_n_panelGrid_0.setJspBody(new gerenciarExpedicao_jspHelper( 4, _jspx_page_context, _jspx_th_n_panelGrid_0, null));
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
    _jspx_th_t_property_0.setName("box");
    _jspx_th_t_property_0.setType(new String("hidden"));
    _jspx_th_t_property_0.setWrite(new Boolean(true));
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
    _jspx_th_t_property_1.setName("box.boxstatus");
    _jspx_th_t_property_1.setType(new String("hidden"));
    _jspx_th_t_property_1.setWrite(new Boolean(true));
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
    _jspx_th_t_property_2.setName("cdexpedicao");
    _jspx_th_t_property_2.setType(new String("hidden"));
    _jspx_th_t_property_2.setWrite(new Boolean(true));
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
    _jspx_th_t_property_3.setName("expedicaostatus");
    _jspx_th_t_property_3.setType(new String("hidden"));
    _jspx_th_t_property_3.setWrite(new Boolean(true));
    _jspx_th_t_property_3.doTag();
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
    _jspx_th_n_panel_0.setDynamicAttribute(null, "style", new String("text-align:center;text-transform: none;font-size: 11px;"));
    _jspx_th_n_panel_0.setJspBody(new gerenciarExpedicao_jspHelper( 5, _jspx_page_context, _jspx_th_n_panel_0, null));
    _jspx_th_n_panel_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_link_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_0 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_0.setJspContext(_jspx_page_context);
    _jspx_th_n_link_0.setParent(_jspx_parent);
    _jspx_th_n_link_0.setUrl("#");
    _jspx_th_n_link_0.setDynamicAttribute(null, "onmouseover", new String("Tip(\"Atualizar\")"));
    _jspx_th_n_link_0.setDynamicAttribute(null, "onclick", new String("javascript:refresh()"));
    _jspx_th_n_link_0.setJspBody(new gerenciarExpedicao_jspHelper( 6, _jspx_page_context, _jspx_th_n_link_0, null));
    _jspx_th_n_link_0.doTag();
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${expedicao.expedicaostatus.cdexpedicaostatus eq 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t&nbsp;|&nbsp;");
        if (_jspx_meth_n_link_1(_jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_n_link_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_1 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_1.setJspContext(_jspx_page_context);
    _jspx_th_n_link_1.setParent(_jspx_th_c_if_0);
    _jspx_th_n_link_1.setUrl("#");
    _jspx_th_n_link_1.setDynamicAttribute(null, "onmouseover", new String("Tip(\"Cancelar\")"));
    _jspx_th_n_link_1.setDynamicAttribute(null, "onclick", new String("javascript:cancelarExpedicao()"));
    _jspx_th_n_link_1.setJspBody(new gerenciarExpedicao_jspHelper( 7, _jspx_page_context, _jspx_th_n_link_1, null));
    _jspx_th_n_link_1.doTag();
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hasOrdemReabastecimento && expedicao.expedicaostatus.cdexpedicaostatus eq 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t&nbsp;|&nbsp;");
        if (_jspx_meth_n_link_2(_jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\r\n");
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

  private boolean _jspx_meth_n_link_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_2 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_2.setJspContext(_jspx_page_context);
    _jspx_th_n_link_2.setParent(_jspx_th_c_if_1);
    _jspx_th_n_link_2.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/logistica/report/OrdemReabastecimentoReport?ACAO=gerar&expedicao.cdexpedicao=${expedicao.cdexpedicao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_n_link_2.setDynamicAttribute(null, "onmouseover", new String("Tip(\"Imprimir ordem de reabastecimento\")"));
    _jspx_th_n_link_2.setJspBody(new gerenciarExpedicao_jspHelper( 8, _jspx_page_context, _jspx_th_n_link_2, null));
    _jspx_th_n_link_2.doTag();
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${expedicao.expedicaostatus.cdexpedicaostatus ne 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t&nbsp;|&nbsp;");
        if (_jspx_meth_n_link_3(_jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\r\n");
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

  private boolean _jspx_meth_n_link_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_3 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_3.setJspContext(_jspx_page_context);
    _jspx_th_n_link_3.setParent(_jspx_th_c_if_2);
    _jspx_th_n_link_3.setUrl("#");
    _jspx_th_n_link_3.setDynamicAttribute(null, "onmouseover", new String("Tip(\"Imprimir documento de liberação de veículos\")"));
    _jspx_th_n_link_3.setDynamicAttribute(null, "onclick", new String("javascript:imprimirLiberacaoVeiculo();"));
    _jspx_th_n_link_3.setJspBody(new gerenciarExpedicao_jspHelper( 9, _jspx_page_context, _jspx_th_n_link_3, null));
    _jspx_th_n_link_3.doTag();
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
    _jspx_th_n_panel_1.setDynamicAttribute(null, "style", new String("text-align:center;text-transform: none;font-size: 11px;"));
    _jspx_th_n_panel_1.setJspBody(new gerenciarExpedicao_jspHelper( 10, _jspx_page_context, _jspx_th_n_panel_1, null));
    _jspx_th_n_panel_1.doTag();
    return false;
  }

  private boolean _jspx_meth_n_link_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_4 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_4.setJspContext(_jspx_page_context);
    _jspx_th_n_link_4.setParent(_jspx_parent);
    _jspx_th_n_link_4.setUrl("#");
    _jspx_th_n_link_4.setDynamicAttribute(null, "onmouseover", new String("Tip(\"Imprimir etiquetas das ordens de serviço\")"));
    _jspx_th_n_link_4.setDynamicAttribute(null, "onclick", new String("javascript:imprimirEtiquetasOS();"));
    _jspx_th_n_link_4.setJspBody(new gerenciarExpedicao_jspHelper( 11, _jspx_page_context, _jspx_th_n_link_4, null));
    _jspx_th_n_link_4.doTag();
    return false;
  }

  private boolean _jspx_meth_n_link_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_5 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_5.setJspContext(_jspx_page_context);
    _jspx_th_n_link_5.setParent(_jspx_parent);
    _jspx_th_n_link_5.setUrl("#");
    _jspx_th_n_link_5.setDynamicAttribute(null, "onmouseover", new String("Tip(\"Imprimir mapas selecionados\")"));
    _jspx_th_n_link_5.setDynamicAttribute(null, "onclick", new String("javascript:imprimirMapasSelecionados();"));
    _jspx_th_n_link_5.setJspBody(new gerenciarExpedicao_jspHelper( 12, _jspx_page_context, _jspx_th_n_link_5, null));
    _jspx_th_n_link_5.doTag();
    return false;
  }

  private boolean _jspx_meth_n_link_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_6 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_6.setJspContext(_jspx_page_context);
    _jspx_th_n_link_6.setParent(_jspx_parent);
    _jspx_th_n_link_6.setUrl("#");
    _jspx_th_n_link_6.setDynamicAttribute(null, "onmouseover", new String("Tip(\"Liberar reimpressão de etiquetas\")"));
    _jspx_th_n_link_6.setDynamicAttribute(null, "onclick", new String("javascript:liberarReimpressao();"));
    _jspx_th_n_link_6.setJspBody(new gerenciarExpedicao_jspHelper( 13, _jspx_page_context, _jspx_th_n_link_6, null));
    _jspx_th_n_link_6.doTag();
    return false;
  }

  private boolean _jspx_meth_w_hasAuthorization_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  w:hasAuthorization
    br.com.linkcom.wms.util.tag.HasAuthorizationTag _jspx_th_w_hasAuthorization_0 = new br.com.linkcom.wms.util.tag.HasAuthorizationTag();
    _jspx_th_w_hasAuthorization_0.setJspContext(_jspx_page_context);
    _jspx_th_w_hasAuthorization_0.setParent(_jspx_parent);
    _jspx_th_w_hasAuthorization_0.setAcao("IMPRIMIR_ETIQUETA_SEPARACAO");
    _jspx_th_w_hasAuthorization_0.setJspBody(new gerenciarExpedicao_jspHelper( 14, _jspx_page_context, _jspx_th_w_hasAuthorization_0, null));
    _jspx_th_w_hasAuthorization_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_link_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_7 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_7.setJspContext(_jspx_page_context);
    _jspx_th_n_link_7.setParent(_jspx_parent);
    _jspx_th_n_link_7.setUrl("#");
    _jspx_th_n_link_7.setDynamicAttribute(null, "onmouseover", new String("Tip(\"Imprimir etiquetas dos produtos\")"));
    _jspx_th_n_link_7.setDynamicAttribute(null, "onclick", new String("javascript:imprimirEtiquetas(false);"));
    _jspx_th_n_link_7.setJspBody(new gerenciarExpedicao_jspHelper( 15, _jspx_page_context, _jspx_th_n_link_7, null));
    _jspx_th_n_link_7.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${GERADO_EM_ONDA}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t&nbsp;|&nbsp;");
        if (_jspx_meth_n_link_8(_jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_n_link_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_8 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_8.setJspContext(_jspx_page_context);
    _jspx_th_n_link_8.setParent(_jspx_th_c_if_3);
    _jspx_th_n_link_8.setUrl("#");
    _jspx_th_n_link_8.setDynamicAttribute(null, "onmouseover", new String("Tip(\"Imprimir etiquetas dos produtos em onda\")"));
    _jspx_th_n_link_8.setDynamicAttribute(null, "onclick", new String("javascript:imprimirEtiquetas(true);"));
    _jspx_th_n_link_8.setJspBody(new gerenciarExpedicao_jspHelper( 16, _jspx_page_context, _jspx_th_n_link_8, null));
    _jspx_th_n_link_8.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_2 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_2.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_2.setParent(_jspx_parent);
    _jspx_th_n_panel_2.setDynamicAttribute(null, "style", new String("text-transform:none;"));
    _jspx_th_n_panel_2.setJspBody(new gerenciarExpedicao_jspHelper( 17, _jspx_page_context, _jspx_th_n_panel_2, null));
    _jspx_th_n_panel_2.doTag();
    return false;
  }

  private boolean _jspx_meth_t_detalhe_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:detalhe
    br.com.linkcom.neo.view.template.DetalheTag _jspx_th_t_detalhe_0 = new br.com.linkcom.neo.view.template.DetalheTag();
    _jspx_th_t_detalhe_0.setJspContext(_jspx_page_context);
    _jspx_th_t_detalhe_0.setParent(_jspx_parent);
    _jspx_th_t_detalhe_0.setName("listaOrdensservico");
    _jspx_th_t_detalhe_0.setShowColunaAcao(new Boolean(false));
    _jspx_th_t_detalhe_0.setShowBotaoRemover(new Boolean(false));
    _jspx_th_t_detalhe_0.setShowBotaoNovaLinha(new Boolean(false));
    _jspx_th_t_detalhe_0.setId("listaOrdensservico");
    _jspx_th_t_detalhe_0.setJspBody(new gerenciarExpedicao_jspHelper( 18, _jspx_page_context, _jspx_th_t_detalhe_0, null));
    _jspx_th_t_detalhe_0.doTag();
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
    _jspx_th_n_column_0.setJspBody(new gerenciarExpedicao_jspHelper( 19, _jspx_page_context, _jspx_th_n_column_0, null));
    _jspx_th_n_column_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_header_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:header
    br.com.linkcom.neo.view.HeaderTag _jspx_th_n_header_0 = new br.com.linkcom.neo.view.HeaderTag();
    _jspx_th_n_header_0.setJspContext(_jspx_page_context);
    _jspx_th_n_header_0.setParent(_jspx_parent);
    _jspx_th_n_header_0.setDynamicAttribute(null, "style", new String("width: 1%; text-align: center;"));
    _jspx_th_n_header_0.setJspBody(new gerenciarExpedicao_jspHelper( 20, _jspx_page_context, _jspx_th_n_header_0, null));
    _jspx_th_n_header_0.doTag();
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
    _jspx_th_n_body_0.setJspBody(new gerenciarExpedicao_jspHelper( 21, _jspx_page_context, _jspx_th_n_body_0, null));
    _jspx_th_n_body_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n:ognl(\"index instanceof java.lang.Number\") && (expedicao.listaOrdensservico[index].ordemtipo.cdordemtipo == 4 || expedicao.listaOrdensservico[index].ordemtipo.cdordemtipo == 5 || expedicao.listaOrdensservico[index].ordemtipo.cdordemtipo == 14 || expedicao.listaOrdensservico[index].ordemtipo.cdordemtipo == 15 || expedicao.listaOrdensservico[index].ordemtipo.cdordemtipo == 16)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_t_property_4(_jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_t_property_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_4 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_4.setJspContext(_jspx_page_context);
    _jspx_th_t_property_4.setParent(_jspx_th_c_if_4);
    _jspx_th_t_property_4.setName("cdordemservico");
    _jspx_th_t_property_4.setType(new String("hidden"));
    _jspx_th_t_property_4.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n:ognl(\"index instanceof java.lang.Number\") && expedicao.listaOrdensservico[index].ordemtipo.cdordemtipo == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<input name=\"selecteditens\" type=\"checkbox\" checked=\"checked\" style=\"border: none;\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${expedicao.listaOrdensservico[index].cdordemservico}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
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
    _jspx_th_n_column_1.setHeader("Tipo de O.S.");
    _jspx_th_n_column_1.setJspBody(new gerenciarExpedicao_jspHelper( 22, _jspx_page_context, _jspx_th_n_column_1, null));
    _jspx_th_n_column_1.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n:ognl(\"index instanceof java.lang.Number\")}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${expedicao.listaOrdensservico[index].ordemtipo.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
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
    _jspx_th_n_column_2.setHeader("Carga / O.S. / Tipo de operação");
    _jspx_th_n_column_2.setJspBody(new gerenciarExpedicao_jspHelper( 23, _jspx_page_context, _jspx_th_n_column_2, null));
    _jspx_th_n_column_2.doTag();
    return false;
  }

  private boolean _jspx_meth_c_choose_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_when_1(_jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_when_2(_jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_1(_jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n:ognl(\"index instanceof java.lang.Number\") && (expedicao.listaOrdensservico[index].ordemtipo.cdordemtipo == 3 || expedicao.listaOrdensservico[index].ordemtipo.cdordemtipo == 6)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${expedicao.listaOrdensservico[index].cdordemservico}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(' ');
        out.write('/');
        out.write(' ');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${expedicao.listaOrdensservico[index].linhaseparacao.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n:ognl(\"index instanceof java.lang.Number\") && (expedicao.listaOrdensservico[index].ordemtipo.cdordemtipo == 4 || expedicao.listaOrdensservico[index].ordemtipo.cdordemtipo == 5 || expedicao.listaOrdensservico[index].ordemtipo.cdordemtipo == 14 || expedicao.listaOrdensservico[index].ordemtipo.cdordemtipo == 15 || expedicao.listaOrdensservico[index].ordemtipo.cdordemtipo == 16 || expedicao.listaOrdensservico[index].ordemtipo.cdordemtipo == 17)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${expedicao.listaOrdensservico[index].carregamento.cdcarregamento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(' ');
        out.write('/');
        out.write(' ');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${expedicao.listaOrdensservico[index].ordemservicoexpedicao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_if_7(_jspx_th_c_otherwise_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_1);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n:ognl(\"index instanceof java.lang.Number\")}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${expedicao.listaOrdensservico[index].cdordemservico}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
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
    _jspx_th_n_column_3.setHeader("Situação");
    _jspx_th_n_column_3.setJspBody(new gerenciarExpedicao_jspHelper( 24, _jspx_page_context, _jspx_th_n_column_3, null));
    _jspx_th_n_column_3.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n:ognl(\"index instanceof java.lang.Number\")}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${expedicao.listaOrdensservico[index].ordemstatus.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
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
    _jspx_th_n_column_4.setHeader("");
    _jspx_th_n_column_4.setJspBody(new gerenciarExpedicao_jspHelper( 25, _jspx_page_context, _jspx_th_n_column_4, null));
    _jspx_th_n_column_4.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n:ognl(\"index instanceof java.lang.Number\")}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_if_10(_jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_if_11(_jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_if_12(_jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_c_if_13(_jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_c_if_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${expedicao.listaOrdensservico[index].ordemtipo.cdordemtipo eq 6 and (expedicao.listaOrdensservico[index].ordemstatus.cdordemstatus == 1 || expedicao.listaOrdensservico[index].ordemstatus.cdordemstatus == 2 || expedicao.listaOrdensservico[index].ordemstatus.cdordemstatus == 6)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t         \t\t\t\t<a onmouseover=\"Tip('Finalizar')\" href=\"#finalizar\" onclick=\"openPopUpFinalizarReabastecimento(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${expedicao.listaOrdensservico[index].cdordemservico}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(")\">Finalizar</a>\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }

  private boolean _jspx_meth_c_if_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${expedicao.listaOrdensservico[index].ordemtipo.cdordemtipo ne 6}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<a href=\"#\" onclick=\"openPopUpDetalhes(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${expedicao.listaOrdensservico[index].cdordemservico}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(")\">Visualizar&nbsp;&nbsp;</a>\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
    return false;
  }

  private boolean _jspx_meth_c_if_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_12.setPageContext(_jspx_page_context);
    _jspx_th_c_if_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_c_if_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(expedicao.listaOrdensservico[index].ordemtipo.cdordemtipo == 5 || expedicao.listaOrdensservico[index].ordemtipo.cdordemtipo == 15)  and (expedicao.listaOrdensservico[index].ordemstatus.cdordemstatus == 1 || expedicao.listaOrdensservico[index].ordemstatus.cdordemstatus == 2 )}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
    if (_jspx_eval_c_if_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<a onmouseover=\"Tip('Cortar')\" href=\"#\" onclick=\"lancarCorte(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${expedicao.listaOrdensservico[index].cdordemservico}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(")\">Cortar&nbsp;&nbsp;</a>\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
    return false;
  }

  private boolean _jspx_meth_c_if_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_13.setPageContext(_jspx_page_context);
    _jspx_th_c_if_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_c_if_13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${expedicao.listaOrdensservico[index].ordemtipo.cdordemtipo == 15  and (expedicao.listaOrdensservico[index].ordemstatus.cdordemstatus == 3 || expedicao.listaOrdensservico[index].ordemstatus.cdordemstatus == 4)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_13 = _jspx_th_c_if_13.doStartTag();
    if (_jspx_eval_c_if_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<a onmouseover=\"Tip('Imprimir etiquetas de embalagens de expedição')\" href=\"#\" onclick=\"imprimirEtiquetasEmbalagem(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${expedicao.listaOrdensservico[index].cdordemservico}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(")\">Imprimir etiquetas&nbsp;&nbsp;</a>\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
    return false;
  }

  private class gerenciarExpedicao_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public gerenciarExpedicao_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public void invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write('\r');
      out.write('\n');
      out.write('	');
      //  n:bean
      br.com.linkcom.neo.view.BeanTag _jspx_th_n_bean_0 = new br.com.linkcom.neo.view.BeanTag();
      _jspx_th_n_bean_0.setJspContext(_jspx_page_context);
      _jspx_th_n_bean_0.setParent(_jspx_parent);
      _jspx_th_n_bean_0.setName("expedicao");
      _jspx_th_n_bean_0.setValueType( Expedicao.class );
      _jspx_th_n_bean_0.setJspBody(new gerenciarExpedicao_jspHelper( 1, _jspx_page_context, _jspx_th_n_bean_0, null));
      _jspx_th_n_bean_0.doTag();
      out.write('\r');
      out.write('\n');
      return;
    }
    public void invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_t_janelaEntrada_0(_jspx_parent, _jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write('	');
      return;
    }
    public boolean invoke2( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_t_tabelaEntrada_0(_jspx_parent, _jspx_page_context))
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
      if (_jspx_meth_n_panelGrid_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_n_panel_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_n_panel_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_n_panel_2(_jspx_parent, _jspx_page_context))
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
      out.write("\t\t\t\t");
      if (_jspx_meth_t_property_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_property_3(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      return false;
    }
    public boolean invoke5( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_link_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_if_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_if_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_if_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t<br><br>\t\t\t\r\n");
      out.write("\t\t\t");
      return false;
    }
    public boolean invoke6( JspWriter out ) 
      throws Throwable
    {
      out.write("Atualizar");
      return false;
    }
    public boolean invoke7( JspWriter out ) 
      throws Throwable
    {
      out.write("Cancelar");
      return false;
    }
    public boolean invoke8( JspWriter out ) 
      throws Throwable
    {
      out.write("Imprimir reabastecimento");
      return false;
    }
    public boolean invoke9( JspWriter out ) 
      throws Throwable
    {
      out.write("Liberação de veículos");
      return false;
    }
    public boolean invoke10( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_link_4(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t&nbsp;|&nbsp;");
      if (_jspx_meth_n_link_5(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t&nbsp;|&nbsp;");
      if (_jspx_meth_n_link_6(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_w_hasAuthorization_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t");
      return false;
    }
    public boolean invoke11( JspWriter out ) 
      throws Throwable
    {
      out.write("Imprimir etiquetas das O.S.");
      return false;
    }
    public boolean invoke12( JspWriter out ) 
      throws Throwable
    {
      out.write("Imprimir mapas");
      return false;
    }
    public boolean invoke13( JspWriter out ) 
      throws Throwable
    {
      out.write("Liberar reimpressão de etiquetas");
      return false;
    }
    public boolean invoke14( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t&nbsp;|&nbsp;");
      if (_jspx_meth_n_link_7(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_if_3(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      return false;
    }
    public boolean invoke15( JspWriter out ) 
      throws Throwable
    {
      out.write("Imprimir etiquetas");
      return false;
    }
    public boolean invoke16( JspWriter out ) 
      throws Throwable
    {
      out.write("Imprimir etiquetas em onda");
      return false;
    }
    public boolean invoke17( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_detalhe_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      return false;
    }
    public boolean invoke18( JspWriter out ) 
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
      out.write("\t\t\t\t");
      return false;
    }
    public boolean invoke19( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_n_header_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_n_body_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      return false;
    }
    public boolean invoke20( JspWriter out ) 
      throws Throwable
    {
      out.write("<input type=\"checkbox\" class=\"checkBoxClass\" name=\"selectAll\" id=\"selectAll\" onclick=\"javascript:$dg.changeCheckState('listaOrdensservico');\" style=\"background-color: #0b8ece;\">");
      return false;
    }
    public boolean invoke21( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_if_4(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_if_5(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke22( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_if_6(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      return false;
    }
    public boolean invoke23( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_choose_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      return false;
    }
    public boolean invoke24( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_if_8(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      return false;
    }
    public boolean invoke25( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_if_9(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
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
          case 12:
            invoke12( out );
            break;
          case 13:
            invoke13( out );
            break;
          case 14:
            invoke14( out );
            break;
          case 15:
            invoke15( out );
            break;
          case 16:
            invoke16( out );
            break;
          case 17:
            invoke17( out );
            break;
          case 18:
            invoke18( out );
            break;
          case 19:
            invoke19( out );
            break;
          case 20:
            invoke20( out );
            break;
          case 21:
            invoke21( out );
            break;
          case 22:
            invoke22( out );
            break;
          case 23:
            invoke23( out );
            break;
          case 24:
            invoke24( out );
            break;
          case 25:
            invoke25( out );
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
