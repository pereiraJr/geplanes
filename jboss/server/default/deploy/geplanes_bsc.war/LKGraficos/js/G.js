/**
 * Inicializa a biblioteca de gráficos
 * @namespace $G
 */
var $G = function(){

	
	/**
	 * Armazena as instâncias dos gráficos gerados.
	 * @private  
	 */
	var instancias = {};
	
	/**
	 * Cache dos elementos da biblioteca
	 * @memberof $G
	 * @private
	 */
	var $els = {
		containerImpressao: null, //div onde será renderizado ocultamente o gráfico para geração de PDF
	};
	
	/**
	 * Retorna uma instancia de um gráfico
	 * @memberof $G
	 * @method
	 * @param {string} id - Objecto com as opções para inicialização do Gráfico
	 * @return {NVD3} Instância de um gráfico
	 */
	var getInstancia = function(id){
		return instancias[id];
	};
	
	/**
	 * Armazena uma instancia de um grafico
	 * @memberof $G
	 * @method
	 * @param {string} id - Objecto com as opções para inicialização do Gráfico
	 * @param {NVD3} grafico - Instância de um gráfico
	 */	
	var setInstancia = function(id, grafico){
		if(instancias.nome!=null) throw new Error("Já existe uma instância registrada com esse id("+id+")");
		instancias[id] = grafico;
	};
	
	/**
	 * Gera o PDF de um gráfico SVG
	 * @memberof $G
	 * @method
	 * @param {string} container - id do elemento que contém a tag SVG
	 * @param {string} [titulo=container] - Título do documento PDF
	 * @param {string} [nomeArquivo=container] - Nome do arquivo que sera gerado
	 */
	var pdf = function imprimir(container, titulo, nomeArquivo){
	 	$container =  $("#"+container);
	 	var svg = $container.find("svg")[0]
	 	nomeArquivo = nomeArquivo || container 
	 	
	 	svgAsDataUri(svg, {}, function(uri) {
	 		$els.containerImpressao.html("<h1 id='printTitulo'>"+titulo+"</h1><img src='"+uri+"' id='printImg' style='background: white'/>")
	 		titulo = $("#printTitulo").text();
			var pdf = new jsPDF('landscape');
	
			var $el = $("#printImg")
			var w = $el[0].width;
			var h = $el[0].height;
		 	
			pdf.setFontSize(32);
			pdf.text(15, 20, titulo);
			
			var uri = getBase64Image($el[0]);
//			var newH = (w * h) / 250  
	//		pdf.addImage(uri, 'JPEG', 5, 30,250, newH);
			
			var x = (4*w)/1126;
			pdf.addImage(uri, 'JPEG', 5, 30, w/x, h/x);
			pdf.save(nomeArquivo+'.pdf');
	 	});
	 };
	
	/**
	 * Gera um id único
	 * @memberof $G
	 * @method
	 * @private
	 */ 
	var guid = function guid() {
	  function s4() {
	    return Math.floor((1 + Math.random()) * 0x10000)
	      .toString(16)
	      .substring(1);
	  }
	  return s4() + s4() + '-' + s4() + '-' + s4() + '-' +
	    s4() + '-' + s4() + s4() + s4();
	};
	
	/**
	 * Faz o bind do evento de impressão do gráfico
	 * @memberof $G
	 * @method
	 * @private
	 */ 
	var bindBotaoImprimir = function(uuid, containerId){
		var $btn = $("#"+uuid);
		$btn.click(function(){
			$G.pdf(containerId);
		})
		.mouseover(function(){
			$btn.fadeTo("slow", 1);
		})
		.mouseout(function(){
			$btn.fadeTo("slow", 0.5);
		});
	};
	 
	 /**
	  * Configura o gráfico, presumindo que existe no escopo da função uma variavel opts e uma fuImplementacao
	  * @memberof $G
	  * @method
	  * @param {object} opts - Objecto com as opções para inicialização do Gráfico
	  */
	 var configurarGrafico = function(opts){
	 	//extends as opções do gráfico com as opções default de todos os gráficos + as opções default desse tipo de gráfico
	 	opts = $.extend($.extend(true, {}, $G.optsComunsATodosOsGraficos, this.defaultOpts), opts);
	 	
	 	//validaçoes
	 	console.debug("opts", opts);
	 	if(opts.id==null){
	 		throw new Error("É necessário fornecer um id de elemento HTML para que o gráfico seja inicializado.");
	 	}
	 	
	 	//inicializa elementos HTML
	 	this.$container = $("#"+opts.id);
	 	this.$container.css("position", "relative");
	 	
	 	if(this.$container.length==0)
	 		throw new Error("Nao foi encontrado elemento na página com o id = "+opts.id);
	 		
	 	//configura impressao
	 	if(opts.imprimir===true){
	 		var uuid = guid();
		 	this.$container.html( "<span class='grafico-botao-imprimir' id='"+uuid+"' title='"+$G.constantes.msg.BTN_DOWNLOAD_PDF+"'/></span>" + (opts.nvd3 ? "<svg></svg>":"") );
		 	bindBotaoImprimir(uuid, opts.id);
	 	}else if(opts.nvd3){
	 		var height = opts.height || 400
	 		this.$container.html( "<svg style='height: "+height+"px'></svg>" );
	 	}
	 	
	 	var graficoNVD3 = this.fnImplementacao(opts);
	 	
	 	//dispara o evento de inicialização do gráfico, caso algum esteja definido.
	 	if(opts.config)opts.config(graficoNVD3);
    	
    	//adiciona a lista de inicialização do nvd3
    	if(opts.nvd3){
			nv.addGraph(function() {
				d3.select("#"+opts.id + " svg")
	       		.datum(opts.dados)
	        	.transition().duration(350)
	        	.call(graficoNVD3);
	        
	        	//resize da janela = resize do gráfico
   				nv.utils.windowResize(function(){ graficoNVD3.update(); setTimeout($G.realinhaLabels, 1500);});
      	
				return graficoNVD3; 
	    	});
			callOnResize();
			setTimeout($G.realinhaLabels, 1500);
		}
    	if(opts.afterRender) setTimeout(opts.afterRender,1500);	
   		
   		//realinhando labels ao clicar na legenda
   		setTimeout(function(){
   			$(".nv-series").click(function(){
   				setTimeout(function(){$G.realinhaLabels();}, 500); 
   			});
   		}, 1000);
      	//adiciona o gráfico ao objeto de instancias
     	$G.setInstancia(opts.id, graficoNVD3);
     	
     	//aplica o CSS padrão ao container caso ele tenha sido fornecido 
     	if(opts.css!=null) 	$container.css(opts.css);
     	return graficoNVD3;
	 };
	 
	 var getInstancias = function(){ return instancias;};
	 
	 var callOnResize = function(){ setTimeout(function(){window.dispatchEvent(new Event('resize'))}, 500);  setTimeout($G.realinhaLabels, 1500);};
	 /**
	  * Metodo que inicializa a biblioteca de gráficos
	  * @memberof $G
	  * @method
	  */
	 var init = function(){
		//inicializa os elementos HTML que serão utilizados
		var $containerImpressao = $("#containerImpressao");
		if($containerImpressao.length==0){
			$("body").append('<div id="containerImpressao" ></div>');
		}
		$els.containerImpressao = $("#containerImpressao");
	};
	
	var extractTranslateX = function($el){
		try{
			return parseFloat( $el.attr("transform").replace("translate(", "").replace(",0)") );
		}catch(e){
			return 0;
		}
	};
	
	var realinhaLabels = function(){
		var $ctx = this.$container;
		try{
			if($(".multiChart.wrap", $ctx).length >0 ){
				console.log("realinha")
				var colunas = $(".nv-series-0:has(rect):first rect", $ctx);
				
				var qtColunasMultibar = $(".nv-groups:has(rect) .nv-group", $ctx).length;
				var translate1 = extractTranslateX( $(colunas[0]) );
				var translate2 = extractTranslateX( $(colunas[1]) );
				
				var multiBarAgrupado = false;
				//se o grafíco tem mais de uma série com barras, e as duas primeiras colunas tem o mesmo x, o gráfico está agrupado
				if(qtColunasMultibar>1){
					var colunasSerie2 = $(".nv-series-1:has(rect) rect", $ctx)
					var xBarra1 = $(colunas[0]).attr("x");
					var xBarra2 = $(colunasSerie2[0]).attr("x");
					if(xBarra1==xBarra2)
						multiBarAgrupado = true;
				}
				
				// a largura das colunas é a largura de uma coluna * a quantidade de barras do gráfico, exceto se ele for agrupado
				var larguraColunas = parseFloat(colunas.attr("width")) * (multiBarAgrupado ? 1 : qtColunasMultibar);
				var distanciaEntreColunas = (translate2==0 && translate1==0) ? 0 : translate2-translate1-larguraColunas;
				
				// obtendo os labels
				var labels = [];
				labels.push( $(".nv-axisMin-x", $ctx)[0] );
				var ticks = $(".nv-x .tick:has(text)", $ctx);
				for(var i=0; i<ticks.length; i++){
					labels.push( ticks[i]) ;
				}
				labels.push( $(".nv-axisMax-x", $ctx) );
				
			//	setando os novos valores de x dos labels
				console.log("distanciaEntreColunas", distanciaEntreColunas)
				var xAcumulado = distanciaEntreColunas;
				if(xAcumulado>0){
					for(var i=0; i<labels.length; i++){
						var label = labels[i];
						var $label = $(label);
						var larguraLabel = parseFloat($label.width());
						var novoX = (larguraColunas/2) - (larguraLabel/2);
						var axislabel = $(".nv-x .nv-axis .nv-axislabel");
						if (axislabel[0].textContent!='') {
							$label.attr("transform", "translate("+(xAcumulado + novoX)+", 20)");
						} else {
							$label.attr("transform", "translate("+(xAcumulado + novoX)+", 0)");						
						}
						xAcumulado += larguraColunas + distanciaEntreColunas;
						
					}
					//posicionando o label do eixo x junto ao gráfico
					$(".nv-x .nv-axis .nv-axislabel").attr("y", "15");
				}
			}
		}catch(e){
			console.log("erro reallinha", e);
		}
	}
	
	init();
	
	return {
		setInstancia: setInstancia,
		getInstancia: getInstancia,
		getInstancias: getInstancias,
		configurarGrafico: configurarGrafico,
		pdf: pdf,
		callOnResize: callOnResize,
		realinhaLabels: realinhaLabels,
		$els: $els
	};
}();

