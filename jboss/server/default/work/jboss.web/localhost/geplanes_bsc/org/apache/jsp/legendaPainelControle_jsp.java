package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class legendaPainelControle_jsp extends org.apache.jasper.runtime.HttpJspBase
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

 
	String app = request.getContextPath();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<link href=\"");
      out.print( app );
      out.write("/css/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body leftmargin=\"0\" topmargin=\"0\" style=\"padding:0px\" bgColor=\"#FFFFFF\" style=\"background-color: #FFFFFF;overflow:hidden;\">\r\n");
      out.write("\t\t<table class=\"fd_tela\" width=\"100%\" height=\"100%\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"fd_tela_titulo\" style=\"height: 20px;\" colspan=\"3\">Legenda - Faróis</td>\r\n");
      out.write("\t\t\t</tr>\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><img src=\"");
      out.print( app );
      out.write("/images/bola-verde.png\" alt=\"Verde\" title=\"Verde\"/></td>\r\n");
      out.write("\t\t\t\t<td>Verde</td>\r\n");
      out.write("\t\t\t\t<td><span class=\"desc11\">Meta cumprida em 100%.</span></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><img src=\"");
      out.print( app );
      out.write("/images/bola-amarela.png\" alt=\"Amarelo\" title=\"Amarelo\"/></td>\r\n");
      out.write("\t\t\t\t<td>Amarelo</td>\r\n");
      out.write("\t\t\t\t<td><span class=\"desc11\">Meta cumprida parcialmente, dentro do(s) limite(s) definido(s) pelo percentual de tolerância.</span></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><img src=\"");
      out.print( app );
      out.write("/images/bola-vermelha.png\" alt=\"Vermelho\" title=\"Vermelho\"/></td>\r\n");
      out.write("\t\t\t\t<td>Vermelho</td>\r\n");
      out.write("\t\t\t\t<td><span class=\"desc11\">Meta não cumprida.</span></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><img src=\"");
      out.print( app );
      out.write("/images/bola-branca.png\" alt=\"Branco\" title=\"Branco\"/></td>\r\n");
      out.write("\t\t\t\t<td>Branco</td>\r\n");
      out.write("\t\t\t\t<td><span class=\"desc11\">Indicador não cadastrado ou nenhum resultado lançado no período.</span></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><img src=\"");
      out.print( app );
      out.write("/images/bola-cinza.png\" alt=\"Cinza\" title=\"Cinza\"/></td>\r\n");
      out.write("\t\t\t\t<td>Cinza</td>\r\n");
      out.write("\t\t\t\t<td><span class=\"desc11\">Meta não aplicável ao período.</span></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
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
}
