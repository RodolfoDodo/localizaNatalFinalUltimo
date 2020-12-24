Feature: Abastecer um determinado veiculo de uma agencia
 	Eu como colaborador vou realizar o abastecimento de um veiculo qualquer vinculado de uma agencia
 	Antes de realizar o abastecimento o veiculo deve está disponivel para o abastecimento 
 	Para identificar o veiculo que esta disponivel para abastecimento ele deve esta no status 35.aa

	Scenario: Abastecer veiculo combustivel Etanol Forncedor Interno
		Given que realizo a pesquisar de uma placa "QWU6260"
 		And solicito o abastecimento do veiculo
 		And informo o tipo de combustivel e quantidade de litros
 		When confirmo o abastecimento

 	