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
		<style>
			.item{
				padding-left: 10px; 
				padding-bottom: 3px;
			}
		</style>
	</head>
	<body leftmargin="0" topmargin="0" style="padding:0px" bgColor="#FFFFFF" style="background-color: #FFFFFF" onload="inicializaCampos(${iniciativa.idxPerspectivaMapaEstrategico}, ${iniciativa.idxObjetivoMapaEstrategico}, ${iniciativa.idxIniciativa})">
		<n:form validateFunction="valida">
			<n:validation>	
			<table class="lookup_janela">
				<TR>
					<TD class="fd_tela_titulo" style="height: 20px;" >Plano de Ação</TD>
				</TR>
				<TR>
					<TD valign="top">
						<n:bean name="iniciativa">
							<t:property name="id" write="false" type="hidden" renderAs="single"/>
							<t:property name="descricao" write="false" type="hidden" renderAs="single"/>
							<t:property name="idxPerspectivaMapaEstrategico" write="false" type="hidden"/>
							<t:property name="idxObjetivoMapaEstrategico" write="false" type="hidden"/>
							<t:property name="idxIniciativa" write="false" type="hidden"/>							
							<t:janelaResultados>
								<c:choose>
									<c:when test="${showButton}">
										<t:detalhe name="listaPlanoAcao" labelnovalinha="Novo plano de ação" showBotaoNovaLinha="true" showBotaoRemover="true" id="planoAcao" onNewLine="configQuem(this)">
											<n:column header="O que">
												<t:property name="id" write="false" type="hidden" renderAs="single"/>
												<t:property name="status" write="false" type="hidden" renderAs="single"/>
												<t:property name="dtAtualizacaoStatus" write="false" type="hidden" renderAs="single"/>
												<t:property name="texto" 		rows="3" style="width:140px"/>
											</n:column>			   
											<t:property name="textoComo" 	rows="3" style="width:140px"/>
											<t:property name="textoPorque" 	rows="3" style="width:140px"/>
											<n:column header="Quem" style="width:150px">
												<t:property name="textoQuem"	rows="3" style="width:140px"/>
												<t:property name="usuario"		style="width:140px" itens="${listaUsuarios}" onChange="onChangeQuem(${index})"/>
											</n:column>
											<t:property name="dtPlano" style="width:72px"/>
											<n:column header="Quanto custa">
												<label>Planejado:</label>
												<t:property name="quantoP" style="width:140px"/>
												</br></br>
												<label>Realizado:</label>
												<t:property name="quantoR" style="width:140px"/>
											</n:column>
											<t:property name="textoComoMedir" rows="3" style="width:140px"/>
											<t:property name="descricaoStatus" type="hidden" write="true"/>
										</t:detalhe>
										<div align="right" style="padding-top:20px;padding-right:20px;">
											<n:submit url="/sgm/process/DistribuicaoPesosIndicadores" action="salvarPopUpPlanoAcao" class="botao_normal" parameters="unidadeGerencialID=${unidadeGerencialID}&objetivoMapaEstrategicoID=${objetivoMapaEstrategicoID}">Salvar</n:submit>
										</div>																			
									</c:when>
									<c:otherwise>
										<t:detalhe name="listaPlanoAcao" labelnovalinha="Novo plano de ação" showBotaoNovaLinha="false" showBotaoRemover="false">
											<n:column header="O que">
												<t:property name="id" write="false" type="hidden" renderAs="single"/>
												<t:property name="status" write="false" type="hidden" renderAs="single"/>
												<t:property name="dtAtualizacaoStatus" write="false" type="hidden" renderAs="single"/>
												<t:property name="texto" type="hidden" write="true"/>
											</n:column>			   
											<t:property name="textoComo" type="hidden" write="true"/>
											<t:property name="textoPorque" type="hidden" write="true"/>
											<n:column header="Quem">
												<t:property name="usuario" readonly="true" class="readonlyField"/>
												<t:property name="textoQuem"	rows="3" style="width:140px" readonly="true" class="readonlyField"/>
											</n:column>
											<t:property name="dtPlano" write="true" type="hidden" class="readonlyField"/>
											<n:column header="Quanto custa">
												<label>Planejado:</label>
												<t:property name="quantoP" write="true" type="hidden" class="readonlyField"/>
												</br></br>
												<label>Realizado:</label>
												<t:property name="quantoR" write="true" type="hidden" class="readonlyField"/>
											</n:column>
											<t:property name="textoComoMedir" rows="3" style="width:140px" class="readonlyField"/>
											<t:property name="descricaoStatus" type="hidden" write="true"/>
										</t:detalhe>									
									</c:otherwise>
								</c:choose>
							</t:janelaResultados>
						</n:bean>
					</TD>
				</TR>
			</table>
			</n:validation>
		</n:form>
	</body>
