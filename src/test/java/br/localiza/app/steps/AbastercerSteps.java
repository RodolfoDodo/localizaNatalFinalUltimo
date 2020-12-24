package br.localiza.app.steps;

import br.localiza.app.page.AbastecimentoPage;
import br.localiza.app.page.ComprovanteAbastecimentoPage;
import br.localiza.app.page.LoginPage;
import br.localiza.app.page.PlacaPage;
import br.localiza.app.page.Sidebar;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AbastercerSteps {

	private LoginPage login = new LoginPage();

	private Sidebar sidebar = new Sidebar();

	private PlacaPage placa = new PlacaPage();

	private AbastecimentoPage abastecimento = new AbastecimentoPage();
	
	private ComprovanteAbastecimentoPage comprovante = new ComprovanteAbastecimentoPage();

	@Given("que realizo a pesquisar de uma placa {string}")
	public void queRealizoAPesquisarDeUmaPlaca(String placapesquisar) {

		login.with("110508", "3487");
		// Assert.assertEquals("ANDRE", sidebar.usuario());
		sidebar.menuCombustivel();

		placa.pesquisarPlaca(placapesquisar);
		placa.btnBuscar();

	}

	@Given("solicito o abastecimento do veiculo")
	public void solicitoOAbastecimentoDoVeiculo() {
		abastecimento.btnVouAbastecer();
		
	}

	@Given("informo o tipo de combustivel e quantidade de litros")
	public void informoOTipoDeCombustivelEQuantidadeDeLitros() {
		abastecimento.informarTanque("8");
	}

	@When("confirmo o abastecimento")
	public void confirmoOAbastecimento() {
		abastecimento.btnConfirmarAbastecimento();
		abastecimento.confirmarAbastecimento();
		
		sidebar.sairAPP();
	}
	
	@Given("informo o forncedor externo")
	public void informoOForncedorExterno() {
	    abastecimento.abastecimentoInterno();
		abastecimento.btnVouAbastecer();
	}


	@Given("informo o numero {string}")
	public void informoONumero(String numeroNota) {
	    abastecimento.informarNUmeroNota(numeroNota);
	}

	@Given("informo o valor bruto {string}")
	public void informoOValorBruto(String bruto) {
	    abastecimento.valorBruto(bruto);
	}

	@Given("informo a data emissao {string}")
	public void informoADataEmissao(String emissao) {
	    abastecimento.dataEmissao(emissao);
	}

	@Given("informo a data de vencimento {string}")
	public void informoADataDeVencimento(String vencime) {
	    abastecimento.dataVencimento(vencime);
	}

	@Given("informo o tipo de combustivel e quantidade de litros do tanque")
	public void informoOTipoDeCombustivelEQuantidadeDeLitrosDoTanque() {
		abastecimento.informarValor("12");
		abastecimento.informarTanqueNota("8");
	}
	
	@When("confirmo o abastecimento e volto para agencia")
	public void confirmoOAbastecimentoEVoltoParaAgencia() {
		abastecimento.btnConfirmarAbastecimento();
		abastecimento.confirmarAbastecimentoNota();
		abastecimento.btnVoltarAgencia();
		
		sidebar.sairAPP();
		
	}
	
	@Given("informo o tipo de combustivel gasolina e quantidade de litros do tanque")
	public void informoOTipoDeCombustivelGasolinaEQuantidadeDeLitrosDoTanque() {
		abastecimento.combustivelGasolina();
		abastecimento.informarValor("12");
		abastecimento.informarTanqueNota("8");
		
	}
	
	@Given("informo a partida frio Etanol e quantidade de litros do tanque")
	public void informoAPartidaFrioEtanolEQuantidadeDeLitrosDoTanque() {
		abastecimento.partidaFrioEtanol();
		abastecimento.informarTanqueFrio("10", "120");	
	}
	
	@Given("informo a partida frio Gasolina e quantidade de litros do tanque")
	public void informoAPartidaFrioGasolinaEQuantidadeDeLitrosDoTanque() {
	    abastecimento.partidaFrioGasolina();
	    abastecimento.informarTanqueFrio("10", "10");	
	    
	}

}
