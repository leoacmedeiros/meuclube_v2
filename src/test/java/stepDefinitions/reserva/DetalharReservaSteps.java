package stepDefinitions.reserva;

import core.BasePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import pageObjects.menu.MenuPage;
import pageObjects.reserva.DetalharReservaPage;

public class DetalharReservaSteps extends BasePage {
	
	DetalharReservaPage detalharReserva = new DetalharReservaPage();
	MenuPage menuPage = new MenuPage();
	
			
	@Dado("^que acesse o menu das Minhas Reservas$")
	public void que_acesse_o_menu_das_Minhas_Reservas() throws Throwable {
	    menuPage.minhasReservas();
	}

	@Dado("^detalhe uma reserva que já esteja confirmada$")
	public void detalhe_uma_reserva_que_já_esteja_confirmada() throws Throwable {
	    detalharReserva.detalharReservaConfirmada();
	}

	@Então("^deverá apresentar os detalhes da Reserva$")
	public void deverá_apresentar_os_detalhes_da_Reserva() throws Throwable {
	    detalharReserva.validarTituloHospedeResp();
	}
	
}