</html>

<script type="text/javascript">
	$(document).ready(function() {
		carregaQuem();
	});		
	
	function onChangeQuem(index){
		var comboUsuario = "[name='listaPlanoAcao["+index+"].usuario']";
		var textoQuem = "[name='listaPlanoAcao["+index+"].textoQuem']";
		var usuario = $(comboUsuario).val();
		var id = usuario.substring(usuario.indexOf("=")+1,usuario.indexOf("]"));
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
	}
	
	function configQuem(){
		var listaPlanoAcao = document.getElementById("planoAcao").rows;
		var index = listaPlanoAcao.length-2;
		var comboUsuario = "[name='listaPlanoAcao["+index+"].usuario']";
		var textoQuem = "[name='listaPlanoAcao["+index+"].textoQuem']";
		$(textoQuem).removeClass("required");	
		$(textoQuem).hide();
		$(comboUsuario).addClass("required");
	}
	
	function carregaQuem(){
		var listaPlanoAcao = document.getElementById("planoAcao").rows;
		if(listaPlanoAcao.length != 1){
			for(var i=0; i<listaPlanoAcao.length-1; i++){
				var textoQuem = "[name='listaPlanoAcao["+i+"].textoQuem']";
				var comboUsuario = "[name='listaPlanoAcao["+i+"].usuario']";
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
					$(comboUsuario).val("br.com.linkcom.sgm.beans.Usuario[id=0]");			
				}
			}
		}
	}
	function valida() {
		var listaPlanoAcao = document.getElementById("planoAcao").rows;
		if(listaPlanoAcao.length != 1){
			for(var i=0; i<listaPlanoAcao.length-1; i++){
				var comboUsuario = "[name='listaPlanoAcao["+i+"].usuario']";
				var usuario = $(comboUsuario).val();
				var textoQuem = "[name='listaPlanoAcao["+i+"].textoQuem']";
				var valorTextoQuem =  $(textoQuem).val();
				var id = usuario.substring(usuario.indexOf("=")+1,usuario.indexOf("]"));
				
				var msg = "";
				if(valorTextoQuem == "" && usuario == "<null>"){
					msg = "O campo Quem é obrigatório";
				}
				if(id==0){
					$(comboUsuario).val("<null>");
					if(valorTextoQuem == ""){
						msg = "O campo Quem é obrigatório";
					}
				}
				
				if(msg!=""){
					alert(msg);
					return false;
				}
			}
		}
		return true;
	}
	
	function inicializaCampos(idxPerspectivaMapaEstrategico, idxObjetivoMapaEstrategico, idxIniciativa) {
		if(${erroMsg == null}){
			var strLista = 'listaPerspectivaMapaEstrategico[' + idxPerspectivaMapaEstrategico + '].listaObjetivoMapaEstrategico[' + idxObjetivoMapaEstrategico + '].listaIniciativa[' + idxIniciativa + ']';
			var docOpener = window.opener.document;
		
			form['descricao'].value = docOpener.getElementsByName(strLista + '.descricao')[0].value;
		}
	}
	
</script>