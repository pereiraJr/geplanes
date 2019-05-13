function newLine${tag.id}(){
    var table = document.getElementById('${tag.id}');
    var rowCount = table.rows.length;
    createRowIndexed('${tag.id}', rowCount-1, rowCount);
}
/*
	Exemplo de fun��o de dele��o
	onclick="excluirLinhaPorNome(this.id);reindexFormPorNome(this.id, NOMEDOFORMULARIO, 'PROPRIEDADEINDEXADA', true)"
	id="button.excluir[table_id=IDTABELA, indice=INDICEDALINHA]"
	
	Supondo que o formul�rio tenha name=form a propriedade indexada seje pessoas e o id da tabela seje detalhe_pessoas
	
	onclick="excluirLinhaPorNome(this.id);reindexFormPorNome(this.id, form, 'pessoas', true)"
	id="button.excluir[table_id=detalhe_pessoas, indice=2]
	
	Dica: utilize ${rowIndex} no lugar do indice
	Importante.. se utilizar um button como bot�o de excluir na funcao reindexFormPorNome n�o � suficiente colocar o nome do formul�rio
	tem que utilizar algo do tipo forms[0]
*/