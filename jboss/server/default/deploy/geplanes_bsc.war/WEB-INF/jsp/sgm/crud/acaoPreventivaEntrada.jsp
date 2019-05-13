<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="n" uri="neo"%>
<%@ taglib prefix="t" uri="template"%>
<%@ taglib prefix="f" tagdir="/WEB-INF/tags/"%>

<c:if test="${podeConsultarAcaoPreventiva}">
    <style>.form_filtro_value{text-align:left;vertical-align:top;}</style>
	<t:entrada titulo="TRATAMENTO DE AÇÕES PREVENTIVAS" showSaveLink="${podeEditarAcaoPreventiva || podeEncerrarAcaoPreventiva}" >
	    <span style="display: none">
			<t:property name="id" write="false" type="hidden" />				
			<t:property name="acompanhamentoIndicador" mode="input" type="hidden" />
			<t:property name="status" mode="input" type="hidden"/>
	    </span>
		<t:janelaEntrada showSubmit="false">
		<c:choose>
			<c:when test="${podeEditarAcaoPreventiva}">
				<t:tabelaEntrada>
					<c:if test="${acaoPreventiva.id != null}">
						<t:property name="sequencial" type="hidden" write="true"/>
					</c:if>
					<c:if test="${!empty idUgOrigem or !empty acaoPreventiva.ugRegistro.id}">
						<t:property name="planoGestao" type="hidden" write="true"/>				
						<t:property name="ugRegistro" disabled="disabled" 	style="width: 150px" />
						<t:property name="ugRegistro" type="hidden" label=" "	style="width: 150px" />
					</c:if>
					<c:if test="${empty idUgOrigem and empty acaoPreventiva.ugRegistro.id}">
						<t:property name="planoGestao" style="width: 100px;"/>				
						<n:output styleClass="desc10bold" value="Setor de registro"/>
						<n:panel>
							<f:unidadeGerencialInput name="ugRegistro" estiloclasse="required"/>
						</n:panel>
					</c:if>
					<t:property name="dataAbertura"	style="width: 100px" type="hidden" write="true"/>
					<c:if test="${acaoPreventiva.id != null}">
						<c:choose>
							<c:when test="${podeEncerrarAcaoPreventiva}">
								<t:property name="dataEncerramento"	style="width: 72px" />
							</c:when>
							<c:otherwise>
								<t:property name="dataEncerramento"	style="width: 72px" type="hidden" write="true"/>
							</c:otherwise>
						</c:choose>					
					</c:if>
					<t:property name="tipo"/>
					<t:property name="origem"/>
					<t:property name="descricao" 				rows="8" cols="100"/>
					<t:property name="observacoes" 				rows="8" cols="100"/>
				</t:tabelaEntrada>
				<t:detalhe name="planosAcao" id="planosAcao" labelnovalinha="Novo plano de ação" showBotaoNovaLinha="true" showBotaoRemover="true" onNewLine="configQuem(this)">
					<n:column header="O que">
						<t:property name="id" write="false" type="hidden" renderAs="single"/>
						<t:property name="dtAtualizacaoStatus" write="false" type="hidden" renderAs="single"/>
						<t:property name="texto" 		rows="3" style="width:140px"/>
					</n:column>			   
					<t:property name="textoComo" 	rows="3" style="width:140px"/>
					<t:property name="textoPorque" 	rows="3" style="width:140px"/>
					<n:column header="Quem">
						<t:property name="usuario" style="width:140px" itens="${listaUsuarios}" onChange="onChangeQuem(${index})"/>
						<t:property name="textoQuem" rows="3" style="width:140px"/>
					</n:column>
					<t:property name="dtPlano" style="width:72px"/>
					<n:column header="Quanto custa">
						<label>Planejado:</label>
						<t:property name="quantoP" style="width:100px"/>
						</br></br>
						<label>Realizado:</label>
						<t:property name="quantoR" style="width:100px"/>
					</n:column>		
					<t:property name="textoComoMedir" rows="3" style="width:140px"/>
					<n:column header="Status">
						<t:property name="status" includeBlank="false"/>
						<br>
						<t:property name="descricaoDtAtualizacaoStatus" mode="output"/>
					</n:column>
				</t:detalhe>				
			</c:when>
			<c:otherwise>
				<t:tabelaEntrada>
						<c:choose>
							<c:when test="${acaoPreventiva.id != null}">
								<t:property name="sequencial" type="hidden" write="true"/>
							</c:when>
							<c:otherwise>						
							</c:otherwise>
						</c:choose>			
						<t:property name="planoGestao" 				type="hidden" write="true" />				
						<t:property name="ugRegistro" 				write="true" type="hidden" 	style="width: 150px" />
						<t:property name="dataAbertura"				type="hidden" write="true"	style="width: 100px"/>
						<c:if test="${acaoPreventiva.id != null}">
							<c:choose>
								<c:when test="${podeEncerrarAcaoPreventiva}">
									<t:property name="dataEncerramento"	style="width: 100px" />
								</c:when>
								<c:otherwise>
									<t:property name="dataEncerramento"	style="width: 100px" type="hidden" write="true"/>
								</c:otherwise>
							</c:choose>						
						</c:if>
						<t:property name="tipo" 					write="true" type="hidden"	style="width: 150px"/>
						<t:property name="origem" 					write="true" type="hidden"	style="width: 150px"/>
						<t:property name="descricao" 				rows="8" cols="100" label="Descrição da acaoPreventiva" type="hidden" write="true"/>
						<t:property name="observacoes" 				rows="8" cols="100" type="hidden" write="true"/>
				</t:tabelaEntrada>
				<t:detalhe name="planosAcao" id="planosAcao" showBotaoNovaLinha="false" showBotaoRemover="false">
					<n:column header="O que">
						<t:property name="id" write="false" type="hidden" renderAs="single"/>
						<t:property name="dtAtualizacaoStatus" write="false" type="hidden" renderAs="single"/>
						<t:property name="texto" rows="3" style="width:140px" readonly="true" class="readonlyField"/>
					</n:column>
					<t:property name="textoComo" 	rows="3" style="width:140px" readonly="true" class="readonlyField"/>
					<t:property name="textoPorque" 	rows="3" style="width:140px" readonly="true" class="readonlyField"/>
					<n:column header="Quem">
						<t:property name="usuario" readonly="true" class="readonlyField"/>
						
						<t:property name="textoQuem"	rows="3" style="width:140px" readonly="true" class="readonlyField"/>
					</n:column>
					<t:property name="dtPlano" write="true" type="hidden" class="readonlyField"/>
					<t:property name="quantoP" write="true" type="hidden" class="readonlyField"/>
					<t:property name="quantoR" write="true" type="hidden" class="readonlyField"/>
					<t:property name="textoComoMedir" rows="3" style="width:140px" class="readonlyField"/>
					<t:property name="status" write="true" type="hidden" class="readonlyField"/>							
				</t:detalhe>				
			</c:otherwise>
		</c:choose>
		<c:if test="${acaoPreventiva.id != null}">
			<jsp:include page="/WEB-INF/jsp/sgm/crud/acaoPreventivaCausaTratamento.jsp" />
		</c:if>
		</t:janelaEntrada>
		<table class="form_filtro_pesquisar">
			<tr>
				<td>
					<c:if test="${!empty acaoPreventiva.id}">
						<n:submit class="botao_normal" action="gerar" url="/sgm/report/AcaoPreventiva" parameters="${acaoPreventiva}" validate="true">imprimir</n:submit>
						&nbsp;
					</c:if>
				</td>
			</tr>
		</table>
	</t:entrada>
