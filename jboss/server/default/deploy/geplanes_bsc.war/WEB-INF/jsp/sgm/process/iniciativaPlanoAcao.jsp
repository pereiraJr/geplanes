<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="n" uri="neo"%>
<%@ taglib prefix="t" uri="template"%>
<%@ taglib prefix="f" tagdir="/WEB-INF/tags/"%>


<t:listagem titulo="Planos de Ação das Iniciativas" showNewLink="false">
	<t:janelaFiltro>
		<input type="hidden" name="reload" value="" id="idReload">
		<t:tabelaFiltro>
			<n:comboReloadGroup useAjax="true">
				<t:property name="planoGestao" style="width: 100px;"/>
				<n:output styleClass="desc11" value="Unidade Gerencial" />
				<n:panel>
					<f:unidadeGerencialInput name="unidadeGerencial" onchange="carregaPerspectivas()"/>
					&nbsp;<t:property name="incluirSubordinadas" />
				</n:panel>
				<t:property name="visualizarPlanoAcao" style="width:70%;" onchange="showHideCampos(this); filtrar()"/>
				<t:property name="perspectivaMapaEstrategico" id="perspectivaMapaEstrategico" itens="perspectivaMapaEstrategicoService.findByUnidadeGerencialThroughMapaEstrategico(unidadeGerencial,true)" style="width:70%;" onchange="carregaObjetivosEstrategicos()"/>
				<t:property name="objetivoMapaEstrategico" id="objetivoMapaEstrategico" itens="objetivoMapaEstrategicoService.findByUnidadeGerencialPerspectivaThroughMapaEstrategico(unidadeGerencial,perspectivaMapaEstrategico)" style="width:70%;" onchange="carregaIniciativas()"/>
				<t:property name="iniciativa" id="iniciativa" itens="iniciativaService.findByUnidadeGerencialObjetivoEstrategico(unidadeGerencial, objetivoMapaEstrategico)" style="width:70%;" />
				<t:property name="numero" id="numero" style="width:70%; text-align:left;"/>
				<t:property name="descricao" id="descricao" style="width:70%;"/>
				<n:panelGrid columns="1" style="width:101%;margin-left:-5px;" colspan="1">
					<t:property name="usuario" id="usuarioFiltro" itens= "usuarioService.findResponsaveisByUg(unidadeGerencial)" style="width:70%;" onchange="carregaResponsavel()"/>
					<t:property name="textoQuem" id="textoQuemFiltro" style="width:70%;" placeholder="Responsável"/>
				</n:panelGrid>
			</n:comboReloadGroup>
			<%--
			<t:property name="expirado" trueFalseNullLabels="Sim,Não,"/>
			<t:property name="listaStatus" size="3" includeBlank="false" type="SELECT_MANY" itens="mapaStatus"/>
			--%>
		</t:tabelaFiltro>
		
		<t:propertyConfig showLabel="true" renderAs="double">			
			<c:if test="${!empty filtro.planoGestao && filtrou}">
				<n:panel>				
					<br>
					<t:propertyConfig showLabel="false" >
						<n:dataGrid property="listaPlanoAcao" var="planoAcao" headerStyleClass="txt_tit" bodyStyleClasses="txt_l1, txt_l2" styleClass="fd_tabela1">
							<n:column header="">
								<t:property name="anomalia" type="hidden"/>
								<t:property name="acaoPreventiva" type="hidden"/>
								<t:property name="iniciativa" type="hidden"/>
							</n:column>
							
							<n:column header="U.G." printWhen="${isIniciativa}">
								<t:property name="unidadeGerencial" type="hidden" write="true" label="U.G." id="ug"/>
								<t:property name="id" type="hidden" showLabel="false"/>
								<t:property name="dtAtualizacaoStatus" mode="input" type="hidden" write="false"/>
							</n:column>
							
							<c:if test="${isAnomalia}">
								<n:column header="Número">
									<t:property name="anomalia.sequencial" label="Número" printWhen="${isAnomalia}"/>
									<t:property name="anomalia.id" type="hidden" label=""/>
								</n:column>
							</c:if>
							<t:property name="anomalia.ugResponsavel.sigla" label="Setor responsável pelo tratamento" printWhen="${isAnomalia}"/>
							<t:property name="anomalia.descricao" label="Descrição" printWhen="${isAnomalia}"/>

							<c:if test="${isAcaoPreventiva}">
								<n:column header="Número">
									<t:property name="acaoPreventiva.sequencial" label="Número" printWhen="${isAcaoPreventiva}"/>
									<t:property name="acaoPreventiva.id" type="hidden" label=""/>
								</n:column>
							</c:if>
							
							<t:property name="acaoPreventiva.ugRegistro.sigla" label="Setor de registro" printWhen="${isAcaoPreventiva}"/>
							<t:property name="acaoPreventiva.descricao" label="Descrição" printWhen="${isAcaoPreventiva}"/>
							
							<t:property name="iniciativa.objetivoMapaEstrategico" mode="output" printWhen="${isIniciativa}"/>
							<t:property name="texto" type="hidden" write="true" />
							<t:property name="textoComo" type="hidden" write="true" />
							<t:property name="textoPorque" type="hidden" write="true" />	
							<n:column header="Quem">
								<t:property name="usuario" type="hidden" write="true"/>											
								<t:property name="textoQuem" type="hidden" write="true"/>
							</n:column>
							<t:property name="dtPlano" mode="input" type="hidden" write="true"/>	
							<n:column header="Quanto custa">
								<label>Planejado:</label>
								<t:property name="quantoP" write="true" type="hidden" class="readonlyField"/>
								</br></br>
								<label>Realizado:</label>
								<t:property name="quantoR" mode="input" write="true" style="width: 100%;"/>
							</n:column>						
							<t:property name="textoComoMedir" type="hidden" write="true"class="readonlyField" rows="3"/>
							<n:column header="Status">
								<c:choose>
									<c:when test="${USUARIOADMIN}">
											<t:property name="status" mode="input" includeBlank="false"/>																					
									</c:when>
									<c:otherwise>
										<c:choose>
											<c:when test="${planoAcao.status.name == 'CONCLUIDO'}">											
												<t:property name="status" mode="input" type="hidden" write="true"/>
											</c:when>
											<c:otherwise>
												<c:choose>
													<c:when test="${planoAcao.podeEditarStatus}">
														<t:property name="status" mode="input" includeBlank="false"/>
													</c:when>
													<c:otherwise>
														<t:property name="status" mode="input" type="hidden" write="true"/>
													</c:otherwise>
												</c:choose>
											</c:otherwise>
										</c:choose>
									</c:otherwise>
								</c:choose>
								<n:panel></br></n:panel>
								&nbsp;<t:property name="descricaoDtAtualizacaoStatus" mode="output"/>
							</n:column>
							<c:if test="${isAnomalia}">
								<n:column header="Ação">
										<img src="${ctx}/images/icone-direita.png" border="0" onclick="redirecionaTelaAnomalia(${index})" onmouseover='Tip("Acessar anomalia")'>
								</n:column>
							</c:if>
							
							<c:if test="${isAcaoPreventiva}">
								<n:column header="Ação">
									<img src="${ctx}/images/icone-direita.png" border="0" onclick="redirecionaTelaAcaoPreventiva(${index})" onmouseover='Tip("Acessar ação preventiva")'>	
								</n:column>
							</c:if>
							
						</n:dataGrid>
					</t:propertyConfig>
				</n:panel>				
			</c:if>			
		</t:propertyConfig>		
	</t:janelaFiltro>
	<c:if test="${!empty filtro.listaPlanoAcao}">
		<table align="right">
			<tr>
				<td>
					<n:submit action="salvar" class="botao_normal" validate="true">Salvar</n:submit>
				</td>
			</tr>
		</table> 
	</c:if>
