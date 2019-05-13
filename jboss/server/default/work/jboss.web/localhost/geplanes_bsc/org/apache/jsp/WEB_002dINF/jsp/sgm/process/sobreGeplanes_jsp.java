package org.apache.jsp.WEB_002dINF.jsp.sgm.process;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sobreGeplanes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      if (_jspx_meth_t_tela_0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_t_tela_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tela
    br.com.linkcom.neo.view.template.TelaTag _jspx_th_t_tela_0 = new br.com.linkcom.neo.view.template.TelaTag();
    _jspx_th_t_tela_0.setJspContext(_jspx_page_context);
    _jspx_th_t_tela_0.setTitulo("Sobre o Geplanes");
    _jspx_th_t_tela_0.setJspBody(new sobreGeplanes_jspHelper( 0, _jspx_page_context, _jspx_th_t_tela_0, null));
    _jspx_th_t_tela_0.doTag();
    return false;
  }

  private class sobreGeplanes_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public sobreGeplanes_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<span class=\"txt_normal\">\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<span class=\"txt_grande\">Software gratuito de Gestão Estratégica (Versão: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${VERSAO}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(")</span>\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\tSistema de gestão desenvolvido pela LinkCom (www.linkcom.com.br) - para o planejamento estratégico. Ele é utilizado na fase de elaboração do plano estratégico e na execução das ações. Fazendo uso do Geplanes é possível gerenciar as medidas, as metas e seus desdobramentos, os indicadores e as anomalias. Através de relatórios, de gráficos e do painel de controle os gerentes, coordenadores, diretores e presidentes têm uma visão dos indicadores e da instituição.\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<span class=\"txt_grande\">O Geplanes permite:</span>\r\n");
      out.write("\t\t<UL>\r\n");
      out.write("\t\t\t<LI>Monitorar o desempenho dos objetivos estratégicos;\r\n");
      out.write("\t\t\t<LI>Analisar fatores críticos de sucesso;\r\n");
      out.write("\t\t\t<LI>Elaborar e acompanhar planos de ação;\r\n");
      out.write("\t\t\t<LI>Avaliar resultados apurados periodicamente por meio de indicadores de desempenho;\r\n");
      out.write("\t\t\t<LI>Emitir diversos relatórios gerenciais e gráficos de gestão à vista, dentre outras funções;\r\n");
      out.write("\t\t\t<LI>Desenhar o mapa estratégico da corporação e das suas unidades de negócio;\r\n");
      out.write("\t\t\t<LI>Realizar auditorias de gestão;\r\n");
      out.write("\t\t\t<LI>Monitorar o desempenho institucional por meio de gráficos e painel de bordo;\r\n");
      out.write("\t\t\t<LI>Utilizar ferramentas que permitam o registro e o tratamento de anomalias ou não-conformidades, promovendo a melhoria contínua da organização;\r\n");
      out.write("\t\t</UL>\r\n");
      out.write("\t</span>\r\n");
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
