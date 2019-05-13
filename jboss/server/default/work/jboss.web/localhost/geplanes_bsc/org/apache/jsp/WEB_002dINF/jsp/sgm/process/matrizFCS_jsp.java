package org.apache.jsp.WEB_002dINF.jsp.sgm.process;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class matrizFCS_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tags/unidadeGerencialInput.tag");
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
      out.write("\r\n");
      out.write("<script language=\"JavaScript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/tiny_mce/tiny_mce.js\"></script>\r\n");
      out.write("\r\n");
      if (_jspx_meth_t_tela_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar app = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\tfunction demo(){\r\n");
      out.write("\t\t$(\"#txt_novofcs\").val(\"lala2\");\r\n");
      out.write("\t\tmatrizFcs.table.addColumn();\r\n");
      out.write("\t\t$(\"#txt_novofcs\").val(\"lala3\");\r\n");
      out.write("\t\tmatrizFcs.table.addColumn();\r\n");
      out.write("\t\t/*$(\"#txt_novofcs\").val(\"lala4\");\r\n");
      out.write("\t\tmatrizFcs.table.addColumn();\r\n");
      out.write("\t\t$(\"#txt_novofcs\").val(\"lala5\");\r\n");
      out.write("\t\tmatrizFcs.table.addColumn();\r\n");
      out.write("\t\t$(\"#txt_novofcs\").val(\"lala6\");\r\n");
      out.write("\t\tmatrizFcs.table.addColumn();*/\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#txt_novainiciativa\").val(\"asdasdas 1\");\r\n");
      out.write("\t\tmatrizFcs.table.addLine();\r\n");
      out.write("\t\t$(\"#txt_novainiciativa\").val(\"asdasdas 2\");\r\n");
      out.write("\t\tmatrizFcs.table.addLine();\r\n");
      out.write("\t\t/*$(\"#txt_novainiciativa\").val(\"asdasdas 3\");\r\n");
      out.write("\t\tmatrizFcs.table.addLine();\r\n");
      out.write("\t\t$(\"#txt_novainiciativa\").val(\"asdasdas 4\");\r\n");
      out.write("\t\tmatrizFcs.table.addLine();\r\n");
      out.write("\t\t$(\"#txt_novainiciativa\").val(\"asdasdas 5\");\r\n");
      out.write("\t\tmatrizFcs.table.addLine();*/\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\tif (!window['matrizFcs']) \r\n");
      out.write("\t\twindow['matrizFcs'] = {};\r\n");
      out.write("\t\r\n");
      out.write("\t(function ($,tabela) {\r\n");
      out.write("\t\r\n");
      out.write("\t\tif (this['filtro'] === undefined) {\r\n");
      out.write("\t\t\tthis.filtro = {\r\n");
      out.write("\t\t\t\tplanoGestao : null,\r\n");
      out.write("\t\t\t\tunidadeGerencial : null,\r\n");
      out.write("\t\t\t\tunidadeGerencial_Label : null,\r\n");
      out.write("\t\t\t\tobjetivoMapaEstrategico : null,\r\n");
      out.write("\t\t\t\tfatorAvaliacao : null,\r\n");
      out.write("\t\t\t\trestoreInProcess : false,\r\n");
      out.write("\t\t\t\tlimparCampos : function (from){\r\n");
      out.write("\t\t\t\t\tif(from <=0) {\r\n");
      out.write("\t\t\t\t\t\t$(\"select[name=planoGestao]\").get(0).selectedIndex = 0;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tif(from <=1){\r\n");
      out.write("\t\t\t\t\t\tthis.limpaUnidadeGerencial();\r\n");
      out.write("\t\t\t\t\t} \r\n");
      out.write("\t\t\t\t\tif(from <=2) {\r\n");
      out.write("\t\t\t\t\t\t$(\"select[name=perspectivaMapaEstrategico]\").get(0).selectedIndex = 0;\r\n");
      out.write("\t\t\t\t\t} \r\n");
      out.write("\t\t\t\t\tif(from <=3) {\r\n");
      out.write("\t\t\t\t\t\t$(\"select[name=objetivoMapaEstrategico]\").get(0).selectedIndex = 0;\r\n");
      out.write("\t\t\t\t\t} \r\n");
      out.write("\t\t\t\t\tif(from <=4) {\r\n");
      out.write("\t\t\t\t\t\t$(\"select[name=fatorAvaliacao]\").get(0).selectedIndex = 0;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tvar unVal = form['unidadeGerencial'].value;\r\n");
      out.write("\t\t\t\t\tif(from <= 2 && unVal == \"<null>\"){\r\n");
      out.write("\t\t\t\t\t\tthis.hideFields();\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\tthis.showFields();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tregisterValues : function (){\r\n");
      out.write("\t\t\t\t\tthis.planoGestao = $(\"select[name=planoGestao]\").val();\r\n");
      out.write("\t\t\t\t\tthis.objetivoMapaEstrategico = $(\"select[name=objetivoMapaEstrategico]\").val();\r\n");
      out.write("\t\t\t\t\tthis.fatorAvaliacao = $(\"select[name=fatorAvaliacao]\").val();\r\n");
      out.write("\t\t\t\t\tthis.unidadeGerencial = form['unidadeGerencial'].value;\r\n");
      out.write("\t\t\t\t\tthis.unidadeGerencial_Label = form['unidadeGerencial_label'].value;\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\thideFields : function (){\r\n");
      out.write("\t\t\t\t\t$(\"select[name=perspectivaMapaEstrategico]\").parent().parent().hide();\r\n");
      out.write("\t\t\t\t\t$(\"select[name=objetivoMapaEstrategico]\").parent().parent().hide();\r\n");
      out.write("\t\t\t\t\t$(\"select[name=fatorAvaliacao]\").parent().parent().hide();\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tshowFields : function (){\r\n");
      out.write("\t\t\t\t\t$(\"select[name=perspectivaMapaEstrategico]\").parent().parent().show();\r\n");
      out.write("\t\t\t\t\t$(\"select[name=objetivoMapaEstrategico]\").parent().parent().show();\r\n");
      out.write("\t\t\t\t\t$(\"select[name=fatorAvaliacao]\").parent().parent().show();\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tlimpaUnidadeGerencial : function() {\r\n");
      out.write("\t\t\t\t\tform['unidadeGerencial'].value = '<null>';\r\n");
      out.write("\t\t\t\t\tform['unidadeGerencial_label'].value = '';\r\n");
      out.write("\t\t\t\t\tdocument.getElementById('botaoEscolherunidadeGerencial').innerHTML = 'Escolher';\t\t\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tsalvar : function (){\r\n");
      out.write("\t\t\t\t\tvar colunas = matrizFcs.table.colunas - 1;\r\n");
      out.write("\t\t\t\t\tvar linhas = matrizFcs.table.linhas;\r\n");
      out.write("\t\t\t\t\tvar totalElementosObrigatorios = colunas * linhas;\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar totalElementosSelecionados = tabela.find(\":radio:checked\").size();\r\n");
      out.write("\t\t\t\t\tif(totalElementosSelecionados < totalElementosObrigatorios){\r\n");
      out.write("\t\t\t\t\t\talert(\"É obrigatória a avaliação de impacto para todas as iniciativas x FCS.\");\r\n");
      out.write("\t\t\t\t\t\treturn;\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$(\"#fatorAvaliacao\").removeAttr(\"disabled\");\r\n");
      out.write("\t\t\t\t\tform.ACAO.value ='salvar';\r\n");
      out.write("\t\t\t\t\tform.action = app+'/sgm/process/MatrizFCS';\r\n");
      out.write("\t\t\t\t\tform.validate = 'false';\r\n");
      out.write("\t\t\t\t\tsubmitForm();\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\texcluir : function (){\r\n");
      out.write("\t\t\t\t\tform.ACAO.value ='excluir';\r\n");
      out.write("\t\t\t\t\tform.action = app+'/sgm/process/MatrizFCS';\r\n");
      out.write("\t\t\t\t\tform.validate = 'false';\r\n");
      out.write("\t\t\t\t\tsubmitForm();\r\n");
      out.write("\t\t\t\t},\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\trecarregarTela : function(){\r\n");
      out.write("\t\t\t\t\tform.validate = 'false'; \r\n");
      out.write("\t\t\t\t\tform.suppressErrors.value = 'true';\r\n");
      out.write("\t\t\t\t\tform.ACAO.value = 'executar';\r\n");
      out.write("\t\t\t\t\tform.suppressValidation.value = 'true';\r\n");
      out.write("\t\t\t\t\tdocument.getElementById('idReload').value = 'true';\r\n");
      out.write("\t\t\t\t\tsubmitForm();\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t\tliberarTela: function (event) {\r\n");
      out.write("\t\t\t\t\tvar ignore = false;\r\n");
      out.write("\t\t\t\t\tif(!event)\r\n");
      out.write("\t\t\t\t\t\tignore = true;\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$(\"#messageBlock\").hide();\r\n");
      out.write("\t\t\t\t\tvar planoGestao = $(\"select[name=planoGestao]\").val();\r\n");
      out.write("\t\t\t\t\tvar unidadeGerencial = $(\"input[name=unidadeGerencial]\").val();\r\n");
      out.write("\t\t\t\t\tvar objetivoMapaEstrategico = $(\"select[name=objetivoMapaEstrategico]\").val();\r\n");
      out.write("\t\t\t\t\tvar fatorAvaliacao = $(\"select[name=fatorAvaliacao]\").val();\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar isNull = true;\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(planoGestao && planoGestao != \"<null>\" && unidadeGerencial && unidadeGerencial != \"<null>\" && objetivoMapaEstrategico && objetivoMapaEstrategico != \"<null>\"){\r\n");
      out.write("\t\t\t\t\t\tisNull = false;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(matrizFcs.table.matrizLoaded){\r\n");
      out.write("\t\t\t\t\t\tvar somenteLeitura = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty HIDEBOTAOSALVAR && HIDEBOTAOSALVAR}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\t\t\t\t\t\tif(somenteLeitura || (!ignore && confirm(\"Se for feita a alteração deste valor, os dados não salvos serão perdidos. Deseja continuar mesmo assim?\"))){\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#tabelaFCS tr:gt(0)\").remove();\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#tabelaFCS td:gt(1)\").remove();\r\n");
      out.write("\t\t\t\t\t\t\tmatrizFcs.table.colunas = 1;\r\n");
      out.write("\t\t\t\t\t\t\tmatrizFcs.table.linhas = 0;\r\n");
      out.write("\t\t\t\t\t\t\tmatrizFcs.table.validadeFator();\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#idMatriz\").val(\"\");\r\n");
      out.write("\t\t\t\t\t\t\tmatrizFcs.table.matrizLoaded = false;\r\n");
      out.write("\t\t\t\t\t\t\t//return;\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t/*Restore*/\r\n");
      out.write("\t\t\t\t\t\t\tthis.restoreInProcess = true;\r\n");
      out.write("\t\t\t\t\t\t\t$(\"select[name=planoGestao]\").val(this.planoGestao);\r\n");
      out.write("\t\t\t\t\t\t\t$(\"select[name=objetivoMapaEstrategico]\").val(this.objetivoMapaEstrategico);\r\n");
      out.write("\t\t\t\t\t\t\t$(\"select[name=fatorAvaliacao]\").val(this.fatorAvaliacao);\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tform['unidadeGerencial'].value = this.unidadeGerencial;\r\n");
      out.write("\t\t\t\t\t\t\tform['unidadeGerencial_label'].value = this.unidadeGerencial_Label;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\tdocument.getElementById('botaoEscolherunidadeGerencial').innerHTML = 'Limpar';\r\n");
      out.write("\t\t\t\t\t \t\t$(\"#unidadeGerencial_label\").unautocomplete();\r\n");
      out.write("\t\t\t\t\t \t\t$(\"#unidadeGerencial_label\").attr(\"readOnly\", \"true\");\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tmatrizFcs.filtro.showFields();\r\n");
      out.write("\t\t\t\t\t\t\tthis.restoreInProcess = false;\r\n");
      out.write("\t\t\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tthis.registerValues();\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(!isNull){\r\n");
      out.write("\t\t\t\t\t\t$.getJSON(app+\"/sgm/process/MatrizFCS?ACAO=checkMatriz\",{planoGestao:planoGestao,unidadeGerencial:unidadeGerencial,objetivoMapaEstrategico:objetivoMapaEstrategico,fatorAvaliacao:fatorAvaliacao},function(data){\r\n");
      out.write("\t\t\t\t\t\t\tif(data.status == \"error\"){\r\n");
      out.write("\t\t\t\t\t\t\t\tif(fatorAvaliacao && fatorAvaliacao != \"<null>\" ){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#contMatriz\").show();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#idMatriz\").val(\"\");\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\tmatrizFcs.table.matrizLoaded = true;\r\n");
      out.write("\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tmatrizFcs.table.matrizLoaded = false;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#contMatriz').hide()\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\tvar fator = $(\"select[name=fatorAvaliacao]\");\r\n");
      out.write("\t\t\t\t\t\t\t\tfator.val(data.fatorAvaliacao);\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#idMatriz\").val(data.id);\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\tmatrizFcs.table.loadItemFatorAvaliacao(fator.get(0),true);\r\n");
      out.write("\t\t\t\t\t\t\t\t//matrizFcs.table.carregarTabela();\r\n");
      out.write("\t\t\t\t\t\t\t\t//$(\"#contMatriz\").show();\r\n");
      out.write("\t\t\t\t\t\t\t\t//vai carregar a tabela\r\n");
      out.write("\t\t\t\t\t\t\t\tmatrizFcs.table.matrizLoaded = true;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t//objTabela.listaItemFatorAvaliacao = data.lista;\t\t\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t} else{\r\n");
      out.write("\t\t\t\t\t\tif($(\"select[name='fatorAvaliacao']\").val() != \"<null>\")\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#contMatriz\").show();\r\n");
      out.write("\t\t\t\t\t\telse\r\n");
      out.write("\t\t\t\t\t\t\t $(\"#contMatriz\").hide();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\treturn true;\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif (this['table'] === undefined) {\r\n");
      out.write("\t\t\tthis.table = {\r\n");
      out.write("\t\t\t\tcabecalho : null,\r\n");
      out.write("\t\t\t\tcolunas: 1,\r\n");
      out.write("\t\t\t\tlinhas: 0,\r\n");
      out.write("\t\t\t\tmatrizLoaded: false,\r\n");
      out.write("\t\t\t\ttablePrefix: \"matrizFCS.listaMatrizFcsIniciativa\",\r\n");
      out.write("\t\t\t\ttableHeaderPrefix: \"matrizFCS.listaMatrizFcsFator\",\r\n");
      out.write("\t\t\t\tcheckboxPrefix: \"item\",\r\n");
      out.write("\t\t\t\tcheckboxSuffix: \"sufixo\",\r\n");
      out.write("\t\t\t\td: document,\r\n");
      out.write("\t\t\t\tlistaItemFatorAvaliacao: null,\r\n");
      out.write("\t\t\t\tloadItemFatorAvaliacao: function(elemento,toShow){\r\n");
      out.write("\t\t\t\t\tvar valor = $(elemento).val();\r\n");
      out.write("\t\t\t\t\tmatrizFcs.filtro.fatorAvaliacao = valor;\r\n");
      out.write("\t\t\t\t\tvar objTabela = this;\r\n");
      out.write("\t\t\t\t\t$.getJSON(app+\"/sgm/process/MatrizFCS?ACAO=findItemFatorAvaliacao&fatorAvaliacao=\"+valor,{},function(data){\r\n");
      out.write("\t\t\t\t\t\tobjTabela.listaItemFatorAvaliacao = data.lista;\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tif( toShow ){\r\n");
      out.write("\t\t\t\t\t\t\tmatrizFcs.table.carregarTabela();\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#contMatriz\").show();\r\n");
      out.write("\t\t\t\t\t\t}\t\t\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tcarregarTabela: function (){\r\n");
      out.write("\t\t\t\t\tvar id = $(\"#idMatriz\").val();\r\n");
      out.write("\t\t\t\t\tvar objName = $(\"#idMatriz\").attr(\"name\");\r\n");
      out.write("\t\t\t\t\tvar pai = this;\r\n");
      out.write("\t\t\t\t\t$.getJSON(app+\"/sgm/process/MatrizFCS?ACAO=getInfosMatriz&\"+objName+\"=\"+id,{},function(data){\r\n");
      out.write("\t\t\t\t\t\tvar listaColuna = data.listaMatrizFcsFator;\r\n");
      out.write("\t\t\t\t\t\tfor(var i = 0; i < listaColuna.length ; i++){\r\n");
      out.write("\t\t\t\t\t\t\tpai.addColumn(listaColuna[i]);\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t}\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tvar listaLinhas = data.listaMatrizFCSIniciativa;\r\n");
      out.write("\t\t\t\t\t\tfor(var i = 0; i < listaLinhas.length ; i++){\r\n");
      out.write("\t\t\t\t\t\t\tpai.addLine(listaLinhas[i]);\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\taddColumn : function (value){\r\n");
      out.write("\t\t\t\t\tvar text = null;\r\n");
      out.write("\t\t\t\t\tvar id = null;\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(value) {\r\n");
      out.write("\t\t\t\t\t\ttext = value.descFator;\r\n");
      out.write("\t\t\t\t\t\tid = value.id;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\telse\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\ttext = $(\"#txt_novofcs\").val();\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(text === undefined || text == null || text == \"\"){\r\n");
      out.write("\t\t\t\t\t\talert(\"O campo nova iniciativa é obrigatório\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#txt_novofcs\").focus();\r\n");
      out.write("\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t$(\"#txt_novofcs\").focus();\r\n");
      out.write("\t\t\t\t\t$(\"#txt_novofcs\").val(\"\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t//criou o cabeçalho\r\n");
      out.write("\t\t\t\t\tvar td = this.createTd(\" \"+text,{coluna:this.colunas});\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar input_id = this.createHidden(this.tableHeaderPrefix + \"[\" + (this.colunas - 1) + \"].id\"); \r\n");
      out.write("\t\t\t\t\t//this.d.createElement('input');\r\n");
      out.write("\t\t\t\t\t//input_id.setAttribute(\"type\",\"hidden\");\r\n");
      out.write("\t\t\t\t\t//input_id.setAttribute(\"name\",this.tableHeaderPrefix + \"[\" + (this.colunas - 1) + \"].id\");\r\n");
      out.write("\t\t\t\t\tinput_id.setAttribute(\"class\",\"idvalorheader\");\r\n");
      out.write("\t\t\t\t\tif (value) {\r\n");
      out.write("\t\t\t\t\t\tinput_id.setAttribute(\"value\",value.id);\r\n");
      out.write("\t\t\t\t\t}\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t//var input_id = $(\"<input type='hidden'>\").attr(\"name\",this.tableHeaderPrefix + \"[\" + (this.colunas - 1) + \"].id\").attr(\"class\",\"idvalorheader\");\r\n");
      out.write("\t\t\t\t\t// PEDRO if(id != null) input_id.setAttribute(\"value\",id);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t//var input_desc = $(\"<input type='hidden'>\").attr(\"name\",this.tableHeaderPrefix + \"[\" + (this.colunas - 1) + \"].descFator\").attr(\"class\",\"valor\").val(text);\r\n");
      out.write("\t\t\t\t\tvar input_desc = this.createHidden(this.tableHeaderPrefix + \"[\" + (this.colunas - 1) + \"].descFator\"); \r\n");
      out.write("\t\t\t\t\t//this.d.createElement('input');\r\n");
      out.write("\t\t\t\t\t//input_desc.setAttribute(\"type\",\"hidden\");\r\n");
      out.write("\t\t\t\t\t//input_desc.setAttribute(\"name\",this.tableHeaderPrefix + \"[\" + (this.colunas - 1) + \"].descFator\");\r\n");
      out.write("\t\t\t\t\tinput_desc.setAttribute(\"class\",\"valor\");\r\n");
      out.write("\t\t\t\t\tinput_desc.setAttribute(\"value\",text);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\ttd.prepend(input_id);\r\n");
      out.write("\t\t\t\t\ttd.prepend(input_desc);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tthis.getCabecalho().append(td);\r\n");
      out.write("\t\t\t\t\t//adicionar uma td para cada tr criada\r\n");
      out.write("\t\t\t\t\tvar col = this.colunas;\r\n");
      out.write("\t\t\t\t\tvar pai = this;\r\n");
      out.write("\t\t\t\t\tvar radio = null;\r\n");
      out.write("\t\t\t\t\tvar input_id = null; \r\n");
      out.write("\t\t\t\t\ttabela.find(\"tr:gt(0)\").each(function(){\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tvar tr = $(this);\r\n");
      out.write("\t\t\t\t\t\tvar linha = parseInt(tr.attr(\"linha\"));\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tinput_id = pai.createHidden(pai.tablePrefix + \"[\" + (linha - 1) + \"].listaMatrizFcsIniciativaFator[\"+(col-1)+\"].id\");\r\n");
      out.write("\t\t\t\t\t\t//pai.d.createElement('input');\r\n");
      out.write("\t\t\t\t\t\t//input_id.setAttribute(\"type\",\"hidden\");\r\n");
      out.write("\t\t\t\t\t\t//input_id.setAttribute(\"name\",pai.tablePrefix + \"[\" + (linha - 1) + \"].listaMatrizFcsIniciativaFator[\"+(col-1)+\"].id\");\r\n");
      out.write("\t\t\t\t\t\tinput_id.setAttribute(\"class\",\"idvalor\");\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t//input_id = $(\"<input type='hidden'>\").attr(\"name\",pai.tablePrefix + \"[\" + (linha - 1) + \"].listaMatrizFcsIniciativaFator[\"+(col-1)+\"].id\").attr(\"class\",\"idvalor\");\r\n");
      out.write("\t\t\t\t\t\tradio = pai.buildRadio(pai.tablePrefix + \"[\" + (linha - 1) + \"].listaMatrizFcsIniciativaFator[\"+(col-1)+\"].itemFatorAvaliacao\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\ttd = pai.createTd(\"\",{coluna:col});\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\ttd.append(input_id);\r\n");
      out.write("\t\t\t\t\t\ttd.append(radio);\r\n");
      out.write("\t\t\t\t\t\ttr.append(td);\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\tthis.colunas ++;\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvalidadeFator : function (){\r\n");
      out.write("\t\t\t\t\tif(this.linhas == 0){\r\n");
      out.write("\t\t\t\t\t\t$(\"#fatorAvaliacao\").removeAttr(\"disabled\");\t\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t$(\"#fatorAvaliacao\").attr(\"disabled\",\"disabled\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tcreateHidden : function (name){\r\n");
      out.write("\t\t\t\t\tvar input_id = null;\r\n");
      out.write("\t\t\t\t\ttry{\t\t\t\r\n");
      out.write("\t\t\t\t\t\tinput_id = this.d.createElement('<input type=\"hidden\" name=\"'+name+'\">');\r\n");
      out.write("\t\t\t\t\t} catch (err){\r\n");
      out.write("\t\t\t\t\t\tinput_id = this.d.createElement('input');\r\n");
      out.write("\t\t\t\t\t\tinput_id.setAttribute(\"type\",\"hidden\");\r\n");
      out.write("\t\t\t\t\t\tinput_id.name = name;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\treturn input_id;\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tcreateCheck : function (name){\r\n");
      out.write("\t\t\t\t\tvar input_id = null;\r\n");
      out.write("\t\t\t\t\ttry{\t\t\t\r\n");
      out.write("\t\t\t\t\t\tinput_id = this.d.createElement('<input type=\"checkbox\" name=\"'+name+'\" style=\"border:none\">');\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t} catch (err){\r\n");
      out.write("\t\t\t\t\t\tinput_id = this.d.createElement('input');\r\n");
      out.write("\t\t\t\t\t\tinput_id.setAttribute(\"type\",\"checkbox\");\r\n");
      out.write("\t\t\t\t\t\tinput_id.setAttribute(\"style\",\"border:none\");\r\n");
      out.write("\t\t\t\t\t\tinput_id.name = name;\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\treturn input_id;\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\taddLine : function (value){\r\n");
      out.write("\t\t\t\t\tvar text = null;\r\n");
      out.write("\t\t\t\t\tvar id = null;\r\n");
      out.write("\t\t\t\t\tvar lista = null;\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(value) {\r\n");
      out.write("\t\t\t\t\t\ttext = value.descIniciativa;\r\n");
      out.write("\t\t\t\t\t\tid = value.id;\r\n");
      out.write("\t\t\t\t\t\tlista = value.listaMatrizFcsIniciativaFator;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\telse\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\ttext = $(\"#txt_novainiciativa\").val();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(text === undefined || text == null || text == \"\"){\r\n");
      out.write("\t\t\t\t\t\talert(\"O campo novo Fator crítico de sucesso é obrigatório\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#txt_novainiciativa\").focus();\r\n");
      out.write("\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t}\t\t\t\r\n");
      out.write("\t\t\t\t\t$(\"#txt_novainiciativa\").val(\"\");\r\n");
      out.write("\t\t\t\t\t$(\"#txt_novainiciativa\").focus();\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t//criou o cabeçalho\r\n");
      out.write("\t\t\t\t\tthis.linhas++;\r\n");
      out.write("\t\t\t\t\tvar classe = ((this.linhas % 2) ? 'txt_l1' : 'txt_l2');\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar tr = this.createTr({linha:this.linhas,'class':classe});\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar input_id = this.createHidden(this.tablePrefix + \"[\" + (this.linhas - 1) + \"].id\");\r\n");
      out.write("\t\t\t\t\tinput_id.setAttribute(\"class\",\"idvalor\");\r\n");
      out.write("\t\t\t\t\tif (value) {\r\n");
      out.write("\t\t\t\t\t\tinput_id.setAttribute(\"value\",value.id);\r\n");
      out.write("\t\t\t\t\t}\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t//var input_id = $(\"<input type='hidden'>\").attr(\"name\",this.tablePrefix + \"[\" + (this.linhas - 1) + \"].id\").attr(\"class\",\"idvalor\");\r\n");
      out.write("\t\t\t\t\t// PEDRO if(value)\r\n");
      out.write("\t\t\t\t\t// PEDRO\tinput_id.setAttribute(\"value\",value.id);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar input_desc = this.createHidden(this.tablePrefix + \"[\" + (this.linhas - 1) + \"].descIniciativa\"); \r\n");
      out.write("\t\t\t\t\t//this.d.createElement('input');\r\n");
      out.write("\t\t\t\t\t//input_desc.setAttribute(\"type\",\"hidden\");\r\n");
      out.write("\t\t\t\t\t//input_desc.setAttribute(\"name\",this.tablePrefix + \"[\" + (this.linhas - 1) + \"].descIniciativa\");\r\n");
      out.write("\t\t\t\t\tinput_desc.setAttribute(\"class\",\"valor\");\r\n");
      out.write("\t\t\t\t\tinput_desc.setAttribute(\"value\",text);\t\r\n");
      out.write("\t\t\t\t\t//var input_desc = $(\"<input type='hidden'>\").attr(\"name\",this.tablePrefix + \"[\" + (this.linhas - 1) + \"].descIniciativa\").attr(\"class\",\"valor\").val(text);\r\n");
      out.write("\t\t\t\t\t//var check = $(\"<input type='checkbox'>\").attr(\"name\",this.tablePrefix + \"[\" + (this.linhas - 1) + \"].prioritaria\").attr(\"class\",\"prioritariavalor\");\r\n");
      out.write("\t\t\t\t\tvar check = this.createCheck(this.tablePrefix + \"[\" + (this.linhas - 1) + \"].prioritaria\");\r\n");
      out.write("\t\t\t\t\t//this.d.createElement('input');\r\n");
      out.write("\t\t\t\t\t//check.setAttribute(\"type\",\"checkbox\");\r\n");
      out.write("\t\t\t\t\t//check.setAttribute(\"name\",this.tablePrefix + \"[\" + (this.linhas - 1) + \"].prioritaria\");\r\n");
      out.write("\t\t\t\t\tcheck.setAttribute(\"class\",\"prioritariavalor\");\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\ttd = this.createTd(\"\",{coluna:0});\r\n");
      out.write("\t\t\t\t\ttd.append(check);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(value && value.prioritaria) {\r\n");
      out.write("\t\t\t\t\t\tcheck.setAttribute(\"checked\",\"checked\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\ttr.append(td);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar td = this.createTd(\" \"+text,{coluna:0});\r\n");
      out.write("\t\t\t\t\ttd.prepend(input_id);\r\n");
      out.write("\t\t\t\t\ttd.prepend(input_desc);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\ttr.append(td);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tvar radio = null;\r\n");
      out.write("\t\t\t\t\tvar pai = this;\r\n");
      out.write("\t\t\t\t\tvar input_id = null;\r\n");
      out.write("\t\t\t\t\tvar itemValor = null;\r\n");
      out.write("\t\t\t\t\tvar nameInput = null;\r\n");
      out.write("\t\t\t\t\tfor (var i = 1; i < this.colunas ; i++){\r\n");
      out.write("\t\t\t\t\t\tif(lista)\r\n");
      out.write("\t\t\t\t\t\t\titemValor=lista[i-1];\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tradio = pai.buildRadio(pai.tablePrefix + \"[\" + (pai.linhas - 1) + \"].listaMatrizFcsIniciativaFator[\"+(i-1)+\"].itemFatorAvaliacao\",itemValor);\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tinput_id = this.createHidden(this.tablePrefix + \"[\" + (pai.linhas - 1) + \"].listaMatrizFcsIniciativaFator[\"+(i-1)+\"].id\");\r\n");
      out.write("\t\t\t\t\t\tinput_id.setAttribute(\"class\",\"idvalor\");\r\n");
      out.write("\t\t\t\t\t\tif (lista) {\r\n");
      out.write("\t\t\t\t\t\t\tinput_id.setAttribute(\"value\",itemValor.id);\r\n");
      out.write("\t\t\t\t\t\t}\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t//input_id = $(\"<input type='hidden'>\").attr(\"name\",this.tablePrefix + \"[\" + (pai.linhas - 1) + \"].listaMatrizFcsIniciativaFator[\"+(i-1)+\"].id\").attr(\"class\",\"idvalor\");\r\n");
      out.write("\t\t\t\t\t\t// PEDRO if(lista)\r\n");
      out.write("\t\t\t\t\t\t// PEDRO\tinput_id.setAttribute(\"value\",itemValor.id);\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\ttd = this.createTd(\"\",{coluna:i});\r\n");
      out.write("\t\t\t\t\t\ttd.append(input_id);\r\n");
      out.write("\t\t\t\t\t\ttd.append(radio);\r\n");
      out.write("\t\t\t\t\t\ttr.append(td);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\ttabela.append(tr);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tthis.validadeFator();\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tbuildImgAcao : function (tipo) {\r\n");
      out.write("\t\t\t\t\tvar imagem1 = this.d.createElement(\"img\");\r\n");
      out.write("\t\t\t\t\timagem1.setAttribute(\"src\",\"../../images/ico_excluir.gif\");\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar imagem2 = this.d.createElement(\"img\");\r\n");
      out.write("\t\t\t\t\timagem2.setAttribute(\"src\",\"../../images/ico_editar.gif\");\r\n");
      out.write("\t\t\t\t\t//var imagem1 = $(\"<img/>\").attr(\"src\",\"../../images/ico_excluir.gif\").attr(\"onclick\",);\r\n");
      out.write("\t\t\t\t\t//var imagem2 = $(\"<img/>\").attr(\"src\",\"../../images/ico_editar.gif\").attr(\"onclick\",\"matrizFcs.table.editar\"+tipo+\"(this)\");\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar span = $(\"<span></span>\");\r\n");
      out.write("\t\t\t\t\tspan.append(imagem1);\r\n");
      out.write("\t\t\t\t\tspan.append(\"&nbsp;\");\r\n");
      out.write("\t\t\t\t\tspan.append(imagem2);\r\n");
      out.write("\t\t\t\t\tspan.append(\" - \");\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\timagem1.onclick = function (){matrizFcs.table[\"excluir\" + tipo](this);};\r\n");
      out.write("\t\t\t\t\timagem2.onclick = function (){matrizFcs.table[\"editar\" + tipo](this);};\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\treturn span;\t\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tcreateRadio: function (name){\r\n");
      out.write("\t\t\t\t\tvar radio = null;\r\n");
      out.write("\t\t\t\t\ttry{ //mais uma vez por causa do ie!\r\n");
      out.write("\t\t\t\t\t\tradio = this.d.createElement(\"<input type='radio' name='\"+name+\"' style='border:none'/>\");\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_if_7(_jspx_page_context))
        return;
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t} catch(err) {\r\n");
      out.write("\t\t\t\t\t\tradio = document.createElement('input');\r\n");
      out.write("\t\t\t\t\t\tradio.setAttribute('type','radio');\r\n");
      out.write("\t\t\t\t\t\tradio.setAttribute('style','border:none');\r\n");
      out.write("\t\t\t\t\t\tradio.setAttribute('name',name);\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_if_8(_jspx_page_context))
        return;
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\treturn radio;\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tbuildRadio : function (name,valor){\r\n");
      out.write("\t\t\t\t\tif(this.listaItemFatorAvaliacao != null){\r\n");
      out.write("\t\t\t\t\t\tvar container = this.d.createElement(\"div\"); \r\n");
      out.write("\t\t\t\t\t\t//$(\"<div></div>\");\r\n");
      out.write("\t\t\t\t\t\tcontainer.setAttribute(\"class\",\"radios\");\r\n");
      out.write("\t\t\t\t\t\tvar br_el = this.d.createElement(\"br\");\r\n");
      out.write("\t\t\t\t\t\tvar radio = null;\r\n");
      out.write("\t\t\t\t\t\tvar item = null;\r\n");
      out.write("\t\t\t\t\t\tfor (var i = 0; i < this.listaItemFatorAvaliacao.length ; i++){\r\n");
      out.write("\t\t\t\t\t\t\titem = this.listaItemFatorAvaliacao[i];\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tradio = this.createRadio(name);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tradio.setAttribute(\"value\",item.id);\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tcontainer.appendChild(radio);\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tif(valor){\r\n");
      out.write("\t\t\t\t\t\t\t\tif(valor.itemFatorAvaliacao == item.id){\r\n");
      out.write("\t\t\t\t\t\t\t\t\tradio.setAttribute(\"checked\",\"checked\");\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tcontainer.appendChild(this.d.createTextNode(\" \"+item.descricao));\r\n");
      out.write("\t\t\t\t\t\t\tcontainer.innerHTML += \"<br/>\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\treturn container;\r\n");
      out.write("\t\t\t\t\t}\t\r\n");
      out.write("\t\t\t\t\treturn \"\";\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\texcluirColuna : function (elemento){\r\n");
      out.write("\t\t\t\t\tif(confirm(\"Confirma a exclusão da coluna?\")){\r\n");
      out.write("\t\t\t\t\t\tvar colunaObj = $(elemento).parent().parent();\r\n");
      out.write("\t\t\t\t\t\tvar coluna = colunaObj.attr(\"coluna\");\r\n");
      out.write("\t\t\t\t\t\ttabela.find(\"td[coluna=\"+coluna+\"]\").remove();\r\n");
      out.write("\t\t\t\t\t\tthis.colunas--;\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tthis.rebuildColumns();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\texcluirLinha : function (elemento){\r\n");
      out.write("\t\t\t\t\tif(confirm(\"Confirma a exclusão da linha?\")){\r\n");
      out.write("\t\t\t\t\t\t$(elemento).parent().parent().parent().remove();\r\n");
      out.write("\t\t\t\t\t\tthis.linhas -- ;\r\n");
      out.write("\t\t\t\t\t\tthis.rebuildLines();\r\n");
      out.write("\t\t\t\t\t\tthis.validadeFator();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\teditarLinha : function (elemento){\r\n");
      out.write("\t\t\t\t\tvar tr = $(elemento).parent().parent();\r\n");
      out.write("\t\t\t\t\tvar valor = tr.find(\".content\").html();\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar name = prompt(\"Alteração da linha\", valor);\r\n");
      out.write("\t\t\t\t\ttr.find(\".content\").html(name);\r\n");
      out.write("\t\t\t\t\tvar pai = this;\r\n");
      out.write("\t\t\t\t\ttr.find(\"input\").each(function(){\r\n");
      out.write("\t\t\t\t\t\tvar clazz = this.getAttribute(\"class\");\r\n");
      out.write("\t\t\t\t\t\tif(clazz == \"valor\"){\r\n");
      out.write("\t\t\t\t\t\t\tpai.changeHiddenValue(this,name);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\t\t\t\t\t\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\teditarColuna : function (elemento){\r\n");
      out.write("\t\t\t\t\tvar tr = $(elemento).parent().parent();\r\n");
      out.write("\t\t\t\t\tvar valor = tr.find(\".content\").html();\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar name = prompt(\"Alteração de coluna\", valor);\r\n");
      out.write("\t\t\t\t\ttr.find(\".content\").html(name);\r\n");
      out.write("\t\t\t\t\tvar pai = this;\r\n");
      out.write("\t\t\t\t\ttr.find(\"input\").each(function(){\r\n");
      out.write("\t\t\t\t\t\tvar clazz = this.getAttribute(\"class\");\r\n");
      out.write("\t\t\t\t\t\tif(clazz == \"valor\"){\r\n");
      out.write("\t\t\t\t\t\t\tpai.changeHiddenValue(this,name);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\t\t\t\t\t\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\trebuildColumns : function (){\r\n");
      out.write("\t\t\t\t\tvar linha = 0; \r\n");
      out.write("\t\t\t\t\tvar pai = this;\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\ttabela.find(\"tr:eq(0)\").each(function(){\r\n");
      out.write("\t\t\t\t\t\tvar coluna = 1;\r\n");
      out.write("\t\t\t\t\t\t$(this).find(\"td:gt(1)\").each(function(){\r\n");
      out.write("\t\t\t\t\t\t\tvar td = $(this);\r\n");
      out.write("\t\t\t\t\t\t\tthis.setAttribute(\"coluna\",coluna);\r\n");
      out.write("\t\t\t\t\t\t\tcoluna++;\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\ttabela.find(\"tr:gt(0)\").each(function(){\r\n");
      out.write("\t\t\t\t\t\tvar coluna = 1;\r\n");
      out.write("\t\t\t\t\t\t$(this).find(\"td:gt(1)\").each(function(){\r\n");
      out.write("\t\t\t\t\t\t\tvar td = $(this);\r\n");
      out.write("\t\t\t\t\t\t\tthis.setAttribute(\"coluna\",coluna);\r\n");
      out.write("\t\t\t\t\t\t\t//td.attr(\"coluna\",coluna);\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tif($.browser.msie){ //é gambiarra mesmo! Die ie!\r\n");
      out.write("\t\t\t\t\t\t\t\t//http://alt-tag.com/blog/archives/2006/02/ie-dom-bugs/\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\tvar input_radio_old = td.find(\":first\").get(0);\r\n");
      out.write("\t\t\t\t\t\t\t\tvar valueKeep = input_radio_old.getAttribute(\"value\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\tvar input_id = pai.createHidden(pai.tablePrefix + \"[\" + (linha) + \"].listaMatrizFcsIniciativaFator[\"+(coluna-1)+\"].id\");\r\n");
      out.write("\t\t\t\t\t\t\t\tinput_id.setAttribute(\"class\",\"idvalor\");\r\n");
      out.write("\t\t\t\t\t\t\t\tinput_id.setAttribute(\"value\",valueKeep);\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\tinput_radio_old.parentNode.replaceChild(input_id, input_radio_old);\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\ttd.find(\"div input\").each(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\tinput_radio_old = $(this).get(0);\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar checkKeep = input_radio_old.getAttribute(\"checked\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar valueKeep = input_radio_old.getAttribute(\"value\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\tinput_id = pai.createRadio(pai.tablePrefix + \"[\" + (linha) + \"].listaMatrizFcsIniciativaFator[\"+(coluna -1)+\"].itemFatorAvaliacao\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\tinput_radio_old.parentNode.replaceChild(input_id, input_radio_old);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif(checkKeep)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tinput_id.setAttribute(\"checked\",\"checked\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\tinput_id.setAttribute(\"value\",valueKeep);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\ttd.find(\".idvalor\").attr(\"name\",pai.tablePrefix + \"[\" + (linha) + \"].listaMatrizFcsIniciativaFator[\"+(coluna-1)+\"].id\");\r\n");
      out.write("\t\t\t\t\t\t\t\ttd.find(\".radios input\").each(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(this).attr(\"name\",pai.tablePrefix + \"[\" + (linha) + \"].listaMatrizFcsIniciativaFator[\"+(coluna-1)+\"].itemFatorAvaliacao\");\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\tcoluna++;\t\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tlinha ++;\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar cabecalho = this.getCabecalho();\r\n");
      out.write("\t\t\t\t\tcabecalho.find(\"td input\").each(function(){\r\n");
      out.write("\t\t\t\t\t\tvar el = $(this);\r\n");
      out.write("\t\t\t\t\t\tvar clazz = this.getAttribute(\"class\");\r\n");
      out.write("\t\t\t\t\t\tvar coluna = parseInt(el.parent().attr(\"coluna\")); \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tif(clazz == \"valor\")\t\r\n");
      out.write("\t\t\t\t\t\t\tpai.changeHiddenName(this,pai.tableHeaderPrefix + \"[\" + (coluna - 1) + \"].descFator\");\r\n");
      out.write("\t\t\t\t\t\telse if (clazz == \"idvalorheader\")\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tpai.changeHiddenName(this,pai.tableHeaderPrefix + \"[\" + (coluna - 1) + \"].id\");\r\n");
      out.write("\t\t\t\t\t\t//$(this).attr(\"name\",pai.tableHeaderPrefix + \"[\" + (coluna - 1) + \"].descFator\");\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t/*\r\n");
      out.write("\t\t\t\t\tcabecalho.find(\".idvalorheader\").each(function(){\r\n");
      out.write("\t\t\t\t\t\tvar el = $(this);\r\n");
      out.write("\t\t\t\t\t\tvar coluna = parseInt(el.parent().attr(\"coluna\"));\r\n");
      out.write("\t\t\t\t\t\tif($.browser.msie){\r\n");
      out.write("\t\t\t\t\t\t\tpai.changeHiddenName(this,pai.tableHeaderPrefix + \"[\" + (coluna - 1) + \"].id\");\t\t\t\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t$(this).attr(\"name\",pai.tableHeaderPrefix + \"[\" + (coluna - 1) + \"].id\");\r\n");
      out.write("\t\t\t\t\t\t} \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t});*/\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tchangeHiddenName : function (input_radio_old,newName){\r\n");
      out.write("\t\t\t\t\tvar valueKeep = input_radio_old.getAttribute(\"value\");\r\n");
      out.write("\t\t\t\t\tvar input_id = this.createHidden(newName);\r\n");
      out.write("\t\t\t\t\tinput_id.setAttribute(\"class\",input_radio_old.getAttribute(\"class\"));\r\n");
      out.write("\t\t\t\t\tinput_id.setAttribute(\"value\",valueKeep);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tinput_radio_old.parentNode.replaceChild(input_id, input_radio_old);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\treturn input_id;\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tchangeHiddenValue : function (input_radio_old,newValue){\r\n");
      out.write("\t\t\t\t\tvar valueKeep = input_radio_old.getAttribute(\"name\");\r\n");
      out.write("\t\t\t\t\tvar input_id = this.createHidden(valueKeep);\r\n");
      out.write("\t\t\t\t\tinput_id.setAttribute(\"class\",input_radio_old.getAttribute(\"class\"));\r\n");
      out.write("\t\t\t\t\tinput_id.setAttribute(\"value\",newValue);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tinput_radio_old.parentNode.replaceChild(input_id, input_radio_old);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\treturn input_id;\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tchangeCheckboxName : function (input_radio_old,newName){\r\n");
      out.write("\t\t\t\t\tvar input_id = this.createCheck(newName);\r\n");
      out.write("\t\t\t\t\tvar chk_val = input_radio_old.getAttribute(\"checked\");\r\n");
      out.write("\t\t\t\t\tvar valueKeep = input_radio_old.getAttribute(\"value\");\r\n");
      out.write("\t\t\t\t\tinput_id.setAttribute(\"class\",input_radio_old.getAttribute(\"class\"));\r\n");
      out.write("\t\t\t\t\tinput_id.setAttribute(\"value\",valueKeep);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tinput_radio_old.parentNode.replaceChild(input_id, input_radio_old);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif(chk_val)\r\n");
      out.write("\t\t\t\t\t\tinput_id.setAttribute(\"checked\",\"checked\");\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\treturn input_id;\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\trebuildLines : function (){\r\n");
      out.write("\t\t\t\t\tvar linha = 1; \r\n");
      out.write("\t\t\t\t\tvar pai = this;\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\ttabela.find(\"tr:gt(0)\").each(function(){\r\n");
      out.write("\t\t\t\t\t\tvar tr = $(this);\r\n");
      out.write("\t\t\t\t\t\ttr.attr(\"linha\",linha);\r\n");
      out.write("\t\t\t\t\t\ttr.attr(\"class\",(linha % 2 ? 'txt_l1' : 'txt_l2'));\r\n");
      out.write("\t\t\t\t\t\tif($.browser.msie){ //coisa de sub-browser\r\n");
      out.write("\t\t\t\t\t\t\tvar input_valor = tr.find(\"input:not(:gt(2))\").each(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\tvar clazz = this.getAttribute(\"class\");\r\n");
      out.write("\t\t\t\t\t\t\t\tvar name = \"\";\r\n");
      out.write("\t\t\t\t\t\t\t\tif(clazz == \"valor\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname = pai.tablePrefix + \"[\" + (linha - 1) + \"].descIniciativa\";\t\r\n");
      out.write("\t\t\t\t\t\t\t\telse if(clazz == \"prioritariavalor\"){\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname = pai.changeCheckboxName(this,pai.tablePrefix + \"[\" + (linha - 1) + \"].prioritaria\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname = \"\";\r\n");
      out.write("\t\t\t\t\t\t\t\t}else if(clazz == \"idvalor\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname = pai.tablePrefix + \"[\" + (linha - 1) + \"].id\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\tif(name != \"\"){\r\n");
      out.write("\t\t\t\t\t\t\t\t\tmatrizFcs.table.changeHiddenName(this,name);\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t/*var input_valor = tr.find(\"input:first\").get(0);\r\n");
      out.write("\t\t\t\t\t\t\tpai.changeHiddenName(input_valor,pai.tablePrefix + \"[\" + (linha - 1) + \"].descIniciativa\");\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tinput_valor = tr.find(\"input:eq(1)\").get(0);\r\n");
      out.write("\t\t\t\t\t\t\tpai.changeHiddenName(input_valor,pai.tablePrefix + \"[\" + (linha - 1) + \"].prioritaria\");\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tinput_valor = tr.find(\"input:eq(2)\").get(0);\r\n");
      out.write("\t\t\t\t\t\t\tpai.changeHiddenName(input_valor,pai.tablePrefix + \"[\" + (linha - 1) + \"].id\");*/\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\ttr.find(\".valor\").attr(\"name\",pai.tablePrefix + \"[\" + (linha - 1) + \"].descIniciativa\");\r\n");
      out.write("\t\t\t\t\t\t\ttr.find(\".prioritariavalor\").attr(\"name\",pai.tablePrefix + \"[\" + (linha - 1) + \"].prioritaria\");\r\n");
      out.write("\t\t\t\t\t\t\ttr.find(\".idvalor\").attr(\"name\",pai.tablePrefix + \"[\" + (linha - 1) + \"].id\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tvar col = 0;\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\ttr.find(\"td:gt(1)\").each(function(){\r\n");
      out.write("\t\t\t\t\t\t\tvar td = $(this);\r\n");
      out.write("\t\t\t\t\t\t\tif($.browser.msie){ //é gambiarra mesmo! Die ie!\r\n");
      out.write("\t\t\t\t\t\t\t\t//http://alt-tag.com/blog/archives/2006/02/ie-dom-bugs/\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\tvar input_radio_old = td.find(\":first\").get(0);\r\n");
      out.write("\t\t\t\t\t\t\t\tvar valueKeep = input_radio_old.getAttribute(\"value\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\tvar input_id = pai.createHidden(pai.tablePrefix + \"[\" + (linha - 1) + \"].listaMatrizFcsIniciativaFator[\"+(col)+\"].id\");\r\n");
      out.write("\t\t\t\t\t\t\t\tinput_id.setAttribute(\"class\",\"idvalor\");\r\n");
      out.write("\t\t\t\t\t\t\t\tinput_id.setAttribute(\"value\",valueKeep);\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\tinput_radio_old.parentNode.replaceChild(input_id, input_radio_old);\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\ttd.find(\"div input\").each(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\tinput_radio_old = $(this).get(0);\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar checkKeep = input_radio_old.getAttribute(\"checked\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar valueKeep = input_radio_old.getAttribute(\"value\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\tinput_id = pai.createRadio(pai.tablePrefix + \"[\" + (linha - 1) + \"].listaMatrizFcsIniciativaFator[\"+(col)+\"].itemFatorAvaliacao\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\tinput_radio_old.parentNode.replaceChild(input_id, input_radio_old);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif(checkKeep)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tinput_id.setAttribute(\"checked\",\"checked\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\tinput_id.setAttribute(\"value\",valueKeep);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\ttd.find(\":first\").attr(\"name\",pai.tablePrefix + \"[\" + (linha - 1) + \"].listaMatrizFcsIniciativaFator[\"+(col)+\"].id\");\r\n");
      out.write("\t\t\t\t\t\t\t\ttd.find(\".radios input\").each(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(this).attr(\"name\",pai.tablePrefix + \"[\" + (linha - 1) + \"].listaMatrizFcsIniciativaFator[\"+(col)+\"].itemFatorAvaliacao\");\t\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\tcol++;\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tlinha++;\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tgetCabecalho : function (){\r\n");
      out.write("\t\t\t\t\tif(this.cabecalho == null)\r\n");
      out.write("\t\t\t\t\t\tthis.cabecalho = tabela.find(\"#cabecalho\"); \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\treturn this.cabecalho;\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tcreateTr : function (parametros){\r\n");
      out.write("\t\t\t\t\tvar tr = $('<tr></tr>')\r\n");
      out.write("\t\t\t\t\ttr = this.buildParametros(tr,parametros);\r\n");
      out.write("\t\t\t\t\treturn tr;\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tcreateTd : function (content,parametros){\r\n");
      out.write("\t\t\t\t\tvar td = $('<td></td>')\r\n");
      out.write("\t\t\t\t\tif(content != null && content != \"\"){\r\n");
      out.write("\t\t\t\t\t\tvar el = $(\"<span></span>\");\r\n");
      out.write("\t\t\t\t\t\tel.html(content);\r\n");
      out.write("\t\t\t\t\t\tel.attr(\"class\",\"content\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\ttd.append(el);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\ttd = this.buildParametros(td,parametros);\r\n");
      out.write("\t\t\t\t\t//td.html(\"teste\");\r\n");
      out.write("\t\t\t\t\treturn td;\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tbuildParametros : function(elemento,parametros){\r\n");
      out.write("\t\t\t\t\tif(parametros) {\r\n");
      out.write("\t\t\t\t\t\tfor (parametro in parametros){\r\n");
      out.write("\t\t\t\t\t\t\telemento.attr(parametro,parametros[parametro]);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\treturn elemento;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\t\r\n");
      out.write("\t}).call(matrizFcs,jQuery,$(\"#tabelaFCS\"));\r\n");
      out.write("\t\r\n");
      out.write("\tfunction carregaObjetivosEstrategicos() {\r\n");
      out.write("\t\tsetTimeout('form[\\'objetivoMapaEstrategico\\'].loadItens()',1);\r\n");
      out.write("\t}\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction imprimirMatrizFCS(){\r\n");
      out.write("\t\tform['ACAO'].value = \"gerar\";\r\n");
      out.write("\t\tform.action = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/sgm/report/MatrizFCS\";\r\n");
      out.write("\t\tform.submit(); \r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_if_9(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_if_11(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction escolherUnidadeGerencialunidadeGerencial(){\r\n");
      out.write(" \t\tif(document.getElementById('botaoEscolherunidadeGerencial').innerHTML != 'Limpar'){\r\n");
      out.write(" \t\t\tif (form['planoGestao'].value != '<null>') {\r\n");
      out.write("\t \t\t\twindow.open('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/util/UnidadeGerencialTreeView?propriedade=unidadeGerencial&unidadeGerencial='+form['unidadeGerencial'].value+'&planoGestao='+form['planoGestao'].value, 'ugtv', 'directories=no,height=450,width=400,top=50,left=200,location=no,menubar=no,status=no,toolbar=no,resizable=yes');\r\n");
      out.write("\t \t\t}\r\n");
      out.write("\t \t\telse {\r\n");
      out.write("\t \t\t\talert('Favor selecionar o ano da gestão.');\r\n");
      out.write("\t \t\t}\t\t\t\t\t \t\t\r\n");
      out.write(" \t\t} else {\r\n");
      out.write(" \t\t\tvar somenteLeitura = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty HIDEBOTAOSALVAR && HIDEBOTAOSALVAR}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write(" \t\t\tif (somenteLeitura || !matrizFcs.table.matrizLoaded || confirm(\"Se for feita a alteração deste valor, os dados não salvos serão perdidos. Deseja continuar mesmo assim?\") ){\r\n");
      out.write(" \t\t\t\tdocument.location.href = document.location.href//hack para erro do limpar \r\n");
      out.write("\t \t\t\tform['unidadeGerencial'].value = '<null>';\r\n");
      out.write("\t \t\t\tform['unidadeGerencial_label'].value = '';\r\n");
      out.write("\t \t\t\tdocument.getElementById('botaoEscolherunidadeGerencial').innerHTML = 'Escolher';\r\n");
      out.write(" \t\t\t\t//$(\"select[name='objetivoMapaEstrategico']\").html('');\r\n");
      out.write("\t\t \t\t//$(\"select[name='fatorAvaliacao']\").html('');\r\n");
      out.write("\t \t\t\tmatrizFcs.filtro.limparCampos(2); $(\"#contMatriz\").hide(); \r\n");
      out.write("\t\t \t\t\r\n");
      out.write("\t\t \t\t$(\"#unidadeGerencial_label\").removeAttr(\"readOnly\");\r\n");
      out.write("\t\t \t\t\r\n");
      out.write("\t\t \t\t$(\"#unidadeGerencial_label\").autocomplete('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/util/UnidadeGerencialAutoComplete?planoGestao='+form['planoGestao'].value, {\r\n");
      out.write("\t\t\t\t\twidth: 300,\r\n");
      out.write("\t\t\t\t\tmultiple: true,\r\n");
      out.write("\t\t\t\t\tmatchContains: true,\r\n");
      out.write("\t\t\t\t\tformatItem: formatItem,\r\n");
      out.write("\t\t\t\t\tformatResult: formatResult,\r\n");
      out.write("\t\t\t\t\tmax: 100\r\n");
      out.write("\t\t\t\t}).result(function(event, data, formatted) {\r\n");
      out.write("\t\t\t\t\tdata[0] = stripJavascriptTags(data[0]);\r\n");
      out.write("\t\t\t\t\tformatted = stripJavascriptTags(formatted);\r\n");
      out.write("\t\t\t\t\t$(\"#unidadeGerencial_label\").val(formatted);\r\n");
      out.write("\t\t\t\t\t$(\"#unidadeGerencial_value\").val('br.com.linkcom.sgm.beans.UnidadeGerencial[id=' + data[1] + ']');\r\n");
      out.write("\t\t\t\t\tdocument.getElementById('botaoEscolherunidadeGerencial').innerHTML = 'Limpar';\r\n");
      out.write("\t\t\t \t\t\tform['unidadeGerencial'].onchange();\r\n");
      out.write("\t\t\t \t\t$(\"#unidadeGerencial_label\").unautocomplete();\r\n");
      out.write("\t\t\t \t\t$(\"#unidadeGerencial_label\").attr(\"readOnly\", \"true\");\r\n");
      out.write("\t\t\t \t\t//limpar campos\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\t\t\t\r\n");
      out.write(" \t\t}\r\n");
      out.write(" \t}\r\n");
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
    _jspx_th_t_tela_0.setTitulo("Matriz de Iniciativas x FCS");
    _jspx_th_t_tela_0.setJspBody(new matrizFCS_jspHelper( 0, _jspx_page_context, _jspx_th_t_tela_0, null));
    _jspx_th_t_tela_0.doTag();
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
    _jspx_th_t_janelaFiltro_0.setJspBody(new matrizFCS_jspHelper( 1, _jspx_page_context, _jspx_th_t_janelaFiltro_0, null));
    _jspx_th_t_janelaFiltro_0.doTag();
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
    _jspx_th_t_propertyConfig_0.setShowLabel(new Boolean(true));
    _jspx_th_t_propertyConfig_0.setRenderAs("double");
    _jspx_th_t_propertyConfig_0.setJspBody(new matrizFCS_jspHelper( 2, _jspx_page_context, _jspx_th_t_propertyConfig_0, null));
    _jspx_th_t_propertyConfig_0.doTag();
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
    _jspx_th_n_group_0.setColumns(2);
    _jspx_th_n_group_0.setShowBorder(new Boolean(false));
    _jspx_th_n_group_0.setJspBody(new matrizFCS_jspHelper( 3, _jspx_page_context, _jspx_th_n_group_0, null));
    _jspx_th_n_group_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_comboReloadGroup_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:comboReloadGroup
    br.com.linkcom.neo.view.ComboReloadGroupTag _jspx_th_n_comboReloadGroup_0 = new br.com.linkcom.neo.view.ComboReloadGroupTag();
    _jspx_th_n_comboReloadGroup_0.setJspContext(_jspx_page_context);
    _jspx_th_n_comboReloadGroup_0.setParent(_jspx_parent);
    _jspx_th_n_comboReloadGroup_0.setUseAjax(new Boolean(true));
    _jspx_th_n_comboReloadGroup_0.setJspBody(new matrizFCS_jspHelper( 4, _jspx_page_context, _jspx_th_n_comboReloadGroup_0, null));
    _jspx_th_n_comboReloadGroup_0.doTag();
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
    _jspx_th_t_property_0.setName("planoGestao");
    _jspx_th_t_property_0.setMode("input");
    _jspx_th_t_property_0.setDynamicAttribute(null, "onchange", new String("matrizFcs.filtro.limparCampos(1);matrizFcs.filtro.liberarTela(event);"));
    _jspx_th_t_property_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_output_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:output
    br.com.linkcom.neo.view.OutputTag _jspx_th_n_output_0 = new br.com.linkcom.neo.view.OutputTag();
    _jspx_th_n_output_0.setJspContext(_jspx_page_context);
    _jspx_th_n_output_0.setParent(_jspx_parent);
    _jspx_th_n_output_0.setStyleClass("desc11");
    _jspx_th_n_output_0.setValue(new String("Unidade Gerencial"));
    _jspx_th_n_output_0.doTag();
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
    _jspx_th_n_panel_0.setJspBody(new matrizFCS_jspHelper( 5, _jspx_page_context, _jspx_th_n_panel_0, null));
    _jspx_th_n_panel_0.doTag();
    return false;
  }

  private boolean _jspx_meth_f_unidadeGerencialInput_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:unidadeGerencialInput
    org.apache.jsp.tag.web.unidadeGerencialInput_tag _jspx_th_f_unidadeGerencialInput_0 = new org.apache.jsp.tag.web.unidadeGerencialInput_tag();
    _jspx_th_f_unidadeGerencialInput_0.setJspContext(_jspx_page_context);
    _jspx_th_f_unidadeGerencialInput_0.setParent(_jspx_parent);
    _jspx_th_f_unidadeGerencialInput_0.setName("unidadeGerencial");
    _jspx_th_f_unidadeGerencialInput_0.setOnchange("matrizFcs.filtro.recarregarTela()");
    _jspx_th_f_unidadeGerencialInput_0.setEstiloclasse("required");
    _jspx_th_f_unidadeGerencialInput_0.doTag();
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
    _jspx_th_t_property_1.setName("perspectivaMapaEstrategico");
    _jspx_th_t_property_1.setMode("input");
    _jspx_th_t_property_1.setDynamicAttribute(null, "style", new String("width:500px;"));
    _jspx_th_t_property_1.setItens(new String("perspectivaMapaEstrategicoService.findByUnidadeGerencialThroughMapaEstrategico(unidadeGerencial,true)"));
    _jspx_th_t_property_1.setDynamicAttribute(null, "onchange", new String("carregaObjetivosEstrategicos(); matrizFcs.filtro.limparCampos(3); matrizFcs.filtro.liberarTela(event)"));
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
    _jspx_th_t_property_2.setName("objetivoMapaEstrategico");
    _jspx_th_t_property_2.setMode("input");
    _jspx_th_t_property_2.setDynamicAttribute(null, "style", new String("width:500px;"));
    _jspx_th_t_property_2.setItens(new String("objetivoMapaEstrategicoService.findByUnidadeGerencialPerspectivaThroughMapaEstrategico(unidadeGerencial,perspectivaMapaEstrategico)"));
    _jspx_th_t_property_2.setDynamicAttribute(null, "onchange", new String("matrizFcs.filtro.limparCampos(4);matrizFcs.filtro.liberarTela(event)"));
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
    _jspx_th_t_property_3.setItens((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fatorAvaliacaoItens}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_t_property_3.setName("fatorAvaliacao");
    _jspx_th_t_property_3.setId("fatorAvaliacao");
    _jspx_th_t_property_3.setMode("input");
    _jspx_th_t_property_3.setDynamicAttribute(null, "onchange", new String("matrizFcs.table.loadItemFatorAvaliacao(this);matrizFcs.filtro.liberarTela(event)"));
    _jspx_th_t_property_3.doTag();
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!SEMPERMISSAO}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<div id=\"contMatriz\" style=\"display: none;\">\r\n");
        out.write("\t\t\t\t<div class=\"fd_tela_titulo\" style=\"margin-top:20px;\">Matriz</div>\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_if_1(_jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<div class=\"containerTabelaFCS\" style=\"width:970px; overflow: auto;\">\r\n");
        out.write("\t\t\t\t\t<table id=\"tabelaFCS\" class=\"fd_tabela1\" width=\"100%\" cellspacing=\"1\">\r\n");
        out.write("\t\t\t\t\t\t<tr class=\"txt_tit\" id=\"cabecalho\">\r\n");
        out.write("\t\t\t\t\t\t\t<td>Prioritária?</td>\r\n");
        out.write("\t\t\t\t\t\t\t<td align=\"center\"><img src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/images/img_coluna_iniciativas.png\" /></td>\r\n");
        out.write("\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t</table>\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t<div align=\"right\">\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_n_hasAuthorization_0(_jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_if_2(_jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t</div>\r\n");
        out.write("\t\t");
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

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty HIDEBOTAOSALVAR}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\t\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_n_panelGrid_0(_jspx_th_c_if_1, _jspx_page_context))
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

  private boolean _jspx_meth_n_panelGrid_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panelGrid
    br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_0 = new br.com.linkcom.neo.view.PanelGridTag();
    _jspx_th_n_panelGrid_0.setJspContext(_jspx_page_context);
    _jspx_th_n_panelGrid_0.setParent(_jspx_th_c_if_1);
    _jspx_th_n_panelGrid_0.setColumns(new Integer(2));
    _jspx_th_n_panelGrid_0.setJspBody(new matrizFCS_jspHelper( 6, _jspx_page_context, _jspx_th_n_panelGrid_0, null));
    _jspx_th_n_panelGrid_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_output_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:output
    br.com.linkcom.neo.view.OutputTag _jspx_th_n_output_1 = new br.com.linkcom.neo.view.OutputTag();
    _jspx_th_n_output_1.setJspContext(_jspx_page_context);
    _jspx_th_n_output_1.setParent(_jspx_parent);
    _jspx_th_n_output_1.setStyleClass("desc11");
    _jspx_th_n_output_1.setValue(new String("Novo Fator crítico de sucesso"));
    _jspx_th_n_output_1.doTag();
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
    _jspx_th_n_panel_1.setJspBody(new matrizFCS_jspHelper( 7, _jspx_page_context, _jspx_th_n_panel_1, null));
    _jspx_th_n_panel_1.doTag();
    return false;
  }

  private boolean _jspx_meth_n_output_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:output
    br.com.linkcom.neo.view.OutputTag _jspx_th_n_output_2 = new br.com.linkcom.neo.view.OutputTag();
    _jspx_th_n_output_2.setJspContext(_jspx_page_context);
    _jspx_th_n_output_2.setParent(_jspx_parent);
    _jspx_th_n_output_2.setStyleClass("desc11");
    _jspx_th_n_output_2.setValue(new String("Nova iniciativa"));
    _jspx_th_n_output_2.doTag();
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
    _jspx_th_n_panel_2.setJspBody(new matrizFCS_jspHelper( 8, _jspx_page_context, _jspx_th_n_panel_2, null));
    _jspx_th_n_panel_2.doTag();
    return false;
  }

  private boolean _jspx_meth_n_hasAuthorization_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:hasAuthorization
    br.com.linkcom.neo.view.HasAuthorizationTag _jspx_th_n_hasAuthorization_0 = new br.com.linkcom.neo.view.HasAuthorizationTag();
    _jspx_th_n_hasAuthorization_0.setJspContext(_jspx_page_context);
    _jspx_th_n_hasAuthorization_0.setParent(_jspx_th_c_if_0);
    _jspx_th_n_hasAuthorization_0.setUrl("/sgm/report/MatrizFCS");
    _jspx_th_n_hasAuthorization_0.setJspBody(new matrizFCS_jspHelper( 9, _jspx_page_context, _jspx_th_n_hasAuthorization_0, null));
    _jspx_th_n_hasAuthorization_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty HIDEBOTAOSALVAR}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<input type=\"submit\"  class=\"botao_normal\" onclick=\"javascript:if(confirm('Tem certeza que deseja excluir toda a matriz?')){matrizFcs.filtro.excluir();}\" value=\"Excluir matriz\">&nbsp;\r\n");
        out.write("\t\t\t\t\t\t<input type=\"submit\"  class=\"botao_normal\" onclick=\"javascript:matrizFcs.filtro.salvar();\" value=\"salvar\">&nbsp;\r\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty HIDEBOTAOSALVAR}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\tvar imagem = this.buildImgAcao(\"Coluna\");\r\n");
        out.write("\t\t\t\t\t\ttd.prepend(imagem);\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${HIDEBOTAOSALVAR}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\tinput_id.setAttribute(\"disabled\",\"true\");\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${HIDEBOTAOSALVAR}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\tinput_id.setAttribute(\"disabled\",\"true\");\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty HIDEBOTAOSALVAR}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\tvar imagem = this.buildImgAcao(\"Linha\");\r\n");
        out.write("\t\t\t\t\t\ttd.prepend(imagem);\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_if_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent(null);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${HIDEBOTAOSALVAR}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\tradio.setAttribute(\"disabled\",\"true\");\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_if_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent(null);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${HIDEBOTAOSALVAR}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\tradio.setAttribute(\"disabled\",\"true\");\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_c_if_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent(null);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty vindoDaAcaoSalvar}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\tmatrizFcs.filtro.hideFields();\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_if_10(_jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\t\t\t\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
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
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!SEMPERMISSAO}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\tmatrizFcs.filtro.limparCampos(2);\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }

  private boolean _jspx_meth_c_if_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent(null);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vindoDaAcaoSalvar}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\t\r\n");
        out.write("\t\t\tmatrizFcs.filtro.limparCampos(2);\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
    return false;
  }

  private class matrizFCS_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public matrizFCS_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t<input type=\"hidden\" name=\"reload\" value=\"\" id=\"idReload\">\r\n");
      out.write("\t");
      if (_jspx_meth_t_janelaFiltro_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write('\r');
      out.write('\n');
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"matrizFCS.id\" value=\"\" id=\"idMatriz\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_t_propertyConfig_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_if_0(_jspx_parent, _jspx_page_context))
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
      if (_jspx_meth_n_group_0(_jspx_parent, _jspx_page_context))
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
      if (_jspx_meth_n_comboReloadGroup_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_property_3(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      return false;
    }
    public boolean invoke4( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_t_property_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_output_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_panel_0(_jspx_parent, _jspx_page_context))
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
      out.write("\t\t\t\t");
      return false;
    }
    public boolean invoke5( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_f_unidadeGerencialInput_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      return false;
    }
    public boolean invoke6( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_n_output_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_n_output_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\t\r\n");
      out.write("\t\t\t\t\t");
      return false;
    }
    public boolean invoke7( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" style=\"width:400px;\" id=\"txt_novofcs\" name=\"txt_novofcs\" class=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;<button class=\"botao_normal\" style=\"width: 80px;\" onclick=\"matrizFcs.table.addColumn()\" type=\"button\">Criar</button>\r\n");
      out.write("\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke8( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" style=\"width:400px;\" id=\"txt_novainiciativa\" name=\"txt_novainiciativa\" class=\"required\"/>\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;<button class=\"botao_normal\" style=\"width: 80px;\" onclick=\"matrizFcs.table.addLine()\" type=\"button\">Criar</button>\r\n");
      out.write("\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke9( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\"  class=\"botao_normal\" onclick=\"javascript:imprimirMatrizFCS();\" value=\"imprimir\">&nbsp;\r\n");
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
