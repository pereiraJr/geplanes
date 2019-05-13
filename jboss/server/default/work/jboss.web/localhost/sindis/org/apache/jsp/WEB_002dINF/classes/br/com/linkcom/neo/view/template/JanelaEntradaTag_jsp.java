package org.apache.jsp.WEB_002dINF.classes.br.com.linkcom.neo.view.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class JanelaEntradaTag_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(4);
    _jspx_dependants.add("/WEB-INF/tld/c.tld");
    _jspx_dependants.add("/WEB-INF/tld/neo.tld");
    _jspx_dependants.add("/WEB-INF/tld/combo.tld");
    _jspx_dependants.add("/WEB-INF/tld/template.tld");
  }

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
      out.write("<table width=\"100%\" align=\"center\" class=\"janelaEntrada\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_n_tabPanel_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction listenerTab(id,idx){\r\n");
      out.write("\t\tvar btn = $(\"a[editaraction]\");\r\n");
      out.write("\t\tif(btn.size() > 0){\r\n");
      out.write("\t\t\tvar url = btn.attr(\"href\");\r\n");
      out.write("\t\t\tif(url.indexOf('TABPANEL_'+id) > 0) {\r\n");
      out.write("\t\t\t\tvar split = url.split(\"?\");\r\n");
      out.write("\t\t\t\tvar action = split[0];\r\n");
      out.write("\t\t\t\tvar parameters = split[1].split(\"&\");\r\n");
      out.write("\t\t\t\tvar i = 0;\r\n");
      out.write("\t\t\t\tvar total = parameters.length;\r\n");
      out.write("\t\t\t\tfor(i=0; i<total;i++){\r\n");
      out.write("\t\t\t\t\tif(parameters[i].indexOf('TABPANEL_') >= 0){\r\n");
      out.write("\t\t\t\t\t\tparameters[i] = \"TABPANEL_\"+ id + \"=\"+idx;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tvar nurl = \"?\";\r\n");
      out.write("\t\t\t\tfor(i=0; i<total;i++){\r\n");
      out.write("\t\t\t\t\tnurl += parameters[i];\r\n");
      out.write("\t\t\t\t\tif(i != (total-1)){\r\n");
      out.write("\t\t\t\t\t\tnurl += \"&\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tbtn.each(function(){\r\n");
      out.write("\t\t\t\t\t$(this).attr(\"href\",nurl);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tbtn.each(function(){\r\n");
      out.write("\t\t\t\t\t$(this).attr(\"href\",url+\"&TABPANEL_\"+ id + \"=\"+idx);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_n_tabPanel_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:tabPanel
    br.com.linkcom.neo.view.TabPanelTag _jspx_th_n_tabPanel_0 = new br.com.linkcom.neo.view.TabPanelTag();
    _jspx_th_n_tabPanel_0.setJspContext(_jspx_page_context);
    _jspx_th_n_tabPanel_0.setId("janelaEntrada");
    _jspx_th_n_tabPanel_0.setOnSelectTab("listenerTab");
    _jspx_th_n_tabPanel_0.setJspBody(new JanelaEntradaTag_jspHelper( 0, _jspx_page_context, _jspx_th_n_tabPanel_0, null));
    _jspx_th_n_tabPanel_0.doTag();
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

  private class JanelaEntradaTag_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public JanelaEntradaTag_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_doBody_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
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
