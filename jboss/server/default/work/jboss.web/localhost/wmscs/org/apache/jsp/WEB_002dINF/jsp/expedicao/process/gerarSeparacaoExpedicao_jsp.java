package org.apache.jsp.WEB_002dINF.jsp.expedicao.process;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.linkcom.wms.geral.bean.Carregamento;
import br.com.linkcom.wms.geral.bean.vo.ExpedicaoVO;
import br.com.linkcom.wms.geral.bean.Ordemservico;

public final class gerarSeparacaoExpedicao_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/classes/META-INF/neo.tld");
    _jspx_dependants.add("/WEB-INF/classes/META-INF/template.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var.release();
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
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.tablednd_0_5.js\"></script>\r\n");
      out.write("\r\n");
      //  t:tela
      br.com.linkcom.neo.view.template.TelaTag _jspx_th_t_tela_0 = new br.com.linkcom.neo.view.template.TelaTag();
      _jspx_th_t_tela_0.setJspContext(_jspx_page_context);
      _jspx_th_t_tela_0.setTitulo("GERAR SEPARAÇÃO");
      _jspx_th_t_tela_0.setDynamicAttribute(null, "botoes", (java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${botao}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      _jspx_th_t_tela_0.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 0, _jspx_page_context, _jspx_th_t_tela_0, null));
      _jspx_th_t_tela_0.doTag();
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\tvar tamBox = document.getElementById('listaBoxes').rows.length-1;\r\n");
      out.write("\tfor(var i=0; i<tamBox; i++){\r\n");
      out.write("\t\tvar tamCarregamento = document.getElementById('listaCarregamentos'+i).rows.length-1;\r\n");
      out.write("\t\tfor(var j=0; j<tamCarregamento; j++){\r\n");
      out.write("\t\t\tvar cdveiculo = typeof form['listaBoxes['+i+'].listaCarregamentos['+j+'].veiculo.cdveiculo'] != 'undefined' ? form['listaBoxes['+i+'].listaCarregamentos['+j+'].veiculo.cdveiculo'].value : null;\r\n");
      out.write("\t\t\tcarregaVeiculo(('listaBoxes['+i+'].listaCarregamentos['+j+'].veiculo.tipoveiculo'), cdveiculo);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"table[id^='ordemservico']\").tableDnD({\r\n");
      out.write("\t\tdragHandle: \"dragHandle\",\r\n");
      out.write("\t    onDrop: function(table, row) {\r\n");
      out.write("\t    \tcalcularOrdem(table.id);\r\n");
      out.write("\t    },\r\n");
      out.write("\t\tonDragStart: function(table, row) {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t$(\"table[id^='ordemservico'] tr\").hover(\r\n");
      out.write("\t\tfunction() {\r\n");
      out.write("\t\t\t$(this.cells[1]).addClass('showDragHandle');\r\n");
      out.write("   \t\t}, \r\n");
      out.write("   \t\tfunction() {\r\n");
      out.write("          $(this.cells[1]).removeClass('showDragHandle');\r\n");
      out.write("    \t}\r\n");
      out.write("    );\r\n");
      out.write("    \r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function calcularOrdem(idTabela){\r\n");
      out.write("\tvar rows = document.getElementById(idTabela).rows;\r\n");
      out.write("\t\r\n");
      out.write("    for (var i = 0; i < rows.length; i++){\r\n");
      out.write("    \t$(rows[i]).find(\"input[name$=ordem]\").val(i); \r\n");
      out.write("    \t$(rows[i]).find(\"span[id$=ordem_value]\").text(i); \r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\t\t\r\n");
      out.write("function carregaVeiculo(campo, cdveiculo){\r\n");
      out.write("\tvar tipoveiculo = form[campo].value;\r\n");
      out.write("\tvar campoveiculo = campo.substring(0, campo.length-12);\r\n");
      out.write("\t$(form[campoveiculo]).removeOption(/./);\r\n");
      out.write("\t$w.showLoading();\r\n");
      out.write("\tif(tipoveiculo != '<null>'){\r\n");
      out.write("\t\t$w.getJSON(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Gerarseparacaoexpedicao\", {ACAO:'findVeiculosByTipoVeiculo','tipoveiculo':tipoveiculo}, function(json){\r\n");
      out.write("\t\t\tvar i= 0;\r\n");
      out.write("\t\t\t$(form[campoveiculo]).addOption(\"<null>\",\" \");\r\n");
      out.write("\t\t\tfor(i=0; i< json.lista.length; i++){\r\n");
      out.write("\t\t\t\tif(json.lista[i].cdveiculo == cdveiculo)\r\n");
      out.write("\t\t\t\t\t$(form[campoveiculo]).addOption(\"br.com.linkcom.wms.geral.bean.Veiculo[cdveiculo=\"+json.lista[i].cdveiculo+\"]\",json.lista[i].placa,true);\r\n");
      out.write("\t\t\t\telse\r\n");
      out.write("\t\t\t\t\t$(form[campoveiculo]).addOption(\"br.com.linkcom.wms.geral.bean.Veiculo[cdveiculo=\"+json.lista[i].cdveiculo+\"]\",json.lista[i].placa,false);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$w.hideLoading();\r\n");
      out.write("\t\t});\t\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\t$w.hideLoading();\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function gerarSeparacao(){\r\n");
      out.write("\tif(validaCampos()){\r\n");
      out.write("\t\tform.action = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/expedicao/process/Gerarseparacaoexpedicao';\r\n");
      out.write("\t\tform.ACAO.value = 'gerarSeparacao';\r\n");
      out.write("\t\tform.submit();\t\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function validaCampos(){\r\n");
      out.write("\tvar msg = '';\r\n");
      out.write("\t$('select[name$=tipoveiculo]').each(function(){\r\n");
      out.write("\t\tif($(this).val() == '<null>')\r\n");
      out.write("\t\t\tmsg += 'O campo Tipo veículo é obrigatório.\\n';\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$('select[name$=.veiculo]').each(function(){\r\n");
      out.write("\t\tif($(this).val() == '<null>')\r\n");
      out.write("\t\t\tmsg += 'O campo Veículo é obrigatório.\\n';\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tif(msg != ''){\r\n");
      out.write("\t\talert(msg);\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\treturn true;\r\n");
      out.write("}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\t.headerSeparacao{\r\n");
      out.write("\t\tbackground-color: #4CB46B;\r\n");
      out.write("\t\tcolor: #FFFFFF;\r\n");
      out.write("\t\tfont-family: Verdana;\r\n");
      out.write("\t\tfont-weight: bold;\t\r\n");
      out.write("\t\ttext-align: left;\r\n");
      out.write("\t\ttext-transform: none;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.dataGridBody22 {\r\n");
      out.write("\t\tbackground-color: #dadada;\r\n");
      out.write("\t}\r\n");
      out.write("\t.dataGridBody22 td{\r\n");
      out.write("\t\tpadding: 3px;\r\n");
      out.write("\t\tvertical-align: middle;\r\n");
      out.write("\t\ttext-transform: none;\r\n");
      out.write("\t\ttext-align: left;\r\n");
      out.write("\t}\r\n");
      out.write("\t.notrequired{\r\n");
      out.write("\t\tbackground-color: white;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</style>");
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
        out.write("\t\t<a id=\"btn_voltar\" onmouseover=\"Tip('Voltar')\" title=\"\" href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/expedicao/crud/Expedicao\">Retornar à listagem</a>&nbsp;|&nbsp;\r\n");
        out.write("\t\t<a href=\"#\" id='btn_engrenagem' onmouseover='Tip(\"Gerar separação\")' onclick=\"gerarSeparacao()\">Gerar separação</a>\r\n");
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

  private boolean _jspx_meth_n_panelGrid_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panelGrid
    br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_0 = new br.com.linkcom.neo.view.PanelGridTag();
    _jspx_th_n_panelGrid_0.setJspContext(_jspx_page_context);
    _jspx_th_n_panelGrid_0.setParent(_jspx_parent);
    _jspx_th_n_panelGrid_0.setColumns(new Integer(2));
    _jspx_th_n_panelGrid_0.setColumnStyles("border: none;");
    _jspx_th_n_panelGrid_0.setColumnStyleClasses("labelColumn, propertyColumn");
    _jspx_th_n_panelGrid_0.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 7, _jspx_page_context, _jspx_th_n_panelGrid_0, null));
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
    _jspx_th_t_property_0.setName("cdbox");
    _jspx_th_t_property_0.setDynamicAttribute(null, "style", new String("width: 300px;"));
    _jspx_th_t_property_0.setType(new String("hidden"));
    _jspx_th_t_property_0.setWrite(new Boolean(false));
    _jspx_th_t_property_0.setLabel("");
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
    _jspx_th_t_property_1.setName("nome");
    _jspx_th_t_property_1.setDynamicAttribute(null, "style", new String("width: 450px;"));
    _jspx_th_t_property_1.setType(new String("hidden"));
    _jspx_th_t_property_1.setWrite(new Boolean(true));
    _jspx_th_t_property_1.doTag();
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
    _jspx_th_n_panel_0.setDynamicAttribute(null, "class", new String("headerSeparacao"));
    _jspx_th_n_panel_0.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 14, _jspx_page_context, _jspx_th_n_panel_0, null));
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
    _jspx_th_n_panel_1.setDynamicAttribute(null, "class", new String("headerSeparacao"));
    _jspx_th_n_panel_1.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 15, _jspx_page_context, _jspx_th_n_panel_1, null));
    _jspx_th_n_panel_1.doTag();
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
    _jspx_th_n_panel_2.setDynamicAttribute(null, "class", new String("headerSeparacao"));
    _jspx_th_n_panel_2.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 16, _jspx_page_context, _jspx_th_n_panel_2, null));
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
    _jspx_th_n_panel_3.setDynamicAttribute(null, "class", new String("headerSeparacao"));
    _jspx_th_n_panel_3.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 17, _jspx_page_context, _jspx_th_n_panel_3, null));
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
    _jspx_th_n_panel_4.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 18, _jspx_page_context, _jspx_th_n_panel_4, null));
    _jspx_th_n_panel_4.doTag();
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
    _jspx_th_t_property_2.setType(new String("hidden"));
    _jspx_th_t_property_2.setWrite(new Boolean(false));
    _jspx_th_t_property_2.setShowLabel(new Boolean(false));
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
    _jspx_th_t_property_3.setName("veiculo.cdveiculo");
    _jspx_th_t_property_3.setType(new String("hidden"));
    _jspx_th_t_property_3.setWrite(new Boolean(false));
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
    _jspx_th_t_property_4.setName("veiculo.tipoveiculo");
    _jspx_th_t_property_4.setShowLabel(new Boolean(false));
    _jspx_th_t_property_4.setDynamicAttribute(null, "style", new String("width: 300px;"));
    _jspx_th_t_property_4.setDynamicAttribute(null, "onchange", new String("carregaVeiculo(this.name, null)"));
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
    _jspx_th_t_property_5.setName("veiculo");
    _jspx_th_t_property_5.setShowLabel(new Boolean(false));
    _jspx_th_t_property_5.setDynamicAttribute(null, "style", new String("width: 300px;"));
    _jspx_th_t_property_5.setDynamicAttribute(null, "class", new String("required"));
    _jspx_th_t_property_5.setItens(new String("0"));
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
    _jspx_th_t_property_6.setName("paletesdisponiveis");
    _jspx_th_t_property_6.setShowLabel(new Boolean(false));
    _jspx_th_t_property_6.setDynamicAttribute(null, "style", new String("width: 100px;"));
    _jspx_th_t_property_6.doTag();
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
    _jspx_th_n_panel_5.setColspan(new Integer(4));
    _jspx_th_n_panel_5.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 19, _jspx_page_context, _jspx_th_n_panel_5, null));
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
    _jspx_th_n_panel_6.setColspan(new Integer(4));
    _jspx_th_n_panel_6.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 20, _jspx_page_context, _jspx_th_n_panel_6, null));
    _jspx_th_n_panel_6.doTag();
    return false;
  }

  private boolean _jspx_meth_n_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:submit
    br.com.linkcom.neo.view.SubmitTag _jspx_th_n_submit_0 = new br.com.linkcom.neo.view.SubmitTag();
    _jspx_th_n_submit_0.setJspContext(_jspx_page_context);
    _jspx_th_n_submit_0.setParent(_jspx_parent);
    _jspx_th_n_submit_0.setAction("agruparOrdens");
    _jspx_th_n_submit_0.setType("link");
    _jspx_th_n_submit_0.setValidate(new Boolean(false));
    _jspx_th_n_submit_0.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 21, _jspx_page_context, _jspx_th_n_submit_0, null));
    _jspx_th_n_submit_0.doTag();
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
    _jspx_th_n_column_2.setHeader("");
    _jspx_th_n_column_2.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 25, _jspx_page_context, _jspx_th_n_column_2, null));
    _jspx_th_n_column_2.doTag();
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
    _jspx_th_n_body_1.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 26, _jspx_page_context, _jspx_th_n_body_1, null));
    _jspx_th_n_body_1.doTag();
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
    _jspx_th_t_property_7.setName("selecionada");
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
    _jspx_th_t_property_8.setName("itensOrdem");
    _jspx_th_t_property_8.setType(new String("hidden"));
    _jspx_th_t_property_8.doTag();
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
    _jspx_th_n_column_3.setHeader("Ordem");
    _jspx_th_n_column_3.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 27, _jspx_page_context, _jspx_th_n_column_3, null));
    _jspx_th_n_column_3.doTag();
    return false;
  }

  private boolean _jspx_meth_n_body_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:body
    br.com.linkcom.neo.view.BodyTag _jspx_th_n_body_2 = new br.com.linkcom.neo.view.BodyTag();
    _jspx_th_n_body_2.setJspContext(_jspx_page_context);
    _jspx_th_n_body_2.setParent(_jspx_parent);
    _jspx_th_n_body_2.setDynamicAttribute(null, "class", new String("dragHandle"));
    _jspx_th_n_body_2.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 28, _jspx_page_context, _jspx_th_n_body_2, null));
    _jspx_th_n_body_2.doTag();
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
    _jspx_th_t_property_9.setName("ordem");
    _jspx_th_t_property_9.setType(new String("hidden"));
    _jspx_th_t_property_9.setWrite(new Boolean(true));
    _jspx_th_t_property_9.doTag();
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
    _jspx_th_n_column_4.setHeader("Tipo de O.S.");
    _jspx_th_n_column_4.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 29, _jspx_page_context, _jspx_th_n_column_4, null));
    _jspx_th_n_column_4.doTag();
    return false;
  }

  private boolean _jspx_meth_n_body_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:body
    br.com.linkcom.neo.view.BodyTag _jspx_th_n_body_3 = new br.com.linkcom.neo.view.BodyTag();
    _jspx_th_n_body_3.setJspContext(_jspx_page_context);
    _jspx_th_n_body_3.setParent(_jspx_parent);
    _jspx_th_n_body_3.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 30, _jspx_page_context, _jspx_th_n_body_3, null));
    _jspx_th_n_body_3.doTag();
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
    _jspx_th_t_property_10.setName("ordemtipo.cdordemtipo");
    _jspx_th_t_property_10.setType(new String("hidden"));
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
    _jspx_th_t_property_11.setName("ordemtipo.nome");
    _jspx_th_t_property_11.setType(new String("hidden"));
    _jspx_th_t_property_11.setWrite(new Boolean(true));
    _jspx_th_t_property_11.doTag();
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
    _jspx_th_n_column_5.setHeader("Tipo de pedido");
    _jspx_th_n_column_5.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 31, _jspx_page_context, _jspx_th_n_column_5, null));
    _jspx_th_n_column_5.doTag();
    return false;
  }

  private boolean _jspx_meth_n_body_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:body
    br.com.linkcom.neo.view.BodyTag _jspx_th_n_body_4 = new br.com.linkcom.neo.view.BodyTag();
    _jspx_th_n_body_4.setJspContext(_jspx_page_context);
    _jspx_th_n_body_4.setParent(_jspx_parent);
    _jspx_th_n_body_4.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 32, _jspx_page_context, _jspx_th_n_body_4, null));
    _jspx_th_n_body_4.doTag();
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
    _jspx_th_t_property_12.setName("tipooperacao.cdtipooperacao");
    _jspx_th_t_property_12.setType(new String("hidden"));
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
    _jspx_th_t_property_13.setName("tipooperacao.nome");
    _jspx_th_t_property_13.setType(new String("hidden"));
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
    _jspx_th_t_property_14.setName("tiposPedidos");
    _jspx_th_t_property_14.setType(new String("hidden"));
    _jspx_th_t_property_14.setWrite(new Boolean(true));
    _jspx_th_t_property_14.doTag();
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
    _jspx_th_n_column_6.setHeader("Filial/Cliente");
    _jspx_th_n_column_6.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 33, _jspx_page_context, _jspx_th_n_column_6, null));
    _jspx_th_n_column_6.doTag();
    return false;
  }

  private boolean _jspx_meth_n_body_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:body
    br.com.linkcom.neo.view.BodyTag _jspx_th_n_body_5 = new br.com.linkcom.neo.view.BodyTag();
    _jspx_th_n_body_5.setJspContext(_jspx_page_context);
    _jspx_th_n_body_5.setParent(_jspx_parent);
    _jspx_th_n_body_5.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 34, _jspx_page_context, _jspx_th_n_body_5, null));
    _jspx_th_n_body_5.doTag();
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
    _jspx_th_t_property_15.setName("clienteExpedicao.cdpessoa");
    _jspx_th_t_property_15.setType(new String("hidden"));
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
    _jspx_th_t_property_16.setName("clienteExpedicao.nome");
    _jspx_th_t_property_16.setType(new String("hidden"));
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
    _jspx_th_t_property_17.setName("filiaisClientes");
    _jspx_th_t_property_17.setType(new String("hidden"));
    _jspx_th_t_property_17.setWrite(new Boolean(true));
    _jspx_th_t_property_17.doTag();
    return false;
  }

  private class gerarSeparacaoExpedicao_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public gerarSeparacaoExpedicao_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
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
      _jspx_th_n_bean_0.setName("expedicaoVO");
      _jspx_th_n_bean_0.setValueType( ExpedicaoVO.class );
      _jspx_th_n_bean_0.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 1, _jspx_page_context, _jspx_th_n_bean_0, null));
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
      //  t:janelaEntrada
      br.com.linkcom.neo.view.template.JanelaEntradaTag _jspx_th_t_janelaEntrada_0 = new br.com.linkcom.neo.view.template.JanelaEntradaTag();
      _jspx_th_t_janelaEntrada_0.setJspContext(_jspx_page_context);
      _jspx_th_t_janelaEntrada_0.setParent(_jspx_parent);
      _jspx_th_t_janelaEntrada_0.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 2, _jspx_page_context, _jspx_th_t_janelaEntrada_0, null));
      _jspx_th_t_janelaEntrada_0.doTag();
      out.write('\r');
      out.write('\n');
      out.write('	');
      return;
    }
    public void invoke2( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t");
      //  t:tabelaEntrada
      br.com.linkcom.neo.view.template.TabelaEntradaTag _jspx_th_t_tabelaEntrada_0 = new br.com.linkcom.neo.view.template.TabelaEntradaTag();
      _jspx_th_t_tabelaEntrada_0.setJspContext(_jspx_page_context);
      _jspx_th_t_tabelaEntrada_0.setParent(_jspx_parent);
      _jspx_th_t_tabelaEntrada_0.setColumnStyleClasses("");
      _jspx_th_t_tabelaEntrada_0.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 3, _jspx_page_context, _jspx_th_t_tabelaEntrada_0, null));
      _jspx_th_t_tabelaEntrada_0.doTag();
      out.write("\r\n");
      out.write("\t\t");
      return;
    }
    public void invoke3( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t");
      //  t:detalhe
      br.com.linkcom.neo.view.template.DetalheTag _jspx_th_t_detalhe_0 = new br.com.linkcom.neo.view.template.DetalheTag();
      _jspx_th_t_detalhe_0.setJspContext(_jspx_page_context);
      _jspx_th_t_detalhe_0.setParent(_jspx_parent);
      _jspx_th_t_detalhe_0.setName("listaBoxes");
      _jspx_th_t_detalhe_0.setId("listaBoxes");
      _jspx_th_t_detalhe_0.setShowBotaoNovaLinha(new Boolean(false));
      _jspx_th_t_detalhe_0.setShowColunaAcao(new Boolean(false));
      _jspx_th_t_detalhe_0.setShowBotaoRemover(new Boolean(false));
      _jspx_th_t_detalhe_0.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 4, _jspx_page_context, _jspx_th_t_detalhe_0, null));
      _jspx_th_t_detalhe_0.doTag();
      out.write("\r\n");
      out.write("\t\t\t");
      return;
    }
    public void invoke4( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      //  n:column
      br.com.linkcom.neo.view.ColumnTag _jspx_th_n_column_0 = new br.com.linkcom.neo.view.ColumnTag();
      _jspx_th_n_column_0.setJspContext(_jspx_page_context);
      _jspx_th_n_column_0.setParent(_jspx_parent);
      _jspx_th_n_column_0.setDynamicAttribute(null, "style", new String("padding-bottom: 50px;"));
      _jspx_th_n_column_0.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 5, _jspx_page_context, _jspx_th_n_column_0, null));
      _jspx_th_n_column_0.doTag();
      out.write("\r\n");
      out.write("\t\t\t\t");
      return;
    }
    public void invoke5( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      //  t:propertyConfig
      br.com.linkcom.neo.view.template.PropertyConfigTag _jspx_th_t_propertyConfig_0 = new br.com.linkcom.neo.view.template.PropertyConfigTag();
      _jspx_th_t_propertyConfig_0.setJspContext(_jspx_page_context);
      _jspx_th_t_propertyConfig_0.setParent(_jspx_parent);
      _jspx_th_t_propertyConfig_0.setRenderAs("double");
      _jspx_th_t_propertyConfig_0.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 6, _jspx_page_context, _jspx_th_t_propertyConfig_0, null));
      _jspx_th_t_propertyConfig_0.doTag();
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      return;
    }
    public void invoke6( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panelGrid_0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      //  n:panelGrid
      br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_1 = new br.com.linkcom.neo.view.PanelGridTag();
      _jspx_th_n_panelGrid_1.setJspContext(_jspx_page_context);
      _jspx_th_n_panelGrid_1.setParent(_jspx_parent);
      _jspx_th_n_panelGrid_1.setColumns(new Integer(1));
      _jspx_th_n_panelGrid_1.setColumnStyles("border: none; padding: 0px;");
      _jspx_th_n_panelGrid_1.setStyle("width:100%");
      _jspx_th_n_panelGrid_1.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 8, _jspx_page_context, _jspx_th_n_panelGrid_1, null));
      _jspx_th_n_panelGrid_1.doTag();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      return;
    }
    public boolean invoke7( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      return false;
    }
    public void invoke8( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      //  n:dataGrid
      br.com.linkcom.neo.view.DataGridTag _jspx_th_n_dataGrid_0 = new br.com.linkcom.neo.view.DataGridTag();
      _jspx_th_n_dataGrid_0.setJspContext(_jspx_page_context);
      _jspx_th_n_dataGrid_0.setParent(_jspx_parent);
      _jspx_th_n_dataGrid_0.setItens((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${box.listaCarregamentos}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      _jspx_th_n_dataGrid_0.setId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("listaCarregamentos${index}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      _jspx_th_n_dataGrid_0.setVar("carregamento");
      _jspx_th_n_dataGrid_0.setDynaLine(new Boolean(false));
      _jspx_th_n_dataGrid_0.setVarIndex("indexmat");
      _jspx_th_n_dataGrid_0.setVarStatus("statusmat");
      _jspx_th_n_dataGrid_0.setDynamicAttribute(null, "varRowIndex", new String("rowmat"));
      _jspx_th_n_dataGrid_0.setDynamicAttribute(null, "rowonmouseover", new String("javascript:$dg.mouseonOverTabela('carregamento',this)"));
      _jspx_th_n_dataGrid_0.setDynamicAttribute(null, "rowonmouseout", new String("javascript:$dg.mouseonOutTabela('carregamento',this)"));
      _jspx_th_n_dataGrid_0.setBodyStyleClasses("dataGridBody22,dataGridBody22");
      _jspx_th_n_dataGrid_0.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 9, _jspx_page_context, _jspx_th_n_dataGrid_0, null));
      _jspx_th_n_dataGrid_0.doTag();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      return;
    }
    public void invoke9( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      //  n:bean
      br.com.linkcom.neo.view.BeanTag _jspx_th_n_bean_1 = new br.com.linkcom.neo.view.BeanTag();
      _jspx_th_n_bean_1.setJspContext(_jspx_page_context);
      _jspx_th_n_bean_1.setParent(_jspx_parent);
      _jspx_th_n_bean_1.setName("carregamento");
      _jspx_th_n_bean_1.setPropertyPrefix((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("listaBoxes[${index}].listaCarregamentos", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      _jspx_th_n_bean_1.setPropertyIndex((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${indexmat}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      _jspx_th_n_bean_1.setValueType(Carregamento.class);
      _jspx_th_n_bean_1.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 10, _jspx_page_context, _jspx_th_n_bean_1, null));
      _jspx_th_n_bean_1.doTag();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      return;
    }
    public void invoke10( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      //  n:column
      br.com.linkcom.neo.view.ColumnTag _jspx_th_n_column_1 = new br.com.linkcom.neo.view.ColumnTag();
      _jspx_th_n_column_1.setJspContext(_jspx_page_context);
      _jspx_th_n_column_1.setParent(_jspx_parent);
      _jspx_th_n_column_1.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 11, _jspx_page_context, _jspx_th_n_column_1, null));
      _jspx_th_n_column_1.doTag();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      return;
    }
    public void invoke11( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      //  n:body
      br.com.linkcom.neo.view.BodyTag _jspx_th_n_body_0 = new br.com.linkcom.neo.view.BodyTag();
      _jspx_th_n_body_0.setJspContext(_jspx_page_context);
      _jspx_th_n_body_0.setParent(_jspx_parent);
      _jspx_th_n_body_0.setDynamicAttribute(null, "style", new String("text-align: right;"));
      _jspx_th_n_body_0.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 12, _jspx_page_context, _jspx_th_n_body_0, null));
      _jspx_th_n_body_0.doTag();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      return;
    }
    public void invoke12( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      //  n:panelGrid
      br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_2 = new br.com.linkcom.neo.view.PanelGridTag();
      _jspx_th_n_panelGrid_2.setJspContext(_jspx_page_context);
      _jspx_th_n_panelGrid_2.setParent(_jspx_parent);
      _jspx_th_n_panelGrid_2.setColumns(new Integer(4));
      _jspx_th_n_panelGrid_2.setColumnStyles("border: none;");
      _jspx_th_n_panelGrid_2.setColumnStyleClasses("propertyColumn");
      _jspx_th_n_panelGrid_2.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 13, _jspx_page_context, _jspx_th_n_panelGrid_2, null));
      _jspx_th_n_panelGrid_2.doTag();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      return;
    }
    public void invoke13( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_1(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_2(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_3(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_4(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_3(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_4(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_5(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_6(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_5(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_6(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      //  n:panel
      br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_7 = new br.com.linkcom.neo.view.PanelTag();
      _jspx_th_n_panel_7.setJspContext(_jspx_page_context);
      _jspx_th_n_panel_7.setParent(_jspx_parent);
      _jspx_th_n_panel_7.setColspan(new Integer(4));
      _jspx_th_n_panel_7.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 22, _jspx_page_context, _jspx_th_n_panel_7, null));
      _jspx_th_n_panel_7.doTag();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      return;
    }
    public boolean invoke14( JspWriter out ) 
      throws Throwable
    {
      out.write("<span style=\"font-size:1.5em;\">Carga</span>");
      return false;
    }
    public boolean invoke15( JspWriter out ) 
      throws Throwable
    {
      out.write("Tipo de veículo");
      return false;
    }
    public boolean invoke16( JspWriter out ) 
      throws Throwable
    {
      out.write("Veículo");
      return false;
    }
    public boolean invoke17( JspWriter out ) 
      throws Throwable
    {
      out.write("Paletes disponíveis");
      return false;
    }
    public boolean invoke18( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span style=\"font-size:1.5em;font-family: Verdana;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${carregamento.cdcarregamento}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke19( JspWriter out ) 
      throws Throwable
    {
      out.write("&nbsp;");
      return false;
    }
    public boolean invoke20( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_submit_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke21( JspWriter out ) 
      throws Throwable
    {
      out.write("Agrupar ordens selecionadas");
      return false;
    }
    public void invoke22( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      //  n:dataGrid
      br.com.linkcom.neo.view.DataGridTag _jspx_th_n_dataGrid_1 = new br.com.linkcom.neo.view.DataGridTag();
      _jspx_th_n_dataGrid_1.setJspContext(_jspx_page_context);
      _jspx_th_n_dataGrid_1.setParent(_jspx_parent);
      _jspx_th_n_dataGrid_1.setItens((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${carregamento.listaConferencias}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      _jspx_th_n_dataGrid_1.setId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("ordemservico${index}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      _jspx_th_n_dataGrid_1.setVar("ordemservico");
      _jspx_th_n_dataGrid_1.setDynaLine(new Boolean(false));
      _jspx_th_n_dataGrid_1.setVarIndex("indexordsrv");
      _jspx_th_n_dataGrid_1.setVarStatus("statusordsrv");
      _jspx_th_n_dataGrid_1.setDynamicAttribute(null, "varRowIndex", new String("rowordsrv"));
      _jspx_th_n_dataGrid_1.setDynamicAttribute(null, "rowonmouseover", new String("javascript:$dg.mouseonOverTabela('ordemservico',this)"));
      _jspx_th_n_dataGrid_1.setDynamicAttribute(null, "rowonmouseout", new String("javascript:$dg.mouseonOutTabela('ordemservico',this)"));
      _jspx_th_n_dataGrid_1.setHeaderStyleClass("headerSeparacao");
      _jspx_th_n_dataGrid_1.setBodyStyleClasses("dataGridBody1,dataGridBody2");
      _jspx_th_n_dataGrid_1.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 23, _jspx_page_context, _jspx_th_n_dataGrid_1, null));
      _jspx_th_n_dataGrid_1.doTag();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
      return;
    }
    public void invoke23( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      //  n:bean
      br.com.linkcom.neo.view.BeanTag _jspx_th_n_bean_2 = new br.com.linkcom.neo.view.BeanTag();
      _jspx_th_n_bean_2.setJspContext(_jspx_page_context);
      _jspx_th_n_bean_2.setParent(_jspx_parent);
      _jspx_th_n_bean_2.setName("ordemservico");
      _jspx_th_n_bean_2.setPropertyPrefix((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("listaBoxes[${index}].listaCarregamentos[${indexmat}].listaConferencias", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      _jspx_th_n_bean_2.setPropertyIndex((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${indexordsrv}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      _jspx_th_n_bean_2.setValueType(Ordemservico.class);
      _jspx_th_n_bean_2.setJspBody(new gerarSeparacaoExpedicao_jspHelper( 24, _jspx_page_context, _jspx_th_n_bean_2, null));
      _jspx_th_n_bean_2.doTag();
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      return;
    }
    public void invoke24( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_column_2(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_column_3(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_column_4(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_column_5(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_column_6(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      return;
    }
    public boolean invoke25( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_body_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke26( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_7(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_8(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke27( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_body_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke28( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_9(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke29( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_body_3(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke30( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_10(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_11(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke31( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_body_4(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke32( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_12(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_13(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_14(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke33( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_body_5(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke34( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_15(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_16(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_17(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
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
