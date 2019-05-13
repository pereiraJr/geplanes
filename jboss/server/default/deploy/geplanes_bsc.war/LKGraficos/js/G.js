/**
 * Inicializa a biblioteca de gr�ficos
 * @namespace $G
 */
var $G = function(){

	
	/**
	 * Armazena as inst�ncias dos gr�ficos gerados.
	 * @private  
	 */
	var instancias = {};
	
	/**
	 * Cache dos elementos da biblioteca
	 * @memberof $G
	 * @private
	 */
	var $els = {
		containerImpressao: null, //div onde ser� renderizado ocultamente o gr�fico para gera��o de PDF
	};
	
	/**
	 * Retorna uma instancia de um gr�fico
	 * @memberof $G
	 * @method
	 * @param {string} id - Objecto com as op��es para inicializa��o do Gr�fico
	 * @return {NVD3} Inst�ncia de um gr�fico
	 */
	var getInstancia = function(id){
		return instancias[id];
	};
	
	/**
	 * Armazena uma instancia de um grafico
	 * @memberof $G
	 * @method
	 * @param {string} id - Objecto com as op��es para inicializa��o do Gr�fico
	 * @param {NVD3} grafico - Inst�ncia de um gr�fico
	 */	
	var setInstancia = function(id, grafico){
		if(instancias.nome!=null) throw new Error("J� existe uma inst�ncia registrada com esse id("+id+")");
		instancias[id] = grafico;
	};
	
	/**
	 * Gera o PDF de um gr�fico SVG
	 * @memberof $G
	 * @method
	 * @param {string} container - id do elemento que cont�m a tag SVG
	 * @param {string} [titulo=container] - T�tulo do documento PDF
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
	 * Gera um id �nico
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
	 * Faz o bind do evento de impress�o do gr�fico
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
	  * Configura o gr�fico, presumindo que existe no escopo da fun��o uma variavel opts e uma fuImplementacao
	  * @memberof $G
	  * @method
	  * @param {object} opts - Objecto com as op��es para inicializa��o do Gr�fico
	  */
	 var configurarGrafico = function(opts){
	 	//extends as op��es do gr�fico com as op��es default de todos os gr�ficos + as op��es default desse tipo de gr�fico
	 	opts = $.extend($.extend(true, {}, $G.optsComunsATodosOsGraficos, this.defaultOpts), opts);
	 	
	 	//valida�oes
	 	console.debug("opts", opts);
	 	if(opts.id==null){
	 		throw new Error("� necess�rio fornecer um id de elemento HTML para que o gr�fico seja inicializado.");
	 	}
	 	
	 	//inicializa elementos HTML
	 	this.$container = $("#"+opts.id);
	 	this.$container.css("position", "relative");
	 	
	 	if(this.$container.length==0)
	 		throw new Error("Nao foi encontrado elemento na p�gina com o id = "+opts.id);
	 		
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
	 	
	 	//dispara o evento de inicializa��o do gr�fico, caso algum esteja definido.
	 	if(opts.config)opts.config(graficoNVD3);
    	
    	//adiciona a lista de inicializa��o do nvd3
    	if(opts.nvd3){
			nv.addGraph(function() {
				d3.select("#"+opts.id + " svg")
	       		.datum(opts.dados)
	        	.transition().duration(350)
	        	.call(graficoNVD3);
	        
	        	//resize da janela = resize do gr�fico
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
      	//adiciona o gr�fico ao objeto de instancias
     	$G.setInstancia(opts.id, graficoNVD3);
     	
     	//aplica o CSS padr�o ao container caso ele tenha sido fornecido 
     	if(opts.css!=null) 	$container.css(opts.css);
     	return graficoNVD3;
	 };
	 
	 var getInstancias = function(){ return instancias;};
	 
	 var callOnResize = function(){ setTimeout(function(){window.dispatchEvent(new Event('resize'))}, 500);  setTimeout($G.realinhaLabels, 1500);};
	 /**
	  * Metodo que inicializa a biblioteca de gr�ficos
	  * @memberof $G
	  * @method
	  */
	 var init = function(){
		//inicializa os elementos HTML que ser�o utilizados
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
				//se o graf�co tem mais de uma s�rie com barras, e as duas primeiras colunas tem o mesmo x, o gr�fico est� agrupado
				if(qtColunasMultibar>1){
					var colunasSerie2 = $(".nv-series-1:has(rect) rect", $ctx)
					var xBarra1 = $(colunas[0]).attr("x");
					var xBarra2 = $(colunasSerie2[0]).attr("x");
					if(xBarra1==xBarra2)
						multiBarAgrupado = true;
				}
				
				// a largura das colunas � a largura de uma coluna * a quantidade de barras do gr�fico, exceto se ele for agrupado
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
					//posicionando o label do eixo x junto ao gr�fico
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
	 * @param {string} msg.SEM_DADOS= - Mensagem exibida quando n�o h� dados em um gr�fico
	 * @param {string} msg.BTN_DOWNLOAD_PDF - Tooltip do bot�o de download do gr�fico
	 */
	msg: {
		SEM_DADOS: "Nenhum dado foi fornecido para que o gr�fico seja exibido.",
		BTN_DOWNLOAD_PDF: "Baixar PDF do gr�fico"
	},
	
	/**
	 * Formatos do D3 que s�o utilizados para a formata��o de valores na biblioteca.
	 * @see [http://koaning.s3-website-us-west-2.amazonaws.com/html/d3format.html]
	 * @see [https://github.com/mbostock/d3/wiki/Formatting]
	 * @memberof $G.constantes
	 * @param {object} formato - Objeto com 
	 * @param {string} formato.MONETARIO - Exibe o valor no padr�o R$ 123.456,78
	 * @param {string} formato.numerico - Exibe o valor no padr�o 123,456.78
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
	 * Constantes do Gr�fico Pizza
	 * @param {string} pizza.tipo.PORCENTAGEM - Exibe as porcentagens correspondentes as fatias nos labels do gr�fico
	 * @param {string} pizza.tipo.ROTULO - Exibe o nome da fatia como label do gr�fico
	 * @param {string} pizza.tipo.VALOR - Exibe o valor da fatia como label do gr�fico
	 
	 * @param {function} pizza.tooltip.VALOR - Fun��o padr�o que retorna o valor da fatia como tooltip.
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
	dados: [], //impressao dos gr�ficos
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
	
	//implementacao do gr�fico
//	this.fnImplementacao = function(opts){
		opts.value = opts.valor;
		opts.title = opts.titulo
		console.log("gauge2", opts)
		var gauge = new JustGage(opts);
		//inicializa o gr�fico
		
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
 * fun��es para ordenar as s�ries dos gr�ficos
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
