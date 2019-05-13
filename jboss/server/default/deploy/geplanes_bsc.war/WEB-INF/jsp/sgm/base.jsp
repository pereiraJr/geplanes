<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="n" uri="neo"%>
<%@ taglib prefix="t" uri="template"%>

<html>
	<head>
		<n:head/>
		<script language="JavaScript" src="${ctx}/javascript/ajquery.js"></script>
		<script language="JavaScript" src="${ctx}/javascript/jquery.maskedinput-1.1.1.pack.js"></script>
		<script language="JavaScript" src="${ctx}/javascript/dimensions.pack.js"></script>
		<script language="JavaScript" src="${ctx}/javascript/dimmer.js"></script>
		<script language="JavaScript" src="${ctx}/javascript/treetable.js"></script>
		<script language="JavaScript" src="${ctx}/javascript/GeplanesUtil.js"></script>
		<script language="JavaScript" src="${ctx}/javascript/thickbox-compressed.js"></script>
		<script language="JavaScript" src="${ctx}/javascript/jquery.bgiframe.min.js"></script>
		<script language="JavaScript" src="${ctx}/javascript/jquery.autocomplete.js"></script>
		<script language="JavaScript" src="${ctx}/javascript/jquery.maskedinput-1.1.1.js"></script>
		<script language="JavaScript" src="${ctx}/javascript/jquery.ajaxQueue.js"></script>
		<script language="JavaScript" src="${ctx}/javascript/akModal.js"></script>
		<!-- LKGraficos -->
		<link rel="stylesheet" type="text/css" href="${ctx}/LKGraficos/libs/nvd3/nv.d3.min.css">
	    <link rel="stylesheet" type="text/css" href="${ctx}/LKGraficos/graficos.css">
		<!-- LKGraficos -->
		<!-- LKGraficos -->
		<script src="${ctx}/LKGraficos/libs/jspdf/jspdf.debug.js" type="text/javascript"></script>
		<script src="${ctx}/LKGraficos/libs/jspdf/png.js" type="text/javascript"></script>
		<script src="${ctx}/LKGraficos/libs/jspdf/zlib.js" type="text/javascript"></script>
		<script src="${ctx}/LKGraficos/libs/html2canvas/html2canvas.js" type="text/javascript"></script>
		<script src="${ctx}/LKGraficos/libs/d3/d3.min.js" charset="utf-8"></script>
		<script src="${ctx}/LKGraficos/libs/d3/pt-BR.js" charset="utf-8"></script>
	    <script src="${ctx}/LKGraficos/libs/nvd3/nv.d3.js" charset="utf-8"></script>
	    <script src="${ctx}/LKGraficos/libs/doT/doT.js" charset="utf-8"></script>
	    <script src="${ctx}/LKGraficos/libs/just-gage/raphael-2.1.4.min.js" charset="utf-8"></script>
	    <script src="${ctx}/LKGraficos/libs/just-gage/justgage-1.1.0.min.js" charset="utf-8"></script>
	    <script src="${ctx}/LKGraficos/libs/print/print.js" charset="utf-8"></script>
	    <script src="${ctx}/LKGraficos/js/G.js"> </script>
	    <script src="${ctx}/LKGraficos/js/G.pizza.js"></script>
	    <script src="${ctx}/LKGraficos/js/G.linha.js"></script>
	    <script src="${ctx}/LKGraficos/js/G.multi.js"></script>
	    <script src="${ctx}/LKGraficos/js/G.multibar.js"></script>
	    <script src="${ctx}/LKGraficos/js/G.linhaMaisColuna.js"></script>
	    <!-- LKGraficos -->				
	</head>
	<body>
	<%-- 
	<div id=loadmsg>
		<span class="message">Recarregando os dados da tela...</span>
	</div>	
	--%>
	<script language="JavaScript" src="${app}/tooltip/wz_tooltip.js"></script>
	<TABLE class="tabelaBase base_tabelabase" align="center">
			<TR>
				<TD style="height: 82px;">
				<TABLE class="tabelaBase" style="width: 1000px;">
						<TR>
							<TD rowspan="2" class="base_logo" 
								onclick="window.location='${ctx}/sgm/Index'"
								style="cursor: pointer;" >&nbsp;</TD>
							<TD class="base_user">
								<SPAN class="txt_normal">${USER.nome}</SPAN>
							</TD>
						</TR>
						<TR>
							<TD class="base_menu"valign="top" align="right">
							 <div class="menuGeplanes" onmouseover="esconderTabela()" onmouseout="esconderTabela();">
							   <n:menu menupath="/WEB-INF/menu.xml"/></div>
							</TD>
						</TR>
					</TABLE> 		
				</TD>
			</TR>
			<TR>
				<TD class="base_conteudo">
					<div align="center">
						<n:messages/>
					</div>
					<jsp:include page="${bodyPage}" />
				</TD>
			</TR>
			<TR>
				<TD class="base_baixo" valign="middle"><a href="http://www.linkcom.com.br" target="blank"><IMG src="${ctx}/images/ico_linkcom.jpg"></a></TD>
			</TR>
		</TABLE>
	</body>
</html>