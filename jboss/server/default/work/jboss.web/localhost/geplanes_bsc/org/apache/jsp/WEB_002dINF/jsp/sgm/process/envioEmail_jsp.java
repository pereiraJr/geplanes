package org.apache.jsp.WEB_002dINF.jsp.sgm.process;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.linkcom.sgm.controller.filtro.EnvioEmailFiltro;
import br.com.linkcom.neo.controller.crud.CrudController;

public final class envioEmail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script language=\"JavaScript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/tiny_mce/tiny_mce.js\"></script>\r\n");
      out.write("\r\n");
      //  t:tela
      br.com.linkcom.neo.view.template.TelaTag _jspx_th_t_tela_0 = new br.com.linkcom.neo.view.template.TelaTag();
      _jspx_th_t_tela_0.setJspContext(_jspx_page_context);
      _jspx_th_t_tela_0.setTitulo("Envio de e-mail");
      _jspx_th_t_tela_0.setFormEnctype("multipart/form-data");
      _jspx_th_t_tela_0.setJspBody(new envioEmail_jspHelper( 0, _jspx_page_context, _jspx_th_t_tela_0, null));
      _jspx_th_t_tela_0.doTag();
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\t/* Monta o campo \"E-mail\" com formatador HTML */\r\n");
      out.write("\ttinyMCE.init({\r\n");
      out.write("\t\tmode : \"none\", \r\n");
      out.write("\t\ttheme : \"advanced\",\r\n");
      out.write("\t\ttheme_advanced_buttons1 : \"bold,italic,underline,separator,strikethrough,justifyleft,justifycenter,justifyright, justifyfull,bullist,numlist,undo,redo,link,unlink,code,separator,fontselect,fontsizeselect\",\r\n");
      out.write("\t\ttheme_advanced_buttons2 : \"\",\r\n");
      out.write("\t\ttheme_advanced_buttons3 : \"\",\r\n");
      out.write("\t\ttheme_advanced_toolbar_location : \"top\",\r\n");
      out.write("\t\ttheme_advanced_toolbar_align : \"left\",\r\n");
      out.write("\t\ttheme_advanced_path_location : \"none\",\r\n");
      out.write("\t\tforce_br_newlines : true,\r\n");
      out.write("\t\textended_valid_elements : \"a[name|href|target|title|onclick],img[class|src|border=0|alt|title|hspace|vspace|width|height|align|onmouseover|onmouseout|name],hr[class|width|size|noshade],font[face|size|color|style],span[class|align|style]\"\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\ttinyMCE.execCommand(\"mceAddControl\", true, \"mensagem\");\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction validaFormulario(){\r\n");
      out.write("\t\ttinyMCE.triggerSave();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif($(\"input[name$=nome][name^=listaDestinatario]\").length == 0){\r\n");
      out.write("\t\t\talert(\"Favor adicionar pelo menos um destinatário.\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction openPopUpUsuarios(){\r\n");
      out.write("\t\twindow.open('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/util/crud/Usuario', 'ustv', 'scrollbars=yes,height=650,width=900,top=50,left=200,location=no,menubar=no,status=no,toolbar=no,resizable=yes');\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction clickNovoEmailDestinatario(){\r\n");
      out.write("\t\tvar novoEmail = form['novoEmail'].value;\r\n");
      out.write("\t\tif(novoEmail == \"\"){\r\n");
      out.write("\t\t\talert(\"Favor digitar um e-mail.\");\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tif(checkEmail(novoEmail)){\r\n");
      out.write("\t\t\t\tincluirDestinatario('<b>Usuário não cadastrado</b>',novoEmail);\r\n");
      out.write("\t\t\t\tform['novoEmail'].value = \"\";\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\talert(\"Favor digitar um e-mail válido.\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction incluirDestinatarios(usuarios){\r\n");
      out.write("\t\tfor(var i = 0; i < usuarios.length; i++){\r\n");
      out.write("\t\t\tvar usu = usuarios[i].split('|');\r\n");
      out.write("\t\t\tincluirDestinatario(usu[0], usu[1]);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction incluirDestinatario(nome,email){\r\n");
      out.write("\t\tdocument.getElementById('listaDestinatario').dataModel[0] = dataModelDestinatarios[0].replace(\"<null>\",nome).replace(\"</span>\",nome + \"</span>\");\r\n");
      out.write("\t\tdocument.getElementById('listaDestinatario').dataModel[1] = dataModelDestinatarios[1].replace(\"<null>\",email).replace(\"</span>\",email + \"</span>\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tnewLinelistaDestinatario();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tvar dataModelDestinatarios = [\r\n");
      out.write("\t\t\"<input type=\\\"hidden\\\" name=\\\"listaDestinatario[{index}].nome\\\" value=\\\"<null>\\\" /><span id=\\\"listaDestinatario[{index}].nome_value\\\"></span>\",\r\n");
      out.write("\t\t\"<input type=\\\"hidden\\\" name=\\\"listaDestinatario[{index}].email\\\" value=\\\"<null>\\\" /><span id=\\\"listaDestinatario[{index}].email_value\\\"></span>\",\r\n");
      out.write("\t\t\"<img src=\\\"../../images/ico_excluir.gif\\\" onclick=\\\"excluirLinhaPorNome(this.id,true);reindexFormPorNome(this.id, forms[0], 'listaDestinatario', true);\\\" id=\\\"button.excluir[table_id=listaDestinatario, indice={indexplus}]\\\" style=\\\"cursor:pointer;\\\" alt=\\\"Excluir\\\"/>\"\r\n");
      out.write("\t];\r\n");
      out.write("\t\r\n");
      out.write("\tfunction excluirTodosDestinatarios(){\r\n");
      out.write("\t\t$(\"img[id^=button.excluir][id*=listaDestinatario,]\").each(function(){\r\n");
      out.write("\t\t\t$(this).click();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction clickNovoEmailCc(){\r\n");
      out.write("\t\tvar novoEmail = form['novoEmail'].value;\r\n");
      out.write("\t\tif(novoEmail == \"\"){\r\n");
      out.write("\t\t\talert(\"Favor digitar um e-mail.\");\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tif(checkEmail(novoEmail)){\r\n");
      out.write("\t\t\t\tincluirCc('<b>Usuário não cadastrado</b>',novoEmail);\r\n");
      out.write("\t\t\t\tform['novoEmail'].value = \"\";\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\talert(\"Favor digitar um e-mail válido.\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction incluirCcs(usuarios){\r\n");
      out.write("\t\tfor(var i = 0; i < usuarios.length; i++){\r\n");
      out.write("\t\t\tvar usu = usuarios[i].split('|');\r\n");
      out.write("\t\t\tincluirCc(usu[0], usu[1]);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction incluirCc(nome,email){\r\n");
      out.write("\t\tdocument.getElementById('listaCc').dataModel[0] = dataModelCc[0].replace(\"<null>\",nome).replace(\"</span>\",nome + \"</span>\");\r\n");
      out.write("\t\tdocument.getElementById('listaCc').dataModel[1] = dataModelCc[1].replace(\"<null>\",email).replace(\"</span>\",email + \"</span>\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tnewLinelistaCc();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tvar dataModelCc = [\r\n");
      out.write("\t\t\"<input type=\\\"hidden\\\" name=\\\"listaCc[{index}].nome\\\" value=\\\"<null>\\\" /><span id=\\\"listaCc[{index}].nome_value\\\"></span>\",\r\n");
      out.write("\t\t\"<input type=\\\"hidden\\\" name=\\\"listaCc[{index}].email\\\" value=\\\"<null>\\\" /><span id=\\\"listaCc[{index}].email_value\\\"></span>\",\r\n");
      out.write("\t\t\"<img src=\\\"../../images/ico_excluir.gif\\\" onclick=\\\"excluirLinhaPorNome(this.id,true);reindexFormPorNome(this.id, forms[0], 'listaCc', true);\\\" id=\\\"button.excluir[table_id=listaCc, indice={indexplus}]\\\" style=\\\"cursor:pointer;\\\" alt=\\\"Excluir\\\"/>\"\r\n");
      out.write("\t];\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction excluirTodosCc(){\r\n");
      out.write("\t\t$(\"img[id^=button.excluir][id*=listaCc,]\").each(function(){\r\n");
      out.write("\t\t\t$(this).click();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction clickNovoEmailCco(){\r\n");
      out.write("\t\tvar novoEmail = form['novoEmail'].value;\r\n");
      out.write("\t\tif(novoEmail == \"\"){\r\n");
      out.write("\t\t\talert(\"Favor digitar um e-mail.\");\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tif(checkEmail(novoEmail)){\r\n");
      out.write("\t\t\t\tincluirCco('<b>Usuário não cadastrado</b>',novoEmail);\r\n");
      out.write("\t\t\t\tform['novoEmail'].value = \"\";\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\talert(\"Favor digitar um e-mail válido.\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction incluirCcos(usuarios){\r\n");
      out.write("\t\tfor(var i = 0; i < usuarios.length; i++){\r\n");
      out.write("\t\t\tvar usu = usuarios[i].split('|');\r\n");
      out.write("\t\t\tincluirCco(usu[0], usu[1]);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction incluirCco(nome,email){\r\n");
      out.write("\t\tdocument.getElementById('listaCco').dataModel[0] = dataModelCco[0].replace(\"<null>\",nome).replace(\"</span>\",nome + \"</span>\");\r\n");
      out.write("\t\tdocument.getElementById('listaCco').dataModel[1] = dataModelCco[1].replace(\"<null>\",email).replace(\"</span>\",email + \"</span>\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tnewLinelistaCco();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tvar dataModelCco = [\r\n");
      out.write("\t\t\"<input type=\\\"hidden\\\" name=\\\"listaCco[{index}].nome\\\" value=\\\"<null>\\\" /><span id=\\\"listaCco[{index}].nome_value\\\"></span>\",\r\n");
      out.write("\t\t\"<input type=\\\"hidden\\\" name=\\\"listaCco[{index}].email\\\" value=\\\"<null>\\\" /><span id=\\\"listaCco[{index}].email_value\\\"></span>\",\r\n");
      out.write("\t\t\"<img src=\\\"../../images/ico_excluir.gif\\\" onclick=\\\"excluirLinhaPorNome(this.id,true);reindexFormPorNome(this.id, forms[0], 'listaCco', true);\\\" id=\\\"button.excluir[table_id=listaCco, indice={indexplus}]\\\" style=\\\"cursor:pointer;\\\" alt=\\\"Excluir\\\"/>\"\r\n");
      out.write("\t];\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction excluirTodosCco(){\r\n");
      out.write("\t\t$(\"img[id^=button.excluir][id*=listaCco,]\").each(function(){\r\n");
      out.write("\t\t\t$(this).click();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
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

  private boolean _jspx_meth_n_panelGrid_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panelGrid
    br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_0 = new br.com.linkcom.neo.view.PanelGridTag();
    _jspx_th_n_panelGrid_0.setJspContext(_jspx_page_context);
    _jspx_th_n_panelGrid_0.setParent(_jspx_parent);
    _jspx_th_n_panelGrid_0.setColumns(new Integer(2));
    _jspx_th_n_panelGrid_0.setStyle("width:100%;");
    _jspx_th_n_panelGrid_0.setJspBody(new envioEmail_jspHelper( 2, _jspx_page_context, _jspx_th_n_panelGrid_0, null));
    _jspx_th_n_panelGrid_0.doTag();
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
    _jspx_th_t_propertyConfig_0.setMode("input");
    _jspx_th_t_propertyConfig_0.setShowLabel(new Boolean(true));
    _jspx_th_t_propertyConfig_0.setRenderAs("double");
    _jspx_th_t_propertyConfig_0.setJspBody(new envioEmail_jspHelper( 3, _jspx_page_context, _jspx_th_t_propertyConfig_0, null));
    _jspx_th_t_propertyConfig_0.doTag();
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
    _jspx_th_t_property_0.setName("remetente");
    _jspx_th_t_property_0.setDynamicAttribute(null, "style", new String("width: 400px;"));
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
    _jspx_th_t_property_1.setName("assunto");
    _jspx_th_t_property_1.setDynamicAttribute(null, "style", new String("width: 400px;"));
    _jspx_th_t_property_1.doTag();
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
    _jspx_th_t_property_2.setName("mensagem");
    _jspx_th_t_property_2.setDynamicAttribute(null, "style", new String("width: 700px; height: 250px;"));
    _jspx_th_t_property_2.setId("mensagem");
    _jspx_th_t_property_2.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_0 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_0.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_0.setParent(_jspx_parent);
    _jspx_th_n_panel_0.setColspan(new Integer(2));
    _jspx_th_n_panel_0.setJspBody(new envioEmail_jspHelper( 4, _jspx_page_context, _jspx_th_n_panel_0, null));
    _jspx_th_n_panel_0.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_1 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_1.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_1.setParent(_jspx_parent);
    _jspx_th_n_panel_1.setJspBody(new envioEmail_jspHelper( 5, _jspx_page_context, _jspx_th_n_panel_1, null));
    _jspx_th_n_panel_1.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panelGrid_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panelGrid
    br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_1 = new br.com.linkcom.neo.view.PanelGridTag();
    _jspx_th_n_panelGrid_1.setJspContext(_jspx_page_context);
    _jspx_th_n_panelGrid_1.setParent(_jspx_parent);
    _jspx_th_n_panelGrid_1.setColumns(new Integer(2));
    _jspx_th_n_panelGrid_1.setStyle("width:100%");
    _jspx_th_n_panelGrid_1.setJspBody(new envioEmail_jspHelper( 6, _jspx_page_context, _jspx_th_n_panelGrid_1, null));
    _jspx_th_n_panelGrid_1.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_2 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_2.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_2.setParent(_jspx_parent);
    _jspx_th_n_panel_2.setColspan(new Integer(2));
    _jspx_th_n_panel_2.setJspBody(new envioEmail_jspHelper( 7, _jspx_page_context, _jspx_th_n_panel_2, null));
    _jspx_th_n_panel_2.doTag();
    return false;
  }

  private boolean _jspx_meth_t_detalhe_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:detalhe
    br.com.linkcom.neo.view.template.DetalheTag _jspx_th_t_detalhe_0 = new br.com.linkcom.neo.view.template.DetalheTag();
    _jspx_th_t_detalhe_0.setJspContext(_jspx_page_context);
    _jspx_th_t_detalhe_0.setParent(_jspx_parent);
    _jspx_th_t_detalhe_0.setName("listaArquivo");
    _jspx_th_t_detalhe_0.setId("listaArquivo");
    _jspx_th_t_detalhe_0.setDynamicAttribute(null, "style", new String("width:100%"));
    _jspx_th_t_detalhe_0.setDynamicAttribute(null, "labelnovalinha", new String("Novo anexo"));
    _jspx_th_t_detalhe_0.setJspBody(new envioEmail_jspHelper( 8, _jspx_page_context, _jspx_th_t_detalhe_0, null));
    _jspx_th_t_detalhe_0.doTag();
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
    _jspx_th_t_property_3.setName("anexo");
    _jspx_th_t_property_3.setLabel("Arquivo");
    _jspx_th_t_property_3.setShowLabel(new Boolean(false));
    _jspx_th_t_property_3.setDynamicAttribute(null, "size", new String("100"));
    _jspx_th_t_property_3.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_3 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_3.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_3.setParent(_jspx_parent);
    _jspx_th_n_panel_3.setDynamicAttribute(null, "style", new String("width: 70px;"));
    _jspx_th_n_panel_3.setDynamicAttribute(null, "valign", new String("top"));
    _jspx_th_n_panel_3.setJspBody(new envioEmail_jspHelper( 10, _jspx_page_context, _jspx_th_n_panel_3, null));
    _jspx_th_n_panel_3.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_5 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_5.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_5.setParent(_jspx_parent);
    _jspx_th_n_panel_5.setJspBody(new envioEmail_jspHelper( 13, _jspx_page_context, _jspx_th_n_panel_5, null));
    _jspx_th_n_panel_5.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panelGrid_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panelGrid
    br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_3 = new br.com.linkcom.neo.view.PanelGridTag();
    _jspx_th_n_panelGrid_3.setJspContext(_jspx_page_context);
    _jspx_th_n_panelGrid_3.setParent(_jspx_parent);
    _jspx_th_n_panelGrid_3.setColumns(new Integer(2));
    _jspx_th_n_panelGrid_3.setStyle("width:100%");
    _jspx_th_n_panelGrid_3.setJspBody(new envioEmail_jspHelper( 14, _jspx_page_context, _jspx_th_n_panelGrid_3, null));
    _jspx_th_n_panelGrid_3.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_6 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_6.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_6.setParent(_jspx_parent);
    _jspx_th_n_panel_6.setColspan(new Integer(2));
    _jspx_th_n_panel_6.setDynamicAttribute(null, "style", new String("text-align:right;"));
    _jspx_th_n_panel_6.setJspBody(new envioEmail_jspHelper( 15, _jspx_page_context, _jspx_th_n_panel_6, null));
    _jspx_th_n_panel_6.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_7 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_7.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_7.setParent(_jspx_parent);
    _jspx_th_n_panel_7.setColspan(new Integer(2));
    _jspx_th_n_panel_7.setJspBody(new envioEmail_jspHelper( 16, _jspx_page_context, _jspx_th_n_panel_7, null));
    _jspx_th_n_panel_7.doTag();
    return false;
  }

  private boolean _jspx_meth_t_detalhe_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:detalhe
    br.com.linkcom.neo.view.template.DetalheTag _jspx_th_t_detalhe_1 = new br.com.linkcom.neo.view.template.DetalheTag();
    _jspx_th_t_detalhe_1.setJspContext(_jspx_page_context);
    _jspx_th_t_detalhe_1.setParent(_jspx_parent);
    _jspx_th_t_detalhe_1.setName("listaDestinatario");
    _jspx_th_t_detalhe_1.setShowBotaoNovaLinha(new Boolean(false));
    _jspx_th_t_detalhe_1.setId("listaDestinatario");
    _jspx_th_t_detalhe_1.setDynamicAttribute(null, "style", new String("width:100%"));
    _jspx_th_t_detalhe_1.setJspBody(new envioEmail_jspHelper( 17, _jspx_page_context, _jspx_th_t_detalhe_1, null));
    _jspx_th_t_detalhe_1.doTag();
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
    _jspx_th_t_property_4.setName("nome");
    _jspx_th_t_property_4.setType(new String("hidden"));
    _jspx_th_t_property_4.setWrite(new Boolean(true));
    _jspx_th_t_property_4.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_5 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_5.setJspContext(_jspx_page_context);
    _jspx_th_t_property_5.setParent(_jspx_parent);
    _jspx_th_t_property_5.setName("email");
    _jspx_th_t_property_5.setType(new String("hidden"));
    _jspx_th_t_property_5.setWrite(new Boolean(true));
    _jspx_th_t_property_5.setLabel("E-mail");
    _jspx_th_t_property_5.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_8 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_8.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_8.setParent(_jspx_parent);
    _jspx_th_n_panel_8.setJspBody(new envioEmail_jspHelper( 18, _jspx_page_context, _jspx_th_n_panel_8, null));
    _jspx_th_n_panel_8.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panelGrid_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panelGrid
    br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_4 = new br.com.linkcom.neo.view.PanelGridTag();
    _jspx_th_n_panelGrid_4.setJspContext(_jspx_page_context);
    _jspx_th_n_panelGrid_4.setParent(_jspx_parent);
    _jspx_th_n_panelGrid_4.setColumns(new Integer(2));
    _jspx_th_n_panelGrid_4.setStyle("width:100%");
    _jspx_th_n_panelGrid_4.setJspBody(new envioEmail_jspHelper( 19, _jspx_page_context, _jspx_th_n_panelGrid_4, null));
    _jspx_th_n_panelGrid_4.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_9 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_9.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_9.setParent(_jspx_parent);
    _jspx_th_n_panel_9.setColspan(new Integer(2));
    _jspx_th_n_panel_9.setDynamicAttribute(null, "style", new String("text-align:right;"));
    _jspx_th_n_panel_9.setJspBody(new envioEmail_jspHelper( 20, _jspx_page_context, _jspx_th_n_panel_9, null));
    _jspx_th_n_panel_9.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_10 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_10.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_10.setParent(_jspx_parent);
    _jspx_th_n_panel_10.setColspan(new Integer(2));
    _jspx_th_n_panel_10.setJspBody(new envioEmail_jspHelper( 21, _jspx_page_context, _jspx_th_n_panel_10, null));
    _jspx_th_n_panel_10.doTag();
    return false;
  }

  private boolean _jspx_meth_t_detalhe_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:detalhe
    br.com.linkcom.neo.view.template.DetalheTag _jspx_th_t_detalhe_2 = new br.com.linkcom.neo.view.template.DetalheTag();
    _jspx_th_t_detalhe_2.setJspContext(_jspx_page_context);
    _jspx_th_t_detalhe_2.setParent(_jspx_parent);
    _jspx_th_t_detalhe_2.setName("listaCc");
    _jspx_th_t_detalhe_2.setShowBotaoNovaLinha(new Boolean(false));
    _jspx_th_t_detalhe_2.setId("listaCc");
    _jspx_th_t_detalhe_2.setDynamicAttribute(null, "style", new String("width:100%"));
    _jspx_th_t_detalhe_2.setJspBody(new envioEmail_jspHelper( 22, _jspx_page_context, _jspx_th_t_detalhe_2, null));
    _jspx_th_t_detalhe_2.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_6 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_6.setJspContext(_jspx_page_context);
    _jspx_th_t_property_6.setParent(_jspx_parent);
    _jspx_th_t_property_6.setName("nome");
    _jspx_th_t_property_6.setType(new String("hidden"));
    _jspx_th_t_property_6.setWrite(new Boolean(true));
    _jspx_th_t_property_6.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_7 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_7.setJspContext(_jspx_page_context);
    _jspx_th_t_property_7.setParent(_jspx_parent);
    _jspx_th_t_property_7.setName("email");
    _jspx_th_t_property_7.setType(new String("hidden"));
    _jspx_th_t_property_7.setWrite(new Boolean(true));
    _jspx_th_t_property_7.setLabel("E-mail");
    _jspx_th_t_property_7.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_11(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_11 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_11.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_11.setParent(_jspx_parent);
    _jspx_th_n_panel_11.setJspBody(new envioEmail_jspHelper( 23, _jspx_page_context, _jspx_th_n_panel_11, null));
    _jspx_th_n_panel_11.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panelGrid_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panelGrid
    br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_5 = new br.com.linkcom.neo.view.PanelGridTag();
    _jspx_th_n_panelGrid_5.setJspContext(_jspx_page_context);
    _jspx_th_n_panelGrid_5.setParent(_jspx_parent);
    _jspx_th_n_panelGrid_5.setColumns(new Integer(2));
    _jspx_th_n_panelGrid_5.setStyle("width:100%");
    _jspx_th_n_panelGrid_5.setJspBody(new envioEmail_jspHelper( 24, _jspx_page_context, _jspx_th_n_panelGrid_5, null));
    _jspx_th_n_panelGrid_5.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_12(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_12 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_12.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_12.setParent(_jspx_parent);
    _jspx_th_n_panel_12.setColspan(new Integer(2));
    _jspx_th_n_panel_12.setDynamicAttribute(null, "style", new String("text-align:right;"));
    _jspx_th_n_panel_12.setJspBody(new envioEmail_jspHelper( 25, _jspx_page_context, _jspx_th_n_panel_12, null));
    _jspx_th_n_panel_12.doTag();
    return false;
  }

  private boolean _jspx_meth_n_panel_13(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  n:panel
    br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_13 = new br.com.linkcom.neo.view.PanelTag();
    _jspx_th_n_panel_13.setJspContext(_jspx_page_context);
    _jspx_th_n_panel_13.setParent(_jspx_parent);
    _jspx_th_n_panel_13.setColspan(new Integer(2));
    _jspx_th_n_panel_13.setJspBody(new envioEmail_jspHelper( 26, _jspx_page_context, _jspx_th_n_panel_13, null));
    _jspx_th_n_panel_13.doTag();
    return false;
  }

  private boolean _jspx_meth_t_detalhe_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:detalhe
    br.com.linkcom.neo.view.template.DetalheTag _jspx_th_t_detalhe_3 = new br.com.linkcom.neo.view.template.DetalheTag();
    _jspx_th_t_detalhe_3.setJspContext(_jspx_page_context);
    _jspx_th_t_detalhe_3.setParent(_jspx_parent);
    _jspx_th_t_detalhe_3.setName("listaCco");
    _jspx_th_t_detalhe_3.setShowBotaoNovaLinha(new Boolean(false));
    _jspx_th_t_detalhe_3.setId("listaCco");
    _jspx_th_t_detalhe_3.setDynamicAttribute(null, "style", new String("width:100%"));
    _jspx_th_t_detalhe_3.setJspBody(new envioEmail_jspHelper( 27, _jspx_page_context, _jspx_th_t_detalhe_3, null));
    _jspx_th_t_detalhe_3.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_8 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_8.setJspContext(_jspx_page_context);
    _jspx_th_t_property_8.setParent(_jspx_parent);
    _jspx_th_t_property_8.setName("nome");
    _jspx_th_t_property_8.setType(new String("hidden"));
    _jspx_th_t_property_8.setWrite(new Boolean(true));
    _jspx_th_t_property_8.doTag();
    return false;
  }

  private boolean _jspx_meth_t_property_9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:property
    br.com.linkcom.neo.view.template.PropertyTag _jspx_th_t_property_9 = new br.com.linkcom.neo.view.template.PropertyTag();
    _jspx_th_t_property_9.setJspContext(_jspx_page_context);
    _jspx_th_t_property_9.setParent(_jspx_parent);
    _jspx_th_t_property_9.setName("email");
    _jspx_th_t_property_9.setType(new String("hidden"));
    _jspx_th_t_property_9.setWrite(new Boolean(true));
    _jspx_th_t_property_9.setLabel("E-mail");
    _jspx_th_t_property_9.doTag();
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
    _jspx_th_n_submit_0.setDynamicAttribute(null, "class", new String("botao_normal"));
    _jspx_th_n_submit_0.setAction("enviarMailling");
    _jspx_th_n_submit_0.setConfirmationScript("validaFormulario()");
    _jspx_th_n_submit_0.setJspBody(new envioEmail_jspHelper( 28, _jspx_page_context, _jspx_th_n_submit_0, null));
    _jspx_th_n_submit_0.doTag();
    return false;
  }

  private class envioEmail_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public envioEmail_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
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
      //  n:bean
      br.com.linkcom.neo.view.BeanTag _jspx_th_n_bean_0 = new br.com.linkcom.neo.view.BeanTag();
      _jspx_th_n_bean_0.setJspContext(_jspx_page_context);
      _jspx_th_n_bean_0.setParent(_jspx_parent);
      _jspx_th_n_bean_0.setName("filtro");
      _jspx_th_n_bean_0.setValueType(EnvioEmailFiltro.class);
      _jspx_th_n_bean_0.setJspBody(new envioEmail_jspHelper( 1, _jspx_page_context, _jspx_th_n_bean_0, null));
      _jspx_th_n_bean_0.doTag();
      out.write('\r');
      out.write('\n');
      return;
    }
    public void invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_n_panelGrid_0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_n_panel_1(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      //  n:panelGrid
      br.com.linkcom.neo.view.PanelGridTag _jspx_th_n_panelGrid_2 = new br.com.linkcom.neo.view.PanelGridTag();
      _jspx_th_n_panelGrid_2.setJspContext(_jspx_page_context);
      _jspx_th_n_panelGrid_2.setParent(_jspx_parent);
      _jspx_th_n_panelGrid_2.setColumns(new Integer(2));
      _jspx_th_n_panelGrid_2.setStyle("width: 100%;");
      _jspx_th_n_panelGrid_2.setJspBody(new envioEmail_jspHelper( 9, _jspx_page_context, _jspx_th_n_panelGrid_2, null));
      _jspx_th_n_panelGrid_2.doTag();
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      if (_jspx_meth_n_panel_5(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      if (_jspx_meth_n_panel_8(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      if (_jspx_meth_n_panel_11(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t<div style=\"text-align: right\">\r\n");
      out.write("\t\t\t<br>\t\t\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_n_submit_0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t");
      return;
    }
    public boolean invoke2( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_t_propertyConfig_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t");
      return false;
    }
    public boolean invoke3( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_property_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_property_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_t_property_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_n_panel_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t");
      return false;
    }
    public boolean invoke4( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<BR><BR>\r\n");
      out.write("\t\t\t\t");
      return false;
    }
    public boolean invoke5( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t<BR><BR>\r\n");
      out.write("\t\t\t<table class=\"fd_tela\" width=\"98%\" align=\"center\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class='fd_tela_titulo'>\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<b>Anexos</b>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"1\">\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_n_panelGrid_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<BR><BR>\r\n");
      out.write("\t\t");
      return false;
    }
    public boolean invoke6( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke7( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_detalhe_0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke8( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_3(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      return false;
    }
    public void invoke9( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_n_panel_3(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      //  n:panel
      br.com.linkcom.neo.view.PanelTag _jspx_th_n_panel_4 = new br.com.linkcom.neo.view.PanelTag();
      _jspx_th_n_panel_4.setJspContext(_jspx_page_context);
      _jspx_th_n_panel_4.setParent(_jspx_parent);
      _jspx_th_n_panel_4.setJspBody(new envioEmail_jspHelper( 11, _jspx_page_context, _jspx_th_n_panel_4, null));
      _jspx_th_n_panel_4.doTag();
      out.write("\r\n");
      out.write("\t\t");
      return;
    }
    public boolean invoke10( JspWriter out ) 
      throws Throwable
    {
      out.write("<span class=\"desc\">NOVO E-MAIL</span>");
      return false;
    }
    public void invoke11( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t<input name=\"novoEmail\" type=\"text\" style=\"width: 300px;\"/>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<button class=\"botao_normal\" onclick=\"clickNovoEmailDestinatario()\" type=\"button\">incluir destinatário</button>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<button class=\"botao_normal\" onclick=\"clickNovoEmailCc()\" type=\"button\">incluir cc</button>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<button class=\"botao_normal\" onclick=\"clickNovoEmailCco()\" type=\"button\">incluir cco</button>\r\n");
      out.write("\t\t\t\t");
      //  n:hasAuthorization
      br.com.linkcom.neo.view.HasAuthorizationTag _jspx_th_n_hasAuthorization_0 = new br.com.linkcom.neo.view.HasAuthorizationTag();
      _jspx_th_n_hasAuthorization_0.setJspContext(_jspx_page_context);
      _jspx_th_n_hasAuthorization_0.setParent(_jspx_parent);
      _jspx_th_n_hasAuthorization_0.setUrl("/util/crud/Usuario");
      _jspx_th_n_hasAuthorization_0.setAction(CrudController.LISTAGEM);
      _jspx_th_n_hasAuthorization_0.setJspBody(new envioEmail_jspHelper( 12, _jspx_page_context, _jspx_th_n_hasAuthorization_0, null));
      _jspx_th_n_hasAuthorization_0.doTag();
      out.write("\r\n");
      out.write("\t\t\t");
      return;
    }
    public void invoke12( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<button class=\"botao_normal\" onclick=\"openPopUpUsuarios()\" type=\"button\">incluir usuário(s)</button>\r\n");
      out.write("\t\t\t\t");
      return;
    }
    public boolean invoke13( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t<BR>\r\n");
      out.write("\t\t\t<table class=\"fd_tela\" width=\"98%\" align=\"center\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class='fd_tela_titulo'>\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<b>Destinatários</b>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"1\">\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_n_panelGrid_3(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t");
      return false;
    }
    public boolean invoke14( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_6(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_7(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke15( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"botao_normal\" onclick=\"excluirTodosDestinatarios()\" type=\"button\">excluir todos destinatários</button>\r\n");
      out.write("\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke16( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_detalhe_1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke17( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_4(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_5(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke18( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t<BR><BR>\r\n");
      out.write("\t\t\t<table class=\"fd_tela\" width=\"98%\" align=\"center\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class='fd_tela_titulo'>\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<b>CC</b>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"1\">\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_n_panelGrid_4(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t");
      return false;
    }
    public boolean invoke19( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_9(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_10(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke20( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"botao_normal\" onclick=\"excluirTodosCc()\" type=\"button\">excluir todos cc</button>\r\n");
      out.write("\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke21( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_detalhe_2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke22( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_6(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_7(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke23( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t<BR><BR>\r\n");
      out.write("\t\t\t<table class=\"fd_tela\" width=\"98%\" align=\"center\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class='fd_tela_titulo'>\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<b>CCo</b>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"1\">\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_n_panelGrid_5(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t");
      return false;
    }
    public boolean invoke24( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_12(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_n_panel_13(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke25( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<button class=\"botao_normal\" onclick=\"excluirTodosCco()\" type=\"button\">excluir todos cco</button>\r\n");
      out.write("\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke26( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_detalhe_3(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke27( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_8(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_t_property_9(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      return false;
    }
    public boolean invoke28( JspWriter out ) 
      throws Throwable
    {
      out.write("Enviar e-mail");
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
          case 11:
            invoke11( out );
            break;
          case 12:
            invoke12( out );
            break;
          case 13:
            invoke13( out );
            break;
          case 14:
            invoke14( out );
            break;
          case 15:
            invoke15( out );
            break;
          case 16:
            invoke16( out );
            break;
          case 17:
            invoke17( out );
            break;
          case 18:
            invoke18( out );
            break;
          case 19:
            invoke19( out );
            break;
          case 20:
            invoke20( out );
            break;
          case 21:
            invoke21( out );
            break;
          case 22:
            invoke22( out );
            break;
          case 23:
            invoke23( out );
            break;
          case 24:
            invoke24( out );
            break;
          case 25:
            invoke25( out );
            break;
          case 26:
            invoke26( out );
            break;
          case 27:
            invoke27( out );
            break;
          case 28:
            invoke28( out );
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
