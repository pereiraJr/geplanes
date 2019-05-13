$G.linha = function(opts, json){
	this.defaultOpts = {
		nvd3: true,
		exibirLegenda: true,
		guiaIterativo: true,
		eixoX: {
			exibir: true,
			label: "", 
			formato: $G.constantes.formato.NUMERICO 
		},
		eixoY: {
			exibir: true,
			label: "",
			formato: $G.constantes.formato.NUMERICO 
		}
	};
	
	//implementacao do gráfico
	this.fnImplementacao = function(opts){
		var fnTooltipContent = opts.tooltipContent || function (graph) {
	             console.log(graph);
	             return "<h3>" + graph.series[0].key + "</h3>" + 
	             	'<p>' +  graph.point.y + ',' + graph.point.x + '</p>';
		};
		//inicializa o gráfico
		var grafico = nv.models.lineChart()
	             .margin({left: 100})  //Adjust chart margins to give the x-axis some breathing room.
	             .useInteractiveGuideline(opts.guiaInterativo)  //We want nice looking tooltips and a guideline!
	             .showLegend(opts.exibirLegenda)       //Show the legend, allowing users to turn on/off line series.
	             .showXAxis(opts.eixoX.exibir)        //Show the y-axis
	             .showYAxis(opts.eixoY.exibir)        //Show the x-axis
	             .tooltipContent(fnTooltipContent)
	             .noData(opts.msgSemDados);
		if(opts.pointSize != null)
			grafico.pointSize(opts.pointSize); 
		
//		if(opts.height) grafico.height(opts.height);
		
		
		grafico.xAxis     //Chart x-axis settings
		     .axisLabel(opts.eixoX.label)
		     .tickFormat( opts.eixoX.formato )
		     .tickValues(opts.eixoX.tickValues)
		     ;
		
		if(opts.eixoY.forceY){
			grafico.forceY(opts.eixoY.forceY);
		}
		
	  	grafico.yAxis     //Chart y-axis settings
	      	 .axisLabel(opts.eixoY.label)
		     .tickFormat( opts.eixoY.formato )
		     .tickValues(opts.eixoY.tickValues);
	  	
	  	if(opts.eixoX.girarLabels !=null){
			grafico.xAxis.staggerLabels(false).rotateLabels(opts.eixoX.girarLabels);
		}
	  	
	  	if(opts.margin!=null) grafico.margin(opts.margin);
	  	
     	return grafico;
	};
	
	
	hideLines(opts);
	
//	opts.afterRender = function(){hideLines(opts);}
     		
	return $G.configurarGrafico.call(this, opts, json);
};

function hideLines(opts){
	var style = document.createElement('style');
	style.type = 'text/css';
	
	html="";
	for(var i=0; i<opts.dados.length; i++){
		var dado = opts.dados[i];
		if(dado.hideLine){
			html+='#'+opts.id+' g.nv-scatter g.nv-series-'+i+' path.nv-point{fill-opacity: 1;stroke-opacity: 1;} #'+opts.id+' g.nv-series-'+i+' path.nv-line{stroke-opacity: 0;display:none}';		
		}
	}
	style.innerHTML = html;
	document.getElementsByTagName('head')[0].appendChild(style);
}
		
		
	