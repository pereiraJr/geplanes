

//		 * Devolve um Gráfico pizza
//		 * @memberof $Graficos
//		 * @namespace $Graficos.pizza
//		 * @constructor
//		 * @param {object} opts - Objeto com as opções para inicialização do Gráfico
//		 * @param {string} opts.id - id do elemento HTML onde o gráfico será renderizado
//		 * @param {array} opts.dados - Array de dados no formato JSON
//		 * @param {string} [opts.msgSemDados="Nenhum dado a ser exibido"] - Mensagem padrão a ser exibida quando não são repassados dados para o Gráfico
//		 * @param {object} [opts.rotulo] - Configurações do rotulo do Gráfico
//		 * @param {boolean} [opts.rotulo.exibir=true] - Define se o rótulo será ou não exibido.
//		 * @param {string} [opts.rotulo.tipo="percent"] - Qual o valor do rotulo que deve ser exibido. Os valores possiveis são key, value, percent
//		 * @param {object} [opts.css] - CSS a ser aplicado ao elemento HTML do gráfico quando a sua inicalização. Usar o mesmo formado do metodo jQuery $(el).css
//		 * @param {function} [opts.config] - Função que recebe o objeto do nvd3 e aplica personalizações.
//		 * @return {} nv.models.pieChart()
		 
$G.pizza = function(opts){
	this.defaultOpts = {
		nvd3: true,
		id: "grafico",
		msgSemDados: $G.constantes.msg.SEM_DADOS,
		rotulo: {
			exibir: true,
			tipo: $G.constantes.pizza.tipo.PORCENTAGEM	
		},
		rosquinha: false,
		config: function(){}
	};
			
	this.fnImplementacao = function(opts){
		var grafico = nv.models.pieChart()
		.labelType(function(d, i, values) {
              return values.key + ':' + values.value;
           }).tooltipContent($G.constantes.pizza.tooltip.VALOR)
		.x(function(d) { return d.rotulo })
    	.y(function(d) { return d.valor })
     		.donut(opts.rosquinha)
     		.showLabels(opts.rotulo.exibir)
     		.labelType(opts.rotulo.tipo)
     		.noData(opts.msgSemDados)
     		.width(opts.width);
     	return grafico;
	};
	return $G.configurarGrafico.call(this, opts);
};
