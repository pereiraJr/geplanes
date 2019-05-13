$G.multi = function(opts, json){
	//corrigindo erro da conversão de json do net.sf.json do Neo
//	for(var i=0; i<opts.dados.length; i++){
//		opts.dados[i].yAxis = opts.dados[i].YAxis;
//	}
	
	this.defaultOpts = {
		nvd3: true,
		margin: {top: 30, right: 40, bottom: 50, left: 70},
		eixoX: {
			label: "", 
			formato: $G.constantes.formato.NUMERICO  
		},
		eixoY: {
			label: "",
			formato: $G.constantes.formato.DECIMAL2 
		},
		eixoY2: {
			label: "",
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
		var grafico = nv.models.multiChart()
	           .margin(opts.margin)
	           .color(d3.scale.category10().range())
	           .tooltipContent(fnTooltipContent)
	           .noData(opts.msgSemDados);
	            
					           
	//           .showXAxis(opts.eixoX.exibir)        //Show the y-axis	//           .showYAxis(opts.eixoY.exibir)        //Show the x-axis
	//           .showY2Axis(opts.eixoY2.exibir);        //Show the y-axis
		grafico.yAxis1.tickValues(opts.eixoY.tickValues);
		grafico.yAxis2.tickValues(opts.eixoY2.tickValues);
		grafico.yAxis1.tickFormat(opts.eixoY.formato);
		grafico.yAxis2.tickFormat(opts.eixoY2.formato);
		grafico.yAxis2.width(40);
		grafico.xAxis.axisLabel( opts.eixoX.label );
		grafico.yAxis1.axisLabel( opts.eixoY.label );
		grafico.yAxis2.axisLabel( opts.eixoY2.label );
		
		
		grafico.xAxis.tickValues(opts.eixoX.tickValues);
		grafico.xAxis.tickFormat(opts.eixoX.formato);
//		grafico.bars1.forceY(0);
//		grafico.bars2.forceY(0);
//		grafico.lines1.forceY(0);
//		grafico.lines2.forceY(0);
//		grafico.stack1.forceY(0);
//		grafico.stack2.forceY(0);
		grafico.interpolate(opts.interporlate);
//		grafico.reduceXTicks(false)
//		grafico.xDomain([0,400]);
		
//		grafico.showXAxis(true)        
//        grafico.showYAxis(true);    
		
		if(opts.eixoY.dominio!=null) {
			grafico.yDomain1(opts.eixoY.dominio);
		}
		if(opts.eixoX.girarLabels !=null){
			grafico.xAxis.staggerLabels(false).rotateLabels(opts.eixoX.girarLabels);
		}
		
		grafico.xAxis.axisLabelDistance(opts.eixoX.distanciaLabel || 8);
		
		
		grafico.bars1.stacked(opts.empilharBarras || false);
		grafico.lines1.padData(true)
		grafico.lines2.padData(true)
		grafico.margin(opts.margin)
		
	
//		grafico.x(function(d,i){ console.log("x", d, i); return i;})
//		var ys = d3.scale.ordinal()
//		.domain(["this","is","an","ordinal"])
//		.range([0,1,2,3])
//		.rangeBands([0,3]);
		
//		grafico.x(function(d) { console.log("y", d, ys.domain(), ys.range(), ys(d)); return ys(d) })
//		grafico.xAxis.scale(ys);
		
	   	return grafico;
	};
	return $G.configurarGrafico.call(this, opts, json);
		
}