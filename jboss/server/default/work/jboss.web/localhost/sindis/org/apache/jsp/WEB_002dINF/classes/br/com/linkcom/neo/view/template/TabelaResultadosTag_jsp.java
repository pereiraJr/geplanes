package org.apache.jsp.WEB_002dINF.classes.br.com.linkcom.neo.view.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TabelaResultadosTag_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_2;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_3;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_4;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_5;
static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_6;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getInstance();
  _jspx_fnmap_0.mapFunction("n:id", br.com.linkcom.neo.view.NeoFunctions.class, "id", new Class[] {java.lang.Object.class});
  _jspx_fnmap_0.mapFunction("n:reevaluate", br.com.linkcom.neo.view.NeoFunctions.class, "reevaluate", new Class[] {java.lang.String.class, javax.servlet.jsp.PageContext.class});
  _jspx_fnmap_1= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("n:hierarchy", br.com.linkcom.neo.view.NeoFunctions.class, "hierarchy", new Class[] {java.lang.Class.class});
  _jspx_fnmap_2= org.apache.jasper.runtime.ProtectedFunctionMapper.getInstance();
  _jspx_fnmap_2.mapFunction("n:escape", br.com.linkcom.neo.view.NeoFunctions.class, "escape", new Class[] {java.lang.String.class});
  _jspx_fnmap_2.mapFunction("n:valueToString", br.com.linkcom.neo.view.NeoFunctions.class, "valueToString", new Class[] {java.lang.Object.class});
  _jspx_fnmap_2.mapFunction("n:reevaluate", br.com.linkcom.neo.view.NeoFunctions.class, "reevaluate", new Class[] {java.lang.String.class, javax.servlet.jsp.PageContext.class});
  _jspx_fnmap_3= org.apache.jasper.runtime.ProtectedFunctionMapper.getInstance();
  _jspx_fnmap_3.mapFunction("n:escape", br.com.linkcom.neo.view.NeoFunctions.class, "escape", new Class[] {java.lang.String.class});
  _jspx_fnmap_3.mapFunction("n:descriptionToString", br.com.linkcom.neo.view.NeoFunctions.class, "descriptionToString", new Class[] {java.lang.Object.class});
  _jspx_fnmap_3.mapFunction("n:reevaluate", br.com.linkcom.neo.view.NeoFunctions.class, "reevaluate", new Class[] {java.lang.String.class, javax.servlet.jsp.PageContext.class});
  _jspx_fnmap_4= org.apache.jasper.runtime.ProtectedFunctionMapper.getInstance();
  _jspx_fnmap_4.mapFunction("n:idProperty", br.com.linkcom.neo.view.NeoFunctions.class, "idProperty", new Class[] {java.lang.Object.class});
  _jspx_fnmap_4.mapFunction("n:reevaluate", br.com.linkcom.neo.view.NeoFunctions.class, "reevaluate", new Class[] {java.lang.String.class, javax.servlet.jsp.PageContext.class});
  _jspx_fnmap_4.mapFunction("n:id", br.com.linkcom.neo.view.NeoFunctions.class, "id", new Class[] {java.lang.Object.class});
  _jspx_fnmap_5= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("s:gettotalpagepaginacaosimples", br.com.linkcom.sined.util.tag.TagFunctions.class, "getTotalPagePaginacaoSimples", new Class[] {br.com.linkcom.neo.controller.crud.FiltroListagem.class, java.util.List.class});
  _jspx_fnmap_6= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("s:gettotalpage", br.com.linkcom.sined.util.tag.TagFunctions.class, "getTotalPage", new Class[] {br.com.linkcom.neo.controller.crud.FiltroListagem.class});
}

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(5);
    _jspx_dependants.add("/WEB-INF/tld/c.tld");
    _jspx_dependants.add("/WEB-INF/tld/neo.tld");
    _jspx_dependants.add("/WEB-INF/tld/combo.tld");
    _jspx_dependants.add("/WEB-INF/tld/template.tld");
    _jspx_dependants.add("/WEB-INF/tld/sined.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_otherwise.release();
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
      if (_jspx_meth_n_dataGrid_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<table width=\"100%\">\r\n");
      out.write("\t");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<script>\r\n");
      out.write("\t");
      if (_jspx_meth_c_if_8(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_c_if_9(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\tfunction calcularTotalRegistrosPaginacao(){\r\n");
      out.write("\t\r\n");
      out.write("\t\t$(\"#spanTotalPaginacao\").html(\"calculando...\");\r\n");
      out.write(" \t\tform.ACAO.value = 'calcularTotalRegistrosPaginacaoAJax';\r\n");
      out.write(" \t\t\r\n");
      out.write(" \t\tjQuery.ajax({\r\n");
      out.write("\t\t\ttype: \"POST\",\r\n");
      out.write("\t\t\turl: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${TEMPLATE_requestQuery}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\",\r\n");
      out.write("\t\t\tdata: $(form).serialize(),\r\n");
      out.write("\t\t\tsuccess: function(data){\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\teval(data);\r\n");
      out.write("\t\t\t\t\t\t$(\"#spanTotalPaginacao\").html(totalRegistrosPaginacao);\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\tdataType: \"script\"\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\r\n");
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

  private boolean _jspx_meth_n_dataGrid_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:dataGrid
    br.com.linkcom.neo.view.DataGridTag _jspx_th_n_dataGrid_0 = new br.com.linkcom.neo.view.DataGridTag();
    _jspx_th_n_dataGrid_0.setJspContext(_jspx_page_context);
    _jspx_th_n_dataGrid_0.setItens((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${TtabelaResultados.itens}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_n_dataGrid_0.setVar((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${TtabelaResultados.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_n_dataGrid_0.setDynamicAttribute(null, "width", new String("100%"));
    _jspx_th_n_dataGrid_0.setDynamicAttribute(null, "cellspacing", new String("0"));
    _jspx_th_n_dataGrid_0.setDynamicAttribute(null, "rowondblclick", new String("javascript:$dg.editarRegistro(this)"));
    _jspx_th_n_dataGrid_0.setDynamicAttribute(null, "rowonclick", new String("javascript:$dg.coloreLinha('tabelaResultados',this)"));
    _jspx_th_n_dataGrid_0.setDynamicAttribute(null, "rowonmouseover", new String("javascript:$dg.mouseonOverTabela('tabelaResultados',this)"));
    _jspx_th_n_dataGrid_0.setDynamicAttribute(null, "rowonmouseout", new String("javascript:$dg.mouseonOutTabela('tabelaResultados',this)"));
    _jspx_th_n_dataGrid_0.setId("tabelaResultados");
    _jspx_th_n_dataGrid_0.setVarIndex("index");
    _jspx_th_n_dataGrid_0.setJspBody(new TabelaResultadosTag_jspHelper( 0, _jspx_page_context, _jspx_th_n_dataGrid_0, null));
    _jspx_th_n_dataGrid_0.doTag();
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
    _jspx_th_n_bean_0.setName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${TtabelaResultados.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_n_bean_0.setValueType((java.lang.Class) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${TtabelaResultados.valueType}", java.lang.Class.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_n_bean_0.setJspBody(new TabelaResultadosTag_jspHelper( 1, _jspx_page_context, _jspx_th_n_bean_0, null));
    _jspx_th_n_bean_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_getContent_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:getContent
    br.com.linkcom.neo.view.GetContentTag _jspx_th_n_getContent_0 = new br.com.linkcom.neo.view.GetContentTag();
    _jspx_th_n_getContent_0.setJspContext(_jspx_page_context);
    _jspx_th_n_getContent_0.setParent(_jspx_parent);
    _jspx_th_n_getContent_0.setTagName("acaoTag");
    _jspx_th_n_getContent_0.setVars("acoes");
    _jspx_th_n_getContent_0.setJspBody(new TabelaResultadosTag_jspHelper( 2, _jspx_page_context, _jspx_th_n_getContent_0, null));
    _jspx_th_n_getContent_0.doTag();
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${TtabelaResultados.showExcluirLink}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_n_column_0(_jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
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

  private boolean _jspx_meth_n_column_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:column
    br.com.linkcom.neo.view.ColumnTag _jspx_th_n_column_0 = new br.com.linkcom.neo.view.ColumnTag();
    _jspx_th_n_column_0.setJspContext(_jspx_page_context);
    _jspx_th_n_column_0.setParent(_jspx_th_c_if_0);
    _jspx_th_n_column_0.setJspBody(new TabelaResultadosTag_jspHelper( 3, _jspx_page_context, _jspx_th_n_column_0, null));
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
    _jspx_th_n_header_0.setJspBody(new TabelaResultadosTag_jspHelper( 4, _jspx_page_context, _jspx_th_n_header_0, null));
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
    _jspx_th_n_body_0.setJspBody(new TabelaResultadosTag_jspHelper( 5, _jspx_page_context, _jspx_th_n_body_0, null));
    _jspx_th_n_body_0.doTag();
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
    _jspx_th_t_propertyConfig_0.setMode("output");
    _jspx_th_t_propertyConfig_0.setRenderAs("column");
    _jspx_th_t_propertyConfig_0.setJspBody(new TabelaResultadosTag_jspHelper( 6, _jspx_page_context, _jspx_th_t_propertyConfig_0, null));
    _jspx_th_t_propertyConfig_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_doBody_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:doBody
    br.com.linkcom.neo.view.DoBodyTag _jspx_th_n_doBody_0 = new br.com.linkcom.neo.view.DoBodyTag();
    _jspx_th_n_doBody_0.setJspContext(_jspx_page_context);
    _jspx_th_n_doBody_0.setParent(_jspx_parent);
    _jspx_th_n_doBody_0.doTag();
    return false;
  }

  private boolean _jspx_meth_s_listagemAvancada_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:listagemAvancada
    br.com.linkcom.sined.util.tag.ListagemavancadaTag _jspx_th_s_listagemAvancada_0 = new br.com.linkcom.sined.util.tag.ListagemavancadaTag();
    _jspx_th_s_listagemAvancada_0.setJspContext(_jspx_page_context);
    _jspx_th_s_listagemAvancada_0.setParent(_jspx_parent);
    _jspx_th_s_listagemAvancada_0.setItens((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${TtabelaResultados.itens}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_s_listagemAvancada_0.setIndice((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${index}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_s_listagemAvancada_0.doTag();
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(!empty acoes) || (TtabelaResultados.showEditarLink) || (TtabelaResultados.showExcluirLink) || (TtabelaResultados.showConsultarLink)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_n_column_1(_jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\r\n");
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

  private boolean _jspx_meth_n_column_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:column
    br.com.linkcom.neo.view.ColumnTag _jspx_th_n_column_1 = new br.com.linkcom.neo.view.ColumnTag();
    _jspx_th_n_column_1.setJspContext(_jspx_page_context);
    _jspx_th_n_column_1.setParent(_jspx_th_c_if_1);
    _jspx_th_n_column_1.setHeader(" ");
    _jspx_th_n_column_1.setDynamicAttribute(null, "style", new String("width: 1%; white-space: nowrap; padding-right: 3px;"));
    _jspx_th_n_column_1.setJspBody(new TabelaResultadosTag_jspHelper( 7, _jspx_page_context, _jspx_th_n_column_1, null));
    _jspx_th_n_column_1.doTag();
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${TtabelaResultados.showConsultarLink}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_n_link_0(_jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\r\n");
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

  private boolean _jspx_meth_n_link_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_0 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_0.setJspContext(_jspx_page_context);
    _jspx_th_n_link_0.setParent(_jspx_th_c_if_2);
    _jspx_th_n_link_0.setAction("consultar");
    _jspx_th_n_link_0.setDynamicAttribute(null, "onmouseover", new String("Tip(\"Consultar registro\")"));
    _jspx_th_n_link_0.setParameters((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n:idProperty(n:reevaluate(TtabelaResultados.name,pageContext))}=${n:id(n:reevaluate(TtabelaResultados.name,pageContext))}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_4, false));
    _jspx_th_n_link_0.setDynamicAttribute(null, "class", new String("activation"));
    _jspx_th_n_link_0.setJspBody(new TabelaResultadosTag_jspHelper( 8, _jspx_page_context, _jspx_th_n_link_0, null));
    _jspx_th_n_link_0.doTag();
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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${TtabelaResultados.showEditarLink}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_n_link_1(_jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_n_link_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_1 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_1.setJspContext(_jspx_page_context);
    _jspx_th_n_link_1.setParent(_jspx_th_c_if_3);
    _jspx_th_n_link_1.setAction("editar");
    _jspx_th_n_link_1.setDynamicAttribute(null, "onmouseover", new String("Tip(\"Editar registro\")"));
    _jspx_th_n_link_1.setParameters((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n:idProperty(n:reevaluate(TtabelaResultados.name,pageContext))}=${n:id(n:reevaluate(TtabelaResultados.name,pageContext))}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_4, false));
    _jspx_th_n_link_1.setJspBody(new TabelaResultadosTag_jspHelper( 9, _jspx_page_context, _jspx_th_n_link_1, null));
    _jspx_th_n_link_1.doTag();
    return false;
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.paginacaoSimples==true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"paginacao\" align=\"left\">\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_n_pagging_0(_jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_if_4(_jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_if_5(_jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t</tr>\r\n");
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

  private boolean _jspx_meth_n_pagging_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:pagging
    br.com.linkcom.neo.view.PaggingTag _jspx_th_n_pagging_0 = new br.com.linkcom.neo.view.PaggingTag();
    _jspx_th_n_pagging_0.setJspContext(_jspx_page_context);
    _jspx_th_n_pagging_0.setParent(_jspx_th_c_when_0);
    _jspx_th_n_pagging_0.setCurrentPage((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentPage}", java.lang.Integer.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_n_pagging_0.setTotalNumberOfPages((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${numberOfPages}", java.lang.Integer.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_n_pagging_0.setSelectedClass("pageSelected");
    _jspx_th_n_pagging_0.setUnselectedClass("pageUnselected");
    _jspx_th_n_pagging_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty lista}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<td align=\"right\"><b>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.currentPage * filtro.pageSize + 1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</b> - <b>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s:gettotalpagepaginacaosimples(filtro, lista)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_5, false));
        out.write("</b> de <b><span id=\"spanTotalPaginacao\">");
        if (_jspx_meth_n_link_2(_jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("</span></b></td>\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_n_link_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_2 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_2.setJspContext(_jspx_page_context);
    _jspx_th_n_link_2.setParent(_jspx_th_c_if_4);
    _jspx_th_n_link_2.setAction("javascript:calcularTotalRegistrosPaginacao()");
    _jspx_th_n_link_2.setJspBody(new TabelaResultadosTag_jspHelper( 10, _jspx_page_context, _jspx_th_n_link_2, null));
    _jspx_th_n_link_2.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty lista}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<td align=\"right\"><b>Não existem registros!</b></td>\t\t\r\n");
        out.write("\t\t\t\t");
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
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td class=\"paginacao\" align=\"left\">\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_n_pagging_1(_jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_if_6(_jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_if_7(_jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t</tr>\r\n");
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

  private boolean _jspx_meth_n_pagging_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:pagging
    br.com.linkcom.neo.view.PaggingTag _jspx_th_n_pagging_1 = new br.com.linkcom.neo.view.PaggingTag();
    _jspx_th_n_pagging_1.setJspContext(_jspx_page_context);
    _jspx_th_n_pagging_1.setParent(_jspx_th_c_otherwise_0);
    _jspx_th_n_pagging_1.setCurrentPage((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentPage}", java.lang.Integer.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_n_pagging_1.setTotalNumberOfPages((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${numberOfPages}", java.lang.Integer.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_n_pagging_1.setSelectedClass("pageSelected");
    _jspx_th_n_pagging_1.setUnselectedClass("pageUnselected");
    _jspx_th_n_pagging_1.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty lista}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<td align=\"right\"><b>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.currentPage * filtro.pageSize + 1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</b> - <b>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s:gettotalpage(filtro)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_6, false));
        out.write("</b> de <b>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${filtro.numberOfResults}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</b></td>\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty lista}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<td align=\"right\"><b>Não existem registros!</b></td>\t\t\r\n");
        out.write("\t\t\t\t");
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
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${TtabelaResultados.showExcluirLink}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\tfunction excluirItensSelecionados(){\r\n");
        out.write("\t\t\tif($dg.validateSelectedValues()){\r\n");
        out.write("\t\t\t\tdocument.location = '?ACAO=excluir&itenstodelete='+$dg.getSelectedValues();\r\n");
        out.write("\t\t\t}\r\n");
        out.write("\t\t}\r\n");
        out.write("\t");
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
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!TtabelaResultados.showExcluirLink}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t$(\"#btn_excluir\").hide();\r\n");
        out.write("\t");
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

  private class TabelaResultadosTag_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public TabelaResultadosTag_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
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
      if (_jspx_meth_n_getContent_0(_jspx_parent, _jspx_page_context))
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
      if (_jspx_meth_c_if_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_t_propertyConfig_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t");
      return false;
    }
    public boolean invoke3( JspWriter out ) 
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
    public boolean invoke4( JspWriter out ) 
      throws Throwable
    {
      out.write("<input type=\"checkbox\" class=\"checkBoxClass\" name=\"selectAll\" id=\"selectAll\" onclick=\"javascript:$dg.changeCheckState();\">");
      return false;
    }
    public boolean invoke5( JspWriter out ) 
      throws Throwable
    {
      out.write("<input class=\"checkBoxClass\" type=\"checkbox\" name=\"selecteditens\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n:id(n:reevaluate(TtabelaResultados.name,pageContext))}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write('"');
      out.write('>');
      return false;
    }
    public boolean invoke6( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_doBody_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\t\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_listagemAvancada_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t");
      return false;
    }
    public boolean invoke7( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${acoes}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t\t\t<script language=\"javascript\">\r\n");
      out.write("\t\t\t\t\t\timprimirSelecionar(new Array(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n:hierarchy(TtabelaResultados.valueType)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_1, false));
      out.write("), \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n:escape(n:valueToString(n:reevaluate(TtabelaResultados.name, pageContext)))}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_2, false));
      out.write("\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n:escape(n:descriptionToString(n:reevaluate(TtabelaResultados.name, pageContext)))}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_3, false));
      out.write("\");\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_if_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_if_3(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      return false;
    }
    public boolean invoke8( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/imagens/consultar_icon.gif\" border=\"0\"/>\r\n");
      out.write("\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke9( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/imagens/editar.gif\" border=\"0\"/>\r\n");
      out.write("\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke10( JspWriter out ) 
      throws Throwable
    {
      out.write("Calcular Total");
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
