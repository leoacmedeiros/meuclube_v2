package stepDefinitions.reserva;

import core.BasePage;
import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Então;
import pageObjects.reserva.DetalharReservaPaginaInicialPage;


public class DetalharReservaPaginaInicialSteps extends BasePage {
	
	DetalharReservaPaginaInicialPage detalharReservaPaginaInicial = new DetalharReservaPaginaInicialPage();
	
	@Dado("^que eu clique no botão de Detalhes da Reserva na Página Inicial$")
	public void que_eu_clique_no_botão_de_Detalhes_da_Reserva_na_Página_Inicial() throws Throwable {
	    detalharReservaPaginaInicial.detalharReservaConfirmadaPaginaInicial();
	}

	@Então("^exibirá os detalhes da Reserva$")
	public void exibirá_os_detalhes_da_Reserva() throws Throwable {
	    detalharReservaPaginaInicial.validarTituloHospedeResp();
	}

}