</c:if>

<script type="text/javascript">
	$(document).ready(function() {
		carregaQuem();
	});		
	
	function onChangeQuem(index){
		var usuario = form["planosAcao["+index+"].usuario"].value;
		
		if(usuario != "<null>"){
			var id = usuario.substring(usuario.indexOf("=")+1,usuario.indexOf("]"));
			var textoQuem = "[name='planosAcao["+index+"].textoQuem']";
			if(id==0){
				$(textoQuem).show();
				$(textoQuem).addClass("required");
				$(comboUsuario).removeClass("required");
			}else{
				$(textoQuem).val("");
				$(textoQuem).hide();
				$(textoQuem).removeClass("required");
				$(comboUsuario).addClass("required");
			}
		}else{
			$(textoQuem).val("");
			$(textoQuem).hide();
			$(textoQuem).removeClass("required");
			$(comboUsuario).addClass("required");
		}
	}
	
	function configQuem(){
		var listaPlanoAcao = document.getElementById("planosAcao").rows;
		var index = listaPlanoAcao.length-2;
		var comboUsuario = "[name='planosAcao["+index+"].usuario']";
		var textoQuem = "[name='planosAcao["+index+"].textoQuem']";
		$(textoQuem).removeClass("required");	
		$(textoQuem).hide();
		$(comboUsuario).addClass("required");
	}
	
	function carregaQuem(){
		var listaPlanoAcao = document.getElementById("planosAcao").rows;
		if(listaPlanoAcao.length != 1){
			for(var i=0; i<listaPlanoAcao.length-1; i++){
				var textoQuem = "[name='planosAcao["+i+"].textoQuem']";
				var comboUsuario = "[name='planosAcao["+i+"].usuario']";
				var valorCombo = $(comboUsuario).val();
				var valorTextoQuem =  $(textoQuem).val();
				
				if(valorTextoQuem == ""){
					$(comboUsuario).show();
					$(comboUsuario).addClass("required");
					$(textoQuem).removeClass("required");
					$(textoQuem).hide();
				}else{
					$(textoQuem).show();
					$(textoQuem).addClass("required");
					$(comboUsuario).removeClass("required");				
				}
			}
		}
	}
	
	function validateForm(){
		var listaPlanoAcao = document.getElementById("planosAcao").rows;
		var usuario;
		var id;
		var textoQuem;
		var msg = "";
		
		if(listaPlanoAcao.length != 1){
			for(var i=0; i<listaPlanoAcao.length-1; i++){
				usuario = form["planosAcao["+i+"].usuario"].value;
				if(usuario != "<null>"){
					id = usuario.substring(usuario.indexOf("=")+1,usuario.indexOf("]"));
				
					if(id == 0){
						textoQuem = form["planosAcao["+i+"].textoQuem"].value;
						if(textoQuem == ""){
							msg += "O campo Quem é obrigatório.\n";
						}
					}
				}else{
					msg += "O campo Quem é obrigatório.\n";
				}
			}
		}
		
		if(msg != ""){
			alert(msg);
			return false;
		}
		
		return true;
	}
</script>