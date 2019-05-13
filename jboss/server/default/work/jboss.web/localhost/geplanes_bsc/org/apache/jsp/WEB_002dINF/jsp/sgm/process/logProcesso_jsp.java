package org.apache.jsp.WEB_002dINF.jsp.sgm.process;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.linkcom.sgm.beans.LogProcesso;

public final class logProcesso_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  t:tela
      br.com.linkcom.neo.view.template.TelaTag _jspx_th_t_tela_0 = new br.com.linkcom.neo.view.template.TelaTag();
      _jspx_th_t_tela_0.setJspContext(_jspx_page_context);
      _jspx_th_t_tela_0.setTitulo("Processos de Notificação / Atualização");
      _jspx_th_t_tela_0.setJspBody(new logProcesso_jspHelper( 0, _jspx_page_context, _jspx_th_t_tela_0, null));
      _jspx_th_t_tela_0.doTag();
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction atualiza(acao){\r\n");
      out.write("\t\tform.validate = 'false'; \r\n");
      out.write("\t\tform.suppressErrors.value = 'true';\r\n");
      out.write("\t\tform.ACAO.value = acao;\r\n");
      out.write("\t\tform.suppressValidation.value = 'true';\r\n");
      out.write("\t\tsubmitForm();\r\n");
      out.write("\t}\r\n");
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

  private boolean _jspx_meth_n_column_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:column
    br.com.linkcom.neo.view.ColumnTag _jspx_th_n_column_0 = new br.com.linkcom.neo.view.ColumnTag();
    _jspx_th_n_column_0.setJspContext(_jspx_page_context);
    _jspx_th_n_column_0.setParent(_jspx_parent);
    _jspx_th_n_column_0.setHeader("Item");
    _jspx_th_n_column_0.setDynamicAttribute(null, "style", new String("width: 400px;"));
    _jspx_th_n_column_0.setJspBody(new logProcesso_jspHelper( 3, _jspx_page_context, _jspx_th_n_column_0, null));
    _jspx_th_n_column_0.doTag();
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
    _jspx_th_t_property_0.setName("item");
    _jspx_th_t_property_0.doTag();
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
    _jspx_th_n_column_1.setHeader("Data/hora da última atualização");
    _jspx_th_n_column_1.setDynamicAttribute(null, "style", new String("text-align:center;"));
    _jspx_th_n_column_1.setJspBody(new logProcesso_jspHelper( 4, _jspx_page_context, _jspx_th_n_column_1, null));
    _jspx_th_n_column_1.doTag();
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
    _jspx_th_t_property_1.setName("strDtHrAtualizacao");
    _jspx_th_t_property_1.doTag();
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
    _jspx_th_n_column_2.setHeader("Ação");
    _jspx_th_n_column_2.setDynamicAttribute(null, "style", new String("width: 30px; text-align:center;"));
    _jspx_th_n_column_2.setJspBody(new logProcesso_jspHelper( 5, _jspx_page_context, _jspx_th_n_column_2, null));
    _jspx_th_n_column_2.doTag();
    return false;
  }

  private class logProcesso_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public logProcesso_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
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
      //  n:dataGrid
      br.com.linkcom.neo.view.DataGridTag _jspx_th_n_dataGrid_0 = new br.com.linkcom.neo.view.DataGridTag();
      _jspx_th_n_dataGrid_0.setJspContext(_jspx_page_context);
      _jspx_th_n_dataGrid_0.setParent(_jspx_parent);
      _jspx_th_n_dataGrid_0.setItens((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${logProcesso}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      _jspx_th_n_dataGrid_0.setVar("logProcessoItem");
      _jspx_th_n_dataGrid_0.setHeaderStyleClass("txt_tit");
      _jspx_th_n_dataGrid_0.setBodyStyleClasses("txt_l1, txt_l2");
      _jspx_th_n_dataGrid_0.setFooterStyleClass("listagemFooter");
      _jspx_th_n_dataGrid_0.setStyleClass("fd_tabela1");
      _jspx_th_n_dataGrid_0.setJspBody(new logProcesso_jspHelper( 1, _jspx_page_context, _jspx_th_n_dataGrid_0, null));
      _jspx_th_n_dataGrid_0.doTag();
      out.write('\r');
      out.write('\n');
      return;
    }
    public void invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t");
      //  n:bean
      br.com.linkcom.neo.view.BeanTag _jspx_th_n_bean_0 = new br.com.linkcom.neo.view.BeanTag();
      _jspx_th_n_bean_0.setJspContext(_jspx_page_context);
      _jspx_th_n_bean_0.setParent(_jspx_parent);
      _jspx_th_n_bean_0.setName("logProcessoItem");
      _jspx_th_n_bean_0.setValueType( LogProcesso.class );
      _jspx_th_n_bean_0.setJspBody(new logProcesso_jspHelper( 2, _jspx_page_context, _jspx_th_n_bean_0, null));
      _jspx_th_n_bean_0.doTag();
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
      if (_jspx_meth_n_column_0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_n_column_1(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_n_column_2(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      return;
    }
    public boolean invoke3( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_property_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      return false;
    }
    public boolean invoke4( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_property_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      return false;
    }
    public boolean invoke5( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<img src=\"../../images/btn_trocar.gif\" \r\n");
      out.write("\t\t\t\t\t\t\t border=\"0\" \r\n");
      out.write("\t\t\t\t\t\t\t onmouseover=\"Tip('Atualiza ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${logProcessoItem.item}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("')\"\r\n");
      out.write("\t\t\t\t\t\t\t onclick=\"atualiza('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${logProcessoItem.acao}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("');\"\r\n");
      out.write("\t\t\t\t\t\t\t style=\"cursor: pointer;\"\r\n");
      out.write("\t\t\t\t\t\t/>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t");
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
