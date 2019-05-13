package org.apache.jsp.WEB_002dINF.jsp.expedicao.process;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.linkcom.wms.geral.bean.Tipooperacao;
import br.com.linkcom.wms.geral.service.ConfiguracaoService;
import br.com.linkcom.wms.util.armazenagem.ConfiguracaoVO;
import br.com.linkcom.wms.util.WmsUtil;

public final class visualizardetalhes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("w:message", br.com.linkcom.wms.util.tag.TagFunctions.class, "getMessage", new Class[] {java.lang.String.class});
}

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\r\n");
      out.write("\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=iso-8859-1\">\r\n");
      out.write("\t\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<link rel=\"StyleSheet\"        href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tema_wms}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/default.css\" type=\"text/css\">\t\r\n");
      out.write("\t\t<link rel=\"StyleSheet\"        href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tema_wms}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/app-ie.css\" type=\"text/css\">\t\r\n");
      out.write("\t\t<link rel=\"StyleSheet\"        href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tema_wms}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/app.css\" type=\"text/css\">\r\n");
      out.write("\t\t<link rel=\"StyleSheet\"        href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tema_wms}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/theme.css\" type=\"text/css\">\t\r\n");
      out.write("\t\t<script language=\"JavaScript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resource/js/autocomplete/jquery.js\"></script>\r\n");
      out.write("\t\t<script language=\"JavaScript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resource/js/input.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/wms.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"loadmsg\">\r\n");
      out.write("\t\t\t<span class=\"message\">Carregando...</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<script language=\"JavaScript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/wz_tooltip.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t<div id=\"corpo\">\r\n");
      out.write("\t\t\t\t<div class=\"cabecalho\">\r\n");
      out.write("\t\t\t\t\t<div class=\"logo\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/imagens/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tema_wms}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/sys/logo_wave.gif\"></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"cabecalho\" class=\"right\" align=\"right\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\t\t\t\t\r\n");
      out.write("\t\t<div class=\"conteudo\">\r\n");
      out.write("\t\t\t<div id=\"dynamic_messages\"></div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write(" \r\n");
      if (_jspx_meth_t_tela_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\t/*\t\r\n");
      out.write("\t\tAuthor: Guilherme Oliveira: guilherme.oliveira@linkcom.com.br\r\n");
      out.write("\t*/\r\n");
      out.write("\t\r\n");
      out.write("\tvar exibirColunaEtiqueta = ");
      out.print(ConfiguracaoService.getInstance().isTrue(ConfiguracaoVO.OPERACAO_EXPEDICAO_POR_BOX, WmsUtil.getDeposito()) ? "true" : "false" );
      out.write(";\r\n");
      out.write("\tvar operacaoPorBox = ");
      out.print(ConfiguracaoService.getInstance().isTrue(ConfiguracaoVO.OPERACAO_EXPEDICAO_POR_BOX, WmsUtil.getDeposito()) ? "true" : "false" );
      out.write(";\r\n");
      out.write("\t\t\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\tdoFilter();\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t/* Cria as linhas do Datagrid */\r\n");
      out.write("\tfunction makeRow(obj, isMapaSeparacao) {\r\n");
      out.write("\t\tvar row = \"\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar count = 0;\r\n");
      out.write("\t\tvar qtdePorItem = {};\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfor(var i=0; i<obj.length; i++) {\r\n");
      out.write("\t\t\tvar ordemservicoproduto = obj[i];\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfor(var j=0; j<ordemservicoproduto.listaEtiquetaexpedicao.length; j++) {\r\n");
      out.write("\t\t\t\tvar etiqueta = ordemservicoproduto.listaEtiquetaexpedicao[j];\r\n");
      out.write("\t\t\t\texibirColunaEtiqueta = exibirColunaEtiqueta || etiqueta.carregamentoitem.pedidovendaproduto.tipooperacao.imprimeetiqueta;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar qtdeEsperada;\r\n");
      out.write("\t\t\t\tif (!isMapaSeparacao){\r\n");
      out.write("\t\t\t\t\tif (operacaoPorBox || etiqueta.carregamentoitem.pedidovendaproduto.tipooperacao.imprimeetiqueta){\r\n");
      out.write("\t\t\t\t\t\tqtdeEsperada = 1;\r\n");
      out.write("\t\t\t\t\t}else if (etiqueta.carregamentoitem.pedidovendaproduto.tipooperacao.separacliente){\r\n");
      out.write("\t\t\t\t\t\tqtdeEsperada = etiqueta.carregamentoitem.pedidovendaproduto.qtde;\r\n");
      out.write("\t\t\t\t\t}else\r\n");
      out.write("\t\t\t\t\t\tqtdeEsperada = ordemservicoproduto.qtdeesperada;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tqtdeEsperada = etiqueta.carregamentoitem.pedidovendaproduto.qtde;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tcount++;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar qtdeConfirmada;\r\n");
      out.write("\t\t\t\tif (isMapaSeparacao){\r\n");
      out.write("\t\t\t\t\tqtdeConfirmada = etiqueta.carregamentoitem.qtdeconfirmada;\r\n");
      out.write("\t\t\t\t\tfor(var k=0; k<etiqueta.listaEtiquetaexpedicaogrupo.length; k++) {\r\n");
      out.write("\t\t\t\t\t\tqtdeConfirmada += etiqueta.listaEtiquetaexpedicaogrupo[k].carregamentoitem.qtdeconfirmada;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tif (operacaoPorBox || etiqueta.carregamentoitem.pedidovendaproduto.tipooperacao.imprimeetiqueta){\r\n");
      out.write("\t\t\t\t\t\tif (etiqueta.carregamentoitem.qtdeconfirmada == 0){\r\n");
      out.write("                        \tqtdeConfirmada = etiqueta.carregamentoitem.qtdeconfirmada;\r\n");
      out.write("                        } else if (etiqueta.carregamentoitem.qtdeconfirmada > 0){\r\n");
      out.write("\t\t\t\t\t\t\tvar idProduto = ordemservicoproduto.produto.cdproduto;\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tvar key = \"'\" + idProduto + '-' + etiqueta.carregamentoitem.cdcarregamentoitem + \"'\";\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tif (qtdePorItem[key]){\r\n");
      out.write("\t\t\t\t\t\t\t\tvar qtdeRestante = qtdePorItem[key];\r\n");
      out.write("\t\t\t\t\t\t\t\tif (qtdeRestante > 0){\r\n");
      out.write("\t\t\t\t\t\t\t\t\tqtdeConfirmada = 1;\r\n");
      out.write("\t\t\t\t\t\t\t\t\tqtdeRestante = qtdeRestante - 1;\r\n");
      out.write("\t\t\t\t\t\t\t\t}else\r\n");
      out.write("\t\t\t\t\t\t\t\t\tqtdeConfirmada = -1;\r\n");
      out.write("\t\t\t\t\t\t\t\tqtdePorItem[key] = qtdeRestante;\r\n");
      out.write("\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\tqtdeConfirmada = 1;\r\n");
      out.write("\t\t\t\t\t\t\t\tvar qtdeRestante = etiqueta.carregamentoitem.qtdeconfirmada - 1;\r\n");
      out.write("\t\t\t\t\t\t\t\tqtdePorItem[key] = qtdeRestante;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}else\r\n");
      out.write("\t\t\t\t\t\t\tqtdeConfirmada = -1;\r\n");
      out.write("\t\t\t\t\t}else {\r\n");
      out.write("\t\t\t\t\t\tqtdeConfirmada = etiqueta.carregamentoitem.qtdeconfirmada;\r\n");
      out.write("\t\t\t\t\t\tfor(var k=0; k<etiqueta.listaEtiquetaexpedicaogrupo.length; k++) {\r\n");
      out.write("\t\t\t\t\t\t\tqtdeConfirmada += etiqueta.listaEtiquetaexpedicaogrupo[k].carregamentoitem.qtdeconfirmada;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t//quando a operação imprime etiqueta, cada etiqueta será relacionada a um único item\r\n");
      out.write("\t\t\t\t//porém no mapa de separação agrupa\r\n");
      out.write("\t\t\t\t//if (etiqueta.carregamentoitem.pedidovendaproduto.tipooperacao.imprimeetiqueta && qtdeConfirmada && !isMapaSeparacao)\r\n");
      out.write("\t\t\t\t//\tqtdeConfirmada = -1;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif ((qtdeConfirmada < 0 && etiqueta.qtdecoletor != qtdeEsperada) || (qtdeConfirmada >= 0 && qtdeConfirmada != qtdeEsperada))\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\trow += \"<tr class='\" + (count % 2 == 0 ? \"dataGridBody1\" : \"dataGridBody2\") + \"' style='background-color: #EEE8AA'>\";\r\n");
      out.write("\t\t\t\telse\r\n");
      out.write("\t\t\t\t\trow += \"<tr class='\" + (count % 2 == 0 ? \"dataGridBody1\" : \"dataGridBody2\") + \"'>\";\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\trow += \"<td style=\\\"display:none\\\"><input type=\\\"text\\\" name=\\\"osproduto\\\" value=\\\"\" + ordemservicoproduto.cdordemservicoproduto + \"\\\"></td>\";\r\n");
      out.write("\t\t\t\trow += \"<td style=\\\"display:none\\\"><input type=\\\"text\\\" name=\\\"etiquetaexpedicao\\\" value=\\\"\" + etiqueta.cdetiquetaexpedicao + \"\\\"></td>\";\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\trow += \"<td style=\\\"display:none\\\"><input type=\\\"text\\\" name=\\\"qtdeesperada\\\" value=\\\"\" + \r\n");
      out.write("\t\t\t\t\t\t\tqtdeEsperada + \"\\\"></td>\";\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif (operacaoPorBox || etiqueta.carregamentoitem.pedidovendaproduto.tipooperacao.imprimeetiqueta)\r\n");
      out.write("\t\t\t\t\trow += \"<td>\" + etiqueta.cdetiquetaexpedicao + \"</td>\";\r\n");
      out.write("\t\t\t\telse\r\n");
      out.write("\t\t\t\t\trow += \"<td></td>\";\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif (ordemservicoproduto.produto.produtoprincipal){\r\n");
      out.write("\t\t\t\t\trow += \"<td align='right'>\" + ordemservicoproduto.produto.produtoprincipal.codigo + \"</td>\";\r\n");
      out.write("\t\t\t\t\trow += \"<td align='left'>\" + ordemservicoproduto.produto.produtoprincipal.descricao + \"</td>\";\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar complemento = ordemservicoproduto.produto.complementocodigobarras;\r\n");
      out.write("\t\t\t\t\tvar volume = \"\";\r\n");
      out.write("\t\t\t\t\tif (complemento && complemento != \"\")\r\n");
      out.write("\t\t\t\t\t\tvolume = complemento.substring(0,2) + \"/\" + complemento.substring(2);\r\n");
      out.write("\t\t\t\t\trow += \"<td>\" + volume + \"</td>\";\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\trow += \"<td align='right'>\" + ordemservicoproduto.produto.codigo + \"</td>\";\r\n");
      out.write("\t\t\t\t\trow += \"<td align='left'>\" + ordemservicoproduto.produto.descricao + \"</td>\";\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\trow += \"<td></td>\"; /* Volume */\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\trow += \"<td align='left'>\" + etiqueta.carregamentoitem.pedidovendaproduto.pedidovenda.cliente.nome  + \"</td>\";\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\trow += \"<td align='right'>\" + etiqueta.carregamentoitem.pedidovendaproduto.pedidovenda.numero + \"</td>\";\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\trow += \"<td align='right' name=\\\"qtdeesperada\\\">\" + qtdeEsperada + \"</td>\";\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\tif(etiqueta.qtdecoletor == -1) {\r\n");
      out.write("\t\t\t\t\trow += \"<td></td>\";\t\t\t\t\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\trow += \"<td align='right'>\" + etiqueta.qtdecoletor + \"</td>\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(qtdeConfirmada < 0) {\r\n");
      out.write("\t\t\t\t\trow += \"<td></td>\";\t\t\t\t\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\trow += \"<td align='right'>\" + qtdeConfirmada + \"</td>\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\trow += \"</tr>\";\r\n");
      out.write("\t\t\t}\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\treturn row;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction montarLinhasEmbalagens(obj, isMapaSeparacao) {\r\n");
      out.write("\t\tvar row = \"\";\r\n");
      out.write("\t\tvar count = $(\"#corte tbody\").length;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfor(var i = 0; i < obj.length; i++) {\r\n");
      out.write("\t\t\tvar embalagem = obj[i];\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif (embalagem.conferida)\t\t\t\t\t\r\n");
      out.write("\t\t\t\trow += \"<tr class='\" + (count % 2 == 0 ? \"dataGridBody1\" : \"dataGridBody2\") + \"'>\";\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t\trow += \"<tr class='\" + (count % 2 == 0 ? \"dataGridBody1\" : \"dataGridBody2\") + \"' style='background-color: #EEE8AA'>\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\trow += \"<td style=\\\"display:none\\\"></td>\";\r\n");
      out.write("\t\t\trow += \"<td style=\\\"display:none\\\"></td>\";\r\n");
      out.write("\t\t\trow += \"<td style=\\\"display:none\\\"></td>\";\r\n");
      out.write("\t\t\trow += \"<td>\" + embalagem.cdembalagemexpedicao + \"</td>\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\trow += \"<td align='right'>\" + embalagem.lacre + \"</td>\";\r\n");
      out.write("\t\t\trow += \"<td align='left'>Embalagem de expedição lacre: \" + embalagem.lacre + \"</td>\";\r\n");
      out.write("\t\t\trow += \"<td></td>\"; /* Volume */\r\n");
      out.write("\t\t\trow += \"<td align='left'></td>\";\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\trow += \"<td align='right'></td>\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\trow += \"<td align='right'>1</td>\";\r\n");
      out.write("\t\t\tif (embalagem.conferida)\t\t\t\t\r\n");
      out.write("\t\t\t\trow += \"<td align='right'>1</td>\";\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t\trow += \"<td align='right'></td>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\trow += \"<td></td>\";\t\t\r\n");
      out.write("\t\t\trow += \"</tr>\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t$(\"#corte tbody\").append(row);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t/* Recupera a listagem para corte */\t\r\n");
      out.write("\tfunction doFilter() {\r\n");
      out.write("\t\t$w.showLoading();\r\n");
      out.write("\t\t$('#corte tbody').empty();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar query = {\"ACAO\" : \"getDataGridInfo\",\r\n");
      out.write("\t\t             \"cdordemservico\" : $(\"#ordemservicoId\").val()};\r\n");
      out.write("\r\n");
      out.write("\t\t$w.getJSON(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Visualizardetalhes\", query, function(json) {\r\n");
      out.write("\t\t\t// validar o tipo da ordem de serviço.\r\n");
      out.write("\t\t\tif(json.msgError != \"\") {\r\n");
      out.write("\t\t\t\t$w.hideLoading();\r\n");
      out.write("\t\t\t\t$w.showAlertMessage(json.msgError, 60000, false);\r\n");
      out.write("\t\t\t\t$(\"#corte tbody\").empty();\r\n");
      out.write("\t\t\t\t$(\"#mensagem\").show();\r\n");
      out.write("\t\t\t\tprepararResponsavel();\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tif(json.osproduto != null) {\r\n");
      out.write("\t\t\t\t\t$(\"#corte tbody\").empty().append(makeRow(json.osproduto, json.isMapaSeparacao));\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif (!exibirColunaEtiqueta || json.isMapaSeparacao){\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t$(\"#corte tbody tr\").each(function() {\r\n");
      out.write("\t\t\t\t\t\t\t$(\"td:eq(3)\",$(this)).each(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t$(this).hide();\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t$(\"#idEtiqueta\").hide();\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif (json.isMapaSeparacao){\r\n");
      out.write("\t\t\t\t\t\t$(\"#corte tbody tr\").each(function() {\r\n");
      out.write("\t\t\t\t\t\t\t//ocultando a coluna de volume\r\n");
      out.write("\t\t\t\t\t\t\t$(\"td:eq(6)\",$(this)).each(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t$(this).hide();\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t$(\"#idVolume\").hide();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$(\"#mensagem\").hide();\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$(\"#corte tbody\").empty();\r\n");
      out.write("\t\t\t\t\t$(\"#mensagem\").show();\t\r\n");
      out.write("\t\t\t\t\tprepararResponsavel();\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(json.listaEmbalagens != null) {\r\n");
      out.write("\t\t\t\t\tmontarLinhasEmbalagens(json.listaEmbalagens, json.isMapaSeparacao);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t$w.hideLoading();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\t\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_t_tela_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tela
    br.com.linkcom.neo.view.template.TelaTag _jspx_th_t_tela_0 = new br.com.linkcom.neo.view.template.TelaTag();
    _jspx_th_t_tela_0.setJspContext(_jspx_page_context);
    _jspx_th_t_tela_0.setTitulo("Acompanhamento da conferência");
    _jspx_th_t_tela_0.setJspBody(new visualizardetalhes_jspHelper( 0, _jspx_page_context, _jspx_th_t_tela_0, null));
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
    _jspx_th_n_bean_0.setJspBody(new visualizardetalhes_jspHelper( 1, _jspx_page_context, _jspx_th_n_bean_0, null));
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
    _jspx_th_t_propertyConfig_0.setJspBody(new visualizardetalhes_jspHelper( 2, _jspx_page_context, _jspx_th_t_propertyConfig_0, null));
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
    _jspx_th_n_panelGrid_0.setColumns(new Integer(5));
    _jspx_th_n_panelGrid_0.setStyleClass("doublelineformat");
    _jspx_th_n_panelGrid_0.setJspBody(new visualizardetalhes_jspHelper( 3, _jspx_page_context, _jspx_th_n_panelGrid_0, null));
    _jspx_th_n_panelGrid_0.doTag();
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
    _jspx_th_t_propertyConfig_1.setJspBody(new visualizardetalhes_jspHelper( 4, _jspx_page_context, _jspx_th_t_propertyConfig_1, null));
    _jspx_th_t_propertyConfig_1.doTag();
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
    _jspx_th_t_property_0.setName("cdordemservico");
    _jspx_th_t_property_0.setId("ordemservicoId");
    _jspx_th_t_property_0.setDynamicAttribute(null, "readonly", new String("readonly"));
    _jspx_th_t_property_0.setDynamicAttribute(null, "style", new String("width: 130px;"));
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
    _jspx_th_t_property_1.setName("ordemservicoUsuario.usuario.nome");
    _jspx_th_t_property_1.setDynamicAttribute(null, "readonly", new String("readonly"));
    _jspx_th_t_property_1.setLabel("Usuário");
    _jspx_th_t_property_1.setDynamicAttribute(null, "style", new String("width: 250px;"));
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
    _jspx_th_t_property_2.setName("ordemservicoUsuario.usuario.logincoletor");
    _jspx_th_t_property_2.setDynamicAttribute(null, "readonly", new String("readonly"));
    _jspx_th_t_property_2.setDynamicAttribute(null, "style", new String("width: 120px;"));
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
    _jspx_th_t_property_3.setName("ordemservicoUsuario.dtinicio");
    _jspx_th_t_property_3.setDynamicAttribute(null, "readonly", new String("readonly"));
    _jspx_th_t_property_3.setDynamicAttribute(null, "style", new String("width: 130px;"));
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
    _jspx_th_t_property_4.setName("ordemservicoUsuario.dtfim");
    _jspx_th_t_property_4.setDynamicAttribute(null, "readonly", new String("readonly"));
    _jspx_th_t_property_4.setDynamicAttribute(null, "style", new String("width: 130px;"));
    _jspx_th_t_property_4.doTag();
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
    _jspx_th_n_dataGrid_0.setId("corte");
    _jspx_th_n_dataGrid_0.setHeaderStyleClass("dataGridHeader");
    _jspx_th_n_dataGrid_0.setStyle("width:966px");
    _jspx_th_n_dataGrid_0.setJspBody(new visualizardetalhes_jspHelper( 5, _jspx_page_context, _jspx_th_n_dataGrid_0, null));
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
    _jspx_th_n_column_0.setHeader("Etiqueta");
    _jspx_th_n_column_0.setDynamicAttribute(null, "id", new String("idEtiqueta"));
    _jspx_th_n_column_0.setJspBody(new visualizardetalhes_jspHelper( 6, _jspx_page_context, _jspx_th_n_column_0, null));
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
    _jspx_th_n_column_1.setHeader("Código");
    _jspx_th_n_column_1.setJspBody(new visualizardetalhes_jspHelper( 7, _jspx_page_context, _jspx_th_n_column_1, null));
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
    _jspx_th_n_column_2.setHeader("Produto");
    _jspx_th_n_column_2.setJspBody(new visualizardetalhes_jspHelper( 8, _jspx_page_context, _jspx_th_n_column_2, null));
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
    _jspx_th_n_column_3.setDynamicAttribute(null, "id", new String("idVolume"));
    _jspx_th_n_column_3.setJspBody(new visualizardetalhes_jspHelper( 9, _jspx_page_context, _jspx_th_n_column_3, null));
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
    _jspx_th_n_column_4.setHeader("Cliente");
    _jspx_th_n_column_4.setJspBody(new visualizardetalhes_jspHelper( 10, _jspx_page_context, _jspx_th_n_column_4, null));
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
    _jspx_th_n_column_5.setHeader((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${w:message('pedidovenda')}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
    _jspx_th_n_column_5.setJspBody(new visualizardetalhes_jspHelper( 11, _jspx_page_context, _jspx_th_n_column_5, null));
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
    _jspx_th_n_column_6.setHeader("Qtde. esperada");
    _jspx_th_n_column_6.setJspBody(new visualizardetalhes_jspHelper( 12, _jspx_page_context, _jspx_th_n_column_6, null));
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
    _jspx_th_n_column_7.setHeader("Qtde. conferida");
    _jspx_th_n_column_7.setJspBody(new visualizardetalhes_jspHelper( 13, _jspx_page_context, _jspx_th_n_column_7, null));
    _jspx_th_n_column_7.doTag();
    return false;
  }

  private boolean _jspx_meth_n_column_8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:column
    br.com.linkcom.neo.view.ColumnTag _jspx_th_n_column_8 = new br.com.linkcom.neo.view.ColumnTag();
    _jspx_th_n_column_8.setJspContext(_jspx_page_context);
    _jspx_th_n_column_8.setParent(_jspx_parent);
    _jspx_th_n_column_8.setHeader("Qtde. confirmada");
    _jspx_th_n_column_8.setJspBody(new visualizardetalhes_jspHelper( 14, _jspx_page_context, _jspx_th_n_column_8, null));
    _jspx_th_n_column_8.doTag();
    return false;
  }

  private class visualizardetalhes_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public visualizardetalhes_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
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
      out.write('\r');
      out.write('\n');
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
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
      out.write("\t\t\t");
      if (_jspx_meth_n_panelGrid_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div align=\"right\" style=\"padding-top: 7px\">\r\n");
      out.write("\t\t\t\t<button width=\"100%\" style=\"color:black; font-weight:bold; background-color:transparent; text-transform:none; padding:5px 5px 5px 15px; border: 0px; font-size:11px;\" \r\n");
      out.write("\t\t\t\t\t\tonmouseover=\"Tip('Buscar')\" id=\"btn_engrenagem\" onclick=\"doFilter()\">Atualizar</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_n_dataGrid_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div id=\"mensagem\">Nenhum resultado encontrado.</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t");
      return false;
    }
    public boolean invoke3( JspWriter out ) 
      throws Throwable
    {
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_propertyConfig_1(_jspx_parent, _jspx_page_context))
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
      out.write("\t\t\t\t");
      return false;
    }
    public boolean invoke5( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_column_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_column_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_column_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_column_3(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_column_4(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_column_5(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_column_6(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_column_7(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_column_8(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
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
    public boolean invoke12( JspWriter out ) 
      throws Throwable
    {
      out.write(' ');
      return false;
    }
    public boolean invoke13( JspWriter out ) 
      throws Throwable
    {
      out.write(' ');
      return false;
    }
    public boolean invoke14( JspWriter out ) 
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
