<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="n" uri="neo"%>
<%@ taglib prefix="t" uri="template"%>
<%@ taglib prefix="f" tagdir="/WEB-INF/tags/"%>


<t:listagem titulo="Listagem de Indicadores por Objetivo Estrat�gico" showNewLink="false">
	<t:janelaFiltro>
		<t:tabelaFiltro showSubmit="false">
			<t:property name="planoGestao" style="width: 100px;" />
			<t:property name="objetivoEstrategico" style="width: 600px;"/>
		</t:tabelaFiltro>
	</t:janelaFiltro>
	<table align="right">
		<tr>
			<td>
				<n:submit action="gerar" class="botao_PDF" validate="true" parameters="formato=PDF">Gerar relat�rio PDF</n:submit>
				&nbsp;
				<n:submit action="gerar" class="botao_XLS" validate="true" parameters="formato=XLS">Gerar relat�rio XLS</n:submit>
				&nbsp;
				<n:submit action="gerar" class="botao_DOC" validate="true" parameters="formato=DOC">Gerar relat�rio DOC</n:submit>
			</td>
		</tr>
	</table>  
</t:listagem>