/**
 * Constantes da biblioteca
 * @namespace $G.constantes
 */
$G.constantes = {
	/*
	 * @memberof $G.constantes
	 * @param {object} msg - Objeto com as mensagens da biblioteca
	 * @param {string} msg.SEM_DADOS= - Mensagem exibida quando não há dados em um gráfico
	 * @param {string} msg.BTN_DOWNLOAD_PDF - Tooltip do botão de download do gráfico
	 */
	msg: {
		SEM_DADOS: "Nenhum dado foi fornecido para que o gráfico seja exibido.",
		BTN_DOWNLOAD_PDF: "Baixar PDF do gráfico"
	},
	
	/**
	 * Formatos do D3 que são utilizados para a formatação de valores na biblioteca.
	 * @see [http://koaning.s3-website-us-west-2.amazonaws.com/html/d3format.html]
	 * @see [https://github.com/mbostock/d3/wiki/Formatting]
	 * @memberof $G.constantes
	 * @param {object} formato - Objeto com 
	 * @param {string} formato.MONETARIO - Exibe o valor no padrão R$ 123.456,78
	 * @param {string} formato.numerico - Exibe o valor no padrão 123,456.78
	 */
	formato: {
		MONETARIO:  d3.format("$,.02f"),
		NUMERICO:  d3.format(",r"),
		DECIMAL: d3.format( ",.2f"),
		DECIMAL2:  d3.format(",.02f"),
		DECIMAL3:  d3.format(",.03f"),
		DATA_HORA:  d3.format('%d/%m/%Y %H:%M:%S'),
		DATA_EXTENSO:  d3.format('%A, %e de %B de %Y. %X'),
 			DATA:  d3.format('%d/%m/%Y'),
 			HORA:  d3.format('%H:%M:%S'),
 		STRING :  d3.format("")
	},
	
	/**
	 * Constantes do Gráfico Pizza
	 * @param {string} pizza.tipo.PORCENTAGEM - Exibe as porcentagens correspondentes as fatias nos labels do gráfico
	 * @param {string} pizza.tipo.ROTULO - Exibe o nome da fatia como label do gráfico
	 * @param {string} pizza.tipo.VALOR - Exibe o valor da fatia como label do gráfico
	 
	 * @param {function} pizza.tooltip.VALOR - Função padrão que retorna o valor da fatia como tooltip.
	 */
	pizza: {
		tipo: {
			PORCENTAGEM: "percent",
			ROTULO: "key",
			VALOR: "value"
		},
		tooltip: {
			VALOR: function (obj) { //
				//console.debug(obj)
				return "<strong>" + obj.data.valor + "</strong>";
			}
		}
	}
};


