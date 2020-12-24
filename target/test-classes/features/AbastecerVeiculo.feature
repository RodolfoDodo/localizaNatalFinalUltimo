Feature: Abastecer um determinado veiculo de uma agencia
 	Eu como colaborador vou realizar o abastecimento de um veiculo qualquer vinculado de uma agencia
 	Antes de realizar o abastecimento o veiculo deve está disponivel para o abastecimento 
 	Para identificar o veiculo que esta disponivel para abastecimento ele deve esta no status 35.aaaa

	Scenario: Abastecer veiculo combustivel Etanol Forncedor Interno
		Given que realizo a pesquisar de uma placa "QWU6260"
 		And solicito o abastecimento do veiculo
 		And informo o tipo de combustivel e quantidade de litros
 		When confirmo o abastecimento

 	Scenario: Abastecer veiculo combustivel Etanol Forncedor Externo
 	  Given que realizo a pesquisar de uma placa "QWU6260"
 		And informo o forncedor externo
 		And informo o valor bruto "50"
		And informo o numero "12345"
 		And informo a data emissao "23/12/2020"
 		And informo a data de vencimento "01/12/2021"
 		And informo o tipo de combustivel e quantidade de litros do tanque
		When confirmo o abastecimento e volto para agencia

 	Scenario: Abastecer veiculo combustivel Gasolina Forncedor Externo
 	  Given que realizo a pesquisar de uma placa "QWU6260"
 		And informo o forncedor externo
 		And informo o valor bruto "50"
		And informo o numero "12345"
 		And informo a data emissao "23/12/2020"
 		And informo a data de vencimento "01/12/2021"
 		And informo o tipo de combustivel gasolina e quantidade de litros do tanque
		When confirmo o abastecimento e volto para agencia

	Scenario: Abastecer veiculo combustivel Etanol Forncedor Externo partida frio Etanol
 	  Given que realizo a pesquisar de uma placa "QWU6260"
 		And informo o forncedor externo
 		And informo o valor bruto "50"
		And informo o numero "12345"
 		And informo a data emissao "23/12/2020"
 		And informo a data de vencimento "01/12/2021"
 		And informo o tipo de combustivel e quantidade de litros do tanque
 		And informo a partida frio Etanol e quantidade de litros do tanque
		When confirmo o abastecimento e volto para agencia

	Scenario: Abastecer veiculo combustivel Etanol Forncedor Externo partida frio Gasolina
 	  Given que realizo a pesquisar de uma placa "QWU6260"
 		And informo o forncedor externo
 		And informo o valor bruto "50"
		And informo o numero "12345"
 		And informo a data emissao "23/12/2020"
 		And informo a data de vencimento "01/12/2021"
 		And informo o tipo de combustivel e quantidade de litros do tanque
 		And informo a partida frio Gasolina e quantidade de litros do tanque
		When confirmo o abastecimento e volto para agencia

	Scenario: Abastecer veiculo combustivel Gasolina Forncedor Externo partida frio Gasolina
 	  Given que realizo a pesquisar de uma placa "QWU6260"
 		And informo o forncedor externo
 		And informo o valor bruto "50"
		And informo o numero "12345"
 		And informo a data emissao "23/12/2020"
 		And informo a data de vencimento "01/12/2021"
 		And informo o tipo de combustivel gasolina e quantidade de litros do tanque
 		And informo a partida frio Gasolina e quantidade de litros do tanque
		When confirmo o abastecimento e volto para agencia

	Scenario: Abastecer veiculo combustivel Gasolina Forncedor Externo partida frio Etanol
 	  Given que realizo a pesquisar de uma placa "QWU6260"
 		And informo o forncedor externo
 		And informo o valor bruto "50"
		And informo o numero "12345"
 		And informo a data emissao "23/12/2020"
 		And informo a data de vencimento "01/12/2021"
 	  And informo o tipo de combustivel e quantidade de litros do tanque
 		And informo a partida frio Etanol e quantidade de litros do tanque
		When confirmo o abastecimento e volto para agencia