</t:listagem>


<script language="javascript">
	$(document).ready(function() {	
		escondeCampos();
		carregaResponsavel();
		showHideCampos(form['visualizarPlanoAcao']);
	});	
		
	function escondeCampos(){
		var textoQuem = $("#textoQuemFiltro");
		$("label[for='textoQuemFiltro']").hide();
		$(textoQuem).hide();
	}
	
	function carregaResponsavel(){
		var textoQuem = $("#textoQuemFiltro");
		var usuario= form['usuario'].value;
		var id = usuario.substring(usuario.indexOf("=")+1,usuario.indexOf("]"));
		if(id != "" && id==0){
			textoQuem.show();
			$("label[for='responsável']").hide();
		}else{
			textoQuem.val("");
			$("label[for='textoQuemFiltro']").hide();
			textoQuem.hide();
		}
	}
	
	function carregaPerspectivas() {
		setTimeout('form[\'perspectivaMapaEstrategico\'].loadItens()',1);
		setTimeout('form[\'usuario\'].loadItens()',1);
	}
	
	function carregaObjetivosEstrategicos() {
		setTimeout('form[\'objetivoMapaEstrategico\'].loadItens()',1);
	}
		
	function carregaIniciativas() {
		setTimeout('form[\'iniciativa\'].loadItens()',1);
	}	
	
	function showHideCampos(el){
		var perspectiva = $("#perspectivaMapaEstrategico");
		var iniciativa = $("#iniciativa");
		var objetivo = $("#objetivoMapaEstrategico");
		var numero = $("#numero");
		var descricao = $("#descricao");
		
		var labelPerspectiva = $("label[for='perspectivaMapaEstrategico']");
		var labelIniciativa = $("label[for='iniciativa']");
		var labelObjetivo = $("label[for='objetivoMapaEstrategico']");
		var labelNumero = $("label[for='numero']");
		var labelDescricao = $("label[for='descricao']");
		
		if(el != "<null>"){
			if(el.value == "INICIATIVAS"){
				perspectiva.parent().parent().show();
				labelPerspectiva.parent().parent().show();
				iniciativa.parent().parent().show();
				labelIniciativa.parent().parent().show();
				objetivo.parent().parent().show();
				labelObjetivo.parent().parent().show();
				
				numero.parent().parent().hide();
				labelNumero.parent().parent().hide();
				descricao.parent().parent().hide();
				labelDescricao.parent().parent().hide();
			}else if(el.value == "ACAO_PREVENTIVA"){
				numero.parent().parent().show();
				labelNumero.parent().parent().show();
				descricao.parent().parent().show();
				labelDescricao.parent().parent().show();
		
				perspectiva.parent().parent().hide();
				labelPerspectiva.parent().parent().hide();
				iniciativa.parent().parent().hide();
				labelIniciativa.parent().parent().hide();
				objetivo.parent().parent().hide();
				labelObjetivo.parent().parent().hide();
			}else if(el.value == "TRATAMENTO_ANOMALIA"){
				numero.parent().parent().show();
				labelNumero.parent().parent().show();
				descricao.parent().parent().show();
				labelDescricao.parent().parent().show();
		
				perspectiva.parent().parent().hide();
				labelPerspectiva.parent().parent().hide();
				iniciativa.parent().parent().hide();
				labelIniciativa.parent().parent().hide();
				objetivo.parent().parent().hide();
				labelObjetivo.parent().parent().hide();			
			}else{
				numero.parent().parent().hide();
				labelNumero.parent().parent().hide();
				descricao.parent().parent().hide();
				labelDescricao.parent().parent().hide();
		
				perspectiva.parent().parent().hide();
				labelPerspectiva.parent().parent().hide();
				iniciativa.parent().parent().hide();
				labelIniciativa.parent().parent().hide();
				objetivo.parent().parent().hide();
				labelObjetivo.parent().parent().hide();
			}
		}else{
			numero.parent().parent().hide();
			labelNumero.parent().parent().hide();
			descricao.parent().parent().hide();
			labelDescricao.parent().parent().hide();
	
			perspectiva.parent().parent().hide();
			labelPerspectiva.parent().parent().hide();
			iniciativa.parent().parent().hide();
			labelIniciativa.parent().parent().hide();
			objetivo.parent().parent().hide();
			labelObjetivo.parent().parent().hide();
		}
	}
	
	function redirecionaTelaAnomalia(index){
		if(form["listaPlanoAcao["+index+"].anomalia.id"] != undefined){
			var id = form["listaPlanoAcao["+index+"].anomalia.id"].value;
			window.location = "${ctx}/sgm/crud/Anomalia?ACAO=editar&id="+id;
		}
	}
	
	function redirecionaTelaAcaoPreventiva(index){
		if(form["listaPlanoAcao["+index+"].acaoPreventiva.id"] != undefined){
			var id = form["listaPlanoAcao["+index+"].acaoPreventiva.id"].value;
			window.location = "${ctx}/sgm/crud/AcaoPreventiva?ACAO=editar&id="+id;
		}
	}
	
	function filtrar(){
		if(${filtrou}){
			doFilter();
		}
	}
	
</script>
