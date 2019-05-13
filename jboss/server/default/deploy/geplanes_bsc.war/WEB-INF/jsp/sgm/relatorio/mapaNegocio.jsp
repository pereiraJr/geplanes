<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="n" uri="neo"%>
<%@ taglib prefix="t" uri="template"%>
<%@ taglib prefix="f" tagdir="/WEB-INF/tags"%>

<t:listagem titulo="Mapa do Negócio" showNewLink="false" showdeletelink="false">
  <t:janelaFiltro>
  	<input type="hidden" name="reload" value="" id="idReload">
	<t:tabelaFiltro showSubmit="false">
		 <t:property name="planoGestao"	style="width: 100px;"/>
		   <n:output styleClass="desc11" value="Unidade Gerencial"/>
			 <n:panel>
				 <f:unidadeGerencialInput name="unidadeGerencial" estiloclasse="required"/>
			 </n:panel>
	  </t:tabelaFiltro>		
	</t:janelaFiltro>
	<table align="right">
		<tr>
			<td>
				<n:submit action="gerar" class="botao_PDF" validate="true" parameters="formato=PDF">Gerar relatório PDF</n:submit>
				&nbsp;
				<n:submit action="gerar" class="botao_XLS" validate="true" parameters="formato=XLS">Gerar relatório XLS</n:submit>
				&nbsp;
				<n:submit action="gerar" class="botao_DOC" validate="true" parameters="formato=DOC">Gerar relatório DOC</n:submit>
			</td>
		</tr>
	</table>    
</t:listagem>