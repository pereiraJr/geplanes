package org.apache.jsp.WEB_002dINF.jsp.util;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class unidadeGerencialTreeView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

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
      out.write("<table class=\"lookup_janela\">\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD class=\"fd_tela_titulo\" height=\"1%\">Unidade Gerencial - ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${descPlanoGestao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD class=\"fd_tela_corpo\">\r\n");
      out.write("\t\t\t<DIV class=\"lookup_arvore\">\r\n");
      out.write("\t\t\t\t<table id=\"treeTableScript\" class=\"lookup_arvore_galhos\" >\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</DIV>\r\n");
      out.write("\t\t\t<script language=\"javascript\">\r\n");
      out.write("\t\t\t\tvar currentSelected = null;\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\tfunction selecionar(){\r\n");
      out.write("\t\t\t\t\tif(currentSelected != null){\r\n");
      out.write("\t\t\t\t\t\twindow.opener.form[document.propriedade+'_label'].value = currentSelected.label;\r\n");
      out.write("\t\t\t\t\t\t$(window.opener.form[document.propriedade+'_label']).attr(\"readOnly\", \"true\")\r\n");
      out.write("\t\t\t\t\t\twindow.opener.form[document.propriedade].value = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${classUnidadeGerencial}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("[id='+currentSelected.id+']';\r\n");
      out.write("\t\t\t\t\t\twindow.opener.document.getElementById('botaoEscolher'+document.propriedade).innerHTML = 'Limpar';\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\twindow.opener.form[document.propriedade].onchange();\r\n");
      out.write("\t\t\t\t\t\twindow.close();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tfunction changeSelectState(node, event){\r\n");
      out.write("\t\t\t\t\tif(currentSelected != null){\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById('td'+currentSelected.id).style.border = '';\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById('td'+currentSelected.id).style.backgroundColor = '';\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tif(currentSelected == node){\r\n");
      out.write("\t\t\t\t\t\tcurrentSelected = null;\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\tselect(node, event)\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tevent.cancelBubble = true;\r\n");
      out.write("\t\t\t\t\tevent.cancel = true;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tfunction select(node, event){\r\n");
      out.write("\t\t\t\t\tdocument.getElementById('td'+node.id).style.border = '1px dotted black';\r\n");
      out.write("\t\t\t\t\tdocument.getElementById('td'+node.id).style.backgroundColor = '#EFEFEF';\r\n");
      out.write("\t\t\t\t\tcurrentSelected = node;\r\n");
      out.write("\t\t\t\t\tevent.cancel = true;\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tfunction findNode(id){\r\n");
      out.write("\t\t\t\t\tfor(var i = 0; i < document.allnodes.length; i++){\r\n");
      out.write("\t\t\t\t\t\tvar node = document.allnodes[i];\r\n");
      out.write("\t\t\t\t\t\tif(node.id == id){\r\n");
      out.write("\t\t\t\t\t\t\t//alert(id);\r\n");
      out.write("\t\t\t\t\t\t\treturn node;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\talert('Nó não encontrado '+id);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\tvar loadingNodes = new Array();\r\n");
      out.write("\t\t\t\tvar inLoad = 0;\r\n");
      out.write("\t\t\t\tfunction loadNodesAjax(oldlist){\r\n");
      out.write("\t\t\t\t\tinLoad++;\r\n");
      out.write("\t\t\t\t\tvar list = new Array();\r\n");
      out.write("\t\t\t\t\tfor(var j = 0; j < oldlist.length; j++){\r\n");
      out.write("\t\t\t\t\t\tvar add = true;\r\n");
      out.write("\t\t\t\t\t\tfor(var i = 0; i < loadingNodes.length; i++){\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tif(oldlist[j] == loadingNodes[i]){\r\n");
      out.write("\t\t\t\t\t\t\t\tadd = false;\r\n");
      out.write("\t\t\t\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif(add){\r\n");
      out.write("\t\t\t\t\t\t\tlist.push(oldlist[j]);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tloadingNodes = loadingNodes.concat(list);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar texto = '';\r\n");
      out.write("\t\t\t\t\tfor(var i =0; i < list.length; i++){\r\n");
      out.write("\t\t\t\t\t\ttexto += list[i].info+'<BR>';\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t//document.getElementById('info').innerHTML = texto;\r\n");
      out.write("\t\t\t\t\tvar params = '';\r\n");
      out.write("\t\t\t\t\tfor(var i =0; i < list.length; i++){\r\n");
      out.write("\t\t\t\t\t\tparams += 'unidadesGerenciais=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${classUnidadeGerencial}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("[id='+list[i].id+']&';\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tif (params != '') {\r\n");
      out.write("\t\t\t\t\t\tparams +='ACAO=load';\r\n");
      out.write("\t\t\t\t\t\tsendRequest('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/util/UnidadeGerencialTreeView',params,'POST', loadNodesAjaxCallback);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tfunction loadNodesAjaxCallback(data){\r\n");
      out.write("\t\t\t\t\tinLoad--;\r\n");
      out.write("\t\t\t\t\tif(inLoad == 0){\r\n");
      out.write("\t\t\t\t\t\tloadingNodes = new Array();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\teval(data);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tfunction loadNodes(node, nivel){\r\n");
      out.write("\t\t\t\t\tvar nodeList = new Array();\r\n");
      out.write("\t\t\t\t\tif(node.hasChild){\r\n");
      out.write("\t\t\t\t\t\tif(node.children.length == 0){\r\n");
      out.write("\t\t\t\t\t\t\tnodeList.push(node);\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\tloadChildNodes(nodeList, node.children, 3);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\treturn nodeList;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tfunction loadChildNodes(list, nodes, nivel){\r\n");
      out.write("\t\t\t\t\t//document.getElementById('info2').innerHTML = document.getElementById('info2').innerHTML + 'loadChild carregar: '+nivel+' niveis   filhos: '+nodes.length+'<BR>';\r\n");
      out.write("\t\t\t\t\tif(nivel > 1){\r\n");
      out.write("\t\t\t\t\t\tfor(var i = 0; i < nodes.length; i++){\r\n");
      out.write("\t\t\t\t\t\t\tvar node = nodes[i];\r\n");
      out.write("\t\t\t\t\t\t\tvar hc = node.hasChild;\r\n");
      out.write("\t\t\t\t\t\t\tif(hc){\r\n");
      out.write("\t\t\t\t\t\t\t\tif(node.children.length == 0){\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\tlist.push(node);\r\n");
      out.write("\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tloadChildNodes(list, node.children, nivel - 1);\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t}\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\tdocument.allnodes = new Array();\r\n");
      out.write("\t\t\t\tvar treeTable = installTreeTable('treeTableScript', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/');\r\n");
      out.write("\t\t\t\ttreeTable.onaddnode = function (node){\r\n");
      out.write("\t\t\t\t\tdocument.allnodes.push(node);\r\n");
      out.write("\t\t\t\t\tnode.onopennode = function(node){\r\n");
      out.write("\t\t\t\t\t\t//alert('abrindo '+node.id);\r\n");
      out.write("\t\t\t\t\t\t//document.getElementById('info2').innerHTML = 'abrindo node '+node.id;\r\n");
      out.write("\t\t\t\t\t\tvar list = loadNodes(node, 3);\r\n");
      out.write("\t\t\t\t\t\tloadNodesAjax(list);\r\n");
      out.write("\t\t\t\t\t};\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${codigo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t\t<div id=\"info\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"info2\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("\t<TR>\r\n");
      out.write("\t\t<TD align=\"right\" style=\"padding: 10px;\" height=\"1%\">\r\n");
      out.write("\t\t\t<button onclick=\"selecionar()\" class=\"botao_normal\" >selecionar</button>\r\n");
      out.write("\t\t</TD>\r\n");
      out.write("\t</TR>\r\n");
      out.write("</table>");
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
}
