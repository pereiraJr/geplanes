package org.apache.jsp.WEB_002dINF.jsp.expedicao.process;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class carregamentoDataGrid_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("w:formatadata", br.com.linkcom.wms.util.tag.TagFunctions.class, "formataData", new Class[] {java.util.Date.class});
}

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tld/wms.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_pattern_minIntegerDigits_minFractionDigits_maxFractionDigits;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_pattern_minIntegerDigits_minFractionDigits_maxFractionDigits = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_fmt_formatNumber_pattern_minIntegerDigits_minFractionDigits_maxFractionDigits.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=iso-8859-1\">\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("\r\n");
      out.write("<script language=\"JavaScript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resource/js/autocomplete/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/wms.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"StyleSheet\"        href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tema_wms}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/app.css\" type=\"text/css\">\t\r\n");
      out.write("<style>\r\n");
      out.write("\tbody {\r\n");
      out.write("\t\tbackground-color: #ffffff;\r\n");
      out.write("\t\tmargin-left: 0px;\r\n");
      out.write("\t\tmargin-top: 0px;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mapa}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<input type=\"hidden\" name=\"dtfiltroinicial\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${w:formatadata(filtro.dtentregainicio)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\">\r\n");
      out.write("<input type=\"hidden\" name=\"dtfiltrofinal\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${w:formatadata(filtro.dtentregafim)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\">\r\n");
      out.write("<table id=\"tablemain\">\r\n");
      out.write("\t<tbody id=\"treetable\">\r\n");
      out.write("\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tvar last = 6;\r\n");
      out.write("\tvar arr = new Array();\r\n");
      out.write("\tvar arrObj = new Array();\r\n");
      out.write("\tvar arrExcluidos = new Array();\r\n");
      out.write("\t\r\n");
      out.write("\tvar mapa = [],mapOriginal = [], mapb = [], num=0,selectedRow=null,opts=null;\r\n");
      out.write("\r\n");
      out.write("\tfunction loadTreeGrid(){\r\n");
      out.write("\t    opts = {\r\n");
      out.write("\t    \topenImg: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/imagens/treetable/tv-collapsable.gif\", \r\n");
      out.write("\t    \tshutImg: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/imagens/treetable/tv-expandable.gif\", \r\n");
      out.write("\t    \tleafImg: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/imagens/treetable/tv-item.gif\", \r\n");
      out.write("\t    \tlastOpenImg: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/imagens/treetable/tv-collapsable-last.gif\", \r\n");
      out.write("\t    \tlastShutImg: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/imagens/treetable/tv-expandable-last.gif\", \r\n");
      out.write("\t    \tlastLeafImg: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/imagens/treetable/tv-item-last.gif\", \r\n");
      out.write("\t    \tvertLineImg: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/imagens/treetable/vertline.gif\", \r\n");
      out.write("\t    \tblankImg: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/imagens/treetable/blank.gif\", \r\n");
      out.write("\t    \tcollapse: false, \r\n");
      out.write("\t    \tcolumn: 1, \r\n");
      out.write("\t    \tstriped: true, \r\n");
      out.write("\t    \thighlight: true, \r\n");
      out.write("\t    \tonselect: function(target){},\r\n");
      out.write("\t    \thideCarregando: function(){window.top.hideCarregando()},\r\n");
      out.write("\t    \tshowCarregando: function(){window.top.showCarregando()}\r\n");
      out.write("\t    \t//hideCarregando: function(){},\r\n");
      out.write("\t    \t//showCarregando: function(){}\r\n");
      out.write("\t    \t\r\n");
      out.write("\t    };\r\n");
      out.write("    \t\r\n");
      out.write("    \tmapOriginal = [");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listaPais}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("];\r\n");
      out.write("    \t\r\n");
      out.write("    \tfor (var x=0,xl=mapOriginal.length; x<xl;x++){//From map of parents, get map of kids\r\n");
      out.write("\t\t\tnum = mapOriginal[x];\r\n");
      out.write("\t\t\tif (!mapa[num]){\r\n");
      out.write("        \t\tmapa[num] = [];\r\n");
      out.write("      \t\t}\r\n");
      out.write("      \t\tmapa[num].push(x+1);\r\n");
      out.write("    \t}\r\n");
      out.write("\r\n");
      out.write("    \t\r\n");
      out.write("    \t$(\"#treetable\").click( function( event ) {//This looks after selecting td's\r\n");
      out.write("      \t\tvar $target = (event.target.tagName == \"TD\")?$(event.target):$(event.target).parent();\r\n");
      out.write("   \t\t\tif (typeof opts.onselect == \"function\"){\r\n");
      out.write("     \t\t\tvar parentRow = $target.parent();\r\n");
      out.write("     \t\t\t$(\"tr.selected\", this).removeClass(\"selected\");\r\n");
      out.write("     \t\t\tparentRow.addClass(\"selected\");\r\n");
      out.write("     \t\t\tselectedRow = parentRow;\r\n");
      out.write("    \t\t\topts.onselect($target);\r\n");
      out.write("   \t\t\t};\r\n");
      out.write("   \t\t });\r\n");
      out.write("    \r\n");
      out.write("    \t$(\"#treetable\").dblclick( function( event ) {//This looks after selecting td's\r\n");
      out.write("      \t\tvar $target = (event.target.tagName == \"TD\")?$(event.target):$(event.target).parent();\r\n");
      out.write("      \t\tif (typeof opts.onselect == \"function\"){\r\n");
      out.write("        \t\tvar parentRow = $target.parent();\r\n");
      out.write("        \t\t$(\"tr.selected\", this).removeClass(\"selected\");\r\n");
      out.write("        \t\tparentRow.addClass(\"selected\");\r\n");
      out.write("        \t\tselectedRow = parentRow;\r\n");
      out.write("        \t\tif(selectedRow.attr(\"fiveKeys\").indexOf(\",\") > 1){\r\n");
      out.write("        \t\t\t$w.openPopup(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Carregamento?ACAO=openPopUp&chave=\"+selectedRow.attr(\"fiveKeys\")+\"&isRoteirizacao=false&clienteID=\"+selectedRow.attr(\"val\")+\"&dtentregainicio=\"+$(\"input[name=dtfiltroinicial]\").val()+\"&dtentregafim=\"+$(\"input[name=dtfiltrofinal]\").val(),950,605);\r\n");
      out.write("        \t\t}\r\n");
      out.write("        \t\telse{\r\n");
      out.write("\t        \t\tif(event.target.tagName == \"TD\")\r\n");
      out.write("\t        \t\t\tparentRow.find(\"img[id^=r]\").click()\r\n");
      out.write("\t        \t\topts.onselect($target);\r\n");
      out.write("\t        \t}\r\n");
      out.write("      \t\t};\r\n");
      out.write("    \t});\r\n");
      out.write("    \t$(window).unload(function () {\r\n");
      out.write("\t   \t\t$(\"#treetable\").unbind(\"click\");\r\n");
      out.write("\t   \t\t$(\"#treetable\").unbind(\"dblclick\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction openCloseNode(elemento){\r\n");
      out.write("\t\tvar jqo = $(elemento);\r\n");
      out.write("   \t\tvar num = elemento.getAttribute(\"id\").substr(1);\r\n");
      out.write("   \t\t\r\n");
      out.write("   \t\tif (jqo.parents(\"tr\").next().is(\".collapsed\")){\r\n");
      out.write("\t\t\texpandKids(num);\r\n");
      out.write("   \t\t}else{\r\n");
      out.write("    \t\tcollapseKids(num);\r\n");
      out.write("   \t\t}\r\n");
      out.write("   \t\tstripe(0);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction expandKids(num){//Expands immediate children\r\n");
      out.write("\t\t$(\"#r\"+num).attr(\"src\", function(){\r\n");
      out.write("\t\t\treturn (this.src.substr(this.src.lastIndexOf(\"/\")+1)==opts.lastShutImg)? opts.lastOpenImg: opts.openImg;\r\n");
      out.write("    \t});\r\n");
      out.write("    \tvar jq = $(\"#treetable tr\");\r\n");
      out.write("    \tfor (var x=0, xl=mapa[num].length;x<xl;x++){\r\n");
      out.write("\t\t\tjq.eq(mapa[num][x]-1).removeClass(\"collapsed\");\r\n");
      out.write("    \t}\r\n");
      out.write("  \t}\r\n");
      out.write("  \t\r\n");
      out.write("\tfunction collapseKids(num){//Recursively collapses all children and their children and changes\r\n");
      out.write("\t\tvar elm = document.getElementById(\"r\"+num);\r\n");
      out.write("\t\tif (elm && elm.src.substr(elm.src.lastIndexOf(\"/\")+1)!=opts.lastShutImg){\r\n");
      out.write("        \telm.src = (elm.src.substr(elm.src.lastIndexOf(\"/\")+1)==opts.lastOpenImg)? opts.lastShutImg: opts.shutImg;\r\n");
      out.write("      \t}\r\n");
      out.write("\t\tvar jq = $(\"tr\",document.getElementById(\"treetable\"));\r\n");
      out.write("\t\tfor (var x=0, xl=mapa[num].length;x<xl;x++){\r\n");
      out.write("\t\t\tmapnumx = mapa[num][x];\r\n");
      out.write("\t\t\tvar selector = jq.eq(mapnumx-1);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(!selector.hasClass(\"collapsed\")){\r\n");
      out.write("\t\t\t\tselector.addClass(\"collapsed\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\tif (mapa[mapnumx]){\r\n");
      out.write("\t\t\t\t\tcollapseKids(mapnumx);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("    \t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction stripe(num){\r\n");
      out.write("\t\tvar isStriped = ($(\"#treetable tr\").eq(num).attr(\"class\")==\"even over\")? 0:1;\r\n");
      out.write("\t\t$(\"#treetable tr:gt(\"+num+\")\").not(\".collapsed\").each(function(i){\r\n");
      out.write("\t\t\tif ((i+isStriped) % 2==0){\r\n");
      out.write("\t\t\t\t$(this).removeClass(\"even\");\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$(this).addClass(\"even\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t};\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction descer(){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t//inicializa os valores.\r\n");
      out.write("\t\tarr = new Array();\r\n");
      out.write("\t\tarrObj = new Array();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(selectedRow == null){\r\n");
      out.write("\t\t\talert(\"Selecione um registro da área de pré-roterização.\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t//var nivel = selectedRow.find(\"td:eq(\"+opts.column+\")\").find(\"img\").size();\r\n");
      out.write("\t\t\tvar index = selectedRow.attr(\"index\");\r\n");
      out.write("\t\t\tgetFilhos(index);\r\n");
      out.write("\t\t\tvar i = 0;\r\n");
      out.write("\t\t\tfor(i=0; i<arr.length;i++){\r\n");
      out.write("\t\t\t\tarrObj.push(mapaV[arr[i]]);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn arrObj;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getFilhos(index){\r\n");
      out.write("\t\tindex = parseInt(index);\r\n");
      out.write("\t\tvar filhos = getSon(index);\r\n");
      out.write("\t\tvar contains = false;\r\n");
      out.write("\t\tvar j = 0;\r\n");
      out.write("\t\tif(filhos.length > 0) {\r\n");
      out.write("\t\t\tfor(j=0; j< filhos.length; j++){\r\n");
      out.write("\t\t\t\tgetFilhos(filhos[j]);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tcontains = containsInList(index);\r\n");
      out.write("\t\t\tif(!contains){\r\n");
      out.write("\t\t\t\tgetRow(index).addClass(\"blocked\");\r\n");
      out.write("\t\t\t\tarr.push(index - 1);\r\n");
      out.write("\t\t\t\tarrExcluidos.push(index);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn arr;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction voltar(cdformacaocarga){\r\n");
      out.write("\t\tif(!Array.indexOf){\r\n");
      out.write("\t\t    Array.prototype.indexOf = function(obj){\r\n");
      out.write("\t\t        for(var i=0; i<this.length; i++){\r\n");
      out.write("\t\t            if(this[i]==obj){\r\n");
      out.write("\t\t                return i;\r\n");
      out.write("\t\t            }\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t        return -1;\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#treetable\").find(\"tr[val=\"+cdformacaocarga+\"]\").each(function(){\r\n");
      out.write("\t\t\tvar index = $(this).attr(\"index\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tcontains = containsInList(index);\r\n");
      out.write("\t\t\tif(contains){\r\n");
      out.write("\t\t\t\tgetRow(index).removeClass(\"blocked\");\r\n");
      out.write("\t\t\t\tarr.splice(arr.indexOf(index - 1), 1);\r\n");
      out.write("\t\t\t\tarrExcluidos.splice(arrExcluidos.indexOf(index), 1);\r\n");
      out.write("\t\t\t}\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getRow(pos){\r\n");
      out.write("    \treturn $(\"#treetable\").find(\"tr[index=\"+pos+\"]\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction containsInList(idx){\r\n");
      out.write("\t\tvar j;\r\n");
      out.write("\t\tfor(j=0; j< arrExcluidos.length; j++){\r\n");
      out.write("\t\t\tif(arrExcluidos[j] == idx)\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getSon(pos){//Recursively build up the text for the images that make it work\r\n");
      out.write("    \tvar filhos = [],i=0;\r\n");
      out.write("    \tfor(i=0;i<mapOriginal.length;i++){\r\n");
      out.write("    \t\tif(mapOriginal[i] == pos){\r\n");
      out.write("    \t\t\tfilhos.push(i+1);\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t}\r\n");
      out.write("    \treturn filhos;\r\n");
      out.write("\t};\r\n");
      out.write("\t\t\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\tloadTreeGrid();\r\n");
      out.write("\t\twindow.top.dataGridLoaded(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pesoTotal}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cubagemTotal}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${valorTotal}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totalProdutos}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totalEntrega}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(");\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rotas}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_c_forEach_0.setVar("rota");
    _jspx_th_c_forEach_0.setVarStatus("var");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t<tr class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rota.collapsed}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rota.styleClass}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" index=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rota.index}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" nivel=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rota.nivel}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" val=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rota.cdformacaocarga}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" fiveKeys=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rota.cliente.cdpessoa}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(',');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rota.praca.cdpraca}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(',');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rota.tipooperacao.cdtipooperacao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(',');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rota.cep}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(',');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rota.cdpedidovenda}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" prioridade=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rota.prioridade}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t<td style=\"width:500px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rota.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t<td style=\"width:109px; text-align: right;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rota.totalItens}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t<td style=\"width:103px; text-align: right;\">");
          if (_jspx_meth_fmt_formatNumber_0(_jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\r\n");
          out.write("\t\t\t<td style=\"width:103px; text-align: right;\">");
          if (_jspx_meth_fmt_formatNumber_1(_jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\r\n");
          out.write("\t\t\t<td style=\"width:103px; text-align: right;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rota.valor}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_pattern_minIntegerDigits_minFractionDigits_maxFractionDigits.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatNumber_0.setPattern(" ");
    _jspx_th_fmt_formatNumber_0.setMinIntegerDigits(1);
    _jspx_th_fmt_formatNumber_0.setMinFractionDigits(3);
    _jspx_th_fmt_formatNumber_0.setMaxFractionDigits(3);
    int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
    if (_jspx_eval_fmt_formatNumber_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_fmt_formatNumber_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_0[0]++;
        _jspx_th_fmt_formatNumber_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_fmt_formatNumber_0.doInitBody();
      }
      do {
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rota.peso}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        int evalDoAfterBody = _jspx_th_fmt_formatNumber_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_fmt_formatNumber_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_0[0]--;
      }
    }
    if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_pattern_minIntegerDigits_minFractionDigits_maxFractionDigits.reuse(_jspx_th_fmt_formatNumber_0);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_pattern_minIntegerDigits_minFractionDigits_maxFractionDigits.reuse(_jspx_th_fmt_formatNumber_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_pattern_minIntegerDigits_minFractionDigits_maxFractionDigits.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatNumber_1.setPattern(" ");
    _jspx_th_fmt_formatNumber_1.setMinIntegerDigits(1);
    _jspx_th_fmt_formatNumber_1.setMinFractionDigits(3);
    _jspx_th_fmt_formatNumber_1.setMaxFractionDigits(3);
    int _jspx_eval_fmt_formatNumber_1 = _jspx_th_fmt_formatNumber_1.doStartTag();
    if (_jspx_eval_fmt_formatNumber_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_fmt_formatNumber_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_0[0]++;
        _jspx_th_fmt_formatNumber_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_fmt_formatNumber_1.doInitBody();
      }
      do {
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rota.cubagem}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        int evalDoAfterBody = _jspx_th_fmt_formatNumber_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_fmt_formatNumber_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_0[0]--;
      }
    }
    if (_jspx_th_fmt_formatNumber_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_pattern_minIntegerDigits_minFractionDigits_maxFractionDigits.reuse(_jspx_th_fmt_formatNumber_1);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_pattern_minIntegerDigits_minFractionDigits_maxFractionDigits.reuse(_jspx_th_fmt_formatNumber_1);
    return false;
  }
}
