package org.apache.jsp.WEB_002dINF.jsp.sgm.crud;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.linkcom.neo.controller.crud.CrudController;

public final class modeloAuditoriaGestaoListagem_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      //  t:listagem
      br.com.linkcom.neo.view.template.ListagemTag _jspx_th_t_listagem_0 = new br.com.linkcom.neo.view.template.ListagemTag();
      _jspx_th_t_listagem_0.setJspContext(_jspx_page_context);
      _jspx_th_t_listagem_0.setTitulo("Modelo de auditoria de gestão");
      _jspx_th_t_listagem_0.setJspBody(new modeloAuditoriaGestaoListagem_jspHelper( 0, _jspx_page_context, _jspx_th_t_listagem_0, null));
      _jspx_th_t_listagem_0.doTag();
      out.write('\r');
      out.write('\n');
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
    _jspx_th_t_janelaFiltro_0.setJspBody(new modeloAuditoriaGestaoListagem_jspHelper( 1, _jspx_page_context, _jspx_th_t_janelaFiltro_0, null));
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
    _jspx_th_t_tabelaFiltro_0.setJspBody(new modeloAuditoriaGestaoListagem_jspHelper( 2, _jspx_page_context, _jspx_th_t_tabelaFiltro_0, null));
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
    _jspx_th_t_property_0.setName("nome");
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
    _jspx_th_t_property_1.doTag();
    return false;
  }

  private boolean _jspx_meth_n_link_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:link
    br.com.linkcom.neo.view.LinkTag _jspx_th_n_link_0 = new br.com.linkcom.neo.view.LinkTag();
    _jspx_th_n_link_0.setJspContext(_jspx_page_context);
    _jspx_th_n_link_0.setParent(_jspx_parent);
    _jspx_th_n_link_0.setAction("criar");
    _jspx_th_n_link_0.setParameters((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("id=${modeloAuditoriaGestao.id}&copiar=true", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_n_link_0.setDescription("Copiar o modelo de auditoria");
    _jspx_th_n_link_0.setJspBody(new modeloAuditoriaGestaoListagem_jspHelper( 7, _jspx_page_context, _jspx_th_n_link_0, null));
    _jspx_th_n_link_0.doTag();
    return false;
  }

  private class modeloAuditoriaGestaoListagem_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public modeloAuditoriaGestaoListagem_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
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
      if (_jspx_meth_t_janelaFiltro_0(_jspx_parent, _jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write('	');
      //  t:janelaResultados
      br.com.linkcom.neo.view.template.JanelaResultadosTag _jspx_th_t_janelaResultados_0 = new br.com.linkcom.neo.view.template.JanelaResultadosTag();
      _jspx_th_t_janelaResultados_0.setJspContext(_jspx_page_context);
      _jspx_th_t_janelaResultados_0.setParent(_jspx_parent);
      _jspx_th_t_janelaResultados_0.setJspBody(new modeloAuditoriaGestaoListagem_jspHelper( 3, _jspx_page_context, _jspx_th_t_janelaResultados_0, null));
      _jspx_th_t_janelaResultados_0.doTag();
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
      if (_jspx_meth_t_property_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t");
      return false;
    }
    public void invoke3( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t");
      //  t:tabelaResultados
      br.com.linkcom.neo.view.template.TabelaResultadosTag _jspx_th_t_tabelaResultados_0 = new br.com.linkcom.neo.view.template.TabelaResultadosTag();
      _jspx_th_t_tabelaResultados_0.setJspContext(_jspx_page_context);
      _jspx_th_t_tabelaResultados_0.setParent(_jspx_parent);
      _jspx_th_t_tabelaResultados_0.setJspBody(new modeloAuditoriaGestaoListagem_jspHelper( 4, _jspx_page_context, _jspx_th_t_tabelaResultados_0, null));
      _jspx_th_t_tabelaResultados_0.doTag();
      out.write('\r');
      out.write('\n');
      out.write('	');
      return;
    }
    public void invoke4( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_t_property_1(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      //  t:acao
      br.com.linkcom.neo.view.template.AcaoTag _jspx_th_t_acao_0 = new br.com.linkcom.neo.view.template.AcaoTag();
      _jspx_th_t_acao_0.setJspContext(_jspx_page_context);
      _jspx_th_t_acao_0.setParent(_jspx_parent);
      _jspx_th_t_acao_0.setLadoDireito(false);
      _jspx_th_t_acao_0.setJspBody(new modeloAuditoriaGestaoListagem_jspHelper( 5, _jspx_page_context, _jspx_th_t_acao_0, null));
      _jspx_th_t_acao_0.doTag();
      out.write("\r\n");
      out.write("\t\t");
      return;
    }
    public void invoke5( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t");
      //  n:hasAuthorization
      br.com.linkcom.neo.view.HasAuthorizationTag _jspx_th_n_hasAuthorization_0 = new br.com.linkcom.neo.view.HasAuthorizationTag();
      _jspx_th_n_hasAuthorization_0.setJspContext(_jspx_page_context);
      _jspx_th_n_hasAuthorization_0.setParent(_jspx_parent);
      _jspx_th_n_hasAuthorization_0.setUrl("/sgm/crud/ModeloAuditoriaGestao");
      _jspx_th_n_hasAuthorization_0.setAction( CrudController.EDITAR );
      _jspx_th_n_hasAuthorization_0.setJspBody(new modeloAuditoriaGestaoListagem_jspHelper( 6, _jspx_page_context, _jspx_th_n_hasAuthorization_0, null));
      _jspx_th_n_hasAuthorization_0.doTag();
      out.write("\r\n");
      out.write("\t\t\t");
      return;
    }
    public void invoke6( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_n_link_0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      return;
    }
    public boolean invoke7( JspWriter out ) 
      throws Throwable
    {
      out.write("<img src=\"../../images/ico_copiar.gif\">");
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
