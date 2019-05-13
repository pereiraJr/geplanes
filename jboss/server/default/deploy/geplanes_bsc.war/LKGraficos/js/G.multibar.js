$G.multiBar = function(opts, json){
	
	var ticks = opts.ticksEixoX;
	
	this.defaultOpts = {
		nvd3: true,
		exibirLegenda: true,
		guiaIterativo: true,
		eixoX: {
			exibir: true,
//			label: "Eixo X"//, 
			//formato: $G.constantes.formato.NUMERICO 
		},
		eixoY: {
			exibir: true,
//			label: "Eixo Y",
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
		var grafico = nv.models.multiBarChart()
//             .margin({left: 80})  //Adjust chart margins to give the x-axis some breathing room.
             .showLegend(opts.exibirLegenda)       //Show the legend, allowing users to turn on/off line series.
             .showXAxis(opts.eixoX.exibir)        //Show the y-axis
             .showYAxis(opts.eixoY.exibir)        //Show the x-axis
             .duration(500)
 			 .reduceXTicks(false)
 			 .noData(opts.msgSemDados)
 			 .staggerLabels(true);
		grafico.tooltipContent(fnTooltipContent);
//		grafico.legendLeftAxisHint("(esquerda)")
//				.legendRightAxisHint("(direita)");
		
		grafico.xAxis     //Chart x-axis settings
		     .axisLabel(opts.eixoX.label)
		     .tickFormat( function(i){return ticks[i];} );
		
	  	grafico.yAxis     //Chart y-axis settings
	      	 .axisLabel(opts.eixoY.label)
		     .tickFormat( d3.format(opts.eixoY.formato) );
		     
		 if(opts.eixoX.girarLabels !=null){
			grafico.xAxis.staggerLabels(false).rotateLabels(opts.eixoX.girarLabels);
		}
		
//		if(opts.margin!=null){
//			grafico.margin( opts.margin );
//		}
		if(opts.margin!=null) grafico.margin(opts.margin);
     	return grafico;
	};
     		
	return $G.configurarGrafico.call(this, opts, json);
};
		
		
	