$G.optsComunsATodosOsGraficos = {
	imprimir: false, //impressao
	dados: [], //impressao dos gráficos
	msgSemDados: $G.constantes.msg.SEM_DADOS,
	config: function(){}
};

///Gauge
//https://github.com/toorshia/justgage/blob/master/justgage.js#L164

$G.gauge = function(opts){
// 	this.defaultOpts = {
//		titulo: 'Gauge',
//		min: 0, 
//		max: 100,
//		valor: 50
//	};
	
	//implementacao do gráfico
//	this.fnImplementacao = function(opts){
		opts.value = opts.valor;
		opts.title = opts.titulo
		console.log("gauge2", opts)
		var gauge = new JustGage(opts);
		//inicializa o gráfico
		
     	return gauge;
//	};
     		
//	return $G.configurarGrafico.call(this, opts);
};

$G.pdfGraficoListagem = function (id_listagem, titulo, id_grafico, container_pdf, opts, dados){
	$grafico =  $("#"+id_grafico);
	var svg = $grafico.find("svg")[0]
	var $container_listagem = $("#"+id_listagem);
	var doc = new jsPDF('portrait');
	
	$container_listagem.css("background", "white");
	
	doc.setFontSize(20);
	doc.text(20, 20, titulo);	
	
	if(dados)hideLinesPDF(dados, id_grafico);
	
	//grafico
 	svgAsDataUri(svg, {}, function(uri) {
 		$("#"+container_pdf).html("<img src='"+uri+"' id='printImg' style='background: white;display: none'/>")

		var $el = $("#printImg")
		var w = $el.width();
		var h = $el.height();
		
		x = opts.graficoX || 5;
		y = opts.graficoY || 30;
		
		wd = opts.graficoW || 5;
		ht = opts.graficoH || 5;
	 	
		var uri = getBase64Image($el[0]); 
    	doc.addImage(uri, 'JPEG', x, y, w/wd, h/ht);
 	});
 	
	//listagem
 	html2canvas($container_listagem.get(0)).then(function(canvas) {
		var w = $(canvas).get(0).width;    
    	var h = $(canvas).get(0).height;
    	
		ctx = canvas.getContext("2d");
		
		var imgData=ctx.getImageData(0,0,w,h);
		var data=imgData.data;
		for(var i=0;i<data.length;i+=4){
		    if(data[i+3]<255){
		        data[i]=255;
		        data[i+1]=255;
		        data[i+2]=255;
		        data[i+3]=255;
		    }
		}
		ctx.putImageData(imgData,0,0);
		
		x = opts.listaX || 5;
		y = opts.listaY || 65;
		
		wd = opts.listaW || 5;
		ht = opts.listaH || 5;
		
    	var dataURL = canvas.toDataURL("image/jpeg");
    	var dataURI = dataURL.replace(/^data:image\/(png|jpg);base64,/, "");
    	doc.addImage(dataURI, 'JPEG', x, y, w/wd, h/ht);
    	doc.save(titulo+'.pdf');
	});
}

function hideLinesPDF(dados, id_grafico){
	for(var i=0; i<dados.length; i++){
		var dado = dados[i];
		if(dado.hideLine){
			$('#'+id_grafico+' g.nv-series-'+i+' path.nv-line').css("stroke-opacity","0");
			$('#'+id_grafico+' g.nv-scatter g.nv-series-'+i+' path.nv-point').css("fill-opacity", "1").css("stroke-opacity", "1");
		}
	}
}
/*
 * 
 * funções para ordenar as séries dos gráficos
 */
d3.selection.prototype.moveToFront = function() {
    return this.each(function() {
        this.parentNode.appendChild(this);
    });
};

d3.selection.prototype.moveToBack = function() { 
    return this.each(function() { 
        var firstChild = this.parentNode.firstChild; 
        if (firstChild) { 
            this.parentNode.insertBefore(this, firstChild); 
        } 
    }); 
};
