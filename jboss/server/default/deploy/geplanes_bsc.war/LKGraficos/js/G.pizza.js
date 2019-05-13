

//		 * Devolve um Gr�fico pizza
//		 * @memberof $Graficos
//		 * @namespace $Graficos.pizza
//		 * @constructor
//		 * @param {object} opts - Objeto com as op��es para inicializa��o do Gr�fico
//		 * @param {string} opts.id - id do elemento HTML onde o gr�fico ser� renderizado
//		 * @param {array} opts.dados - Array de dados no formato JSON
//		 * @param {string} [opts.msgSemDados="Nenhum dado a ser exibido"] - Mensagem padr�o a ser exibida quando n�o s�o repassados dados para o Gr�fico
//		 * @param {object} [opts.rotulo] - Configura��es do rotulo do Gr�fico
//		 * @param {boolean} [opts.rotulo.exibir=true] - Define se o r�tulo ser� ou n�o exibido.
//		 * @param {string} [opts.rotulo.tipo="percent"] - Qual o valor do rotulo que deve ser exibido. Os valores possiveis s�o key, value, percent
//		 * @param {object} [opts.css] - CSS a ser aplicado ao elemento HTML do gr�fico quando a sua inicaliza��o. Usar o mesmo formado do metodo jQuery $(el).css
//		 * @param {function} [opts.config] - Fun��o que recebe o objeto do nvd3 e aplica personaliza��es.
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
