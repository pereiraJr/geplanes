package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class unidadeGerencialInput_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("n:descriptionToString", br.com.linkcom.neo.view.NeoFunctions.class, "descriptionToString", new Class[] {java.lang.Object.class});
}

  private static java.util.List _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String name;
  private java.lang.String onchange;
  private java.lang.String estiloclasse;

  public java.lang.String getName() {
    return this.name;
  }

  public void setName(java.lang.String name) {
    this.name = name;
  }

  public java.lang.String getOnchange() {
    return this.onchange;
  }

  public void setOnchange(java.lang.String onchange) {
    this.onchange = onchange;
  }

  public java.lang.String getEstiloclasse() {
    return this.estiloclasse;
  }

  public void setEstiloclasse(java.lang.String estiloclasse) {
    this.estiloclasse = estiloclasse;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    _jspInit(config);
    if( getName() != null ) 
      _jspx_page_context.setAttribute("name", getName());
    if( getOnchange() != null ) 
      _jspx_page_context.setAttribute("onchange", getOnchange());
    if( getEstiloclasse() != null ) 
      _jspx_page_context.setAttribute("estiloclasse", getEstiloclasse());

    try {
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
      if (_jspx_meth_n_property_0(_jspx_page_context))
        return;
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_n_property_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  n:property
    br.com.linkcom.neo.view.PropertyTag _jspx_th_n_property_0 = new br.com.linkcom.neo.view.PropertyTag();
    _jspx_th_n_property_0.setJspContext(_jspx_page_context);
    _jspx_th_n_property_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    _jspx_th_n_property_0.setName((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
    _jspx_th_n_property_0.setJspBody(new unidadeGerencialInput_tagHelper( 0, _jspx_page_context, _jspx_th_n_property_0, null));
    _jspx_th_n_property_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_input_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  n:input
    br.com.linkcom.neo.view.InputTag _jspx_th_n_input_0 = new br.com.linkcom.neo.view.InputTag();
    _jspx_th_n_input_0.setJspContext(_jspx_page_context);
    _jspx_th_n_input_0.setParent(_jspx_parent);
    _jspx_th_n_input_0.setType(new String("hidden"));
    _jspx_th_n_input_0.setId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}_value", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
    _jspx_th_n_input_0.setDynamicAttribute(null, "onchange", (java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${onchange}", java.lang.Object.class, (PageContext)this.getJspContext(), null, false));
    _jspx_th_n_input_0.setForceValidation(true);
    _jspx_th_n_input_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty value}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Escolher");
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
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty value}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Limpar");
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
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty onchange}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t \t\t\tform['");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
        out.write("'].onchange();\r\n");
        out.write("\t \t\t");
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

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty onchange}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t \t\t\tform['");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
        out.write("'].onchange();\r\n");
        out.write("\t\t\t \t\t");
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

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty onchange}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t \t\t\tform['");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
        out.write("'].onchange();\r\n");
        out.write("\t \t\t");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty onchange}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t \t\t\tform['");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
        out.write("'].onchange();\r\n");
        out.write("\t\t \t\t");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty onchange}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null, false)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t \t\t\tform['");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
        out.write("'].onchange();\r\n");
        out.write("\t\t\t \t\t");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private class unidadeGerencialInput_tagHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public unidadeGerencialInput_tagHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t<input type=\"text\" readOnly=\"true\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n:descriptionToString(value)}", java.lang.String.class, (PageContext)this.getJspContext(), _jspx_fnmap_0, false));
      out.write("\" id=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label\"\tname=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label\" style=\"width: 150px\" class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${estiloclasse}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("\"/> \r\n");
      out.write("\t");
      if (_jspx_meth_n_input_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<button type=\"button\" id=\"botaoEscolher");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("\" class=\"botao_normal\" style=\"width: 80px\" onclick=\"escolherUnidadeGerencial");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("()\">");
      if (_jspx_meth_c_if_0(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_c_if_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("</button>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\tif(form['planoGestao'].value != \"<null>\"){\r\n");
      out.write("\t\t\t\tif(form['");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("'].value == \"\" || form['");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("'].value == \"<null>\"){\r\n");
      out.write("\t\t\t\t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label\").removeAttr(\"readOnly\");\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label\").attr(\"readOnly\", \"true\");\r\n");
      out.write("\t\t\t\t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label\").unautocomplete();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label\").attr(\"readOnly\", \"true\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(form['planoGestao']).change(function(){\r\n");
      out.write("\t\t\tform['");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("'].value = '<null>';\r\n");
      out.write(" \t\t\tform['");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label'].value = '';\r\n");
      out.write(" \t\t\tdocument.getElementById('botaoEscolher");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("').innerHTML = 'Escolher';\r\n");
      out.write("\t \t\t");
      if (_jspx_meth_c_if_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\t \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\tif(form['planoGestao'].value != \"<null>\"){\r\n");
      out.write("\t\t\t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label\").removeAttr(\"readOnly\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label\").autocomplete('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("/util/UnidadeGerencialAutoComplete?planoGestao='+form['planoGestao'].value, {\r\n");
      out.write("\t\t\t\t\twidth: 300,\r\n");
      out.write("\t\t\t\t\tmultiple: true,\r\n");
      out.write("\t\t\t\t\tmatchContains: true,\r\n");
      out.write("\t\t\t\t\tformatItem: formatItem,\r\n");
      out.write("\t\t\t\t\tformatResult: formatResult,\r\n");
      out.write("\t\t\t\t\tmax: 100\r\n");
      out.write("\t\t\t\t}).result(function(event, data, formatted) {\r\n");
      out.write("\t\t\t\t\tdata[0] = stripJavascriptTags(data[0]);\r\n");
      out.write("\t\t\t\t\tformatted = stripJavascriptTags(formatted);\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label\").val(formatted);\r\n");
      out.write("\t\t\t\t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_value\").val('br.com.linkcom.sgm.beans.UnidadeGerencial[id=' + data[1] + ']');\r\n");
      out.write("\t\t\t\t\tdocument.getElementById('botaoEscolher");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("').innerHTML = 'Limpar';\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_if_3(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t \t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label\").unautocomplete();\r\n");
      out.write("\t\t\t \t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label\").attr(\"readOnly\", \"true\");\t \t\r\n");
      out.write("\t\t\t\t});\t\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label\").attr(\"readOnly\", \"true\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label\").unautocomplete();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label\").autocomplete('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("/util/UnidadeGerencialAutoComplete?planoGestao='+form['planoGestao'].value, {\r\n");
      out.write("\t\t\twidth: 300,\r\n");
      out.write("\t\t\tmultiple: true,\r\n");
      out.write("\t\t\tmatchContains: true,\r\n");
      out.write("\t\t\tformatItem: formatItem,\r\n");
      out.write("\t\t\tformatResult: formatResult,\r\n");
      out.write("\t\t\tmax: 100\r\n");
      out.write("\t\t}).result(function(event, data, formatted) {\r\n");
      out.write("\t\t\tdata[0] = stripJavascriptTags(data[0]);\r\n");
      out.write("\t\t\tformatted = stripJavascriptTags(formatted);\t\t\r\n");
      out.write("\t\t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label\").val(formatted);\r\n");
      out.write("\t\t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_value\").val('br.com.linkcom.sgm.beans.UnidadeGerencial[id=' + data[1] + ']');\r\n");
      out.write("\t\t\tdocument.getElementById('botaoEscolher");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("').innerHTML = 'Limpar';\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_if_4(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t \t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label\").unautocomplete();\r\n");
      out.write("\t \t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label\").attr(\"readOnly\", \"true\");\t \t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction formatItem(row) {\r\n");
      out.write("\t\t\treturn stripJavascriptTags(row[0]);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction formatResult(row) {\r\n");
      out.write("\t\t\treturn stripJavascriptTags(row[0]);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t \tfunction escolherUnidadeGerencial");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("(){\r\n");
      out.write("\t \t\tif(document.getElementById('botaoEscolher");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("').innerHTML != 'Limpar'){\r\n");
      out.write("\t \t\t\tif (form['planoGestao'].value != '<null>') {\r\n");
      out.write("\t\t \t\t\twindow.open('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("/util/UnidadeGerencialTreeView?propriedade=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("&unidadeGerencial='+form['");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("'].value+'&planoGestao='+form['planoGestao'].value, 'ugtv', 'directories=no,height=450,width=500,top=50,left=200,location=no,menubar=no,status=no,toolbar=no,resizable=yes');\r\n");
      out.write("\t\t \t\t}\r\n");
      out.write("\t\t \t\telse {\r\n");
      out.write("\t\t \t\t\talert('Favor selecionar o ano da gestão.');\r\n");
      out.write("\t\t \t\t}\t\t\t\t\t \t\t\r\n");
      out.write("\t \t\t} else {\r\n");
      out.write("\t \t\t\tform['");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("'].value = '<null>';\r\n");
      out.write("\t \t\t\tform['");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label'].value = '';\r\n");
      out.write("\t \t\t\tdocument.getElementById('botaoEscolher");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("').innerHTML = 'Escolher';\r\n");
      out.write("\t\t \t\t");
      if (_jspx_meth_c_if_5(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\t \r\n");
      out.write("\t\t \t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label\").removeAttr(\"readOnly\");\r\n");
      out.write("\t\t \t\t\r\n");
      out.write("\t\t \t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label\").autocomplete('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("/util/UnidadeGerencialAutoComplete?planoGestao='+form['planoGestao'].value, {\r\n");
      out.write("\t\t\t\t\twidth: 300,\r\n");
      out.write("\t\t\t\t\tmultiple: true,\r\n");
      out.write("\t\t\t\t\tmatchContains: true,\r\n");
      out.write("\t\t\t\t\tformatItem: formatItem,\r\n");
      out.write("\t\t\t\t\tformatResult: formatResult,\r\n");
      out.write("\t\t\t\t\tmax: 100\r\n");
      out.write("\t\t\t\t}).result(function(event, data, formatted) {\r\n");
      out.write("\t\t\t\t\tdata[0] = stripJavascriptTags(data[0]);\r\n");
      out.write("\t\t\t\t\tformatted = stripJavascriptTags(formatted);\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label\").val(formatted);\r\n");
      out.write("\t\t\t\t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_value\").val('br.com.linkcom.sgm.beans.UnidadeGerencial[id=' + data[1] + ']');\r\n");
      out.write("\t\t\t\t\tdocument.getElementById('botaoEscolher");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("').innerHTML = 'Limpar';\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_if_6(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t \t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label\").unautocomplete();\r\n");
      out.write("\t\t\t \t\t$(\"#");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (PageContext)this.getJspContext(), null, false));
      out.write("_label\").attr(\"readOnly\", \"true\");\t \t\r\n");
      out.write("\t\t\t\t});\t\t\t\r\n");
      out.write("\t \t\t}\r\n");
      out.write("\t \t}\r\n");
      out.write(" \t</script>\r\n");
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
