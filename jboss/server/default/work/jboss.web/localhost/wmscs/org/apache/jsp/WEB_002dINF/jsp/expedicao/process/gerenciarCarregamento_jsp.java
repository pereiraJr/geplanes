package org.apache.jsp.WEB_002dINF.jsp.expedicao.process;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.linkcom.wms.util.armazenagem.ConfiguracaoVO;
import br.com.linkcom.wms.geral.service.ConfiguracaoService;

public final class gerenciarCarregamento_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      if (_jspx_meth_t_tela_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\tvar veiculoVazio = false;\r\n");
      out.write("\t\r\n");
      out.write("\t/* Author: Guilherme Oliveira: arantesmaster@gmail.com */\r\n");
      out.write("\t\r\n");
      out.write("\t/* Método chamado quando a página termina de carregar */\r\n");
      out.write("\t$(document).ready(function (){\r\n");
      out.write("\t\tsetTimeout(\"doFilter(false)\", 200);\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t/* Método que desmarca as checkbox */\r\n");
      out.write("\tfunction desmarcarCheck() {\r\n");
      out.write("\t\t$(\"#selectAll\").removeAttr(\"checked\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#carregamento tbody tr\").each(function() {\r\n");
      out.write("    \t\t$(this).find(\"input[type=checkbox][name$=selecteditens]\").attr(\"checked\", false);\r\n");
      out.write("    \t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/* Filtra o DataGrid */\r\n");
      out.write("\tfunction doFilter(isDesmarcar){\r\n");
      out.write("\t\t$('#carregamento tbody').empty();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tform['ACAO'].value = \"getDataGridInfo\";\r\n");
      out.write("\t\tvar carregamentoValue = $(\"#carregamentoId\").val();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$w.showLoading();\r\n");
      out.write("\t\t$w.getJSON(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Gerenciarcarregamento\", {\"ACAO\":\"getDataGridInfo\", \"cdcarregamento\":carregamentoValue}, function(json) {\t\t\t\t\r\n");
      out.write("\t\t\tif(json.lista.length > 0) {\r\n");
      out.write("\t\t\t\tvar i = 0;\r\n");
      out.write("\t\t\t\tvar row = \"\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\tfor(i=0; i< json.lista.length; i++){\r\n");
      out.write("\t\t\t\t\trow += makeRow(i,json.lista[i]);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#carregamento\").empty().append(row);\r\n");
      out.write("\t\t\t\t$(\"#mensagem\").hide();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(isDesmarcar)\r\n");
      out.write("\t\t\t\t\tdesmarcarCheck();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$(\"#carregamento tbody\").empty();\r\n");
      out.write("\t\t\t\t$(\"#mensagem\").show();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$w.hideLoading();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/* Cria a linha do Datagrid */\r\n");
      out.write("\tfunction makeRow(i, obj){\r\n");
      out.write("\t\t/*<th style=\"width:27px\"><input type=\"checkbox\" class=\"checkBoxClass\" name=\"selectAll\" id=\"selectAll\" onclick=\"javascript:$dg.changeCheckState('carregamento');\"/></th>\r\n");
      out.write("\t\t\t\t\t\t<th style=\"width:272px; text-align:left\">Tipo O.S.</th>\r\n");
      out.write("\t\t\t\t\t\t<th style=\"width:285px; text-align:left\">Identificador</th>\r\n");
      out.write("\t\t\t\t\t\t<th style=\"width:271px; text-align:left\">Situação</th>\r\n");
      out.write("\t\t\t\t\t\t<th style=\"width:95px; text-align:left;\">Ação</th>*/\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar menucontent = \"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar row =\"\";\r\n");
      out.write("\t\t//Coloca evento clique duplo\r\n");
      out.write("\t\t if(obj.ordemtipo.cdordemtipo == 5 && \r\n");
      out.write("\t\t   \t\t(obj.ordemstatus.cdordemstatus == 1 || obj.ordemstatus.cdordemstatus == 2 || obj.ordemstatus.cdordemstatus == 3 || obj.ordemstatus.cdordemstatus == 6)) {\r\n");
      out.write("\t\t   \t\t\trow= \"<tr height='13px' class='\"+(i % 2 == 0 ? \"dataGridBody1\" : \"dataGridBody2\")+\"' onDblClick='openPopUp(\"+obj.cdordemservico+\");'>\";\r\n");
      out.write("\t\t   \t}else{\r\n");
      out.write("\t\t\t\tif((form['carregamentostatus.cdcarregamentostatus'].value == 2) || (form['carregamentostatus.cdcarregamentostatus'].value == 3)) {\r\n");
      out.write("\t\t\t\t   if(obj.ordemtipo.cdordemtipo == 3 && !obj.hasReconferencia) {\r\n");
      out.write("\t\t\t\t\trow= \"<tr height='13px' class='\"+(i % 2 == 0 ? \"dataGridBody1\" : \"dataGridBody2\")+\"' onDblClick='openPopUp(\"+obj.cdordemservico+\");'>\";\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\trow= \"<tr height='13px' class='\"+(i % 2 == 0 ? \"dataGridBody1\" : \"dataGridBody2\")+\"' >\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\trow= \"<tr height='13px' class='\"+(i % 2 == 0 ? \"dataGridBody1\" : \"dataGridBody2\")+\"' >\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\trow += \"<td style=\\\"width:27px\\\">\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(obj.ordemtipo.cdordemtipo == 3)\r\n");
      out.write("\t\t\trow +=\"<input class=\\\"checkBoxClass\\\"  type=\\\"checkbox\\\" name=\\\"selecteditens\\\" value=\\\"\" + obj.cdordemservico + \"\\\" checked='checked'>\";\r\n");
      out.write("\t\trow += \" </td>\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\trow += \"<td style=\\\"width:272px; text-align:left\\\"><input type=\\\"hidden\\\" name=\\\"ordemtipo\\\" value=\\\"\" + obj.ordemtipo.cdordemtipo + \"\\\"><span>\" + obj.ordemtipo.nome + \"</span></td>\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\trow += makeIdentificador(obj,285);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\trow += \"<td style=\\\"width:271px; text-align:left\\\"><input type=\\\"hidden\\\" name=\\\"ordemstatus\\\" value=\\\"\" + obj.ordemstatus.cdordemstatus+ \"\\\">\" + obj.ordemstatus.nome + \"</td>\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tmenucontent = \"\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif((form['carregamentostatus.cdcarregamentostatus'].value == 2) || (form['carregamentostatus.cdcarregamentostatus'].value == 3)) {\r\n");
      out.write("\r\n");
      out.write("\t\t   if(obj.ordemtipo.cdordemtipo == 5 && (obj.ordemstatus.cdordemstatus == 1 || obj.ordemstatus.cdordemstatus == 2 || obj.ordemstatus.cdordemstatus == 6) ) {\r\n");
      out.write("\t\t\t\tmenucontent +=\"<a class=\\\"activation\\\" onmouseover=\\\"Tip('Cortar')\\\" href=\\\"#cortar\\\" onclick=\\\"openPopUp(\" + obj.cdordemservico + \")\\\">Cortar&nbsp;&nbsp;</a>\";\r\n");
      out.write("\t\t   } \r\n");
      out.write("\r\n");
      out.write("\t\t   if(obj.ordemtipo.cdordemtipo == 6 && (obj.ordemstatus.cdordemstatus == 1 || obj.ordemstatus.cdordemstatus == 2)) {\r\n");
      out.write("\t\t         menucontent += \"<a class=\\\"activation\\\" onmouseover=\\\"Tip('Finalizar')\\\" href=\\\"#finalizar\\\" onclick=\\\"openPopUpFinalizarReabastecimento(\" + obj.cdordemservico + \")\\\">Finalizar</a>\";\r\n");
      out.write("\t\t   }\r\n");
      out.write("\r\n");
      out.write("\t\t   if(obj.ordemtipo.cdordemtipo == 3 && obj.hasReconferencia)\r\n");
      out.write("\t\t\t\tmenucontent +=\"<a class=\\\"activation\\\" onmouseover=\\\"Tip('Visualizar detalhes')\\\" href=\\\"#visualizar\\\" onclick=\\\"openPopUpDetalhes(\" + obj.cdordemservico + \")\\\">Visualizar&nbsp;&nbsp;</a>\";\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t} else if ((form['carregamentostatus.cdcarregamentostatus'].value == 4 || form['carregamentostatus.cdcarregamentostatus'].value == 6) && obj.ordemtipo.cdordemtipo == 3){\r\n");
      out.write("\t\t\t\tmenucontent +=\"<a class=\\\"activation\\\" onmouseover=\\\"Tip('Visualizar detalhes')\\\" href=\\\"#visualizar\\\" onclick=\\\"openPopUpDetalhes(\" + obj.cdordemservico + \")\\\">Visualizar&nbsp;&nbsp;</a><br>\";\r\n");
      out.write("\t\t} \r\n");
      out.write("\t\tif(((form['carregamentostatus.cdcarregamentostatus'].value == 4 && obj.hasItensFaturadosOutraFilia) || \r\n");
      out.write("\t\t   form['carregamentostatus.cdcarregamentostatus'].value == 2 || form['carregamentostatus.cdcarregamentostatus'].value == 3) && \r\n");
      out.write("\t\t   obj.ordemtipo.cdordemtipo == 3 && (!obj.hasReconferencia || obj.hasItensFaturadosOutraFilia)) \r\n");
      out.write("\t\t\tmenucontent +=\"<a onmouseover=\\\"Tip('Cortar')\\\" href=\\\"#\\\" onclick=\\\"openPopUp(\" + obj.cdordemservico + \")\\\">Cortar&nbsp;&nbsp;</a>\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t   if((form['carregamentostatus.cdcarregamentostatus'].value != 7) &&\r\n");
      out.write("\t   \t\t(obj.ordemtipo.cdordemtipo == 4 || obj.ordemtipo.cdordemtipo == 5 || obj.ordemtipo.cdordemtipo == 14)) {\r\n");
      out.write("\t\t\tmenucontent +=\"<a class=\\\"activation\\\" onmouseover=\\\"Tip('Visualizar detalhes')\\\" href=\\\"#visualizar\\\" onclick=\\\"openPopUpDetalhes(\" + obj.cdordemservico + \")\\\">Visualizar&nbsp;&nbsp;</a>\";\r\n");
      out.write("\t   } \r\n");
      out.write("\r\n");
      out.write("\t\trow +=\"<td style=\\\"width:95px; text-align:left\\\">\"+menucontent+\"</td>\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\trow += \"</tr>\";\r\n");
      out.write("\t\treturn row;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/* Cria a coluna da ordem de serviço */\r\n");
      out.write("\tfunction makeIdentificador(obj,size) {\r\n");
      out.write("\t\tvar row = \"\";\r\n");
      out.write("\t\tvar ordemtipoValue = obj.ordemtipo.cdordemtipo;\r\n");
      out.write("\t\tvar mapa = \"Sem linha de separação.\";\r\n");
      out.write("\t\tvar exibirLinha = ");
      out.print( ConfiguracaoService.getInstance().isTrue(ConfiguracaoVO.MAPA_IGNORA_LINHA, null) ? "false" : "true" );
      out.write(";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif((ordemtipoValue == 3) || (ordemtipoValue == 6)) {\r\n");
      out.write("\t\t\tif(obj.linhaseparacao) {\r\n");
      out.write("\t\t\t\tif (exibirLinha)\r\n");
      out.write("\t\t\t\t\tmapa = obj.cdordemservico + \" - \" + obj.linhaseparacao.nome;\r\n");
      out.write("\t\t\t\telse\r\n");
      out.write("\t\t\t\t\tmapa = obj.cdordemservico;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\trow += \"<td style=\\\"width:\" + size + \"px; text-align:left\\\">\" + mapa + \"</td>\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t} else if((ordemtipoValue == 4) || (ordemtipoValue == 5) || (ordemtipoValue == 14)) {\r\n");
      out.write("\t\t\tif(!obj.clienteExpedicao || obj.clienteExpedicao == null){\r\n");
      out.write("\t\t\t\tvar tp = \"\";\r\n");
      out.write("\t\t\t\tif(obj.tipooperacao && obj.tipooperacao != null)\r\n");
      out.write("\t\t\t\t\ttp = \" - \" + obj.tipooperacao.nome;\r\n");
      out.write("\t\t\t\trow += \"<td style=\\\"width:\"+size+\"px; text-align:left\\\">\" + obj.cdordemservico + tp + \"</td>\";\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tvar tp = \"\";\r\n");
      out.write("\t\t\t\tif(obj.tipooperacao && obj.tipooperacao != null)\r\n");
      out.write("\t\t\t\t\ttp = obj.tipooperacao.nome.charAt(0);;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\trow += \"<td style=\\\"width:\"+size+\"px; text-align:left\\\">\" + obj.cdordemservico + \" - \" + tp + \" - \" + obj.clienteExpedicao.nome + \"</td>\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn row;\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/* Limpa os formulários do filtro, e limpa a tabela. */\r\n");
      out.write("\tfunction clearFilter(){\r\n");
      out.write("\t\t$w.clearForm(\"form\");\r\n");
      out.write("\t\t$('#carregamento tbody').empty();\r\n");
      out.write("\t\t$(\"#mensagem\").show();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// ------------------------------------------------ Funcao Corte ------------------------------------------------  \r\n");
      out.write("\t/* Método que abre uma popup de lançar corte */\r\n");
      out.write("\tfunction openPopUp(ordemservico) {\r\n");
      out.write("\t\t$w.openPopup(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Lancarcorte?cdordemservico=\" + ordemservico + \"&isGerenciarcarregamento=true\", 1010, 670);\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// ------------------------------------------------ Funcao Corte ------------------------------------------------  \r\n");
      out.write("\t/* Método que abre uma popup de lançar corte */\r\n");
      out.write("\tfunction openPopUpDetalhes(ordemservico) {\r\n");
      out.write("\t\t$w.openPopup(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Visualizardetalhes?cdordemservico=\" + ordemservico + \"&isGerenciarcarregamento=true\", 1000, 600);\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction openPopUpFinalizarReabastecimento(ordemservico) {\r\n");
      out.write("\t\t$w.openPopup(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Gerenciarcarregamento?ordemservico.cdordemservico=\" + ordemservico + \"&ACAO=popUpFinalizarOrdemReabastecimento\", 700, 250);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/* \r\n");
      out.write("\t * Método que recarrega o dados de um determinado carregamento.\r\n");
      out.write("     * Este método é chamado da tela de lançar corte pelo método salvarDados.\r\n");
      out.write("     * \t\r\n");
      out.write("\t */\r\n");
      out.write("\tfunction recarregarGerenciamentocarregamento(cdcarregamento) {\r\n");
      out.write("\t\tdocument.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Gerenciarcarregamento?cdcarregamento=\" + cdcarregamento;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// ------------------------------------------------ Funcao Finalizar Carregamento ------------------------------------------------\r\n");
      out.write("\tfunction finalizarCarregamento() {\r\n");
      out.write("\t\tvar carregamentostatus = $(\"#cdcarregamentostatusId\").val();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(carregamentostatus == 4) {\r\n");
      out.write("\t\t\talert(\"Este carregamento já se encontra finalizado.\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\tvar cdordemstatus = null;\r\n");
      out.write("\t\tvar cdordemtipo = null;\r\n");
      out.write("\t\tvar isTodosMapasFinalizados = true;\r\n");
      out.write("\t\tvar isTodosReabastecimentosFinalizados = true;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#carregamento tbody tr\").each(function() {\t\t\t\t\r\n");
      out.write("\t\t\tcdordemtipo = $w.converterNumeroInt($(this).find(\"input[type=hidden][name$=ordemtipo]\").val());\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(cdordemtipo == 3) {\t\t\t\t\r\n");
      out.write("\t\t\t\tcdordemstatus = $w.converterNumeroInt($(this).find(\"input[type=hidden][name$=ordemstatus]\").val());\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif((cdordemstatus != 3) && (cdordemstatus != 4)) {\r\n");
      out.write("\t\t\t\t\tisTodosMapasFinalizados = false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\t\t\t\t\r\n");
      out.write("\t\t\tif(cdordemtipo == 6) {\t\t\t\t\r\n");
      out.write("\t\t\t\tcdordemstatus = $w.converterNumeroInt($(this).find(\"input[type=hidden][name$=ordemstatus]\").val());\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif((cdordemstatus != 3) && (cdordemstatus != 4)) {\r\n");
      out.write("\t\t\t\t\tisTodosReabastecimentosFinalizados = false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\t\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\tif(!isTodosMapasFinalizados) {\r\n");
      out.write("\t\t\talert(\"Somente quando todos os mapas de separação estiverem finalizados será possível encerrar o carregamento.\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t} else if(!isTodosReabastecimentosFinalizados) {\r\n");
      out.write("\t\t\talert(\"Somente quando todos os reabastecimentos de picking estiverem finalizados será possível encerrar o carregamento.\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t} \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t$(\"#finalizar-dialog\").dialog(\"destroy\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar veiculo = $(\"#veiculo\").val();\r\n");
      out.write("\t\tvar altura = 0;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif (veiculo != \"<null>\" && veiculo != \"\"){\r\n");
      out.write("\t\t\t$(\"#group-veiculo\").hide();\r\n");
      out.write("\t\t\taltura = 50;\r\n");
      out.write("\t\t\tveiculoVazio = false;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(\"#group-veiculo\").show();\r\n");
      out.write("\t\t\taltura = 250;\r\n");
      out.write("\t\t\tveiculoVazio = true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#finalizar-dialog\").dialog({\r\n");
      out.write("\t\t\tautoOpen: true,\r\n");
      out.write("\t\t\theight: altura,\r\n");
      out.write("\t\t\twidth: 380,\r\n");
      out.write("\t\t\tmodal: true,\r\n");
      out.write("\t\t\topen: function(event, ui) { \r\n");
      out.write("\t\t\t\t\t//hide close button.\r\n");
      out.write("\t\t\t\t\t$(this).parent().children().children('.ui-dialog-titlebar-close').hide();\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\tbuttons: {\r\n");
      out.write("\t\t\t\t'Cancelar': function() {\r\n");
      out.write("\t\t\t\t\t$(\"#finalizar-dialog\").dialog('close');\r\n");
      out.write("\t\t\t\t\tif (veiculoVazio){\r\n");
      out.write("\t\t\t\t\t\t$(\"#veiculo\").val(\"<null>\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#transportador\").val(\"<null>\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t'Ok': function() {\r\n");
      out.write("\t\t\t\t\t$w.showLoading();\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif ($(\"#veiculo\").val() == \"\" || $(\"#veiculo\").val() == \"<null>\"){\r\n");
      out.write("\t\t\t\t\t\talert(\"O campo Veículo é obrigatório.\");\r\n");
      out.write("\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar query = {\"ACAO\" : \"finalizarCarregamento\",\r\n");
      out.write("\t\t\t\t                 \"cdcarregamento\" : $(\"#carregamentoId\").val(),\r\n");
      out.write("\t\t\t\t                 \"veiculo\" : $(\"#veiculo\").val()};\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t$w.getJSON(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Gerenciarcarregamento\", query, function(json) {\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tif(json.msgError != \"\") {\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t$w.hideLoading();\r\n");
      out.write("\t\t\t\t\t\t\t$w.showAlertMessage(json.msgError, 50000, false);\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\tvar carregamentostatus = json.carregamentoStatus;\r\n");
      out.write("\t\t\t\t\t\t\tif((carregamentostatus != null) && (carregamentostatus.cdcarregamentostatus == 4))\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#carregamentostatusId\").val(\"br.com.linkcom.wms.geral.bean.Carregamentostatus[cdcarregamentostatus=\" + carregamentostatus.cdcarregamentostatus + \"]\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#carregamentostatus_value\").text(carregamentostatus.nome);\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t//doFilter(false);\r\n");
      out.write("\t\t\t\t\t\t\t\tdocument.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/crud/Carregamento\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$w.hideLoading();\r\n");
      out.write("\t\t\t\t\t$(\"#finalizar-dialog\").dialog('close');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// ------------------------------------------------ Funcao Baixar Mapas Selecionados ------------------------------------------------\r\n");
      out.write("\tfunction baixarMapasSelecionados() {\r\n");
      out.write("\t\tvar os = \"\";\r\n");
      out.write("\t\tvar tabu = \"\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#carregamento tbody tr\").each(function() {\t\t\t\r\n");
      out.write("\t\t\tif($(this).find(\"input[type=checkbox][name$=selecteditens]\").attr(\"checked\")) {\r\n");
      out.write("\t\t\t\tvar cdordemservico = $w.converterNumeroInt($(this).find(\"input[type=checkbox][name$=selecteditens]\").val());\r\n");
      out.write("\t\t\t\tvar cdordemtipo = $w.converterNumeroInt($(this).find(\"input[type=hidden][name$=ordemtipo]\").val());\r\n");
      out.write("\t\t\t\tvar cdordemstatus = $w.converterNumeroInt($(this).find(\"input[type=hidden][name$=ordemstatus]\").val());\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(((cdordemstatus == 1) || (cdordemstatus ==2)) && (cdordemtipo == 3)) {\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tos += cdordemservico + \",\";\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t} else if((cdordemstatus == 3) || (cdordemstatus == 4)) {\r\n");
      out.write("\t\t\t\t\ttabu += cdordemstatus + \",\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif((os == \"\") && (tabu == \"\")) {\r\n");
      out.write("\t\t\talert(\"Nenhum mapa foi selecionado\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t} else if((os == \"\") && (tabu != \"\")) {\r\n");
      out.write("\t\t\talert(\"O(s) mapa(s) selecionado(s) já foi(ram) finalizado(s).\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tif(confirm(\"Confirma a baixa do(s) mapa(s) selecionado(s)?\")) {\r\n");
      out.write("\t\t\t\t/*$w.showLoading();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar query = {\"ACAO\" : \"baixarMapasselecionados\",\r\n");
      out.write("\t\t\t\t\t\t\t \"cdcarregamento\" : $(\"#carregamentoId\").val(),\r\n");
      out.write("\t\t\t                 \"listaOs\" : os};\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t    $w.getJSON(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Gerenciarcarregamento\", query, function(json) {\r\n");
      out.write("\t\t\t    \tdoFilter(true);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$w.hideLoading();\r\n");
      out.write("\t\t\t\t*/\r\n");
      out.write("\t\t\t\t$w.openPopup(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Gerenciarcarregamento?listaOs=\" + os + \"&ACAO=popUpBaixarMapaSelecionado&cdcarregamento=\"+$(\"#carregamentoId\").val()+\"\", 700, 400);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t// ------------------------------------------------ Imprimir Mapas Selecionados ------------------------------------------------\r\n");
      out.write("\tfunction imprimirMapasSelecionados() {\r\n");
      out.write("\t\tvar os = \"\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tos = getCheks(os); \r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(os == \"\")\r\n");
      out.write("\t\t\talert(\"Nenhum mapa foi selecionado\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\telse {\r\n");
      out.write("\t\t\t$w.showLoading();\r\n");
      out.write("\t\t\twindow.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/report/Emitirmapasseparacao?ACAO=gerar&cdsOS=\" + os + \"&carregamento.cdcarregamento=\" + ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.cdcarregamento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\t\t\t$w.hideLoading();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction imprimirEtiquetas(){\r\n");
      out.write("\t\t\t$w.showLoading();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar cdcarregamento = $(\"#carregamentoId\").val();\t\t\t\r\n");
      out.write("\t\t\twindow.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/report/Emitiretiquetaprodutoseparacao?ACAO=gerar&carregamento.cdcarregamento=\" + cdcarregamento;\r\n");
      out.write("\t\t\t$w.hideLoading();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction liberarReimpressao(){\r\n");
      out.write("\t\t$w.showLoading();\r\n");
      out.write("\t\tvar cdcarregamento = $(\"#carregamentoId\").val();\r\n");
      out.write("\t\twindow.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/LiberarReimpressaoEtiqueta?ACAO=indexCarregamento&CODIGO=\" + cdcarregamento + \"&TIPOETIQUETA=carregamento\";\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t$w.hideLoading();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction callCancelar(){\r\n");
      out.write("\t\twindow.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/CancelarCarregamento?ACAO=index&cdcarregamento=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.cdcarregamento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getCheks(os){\r\n");
      out.write("\t\t$(\"#carregamento tbody tr\").each(function() {\r\n");
      out.write("\t\t\tif($(this).find(\"input[type=checkbox][name$=selecteditens]\").attr(\"checked\")) {\r\n");
      out.write("\t\t\t\tvar cdordemservico = $w.converterNumeroInt($(this).find(\"input[type=checkbox][name$=selecteditens]\").val());\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tos += cdordemservico + \",\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn os;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/* Atualiza o combo de box */\r\n");
      out.write("\tfunction atualizarComboBox(transportadorCombo){\r\n");
      out.write("\t\tvar somenteDisponiveis = false;\r\n");
      out.write("\t\tvar transportador = $(transportadorCombo).val();\r\n");
      out.write("\t\tif(transportador == \"<null>\")\r\n");
      out.write("\t\t\tsomenteDisponiveis = true;\r\n");
      out.write("\t\t$w.showLoading();\r\n");
      out.write("\t\t$w.getJSON(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Carregamento\", \r\n");
      out.write("\t\t\t{ACAO:'comboBox','transportador':transportador,\"somenteDisponiveis\":somenteDisponiveis}\r\n");
      out.write("\t\t,function(json){\r\n");
      out.write("\t\t\t$('#veiculo').removeOption(/./);\r\n");
      out.write("\t\t\tvar i= 0;\r\n");
      out.write("\t\t\t$('#veiculo').addOption(\"<null>\",\" \");\r\n");
      out.write("\t\t\tfor(i=0; i< json.lista.length; i++){\r\n");
      out.write("\t\t\t\t$('#veiculo').addOption(\"br.com.linkcom.wms.geral.bean.Veiculo[cdveiculo=\"+json.lista[i].cdveiculo+\"]\",json.lista[i].placa,false);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$w.hideLoading();\r\n");
      out.write("\t\t});\r\n");
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
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_c_choose_0(_jspx_th_c_set_0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
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
        out.write("\t\t");
        if (_jspx_meth_c_when_0(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_c_otherwise_0(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty cdbox}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<div style=\"text-align: right;\"><a id=\"btn_voltar\" onmouseover=\"Tip('Voltar')\" title=\"\" href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/expedicao/crud/Carregamentoexpedicao?cdbox=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cdbox}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">Retornar à listagem</a></div>\r\n");
        out.write("\t\t");
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
        out.write("\t\t\t<div style=\"text-align: right;\"><a id=\"btn_voltar\" onmouseover=\"Tip('Voltar')\" title=\"\" href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/expedicao/crud/Carregamento\">Retornar à listagem</a></div>\r\n");
        out.write("\t\t");
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

  private boolean _jspx_meth_t_tela_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tela
    br.com.linkcom.neo.view.template.TelaTag _jspx_th_t_tela_0 = new br.com.linkcom.neo.view.template.TelaTag();
    _jspx_th_t_tela_0.setJspContext(_jspx_page_context);
    _jspx_th_t_tela_0.setTitulo((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("Gerenciar carregamento ${param.cdcarregamento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_t_tela_0.setDynamicAttribute(null, "botoes", (java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${botao}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_t_tela_0.setJspBody(new gerenciarCarregamento_jspHelper( 0, _jspx_page_context, _jspx_th_t_tela_0, null));
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
    _jspx_th_n_bean_0.setName("carregamento");
    _jspx_th_n_bean_0.setJspBody(new gerenciarCarregamento_jspHelper( 1, _jspx_page_context, _jspx_th_n_bean_0, null));
    _jspx_th_n_bean_0.doTag();
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
    _jspx_th_n_panelGrid_0.setJspBody(new gerenciarCarregamento_jspHelper( 2, _jspx_page_context, _jspx_th_n_panelGrid_0, null));
    _jspx_th_n_panelGrid_0.doTag();
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
    _jspx_th_n_panel_0.setColspan(new Integer(2));
    _jspx_th_n_panel_0.setDynamicAttribute(null, "style", new String("font-family:tahoma;font-size:13px;"));
    _jspx_th_n_panel_0.setJspBody(new gerenciarCarregamento_jspHelper( 3, _jspx_page_context, _jspx_th_n_panel_0, null));
    _jspx_th_n_panel_0.doTag();
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
    _jspx_th_n_panel_1.setColspan(new Integer(2));
    _jspx_th_n_panel_1.setJspBody(new gerenciarCarregamento_jspHelper( 4, _jspx_page_context, _jspx_th_n_panel_1, null));
    _jspx_th_n_panel_1.doTag();
    return false;
  }

  private boolean _jspx_meth_n_group_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:group
    br.com.linkcom.neo.view.GroupTag _jspx_th_n_group_0 = new br.com.linkcom.neo.view.GroupTag();
    _jspx_th_n_group_0.setJspContext(_jspx_page_context);
    _jspx_th_n_group_0.setParent(_jspx_parent);
    _jspx_th_n_group_0.setLegend("Dados do veículo");
    _jspx_th_n_group_0.setColumns(2);
    _jspx_th_n_group_0.setDynamicAttribute(null, "id", new String("group-veiculo"));
    _jspx_th_n_group_0.setJspBody(new gerenciarCarregamento_jspHelper( 5, _jspx_page_context, _jspx_th_n_group_0, null));
    _jspx_th_n_group_0.doTag();
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
    _jspx_th_t_property_0.setName("veiculo.transportador");
    _jspx_th_t_property_0.setId("transportador");
    _jspx_th_t_property_0.setMode("input");
    _jspx_th_t_property_0.setRenderAs("double");
    _jspx_th_t_property_0.setDynamicAttribute(null, "style", new String("width:230px;"));
    _jspx_th_t_property_0.setLabelStyle("font-family:tahoma;font-size:13px;");
    _jspx_th_t_property_0.setDynamicAttribute(null, "onchange", new String("atualizarComboBox(this);"));
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
    _jspx_th_t_property_1.setName("veiculo");
    _jspx_th_t_property_1.setId("veiculo");
    _jspx_th_t_property_1.setMode("input");
    _jspx_th_t_property_1.setRenderAs("double");
    _jspx_th_t_property_1.setDynamicAttribute(null, "class", new String("required"));
    _jspx_th_t_property_1.setLabelStyle("font-family:tahoma;font-size:13px;");
    _jspx_th_t_property_1.setItens((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${VEICULOS}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_t_property_1.doTag();
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
    _jspx_th_t_propertyConfig_0.setJspBody(new gerenciarCarregamento_jspHelper( 6, _jspx_page_context, _jspx_th_t_propertyConfig_0, null));
    _jspx_th_t_propertyConfig_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panelGrid_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panelGrid
    br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_1 = new br.com.linkcom.neo.view.PanelGridTag();
    _jspx_th_n_panelGrid_1.setJspContext(_jspx_page_context);
    _jspx_th_n_panelGrid_1.setParent(_jspx_parent);
    _jspx_th_n_panelGrid_1.setColumns(new Integer(2));
    _jspx_th_n_panelGrid_1.setStyle("width: 270px;");
    _jspx_th_n_panelGrid_1.setJspBody(new gerenciarCarregamento_jspHelper( 7, _jspx_page_context, _jspx_th_n_panelGrid_1, null));
    _jspx_th_n_panelGrid_1.doTag();
    return false;
  }

  private boolean _jspx_meth_t_propertyConfig_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:propertyConfig
    br.com.linkcom.neo.view.template.PropertyConfigTag _jspx_th_t_propertyConfig_1 = new br.com.linkcom.neo.view.template.PropertyConfigTag();
    _jspx_th_t_propertyConfig_1.setJspContext(_jspx_page_context);
    _jspx_th_t_propertyConfig_1.setParent(_jspx_parent);
    _jspx_th_t_propertyConfig_1.setRenderAs("double");
    _jspx_th_t_propertyConfig_1.setJspBody(new gerenciarCarregamento_jspHelper( 8, _jspx_page_context, _jspx_th_t_propertyConfig_1, null));
    _jspx_th_t_propertyConfig_1.doTag();
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
    _jspx_th_t_property_2.setName("cdcarregamento");
    _jspx_th_t_property_2.setId("carregamentoId");
    _jspx_th_t_property_2.setDynamicAttribute(null, "style", new String("width: 200px;"));
    _jspx_th_t_property_2.setLabel("Carregamento");
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
    _jspx_th_t_property_3.setName("box");
    _jspx_th_t_property_3.setId("boxid");
    _jspx_th_t_property_3.setDynamicAttribute(null, "style", new String("width: 200px;"));
    _jspx_th_t_property_3.setType(new String("hidden"));
    _jspx_th_t_property_3.setWrite(new Boolean(true));
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
    _jspx_th_t_property_4.setName("carregamentostatus");
    _jspx_th_t_property_4.setId("carregamentostatusId");
    _jspx_th_t_property_4.setDynamicAttribute(null, "style", new String("width: 200px;"));
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
    _jspx_th_t_property_5.setName("carregamentostatus.cdcarregamentostatus");
    _jspx_th_t_property_5.setLabel(" ");
    _jspx_th_t_property_5.setId("cdcarregamentostatusId");
    _jspx_th_t_property_5.setDynamicAttribute(null, "style", new String("width: 200px;"));
    _jspx_th_t_property_5.setType(new String("hidden"));
    _jspx_th_t_property_5.setWrite(new Boolean(false));
    _jspx_th_t_property_5.doTag();
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
    _jspx_th_n_link_0.setDynamicAttribute(null, "onmouseover", new String("Tip(\"Filtrar\")"));
    _jspx_th_n_link_0.setDynamicAttribute(null, "onclick", new String("javascript:doFilter();"));
    _jspx_th_n_link_0.setJspBody(new gerenciarCarregamento_jspHelper( 9, _jspx_page_context, _jspx_th_n_link_0, null));
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${carregamento.carregamentostatus.cdcarregamentostatus != 7 && carregamento.carregamentostatus.cdcarregamentostatus != 6 && carregamento.carregamentostatus.cdcarregamentostatus != 4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t&nbsp;|&nbsp;<span><a class=\"activation\" onmouseover=\"Tip('Cancelar')\" href=\"#\" onclick='callCancelar()'>Cancelar</a></span>\r\n");
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

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty hasOrdemReabastecimento && carregamento.carregamentostatus.cdcarregamentostatus != 7}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t&nbsp;|&nbsp;<span id=\"imprimirEtiquetas\">");
        if (_jspx_meth_n_link_1(_jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("&nbsp;&nbsp;</span>\r\n");
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

  private boolean _jspx_meth_n_link_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_1 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_1.setJspContext(_jspx_page_context);
    _jspx_th_n_link_1.setParent(_jspx_th_c_if_1);
    _jspx_th_n_link_1.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/logistica/report/OrdemReabastecimentoReport?ACAO=gerar&carregamento.cdcarregamento=${param.cdcarregamento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_n_link_1.setDynamicAttribute(null, "onmouseover", new String("Tip(\"Imprimir ordem de reabastecimento\")"));
    _jspx_th_n_link_1.setJspBody(new gerenciarCarregamento_jspHelper( 10, _jspx_page_context, _jspx_th_n_link_1, null));
    _jspx_th_n_link_1.doTag();
    return false;
  }

  private boolean _jspx_meth_n_link_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_2 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_2.setJspContext(_jspx_page_context);
    _jspx_th_n_link_2.setParent(_jspx_parent);
    _jspx_th_n_link_2.setUrl("#");
    _jspx_th_n_link_2.setDynamicAttribute(null, "onmouseover", new String("Tip(\"Liberar reimpressão de etiquetas\")"));
    _jspx_th_n_link_2.setDynamicAttribute(null, "onclick", new String("javascript:liberarReimpressao();"));
    _jspx_th_n_link_2.setJspBody(new gerenciarCarregamento_jspHelper( 11, _jspx_page_context, _jspx_th_n_link_2, null));
    _jspx_th_n_link_2.doTag();
    return false;
  }

  private boolean _jspx_meth_n_link_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_3 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_3.setJspContext(_jspx_page_context);
    _jspx_th_n_link_3.setParent(_jspx_parent);
    _jspx_th_n_link_3.setUrl("#");
    _jspx_th_n_link_3.setDynamicAttribute(null, "onmouseover", new String("Tip(\"Imprimir etiquetas\")"));
    _jspx_th_n_link_3.setDynamicAttribute(null, "onclick", new String("javascript:imprimirEtiquetas();"));
    _jspx_th_n_link_3.setJspBody(new gerenciarCarregamento_jspHelper( 12, _jspx_page_context, _jspx_th_n_link_3, null));
    _jspx_th_n_link_3.doTag();
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
    _jspx_th_n_link_4.setDynamicAttribute(null, "onmouseover", new String("Tip(\"Imprimir mapas selecionados\")"));
    _jspx_th_n_link_4.setDynamicAttribute(null, "onclick", new String("javascript:imprimirMapasSelecionados();"));
    _jspx_th_n_link_4.setJspBody(new gerenciarCarregamento_jspHelper( 13, _jspx_page_context, _jspx_th_n_link_4, null));
    _jspx_th_n_link_4.doTag();
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${carregamento.carregamentostatus.cdcarregamentostatus != 4 && carregamento.carregamentostatus.cdcarregamentostatus != 7 && carregamento.carregamentostatus.cdcarregamentostatus != 6}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t&nbsp;|&nbsp;<span id=\"baixarmapasselecionados\">");
        if (_jspx_meth_n_link_5(_jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("</span>\r\n");
        out.write("\t\t\t\t\t&nbsp;|&nbsp;<span id=\"finalizarmapa\">");
        if (_jspx_meth_n_link_6(_jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("&nbsp;&nbsp;</span>\r\n");
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

  private boolean _jspx_meth_n_link_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_5 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_5.setJspContext(_jspx_page_context);
    _jspx_th_n_link_5.setParent(_jspx_th_c_if_2);
    _jspx_th_n_link_5.setUrl("#");
    _jspx_th_n_link_5.setDynamicAttribute(null, "onmouseover", new String("Tip(\"Baixar mapas selecionados\")"));
    _jspx_th_n_link_5.setDynamicAttribute(null, "onclick", new String("javascript:baixarMapasSelecionados();"));
    _jspx_th_n_link_5.setJspBody(new gerenciarCarregamento_jspHelper( 14, _jspx_page_context, _jspx_th_n_link_5, null));
    _jspx_th_n_link_5.doTag();
    return false;
  }

  private boolean _jspx_meth_n_link_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_6 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_6.setJspContext(_jspx_page_context);
    _jspx_th_n_link_6.setParent(_jspx_th_c_if_2);
    _jspx_th_n_link_6.setUrl("#");
    _jspx_th_n_link_6.setDynamicAttribute(null, "onmouseover", new String("Tip(\"Finalizar carregamento\")"));
    _jspx_th_n_link_6.setDynamicAttribute(null, "onclick", new String("javascript:finalizarCarregamento();"));
    _jspx_th_n_link_6.setJspBody(new gerenciarCarregamento_jspHelper( 15, _jspx_page_context, _jspx_th_n_link_6, null));
    _jspx_th_n_link_6.doTag();
    return false;
  }

  private class gerenciarCarregamento_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public gerenciarCarregamento_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\t\r\n");
      out.write("\t");
      if (_jspx_meth_n_bean_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write('\r');
      out.write('\n');
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t<div id=\"finalizar-dialog\" style=\"display:none;\" title=\"Finalizar carregamento\">\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_n_panelGrid_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      if (_jspx_meth_t_propertyConfig_0(_jspx_parent, _jspx_page_context))
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
      out.write("\t\t\t\t");
      if (_jspx_meth_n_panel_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_panel_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_group_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      return false;
    }
    public boolean invoke3( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\tO carregamento será finalizado, deseja continuar?\r\n");
      out.write("\t\t\t\t");
      return false;
    }
    public boolean invoke4( JspWriter out ) 
      throws Throwable
    {
      out.write("&nbsp;");
      return false;
    }
    public boolean invoke5( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_t_property_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_t_property_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      return false;
    }
    public boolean invoke6( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_n_panelGrid_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div align=\"center\" style=\"padding-top: 7px\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_link_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_if_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_if_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t&nbsp;|&nbsp;<span id=\"imprimirEtiquetas\">");
      if (_jspx_meth_n_link_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("</span>\r\n");
      out.write("\t\t\t\t&nbsp;|&nbsp;<span id=\"imprimirEtiquetas\">");
      if (_jspx_meth_n_link_3(_jspx_parent, _jspx_page_context))
        return true;
      out.write("</span>\r\n");
      out.write("\t\t\t\t&nbsp;|&nbsp;<span id=\"imprimirmapasselecionados\">");
      if (_jspx_meth_n_link_4(_jspx_parent, _jspx_page_context))
        return true;
      out.write("</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_if_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<table id=\"tableheader\" style=\"width:950px;\">\r\n");
      out.write("\t\t\t\t<thead class=\"tituloTabela\">\r\n");
      out.write("\t\t\t\t\t<tr id =\"0\">\r\n");
      out.write("\t\t\t\t\t\t<th style=\"width:27px\"><input type=\"checkbox\" class=\"checkBoxClass\" name=\"selectAll\" id=\"selectAll\" onclick=\"javascript:$dg.changeCheckState('carregamento');\"/></th>\r\n");
      out.write("\t\t\t\t\t\t<th style=\"width:272px; text-align:left\">Tipo O.S.</th>\r\n");
      out.write("\t\t\t\t\t\t<th style=\"width:285px; text-align:left\">Identificador</th>\r\n");
      out.write("\t\t\t\t\t\t<th style=\"width:271px; text-align:left\">Situação</th>\r\n");
      out.write("\t\t\t\t\t\t<th style=\"width:95px; text-align:left;\">Ação</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"scrollArea\" >\r\n");
      out.write("\t\t\t\t<table id=\"carregamento\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"width:950px;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"mensagem\">Nenhum resultado encontrado.</div>\r\n");
      out.write("\t\t");
      return false;
    }
    public boolean invoke7( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_propertyConfig_1(_jspx_parent, _jspx_page_context))
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
      if (_jspx_meth_t_property_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_t_property_3(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_t_property_4(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_t_property_5(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      return false;
    }
    public boolean invoke9( JspWriter out ) 
      throws Throwable
    {
      out.write("Atualizar");
      return false;
    }
    public boolean invoke10( JspWriter out ) 
      throws Throwable
    {
      out.write("Imprimir ordem de reabastecimento");
      return false;
    }
    public boolean invoke11( JspWriter out ) 
      throws Throwable
    {
      out.write("Liberar reimpressão de etiquetas");
      return false;
    }
    public boolean invoke12( JspWriter out ) 
      throws Throwable
    {
      out.write("Imprimir etiquetas");
      return false;
    }
    public boolean invoke13( JspWriter out ) 
      throws Throwable
    {
      out.write("Imprimir mapas");
      return false;
    }
    public boolean invoke14( JspWriter out ) 
      throws Throwable
    {
      out.write("Baixar mapas");
      return false;
    }
    public boolean invoke15( JspWriter out ) 
      throws Throwable
    {
      out.write("Finalizar carregamento");
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
