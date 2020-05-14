package stepDefinitions.reserva;

import core.BasePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import pageObjects.menu.MenuPage;
import pageObjects.reserva.CancelarReservaPage;

public class CancelarReservaSteps extends BasePage {
	
	CancelarReservaPage cancelarReserva = new CancelarReservaPage();
	MenuPage menuPage = new MenuPage();
		

		@Dado("^que acesse o menu Minhas Reservas$")
		public void que_acesse_o_menu_Minhas_Reservas() throws Throwable {
		    menuPage.minhasReservas();
		}
		
		@Dado("^detalhe uma reserva que esteja confirmada$")
		public void detalhe_uma_reserva_que_esteja_confirmada() throws Throwable {
			cancelarReserva.detalharReservaConfirmada();
		}
		
		@Dado("^clique no botão de Cancelar Reserva$")
		public void clique_no_botão_de_Cancelar_Reserva() throws Throwable {
			cancelarReserva.cancelarReserva();
		    
		}
		
		@Dado("^preenche os dados para realizar o cancelamento$")
		public void preenche_os_dados_para_realizar_o_cancelamento() throws Throwable {
		    cancelarReserva.clicarEstouDeAcordo();
		    cancelarReserva.confirmarCancelamentoReserva();
		}
		
		@Então("^minha reserva será cancelada$")
		public void minha_reserva_será_cancelada() throws Throwable {
		    cancelarReserva.mensagemSucesso();
		}

}
