<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="n" uri="neo"%>
<%@ taglib prefix="t" uri="template"%>
<%@ taglib prefix="f" tagdir="/WEB-INF/tags/"%>
<%@ taglib prefix="geplanes" uri="geplanes"%>

<t:listagem titulo="Gráfico de planejamento e auditoria" showNewLink="false" >
	<t:janelaFiltro>
		<input type="hidden" name="reload" value="" id="idReload">
		<t:tabelaFiltro showSubmit="false">
			<n:comboReloadGroup useAjax="true">
				<t:property name="planoGestao" style="width: 100px;"/>
				<n:output styleClass="desc11" value="Unidade Gerencial" />
				<n:panel>
					<f:unidadeGerencialInput name="unidadeGerencial" />
					&nbsp;<t:property name="incluirSubordinadas" />
				</n:panel>
			</n:comboReloadGroup>
			<n:submit action="filtrar" confirmationScript="validaFiltro()" style="margin-left: 850px;">Visualizar</n:submit>
		</t:tabelaFiltro>		
	</t:janelaFiltro>
	<div id="graficos">
		<div class="box box-primary">
			<div class="box-header with-border">
				<label>Planejamento estratégico</label>
			</div>
			<div class="box" align="left">
				<div style="float: left;width: 70%">
					<br/>
					<fieldset style="width: 45%;float: left">
						<legend>Metas</legend>
						<div id="metas" style="width: 100%"></div>
					</fieldset>
					<fieldset style="width: 45%;float: right">
						<legend>Planos de ação</legend>
						<div id="planos" style="float: right;width: 100%"></div>
					</fieldset>
				</div>
			</div>	
			<div style="float: right; width: 250px;"> 
				<div class="box-header"><label>Filtrar por perspectiva:</label>
				</div>
				<div class="form-group" style="margin-left: 10px;">
					<t:janelaFiltro>
						<t:tabelaFiltro showSubmit="false">
							<geplanes:checklist name="listaPerspectiva" inputOnClick="form.ACAO.value='filtrar';form.action='/geplanes_portal/sgm/process/GraficosDashboard';submitForm()" itens="${listaPerspectivaMapaEstrategico}" renderas="doubleline" label="" showLabel="false" columns="1" checked="checked"/>
						</t:tabelaFiltro>
					</t:janelaFiltro>
				</div>	
			</div>
		</div>
		<br/>
		<div class="box box-primary">
			<div class="box-header with-border">
				<label>Auditoria</label>
			</div>
			<div class="box" align="left">
				<div style="float: left;width: 70%">
					<br/>
					<fieldset style="width: 45%;float: left">
						<legend>Não Conformidades</legend>
						<div id="nconformidades" style="width: 100%"></div>
					</fieldset>
					<fieldset style="width: 45%;float: right">
						<legend>Tipo de ações</legend>
						<div id="tipoacoes" style="float: right;width: 100%"></div>
					</fieldset>
				</div>
			</div>	
			<div class="box-body" style="float: right; width: 250px;"> 
				<div class="box-header"><label>Filtrar origem:</label>
				</div>
				<t:janelaFiltro>
					<t:tabelaFiltro showSubmit="false">
						<geplanes:checklist name="listaOrigem" itens="${listaOrigem}" inputOnClick="form.ACAO.value='filtrar';form.action='/geplanes_portal/sgm/process/GraficosDashboard';submitForm()" renderas="doubleline" label="" showLabel="false" columns="1" />		
					</t:tabelaFiltro>
				</t:janelaFiltro>
			</div>
		</div>
	</div>
</t:listagem>

<style>

.nvd3.nv-noData {
    font-size: 10px;
    font-weight: 700;
}

</style>


<script language="javascript">
	function validaFiltro(){
		var valido = true;
		
		if(form['unidadeGerencial'].value == "<null>"){
			alert("Preencha o campo Unidade Gerencial.");
			valido = false;
		}

		return valido;
	}
	
	function updateMessages(){
		$("text").attr("x", "150");
	}

	$(document).ready(function(){
		if(${filtrou}){
			$("#graficos").show();
			var opts1={ 
				id:"metas",
				dados:${pizzaMeta.dados},
				width:300
			}; 
			$G.pizza(opts1);
			
			var opts2={ 
				id:"planos",
				dados:${pizzaPlanos.dados},
				width:300
			}; 
			$G.pizza(opts2);
			
			var opts3={ 
				id:"nconformidades",
				dados:${pizzaNConformidade.dados},
				width:300
			}; 
			$G.pizza(opts3);
			
			var opts4 = {
				id:"tipoacoes",
				dados:${pizzaTipoAcoes.dados},
				width:300
			}	
			$G.pizza(opts4);	
			
	 	}else{
	 		$("#graficos").hide();
	 	}
		
		if(${filtrou} && ${size} == 0){
			$('input[type=checkbox][name^="listaPerspectiva"]').each(function() {
				$(this).attr("checked","checked");
			});
		}
  	});
</script>
