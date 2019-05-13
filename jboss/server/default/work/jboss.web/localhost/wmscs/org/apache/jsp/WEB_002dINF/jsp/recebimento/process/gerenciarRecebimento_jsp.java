package org.apache.jsp.WEB_002dINF.jsp.recebimento.process;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.linkcom.wms.geral.bean.Ordemservico;
import br.com.linkcom.wms.geral.bean.Ordemtipo;

public final class gerenciarRecebimento_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      //  t:tela
      br.com.linkcom.neo.view.template.TelaTag _jspx_th_t_tela_0 = new br.com.linkcom.neo.view.template.TelaTag();
      _jspx_th_t_tela_0.setJspContext(_jspx_page_context);
      _jspx_th_t_tela_0.setTitulo("Gerenciar recebimento");
      _jspx_th_t_tela_0.setDynamicAttribute(null, "botoes", (java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${botao}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      _jspx_th_t_tela_0.setJspBody(new gerenciarRecebimento_jspHelper( 0, _jspx_page_context, _jspx_th_t_tela_0, null));
      _jspx_th_t_tela_0.doTag();
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("function openPopUpFinalizarEnderecamento(ordemservico) {\r\n");
      out.write("\tvar ordensSelecionadas = findOrdensTipoEnderecamentoSelecionadas(ordemservico);\r\n");
      out.write("\tif(ordemservico != ordensSelecionadas)\r\n");
      out.write("\t\tif(!confirm('Os dados informados serão válidos para todas as ordens de endereçamento selecionadas. Deseja continuar?'))\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t$w.openPopup(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/recebimento/process/GerenciarRecebimento?ordemservico.cdordemservico=\" + ordemservico + \"&cdsordensservicos=\"+ordensSelecionadas+\"&ACAO=popUpFinalizarOrdemEndereco\", 700, 250);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function findOrdensTipoEnderecamentoSelecionadas(ordemservico){\r\n");
      out.write("\tvar cds = ordemservico;\r\n");
      out.write("\tvar achou = false;\r\n");
      out.write("\t$('input[type=checkbox]:checked').each(function(){\r\n");
      out.write("\t\tif(ordemservico == $(this).val())\r\n");
      out.write("\t\t\tachou = true;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\tif(ordemservico != $(this).val() && \r\n");
      out.write("\t\t  ($(this).attr('ordemTipo') == 8 || $(this).attr('ordemTipo') == 9 || $(this).attr('ordemTipo') == 10) && \r\n");
      out.write("\t\t  ($(this).attr('ordemStatus') == 1 || $(this).attr('ordemStatus') == 2))\r\n");
      out.write("\t\t\tcds += ', '+$(this).val();\r\n");
      out.write("\t});\r\n");
      out.write("\tif(!achou) return ordemservico;\r\n");
      out.write("\treturn cds;\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function imprimirArmazenagem(){\r\n");
      out.write("\tvar cdOs = \"\";\r\n");
      out.write("\tvar checados = 0;\r\n");
      out.write("\t$(\"input[name=selecteditens]:checked\").each(function(){\r\n");
      out.write("\t\tif($(this).attr(\"ordemTipo\") > 7 && $(this).attr(\"ordemTipo\") < 11)\r\n");
      out.write("\t\t\tcdOs += $(this).val() +',';\r\n");
      out.write("\t\tchecados++;\r\n");
      out.write("\t});\r\n");
      out.write("\tif(checados == 0){\r\n");
      out.write("\t\talert(\"Nenhuma ordem de serviço foi selecionada.\");\r\n");
      out.write("\t}else if(cdOs == \"\"){\r\n");
      out.write("\t\talert(\"Favor selecionar somente ordens de serviço do tipo Endereçamento avariado, Endereçamento fracionado ou Endereçamento UMA.\")\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tform['ACAO'].value = \"gerar\";\r\n");
      out.write("\t\tform.action = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/logistica/report/OrdemRecebimentoReport?recebimento.cdrecebimento=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.recebimento.cdrecebimento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("&cdOs='+cdOs;\r\n");
      out.write("\t\tform.validate = 'false';\r\n");
      out.write("\t\tsubmitForm();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function tipoEnderecamento(tipo){\r\n");
      out.write("\tvar str = \"\";\r\n");
      out.write("\tif(tipo == \"2\"){\r\n");
      out.write("\t\tstr = \"automático\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse{\r\n");
      out.write("\t\tstr = \"manual\";\r\n");
      out.write("\t}\r\n");
      out.write("\tif(confirm(\"Deseja definir o tipo de endereçamento como \"+str+\"?\")){\r\n");
      out.write("\t\tvar gerarUMA = \"false\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(tipo == \"3\"){\r\n");
      out.write("\t\t\tif (confirm(\"Deseja gerar as etiquetas UMA?\")){\r\n");
      out.write("\t\t\t\tgerarUMA = \"true\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$w.showLoading();\r\n");
      out.write("\t\t$('div.tipEnderecamento').block({ message: null });\r\n");
      out.write("\t\t/*if(tipo == \"2\"){\r\n");
      out.write("\t\t\t$(\"#tipoEnderecamento\").html(\"Automático\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse{\r\n");
      out.write("\t\t\t$(\"#tipoEnderecamento\").html(\"Manual\");\r\n");
      out.write("\t\t}*/\r\n");
      out.write("\t\t$w.getJSON(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/recebimento/process/GerenciarRecebimento\",{\"ACAO\":\"enderecar\",\"cdtipoenderecamento\":tipo, \"gerarUMA\":gerarUMA, \"recebimento\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.recebimento.cdrecebimento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"},\r\n");
      out.write("\t\tfunction(json){\r\n");
      out.write("\t\t\tif(json.msgm == \"\"){\r\n");
      out.write("\t\t\t\tatualizar();\r\n");
      out.write("//\t\t\t\t$(\"#tipoEnderecamento\").hide();\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$w.hideLoading();\r\n");
      out.write("\t\t\t\tif(confirm(json.msgm+' Deseja imprimir o relatório?')){\r\n");
      out.write("\t\t\t\t\twindow.location = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/recebimento/report/DadoslogisticosfaltantesReport?ACAO=gerar&recebimento.cdrecebimento='+");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.recebimento.cdrecebimento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t$('div.tipEnderecamento').unblock({ message: null });\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function listarConferencia(cdrecebimento,cdordemservico){\r\n");
      out.write("\t$w.openPopup(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/popup/Conferencia?recebimento.cdrecebimento=\" + cdrecebimento + \"&ordemservico.cdordemservico=\" + cdordemservico + \"&listaOs=0\", 1000, 700);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Filtra o DataGrid */\r\n");
      out.write("function rejeitarRecebimento(cdrecebimento,btn) {\r\n");
      out.write("\t\r\n");
      out.write("\tif(cdrecebimento == \"\") {\r\n");
      out.write("\t\talert(\"Coloque um recebimento válido.\");\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(confirm(\"Confirma a devolução do recebimento \" + cdrecebimento + \"?\\nAs notas fiscais serão devolvidas ao ERP.\")) {\r\n");
      out.write("\t\tvar param = [{name:'ACAO',value:'rejeitar'},{name:'cdrecebimento',value:cdrecebimento}];\r\n");
      out.write("\t\t\t$w.showLoading();\r\n");
      out.write("\t\t\t$w.getJSON(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/recebimento/crud/Recebimento\", param, function(json) {\r\n");
      out.write("\t\t\t\tif(!json.updated){\r\n");
      out.write("\t\t\t\t\talert(\"Erro ao atualizar o recebimento\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tform['ACAO'].value = \"listagem\";\r\n");
      out.write("\t\t\t\t\tform.action = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/recebimento/crud/Recebimento';\r\n");
      out.write("\t\t\t\t\tform.validate = 'false';\r\n");
      out.write("\t\t\t\t\tsubmitForm();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$w.hideLoading();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function finalizarRecebimento(cdrecebimento){\r\n");
      out.write("\tif(cdrecebimento == \"\") {\r\n");
      out.write("\t\talert(\"Coloque um recebimento válido.\");\r\n");
      out.write("\t\treturn;\r\n");
      out.write("\t}\r\n");
      out.write("\tvar param = [{name:'ACAO',value:'finalizarRecebimento'},{name:'cdrecebimento',value:cdrecebimento},{name:'resposta',value:false}];\r\n");
      out.write("\t$w.showLoading();\r\n");
      out.write("\t$w.getJSON(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/recebimento/process/GerenciarRecebimento\", param, function(json) {\r\n");
      out.write("\t\tif (json.erro){\r\n");
      out.write("\t\t\talert(json.erro);\r\n");
      out.write("\t\t}else if(!json.updated){\r\n");
      out.write("\t\t\tif(json.confirmation){\r\n");
      out.write("\t\t\t\tif(confirm(json.confirmation)){\r\n");
      out.write("\t\t\t\t\tparam[2] = {name:'resposta',value:true};\r\n");
      out.write("\t\t\t\t\t$w.getJSON(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/recebimento/process/GerenciarRecebimento\", param, function(json) {\r\n");
      out.write("\t\t\t\t\t\tif(!json.updated){\r\n");
      out.write("\t\t\t\t\t\t\talert(\"Erro ao atualizar o recebimento\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\telse{\r\n");
      out.write("\t\t\t\t\t\t\tatualizar();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}else\r\n");
      out.write("\t\t\t\talert(\"Erro ao atualizar o recebimento\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tatualizar();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$w.hideLoading();\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function cancelarRecebimento(cdrecebimento,btn) {\r\n");
      out.write("\t\r\n");
      out.write("\tif(confirm(\"Confirma o cancelamento do recebimento \" + cdrecebimento +\"?\\nAs notas fiscais serão novamente disponibilizadas no sistema.\")) {\r\n");
      out.write("\t\tvar param = [{name:'ACAO',value:'cancelarRecebimento'},{name:'cdrecebimento',value:cdrecebimento}];\r\n");
      out.write("\t\t\t$w.showLoading();\r\n");
      out.write("\t\t\t$w.getJSON(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/recebimento/crud/Recebimento\", param, function(json) {\r\n");
      out.write("\t\t\t\tif(!json.updated){\r\n");
      out.write("\t\t\t\t\talert(\"Erro ao atualizar o recebimento\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tatualizar();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$w.hideLoading();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function atualizar(){\r\n");
      out.write("\tform['ACAO'].value = \"gerenciar\";\r\n");
      out.write("\tform.action = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/recebimento/process/GerenciarRecebimento?recebimento.cdrecebimento=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.recebimento.cdrecebimento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\tform.validate = 'false';\r\n");
      out.write("\tsubmitForm();\r\n");
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
        out.write("\t<div style=\"text-align: right;\"><a id=\"btn_voltar\" onmouseover=\"Tip('Voltar')\" title=\"\" href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/recebimento/crud/Recebimento\">Retornar à listagem</a></div>\r\n");
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

  private boolean _jspx_meth_n_panelGrid_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panelGrid
    br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_0 = new br.com.linkcom.neo.view.PanelGridTag();
    _jspx_th_n_panelGrid_0.setJspContext(_jspx_page_context);
    _jspx_th_n_panelGrid_0.setParent(_jspx_parent);
    _jspx_th_n_panelGrid_0.setColumns(new Integer(4));
    _jspx_th_n_panelGrid_0.setColumnStyleClasses("labelColumn,propertyColumn");
    _jspx_th_n_panelGrid_0.setPropertyRenderAsDouble(new Boolean(true));
    _jspx_th_n_panelGrid_0.setJspBody(new gerenciarRecebimento_jspHelper( 2, _jspx_page_context, _jspx_th_n_panelGrid_0, null));
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
    _jspx_th_t_property_0.setName("recebimento");
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
    _jspx_th_t_property_1.setName("recebimento.listaRecebimentoNF[0].notafiscalentrada.transportador");
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
    _jspx_th_t_property_2.setName("recebimento.recebimentostatus");
    _jspx_th_t_property_2.setLabel("Situação");
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
    _jspx_th_t_property_3.setName("recebimento.dtfinalizacao");
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
    _jspx_th_t_property_4.setName("recebimento.listaRecebimentoNF[0].notafiscalentrada.veiculo");
    _jspx_th_t_property_4.setType(new String("hidden"));
    _jspx_th_t_property_4.setWrite(new Boolean(true));
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
    _jspx_th_t_property_5.setName("recebimento.usuariofinalizacao.nome");
    _jspx_th_t_property_5.setLabel("Finalizado por");
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
    _jspx_th_t_property_6.setName("recebimento.box");
    _jspx_th_t_property_6.setType(new String("hidden"));
    _jspx_th_t_property_6.setWrite(new Boolean(true));
    _jspx_th_t_property_6.doTag();
    return false;
  }

  private boolean _jspx_meth_c_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_when_0(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_otherwise_0(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      throw new SkipPageException();
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(!existeReconferenciaAberta) && (empty filtro.recebimento.tipoenderecamento || filtro.recebimento.tipoenderecamento.cdtipoenderecamento == 1) && (filtro.recebimento.recebimentostatus.cdrecebimentostatus == 1 || filtro.recebimento.recebimentostatus.cdrecebimentostatus == 2 || filtro.recebimento.recebimentostatus.cdrecebimentostatus == 3 || filtro.recebimento.recebimentostatus.cdrecebimentostatus == 4)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_n_panel_0(_jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_n_panel_1(_jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_n_panel_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_0 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_0.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_0.setParent(_jspx_th_c_when_0);
    _jspx_th_n_panel_0.setJspBody(new gerenciarRecebimento_jspHelper( 3, _jspx_page_context, _jspx_th_n_panel_0, null));
    _jspx_th_n_panel_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_1 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_1.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_1.setParent(_jspx_th_c_when_0);
    _jspx_th_n_panel_1.setId("tipoEnderecamento");
    _jspx_th_n_panel_1.setJspBody(new gerenciarRecebimento_jspHelper( 4, _jspx_page_context, _jspx_th_n_panel_1, null));
    _jspx_th_n_panel_1.doTag();
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
        out.write("\t\t\t\t\t");
        if (_jspx_meth_t_property_7(_jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_t_property_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_7 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_7.setJspContext(_jspx_page_context);
    _jspx_th_t_property_7.setParent(_jspx_th_c_otherwise_0);
    _jspx_th_t_property_7.setName("recebimento.tipoenderecamento");
    _jspx_th_t_property_7.setType(new String("hidden"));
    _jspx_th_t_property_7.setWrite(new Boolean(true));
    _jspx_th_t_property_7.doTag();
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ARMAZENAGEM}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<a href=\"#\" onclick=\"imprimirArmazenagem()\" onmouseover='javascript:Tip(\"Imprimir ordem de armazenagem do recebimento  ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.recebimento.cdrecebimento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\")'>Imprimir ordem de armazenagem</a>&nbsp;&nbsp;|&nbsp;&nbsp;\r\n");
        out.write("\t\t\t");
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

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(filtro.recebimento.tipoenderecamento.cdtipoenderecamento ne 1 and HAVEUMA)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<a href=\"#\" onmouseover='javascript:Tip(\"Imprimir etiquetas de UMA do recebimento  ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.recebimento.cdrecebimento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\")' onclick=\"javascript: form.ACAO.value='gerar';form.action='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/logistica/report/Emitiretiquetauma?ACAO=gerar&recebimento.cdrecebimento=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.recebimento.cdrecebimento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("';submitForm()\">Imprimir etiquetas de UMA</a>&nbsp;&nbsp;|&nbsp;&nbsp;\r\n");
        out.write("\t\t\t");
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.recebimento.recebimentostatus.cdrecebimentostatus == 1 || filtro.recebimento.recebimentostatus.cdrecebimentostatus == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t&nbsp;&nbsp;|&nbsp;&nbsp;<a href='#' onmouseover='javascript:Tip(\"Devolver recebimento ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.recebimento.cdrecebimento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\")' onclick=\"javascript:rejeitarRecebimento(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.recebimento.cdrecebimento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(",this)\">Devolver</a>\r\n");
        out.write("\t\t\t");
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

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.recebimento.recebimentostatus.cdrecebimentostatus == 1 || filtro.recebimento.recebimentostatus.cdrecebimentostatus == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t&nbsp;&nbsp;|&nbsp;&nbsp;<a href='#' onmouseover='javascript:Tip(\"Cancelar recebimento ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.recebimento.cdrecebimento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\")' onclick=\"javascript:cancelarRecebimento(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.recebimento.cdrecebimento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(",this)\">Cancelar</a>\r\n");
        out.write("\t\t\t");
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

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.recebimento.recebimentostatus.cdrecebimentostatus == 2 && ORDEM}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t&nbsp;&nbsp;|&nbsp;&nbsp;<a href='#' onmouseover='javascript:Tip(\"Finalizar conferência ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.recebimento.cdrecebimento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\")' onclick=\"javascript:finalizarRecebimento(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.recebimento.cdrecebimento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(")\">Finalizar conferência</a>\r\n");
        out.write("\t\t\t");
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

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.recebimento.recebimentostatus.cdrecebimentostatus == 7}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t&nbsp;&nbsp;|&nbsp;&nbsp;<a href='#' onmouseover='javascript:Tip(\"Cancelar endereçamento\")' onclick=\"javascript: if(confirm('Tem certeza que deseja cancelar o endereçamento?')){ form.ACAO.value='cancelarEnderecamento';form.action='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/recebimento/process/GerenciarRecebimento?recebimento.cdrecebimento=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.recebimento.cdrecebimento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("';submitForm();}\">Cancelar endereçamento</a>\r\n");
        out.write("\t\t\t");
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

  private boolean _jspx_meth_n_column_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:column
    br.com.linkcom.neo.view.ColumnTag _jspx_th_n_column_0 = new br.com.linkcom.neo.view.ColumnTag();
    _jspx_th_n_column_0.setJspContext(_jspx_page_context);
    _jspx_th_n_column_0.setParent(_jspx_parent);
    _jspx_th_n_column_0.setJspBody(new gerenciarRecebimento_jspHelper( 6, _jspx_page_context, _jspx_th_n_column_0, null));
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
    _jspx_th_n_header_0.setDynamicAttribute(null, "style", new String("width:10px"));
    _jspx_th_n_header_0.setJspBody(new gerenciarRecebimento_jspHelper( 7, _jspx_page_context, _jspx_th_n_header_0, null));
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
    _jspx_th_n_body_0.setJspBody(new gerenciarRecebimento_jspHelper( 8, _jspx_page_context, _jspx_th_n_body_0, null));
    _jspx_th_n_body_0.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_8 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_8.setJspContext(_jspx_page_context);
    _jspx_th_t_property_8.setParent(_jspx_parent);
    _jspx_th_t_property_8.setName("ordemtipo");
    _jspx_th_t_property_8.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_9 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_9.setJspContext(_jspx_page_context);
    _jspx_th_t_property_9.setParent(_jspx_parent);
    _jspx_th_t_property_9.setName("cdordemservico");
    _jspx_th_t_property_9.setLabel("Identificador");
    _jspx_th_t_property_9.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_10 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_10.setJspContext(_jspx_page_context);
    _jspx_th_t_property_10.setParent(_jspx_parent);
    _jspx_th_t_property_10.setName("ordemstatus");
    _jspx_th_t_property_10.setLabel("Situação");
    _jspx_th_t_property_10.doTag();
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
    _jspx_th_n_column_1.setHeader(" ");
    _jspx_th_n_column_1.setJspBody(new gerenciarRecebimento_jspHelper( 9, _jspx_page_context, _jspx_th_n_column_1, null));
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
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(os.ordemtipo.cdordemtipo == 8 || os.ordemtipo.cdordemtipo == 9 || os.ordemtipo.cdordemtipo == 10) && (os.ordemstatus.cdordemstatus == 1) && (filtro.recebimento.tipoenderecamento.cdtipoenderecamento == 2)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_n_link_0(_jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("&nbsp;&nbsp;&nbsp;\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_n_link_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_0 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_0.setJspContext(_jspx_page_context);
    _jspx_th_n_link_0.setParent(_jspx_th_c_if_6);
    _jspx_th_n_link_0.setUrl("/recebimento/process/EditarEnderecamento");
    _jspx_th_n_link_0.setParameters((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("ordemservico.cdordemservico=${os.cdordemservico}&ordemservico.recebimento.cdrecebimento=${filtro.recebimento.cdrecebimento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_n_link_0.setJspBody(new gerenciarRecebimento_jspHelper( 10, _jspx_page_context, _jspx_th_n_link_0, null));
    _jspx_th_n_link_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(os.ordemtipo.cdordemtipo == 8 || os.ordemtipo.cdordemtipo == 9 || os.ordemtipo.cdordemtipo == 10) && (os.ordemstatus.cdordemstatus==1 || os.ordemstatus.cdordemstatus==2) && (filtro.recebimento.tipoenderecamento.cdtipoenderecamento == 2)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<a href=\"#\" onclick=\"openPopUpFinalizarEnderecamento(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${os.cdordemservico}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(")\">Finalizar</a>\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_c_if_8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(os.ordemtipo.cdordemtipo == 8 || os.ordemtipo.cdordemtipo == 9 || os.ordemtipo.cdordemtipo == 10) && (os.ordemstatus.cdordemstatus == 1 || os.ordemstatus.cdordemstatus == 2) && (filtro.recebimento.tipoenderecamento.cdtipoenderecamento == 3)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_n_link_1(_jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("&nbsp;&nbsp;&nbsp;\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_n_link_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_1 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_1.setJspContext(_jspx_page_context);
    _jspx_th_n_link_1.setParent(_jspx_th_c_if_8);
    _jspx_th_n_link_1.setUrl("/recebimento/process/EditarEnderecamento");
    _jspx_th_n_link_1.setParameters((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("ordemservico.cdordemservico=${os.cdordemservico}&ordemservico.recebimento.cdrecebimento=${filtro.recebimento.cdrecebimento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_n_link_1.setJspBody(new gerenciarRecebimento_jspHelper( 11, _jspx_page_context, _jspx_th_n_link_1, null));
    _jspx_th_n_link_1.doTag();
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
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(os.ordemtipo.cdordemtipo == 8 || os.ordemtipo.cdordemtipo == 9 || os.ordemtipo.cdordemtipo == 10) && (os.ordemstatus.cdordemstatus==3 || os.ordemstatus.cdordemstatus==4 || os.ordemstatus.cdordemstatus==6)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_n_link_2(_jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_n_link_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_2 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_2.setJspContext(_jspx_page_context);
    _jspx_th_n_link_2.setParent(_jspx_th_c_if_9);
    _jspx_th_n_link_2.setUrl("/recebimento/process/VisualizarEnderecamento");
    _jspx_th_n_link_2.setParameters((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("ordemservico.cdordemservico=${os.cdordemservico}&ordemservico.recebimento.cdrecebimento=${filtro.recebimento.cdrecebimento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_n_link_2.setJspBody(new gerenciarRecebimento_jspHelper( 12, _jspx_page_context, _jspx_th_n_link_2, null));
    _jspx_th_n_link_2.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(os.ordemtipo.cdordemtipo == 1 || os.ordemtipo.cdordemtipo == 2) && (os.ordemstatus.cdordemstatus==2 || os.ordemstatus.cdordemstatus==3 || os.ordemstatus.cdordemstatus==4 || os.ordemstatus.cdordemstatus==6)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<a href=\"#\" onclick=\"listarConferencia(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.recebimento.cdrecebimento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(',');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${os.cdordemservico}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(")\">Visualizar</a>\r\n");
        out.write("\t\t\t\t");
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

  private class gerenciarRecebimento_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public gerenciarRecebimento_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
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
      _jspx_th_n_bean_0.setName("filtro");
      _jspx_th_n_bean_0.setJspBody(new gerenciarRecebimento_jspHelper( 1, _jspx_page_context, _jspx_th_n_bean_0, null));
      _jspx_th_n_bean_0.doTag();
      out.write('\r');
      out.write('\n');
      return;
    }
    public void invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_n_panelGrid_0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div align=\"center\" style=\"padding-top: 20px\">\r\n");
      out.write("\t\t\t<a href=\"#\" onclick=\"atualizar()\" onmouseover='javascript:Tip(\"Atualizar dados do recebimento  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.recebimento.cdrecebimento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\")'>Atualizar</a>&nbsp;&nbsp;|&nbsp;&nbsp;\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_1(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<a href='#' onmouseover='javascript:Tip(\"Emitir etiquetas dos produtos do recebimento  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.recebimento.cdrecebimento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\")' onclick=\"javascript: form.ACAO.value='gerar';form.action='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/recebimento/report/Emitiretiquetaproduto?ACAO=gerar&recebimento.cdrecebimento=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.recebimento.cdrecebimento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("';submitForm()\">Imprimir etiquetas dos produtos</a>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_2(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_3(_jspx_parent, _jspx_page_context))
        return;
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_4(_jspx_parent, _jspx_page_context))
        return;
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_5(_jspx_parent, _jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      //  n:dataGrid
      br.com.linkcom.neo.view.DataGridTag _jspx_th_n_dataGrid_0 = new br.com.linkcom.neo.view.DataGridTag();
      _jspx_th_n_dataGrid_0.setJspContext(_jspx_page_context);
      _jspx_th_n_dataGrid_0.setParent(_jspx_parent);
      _jspx_th_n_dataGrid_0.setItens((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.listaOrdemServico}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      _jspx_th_n_dataGrid_0.setId("tabelaOs");
      _jspx_th_n_dataGrid_0.setVar("os");
      _jspx_th_n_dataGrid_0.setStyle("padding-top: 10px");
      _jspx_th_n_dataGrid_0.setItemType(Ordemservico.class );
      _jspx_th_n_dataGrid_0.setJspBody(new gerenciarRecebimento_jspHelper( 5, _jspx_page_context, _jspx_th_n_dataGrid_0, null));
      _jspx_th_n_dataGrid_0.doTag();
      out.write('\r');
      out.write('\n');
      out.write('	');
      return;
    }
    public boolean invoke2( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_t_property_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_t_property_1(_jspx_parent, _jspx_page_context))
        return true;
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
      if (_jspx_meth_t_property_4(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_t_property_5(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_t_property_6(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_choose_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t");
      return false;
    }
    public boolean invoke3( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\tTipo de endereçamento\r\n");
      out.write("\t\t\t\t\t");
      return false;
    }
    public boolean invoke4( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"tipEnderecamento\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" onclick=\"tipoEnderecamento(2)\">Automático</a>&nbsp;&nbsp;&nbsp;<a href=\"#\" onclick=\"tipoEnderecamento(3)\">Manual</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t");
      return false;
    }
    public void invoke5( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_n_column_0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_t_property_8(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_t_property_9(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_t_property_10(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_n_column_1(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      return;
    }
    public boolean invoke6( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_header_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_body_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      return false;
    }
    public boolean invoke7( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" class=\"checkBoxClass\" name=\"selectAll\" id=\"selectAll\" onclick=\"javascript:$dg.changeCheckState('tabelaOs')\">\r\n");
      out.write("\t\t\t\t");
      return false;
    }
    public boolean invoke8( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t<input name=\"selecteditens\" ordemTipo=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${os.ordemtipo.cdordemtipo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" ordemStatus=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${os.ordemstatus.cdordemstatus}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"checkbox\" class=\"checkBoxClass\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${os.cdordemservico}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t");
      return false;
    }
    public boolean invoke9( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_if_6(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_if_7(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_if_8(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_if_9(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_if_10(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      return false;
    }
    public boolean invoke10( JspWriter out ) 
      throws Throwable
    {
      out.write("Editar");
      return false;
    }
    public boolean invoke11( JspWriter out ) 
      throws Throwable
    {
      out.write("Finalizar");
      return false;
    }
    public boolean invoke12( JspWriter out ) 
      throws Throwable
    {
      out.write("Visualizar");
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
