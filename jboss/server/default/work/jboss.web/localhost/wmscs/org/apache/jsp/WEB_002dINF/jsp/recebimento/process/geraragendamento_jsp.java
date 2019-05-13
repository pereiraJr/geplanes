package org.apache.jsp.WEB_002dINF.jsp.recebimento.process;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.linkcom.wms.geral.bean.Pedidocompra;
import br.com.linkcom.wms.geral.bean.Agenda;

public final class geraragendamento_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/classes/META-INF/neo.tld");
    _jspx_dependants.add("/WEB-INF/classes/META-INF/template.tld");
    _jspx_dependants.add("/WEB-INF/tld/wms.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var.release();
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
      _jspx_th_t_tela_0.setTitulo("Gerar agendamento");
      _jspx_th_t_tela_0.setDynamicAttribute(null, "botoes", (java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${botao}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      _jspx_th_t_tela_0.setJspBody(new geraragendamento_jspHelper( 0, _jspx_page_context, _jspx_th_t_tela_0, null));
      _jspx_th_t_tela_0.doTag();
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t\r\n");
      out.write("\tvar agendamentos = \"\";\r\n");
      out.write("\tvar agendamentosParciais = \"\";\r\n");
      out.write("\tvar valorAtual = \"\";\r\n");
      out.write("\tvar abas = 0;\r\n");
      out.write("\tvar depositoComboString = 'br.com.linkcom.wms.geral.bean.Deposito[cddeposito=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${DEPOSITO_LOGADO.cddeposito}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("]';\r\n");
      out.write("\t\r\n");
      out.write("\tfunction afterClearFilter(){\r\n");
      out.write("\t\tform['deposito'].value = depositoComboString;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction selectAllParcial(check){\r\n");
      out.write("\t\t$(\"input[type=checkbox][name=checkparcial]\").each(\r\n");
      out.write("\t\tfunction(){\r\n");
      out.write("\t\t\tif(!$(this).attr(\"disabled\")){\r\n");
      out.write("\t\t\t\tif($(check).attr(\"checked\")){\r\n");
      out.write("\t\t\t\t\t$(this).removeAttr(\"checked\");\r\n");
      out.write("\t\t\t\t\t$(this).click();\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$(this).attr(\"checked\",\"checked\");\r\n");
      out.write("\t\t\t\t\t$(this).click();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//Encontra os checks selecionados e manda carregalos\r\n");
      out.write("\tfunction gerarAgendamento(){\r\n");
      out.write("\t\tvar checks = new Array();\r\n");
      out.write("\t\tchecks = $dg.getSelectedValues();\r\n");
      out.write("\t\tagendamentos = checks;\r\n");
      out.write("\t\tif(checks != \"\"){\r\n");
      out.write("\t\t\tdadosAgendamento(checks);\r\n");
      out.write("\t\t\tdadosAgendamentoEntrada();\t\t\t\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\talert(\"É necessário escolher pelo menos um pedido de compra.\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t//Carrega os dados do agendamento\r\n");
      out.write("\tfunction dadosAgendamento(checks){\r\n");
      out.write("\t\t$w.getJSON(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/recebimento/process/Agendamento\",\r\n");
      out.write("\t\t\t\t{'ACAO':'getPedidosCompra','checks':checks},\r\n");
      out.write("\t\t\t\tfunction(json){\r\n");
      out.write("\t\t\t\t\tif(json.listaagendamento.length > 0) {\r\n");
      out.write("\t\t\t\t\t\tvar i = 0;\r\n");
      out.write("\t\t\t\t\t\tvar row = \"\";\r\n");
      out.write("\t\t\t\t\t\tfor(i=0; i< json.listaagendamento.length; i++){\r\n");
      out.write("\t\t\t\t\t\t\trow += makeRow(i,json.listaagendamento[i].cdpedidocompra,json.listaagendamento[i].numero,json.listaParcial[i]);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t$(\"#pedidoscompra tbody\").empty().append(row);\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t$(\"#pedidoscompra tbody\").empty();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tverificaChecks();\r\n");
      out.write("\t\t\t\t\t$w.hideLoading();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//Entrada da parte de dados do agendamento\r\n");
      out.write("\tfunction dadosAgendamentoEntrada(){\r\n");
      out.write("\t\t$(\"#consultaAgendamento\").fadeOut(function(){\r\n");
      out.write("\t\t\t\t$(\"#dadosAgendamento\").fadeIn();\r\n");
      out.write("\t\t\t\t$(\"#retornar\").fadeIn();\r\n");
      out.write("\t\t\t\t$(\"#registros\").hide();\r\n");
      out.write("\t\t\t\t$(\"select[name = tipocarga]\").removeAttr(\"disabled\");\r\n");
      out.write("\t\t\t\t$(\"input[name = dtagenda]\").removeAttr(\"disabled\");\r\n");
      out.write("\t\t\t\t$(\"input[name = dtprevisao]\").removeAttr(\"disabled\");\r\n");
      out.write("\t\t\t\t$(\"#depositoTransferencia\").removeAttr(\"disabled\");\r\n");
      out.write("\t\t\t\ttry {\r\n");
      out.write("\t\t\t\t\tclearMessages();//limpa as mensagens que vieram do servidor\r\n");
      out.write("\t\t\t\t} catch(e){\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tverificaChecks();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//Acao do botao voltar para listagem\r\n");
      out.write("\tfunction voltarListagem(){\r\n");
      out.write("\t\t$w.showLoading();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"input[name=selectAll]\").each(function(){\r\n");
      out.write("\t\t\t$(this).removeAttr(\"checked\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#retornar\").fadeOut();\r\n");
      out.write("\t\t$(\"#dadosAgendamento\").fadeOut(function(){\r\n");
      out.write("\t\t\t$(\"#consultaAgendamento\").fadeIn();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$w.hideLoading();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//Volta para parte de dados do agendamento\r\n");
      out.write("\tfunction voltarDados (){\r\n");
      out.write("\t\t$w.showLoading();\r\n");
      out.write("\t\t$(\"#voltar\").fadeOut();\r\n");
      out.write("\t\t$(\"#confirmarParcial\").fadeOut();\r\n");
      out.write("\t\t$(\"#agendamentoParcial\").fadeOut(function(){\r\n");
      out.write("\t\t\t$(\"#dadosAgendamento\").fadeIn();\r\n");
      out.write("\t\t\t$(\"#retornar\").fadeIn();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tverificaChecks();\r\n");
      out.write("\t\t$w.hideLoading();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/* Cria a linha do Datagrid */\r\n");
      out.write("\tfunction makeRow(i,cdpedidocompra,numero,isParcial){\r\n");
      out.write("\t\tvar row = \"<tr class='\"+(i % 2 == 0 ? \"dataGridBody1\" : \"dataGridBody2\")+\"'>\";\r\n");
      out.write("\t\trow += \"<td>\"+numero+\"</td>\";\r\n");
      out.write("\t\tif(isParcial){\r\n");
      out.write("\t\t\trow += \"<td><center><input type='checkbox' checked='checked' disabled='disabled' name='checkparcial' value=\"+cdpedidocompra+\" /></center></td>\";\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\trow += \"<td><center><input type='checkbox' name='checkparcial' value=\"+cdpedidocompra+\" onclick='verificaChecks()' /></center></td>\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\trow += \"</tr>\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn row;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//faz a entrada da parte de agendamento parcial\r\n");
      out.write("\tfunction agendamentoParcialEntrada(){\r\n");
      out.write("\t\t$(\"#retornar\").fadeOut();\r\n");
      out.write("\t\t$(\"#dadosAgendamento\").fadeOut(function (){\r\n");
      out.write("\t\t\t$(\"#agendamentoParcial\").fadeIn();\r\n");
      out.write("\t\t\t$(\"#confirmarParcial\").fadeIn();\r\n");
      out.write("\t\t\t$(\"#voltar\").fadeIn();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/*Separa os agendamentos parciais*/\r\n");
      out.write("\tfunction agendamentoParcial(){\r\n");
      out.write("\t\tif(validar()){\r\n");
      out.write("\t\t\t$w.showLoading();\r\n");
      out.write("\t\t\tvar checksParciais = new Array();\r\n");
      out.write("\t\t\t$(\"input[name = checkparcial]\").each(function(){\r\n");
      out.write("\t\t\t\tchecksParciais.push($(this));\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tagendamentosParciais = \"\";\r\n");
      out.write("\t\t\tabas = 0;\r\n");
      out.write("\t\t\tfor(i = 0;i< checksParciais.length;i++){\r\n");
      out.write("\t\t\t\tif(checksParciais[i].attr('checked')){\r\n");
      out.write("\t\t\t\t\tagendamentosParciais += checksParciais[i].val()+\",\";\r\n");
      out.write("\t\t\t\t\tabas = abas + 1;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tgetParciais(agendamentosParciais);\r\n");
      out.write("\t\t\tagendamentoParcialEntrada();\r\n");
      out.write("\t\t\t$w.hideLoading();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/*Busca produtos dos pedidos de compra no banco e \r\n");
      out.write("\t gera o html*/\r\n");
      out.write("\tfunction getParciais(arrayParcial){\r\n");
      out.write("\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/recebimento/process/Agendamento\",\r\n");
      out.write("\t\t\t{'ACAO':'getProdutos',\r\n");
      out.write("\t\t\t'arrayParcial':arrayParcial},\r\n");
      out.write("\t\t\tfunction (data){\r\n");
      out.write("\t\t\t\t$(\"#agendamentoParcial\").html(data);\r\n");
      out.write("\t\t\t});\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t/*Faz a validação dos compos obrigatórios\r\n");
      out.write("\t* e do campo data\r\n");
      out.write("\t*/\r\n");
      out.write("\tfunction validar(){\r\n");
      out.write("\t\tvar pendencias = new Array;\r\n");
      out.write("\t\tvar string = \"\";\r\n");
      out.write("\t\tif($(\"#tipocarga\").val() == \"<null>\"){\r\n");
      out.write("\t\t\tpendencias.push(\"O campo Tipo de carga é obrigatório\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif($(\"#dtagenda\").val() == \"\"){\r\n");
      out.write("\t\t\tpendencias.push(\"O campo Data de agendamento é obrigatório\");\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tdata = new Date();\r\n");
      out.write("\t\t\tmes = (data.getMonth()+1) > 9 ? (data.getMonth()+1) : \"0\"+(data.getMonth()+1);\r\n");
      out.write("\t\t\tdia = (data.getDate()) > 9 ? (data.getDate()) : \"0\"+(data.getDate());\r\n");
      out.write("\t\t\thoje = dia+\"/\"+mes+\"/\"+data.getFullYear();\r\n");
      out.write("\t\t\tif($w.comparaData(hoje,$(\"#dtagenda\").val()) == -1)\r\n");
      out.write("\t\t\t\tpendencias.push(\"A data de agendamento não pode ser anterior à data atual.\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif($(\"#dtprevisao\").val() == \"\"){\r\n");
      out.write("\t\t\tpendencias.push(\"O campo Previsão de vencimento financeiro é obrigatório\");\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tdata = new Date();\r\n");
      out.write("\t\t\tmes = (data.getMonth()+1) > 9 ? (data.getMonth()+1) : \"0\"+(data.getMonth()+1);\r\n");
      out.write("\t\t\tdia = (data.getDate()) > 9 ? (data.getDate()) : \"0\"+(data.getDate());\r\n");
      out.write("\t\t\thoje = dia+\"/\"+mes+\"/\"+data.getFullYear();\r\n");
      out.write("\t\t\tif($w.comparaData(hoje,$(\"#dtprevisao\").val()) == -1)\r\n");
      out.write("\t\t\t\tpendencias.push(\"A data de previsão de vencimento financeiro não pode ser anterior à data atual.\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar i = 0;\r\n");
      out.write("\t\tfor(i = 0; i < pendencias.length; i++){\r\n");
      out.write("\t\t\tstring += pendencias[i]+\"\\n\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(string != \"\"){\r\n");
      out.write("\t\t\talert(string);\r\n");
      out.write("\t\t\treturn false; \r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t// verifica se ha algum check checado\r\n");
      out.write("\tfunction verificaChecks(){\r\n");
      out.write("\t\tvar checados = \"\";\r\n");
      out.write("\t\t$(\"input[name=checkparcial]:checked\").each(function(){\r\n");
      out.write("\t\t\t\tchecados = \"x\";\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tif(checados == \"\"){\r\n");
      out.write("\t\t\t$(\"#confirmar\").show();\r\n");
      out.write("\t\t\t$(\"#avancar\").hide();\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(\"#confirmar\").hide();\r\n");
      out.write("\t\t\t$(\"#avancar\").show();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\t\r\n");
      out.write("\t\r\n");
      out.write("\t//Limita a quantidade máxima dos campos quantidade\r\n");
      out.write("\tfunction validaTamanhoMaximo(evento,elemento){\r\n");
      out.write("\t\tvar idTotal = \"#t\"+elemento.name;\r\n");
      out.write("\t\tvar quantidadeTotal = parseInt($(idTotal).val());\r\n");
      out.write("\t\tvar id = \"#d\"+elemento.name;\r\n");
      out.write("\t\tvar quantidadeMaxima = parseInt($(id).val());\r\n");
      out.write("\t\tvar quantidade = $(elemento).val();\r\n");
      out.write("\t\tvar key = window.event ? evento.keyCode : evento.which;\r\n");
      out.write("\t\tvar keychar = parseInt(String.fromCharCode(key));\r\n");
      out.write("\t\tvar textoSelecionado = \"\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(quantidadeMaxima > quantidadeTotal){\r\n");
      out.write("\t\t\tquantidadeMaxima = quantidadeTotal;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(document.selection)\r\n");
      out.write("\t\t\ttextoSelecionado = document.selection.createRange().text;\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t\ttextoSelecionado = quantidade.substring(elemento.selectionStart, elemento.selectionEnd);\r\n");
      out.write("\t\tif(textoSelecionado != ''){\r\n");
      out.write("\t\t\tvar tamanho = quantidade.length;\r\n");
      out.write("\t\t\tif(textoSelecionado.length == tamanho)\r\n");
      out.write("\t\t\t\tquantidade = \"\"; \r\n");
      out.write("\t\t\telse{\r\n");
      out.write("\t\t\t\tquantidade = quantidade.substring(0,elemento.selectionStart) + keychar + quantidade.substring(elemento.selectionEnd,tamanho);\r\n");
      out.write("\t\t\t\tkeychar = \"\";\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(quantidade+keychar > quantidadeMaxima || quantidade+keychar == 0){\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/*Habilita e desabilita o campo quantidade \r\n");
      out.write("\tde acordo com o valor do checkbox*/\r\n");
      out.write("\tfunction habilitaQuantidade(elemento){\r\n");
      out.write("\t\tvar quantidade = \"#q\"+$(elemento).val();\r\n");
      out.write("\t\tif($(elemento).attr(\"checked\")){\r\n");
      out.write("\t\t\t$(quantidade).removeAttr(\"disabled\");\r\n");
      out.write("\t\t\t$(quantidade).attr(\"style\",\"text-align: right;\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse{\r\n");
      out.write("\t\t\t$(quantidade).attr(\"disabled\",\"disabled\");\r\n");
      out.write("\t\t\t$(quantidade).attr(\"style\",\"background-color: #dadada; text-align: right;\");\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/*Salva os agendamentos totais*/\r\n");
      out.write("\tfunction salvaAgendamentoTotal(){\r\n");
      out.write("\t\t$w.showLoading();\r\n");
      out.write("\t\tif(validar()){\r\n");
      out.write("\t\t\t$(\"#confirmar\").hide();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar postdata = {\r\n");
      out.write("\t\t\t\t'ACAO':'salvar',\r\n");
      out.write("\t\t\t\t'deposito': form['deposito'].value,\r\n");
      out.write("\t\t\t\t'agendamentos' : agendamentos,\r\n");
      out.write("\t\t\t\t'tipocarga' : $(\"#tipocarga\").val(),\r\n");
      out.write("\t\t\t\t'dtagenda' : $(\"#dtagenda\").val(),\r\n");
      out.write("\t\t\t\t'dtprevisao' : $(\"#dtprevisao\").val(),\r\n");
      out.write("\t\t\t\t'depositoTransferencia' : $(\"#depositoTransferencia\").val()\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/recebimento/process/Agendamento\",\r\n");
      out.write("\t\t\t\tpostdata,\r\n");
      out.write("\t\t\t\tfunction (data){\r\n");
      out.write("\t\t\t\t\teval(data);\r\n");
      out.write("\t\t\t\t\tif(!erro){\r\n");
      out.write("\t\t\t\t\t\tform['ACAO'].value = \"filtrar\";\r\n");
      out.write("\t\t\t\t\t\tform.action = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/recebimento/process/Agendamento';\r\n");
      out.write("\t\t\t\t\t\tform.validate = 'false';\r\n");
      out.write("\t\t\t\t\t\tsubmitForm();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$w.hideLoading();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t/* Salva o agendamento\t\r\n");
      out.write("\t*/\r\n");
      out.write("\tfunction salvarAgendamentoParcial(){\r\n");
      out.write("\t\t$w.showLoading();\r\n");
      out.write("\t\tvar produtosIncluidos = '';\r\n");
      out.write("\t\tvar quantidades = '';\r\n");
      out.write("\t\tif(validateProdutosIncluidos()){\r\n");
      out.write("\t\t\t$(\"input[type = checkbox][name = produtos]:checked\").each(function(){\r\n");
      out.write("\t\t\t\tprodutosIncluidos += $(this).val() + ',';\r\n");
      out.write("\t\t\t\tif($(\"#q\"+$(this).val()).val() == \"\"){\r\n");
      out.write("\t\t\t\t\talert(\"O campo quantidade é obrigatório.\");\r\n");
      out.write("\t\t\t\t\t$w.hideLoading();\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}else if($(\"#q\"+$(this).val()).val() == \"0\"){\r\n");
      out.write("\t\t\t\t\t\t\tsetTimeout(function(){$(\"#q\"+$(this).val()).focus()},50);\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#q\"+$(this).val()).val(\"\");\r\n");
      out.write("\t\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\tquantidades += $(\"#q\"+$(this).val()).val() + ',';\r\n");
      out.write("\t\t\t});\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar postdata = {\r\n");
      out.write("\t\t\t\t'ACAO':'salvar',\r\n");
      out.write("\t\t\t\t'deposito': form['deposito'].value,\r\n");
      out.write("\t\t\t\t'agendamentos' : agendamentos,\r\n");
      out.write("\t\t\t\t'tipocarga' : $(\"#tipocarga\").val(),\r\n");
      out.write("\t\t\t\t'dtagenda' : $(\"#dtagenda\").val(),\r\n");
      out.write("\t\t\t\t'dtprevisao' : $(\"#dtprevisao\").val(),\r\n");
      out.write("\t\t\t\t'depositoTransferencia' : $(\"#depositoTransferencia\").val(),\r\n");
      out.write("\t\t\t\t'produtosIncluidos' : produtosIncluidos , \r\n");
      out.write("\t\t\t\t'agendamentosParciais' : agendamentosParciais , \r\n");
      out.write("\t\t\t\t'quantidades' : quantidades\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t//$(\"#confirmarParcial\").hide();\r\n");
      out.write("\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/recebimento/process/Agendamento\",\r\n");
      out.write("\t\t\t\t\tpostdata,\r\n");
      out.write("\t\t\t\t\tfunction(data){\r\n");
      out.write("\t\t\t\t\t\teval(data);\r\n");
      out.write("\t\t\t\t\t\tif(!erro){\r\n");
      out.write("\t\t\t\t\t\t\tform['ACAO'].value = \"filtrar\";\r\n");
      out.write("\t\t\t\t\t\t\tform.action = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/recebimento/process/Agendamento';\r\n");
      out.write("\t\t\t\t\t\t\tform.validate = 'false';\r\n");
      out.write("\t\t\t\t\t\t\tsubmitForm();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}); \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$w.hideLoading();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/*Faz a validação dos produtos incluídos*/\r\n");
      out.write(" \tfunction validateProdutosIncluidos(){\r\n");
      out.write(" \t\tvar aux;\r\n");
      out.write("  \t\tfor(i = 0; i < abas ; i++){\r\n");
      out.write(" \t\t\taux = '';\r\n");
      out.write("\t \t\tif(abas > 1){\r\n");
      out.write("\t\t \t\t$(\"#tabPanel_\"+i+\" input[type = checkbox][name = produtos]:checked\").each(function(){\r\n");
      out.write("\t\t \t\t\taux += $(this).val() + \",\"; \r\n");
      out.write("\t\t \t\t});\r\n");
      out.write("\t\t \t}else{\r\n");
      out.write("\t\t \t\t$(\"#dataGrid input[type = checkbox][name = produtos]:checked\").each(function(){\r\n");
      out.write("\t\t \t\t\taux += $(this).val() + \",\"; \r\n");
      out.write("\t\t \t\t});\r\n");
      out.write("\t\t \t}\r\n");
      out.write("\t \t\tif(aux == ''){\r\n");
      out.write("\t \t\t\talert(\"O pedido \\\"\"+$(form['numeroPedido'+(i+1)]).val()+\"\\\" foi marcado como carga parcial, mas não foi selecionado nenhum de seus produtos.\");\r\n");
      out.write("\t \t\t\treturn false;\r\n");
      out.write("\t \t\t}\r\n");
      out.write(" \t\t}\r\n");
      out.write(" \t\treturn true;\r\n");
      out.write(" \t}\r\n");
      out.write(" \t\r\n");
      out.write("\tfunction showtabPanel(panel, index, linkid) {\r\n");
      out.write("        for(i = 0; i < abas; i++){\r\n");
      out.write("\t        hidetabPanel('tabPanel_'+i);\r\n");
      out.write("\t        unselecttabPanel('tabPanel_'+i, 'tabPanel_link_'+i);\r\n");
      out.write("       \t}\r\n");
      out.write("        document.getElementById(panel).style.display = '';\r\n");
      out.write("        selecttabPanel(panel, index, linkid);\r\n");
      out.write("    }\r\n");
      out.write("    function hidetabPanel(panel) {\r\n");
      out.write("        document.getElementById(panel).style.display = 'none';\r\n");
      out.write("    }\r\n");
      out.write("    function selecttabPanel(panel, index, linkid) {\r\n");
      out.write("        document.getElementById(linkid).className = 'detailTabSelected';\r\n");
      out.write("    }\r\n");
      out.write("    function unselecttabPanel(panel, linkid) {\r\n");
      out.write("        document.getElementById(linkid).className = 'detailTabUnselected';\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    //Valida se o valor do campo é igual a zero\r\n");
      out.write("\tfunction validaZero(elemento){\r\n");
      out.write("\t\tif(elemento.value == \"0\"){\r\n");
      out.write("\t\t\talert(\"O valor do campo Quantidade deve ser maior que 0.\");\r\n");
      out.write("\t\t\tsetTimeout(function(){elemento.focus()},50);\r\n");
      out.write("\t\t\telemento.value = \"\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction visualizarJanelas(){\r\n");
      out.write("\t\tvar data = $('#dtagenda').val();\r\n");
      out.write("\t\tif (data == \"\"){\r\n");
      out.write("\t\t\talert(\"Informe a data do agendamento.\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar deposito = $('#comboDeposito').val();\r\n");
      out.write("\t\t$w.openPopup(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/recebimento/process/VisualizarJanelasAgenda?deposito=\" + deposito + \"&dataAgenda=\" + data, 1000, 600);\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
        out.write("\t<div id=\"retornar\" style=\"display: none; text-align: right;\">\r\n");
        out.write("\t\t<a href=\"#\" onclick=\"voltarListagem()\" id='btn_voltar' onmouseover=\"Tip('Voltar')\">Retornar à listagem</a>\r\n");
        out.write("\t\t<a href=\"#\" onclick=\"visualizarJanelas()\" id='btn_engrenagem' onmouseover=\"Tip('Visualizar janelas de agendamento')\">Janelas de agendamento</a>\r\n");
        out.write("\t</div>\r\n");
        out.write("\t<div id=\"voltar\" style=\"display: none; text-align: right;\">\r\n");
        out.write("\t\t<a href=\"#\" onclick=\"voltarDados()\" id='btn_voltar' onmouseover=\"Tip('Voltar')\">Retornar à etapa anterior</a>\r\n");
        out.write("\t\t<a href=\"#\" onclick=\"visualizarJanelas()\" id='btn_engrenagem' onmouseover=\"Tip('Visualizar janelas de agendamento')\">Janelas de agendamento</a>\r\n");
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

  private boolean _jspx_meth_t_janelaFiltro_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:janelaFiltro
    br.com.linkcom.neo.view.template.JanelaFiltroTag _jspx_th_t_janelaFiltro_0 = new br.com.linkcom.neo.view.template.JanelaFiltroTag();
    _jspx_th_t_janelaFiltro_0.setJspContext(_jspx_page_context);
    _jspx_th_t_janelaFiltro_0.setParent(_jspx_parent);
    _jspx_th_t_janelaFiltro_0.setJspBody(new geraragendamento_jspHelper( 1, _jspx_page_context, _jspx_th_t_janelaFiltro_0, null));
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
    _jspx_th_t_tabelaFiltro_0.setSubmitAction("filtrar");
    _jspx_th_t_tabelaFiltro_0.setColumns(new Integer(1));
    _jspx_th_t_tabelaFiltro_0.setDynamicAttribute(null, "afterClear", new String("afterClearFilter();"));
    _jspx_th_t_tabelaFiltro_0.setJspBody(new geraragendamento_jspHelper( 2, _jspx_page_context, _jspx_th_t_tabelaFiltro_0, null));
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
    _jspx_th_w_tableGroup_0.setColumns(new Integer(6));
    _jspx_th_w_tableGroup_0.setPanelgridWidth("95%");
    _jspx_th_w_tableGroup_0.setPanelColspan(new Integer(2));
    _jspx_th_w_tableGroup_0.setJspBody(new geraragendamento_jspHelper( 3, _jspx_page_context, _jspx_th_w_tableGroup_0, null));
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
    _jspx_th_t_property_0.setName("deposito");
    _jspx_th_t_property_0.setId("comboDeposito");
    _jspx_th_t_property_0.setDynamicAttribute(null, "style", new String("width: 100px;"));
    _jspx_th_t_property_0.setDynamicAttribute(null, "usesuperclass", new String("true"));
    _jspx_th_t_property_0.setDynamicAttribute(null, "onchange", new String("$('#tabelaResultados tbody').empty();"));
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
    _jspx_th_t_property_1.setName("fornecedor");
    _jspx_th_t_property_1.setSelectOnePath("/popup/Fornecedor");
    _jspx_th_t_property_1.setDynamicAttribute(null, "style", new String("width: 180px;"));
    _jspx_th_t_property_1.setDynamicAttribute(null, "usesuperclass", new String("true"));
    _jspx_th_t_property_1.setDynamicAttribute(null, "popupstr", new String("width=550, height=600, top=0, left=0, resizable, scrollbars"));
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
    _jspx_th_t_property_2.setName("numeroPedido");
    _jspx_th_t_property_2.setDynamicAttribute(null, "style", new String("width: 100px;"));
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
    _jspx_th_t_property_3.setName("codigoProduto");
    _jspx_th_t_property_3.setDynamicAttribute(null, "style", new String("width: 110px;"));
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
    _jspx_th_t_property_4.setName("parcial");
    _jspx_th_t_property_4.setTrueFalseNullLabels("Sim,Não");
    _jspx_th_t_property_4.doTag();
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
    _jspx_th_n_panel_0.setJspBody(new geraragendamento_jspHelper( 4, _jspx_page_context, _jspx_th_n_panel_0, null));
    _jspx_th_n_panel_0.doTag();
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
    _jspx_th_t_property_5.setName("datainicial");
    _jspx_th_t_property_5.setRenderAs("single");
    _jspx_th_t_property_5.setShowLabel(new Boolean(false));
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
    _jspx_th_t_property_6.setName("datafinal");
    _jspx_th_t_property_6.setRenderAs("single");
    _jspx_th_t_property_6.setShowLabel(new Boolean(false));
    _jspx_th_t_property_6.doTag();
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
    _jspx_th_n_column_0.setJspBody(new geraragendamento_jspHelper( 7, _jspx_page_context, _jspx_th_n_column_0, null));
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
    _jspx_th_n_header_0.setDynamicAttribute(null, "style", new String("width: 1%;"));
    _jspx_th_n_header_0.setJspBody(new geraragendamento_jspHelper( 8, _jspx_page_context, _jspx_th_n_header_0, null));
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
    _jspx_th_n_body_0.setJspBody(new geraragendamento_jspHelper( 9, _jspx_page_context, _jspx_th_n_body_0, null));
    _jspx_th_n_body_0.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_7 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_7.setJspContext(_jspx_page_context);
    _jspx_th_t_property_7.setParent(_jspx_parent);
    _jspx_th_t_property_7.setName("codigoerp");
    _jspx_th_t_property_7.setType(new String("hidden"));
    _jspx_th_t_property_7.doTag();
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
    _jspx_th_t_property_8.setName("numero");
    _jspx_th_t_property_8.setBodyStyle("text-align: right");
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
    _jspx_th_t_property_9.setName("fornecedor");
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
    _jspx_th_t_property_10.setName("qtdetotal");
    _jspx_th_t_property_10.setBodyStyle("text-align: right");
    _jspx_th_t_property_10.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_11(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_11 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_11.setJspContext(_jspx_page_context);
    _jspx_th_t_property_11.setParent(_jspx_parent);
    _jspx_th_t_property_11.setName("qtdedisponivel");
    _jspx_th_t_property_11.setBodyStyle("text-align: right");
    _jspx_th_t_property_11.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_12(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_12 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_12.setJspContext(_jspx_page_context);
    _jspx_th_t_property_12.setParent(_jspx_parent);
    _jspx_th_t_property_12.setName("dtemissao");
    _jspx_th_t_property_12.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_13(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_13 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_13.setJspContext(_jspx_page_context);
    _jspx_th_t_property_13.setParent(_jspx_parent);
    _jspx_th_t_property_13.setName("dtcancelamento");
    _jspx_th_t_property_13.doTag();
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
    _jspx_th_n_column_1.setJspBody(new geraragendamento_jspHelper( 10, _jspx_page_context, _jspx_th_n_column_1, null));
    _jspx_th_n_column_1.doTag();
    return false;
  }

  private boolean _jspx_meth_n_header_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:header
    br.com.linkcom.neo.view.HeaderTag _jspx_th_n_header_1 = new br.com.linkcom.neo.view.HeaderTag();
    _jspx_th_n_header_1.setJspContext(_jspx_page_context);
    _jspx_th_n_header_1.setParent(_jspx_parent);
    _jspx_th_n_header_1.setDynamicAttribute(null, "style", new String("width: 1%; white-space: nowrap; padding-right: 3px;border-left: none;"));
    _jspx_th_n_header_1.setJspBody(new geraragendamento_jspHelper( 11, _jspx_page_context, _jspx_th_n_header_1, null));
    _jspx_th_n_header_1.doTag();
    return false;
  }

  private boolean _jspx_meth_n_body_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:body
    br.com.linkcom.neo.view.BodyTag _jspx_th_n_body_1 = new br.com.linkcom.neo.view.BodyTag();
    _jspx_th_n_body_1.setJspContext(_jspx_page_context);
    _jspx_th_n_body_1.setParent(_jspx_parent);
    _jspx_th_n_body_1.setJspBody(new geraragendamento_jspHelper( 12, _jspx_page_context, _jspx_th_n_body_1, null));
    _jspx_th_n_body_1.doTag();
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty COMPRAS}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<div style=\"text-align: right; padding-right: 5px; font-weight: bold\">\r\n");
        out.write("\t\t\t\t\tN&atilde;o existem registros!\r\n");
        out.write("\t\t\t\t</div>\r\n");
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

  private boolean _jspx_meth_t_janelaResultados_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:janelaResultados
    br.com.linkcom.neo.view.template.JanelaResultadosTag _jspx_th_t_janelaResultados_1 = new br.com.linkcom.neo.view.template.JanelaResultadosTag();
    _jspx_th_t_janelaResultados_1.setJspContext(_jspx_page_context);
    _jspx_th_t_janelaResultados_1.setParent(_jspx_parent);
    _jspx_th_t_janelaResultados_1.setJspBody(new geraragendamento_jspHelper( 13, _jspx_page_context, _jspx_th_t_janelaResultados_1, null));
    _jspx_th_t_janelaResultados_1.doTag();
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty COMPRAS}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<div style=\"text-align : right;\"><a href=\"#\" onmouseover=\"Tip('Gerar agendamento')\" onclick=\"gerarAgendamento()\" id='btn_engrenagem'>Gerar</a></div>\r\n");
        out.write("\t\t  ");
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

  private boolean _jspx_meth_w_tableGroup_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  w:tableGroup
    br.com.linkcom.wms.util.tag.TableGroupTag _jspx_th_w_tableGroup_1 = new br.com.linkcom.wms.util.tag.TableGroupTag();
    _jspx_th_w_tableGroup_1.setJspContext(_jspx_page_context);
    _jspx_th_w_tableGroup_1.setParent(_jspx_parent);
    _jspx_th_w_tableGroup_1.setColumns(new Integer(4));
    _jspx_th_w_tableGroup_1.setJspBody(new geraragendamento_jspHelper( 16, _jspx_page_context, _jspx_th_w_tableGroup_1, null));
    _jspx_th_w_tableGroup_1.doTag();
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
    _jspx_th_t_propertyConfig_0.setJspBody(new geraragendamento_jspHelper( 17, _jspx_page_context, _jspx_th_t_propertyConfig_0, null));
    _jspx_th_t_propertyConfig_0.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_14(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_14 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_14.setJspContext(_jspx_page_context);
    _jspx_th_t_property_14.setParent(_jspx_parent);
    _jspx_th_t_property_14.setName("tipocarga");
    _jspx_th_t_property_14.setId("tipocarga");
    _jspx_th_t_property_14.setDynamicAttribute(null, "disabled", new String("disabled"));
    _jspx_th_t_property_14.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_15(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_15 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_15.setJspContext(_jspx_page_context);
    _jspx_th_t_property_15.setParent(_jspx_parent);
    _jspx_th_t_property_15.setName("dtagenda");
    _jspx_th_t_property_15.setId("dtagenda");
    _jspx_th_t_property_15.setDynamicAttribute(null, "disabled", new String("disabled"));
    _jspx_th_t_property_15.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_16(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_16 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_16.setJspContext(_jspx_page_context);
    _jspx_th_t_property_16.setParent(_jspx_parent);
    _jspx_th_t_property_16.setName("dtprevisao");
    _jspx_th_t_property_16.setId("dtprevisao");
    _jspx_th_t_property_16.setDynamicAttribute(null, "disabled", new String("disabled"));
    _jspx_th_t_property_16.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_17(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_17 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_17.setJspContext(_jspx_page_context);
    _jspx_th_t_property_17.setParent(_jspx_parent);
    _jspx_th_t_property_17.setName("depositoTransferencia");
    _jspx_th_t_property_17.setId("depositoTransferencia");
    _jspx_th_t_property_17.setDynamicAttribute(null, "disabled", new String("disabled"));
    _jspx_th_t_property_17.doTag();
    return false;
  }

  private boolean _jspx_meth_n_dataGrid_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:dataGrid
    br.com.linkcom.neo.view.DataGridTag _jspx_th_n_dataGrid_1 = new br.com.linkcom.neo.view.DataGridTag();
    _jspx_th_n_dataGrid_1.setJspContext(_jspx_page_context);
    _jspx_th_n_dataGrid_1.setParent(_jspx_parent);
    _jspx_th_n_dataGrid_1.setId("pedidoscompra");
    _jspx_th_n_dataGrid_1.setHeaderStyleClass("dgh");
    _jspx_th_n_dataGrid_1.setJspBody(new geraragendamento_jspHelper( 18, _jspx_page_context, _jspx_th_n_dataGrid_1, null));
    _jspx_th_n_dataGrid_1.doTag();
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
    _jspx_th_n_column_2.setHeader("Número");
    _jspx_th_n_column_2.setJspBody(new geraragendamento_jspHelper( 19, _jspx_page_context, _jspx_th_n_column_2, null));
    _jspx_th_n_column_2.doTag();
    return false;
  }

  private class geraragendamento_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public geraragendamento_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public void invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t<div id=\"consultaAgendamento\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_t_janelaFiltro_0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      //  t:janelaResultados
      br.com.linkcom.neo.view.template.JanelaResultadosTag _jspx_th_t_janelaResultados_0 = new br.com.linkcom.neo.view.template.JanelaResultadosTag();
      _jspx_th_t_janelaResultados_0.setJspContext(_jspx_page_context);
      _jspx_th_t_janelaResultados_0.setParent(_jspx_parent);
      _jspx_th_t_janelaResultados_0.setJspBody(new geraragendamento_jspHelper( 5, _jspx_page_context, _jspx_th_t_janelaResultados_0, null));
      _jspx_th_t_janelaResultados_0.doTag();
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_t_janelaResultados_1(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"dadosAgendamento\" style=\"display: none\">\r\n");
      out.write("\t\t");
      //  t:tabelaEntrada
      br.com.linkcom.neo.view.template.TabelaEntradaTag _jspx_th_t_tabelaEntrada_0 = new br.com.linkcom.neo.view.template.TabelaEntradaTag();
      _jspx_th_t_tabelaEntrada_0.setJspContext(_jspx_page_context);
      _jspx_th_t_tabelaEntrada_0.setParent(_jspx_parent);
      _jspx_th_t_tabelaEntrada_0.setStyle("width:750px;");
      _jspx_th_t_tabelaEntrada_0.setJspBody(new geraragendamento_jspHelper( 14, _jspx_page_context, _jspx_th_t_tabelaEntrada_0, null));
      _jspx_th_t_tabelaEntrada_0.doTag();
      out.write("\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t");
      if (_jspx_meth_n_dataGrid_1(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<div style=\"text-align : right; display: none; padding-right: 4px\" id=\"avancar\"><a href=\"#\" onmouseover=\"Tip('Avancar')\" onclick=\"agendamentoParcial()\" id='avancar'>Avan&ccedil;ar</a></div>\r\n");
      out.write("\t\t<div style=\"text-align : right;\" id=\"confirmar\"><a href=\"#\" onmouseover=\"Tip('Confirmar')\" onclick=\"$.blockUI();salvaAgendamentoTotal();\" id='btn_confirmar'>Confirmar</a></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"agendamentoParcial\"></div>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<div style=\"text-align : right; display: none\" id=\"confirmarParcial\"><a href=\"#\" onmouseover=\"Tip('Confirmar')\" onclick=\"$.blockUI();salvarAgendamentoParcial();\" id='btn_confirmar'>Confirmar</a></div>\r\n");
      return;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_t_tabelaFiltro_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t");
      return false;
    }
    public boolean invoke2( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_w_tableGroup_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      return false;
    }
    public boolean invoke3( JspWriter out ) 
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
      if (_jspx_meth_n_panel_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      return false;
    }
    public boolean invoke4( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\tPeríodo de emissão<br>\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_t_property_5(_jspx_parent, _jspx_page_context))
        return true;
      out.write(" até ");
      if (_jspx_meth_t_property_6(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      return false;
    }
    public void invoke5( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t");
      //  n:dataGrid
      br.com.linkcom.neo.view.DataGridTag _jspx_th_n_dataGrid_0 = new br.com.linkcom.neo.view.DataGridTag();
      _jspx_th_n_dataGrid_0.setJspContext(_jspx_page_context);
      _jspx_th_n_dataGrid_0.setParent(_jspx_parent);
      _jspx_th_n_dataGrid_0.setItens((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${COMPRAS}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      _jspx_th_n_dataGrid_0.setVar("cp");
      _jspx_th_n_dataGrid_0.setItemType(Pedidocompra.class);
      _jspx_th_n_dataGrid_0.setId("tabelaResultados");
      _jspx_th_n_dataGrid_0.setJspBody(new geraragendamento_jspHelper( 6, _jspx_page_context, _jspx_th_n_dataGrid_0, null));
      _jspx_th_n_dataGrid_0.doTag();
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      return;
    }
    public void invoke6( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_column_0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_property_8(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_property_9(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_property_10(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_property_11(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_property_12(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_property_13(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_column_1(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      return;
    }
    public boolean invoke7( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_header_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_body_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      return false;
    }
    public boolean invoke8( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" name=\"selectAll\" id=\"selectAll\" class=\"checkBoxClass\" onclick=\"javascript:$dg.changeCheckStateagendamento();\">\r\n");
      out.write("\t\t\t\t\t");
      return false;
    }
    public boolean invoke9( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" id=\"check\" name=\"selecteditens\"  class=\"checkBoxClass\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cp.cdpedidocompra}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_t_property_7(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      return false;
    }
    public boolean invoke10( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_header_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_body_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      return false;
    }
    public boolean invoke11( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      return false;
    }
    public boolean invoke12( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a class=\"activation\" onmouseover=\"Tip('Consultar registro')\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/recebimento/process/Agendamento?ACAO=consultar&cdpedidocompra=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cp.cdpedidocompra}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<img border=\"0\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/imagens/consultar_icon.gif\"/>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t");
      return false;
    }
    public boolean invoke13( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t  ");
      if (_jspx_meth_c_if_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\t\r\n");
      out.write("\t\t");
      return false;
    }
    public void invoke14( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t");
      //  n:bean
      br.com.linkcom.neo.view.BeanTag _jspx_th_n_bean_0 = new br.com.linkcom.neo.view.BeanTag();
      _jspx_th_n_bean_0.setJspContext(_jspx_page_context);
      _jspx_th_n_bean_0.setParent(_jspx_parent);
      _jspx_th_n_bean_0.setName("Agenda");
      _jspx_th_n_bean_0.setValueType(Agenda.class);
      _jspx_th_n_bean_0.setJspBody(new geraragendamento_jspHelper( 15, _jspx_page_context, _jspx_th_n_bean_0, null));
      _jspx_th_n_bean_0.doTag();
      out.write("\r\n");
      out.write("\t\t");
      return;
    }
    public void invoke15( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t  ");
      if (_jspx_meth_w_tableGroup_1(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      return;
    }
    public boolean invoke16( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t  \t");
      if (_jspx_meth_t_propertyConfig_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t  ");
      return false;
    }
    public boolean invoke17( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_t_property_14(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_t_property_15(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_t_property_16(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_t_property_17(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      return false;
    }
    public boolean invoke18( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_n_column_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t<th style=\"width: 1%;\" id=\"columParcial\" align=\"center\">\r\n");
      out.write("\t\t\t\tParcial<br/>\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;&nbsp;<input type=\"checkbox\" name=\"selectAll\" id=\"selectAll\" class=\"checkBoxClass\" onclick=\"selectAllParcial(this)\">\r\n");
      out.write("\t\t\t</th>\r\n");
      out.write("\t\t");
      return false;
    }
    public boolean invoke19( JspWriter out ) 
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
