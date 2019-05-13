package org.apache.jsp.WEB_002dINF.jsp.adm;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/gerenciaComunicado.js\"></script>\r\n");
      out.write("\t<script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t// -----------------------------------------------------------------------------\r\n");
      out.write("\t// Globals\r\n");
      out.write("\t// Major version of Flash required\r\n");
      out.write("\tvar requiredMajorVersion = 9;\r\n");
      out.write("\t// Minor version of Flash required\r\n");
      out.write("\tvar requiredMinorVersion = 0;\r\n");
      out.write("\t// Minor version of Flash required\r\n");
      out.write("\tvar requiredRevision = 124;\r\n");
      out.write("\t// -----------------------------------------------------------------------------\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t// Version check for the Flash Player that has the ability to start Player Product Install (6.0r65)\r\n");
      out.write("\tvar hasProductInstall = DetectFlashVer(6, 0, 65);\r\n");
      out.write("\t\r\n");
      out.write("\t// Version check based upon the values defined in globals\r\n");
      out.write("\tvar hasRequestedVersion = DetectFlashVer(requiredMajorVersion, requiredMinorVersion, requiredRevision);\r\n");
      out.write("\t\r\n");
      out.write("\tif ( hasProductInstall && !hasRequestedVersion ) {\r\n");
      out.write("\t\t// DO NOT MODIFY THE FOLLOWING FOUR LINES\r\n");
      out.write("\t\t// Location visited after installation is complete if installation is required\r\n");
      out.write("\t\tvar MMPlayerType = (isIE == true) ? \"ActiveX\" : \"PlugIn\";\r\n");
      out.write("\t\tvar MMredirectURL = window.location;\r\n");
      out.write("\t    document.title = document.title.slice(0, 47) + \" - Flash Player Installation\";\r\n");
      out.write("\t    var MMdoctitle = document.title;\r\n");
      out.write("\t\r\n");
      out.write("\t\tAC_FL_RunContent(\r\n");
      out.write("\t\t\t\"src\", \"playerProductInstall\",\r\n");
      out.write("\t\t\t\"FlashVars\", \"MMredirectURL=\"+MMredirectURL+'&MMplayerType='+MMPlayerType+'&MMdoctitle='+MMdoctitle+\"\",\r\n");
      out.write("\t\t\t\"width\", \"100%\",\r\n");
      out.write("\t\t\t\"height\", \"358\",\r\n");
      out.write("\t\t\t\"align\", \"middle\",\r\n");
      out.write("\t\t\t\"id\", \"GerenciaComunicado\",\r\n");
      out.write("\t\t\t\"quality\", \"high\",\r\n");
      out.write("\t\t\t\"bgcolor\", \"#869ca7\",\r\n");
      out.write("\t\t\t\"name\", \"GerenciaComunicado\",\r\n");
      out.write("\t\t\t\"allowScriptAccess\",\"sameDomain\",\r\n");
      out.write("\t\t\t\"type\", \"application/x-shockwave-flash\",\r\n");
      out.write("\t\t\t\"pluginspage\", \"http://www.adobe.com/go/getflashplayer\",\r\n");
      out.write("\t\t\t\"wmode\", \"transparent\"\r\n");
      out.write("\t\t);\r\n");
      out.write("\t} else if (hasRequestedVersion) {\r\n");
      out.write("\t\t// if we've detected an acceptable version\r\n");
      out.write("\t\t// embed the Flash Content SWF when all tests are passed\r\n");
      out.write("\t\tAC_FL_RunContent(\r\n");
      out.write("\t\t\t\t\"src\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/flex/GerenciaComunicado\",\r\n");
      out.write("\t\t\t\t\"width\", \"100%\",\r\n");
      out.write("\t\t\t\t\"height\", \"358\",\r\n");
      out.write("\t\t\t\t\"align\", \"middle\",\r\n");
      out.write("\t\t\t\t\"id\", \"GerenciaComunicado\",\r\n");
      out.write("\t\t\t\t\"quality\", \"high\",\r\n");
      out.write("\t\t\t\t\"bgcolor\", \"#869ca7\",\r\n");
      out.write("\t\t\t\t\"name\", \"GerenciaComunicado\",\r\n");
      out.write("\t\t\t\t\"allowScriptAccess\",\"sameDomain\",\r\n");
      out.write("\t\t\t\t\"type\", \"application/x-shockwave-flash\",\r\n");
      out.write("\t\t\t\t\"pluginspage\", \"http://www.adobe.com/go/getflashplayer\",\r\n");
      out.write("\t\t\t\t\"wmode\", \"transparent\"\r\n");
      out.write("\t\t);\r\n");
      out.write("\t  } else {  // flash is too old or we can't detect the plugin\r\n");
      out.write("\t    var alternateContent = 'Alternate HTML content should be placed here. '\r\n");
      out.write("\t  \t+ 'This content requires the Adobe Flash Player. '\r\n");
      out.write("\t   \t+ '<a href=http://www.adobe.com/go/getflash/>Get Flash</a>';\r\n");
      out.write("\t    document.write(alternateContent);  // insert non-flash content\r\n");
      out.write("\t  }\r\n");
      out.write("\t// -->\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<noscript>\r\n");
      out.write("\t  \t<object classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\"\r\n");
      out.write("\t\t\t\tid=\"GerenciaComunicado\" width=\"100%\" height=\"358\"\r\n");
      out.write("\t\t\t\tcodebase=\"http://fpdownload.macromedia.com/get/flashplayer/current/swflash.cab\">\r\n");
      out.write("\t\t\t\t<param name=\"movie\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/flex/GerenciaComunicado.swf\" />\r\n");
      out.write("\t\t\t\t<param name=\"quality\" value=\"high\" />\r\n");
      out.write("\t\t\t\t<param name=\"bgcolor\" value=\"#869ca7\" />\r\n");
      out.write("\t\t\t\t<param name=\"allowScriptAccess\" value=\"sameDomain\" />\r\n");
      out.write("\t\t\t\t<param name=\"wmode\" value=\"transparent\" />\r\n");
      out.write("\t\t\t\t<embed src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/flex/GerenciaComunicado.swf\" quality=\"high\" bgcolor=\"#869ca7\"\r\n");
      out.write("\t\t\t\t\twidth=\"100%\" height=\"358\" name=\"GerenciaComunicado\" align=\"middle\"\r\n");
      out.write("\t\t\t\t\tplay=\"true\"\r\n");
      out.write("\t\t\t\t\tloop=\"false\"\r\n");
      out.write("\t\t\t\t\tquality=\"high\"\r\n");
      out.write("\t\t\t\t\tallowScriptAccess=\"sameDomain\"\r\n");
      out.write("\t\t\t\t\ttype=\"application/x-shockwave-flash\"\r\n");
      out.write("\t\t\t\t\tpluginspage=\"http://www.adobe.com/go/getflashplayer\">\r\n");
      out.write("\t\t\t\t</embed>\r\n");
      out.write("\t\t</object>\r\n");
      out.write("\t</noscript>\r\n");
      out.write("</div>");
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
