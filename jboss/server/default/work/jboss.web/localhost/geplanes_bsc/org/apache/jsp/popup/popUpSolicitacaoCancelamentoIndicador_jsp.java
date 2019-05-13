package org.apache.jsp.popup;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class popUpSolicitacaoCancelamentoIndicador_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t");
      if (_jspx_meth_n_head_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t<script language=\"JavaScript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/javascript/ajquery.js\"></script>\r\n");
      out.write("\t\t<script language=\"JavaScript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/javascript/jquery.maskedinput-1.1.1.pack.js\"></script>\r\n");
      out.write("\t\t<script language=\"JavaScript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/javascript/dimensions.pack.js\"></script>\r\n");
      out.write("\t\t<script language=\"JavaScript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/javascript/dimmer.js\"></script>\r\n");
      out.write("\t\t<script language=\"JavaScript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/javascript/treetable.js\"></script>\r\n");
      out.write("\t\t<script language=\"JavaScript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/javascript/GeplanesUtil.js\"></script>\r\n");
      out.write("\t\t<script language=\"JavaScript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/javascript/thickbox-compressed.js\"></script>\r\n");
      out.write("\t\t<script language=\"JavaScript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/javascript/jquery.bgiframe.min.js\"></script>\r\n");
      out.write("\t\t<script language=\"JavaScript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/javascript/jquery.autocomplete.js\"></script>\r\n");
      out.write("\t\t<script language=\"JavaScript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/javascript/jquery.maskedinput-1.1.1.js\"></script>\r\n");
      out.write("\t\t<script language=\"JavaScript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/javascript/jquery.ajaxQueue.js\"></script>\r\n");
      out.write("\t\t<script language=\"JavaScript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/javascript/akModal.js\"></script>\t\t\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\r\n");
      out.write("\t<body leftmargin=\"0\" topmargin=\"0\" style=\"padding:0px\" bgColor=\"#FFFFFF\" style=\"background-color: #FFFFFF;overflow:hidden;\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_n_form_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</body>\r\n");
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

  private boolean _jspx_meth_n_head_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:head
    br.com.linkcom.neo.view.HeadTag _jspx_th_n_head_0 = new br.com.linkcom.neo.view.HeadTag();
    _jspx_th_n_head_0.setJspContext(_jspx_page_context);
    _jspx_th_n_head_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:form
    br.com.linkcom.neo.view.FormTag _jspx_th_n_form_0 = new br.com.linkcom.neo.view.FormTag();
    _jspx_th_n_form_0.setJspContext(_jspx_page_context);
    _jspx_th_n_form_0.setValidate(new Boolean(true));
    _jspx_th_n_form_0.setJspBody(new popUpSolicitacaoCancelamentoIndicador_jspHelper( 0, _jspx_page_context, _jspx_th_n_form_0, null));
    _jspx_th_n_form_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_validation_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:validation
    br.com.linkcom.neo.view.ValidationTag _jspx_th_n_validation_0 = new br.com.linkcom.neo.view.ValidationTag();
    _jspx_th_n_validation_0.setJspContext(_jspx_page_context);
    _jspx_th_n_validation_0.setParent(_jspx_parent);
    _jspx_th_n_validation_0.setJspBody(new popUpSolicitacaoCancelamentoIndicador_jspHelper( 1, _jspx_page_context, _jspx_th_n_validation_0, null));
    _jspx_th_n_validation_0.doTag();
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
    _jspx_th_n_bean_0.setName("solicitacaoCancelamentoIndicador");
    _jspx_th_n_bean_0.setJspBody(new popUpSolicitacaoCancelamentoIndicador_jspHelper( 2, _jspx_page_context, _jspx_th_n_bean_0, null));
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
    _jspx_th_t_property_0.setName("indicador");
    _jspx_th_t_property_0.setMode("input");
    _jspx_th_t_property_0.setType(new String("hidden"));
    _jspx_th_t_property_0.setShowLabel(new Boolean(false));
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
    _jspx_th_t_property_1.setName("solicitante");
    _jspx_th_t_property_1.setMode("input");
    _jspx_th_t_property_1.setType(new String("hidden"));
    _jspx_th_t_property_1.setShowLabel(new Boolean(false));
    _jspx_th_t_property_1.doTag();
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
    _jspx_th_t_propertyConfig_0.setJspBody(new popUpSolicitacaoCancelamentoIndicador_jspHelper( 3, _jspx_page_context, _jspx_th_t_propertyConfig_0, null));
    _jspx_th_t_propertyConfig_0.doTag();
    return false;
  }

  private boolean _jspx_meth_t_janelaResultados_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:janelaResultados
    br.com.linkcom.neo.view.template.JanelaResultadosTag _jspx_th_t_janelaResultados_0 = new br.com.linkcom.neo.view.template.JanelaResultadosTag();
    _jspx_th_t_janelaResultados_0.setJspContext(_jspx_page_context);
    _jspx_th_t_janelaResultados_0.setParent(_jspx_parent);
    _jspx_th_t_janelaResultados_0.setJspBody(new popUpSolicitacaoCancelamentoIndicador_jspHelper( 4, _jspx_page_context, _jspx_th_t_janelaResultados_0, null));
    _jspx_th_t_janelaResultados_0.doTag();
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
    _jspx_th_n_group_0.setJspBody(new popUpSolicitacaoCancelamentoIndicador_jspHelper( 5, _jspx_page_context, _jspx_th_n_group_0, null));
    _jspx_th_n_group_0.doTag();
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
    _jspx_th_t_property_2.setName("indicador");
    _jspx_th_t_property_2.setMode("input");
    _jspx_th_t_property_2.setDynamicAttribute(null, "disabled", new String("disabled"));
    _jspx_th_t_property_2.setCols(new Integer(200));
    _jspx_th_t_property_2.setDynamicAttribute(null, "style", new String("width:300px"));
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
    _jspx_th_t_property_3.setName("solicitante");
    _jspx_th_t_property_3.setMode("input");
    _jspx_th_t_property_3.setDynamicAttribute(null, "disabled", new String("disabled"));
    _jspx_th_t_property_3.setCols(new Integer(200));
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
    _jspx_th_t_property_4.setName("justificativaSol");
    _jspx_th_t_property_4.setType(new String("TEXT_AREA"));
    _jspx_th_t_property_4.setMode("input");
    _jspx_th_t_property_4.setDynamicAttribute(null, "style", new String("width:350px;height:150px"));
    _jspx_th_t_property_4.setDynamicAttribute(null, "onKeyPress", new String("return contadorLetras(\"justificativaSol\",500,event)"));
    _jspx_th_t_property_4.setDynamicAttribute(null, "onkeyUp", new String("return contadorLetras(\"justificativaSol\",500,event)"));
    _jspx_th_t_property_4.doTag();
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
    _jspx_th_n_submit_0.setUrl("/sgm/process/SolicitacaoCancelamentoIndicador");
    _jspx_th_n_submit_0.setAction("cancelamentoPorLancamento");
    _jspx_th_n_submit_0.setDynamicAttribute(null, "class", new String("botao_normal"));
    _jspx_th_n_submit_0.setJspBody(new popUpSolicitacaoCancelamentoIndicador_jspHelper( 6, _jspx_page_context, _jspx_th_n_submit_0, null));
    _jspx_th_n_submit_0.doTag();
    return false;
  }

  private class popUpSolicitacaoCancelamentoIndicador_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public popUpSolicitacaoCancelamentoIndicador_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t ");
      if (_jspx_meth_n_validation_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t ");
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t <table class=\"lookup_janela\">\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t\t<TD class=\"fd_tela_titulo\" style=\"height: 20px;\" >Solicitação de cancelamento de indicador</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t\t<TD valign=\"top\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_bean_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t</TD>\r\n");
      out.write("\t\t\t</TR>\t\t\r\n");
      out.write("\t\t  </table>\r\n");
      out.write("\t\t");
      return false;
    }
    public boolean invoke2( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_t_property_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_t_property_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_t_propertyConfig_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      return false;
    }
    public boolean invoke3( JspWriter out ) 
      throws Throwable
    {
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_t_janelaResultados_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke4( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_group_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<div align=\"right\" style=\"padding-top:20px;padding-right:20px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_n_submit_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke5( JspWriter out ) 
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
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_4(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke6( JspWriter out ) 
      throws Throwable
    {
      out.write("Salvar");
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
