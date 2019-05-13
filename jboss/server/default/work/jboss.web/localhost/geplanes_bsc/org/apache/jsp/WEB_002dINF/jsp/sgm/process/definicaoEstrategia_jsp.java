package org.apache.jsp.WEB_002dINF.jsp.sgm.process;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.linkcom.sgm.service.ObjetivoEstrategicoService;
import br.com.linkcom.sgm.controller.filtro.DefinicaoEstrategiaFiltro;

public final class definicaoEstrategia_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tags/unidadeGerencialInput.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
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
      //  t:tela
      br.com.linkcom.neo.view.template.TelaTag _jspx_th_t_tela_0 = new br.com.linkcom.neo.view.template.TelaTag();
      _jspx_th_t_tela_0.setJspContext(_jspx_page_context);
      _jspx_th_t_tela_0.setTitulo("Definição de Objetivos Estratégicos");
      _jspx_th_t_tela_0.setJspBody(new definicaoEstrategia_jspHelper( 0, _jspx_page_context, _jspx_th_t_tela_0, null));
      _jspx_th_t_tela_0.doTag();
      out.write("\r\n");
      out.write("<style>.dataGridHeader{background: inherit;}</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\tfunction addNovaLinhaObjetivoEstrategico(botaoDOM, indexPerspectiva){\r\n");
      out.write("\t\tvar idSelect = Math.round( Math.random()*100000000 );\r\n");
      out.write("\t\tvar botao = $(botaoDOM)\r\n");
      out.write("\t\t//var table = botao.siblings(\"table\").find(\"table\").children(\"tbody\"); //document.getElementById(idTabela);\r\n");
      out.write("\t   \tvar table = botao.parent().parent().prev().find(\"tbody\");\r\n");
      out.write("\t   \tvar rowCount = table.children().size()\r\n");
      out.write("\t   \tvar html = \"<tr class='dataGridBody\"+((rowCount+1)%2+1)+\"'><td >\"+getHTMLSelectObjetivoEstrategico(indexPerspectiva, rowCount, idSelect)+\"</td><td>\" + \r\n");
      out.write("\t   \t\t\t\t\"<a href='javascript:void(0);' onclick='if(confirm(\\\"Tem certeza que deseja excluir este objetivo estratégico?\\\")){excluirLinhaObjetivoEstrategico(this);} ' class='excluirdetalhe' type='button' > \" + \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\"<img border='0' alt='Excluir este item' src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/ico_excluir.gif'></button>\"+  \r\n");
      out.write("\t   \t\"</td></tr>\"\r\n");
      out.write("\t   \ttable.append(html);\r\n");
      out.write("\t   \t$(\"#\"+idSelect).val(botao.prev().val())\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction excluirLinhaObjetivoEstrategico(btnexcluir){\r\n");
      out.write("\t\tvar tabela = $(btnexcluir).parent().parent().parent();\r\n");
      out.write("\t\t$(btnexcluir).parent().parent().remove();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar campo;\r\n");
      out.write("\t\tvar nomeCampo;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t// Reordena o índice dos IDs\r\n");
      out.write("\t\tvar ids = tabela.find(\".idObjetivoEstrategico\")\r\n");
      out.write("\t\tids.each(function(i){\r\n");
      out.write("\t\t\tcampo = $(this);\r\n");
      out.write("\t\t\tnomeCampo = campo.attr(\"name\");\r\n");
      out.write("\t\t\tcampo.attr(\"name\", getNomeSelectReindexado(nomeCampo, i) );\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// Reordena o índice dos selects de objetivo estratégico\r\n");
      out.write("\t\tvar selects = tabela.find(\".selectObjetivoEstrategico\")\r\n");
      out.write("\t\tselects.each(function(i){\r\n");
      out.write("\t\t\tcampo = $(this);\r\n");
      out.write("\t\t\tnomeCampo = campo.attr(\"name\");\r\n");
      out.write("\t\t\tcampo.attr(\"name\", getNomeSelectReindexado(nomeCampo, i) );\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getNomeSelectReindexado(nome, num){\r\n");
      out.write("\t\tvar i = nome.lastIndexOf(\"[\");\r\n");
      out.write("\t\tvar j = nome.lastIndexOf(\"]\");\r\n");
      out.write("\t\t//alert(nome.substr(0,i) + (num) + nome.substr(j))\r\n");
      out.write("\t\treturn nome.substr(0,i+1) + (num) + nome.substr(j)\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getHTMLSelectObjetivoEstrategico(idPai, id, idSelect){\r\n");
      out.write("\t\treturn '<select id=\"'+idSelect+'\"class=\"required selectObjetivoEstrategico\" style=\"\" onchange=\"\" onkeyup=\"$n.limpaCombo(event,this);\" name=\"unidadeGerencial.mapaEstrategico.listaPerspectivaMapaEstrategico['+idPai+'].listaObjetivoMapaEstrategico['+id+'].objetivoEstrategico\">' + \r\n");
      out.write("\t\t\t\t\t\t\t\t'<option value=\"&lt;null&gt;\"></option>' + \r\n");
      out.write("\t\t\t\t\t\t\t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems(ObjetivoEstrategicoService.getInstance().findAll());
      _jspx_th_c_forEach_0.setVar("objetivoEstrategicoItem");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\t\r\n");
            out.write("\t\t\t\t\t\t\t\t'<option value=\"br.com.linkcom.sgm.beans.ObjetivoEstrategico[id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${objetivoEstrategicoItem.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write(']');
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${objetivoEstrategicoItem.descricao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("</option>' + \r\n");
            out.write("\t\t\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\r\n");
      out.write("\t\t\t'</select>';\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction recarregarTela(){\r\n");
      out.write("\t\tform.validate = 'false'; \r\n");
      out.write("\t\tform.suppressErrors.value = 'true';\r\n");
      out.write("\t\tform.ACAO.value = 'entrada';\r\n");
      out.write("\t\tform.suppressValidation.value = 'true';\r\n");
      out.write("\t\tdocument.getElementById('idReload').value = 'true';\r\n");
      out.write("\t\tsubmitForm();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction excluirMapa (){\r\n");
      out.write("\t\tform.ACAO.value ='excluir';\r\n");
      out.write("\t\tform.action = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/sgm/process/DefinicaoEstrategia\";\r\n");
      out.write("\t\tform.validate = 'false';\r\n");
      out.write("\t\tsubmitForm();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction submitForm() {\r\n");
      out.write("\t\tvar validar = form.validate;\r\n");
      out.write("\t\ttry {validarFormulario;} \r\n");
      out.write("\t\tcatch (e) {validar = false;}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\ttry {clearMessages();} catch (e) {}\r\n");
      out.write("\t\tif (validar == \"true\") {var valid = validarFormulario();\r\n");
      out.write("\t\tif (valid) {form.submit();}} else {form.submit();}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\tfunction reindex(form, removedIndexedProperty){\r\n");
      out.write("\t\tif(form==null){\r\n");
      out.write("\t\t\talert(\"reindex(): O form fornecido ? null   \\n\\n@author rogelgarcia\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(removedIndexedProperty==null){\r\n");
      out.write("\t\t\talert(\"reindex(): O removedIndexedProperty fornecido ? null   \\n\\n@author rogelgarcia\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tif(!removedIndexedProperty.match(\"\\\\w*\\\\[\\\\d*\\\\]\")){\r\n");
      out.write("\t\t\t\talert(\"reindex(): O removedIndexedProperty fornecido ? inv?lido (\"+removedIndexedProperty+\")\\nO formato deve ser propriedade[indice]\");\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//alert('reindexing '+removedIndexedProperty);\r\n");
      out.write("\t\tvar property = removedIndexedProperty.substring(0,removedIndexedProperty.lastIndexOf(\"[\"));\r\n");
      out.write("\t\tvar excludedNumber = extrairNumeroDeIndexedProperty(removedIndexedProperty);\r\n");
      out.write("\t\t//alert('property '+property);\r\n");
      out.write("\t\t//alert('excludedNumber '+excludedNumber);\r\n");
      out.write("\t\tfor(i = 0; i < form.elements.length; i++){\r\n");
      out.write("\t\t\tvar element = form.elements[i];\r\n");
      out.write("\t\t\tif(element.name == null) continue;\r\n");
      out.write("\t\t\t//alert(element.name + \" \" + (element.name.match(property+\"\\\\[\\\\d*\\\\].*\")));\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar elementReducedProperty = element.name;\r\n");
      out.write("\t\t\tvar indexBrackets = null;\r\n");
      out.write("\t\t\tvar liorp = elementReducedProperty.indexOf(\"[\");\r\n");
      out.write("\t\t\tif(liorp > 0){\r\n");
      out.write("\t\t\t\telementReducedProperty = elementReducedProperty.substring(0,liorp);\r\n");
      out.write("\t\t\t\tindexBrackets = element.name.substring(element.name.indexOf('['), element.name.indexOf(']')+1);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(elementReducedProperty == property){\r\n");
      out.write("\t\t\t\tvar elementName = elementReducedProperty + indexBrackets;\r\n");
      out.write("\t\t\t\t//alert('before '+element.name);\r\n");
      out.write("\t\t\t\tvar elementSubproperties = element.name.substring(elementName.length, element.name.length);\r\n");
      out.write("\t\t\t\t//alert(indexBrackets);\r\n");
      out.write("\t\t\t\tvar open = elementName.indexOf(\"[\");\r\n");
      out.write("\t\t\t\tvar close = elementName.indexOf(\"]\");\r\n");
      out.write("\t\t\t\tvar number = extrairNumeroDeIndexedProperty(elementName);\r\n");
      out.write("\t\t\t\t//alert(number);\r\n");
      out.write("\t\t\t\tif(number>excludedNumber){\r\n");
      out.write("\t\t\t\t\tnumber--;\r\n");
      out.write("\t\t\t\t\tvar reindexedName = elementName.substring(0,open)+\"[\"+number+\"]\"+ elementSubproperties;\r\n");
      out.write("\t\t\t\t\t//alert(element.name + \" -> \"+reindexedName);\r\n");
      out.write("\t\t\t\t\telement.name = reindexedName;\r\n");
      out.write("\t\t\t\t\t//alert('after'+element.name);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\tfunction corrigeIndexPerspectiva(){\r\n");
      out.write("\t\t$(\".excluirPerspectiva\").each(function(k){\r\n");
      out.write("\t\t\tvar obj = $(this)\r\n");
      out.write("\t\t\tvar id = obj.attr(\"id\");\r\n");
      out.write("\t\t\tvar i = id.indexOf(\"indice=\")+7;\r\n");
      out.write("\t\t\tvar j = id.lastIndexOf(\"]\")-1\r\n");
      out.write("\t\t\tvar strId = id.substr(0,i) + (k+1) + \"]\" ;\r\n");
      out.write("\t\t\tobj.attr(\"id\", strId);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\".selectObjetivoEstrategico\").each(function() {\r\n");
      out.write("\t\t\tvar child = $(this).parent().next().children(\"a\"); \r\n");
      out.write("\t\t\tchild.attr(\"href\", \"javascript:void(0)\");\r\n");
      out.write("\t\t\tchild.unbind('click');\r\n");
      out.write("\t\t\tchild.removeAttr(\"onclick\");\r\n");
      out.write("\t\t\tchild.click(function() {\r\n");
      out.write("\t\t\t\tif(confirm('Tem certeza que deseja excluir este objetivo estratégico?')) {\r\n");
      out.write("\t\t\t\t\texcluirLinhaObjetivoEstrategico(this);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\tcorrigeIndexPerspectiva();\r\n");
      out.write("\t\t$(\"#detalhe_perspectivaButton\").click(function() {\r\n");
      out.write("\t\t\tcorrigeIndexPerspectiva();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tcorrigeIndexPerspectiva();\r\n");
      out.write("\t});\r\n");
      out.write("\t\t\t\r\n");
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

  private boolean _jspx_meth_t_janelaFiltro_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:janelaFiltro
    br.com.linkcom.neo.view.template.JanelaFiltroTag _jspx_th_t_janelaFiltro_0 = new br.com.linkcom.neo.view.template.JanelaFiltroTag();
    _jspx_th_t_janelaFiltro_0.setJspContext(_jspx_page_context);
    _jspx_th_t_janelaFiltro_0.setParent(_jspx_parent);
    _jspx_th_t_janelaFiltro_0.setJspBody(new definicaoEstrategia_jspHelper( 1, _jspx_page_context, _jspx_th_t_janelaFiltro_0, null));
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
    _jspx_th_t_tabelaFiltro_0.setShowSubmit(new Boolean(false));
    _jspx_th_t_tabelaFiltro_0.setJspBody(new definicaoEstrategia_jspHelper( 2, _jspx_page_context, _jspx_th_t_tabelaFiltro_0, null));
    _jspx_th_t_tabelaFiltro_0.doTag();
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
    _jspx_th_t_property_0.setDynamicAttribute(null, "style", new String("width: 100px;"));
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
    _jspx_th_n_panel_0.setJspBody(new definicaoEstrategia_jspHelper( 3, _jspx_page_context, _jspx_th_n_panel_0, null));
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
    _jspx_th_f_unidadeGerencialInput_0.setOnchange("recarregarTela()");
    _jspx_th_f_unidadeGerencialInput_0.setEstiloclasse("required");
    _jspx_th_f_unidadeGerencialInput_0.doTag();
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
    _jspx_th_t_tabelaEntrada_0.setStyle("border-collapse:separate;");
    _jspx_th_t_tabelaEntrada_0.setJspBody(new definicaoEstrategia_jspHelper( 5, _jspx_page_context, _jspx_th_t_tabelaEntrada_0, null));
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
    _jspx_th_n_panelGrid_0.setColspan(new Integer(2));
    _jspx_th_n_panelGrid_0.setJspBody(new definicaoEstrategia_jspHelper( 6, _jspx_page_context, _jspx_th_n_panelGrid_0, null));
    _jspx_th_n_panelGrid_0.doTag();
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
    _jspx_th_t_property_1.setName("unidadeGerencial.id");
    _jspx_th_t_property_1.setRows(new Integer(2));
    _jspx_th_t_property_1.setCols(new Integer(45));
    _jspx_th_t_property_1.setLabel("");
    _jspx_th_t_property_1.setWrite(new Boolean(false));
    _jspx_th_t_property_1.setType(new String("hidden"));
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
    _jspx_th_t_property_2.setName("unidadeGerencial.mapaEstrategico.id");
    _jspx_th_t_property_2.setRows(new Integer(2));
    _jspx_th_t_property_2.setCols(new Integer(45));
    _jspx_th_t_property_2.setLabel("");
    _jspx_th_t_property_2.setWrite(new Boolean(false));
    _jspx_th_t_property_2.setType(new String("hidden"));
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
    _jspx_th_t_property_3.setName("unidadeGerencial.mapaEstrategico.missao");
    _jspx_th_t_property_3.setMode("output");
    _jspx_th_t_property_3.setLabelStyleClass("txt_und11");
    _jspx_th_t_property_3.setPanelStyleClass("txt_und11");
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
    _jspx_th_t_property_4.setName("unidadeGerencial.mapaEstrategico.visao");
    _jspx_th_t_property_4.setRows(new Integer(2));
    _jspx_th_t_property_4.setCols(new Integer(130));
    _jspx_th_t_property_4.setLabel("Visão");
    _jspx_th_t_property_4.setLabelStyleClass("txt_und11");
    _jspx_th_t_property_4.doTag();
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
    _jspx_th_n_panel_1.setJspBody(new definicaoEstrategia_jspHelper( 7, _jspx_page_context, _jspx_th_n_panel_1, null));
    _jspx_th_n_panel_1.doTag();
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
    _jspx_th_t_detalhe_0.setId("detalhe_perspectiva");
    _jspx_th_t_detalhe_0.setName("unidadeGerencial.mapaEstrategico.listaPerspectivaMapaEstrategico");
    _jspx_th_t_detalhe_0.setDynamicAttribute(null, "labelnovalinha", new String("Nova Perspectiva"));
    _jspx_th_t_detalhe_0.setShowBotaoRemover(new Boolean(false));
    _jspx_th_t_detalhe_0.setShowBotaoNovaLinha((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty HIDEBOTAOSALVAR}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_t_detalhe_0.setJspBody(new definicaoEstrategia_jspHelper( 8, _jspx_page_context, _jspx_th_t_detalhe_0, null));
    _jspx_th_t_detalhe_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_set_0.setVar("indexPerspectiva");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${index}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
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
    _jspx_th_n_column_0.setHeader("");
    _jspx_th_n_column_0.setDynamicAttribute(null, "style", new String("background-color:transparent"));
    _jspx_th_n_column_0.setJspBody(new definicaoEstrategia_jspHelper( 9, _jspx_page_context, _jspx_th_n_column_0, null));
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
    _jspx_th_n_body_0.setJspBody(new definicaoEstrategia_jspHelper( 10, _jspx_page_context, _jspx_th_n_body_0, null));
    _jspx_th_n_body_0.doTag();
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
    _jspx_th_n_group_0.setColumns(1);
    _jspx_th_n_group_0.setLegend("Perspectiva");
    _jspx_th_n_group_0.setShowBorder(new Boolean(true));
    _jspx_th_n_group_0.setDynamicAttribute(null, "width", new String("100%"));
    _jspx_th_n_group_0.setJspBody(new definicaoEstrategia_jspHelper( 11, _jspx_page_context, _jspx_th_n_group_0, null));
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
    _jspx_th_n_panelGrid_1.setColumns(new Integer(2));
    _jspx_th_n_panelGrid_1.setColumnStyles("width:50%,vertical-align:top");
    _jspx_th_n_panelGrid_1.setStyle("width:100%;");
    _jspx_th_n_panelGrid_1.setDynamicAttribute(null, "width", new String("100%"));
    _jspx_th_n_panelGrid_1.setJspBody(new definicaoEstrategia_jspHelper( 12, _jspx_page_context, _jspx_th_n_panelGrid_1, null));
    _jspx_th_n_panelGrid_1.doTag();
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
    _jspx_th_t_property_5.setName("perspectiva");
    _jspx_th_t_property_5.setLabel("");
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
    _jspx_th_t_property_6.setName("ordem");
    _jspx_th_t_property_6.setLabel("Ordem:");
    _jspx_th_t_property_6.setDynamicAttribute(null, "style", new String("width:20px"));
    _jspx_th_t_property_6.setLabelStyle("margin-left:250px;");
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
    _jspx_th_t_property_7.setName("id");
    _jspx_th_t_property_7.setLabel("");
    _jspx_th_t_property_7.setWrite(new Boolean(false));
    _jspx_th_t_property_7.setType(new String("hidden"));
    _jspx_th_t_property_7.setRenderAs("single");
    _jspx_th_t_property_7.doTag();
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
    _jspx_th_n_group_1.setColumns(1);
    _jspx_th_n_group_1.setLegend("Objetivos Estratégicos");
    _jspx_th_n_group_1.setShowBorder(new Boolean(true));
    _jspx_th_n_group_1.setStyle("width:100%");
    _jspx_th_n_group_1.setJspBody(new definicaoEstrategia_jspHelper( 13, _jspx_page_context, _jspx_th_n_group_1, null));
    _jspx_th_n_group_1.doTag();
    return false;
  }

  private boolean _jspx_meth_t_detalhe_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:detalhe
    br.com.linkcom.neo.view.template.DetalheTag _jspx_th_t_detalhe_1 = new br.com.linkcom.neo.view.template.DetalheTag();
    _jspx_th_t_detalhe_1.setJspContext(_jspx_page_context);
    _jspx_th_t_detalhe_1.setParent(_jspx_parent);
    _jspx_th_t_detalhe_1.setName("listaObjetivoMapaEstrategico");
    _jspx_th_t_detalhe_1.setDynamicAttribute(null, "dynaline", new String("false"));
    _jspx_th_t_detalhe_1.setShowBotaoNovaLinha(new Boolean(false));
    _jspx_th_t_detalhe_1.setDynamicAttribute(null, "style", new String("width: 100%"));
    _jspx_th_t_detalhe_1.setJspBody(new definicaoEstrategia_jspHelper( 14, _jspx_page_context, _jspx_th_t_detalhe_1, null));
    _jspx_th_t_detalhe_1.doTag();
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
    _jspx_th_n_column_1.setHeader("");
    _jspx_th_n_column_1.setJspBody(new definicaoEstrategia_jspHelper( 15, _jspx_page_context, _jspx_th_n_column_1, null));
    _jspx_th_n_column_1.doTag();
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
    _jspx_th_t_property_8.setName("id");
    _jspx_th_t_property_8.setLabel("");
    _jspx_th_t_property_8.setWrite(new Boolean(false));
    _jspx_th_t_property_8.setType(new String("hidden"));
    _jspx_th_t_property_8.setRenderAs("single");
    _jspx_th_t_property_8.setDynamicAttribute(null, "class", new String("idObjetivoEstrategico"));
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
    _jspx_th_t_property_9.setName("objetivoEstrategico");
    _jspx_th_t_property_9.setLabel(" ");
    _jspx_th_t_property_9.setDynamicAttribute(null, "class", new String("selectObjetivoEstrategico"));
    _jspx_th_t_property_9.doTag();
    return false;
  }

  private boolean _jspx_meth_n_input_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:input
    br.com.linkcom.neo.view.InputTag _jspx_th_n_input_0 = new br.com.linkcom.neo.view.InputTag();
    _jspx_th_n_input_0.setJspContext(_jspx_page_context);
    _jspx_th_n_input_0.setParent(_jspx_parent);
    _jspx_th_n_input_0.setDynamicAttribute(null, "class", new String("btnApp"));
    _jspx_th_n_input_0.setType(new String("button"));
    _jspx_th_n_input_0.setValue(new String("Novo Objetivo Estratégico"));
    _jspx_th_n_input_0.setDynamicAttribute(null, "onclick", (java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("addNovaLinhaObjetivoEstrategico(this, \"${indexPerspectiva}\")", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_n_input_0.doTag();
    return false;
  }

  private boolean _jspx_meth_t_acao_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:acao
    br.com.linkcom.neo.view.template.AcaoTag _jspx_th_t_acao_0 = new br.com.linkcom.neo.view.template.AcaoTag();
    _jspx_th_t_acao_0.setJspContext(_jspx_page_context);
    _jspx_th_t_acao_0.setParent(_jspx_parent);
    _jspx_th_t_acao_0.setJspBody(new definicaoEstrategia_jspHelper( 16, _jspx_page_context, _jspx_th_t_acao_0, null));
    _jspx_th_t_acao_0.doTag();
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty renderHeaderdetalhe_perspectiva}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a id=\"button.excluir[table_id=detalhe_perspectiva, indice=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${indexPerspectiva}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("]\" onclick=\"if(confirm('Tem certeza que deseja excluir este item?')){excluirLinhaPorNome(this.id,true);reindexFormPorNome(this.id, forms[0], 'unidadeGerencial.mapaEstrategico.listaPerspectivaMapaEstrategico', true);}\" class=\"excluirdetalhe excluirPerspectiva\" type=\"button\" href=\"javascript:void(0);\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img border=\"0\" alt=\"Excluir este item\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/images/ico_excluir.gif\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty HIDEBOTAOSALVAR}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<div style=\"text-align: right\">\r\n");
        out.write("\t\t\t\t\t\t\t<br>\r\n");
        out.write("\t\t\t\t\t\t\t<input type=\"submit\"  class=\"botao_normal\" onclick=\"javascript:if(confirm('Tem certeza que deseja excluir todo o mapa estratégico?')){excluirMapa();}\" value=\"Excluir mapa estratégico\">&nbsp;\r\n");
        out.write("\t\t\t\t\t\t\t");
        if (_jspx_meth_n_submit_0(_jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t ");
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

  private boolean _jspx_meth_n_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:submit
    br.com.linkcom.neo.view.SubmitTag _jspx_th_n_submit_0 = new br.com.linkcom.neo.view.SubmitTag();
    _jspx_th_n_submit_0.setJspContext(_jspx_page_context);
    _jspx_th_n_submit_0.setParent(_jspx_th_c_if_2);
    _jspx_th_n_submit_0.setAction("salvar");
    _jspx_th_n_submit_0.setDynamicAttribute(null, "class", new String("botao_normal"));
    _jspx_th_n_submit_0.setValidate(new Boolean(true));
    _jspx_th_n_submit_0.setJspBody(new definicaoEstrategia_jspHelper( 17, _jspx_page_context, _jspx_th_n_submit_0, null));
    _jspx_th_n_submit_0.doTag();
    return false;
  }

  private class definicaoEstrategia_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public definicaoEstrategia_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public void invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t<input type=\"hidden\" name=\"reload\" value=\"\" id=\"idReload\">\r\n");
      out.write("\t");
      if (_jspx_meth_t_janelaFiltro_0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\t");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.planoGestao != null && filtro.unidadeGerencial != null && !SEMPERMISSAO}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t \t");
          //  n:bean
          br.com.linkcom.neo.view.BeanTag _jspx_th_n_bean_0 = new br.com.linkcom.neo.view.BeanTag();
          _jspx_th_n_bean_0.setJspContext(_jspx_page_context);
          _jspx_th_n_bean_0.setParent(_jspx_th_c_if_0);
          _jspx_th_n_bean_0.setName("filtro");
          _jspx_th_n_bean_0.setValueType(DefinicaoEstrategiaFiltro.class );
          _jspx_th_n_bean_0.setJspBody(new definicaoEstrategia_jspHelper( 4, _jspx_page_context, _jspx_th_n_bean_0, null));
          _jspx_th_n_bean_0.doTag();
          out.write("\t\r\n");
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
      out.write('\r');
      out.write('\n');
      return;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_t_tabelaFiltro_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\t\t\r\n");
      out.write("\t");
      return false;
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
      if (_jspx_meth_n_output_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_n_panel_0(_jspx_parent, _jspx_page_context))
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
      if (_jspx_meth_f_unidadeGerencialInput_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      return false;
    }
    public void invoke4( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t \t\t");
      if (_jspx_meth_t_tabelaEntrada_0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_if_2(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      return;
    }
    public boolean invoke5( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_n_panelGrid_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      return false;
    }
    public boolean invoke6( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_3(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_4(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke7( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_t_detalhe_0(_jspx_parent, _jspx_page_context))
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
      if (_jspx_meth_c_set_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_column_0(_jspx_parent, _jspx_page_context))
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
      if (_jspx_meth_n_body_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke10( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_group_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke11( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panelGrid_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_7(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_group_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_acao_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke12( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_5(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_6(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke13( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_detalhe_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_input_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke14( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_column_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke15( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_8(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_9(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke16( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_if_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke17( JspWriter out ) 
      throws Throwable
    {
      out.write("salvar");
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
