package org.apache.jsp.WEB_002dINF.jsp.sgm.process;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sobreLinkCom_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_th_t_tela_0.setTitulo("Sobre a LinkCom");
    _jspx_th_t_tela_0.setJspBody(new sobreLinkCom_jspHelper( 0, _jspx_page_context, _jspx_th_t_tela_0, null));
    _jspx_th_t_tela_0.doTag();
    return false;
  }

  private class sobreLinkCom_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public sobreLinkCom_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
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
      out.write("\t\t<span class=\"txt_grande\">A EMPRESA</span>\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\tA <b> LinkCom &#45; Soluções em Tecnologia da Informação &#45; </b> dedica-se  ao desenvolvimento de sistemas convencionais e aplicações na Internet para uso em empresas atuantes nos mais diversos ramos de atividade.\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<p>Há mais de uma década no mercado, a empresa tem uma equipe de profissionais altamente qualificados e com vasta experiência em:\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<LI>Fornecimento de sistemas nas modalidades <b>Fábrica de Software</b> e <b>Outsourcing</b>.</LI>\r\n");
      out.write("\t\t\t<LI><b>Consultoria</b> em análise da viabilidade da aplicação de soluções em T.I., codificação do sistema, implantação das soluções, suporte tecnológico e apoio na expansão dos sistemas.</LI>\r\n");
      out.write("\t\t\t<LI><b>Coaching</b> e <b>mentoring</b> da equipe de T.I. dos clientes.</LI>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<span class=\"txt_grande\">Nossos Diferenciais</span>\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<LI>Processo de desenvolvimento otimizado gerando rapidez e custo reduzido para nossos clientes</LI>\r\n");
      out.write("\t\t\t<LI>Equipe altamente especializada e de baixo turn over</LI>\r\n");
      out.write("\t\t\t<LI>Longa experiência na integração com a equipe de T.I. dos clientes</LI>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<span class=\"txt_grande\">Metodologia de Desenvolvimento</span>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<p>A <b>LinkCom &#45; Soluções em Tecnologia da Informação &#45; </b> utiliza moderna metodologia para o desenvolvimento de software, viabilizando uma grande interação com usuários, baixos custos, escalabilidade e qualidade dentro das exigências do mercado.\r\n");
      out.write("\t\t<p><b>Metodologia AGIL</b>: baseada no levantamento de requisitos através da <span style=\"text-decoration: underline\">descrição de casos de uso</span> adotado pela UML, gerenciamento de projetos conceituado no PMI e desenvolvimento de software progressivo e iterativo espelhado no RUP.\r\n");
      out.write("\t\t<p>Além de definir as tecnologias mais adequadas para o seu projeto, a <b> LinkCom &#45; Soluções em Tecnologia da Informação &#45;</b> compromete-se em aplicá-las de forma inteligente, para que elas efetivamente gerem resultados para o seu negócio. em diversas frentes de desenvolvimento e banco de dados.\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<span class=\"txt_grande\">Padronização dos Processos</span>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<p><b>A LinkCom &#45; Soluções em Tecnologia da Informação &#45;</b> está em processo avançado de Certificação MPS.Br nível G, visando à otimização dos processo da empresa e ao aprimoramento em desenvolvimento de sistemas.\r\n");
      out.write("\t\t<p><b>Melhoria de Processo do Software Brasileiro</b>: iniciativa envolvendo universidades, grupos de pesquisa e empresas. O MPS.Br é um modelo de referência para a qualificação e a certificação de empresas em processos de melhoria de qualidade dentro de uma realidade mais específica da cultura e do mercado brasileiro.  \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<span class=\"txt_grande\">Nossa missão</span>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<p>Auxiliar nossos clientes na gestão de seus negócios oferecendo conhecimento e serviços de tecnologia da informação com ética, profissionalismo e qualidade.\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<br><br>\r\n");
      out.write("\t\t<span class=\"txt_grande\">Nossos valores</span>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<LI><b>Comprometimento</b>: É enxergar, além dos interesses pessoais, os interesses dos outros e da instituição. É ser flexível para alcançar a solução ótima para as partes. É agir com qualidade. É assumir o compromisso com a construção de um mundo melhor.  </LI>\r\n");
      out.write("\t\t\t<LI><b>Transparência</b>: É confiabilidade. É a prática responsável e de mão dupla da verdade e da integridade, que implica na coerência entre o que se pensa, e o que se faz, considerando os pontos de vista dos outros. </LI>\r\n");
      out.write("\t\t\t<LI><b>Cooperação</b>: É trabalhar junto, em uma saudável relação de interdependência, em prol de objetivos comuns e benefícios mútuos. É fortalecer o espírito de equipe e de solidariedade e instigar nossa capacidade de compartilhar com desprendimento informações, conhecimentos e vivências.</LI>\r\n");
      out.write("\t\t\t<LI><b>Sigilo</b>: É zelar pelo nosso cliente. É tratar com o máximo respeito e profissionalismo a informações para as quais geramos soluções.</LI>\r\n");
      out.write("\t\t\t<LI><b>Inovação</b>: É fazer diferente. É desenvolver a capacidade de imaginar o que não existe. É questionar a rotina e os hábitos. É aprender a conviver com o desconhecido, o diferente, o surpreendente e o novo. É transformar o sonho em realidade.</LI>\r\n");
      out.write("\t\t</ul>\r\n");
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
