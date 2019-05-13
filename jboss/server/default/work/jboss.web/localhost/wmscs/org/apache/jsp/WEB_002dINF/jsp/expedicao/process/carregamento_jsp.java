package org.apache.jsp.WEB_002dINF.jsp.expedicao.process;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.linkcom.wms.geral.bean.Tipooperacao;

public final class carregamento_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jQTreeTable.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.tablednd.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\ta.inativo, a.inativo:hover{\r\n");
      out.write("\t\tcolor:#999999;\r\n");
      out.write("\t\ttext-decoration:none;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_t_tela_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tvar MAP = new Array();\r\n");
      out.write("\tvar TABELAROTEIRIZACAO = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${TABELAROTEIRIZACAO}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\tvar MAPAPEDIDOS = new Object();\r\n");
      out.write("\tvar MAPAPEDIDOSCHEKED = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PEDIDOSCARREGAMENTO}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\t\r\n");
      out.write("\tvar PESOTOTAL = 0.0;\r\n");
      out.write("\tvar CUBAGEMTOTAL = 0.0;\r\n");
      out.write("\tvar VALORTOTAL = 0.0;\r\n");
      out.write("\tvar TOTALPRODUTOS = 0;\r\n");
      out.write("\tvar TOTALENTREGAS = 0;\r\n");
      out.write("\t\r\n");
      out.write("\tvar PESOVEICULO = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PESOVEICULO}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\tvar CUBAGEMVEICULO = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${CUBAGEMVEICULO}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\tvar PALETESVEICULO = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PALETESVEICULO}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\t\r\n");
      out.write("\tvar PESOVEICULO_ATUAL = -1.0;\r\n");
      out.write("\tvar CUBAGEMVEICULO_ATUAL = -1.0;\r\n");
      out.write("\t\r\n");
      out.write("\tfunction addToArray(obj){\r\n");
      out.write("\t\tMAP.push(obj);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction makeStrMap(){\r\n");
      out.write("\t\tvar i,str=\"\";\r\n");
      out.write("\t\tfor(i=0;i<MAP.length;i++){\r\n");
      out.write("\t\t\tstr +=MAP[i].cdformacaocarga+\",\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn str;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction addToDataGrid(obj,i){\r\n");
      out.write("\t\tvar str = \"\";\r\n");
      out.write("\t\tstr += \"<tr val=\\\"\"+obj.cdformacaocarga+\"\\\" fiveKeys=\\\"\"+obj.cliente.cdpessoa+\",\"+obj.praca.cdpraca+\",\"+obj.tipooperacao.cdtipooperacao+\",\"+obj.cep+\",\"+obj.cdpedidovenda+\"\\\" valign=\\\"middle\\\">\";\r\n");
      out.write("\t\tstr += \"<td style=\\\"width:15px;\\\"><input class=\\\"checkBoxClass\\\" type=\\\"checkbox\\\" name=\\\"selecteditens\\\" value=\\\"\"+obj.cdformacaocarga+\"\\\"></td>\";\r\n");
      out.write("\t\tstr += \"<td style=\\\"width:190px;\\\">\"+obj.rota.nome+\"</td>\";\r\n");
      out.write("\t\tstr += \"<td style=\\\"width:190px;\\\">\"+obj.praca.nome+\"</td>\";\r\n");
      out.write("\r\n");
      out.write("\t\tstr += \"<td style=\\\"width:41px;\\\">\"+obj.tipooperacao.sigla+\"</td>\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif (obj.nomedepositotransbordo && obj.nomedepositotransbordo != 'null')\r\n");
      out.write("\t\t\tstr += \"<td style=\\\"width:149px;\\\">\"+obj.nomedepositotransbordo+\"</td>\";\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t\tstr += \"<td style=\\\"width:149px;\\\"></td>\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif (");
      out.print(Tipooperacao.TRANSFERENCIA_CD_CD_CLIENTE.getCdtipooperacao());
      out.write(" == obj.tipooperacao.cdtipooperacao){\r\n");
      out.write("\t\t\tstr += \"<td style=\\\"width:149px;\\\">\"+obj.filialentrega.nome+\"</td>\";\t\t\r\n");
      out.write("\t\t}else if (");
      out.print(Tipooperacao.TRANSFERENCIA_FILIAL_ENTREGA.getCdtipooperacao());
      out.write(" == obj.tipooperacao.cdtipooperacao){\r\n");
      out.write("\t\t\tstr += \"<td style=\\\"width:149px;\\\">\"+obj.filialentrega.nome+\"</td>\";\r\n");
      out.write("\t\t}else{ \r\n");
      out.write("\t\t\tstr += \"<td style=\\\"width:149px;\\\">\"+obj.cliente.nome+\"</td>\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar filialemissao = '';\r\n");
      out.write("\t\tif (obj.filialemissao && (obj.filialemissao != 'undefined'))\r\n");
      out.write("\t\t\tfilialemissao = ' / ' + obj.filialemissao;\r\n");
      out.write("\r\n");
      out.write("\t\tstr += \"<td style=\\\"width:149px;\\\">\" + obj.numeropedido + filialemissao + \"</td>\";\r\n");
      out.write("\t\tstr += \"<td id=\\\"totalItens\"+obj.cdformacaocarga+\"\\\" style=\\\"width:75px; text-align:right;\\\">\"+obj.totalItens+\"</td>\";\r\n");
      out.write("\t\tstr += \"<td id=\\\"peso\"+obj.cdformacaocarga+\"\\\" style=\\\"width:80px; text-align:right;\\\">\"+parseFloat(obj.peso).toFixed(3).replace(\".\",\",\")+\"</td>\";\r\n");
      out.write("\t\tstr += \"<td id=\\\"cubagem\"+obj.cdformacaocarga+\"\\\" style=\\\"width:60px; text-align:right; padding-left:4px\\\">\"+parseFloat(obj.cubagem).toFixed(3).replace(\".\",\",\")+\"</td>\";\r\n");
      out.write("\t\tstr += \"<td id=\\\"valor\"+obj.cdformacaocarga+\"\\\" style=\\\"width:80px; text-align:right;\\\">\"+obj.valor+\"</td>\";\r\n");
      out.write("\t\tstr += \"<td style='width:120px; text-align: center;'><input class='checkBoxClass' readonly='readonly' onclick='return false;'  type='checkbox' name='Prioridade' \" + (obj.prioridade == \"true\" ? \"checked='checked'\" : \"\") + \" /></td>\";\r\n");
      out.write("       \r\n");
      out.write("\t\tstr += \"</tr>\";\r\n");
      out.write("\t\t$(\"#tableRoterizacao\").append(str);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\taddToArray(obj);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction reloadDataGrid(){\r\n");
      out.write("\t\tif(form['dtentregainicio'].value.indexOf(\"_\") >= 0) form['dtentregainicio'].value = \"\";\r\n");
      out.write("\t\tif(form['dtentregafim'].value.indexOf(\"_\") >= 0) form['dtentregafim'].value = \"\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(!validatePeriodoEnrega())\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\tform['ACAO'].value = \"makeCarregamento\";\r\n");
      out.write("\t\tvar params = $(form).fastSerialize();\r\n");
      out.write("\t\tvar paramStr = \"\";\r\n");
      out.write("\t\tvar i;\r\n");
      out.write("\t\tfor\t(i=0;i<params.length;i++){\r\n");
      out.write("\t\t\tparamStr += \"&\"+params[i].name+\"=\"+params[i].value;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#iframeArea\").empty().append('<iframe id=\"ifm\" frameborder=\"0\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Carregamento?a=1'+paramStr+'\" width=\"960px\" height=\"200px\" scrolling=\"auto\"></iframe>');\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction validatePeriodoEnrega(){\r\n");
      out.write("\t\tif(form['dtentregafim'].value != \"\" && form['dtentregainicio'].value != \"\"){\r\n");
      out.write("\t\t\tif($w.comparaData(form['dtentregainicio'].value,form['dtentregafim'].value) < 0){\r\n");
      out.write("\t\t\t\talert(\"O período de entrega não possui um intervalo de datas válido.\");\r\n");
      out.write("\t\t\t\tclearFilter();\r\n");
      out.write("\t\t\t\tloadDataGrid();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction loadDataGrid(){\r\n");
      out.write("\t\tshowCarregando();\r\n");
      out.write("\t\tsetTimeout(function(){reloadDataGrid();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t},50);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\tfunction descer(){\r\n");
      out.write("\t\tif(!validatePeriodoEnrega())\r\n");
      out.write("\t\t\treturn;\t\t\r\n");
      out.write("\t\tvar ifm = document.getElementById(\"ifm\").contentWindow;\r\n");
      out.write("\r\n");
      out.write("\t\tTABELAROTEIRIZACAO = ifm.descer();\r\n");
      out.write("\t\tif(TABELAROTEIRIZACAO != false){\r\n");
      out.write("\t\t\tif(addToRoteirizacao(TABELAROTEIRIZACAO)){\r\n");
      out.write("\t\t\t\tsave(false);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction addToRoteirizacao(tabelaRoteirizacao){\r\n");
      out.write("\t\tvar i = 0;\r\n");
      out.write("\t\tvar test;\r\n");
      out.write("\t\tfor\t(i=0;i<tabelaRoteirizacao.length;i++){\r\n");
      out.write("\t\t\ttest = !containsRoteirizacao(tabelaRoteirizacao[i]);\r\n");
      out.write("\t\t\tif(test){\r\n");
      out.write("\t\t\t\taddToDataGrid(tabelaRoteirizacao[i],i + 1);\r\n");
      out.write("\t\t\t\taddValues(tabelaRoteirizacao[i]);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(i > 0){\r\n");
      out.write("\t\t\t$(\"#tableRoterizacao\").tableDnD({\r\n");
      out.write("\t\t\t\tonDragClass: \"onDrop\",\r\n");
      out.write("\t\t\t\tonDrop: function() {\r\n");
      out.write("\t\t\t\t\tstripe();\r\n");
      out.write("\t            }\t        \r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t \tsetTotalEntregasRoteirizacao();\r\n");
      out.write("\t\tstripe(); \r\n");
      out.write("\t\tupdateFields();\r\n");
      out.write("\t\treturn test;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/*Verifica se a tabela de roteirização contem o valor que esta sendo adicionado.\r\n");
      out.write("\t  Caso tenha ja soma os valores.\r\n");
      out.write("\t*/\r\n");
      out.write("\tfunction containsRoteirizacao(obj){\r\n");
      out.write("\t\tvar fiveKeys = obj.cliente.cdpessoa+\",\"+obj.praca.cdpraca+\",\"+obj.tipooperacao.cdtipooperacao+\",\"+obj.cep+\",\"+obj.cdpedidovenda;\r\n");
      out.write("\t\tvar contains;\r\n");
      out.write("\t\t$((\"#tableRoterizacao tr\")).each(function(){\r\n");
      out.write("\t\t\tif($(this).attr(\"fiveKeys\") == fiveKeys){\r\n");
      out.write("\t\t\t\tcontains = true;\r\n");
      out.write("\t\t\t\tobj.cdformacaocarga = $(this).attr(\"val\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tif(contains){\r\n");
      out.write("\t\t\tvar plus = \"\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$w.getJSON(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Carregamento\",\r\n");
      out.write("\t \t    {\"ACAO\":\"getCdsPedidovenda\",\"chave\":fiveKeys},function(json){\r\n");
      out.write("\t \t    \tplus = json.cds;\r\n");
      out.write("\t\t\t\tvar arrayChecked = getArrayCheckedByCliente(obj.cdformacaocarga);\r\n");
      out.write("\t\t\t\tvar cubagem = parseFloat(obj.cubagem).toFixed(3).replace(\".\",\",\");\r\n");
      out.write("\t\t\t\tvar peso = parseFloat(obj.peso).toFixed(3).replace(\".\",\",\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\tif (!arrayChecked)\r\n");
      out.write("\t\t\t\t\tarrayChecked = \"\";\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tMAPAPEDIDOSCHEKED[obj.cdformacaocarga] = arrayChecked + plus;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tfor(i = 0; i < MAP.length ; i++){\r\n");
      out.write("\t\t\t\t\tif(MAP[i].cdformacaocarga == obj.cdformacaocarga){\r\n");
      out.write("\t\t\t\t\t\tremoveValues(MAP[i]);\r\n");
      out.write("\t\t\t\t\t\tMAP[i].valor = $w.sumMoney(obj.valor,MAP[i].valor);\r\n");
      out.write("\t\t\t\t\t\tMAP[i].totalItens = parseFloat(MAP[i].totalItens) + parseFloat(obj.totalItens);\r\n");
      out.write("\t\t\t\t\t\tMAP[i].cubagem = (parseFloat(MAP[i].cubagem) + parseFloat(cubagem.replace(\",\",\".\"))).toFixed(3);\r\n");
      out.write("\t\t\t\t\t\tMAP[i].peso = (parseFloat(MAP[i].peso) + parseFloat(peso.replace(\",\",\".\"))).toFixed(3);\r\n");
      out.write("\t\t\t\t\t\taddValues(MAP[i]);\r\n");
      out.write("\t\t\t\t\t\tupdateDataGrid(MAP[i]);\r\n");
      out.write("\t\t\t\t\t\tupdateFields();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tsave(false);\r\n");
      out.write("\t \t    });\r\n");
      out.write("\t \t    \r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/*Muda o quantidade de entregas da área de roteirização*/\r\n");
      out.write("\tfunction setTotalEntregasRoteirizacao(){\r\n");
      out.write("\t\t$w.getJSON(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Carregamento\",\r\n");
      out.write("\t\t\t\t   {\"ACAO\":\"getTotalEntregas\",\"listaPedidoVendaProduto\": makeStrMap()},\r\n");
      out.write("\t\t\t\t   function(json){\r\n");
      out.write("\t\t\t\t   \t\tTOTALENTREGAS = json.total;\r\n");
      out.write("\t\t\t\t\t\t$(\"#totalEntregas\").html(\"Total de entregas: <b>\"+json.total+\"</b>\");\r\n");
      out.write("\t\t\t\t   });\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction addValues(obj){\r\n");
      out.write("\t\tif(!isNaN(obj.peso))\r\n");
      out.write("\t\t\tPESOTOTAL += parseFloat(obj.peso);\r\n");
      out.write("\t\tif(!isNaN(obj.cubagem))\r\n");
      out.write("\t\t\tCUBAGEMTOTAL += parseFloat(obj.cubagem);\r\n");
      out.write("\t\tif(!isNaN($w.prepareObject(obj.valor)))\r\n");
      out.write("\t\t\tVALORTOTAL = $w.sumMoney(VALORTOTAL,obj.valor);\r\n");
      out.write("\t\tif(!isNaN(obj.totalItens))\r\n");
      out.write("\t\t\tTOTALPRODUTOS += parseInt(obj.totalItens);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction removeValues(obj){\r\n");
      out.write("\t\tif(!isNaN(obj.peso))\r\n");
      out.write("\t\t\tPESOTOTAL -= parseFloat(obj.peso);\r\n");
      out.write("\t\tif(!isNaN(obj.cubagem))\r\n");
      out.write("\t\t\tCUBAGEMTOTAL -= parseFloat(obj.cubagem);\r\n");
      out.write("\t\tif(!isNaN($w.prepareObject(obj.valor)))\r\n");
      out.write("\t\t\tVALORTOTAL = $w.subtractMoney(VALORTOTAL,obj.valor);\r\n");
      out.write("\t\tif(!isNaN(obj.totalItens))\r\n");
      out.write("\t\t\tTOTALPRODUTOS -= parseInt(obj.totalItens);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction updateFields(){\r\n");
      out.write("\t\t$('#dgt_peso').html(PESOTOTAL.toFixed(3).replace(\".\",\",\"));\r\n");
      out.write("\t\t$('#dgt_cub').html(CUBAGEMTOTAL.toFixed(3).replace(\".\",\",\"));\r\n");
      out.write("\t\t$('#dgt_valor').html(VALORTOTAL);\r\n");
      out.write("\t\t$('#dgt_numeroprod').html(TOTALPRODUTOS);\r\n");
      out.write("\t\tvalidateDimencoes();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction validateDimencoes(){\r\n");
      out.write("\t\tif(PESOTOTAL > PESOVEICULO_ATUAL && PESOVEICULO_ATUAL != -1){\r\n");
      out.write("\t\t\t$('#dgt_peso').addClass(\"red\");\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t$('#dgt_peso').removeClass(\"red\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(CUBAGEMTOTAL > CUBAGEMVEICULO_ATUAL && CUBAGEMVEICULO_ATUAL != -1){\r\n");
      out.write("\t\t\t$('#dgt_cub').addClass(\"red\");\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t$('#dgt_cub').removeClass(\"red\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t//funções de select multiple.\r\n");
      out.write("\tfunction excluir(){\r\n");
      out.write("\t\tif(!validatePeriodoEnrega())\r\n");
      out.write("\t\t\treturn;\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\tvar arr = $dg.getArraySelectedValues('tableRoterizacao');\r\n");
      out.write("\t\tvar i,split;\r\n");
      out.write("\t\tvar obj;\r\n");
      out.write("\t\tvar itensRemovidos = \"\";\r\n");
      out.write("\t\tif(arr.length == 0){\r\n");
      out.write("\t\t\talert(\"Selecione um item da área de roterização.\");\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tvar prioritarios = 0;\r\n");
      out.write("\t\t\t$(\"input[name='Prioridade']\").each(function(i){\r\n");
      out.write("\t\t    \tvar selecionado = $(this).parent().parent().find(\"input[name=selecteditens]\").attr(\"checked\");\r\n");
      out.write("\t\t\t\tif($(this).attr(\"checked\") && selecionado)\r\n");
      out.write("\t\t\t\t\tprioritarios++;\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("        \tif(prioritarios > 0 && \r\n");
      out.write("        \t\t!confirm(\"O pedido está marcado como prioritário e não deveria ser removido. Deseja remover este pedido mesmo assim?\")){\r\n");
      out.write("    \t\t\treturn false;\r\n");
      out.write("    \t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfor(i=0;i<arr.length;i++){\r\n");
      out.write("\t\t\t\tif (MAPAPEDIDOSCHEKED[arr[i]])\r\n");
      out.write("\t\t\t\t\titensRemovidos = itensRemovidos + MAPAPEDIDOSCHEKED[arr[i]];\r\n");
      out.write("\t\t\t\telse\r\n");
      out.write("\t\t\t\t\titensRemovidos = itensRemovidos + '[' + $(\"#tableRoterizacao tr[val=\"+arr[i]+\"]\").attr(\"fiveKeys\").replace(/,/g, \";\") + '],';\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tsplit = arr[i];\r\n");
      out.write("\t\t\t\tobj = removeProdutoInPedido(split);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tremoveValues(obj);\r\n");
      out.write("\t\t\t\t$(\"#tableRoterizacao tr[val=\"+arr[i]+\"]\").remove();\r\n");
      out.write("\t\t\t\tMAPAPEDIDOS[arr[i]] = null;\r\n");
      out.write("\t\t\t\tMAPAPEDIDOSCHEKED[arr[i]] = null;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif (document.getElementById(\"ifm\")){\r\n");
      out.write("\t\t\t\t\tvar ifm = document.getElementById(\"ifm\").contentWindow;\r\n");
      out.write("\t\t\t\t\tTABELAROTEIRIZACAO = ifm.voltar(split);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tsetTotalEntregasRoteirizacao();\r\n");
      out.write("\t\t\tstripe();\r\n");
      out.write("\t\t\tupdateFields();\r\n");
      out.write("\t\t\tsave(false, itensRemovidos);\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction stripe(){\r\n");
      out.write("\t\t$(\"#tableRoterizacao tr\").each(function(i){\r\n");
      out.write("\t\t\tif (i % 2==0){\r\n");
      out.write("\t\t\t\t$(this).removeClass(\"even\");\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$(this).addClass(\"even\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction removeProdutoInPedido(obj){\r\n");
      out.write("\t\tvar i;\r\n");
      out.write("\t\tfor(i=0;i<MAP.length;i++){\r\n");
      out.write("\t\t\tif(obj == MAP[i].cdformacaocarga){\r\n");
      out.write("\t\t\t\tvar obj = MAP[i];\r\n");
      out.write("\t\t\t\tMAP.splice(i,1);\r\n");
      out.write("\t\t\t\treturn obj;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction dataGridLoaded(pesoTotal,cubagemTotal,valorTotal,totalProdutos,totalEntrega){\r\n");
      out.write("\t\tform['rn_peso'].value = (pesoTotal + PESOTOTAL).toFixed(3).replace(\".\",\",\");\r\n");
      out.write("\t\tform['rn_cubagem'].value = (cubagemTotal+CUBAGEMTOTAL).toFixed(3).replace(\".\",\",\");\r\n");
      out.write("\t\tform['rn_valor'].value = $w.sumMoney(VALORTOTAL,$w.float2moeda(valorTotal));\r\n");
      out.write("\t\tform['rn_produtos'].value = totalProdutos + TOTALPRODUTOS;\r\n");
      out.write("\t\tform['rn_numeroentregas'].value = totalEntrega + TOTALENTREGAS;\r\n");
      out.write("\t\thideCarregando();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction showCarregando(){\r\n");
      out.write("\t\t$(\"#loading\").show();\r\n");
      out.write("\t\t$(\"#iframeArea\").hide();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//$(\"#loading\").hide();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction hideCarregando(){\r\n");
      out.write("\t\t$(\"#loading\").hide();\r\n");
      out.write("\t\t$(\"#iframeArea\").show();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction populatePaletesDisponiveis(){\r\n");
      out.write("\t\tif(form['veiculo'].value != \"<null>\"){\r\n");
      out.write("\t\t\tvar param = [{name:'ACAO',value:'getPaletesVeiculo'},{name:'veiculo',value:form['veiculo'].value}];\r\n");
      out.write("\t\t\t$w.getJSON(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Carregamento\",param,function(json){\r\n");
      out.write("\t\t\t\tvar el = form['paletesdisponiveis'];\r\n");
      out.write("\t\t\t\tif(isNaN(json.paletes) || isNaN(json.peso) || isNaN(json.cubagem)){\r\n");
      out.write("\t\t\t\t\tclearShowAllStyleVeiculo(true);\r\n");
      out.write("\t\t\t\t\tjson.peso = \"\";\r\n");
      out.write("\t\t\t\t\tjson.cubagem = \"\";\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tclearShowAllStyleVeiculo(false);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tel.value = json.paletes;\r\n");
      out.write("\t\t\t\tPESOVEICULO = json.peso;\r\n");
      out.write("\t\t\t\tCUBAGEMVEICULO = json.cubagem;\r\n");
      out.write("\t\t\t\tPALETESVEICULO = isNaN(json.paletes) ? -1 : json.paletes;\r\n");
      out.write("\t\t\t\tPESOVEICULO_ATUAL = PESOVEICULO;\r\n");
      out.write("\t\t\t\tCUBAGEMVEICULO_ATUAL = CUBAGEMVEICULO;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(json.peso == \"\")\r\n");
      out.write("\t\t\t\t\t$(\"#dg_peso\").html(\"&nbsp;\");\r\n");
      out.write("\t\t\t\telse \r\n");
      out.write("\t\t\t\t\t$(\"#dg_peso\").html(parseFloat(json.peso).toFixed(3).replace(\".\",\",\"));\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\tif(!isNaN(json.cubagem))\r\n");
      out.write("\t\t\t\t\t$(\"#dg_cubagem\").html($w.float2moeda(json.cubagem));\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\tvalidateDimencoes();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse{\r\n");
      out.write("\t\t\t$('#dgt_peso').removeClass(\"red\");\r\n");
      out.write("\t\t\t$('#dgt_cub').removeClass(\"red\");\r\n");
      out.write("\t\t\tclearShowAllStyleVeiculo(false);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction clearShowAllStyleVeiculo(type){\r\n");
      out.write("\t\tvar el = form['paletesdisponiveis'];\r\n");
      out.write("\t\tif(type && form['veiculo'].value != \"<null>\" && form['transportador'].value != \"<null>\"){\r\n");
      out.write("\t\t\t$(el).css(\"background-color\",\"#FF7B7C\");\r\n");
      out.write("\t\t\t$(el).attr(\"readonly\",\"readonly\");\r\n");
      out.write("\t\t\t$(\"#dg_peso\").addClass(\"red\");\r\n");
      out.write("\t\t\t$(\"#dg_cubagem\").addClass(\"red\");\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t$(el).css(\"background-color\",\"#FFF9D0\");\r\n");
      out.write("\t\t\t$(el).removeAttr(\"readonly\");\r\n");
      out.write("\t\t\tel.value = \"\";\r\n");
      out.write("\t\t\t$(\"#dg_peso\").html(\"\");\r\n");
      out.write("\t\t\t$(\"#dg_cubagem\").html(\"\");\r\n");
      out.write("\t\t\t$(\"#dg_peso\").removeClass(\"red\");\r\n");
      out.write("\t\t\t$(\"#dg_cubagem\").removeClass(\"red\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction gerarCarregamento(){\r\n");
      out.write("\t\tif($(\"#gerar-carregamento\").hasClass('inativo'))\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\r\n");
      out.write("\t\tif($(\"#tableRoterizacao tr\").size() <= 0){\r\n");
      out.write("\t\t\talert(\"A roteirização está vazia.\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar arrRequired = new Array({name:\"Box\",val:form['box']});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\tvar msg = \"\";\r\n");
      out.write("\t\tvar i=0;\r\n");
      out.write("\t\tfor (i=0;i < arrRequired.length; i++){\r\n");
      out.write("\t\t\tif(arrRequired[i].val.value == \"\" || arrRequired[i].val.value == \"<null>\"){\r\n");
      out.write("\t\t\t\tmsg +=\"O campo \"+arrRequired[i].name+\" é obrigatório.\\n\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(msg != \"\"){\r\n");
      out.write("\t\t\talert(msg);\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\tvar cubagem = false;\r\n");
      out.write("\t\tvar peso = false;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(CUBAGEMTOTAL > CUBAGEMVEICULO){\r\n");
      out.write("\t\t\tcubagem = true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(PESOTOTAL > PESOVEICULO){\r\n");
      out.write("\t\t\tpeso = true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar paletes = form['paletesdisponiveis'].value;\r\n");
      out.write("\t\tif(paletes != \"\" && !isNaN(paletes)){\r\n");
      out.write("\t\t\tif(PALETESVEICULO < paletes || paletes < 1){\r\n");
      out.write("\t\t\t\talert(\"A quantidade de paletes disponíveis deve ser maior que zero e menor ou igual à \"+PALETESVEICULO+\".\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\tif(peso && cubagem){\r\n");
      out.write("\t\t\tif(!confirm(\"O peso e a cubagem da carga está maior que o limite do veículo. Deseja continuar?\")){\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} else if(peso){\r\n");
      out.write("\t\t\tif(!confirm(\"O peso da carga está maior que o limite do veículo. Deseja continuar?\")){\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} else if(cubagem){\r\n");
      out.write("\t\t\tif(!confirm(\"A cubagem da carga está maior que o limite do veículo. Deseja continuar?\")){\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//fim da validação do script.\r\n");
      out.write("\t\tsave(true);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction save(definitivo, itensRemovidos){\r\n");
      out.write("\t\tlistaPedidoVendaProduto = makeStringPedidos();\r\n");
      out.write("\t\t$w.showLoading();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar dtentregainicio = \"\";\r\n");
      out.write("\t\tvar dtentregafim = \"\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\tif (document.getElementById(\"ifm\") && document.getElementById(\"ifm\").contentWindow){\r\n");
      out.write("\t\t\tvar ifm = $(document.getElementById(\"ifm\").contentWindow.document);\t   \r\n");
      out.write("\t\r\n");
      out.write("\t\t\tif (ifm.find(\"input[name=dtfiltroinicial]\").val())\r\n");
      out.write("\t\t\t\tdtentregainicio = ifm.find(\"input[name=dtfiltroinicial]\").val();\r\n");
      out.write("\t\t\tif (ifm.find(\"input[name=dtfiltrofinal]\").val())\r\n");
      out.write("\t\t\t\tdtentregafim = ifm.find(\"input[name=dtfiltrofinal]\").val();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar cdcarregamento = $(form[\"cdcarregamento\"]).val();\r\n");
      out.write("\t\tif (cdcarregamento == \"<null>\" || cdcarregamento == \"\" || (typeof cdcarregamento == 'undefined')){\r\n");
      out.write("\t\t\t$(\"#linkDescerItem\").addClass(\"inativo\");\r\n");
      out.write("\t\t\t$(\"#linkRemoverItem\").addClass(\"inativo\");\r\n");
      out.write("\t\t\t$(\"#gerar-carregamento\").addClass(\"inativo\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$w.getJSON(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Carregamento\",\r\n");
      out.write("\t\t\t\t   {\"ACAO\":\"salvarCarregamento\",\"listaPedidoVendaProduto\": listaPedidoVendaProduto,\"transportador\":$(form[\"transportador\"]).val(),\r\n");
      out.write("\t\t\t\t   \"veiculo\":$(form[\"veiculo\"]).val(),\"paletesdisponiveis\":$(form[\"paletesdisponiveis\"]).val(),\"box\":$(form[\"box\"]).val(),\r\n");
      out.write("\t\t\t\t   \"cdcarregamento\":$(form[\"cdcarregamento\"]).val(),\"definitivo\":definitivo,\r\n");
      out.write("\t\t\t\t   \"itensRemovidos\":itensRemovidos,\r\n");
      out.write("\t\t\t\t   \"dtentregainicio\" : dtentregainicio,\r\n");
      out.write("\t\t\t\t   \"dtentregafim\" : dtentregafim,\r\n");
      out.write("\t\t\t\t   \"filialretirada\":(typeof $(form[\"filialretirada\"]) != 'undefined' ? $(form[\"filialretirada\"]).val() : \"\"),\r\n");
      out.write("\t\t\t\t   \"tipooperacaoretirada\":(typeof $(form[\"tipooperacaoretirada\"]) != 'undefined' ? $(form[\"tipooperacaoretirada\"]).val() : \"\")},\r\n");
      out.write("\t\t\tfunction(json){\r\n");
      out.write("\t\t\t\t   $(form[\"cdcarregamento\"]).val(json.cdcarregamento);\r\n");
      out.write("\t\t\t\t   \r\n");
      out.write("\t\t\t\t   $(\"#linkDescerItem\").removeClass(\"inativo\");\r\n");
      out.write("\t\t\t\t   $(\"#linkRemoverItem\").removeClass(\"inativo\");\r\n");
      out.write("\t\t\t\t   $(\"#gerar-carregamento\").removeClass(\"inativo\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t   if(json.msgm != \"\"){\r\n");
      out.write("\t\t\t\t   \t\talert(json.msgm);\r\n");
      out.write("\t\t\t\t   \t\t$w.hideLoading();\r\n");
      out.write("\t\t\t\t   \t\tif (json.cdcarregamento)\r\n");
      out.write("\t\t\t\t   \t\t\teditarCarregamento(json.cdcarregamento);\r\n");
      out.write("\t\t\t\t   } else {\r\n");
      out.write("\t\t\t\t   \t\tif(definitivo){\r\n");
      out.write("\t\t\t\t\t   \t\tvar str = \"O Carregamento foi enviado com sucesso com o código \"+json.cdcarregamento;\r\n");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#proc\").html(str);\r\n");
      out.write("\t\t\t\t\t\t\t$(form[\"cdcarregamento\"]).val(\"<null>\");\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#telaPrincipal\").fadeOut(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#confirmacao\").fadeIn();\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#botao\").fadeOut();\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t  }\r\n");
      out.write("\t\t\t\t  \t\t\t  \t  \r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$w.hideLoading();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction editarCarregamento(cdcarregamento){\r\n");
      out.write("\t\tform['ACAO'].value = \"index\";\r\n");
      out.write("\t\tform.action = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Carregamento';\r\n");
      out.write("\t\tform.validate = 'false';\r\n");
      out.write("\t\tsubmitForm();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction retornar(){\r\n");
      out.write("\t\tjavascript:clearFilter();\r\n");
      out.write("\t\tform['ACAO'].value = \"listagem\";\r\n");
      out.write("\t\tform.action = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/crud/Carregamento';\r\n");
      out.write("\t\tform.validate = 'false';\r\n");
      out.write("\t\tsubmitForm();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction makePopUp(){\r\n");
      out.write("\t\tvar cd = \"\";\r\n");
      out.write("\t\tvar cont = 0;\r\n");
      out.write("\t\tvar ifm = document.getElementById(\"ifm\").contentWindow;\r\n");
      out.write("\t\t$(\"#tableRoterizacao tr input[type=checkbox]:checked\").each(function(){\r\n");
      out.write("\t\t\tcd = $(this).val();\r\n");
      out.write("\t\t\tcont++;\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tif(cd == \"\"){\r\n");
      out.write("\t\t\tcd = ifm.getSelectedRow();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(cont > 1 || cd == \"\"){\r\n");
      out.write("\t\t\talert(\"Selecione um cliente/filial.\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction addArray(clienteId,array,arrayChecked,valorT,qtdeT,cubagemT,pesoT){\r\n");
      out.write("\t\tMAPAPEDIDOS[clienteId] = array;\r\n");
      out.write("\t\tMAPAPEDIDOSCHEKED[clienteId] = arrayChecked;\r\n");
      out.write("\t\tfor(i = 0; i < MAP.length ; i++){\r\n");
      out.write("\t\t\tif(MAP[i].cdformacaocarga == clienteId){\r\n");
      out.write("\t\t\t\tremoveValues(MAP[i]);\r\n");
      out.write("\t\t\t\tMAP[i].valor = valorT;\r\n");
      out.write("\t\t\t\tMAP[i].totalItens = qtdeT;\r\n");
      out.write("\t\t\t\tMAP[i].cubagem = cubagemT.replace(\",\",\".\");\r\n");
      out.write("\t\t\t\tMAP[i].peso = pesoT.replace(\",\",\".\");\r\n");
      out.write("\t\t\t\taddValues(MAP[i]);\r\n");
      out.write("\t\t\t\tupdateDataGrid(MAP[i]);\r\n");
      out.write("\t\t\t\tupdateFields();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tsave(false, array);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction updateDataGrid(obj){\r\n");
      out.write("\t\t$(\"#totalItens\"+obj.cdformacaocarga).html(obj.totalItens);\r\n");
      out.write("\t\t$(\"#valor\"+obj.cdformacaocarga).html(obj.valor);\r\n");
      out.write("\t\t$(\"#cubagem\"+obj.cdformacaocarga).html(String(obj.cubagem).replace(\".\",\",\"));\r\n");
      out.write("\t\t$(\"#peso\"+obj.cdformacaocarga).html(String(obj.peso).replace(\".\",\",\"));\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getArrayByCliente(clienteId){\r\n");
      out.write("\t\treturn MAPAPEDIDOS[clienteId];\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getArrayCheckedByCliente(clienteId){\r\n");
      out.write("\t\treturn MAPAPEDIDOSCHEKED[clienteId];\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction makeStringPedidos(){\r\n");
      out.write("\t\tvar mapAux = getRoteirizacaoItens();\r\n");
      out.write("\t\tvar pedidosDeVenda = \"\";\r\n");
      out.write("\t\tvar str = \"\";\r\n");
      out.write("\t\tfor(i = 0; i < mapAux.length ; i++){\r\n");
      out.write("\t\t\tstr = getArrayCheckedByCliente(mapAux[i]);\r\n");
      out.write("\t\t\tif(str != \"\" && str != null){\r\n");
      out.write("\t\t\t\tpedidosDeVenda += \"[\"+str+\"]\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse{\r\n");
      out.write("\t\t\t\tpedidosDeVenda += \"[\"+getFiveKeys(mapAux[i])+\"]\";\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn pedidosDeVenda;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getFiveKeys(clienteId){\r\n");
      out.write("\t\tvar fiveKeys = \"\";\r\n");
      out.write("\t\t$((\"#tableRoterizacao tr[val=\"+clienteId+\"]\")).each(function(){\r\n");
      out.write("\t\t\tfiveKeys = $(this).attr(\"fiveKeys\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\treturn fiveKeys;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getRoteirizacaoItens(){\r\n");
      out.write("\t\tvar itens = new Array();\r\n");
      out.write("\t\t$(\"#tableRoterizacao tr\").each(function(){\r\n");
      out.write("\t\t\titens.push($(this).attr(\"val\"));\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\treturn itens;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/* Limpa os formulários do filtro, e limpa a tabela. */\r\n");
      out.write("\tfunction clearFilter(){\r\n");
      out.write("\t\t$w.clearForm(\"form\");\r\n");
      out.write("\t\t$(form[\"transportador\"]).empty();\r\n");
      out.write("\t\t$(form[\"box\"]).empty();\r\n");
      out.write("\t\t$(form[\"paletesdisponiveis\"]).empty();\r\n");
      out.write("\t\t$(form[\"veiculo\"]).empty();\r\n");
      out.write("\t\t$(form[\"cdcarregamento\"]).empty();\r\n");
      out.write("\t\t$(form[\"transportador\"]).empty();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction diminuirEmProporcao(elemento){\r\n");
      out.write("\t\tvar cubagem = String(((parseFloat(String(CUBAGEMVEICULO).replace(\",\",\".\")) / PALETESVEICULO) * elemento.value).toFixed(3));\r\n");
      out.write("\t\tvar peso = String(((parseFloat(String(PESOVEICULO).replace(\",\",\".\")) / PALETESVEICULO) * elemento.value).toFixed(3));\r\n");
      out.write("\t\tCUBAGEMVEICULO_ATUAL = cubagem;\r\n");
      out.write("\t\tPESOVEICULO_ATUAL = peso;\r\n");
      out.write("\t\t$(\"#dg_cubagem\").html(cubagem.replace(\".\",\",\"));\r\n");
      out.write("\t\t$(\"#dg_peso\").html(peso.replace(\".\",\",\"));\r\n");
      out.write("\t\tvalidateDimencoes();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/* Atualiza o combo de box */\r\n");
      out.write("\tfunction atualizarComboBox(){\r\n");
      out.write("\t\tvar somenteDisponiveis = $(form[\"somenteDisponiveis\"]).attr(\"checked\");\r\n");
      out.write("\t\tvar transportador = $(form[\"transportador\"]).val();\r\n");
      out.write("\t\tif(transportador == \"<null>\")\r\n");
      out.write("\t\t\tsomenteDisponiveis = true;\r\n");
      out.write("\t\t$w.showLoading();\r\n");
      out.write("\t\t$w.getJSON(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Carregamento\", \r\n");
      out.write("\t\t\t{ACAO:'comboBox','transportador':transportador,\"somenteDisponiveis\":somenteDisponiveis == null ? null : true}\r\n");
      out.write("\t\t,function(json){\r\n");
      out.write("\t\t\t$(form['veiculo']).removeOption(/./);\r\n");
      out.write("\t\t\tvar i= 0;\r\n");
      out.write("\t\t\t$(form['veiculo']).addOption(\"<null>\",\" \");\r\n");
      out.write("\t\t\tfor(i=0; i< json.lista.length; i++){\r\n");
      out.write("\t\t\t\t$(form['veiculo']).addOption(\"br.com.linkcom.wms.geral.bean.Veiculo[cdveiculo=\"+json.lista[i].cdveiculo+\"]\",json.lista[i].placa,false);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$w.hideLoading();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction excluirCarregamento(){\r\n");
      out.write("\t\tif(confirm('Você tem certeza que deseja excluir este carregamento?')){\r\n");
      out.write("\t\t\tjavascript:clearFilter();\r\n");
      out.write("\t\t\twindow.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/crud/Carregamento?ACAO=excluir&cdcarregamento=\"+form[\"cdcarregamento\"].value;\r\n");
      out.write("\t\t};\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction cancelarCarregamento(){\r\n");
      out.write("\t\tif(confirm('Você tem certeza que deseja cancelar este carregamento?')){\r\n");
      out.write("\t\t\tjavascript:clearFilter();\r\n");
      out.write("\t\t\twindow.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/crud/Carregamento?ACAO=cancelar&cdcarregamento=\"+form[\"cdcarregamento\"].value;\r\n");
      out.write("\t\t};\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction retornarValido(){\r\n");
      out.write("\t\tif($('#tableRoterizacao tr').size() > 0){\r\n");
      out.write("\t\t\tif(confirm('Deseja encerrar essa operação de carregamento?')){\r\n");
      out.write("\t\t\t\twindow.location ='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/crud/Carregamento';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse{\r\n");
      out.write("\t\t\twindow.location ='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/crud/Carregamento';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\tvalidaTrocarLocal();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\taddToRoteirizacao(TABELAROTEIRIZACAO);\r\n");
      out.write("\t\tsetTotalEntregasRoteirizacao();\r\n");
      out.write("\t\tform[\"paletesdisponiveis\"].onchange();\r\n");
      out.write("\t\t$(\"#idTransportador option\").get(0).text = \"Todos\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//desabilitei a listagem inicial devido a lentidão no sistema.\r\n");
      out.write("\t\t//loadDataGrid();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//como desabilitei a listagem inicial devo ocultar o carregando...\r\n");
      out.write("\t\t$(\"#loading\").hide();\r\n");
      out.write("\t\t$(\"#iframeArea\").show();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#tableRoterizacao\").dblclick( function( event ) {\r\n");
      out.write("\t\t\tvar $target = (event.target.tagName == \"TD\")?$(event.target):$(event.target).parent();\r\n");
      out.write("\t\t\t$w.openPopup(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Carregamento?ACAO=openPopUp&chave=\"+$target.parent().attr('fiveKeys')+\"&isRoteirizacao=true&clienteID=\"+$target.parent().attr('val')+\"&cdcarregamento=\"+$(form[\"cdcarregamento\"]).val(),950,605);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction validaTrocarLocal(){\r\n");
      out.write("\t\tif(typeof form.trocarlocal != 'undefined'){\r\n");
      out.write("\t\t\tif(!form.trocarlocal.checked){\r\n");
      out.write("\t\t\t\tform.filialretirada.selectedIndex = 0;\r\n");
      out.write("\t\t\t\tform.tipooperacaoretirada.selectedIndex = 0;\r\n");
      out.write("\t\t\t\tform.filialretirada.disabled = true;\r\n");
      out.write("\t\t\t\tform.tipooperacaoretirada.disabled = true;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tform.filialretirada.disabled = false;\r\n");
      out.write("\t\t\t\tform.tipooperacaoretirada.disabled = false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction exibirDetalhesPedidos(){\r\n");
      out.write("\t\tvar cdcarregamento = $(form[\"cdcarregamento\"]).val();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif (cdcarregamento && (cdcarregamento != '<null>') && (cdcarregamento != 'null') && $(\"#tableRoterizacao tr\").size() > 0 ){\r\n");
      out.write("\t\t\tvar url = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Carregamento?ACAO=popupDetalhePedidos&cdcarregamento=' + $(form[\"cdcarregamento\"]).val(); \r\n");
      out.write("\t\t\t$w.openPopup(url, 1000, 600);\r\n");
      out.write("\t\t}else\r\n");
      out.write("\t\t\talert('A roteirização está vazia.');\r\n");
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
        out.write("\t<div style=\"text-align: right;\" id=\"botao\">\r\n");
        out.write("\t\t<table>\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t<a id=\"btn_voltar\" onmouseover=\"Tip('Voltar')\" title=\"\" href=\"#\" onclick=\"retornarValido();\">\r\n");
        out.write("\t\t\t\t\t\tRetornar à listagem\r\n");
        out.write("\t\t\t\t\t</a>\r\n");
        out.write("\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_choose_0(_jspx_th_c_set_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t</table>\r\n");
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
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_when_0(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_otherwise_0(_jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty isEditar}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t\t\t<a id=\"btn_excluir\" onmouseover=\"Tip('Excluir')\" title=\"\" href=\"#\" onclick=\"excluirCarregamento()\">Excluir</a>\r\n");
        out.write("\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t");
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
        out.write("\t\t\t\t\t\t<td>\r\n");
        out.write("\t\t\t\t\t\t\t<a id=\"btn_excluir\" onmouseover=\"Tip('Cancelar')\" title=\"\" href=\"#\" onclick=\"cancelarCarregamento()\">Cancelar</a>\r\n");
        out.write("\t\t\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\t");
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
    _jspx_th_t_tela_0.setTitulo((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("Carregamento ${filtro.cdcarregamento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_t_tela_0.setDynamicAttribute(null, "botoes", (java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${botao}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_t_tela_0.setJspBody(new carregamento_jspHelper( 0, _jspx_page_context, _jspx_th_t_tela_0, null));
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
    _jspx_th_n_bean_0.setJspBody(new carregamento_jspHelper( 1, _jspx_page_context, _jspx_th_n_bean_0, null));
    _jspx_th_n_bean_0.doTag();
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
    _jspx_th_t_property_0.setName("cdcarregamento");
    _jspx_th_t_property_0.setType(new String("hidden"));
    _jspx_th_t_property_0.setWrite(new Boolean(false));
    _jspx_th_t_property_0.doTag();
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
    _jspx_th_t_propertyConfig_0.setJspBody(new carregamento_jspHelper( 2, _jspx_page_context, _jspx_th_t_propertyConfig_0, null));
    _jspx_th_t_propertyConfig_0.doTag();
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
    _jspx_th_n_panelGrid_0.setJspBody(new carregamento_jspHelper( 3, _jspx_page_context, _jspx_th_n_panelGrid_0, null));
    _jspx_th_n_panelGrid_0.doTag();
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
    _jspx_th_n_group_0.setLegend("Filtro");
    _jspx_th_n_group_0.setColumns(2);
    _jspx_th_n_group_0.setJspBody(new carregamento_jspHelper( 4, _jspx_page_context, _jspx_th_n_group_0, null));
    _jspx_th_n_group_0.doTag();
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
    _jspx_th_n_panelGrid_1.setStyleClass("doublelineformat");
    _jspx_th_n_panelGrid_1.setColumns(new Integer(3));
    _jspx_th_n_panelGrid_1.setStyle("width: 100px;");
    _jspx_th_n_panelGrid_1.setJspBody(new carregamento_jspHelper( 5, _jspx_page_context, _jspx_th_n_panelGrid_1, null));
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
    _jspx_th_t_propertyConfig_1.setRenderAs("doubleline");
    _jspx_th_t_propertyConfig_1.setJspBody(new carregamento_jspHelper( 6, _jspx_page_context, _jspx_th_t_propertyConfig_1, null));
    _jspx_th_t_propertyConfig_1.doTag();
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
    _jspx_th_t_property_1.setName("rotas");
    _jspx_th_t_property_1.setItens((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LISTA_ROTA}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_t_property_1.setDynamicAttribute(null, "style", new String("width:170px;height:165px;"));
    _jspx_th_t_property_1.setDynamicAttribute(null, "onchange", new String("loadDataGrid()"));
    _jspx_th_t_property_1.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panelGrid_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panelGrid
    br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_2 = new br.com.linkcom.neo.view.PanelGridTag();
    _jspx_th_n_panelGrid_2.setJspContext(_jspx_page_context);
    _jspx_th_n_panelGrid_2.setParent(_jspx_parent);
    _jspx_th_n_panelGrid_2.setStyle("width: 500px;");
    _jspx_th_n_panelGrid_2.setJspBody(new carregamento_jspHelper( 7, _jspx_page_context, _jspx_th_n_panelGrid_2, null));
    _jspx_th_n_panelGrid_2.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panelGrid_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panelGrid
    br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_3 = new br.com.linkcom.neo.view.PanelGridTag();
    _jspx_th_n_panelGrid_3.setJspContext(_jspx_page_context);
    _jspx_th_n_panelGrid_3.setParent(_jspx_parent);
    _jspx_th_n_panelGrid_3.setStyleClass("doublelineformat");
    _jspx_th_n_panelGrid_3.setColumns(new Integer(3));
    _jspx_th_n_panelGrid_3.setStyle("width: 500px;");
    _jspx_th_n_panelGrid_3.setJspBody(new carregamento_jspHelper( 8, _jspx_page_context, _jspx_th_n_panelGrid_3, null));
    _jspx_th_n_panelGrid_3.doTag();
    return false;
  }

  private boolean _jspx_meth_t_propertyConfig_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:propertyConfig
    br.com.linkcom.neo.view.template.PropertyConfigTag _jspx_th_t_propertyConfig_2 = new br.com.linkcom.neo.view.template.PropertyConfigTag();
    _jspx_th_t_propertyConfig_2.setJspContext(_jspx_page_context);
    _jspx_th_t_propertyConfig_2.setParent(_jspx_parent);
    _jspx_th_t_propertyConfig_2.setRenderAs("doubleline");
    _jspx_th_t_propertyConfig_2.setJspBody(new carregamento_jspHelper( 9, _jspx_page_context, _jspx_th_t_propertyConfig_2, null));
    _jspx_th_t_propertyConfig_2.doTag();
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
    _jspx_th_t_property_2.setName("praca");
    _jspx_th_t_property_2.setDynamicAttribute(null, "style", new String("width:240px;"));
    _jspx_th_t_property_2.setDynamicAttribute(null, "onchange", new String("loadDataGrid()"));
    _jspx_th_t_property_2.setSelectOnePath("/popup/Praca");
    _jspx_th_t_property_2.setDynamicAttribute(null, "popupstr", new String("width=550, height=600, top=0, left=0, resizable, scrollbars"));
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
    _jspx_th_t_property_3.setName("tipooperacao");
    _jspx_th_t_property_3.setDynamicAttribute(null, "style", new String("width:130px;"));
    _jspx_th_t_property_3.setDynamicAttribute(null, "onchange", new String("loadDataGrid()"));
    _jspx_th_t_property_3.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panelGrid_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panelGrid
    br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_4 = new br.com.linkcom.neo.view.PanelGridTag();
    _jspx_th_n_panelGrid_4.setJspContext(_jspx_page_context);
    _jspx_th_n_panelGrid_4.setParent(_jspx_parent);
    _jspx_th_n_panelGrid_4.setStyleClass("doublelineformat");
    _jspx_th_n_panelGrid_4.setColumns(new Integer(2));
    _jspx_th_n_panelGrid_4.setStyle("width: 500px;");
    _jspx_th_n_panelGrid_4.setJspBody(new carregamento_jspHelper( 10, _jspx_page_context, _jspx_th_n_panelGrid_4, null));
    _jspx_th_n_panelGrid_4.doTag();
    return false;
  }

  private boolean _jspx_meth_t_propertyConfig_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:propertyConfig
    br.com.linkcom.neo.view.template.PropertyConfigTag _jspx_th_t_propertyConfig_3 = new br.com.linkcom.neo.view.template.PropertyConfigTag();
    _jspx_th_t_propertyConfig_3.setJspContext(_jspx_page_context);
    _jspx_th_t_propertyConfig_3.setParent(_jspx_parent);
    _jspx_th_t_propertyConfig_3.setRenderAs("doubleline");
    _jspx_th_t_propertyConfig_3.setJspBody(new carregamento_jspHelper( 11, _jspx_page_context, _jspx_th_t_propertyConfig_3, null));
    _jspx_th_t_propertyConfig_3.doTag();
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
    _jspx_th_t_property_4.setName("nomecliente");
    _jspx_th_t_property_4.setDynamicAttribute(null, "style", new String("width:300px;"));
    _jspx_th_t_property_4.setDynamicAttribute(null, "onchange", new String("loadDataGrid()"));
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
    _jspx_th_t_property_5.setName("pedido");
    _jspx_th_t_property_5.setDynamicAttribute(null, "style", new String("width:150px;"));
    _jspx_th_t_property_5.setDynamicAttribute(null, "onchange", new String("loadDataGrid()"));
    _jspx_th_t_property_5.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panelGrid_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panelGrid
    br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_5 = new br.com.linkcom.neo.view.PanelGridTag();
    _jspx_th_n_panelGrid_5.setJspContext(_jspx_page_context);
    _jspx_th_n_panelGrid_5.setParent(_jspx_parent);
    _jspx_th_n_panelGrid_5.setStyleClass("doublelineformat");
    _jspx_th_n_panelGrid_5.setColumns(new Integer(3));
    _jspx_th_n_panelGrid_5.setStyle("width: 500px;");
    _jspx_th_n_panelGrid_5.setJspBody(new carregamento_jspHelper( 12, _jspx_page_context, _jspx_th_n_panelGrid_5, null));
    _jspx_th_n_panelGrid_5.doTag();
    return false;
  }

  private boolean _jspx_meth_t_propertyConfig_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:propertyConfig
    br.com.linkcom.neo.view.template.PropertyConfigTag _jspx_th_t_propertyConfig_4 = new br.com.linkcom.neo.view.template.PropertyConfigTag();
    _jspx_th_t_propertyConfig_4.setJspContext(_jspx_page_context);
    _jspx_th_t_propertyConfig_4.setParent(_jspx_parent);
    _jspx_th_t_propertyConfig_4.setRenderAs("doubleline");
    _jspx_th_t_propertyConfig_4.setJspBody(new carregamento_jspHelper( 13, _jspx_page_context, _jspx_th_t_propertyConfig_4, null));
    _jspx_th_t_propertyConfig_4.doTag();
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
    _jspx_th_n_panel_0.setJspBody(new carregamento_jspHelper( 14, _jspx_page_context, _jspx_th_n_panel_0, null));
    _jspx_th_n_panel_0.doTag();
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
    _jspx_th_t_property_6.setName("dtentregainicio");
    _jspx_th_t_property_6.setRenderAs("single");
    _jspx_th_t_property_6.setShowLabel(new Boolean(false));
    _jspx_th_t_property_6.setDynamicAttribute(null, "style", new String("width:100px;"));
    _jspx_th_t_property_6.doTag();
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
    _jspx_th_t_property_7.setName("dtentregafim");
    _jspx_th_t_property_7.setRenderAs("single");
    _jspx_th_t_property_7.setShowLabel(new Boolean(false));
    _jspx_th_t_property_7.setDynamicAttribute(null, "style", new String("width:100px;"));
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
    _jspx_th_t_property_8.setName("troca");
    _jspx_th_t_property_8.setDynamicAttribute(null, "style", new String("width:220px;"));
    _jspx_th_t_property_8.setDynamicAttribute(null, "onchange", new String("loadDataGrid()"));
    _jspx_th_t_property_8.setItens((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ITENS_COMBO_TROCA}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_t_property_8.setIncludeBlank(new Boolean(false));
    _jspx_th_t_property_8.setAutoSugestUniqueItem(new Boolean(true));
    _jspx_th_t_property_8.doTag();
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
    _jspx_th_n_panel_1.setDynamicAttribute(null, "style", new String("text-align:right"));
    _jspx_th_n_panel_1.setColspan(new Integer(2));
    _jspx_th_n_panel_1.setJspBody(new carregamento_jspHelper( 15, _jspx_page_context, _jspx_th_n_panel_1, null));
    _jspx_th_n_panel_1.doTag();
    return false;
  }

  private boolean _jspx_meth_n_group_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:group
    br.com.linkcom.neo.view.GroupTag _jspx_th_n_group_1 = new br.com.linkcom.neo.view.GroupTag();
    _jspx_th_n_group_1.setJspContext(_jspx_page_context);
    _jspx_th_n_group_1.setParent(_jspx_parent);
    _jspx_th_n_group_1.setLegend("Resumo geral dos dados");
    _jspx_th_n_group_1.setStyle("height:110px");
    _jspx_th_n_group_1.setJspBody(new carregamento_jspHelper( 16, _jspx_page_context, _jspx_th_n_group_1, null));
    _jspx_th_n_group_1.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panelGrid_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panelGrid
    br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_6 = new br.com.linkcom.neo.view.PanelGridTag();
    _jspx_th_n_panelGrid_6.setJspContext(_jspx_page_context);
    _jspx_th_n_panelGrid_6.setParent(_jspx_parent);
    _jspx_th_n_panelGrid_6.setStyleClass("doublelineformat");
    _jspx_th_n_panelGrid_6.setColumns(new Integer(3));
    _jspx_th_n_panelGrid_6.setStyle("width: 220px;");
    _jspx_th_n_panelGrid_6.setJspBody(new carregamento_jspHelper( 17, _jspx_page_context, _jspx_th_n_panelGrid_6, null));
    _jspx_th_n_panelGrid_6.doTag();
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
    _jspx_th_n_panel_2.setJspBody(new carregamento_jspHelper( 18, _jspx_page_context, _jspx_th_n_panel_2, null));
    _jspx_th_n_panel_2.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_3 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_3.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_3.setParent(_jspx_parent);
    _jspx_th_n_panel_3.setJspBody(new carregamento_jspHelper( 19, _jspx_page_context, _jspx_th_n_panel_3, null));
    _jspx_th_n_panel_3.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_4 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_4.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_4.setParent(_jspx_parent);
    _jspx_th_n_panel_4.setJspBody(new carregamento_jspHelper( 20, _jspx_page_context, _jspx_th_n_panel_4, null));
    _jspx_th_n_panel_4.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panelGrid_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panelGrid
    br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_7 = new br.com.linkcom.neo.view.PanelGridTag();
    _jspx_th_n_panelGrid_7.setJspContext(_jspx_page_context);
    _jspx_th_n_panelGrid_7.setParent(_jspx_parent);
    _jspx_th_n_panelGrid_7.setStyleClass("doublelineformat");
    _jspx_th_n_panelGrid_7.setColumns(new Integer(2));
    _jspx_th_n_panelGrid_7.setStyle("width: 220px;");
    _jspx_th_n_panelGrid_7.setJspBody(new carregamento_jspHelper( 21, _jspx_page_context, _jspx_th_n_panelGrid_7, null));
    _jspx_th_n_panelGrid_7.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_5 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_5.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_5.setParent(_jspx_parent);
    _jspx_th_n_panel_5.setJspBody(new carregamento_jspHelper( 22, _jspx_page_context, _jspx_th_n_panel_5, null));
    _jspx_th_n_panel_5.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_6 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_6.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_6.setParent(_jspx_parent);
    _jspx_th_n_panel_6.setJspBody(new carregamento_jspHelper( 23, _jspx_page_context, _jspx_th_n_panel_6, null));
    _jspx_th_n_panel_6.doTag();
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
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hasAuthorization}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_n_panelGrid_8(_jspx_th_c_when_1, _jspx_page_context))
          return true;
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

  private boolean _jspx_meth_n_panelGrid_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panelGrid
    br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_8 = new br.com.linkcom.neo.view.PanelGridTag();
    _jspx_th_n_panelGrid_8.setJspContext(_jspx_page_context);
    _jspx_th_n_panelGrid_8.setParent(_jspx_th_c_when_1);
    _jspx_th_n_panelGrid_8.setStyleClass("doublelineformat");
    _jspx_th_n_panelGrid_8.setColumns(new Integer(1));
    _jspx_th_n_panelGrid_8.setStyle("width: 220px;");
    _jspx_th_n_panelGrid_8.setJspBody(new carregamento_jspHelper( 24, _jspx_page_context, _jspx_th_n_panelGrid_8, null));
    _jspx_th_n_panelGrid_8.doTag();
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
    _jspx_th_t_property_9.setName("trocarlocal");
    _jspx_th_t_property_9.setDynamicAttribute(null, "onclick", new String("validaTrocarLocal()"));
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
    _jspx_th_t_property_10.setName("filialretirada");
    _jspx_th_t_property_10.setRenderAs("doubleline");
    _jspx_th_t_property_10.setDynamicAttribute(null, "style", new String("width:210px;"));
    _jspx_th_t_property_10.setItens((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listaFiliais}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
    _jspx_th_t_property_11.setName("tipooperacaoretirada");
    _jspx_th_t_property_11.setRenderAs("doubleline");
    _jspx_th_t_property_11.setDynamicAttribute(null, "style", new String("width:210px;"));
    _jspx_th_t_property_11.setItens((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listaTipoPedidoRetirada}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_t_property_11.doTag();
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
        if (_jspx_meth_n_panelGrid_9(_jspx_th_c_otherwise_1, _jspx_page_context))
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

  private boolean _jspx_meth_n_panelGrid_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panelGrid
    br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_9 = new br.com.linkcom.neo.view.PanelGridTag();
    _jspx_th_n_panelGrid_9.setJspContext(_jspx_page_context);
    _jspx_th_n_panelGrid_9.setParent(_jspx_th_c_otherwise_1);
    _jspx_th_n_panelGrid_9.setStyleClass("doublelineformat");
    _jspx_th_n_panelGrid_9.setColumns(new Integer(1));
    _jspx_th_n_panelGrid_9.setStyle("width: 220px;display: none;");
    _jspx_th_n_panelGrid_9.setJspBody(new carregamento_jspHelper( 25, _jspx_page_context, _jspx_th_n_panelGrid_9, null));
    _jspx_th_n_panelGrid_9.doTag();
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
    _jspx_th_t_property_12.setName("trocarlocal");
    _jspx_th_t_property_12.setDynamicAttribute(null, "onclick", new String("validaTrocarLocal()"));
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
    _jspx_th_t_property_13.setName("filialretirada");
    _jspx_th_t_property_13.setRenderAs("doubleline");
    _jspx_th_t_property_13.setDynamicAttribute(null, "style", new String("width:210px;"));
    _jspx_th_t_property_13.setItens((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listaFiliais}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_t_property_13.doTag();
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
    _jspx_th_t_property_14.setName("tipooperacaoretirada");
    _jspx_th_t_property_14.setRenderAs("doubleline");
    _jspx_th_t_property_14.setDynamicAttribute(null, "style", new String("width:210px;"));
    _jspx_th_t_property_14.setItens((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listaTipoPedidoRetirada}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_t_property_14.doTag();
    return false;
  }

  private boolean _jspx_meth_n_group_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:group
    br.com.linkcom.neo.view.GroupTag _jspx_th_n_group_2 = new br.com.linkcom.neo.view.GroupTag();
    _jspx_th_n_group_2.setJspContext(_jspx_page_context);
    _jspx_th_n_group_2.setParent(_jspx_parent);
    _jspx_th_n_group_2.setLegend("Pré-Roterização");
    _jspx_th_n_group_2.setJspBody(new carregamento_jspHelper( 26, _jspx_page_context, _jspx_th_n_group_2, null));
    _jspx_th_n_group_2.doTag();
    return false;
  }

  private boolean _jspx_meth_n_group_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:group
    br.com.linkcom.neo.view.GroupTag _jspx_th_n_group_3 = new br.com.linkcom.neo.view.GroupTag();
    _jspx_th_n_group_3.setJspContext(_jspx_page_context);
    _jspx_th_n_group_3.setParent(_jspx_parent);
    _jspx_th_n_group_3.setLegend("Roterização");
    _jspx_th_n_group_3.setJspBody(new carregamento_jspHelper( 27, _jspx_page_context, _jspx_th_n_group_3, null));
    _jspx_th_n_group_3.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panelGrid_10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panelGrid
    br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_10 = new br.com.linkcom.neo.view.PanelGridTag();
    _jspx_th_n_panelGrid_10.setJspContext(_jspx_page_context);
    _jspx_th_n_panelGrid_10.setParent(_jspx_parent);
    _jspx_th_n_panelGrid_10.setColumns(new Integer(3));
    _jspx_th_n_panelGrid_10.setJspBody(new carregamento_jspHelper( 28, _jspx_page_context, _jspx_th_n_panelGrid_10, null));
    _jspx_th_n_panelGrid_10.doTag();
    return false;
  }

  private boolean _jspx_meth_n_group_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:group
    br.com.linkcom.neo.view.GroupTag _jspx_th_n_group_4 = new br.com.linkcom.neo.view.GroupTag();
    _jspx_th_n_group_4.setJspContext(_jspx_page_context);
    _jspx_th_n_group_4.setParent(_jspx_parent);
    _jspx_th_n_group_4.setLegend("Dados do veículo");
    _jspx_th_n_group_4.setJspBody(new carregamento_jspHelper( 29, _jspx_page_context, _jspx_th_n_group_4, null));
    _jspx_th_n_group_4.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panelGrid_11(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panelGrid
    br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_11 = new br.com.linkcom.neo.view.PanelGridTag();
    _jspx_th_n_panelGrid_11.setJspContext(_jspx_page_context);
    _jspx_th_n_panelGrid_11.setParent(_jspx_parent);
    _jspx_th_n_panelGrid_11.setStyleClass("doublelineformat");
    _jspx_th_n_panelGrid_11.setColumns(new Integer(1));
    _jspx_th_n_panelGrid_11.setStyle("width: 220px;");
    _jspx_th_n_panelGrid_11.setJspBody(new carregamento_jspHelper( 30, _jspx_page_context, _jspx_th_n_panelGrid_11, null));
    _jspx_th_n_panelGrid_11.doTag();
    return false;
  }

  private boolean _jspx_meth_t_propertyConfig_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:propertyConfig
    br.com.linkcom.neo.view.template.PropertyConfigTag _jspx_th_t_propertyConfig_5 = new br.com.linkcom.neo.view.template.PropertyConfigTag();
    _jspx_th_t_propertyConfig_5.setJspContext(_jspx_page_context);
    _jspx_th_t_propertyConfig_5.setParent(_jspx_parent);
    _jspx_th_t_propertyConfig_5.setMode("input");
    _jspx_th_t_propertyConfig_5.setShowLabel(new Boolean(true));
    _jspx_th_t_propertyConfig_5.setRenderAs("doubleline");
    _jspx_th_t_propertyConfig_5.setJspBody(new carregamento_jspHelper( 31, _jspx_page_context, _jspx_th_t_propertyConfig_5, null));
    _jspx_th_t_propertyConfig_5.doTag();
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
    _jspx_th_t_property_15.setName("transportador");
    _jspx_th_t_property_15.setId("idTransportador");
    _jspx_th_t_property_15.setDynamicAttribute(null, "style", new String("width:210px;"));
    _jspx_th_t_property_15.setDynamicAttribute(null, "onchange", new String("atualizarComboBox();clearShowAllStyleVeiculo(false)"));
    _jspx_th_t_property_15.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_7 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_7.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_7.setParent(_jspx_parent);
    _jspx_th_n_panel_7.setJspBody(new carregamento_jspHelper( 32, _jspx_page_context, _jspx_th_n_panel_7, null));
    _jspx_th_n_panel_7.doTag();
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
    _jspx_th_t_property_16.setName("somenteDisponiveis");
    _jspx_th_t_property_16.setId("somenteDisponiveis");
    _jspx_th_t_property_16.setDynamicAttribute(null, "class", new String("checkBoxClass"));
    _jspx_th_t_property_16.setDynamicAttribute(null, "onclick", new String("form['transportador'].onchange()"));
    _jspx_th_t_property_16.setShowLabel(new Boolean(false));
    _jspx_th_t_property_16.setRenderAs("single");
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
    _jspx_th_t_property_17.setName("veiculo");
    _jspx_th_t_property_17.setItens((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${VEICULOS}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_t_property_17.setDynamicAttribute(null, "style", new String("width:210px;"));
    _jspx_th_t_property_17.setDynamicAttribute(null, "onchange", new String("populatePaletesDisponiveis()"));
    _jspx_th_t_property_17.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_18(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_18 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_18.setJspContext(_jspx_page_context);
    _jspx_th_t_property_18.setParent(_jspx_parent);
    _jspx_th_t_property_18.setName("paletesdisponiveis");
    _jspx_th_t_property_18.setDynamicAttribute(null, "onchange", new String("diminuirEmProporcao(this)"));
    _jspx_th_t_property_18.setRenderAs("single");
    _jspx_th_t_property_18.setLabel("Paletes disponíveis");
    _jspx_th_t_property_18.setDynamicAttribute(null, "style", new String("width:77px;"));
    _jspx_th_t_property_18.doTag();
    return false;
  }

  private boolean _jspx_meth_n_group_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:group
    br.com.linkcom.neo.view.GroupTag _jspx_th_n_group_5 = new br.com.linkcom.neo.view.GroupTag();
    _jspx_th_n_group_5.setJspContext(_jspx_page_context);
    _jspx_th_n_group_5.setParent(_jspx_parent);
    _jspx_th_n_group_5.setLegend("Expedição");
    _jspx_th_n_group_5.setJspBody(new carregamento_jspHelper( 33, _jspx_page_context, _jspx_th_n_group_5, null));
    _jspx_th_n_group_5.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panelGrid_12(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panelGrid
    br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_12 = new br.com.linkcom.neo.view.PanelGridTag();
    _jspx_th_n_panelGrid_12.setJspContext(_jspx_page_context);
    _jspx_th_n_panelGrid_12.setParent(_jspx_parent);
    _jspx_th_n_panelGrid_12.setStyleClass("doublelineformat");
    _jspx_th_n_panelGrid_12.setColumns(new Integer(1));
    _jspx_th_n_panelGrid_12.setStyle("width: 180px; height:131px;");
    _jspx_th_n_panelGrid_12.setJspBody(new carregamento_jspHelper( 34, _jspx_page_context, _jspx_th_n_panelGrid_12, null));
    _jspx_th_n_panelGrid_12.doTag();
    return false;
  }

  private boolean _jspx_meth_t_propertyConfig_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:propertyConfig
    br.com.linkcom.neo.view.template.PropertyConfigTag _jspx_th_t_propertyConfig_6 = new br.com.linkcom.neo.view.template.PropertyConfigTag();
    _jspx_th_t_propertyConfig_6.setJspContext(_jspx_page_context);
    _jspx_th_t_propertyConfig_6.setParent(_jspx_parent);
    _jspx_th_t_propertyConfig_6.setMode("input");
    _jspx_th_t_propertyConfig_6.setShowLabel(new Boolean(true));
    _jspx_th_t_propertyConfig_6.setRenderAs("doubleline");
    _jspx_th_t_propertyConfig_6.setJspBody(new carregamento_jspHelper( 35, _jspx_page_context, _jspx_th_t_propertyConfig_6, null));
    _jspx_th_t_propertyConfig_6.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_19(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_19 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_19.setJspContext(_jspx_page_context);
    _jspx_th_t_property_19.setParent(_jspx_parent);
    _jspx_th_t_property_19.setName("box");
    _jspx_th_t_property_19.setDynamicAttribute(null, "style", new String("width:235px;"));
    _jspx_th_t_property_19.setDynamicAttribute(null, "class", new String("required"));
    _jspx_th_t_property_19.setItens((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${LISTA_BOX}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_t_property_19.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_8 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_8.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_8.setParent(_jspx_parent);
    _jspx_th_n_panel_8.setJspBody(new carregamento_jspHelper( 36, _jspx_page_context, _jspx_th_n_panel_8, null));
    _jspx_th_n_panel_8.doTag();
    return false;
  }

  private boolean _jspx_meth_n_group_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:group
    br.com.linkcom.neo.view.GroupTag _jspx_th_n_group_6 = new br.com.linkcom.neo.view.GroupTag();
    _jspx_th_n_group_6.setJspContext(_jspx_page_context);
    _jspx_th_n_group_6.setParent(_jspx_parent);
    _jspx_th_n_group_6.setLegend("Dados do carregamento");
    _jspx_th_n_group_6.setJspBody(new carregamento_jspHelper( 37, _jspx_page_context, _jspx_th_n_group_6, null));
    _jspx_th_n_group_6.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panelGrid_13(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panelGrid
    br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_13 = new br.com.linkcom.neo.view.PanelGridTag();
    _jspx_th_n_panelGrid_13.setJspContext(_jspx_page_context);
    _jspx_th_n_panelGrid_13.setParent(_jspx_parent);
    _jspx_th_n_panelGrid_13.setStyleClass("doublelineformat");
    _jspx_th_n_panelGrid_13.setColumns(new Integer(1));
    _jspx_th_n_panelGrid_13.setStyle("width: 430px;");
    _jspx_th_n_panelGrid_13.setJspBody(new carregamento_jspHelper( 38, _jspx_page_context, _jspx_th_n_panelGrid_13, null));
    _jspx_th_n_panelGrid_13.doTag();
    return false;
  }

  private boolean _jspx_meth_t_propertyConfig_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:propertyConfig
    br.com.linkcom.neo.view.template.PropertyConfigTag _jspx_th_t_propertyConfig_7 = new br.com.linkcom.neo.view.template.PropertyConfigTag();
    _jspx_th_t_propertyConfig_7.setJspContext(_jspx_page_context);
    _jspx_th_t_propertyConfig_7.setParent(_jspx_parent);
    _jspx_th_t_propertyConfig_7.setMode("input");
    _jspx_th_t_propertyConfig_7.setShowLabel(new Boolean(true));
    _jspx_th_t_propertyConfig_7.setRenderAs("doubleline");
    _jspx_th_t_propertyConfig_7.setJspBody(new carregamento_jspHelper( 39, _jspx_page_context, _jspx_th_t_propertyConfig_7, null));
    _jspx_th_t_propertyConfig_7.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_9 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_9.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_9.setParent(_jspx_parent);
    _jspx_th_n_panel_9.setJspBody(new carregamento_jspHelper( 40, _jspx_page_context, _jspx_th_n_panel_9, null));
    _jspx_th_n_panel_9.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PERMITIR_GERAR_SEPARACAO}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\tstr += \"<br><br><b><a href=\\\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/expedicao/process/Carregamento?ACAO=updateCarregamento&cdcarregamento=\"+json.cdcarregamento+\"\\\">Clique aqui para ir à tela de Gerar Separação.</a></b>\";\r\n");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private class carregamento_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public carregamento_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t<div id=\"telaPrincipal\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_n_bean_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<div id=\"confirmacao\" style=\"display: none;\">\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<div id=\"proc\"class=\"caixa_cinza\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t<a href=\"#\" title=\"\" onclick=\"retornar()\"   id='btn_voltar' onmouseover='Tip(\"Retornar\")'>Retornar à listagem</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_t_property_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_t_propertyConfig_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_n_group_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t\t<a id=\"linkDescerItem\" href=\"#\" onclick=\"if(!$(this).hasClass('inativo'))descer(); return false;\">Descer item selecionado</a> \r\n");
      out.write("\t\t\t\t| <a id=\"linkRemoverItem\" href=\"#\" onclick=\"if(!$(this).hasClass('inativo')) excluir(); return false;\">Remover item(s) selecionado(s)</a> \r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_n_group_3(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_n_panelGrid_10(_jspx_parent, _jspx_page_context))
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
      if (_jspx_meth_n_panelGrid_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div align=\"right\" style=\"padding-right : 5px\">\r\n");
      out.write("\t\t\t\t\t<span style=\"font-size: 10px; text-transform: uppercase; color: #535353; white-space: nowrap;\">Expandir até</span>\r\n");
      out.write("\t\t\t\t\t<select onchange=\"loadDataGrid()\" name=\"expandirAte\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"5\">Rota</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"4\">Pra&ccedil;a</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"3\">Tipo de pedido</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">Filial/Cliente</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"1\">Pedido</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t");
      return false;
    }
    public boolean invoke3( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_group_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_group_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      return false;
    }
    public boolean invoke4( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_n_panelGrid_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_n_panelGrid_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      return false;
    }
    public boolean invoke5( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_t_propertyConfig_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke6( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke7( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panelGrid_3(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panelGrid_4(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panelGrid_5(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke8( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_propertyConfig_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke9( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_3(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke10( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_propertyConfig_3(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke11( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_4(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_5(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke12( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_propertyConfig_4(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke13( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_8(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke14( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tPeríodo de entrega<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_6(_jspx_parent, _jspx_page_context))
        return true;
      out.write(" até ");
      if (_jspx_meth_t_property_7(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke15( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<a style=\"font-size: 10px; text-transform: uppercase; color: #535353; white-space: nowrap; padding-right: 20px; cursor: pointer;\" id=\"btn_filtro\"  onclick=\"loadDataGrid()\">Atualizar Pré-Roteirização</a>\r\n");
      out.write("\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke16( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_n_panelGrid_6(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_n_panelGrid_7(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_choose_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      return false;
    }
    public boolean invoke17( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_3(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_4(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke18( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\tPESO<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"rn_peso\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${peso}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" readonly=\"readonly\" style=\"width:62px; text-align: right; background-color: #dadada;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke19( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\tCUBAGEM<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"rn_cubagem\" readonly=\"readonly\" style=\"width:62px; text-align: right; background-color: #dadada;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke20( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\tVALOR<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"rn_valor\" readonly=\"readonly\" style=\"width:62px; text-align: right; background-color: #dadada;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke21( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_5(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_6(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke22( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\tQtde. PRODUTOS<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"rn_produtos\" readonly=\"readonly\" style=\"width:100px; text-align: right; background-color: #dadada;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke23( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\tN° ENTREGAS<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"rn_numeroentregas\" readonly=\"readonly\" style=\"width:99px; text-align: right; background-color: #dadada;\"/>\r\n");
      out.write("\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke24( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_9(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_10(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_11(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke25( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_12(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_13(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_14(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke26( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t<table id=\"tableheader\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"width:530px;\">Rota/Praça/Tipo de pedido/Depósito de transbordo/Cliente</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"width:110px; text-align: right;\">Qtde. Produtos</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"width:100px; text-align: right;\">Peso(Kg)</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"width:100px; text-align: right;\">Cub.(m³)</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"width:100px; text-align: right;\">Valor</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<div class=\"carregandoComplete\" id=\"loading\">\r\n");
      out.write("\t\t\t\t\t<div class=\"msg\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/imagens/icone/loading.gif\"/><br><span>Carregando, Aguarde.</span></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"iframeArea\"></div>\r\n");
      out.write("\t\t\t");
      return false;
    }
    public boolean invoke27( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t<table id=\"tableheader\">\r\n");
      out.write("\t\t\t\t\t<thead class=\"tituloTabela\">\r\n");
      out.write("\t\t\t\t\t\t<tr id =\"0\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"width:15px;\"><input type=\"checkbox\" class=\"checkBoxClass\" name=\"selectAll\" id=\"selectAll\" onclick=\"javascript:$dg.changeCheckState('tableRoterizacao');\"/></th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"width:190px;\">Rota</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"width:185px;\">Praça</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"width:50px;\">T.P.</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"width:130px;\">Depósito de transbordo</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"width:130px;\">Cliente</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"width:130px;\">Pedido/Filial</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"width:90px; text-align: right;\">Qtde. Prod.</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"width:80px; text-align: right;\">Peso(Kg)</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"width:70px; text-align: center;\">Cub.(m³)</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"text-align: right;width: 70px;\">Valor</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th style=\"text-align: right;width: 120px;\">Prioridade</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<div class=\"scrollArea\">\r\n");
      out.write("\t\t\t\t\t<table id=\"tableRoterizacao\" border=\"0\" cellpadding=\"1\" cellspacing=\"0\" width=\"98%\">\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t");
      return false;
    }
    public boolean invoke28( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_group_4(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_group_5(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_panel_8(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      return false;
    }
    public boolean invoke29( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_n_panelGrid_11(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      return false;
    }
    public boolean invoke30( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_t_propertyConfig_5(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke31( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_15(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_7(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_17(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_18(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke32( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_16(_jspx_parent, _jspx_page_context))
        return true;
      out.write("<label for=\"somenteDisponiveis\"> SOMENTE DISPONÍVEIS</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke33( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_n_panelGrid_12(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      return false;
    }
    public boolean invoke34( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_t_propertyConfig_6(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke35( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_19(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke36( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_n_group_6(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" onclick=\"exibirDetalhesPedidos();return false;\" onmouseover=\"Tip('Visualizar detalhes dos pedidos')\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/imagens/consultar_icon.gif\" border=\"0\"/>Detalhes\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;<a href='#dg_cubagem' id=\"gerar-carregamento\" class='btn_engrenagem' onmouseover='Tip(\"Continuar\")' onclick='gerarCarregamento()'>Gerar carregamento</a>\r\n");
      out.write("\t\t\t\t\t");
      return false;
    }
    public boolean invoke37( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panelGrid_13(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke38( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_propertyConfig_7(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke39( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_9(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke40( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table class=\"tblTotal\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"clear\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"title\" >Qtde. Prod.</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"title\">Peso(Kg)</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"title\">Cub.(m³)</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"title\">Valor</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><b>Ocupação</b></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td id=\"dgt_numeroprod\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td id=\"dgt_peso\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td id=\"dgt_cub\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td id=\"dgt_valor\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td><b>Limite</b></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td id=\"dg_peso\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td id=\"dg_cubagem\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br><div id=\"totalEntregas\">Total de entregas:</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
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
          case 26:
            invoke26( out );
            break;
          case 27:
            invoke27( out );
            break;
          case 28:
            invoke28( out );
            break;
          case 29:
            invoke29( out );
            break;
          case 30:
            invoke30( out );
            break;
          case 31:
            invoke31( out );
            break;
          case 32:
            invoke32( out );
            break;
          case 33:
            invoke33( out );
            break;
          case 34:
            invoke34( out );
            break;
          case 35:
            invoke35( out );
            break;
          case 36:
            invoke36( out );
            break;
          case 37:
            invoke37( out );
            break;
          case 38:
            invoke38( out );
            break;
          case 39:
            invoke39( out );
            break;
          case 40:
            invoke40( out );
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
