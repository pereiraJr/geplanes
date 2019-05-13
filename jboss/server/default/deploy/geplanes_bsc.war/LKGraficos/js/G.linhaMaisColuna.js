$G.linhaMaisColuna = function(opts){
	//Formatando os dados para o formato de dados do linePlusBarChart
//	for(var i=0; i<opts.dados.length; i++){
//		var dados = [];
//		var d = opts.dados[i];
//		for(var j=0; j<d.values.length; j++){
//			dados.push( [d.values[j].x, d.values[j].y] );
//		}
//		opts.dados[i].values = dados;
//		console.log("teste", dados)
//	}
	
	this.defaultOpts = {
		nvd3: true,
		margin: {top: 30, right: 100, bottom: 50, left: 100},
		eixoX: {
			label: "Eixo X", 
			formato: $G.constantes.formato.NUMERICO  
		},
		eixoY: {
			label: "Eixo Y",
			formato: $G.constantes.formato.DECIMAL2,
			dominio: null 
		},
		eixoY2: {
			label: "Eixo Y (direita)",
			formato: $G.constantes.formato.DECIMAL2 
		}
	};
	//implementacao do gráfico
	this.fnImplementacao = function(opts){
		//inicializa o gráfico
		var fnTooltipContent = opts.tooltipContent || function (graph) {
//		    console.log(graph);
			if(graph.point !=null)
		    	return "<p><div style='height:10px;width:10px;background-color:"+graph.series[0].color+"'></div>" + 
		             	'x: ' +  graph.point.y + '<br>y: ' + graph.point.x + '</p>';
	            else 
	            	return graph.series[0].value;
		};
		var grafico = nv.models.linePlusBarChart()
				.legendRightAxisHint(' [Eixo Direito]')
				.legendLeftAxisHint(' [Eixo Esquerdo]')
	           .margin(opts.margin)
	           .color(d3.scale.category10().range())
	           .tooltipContent(fnTooltipContent)
	           .focusEnable(false)
	           //.showYAxis(opts.eixoY.exibir);
//	           grafico.bars.forceY([0]).padData(false);
	           
	//           .showXAxis(opts.eixoX.exibir)        //Show the y-axis	//           .showYAxis(opts.eixoY.exibir)        //Show the x-axis
	//           .showY2Axis(opts.eixoY2.exibir);        //Show the y-axis
		grafico.xAxis.tickValues(opts.eixoX.tickValues);	             
		grafico.xAxis.tickFormat(opts.eixoX.formato);
		
//		grafico.x2Axis.tickValues(opts.eixoX.tickValues);	             
//		grafico.x2Axis.tickFormat(opts.eixoX.formato);
		
		
		grafico.xAxis.showMaxMin(true)
		grafico.x2Axis.showMaxMin(true)
		grafico.y1Axis.showMaxMin(true)
		grafico.y2Axis.showMaxMin(true)
		
		if(opts.eixoX.dominio!=null) {
			grafico.forceX(opts.eixoX.dominio)
//			grafico.bars.forceX(opts.eixoX.dominio)
		}
		if(opts.eixoY.dominio!=null) {
//			grafico.forceY(opts.eixoY.dominio)
			grafico.bars.forceY(opts.eixoY.dominio);
			//grafico.lines.forceY(opts.eixoY.dominio);
//			grafico.yDomain(opts.eixoY.dominio);
		}
//		if(opts.eixoY2.dominio!=null) {
//			grafico.forceY(opts.eixoY2.dominio)
//		}
		grafico.y1Axis.tickFormat(opts.eixoY.formato);
		grafico.y2Axis.tickFormat(opts.eixoY2.formato);
		grafico.xAxis.axisLabel( opts.eixoX.label );
		grafico.y1Axis.axisLabel( opts.eixoY.label );
		grafico.y2Axis.axisLabel( opts.eixoY2.label );
		
		grafico.y1Axis.tickValues(opts.eixoY.tickValues);
		grafico.y2Axis.tickValues(opts.eixoY2.tickValues);
		if(opts.height!=null) grafico.height(opts.height)
	   	return grafico;
	};
	return $G.configurarGrafico.call(this, opts);
		
}