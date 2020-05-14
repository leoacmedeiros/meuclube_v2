package stepDefinitions.reserva;

import core.BasePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.reserva.CancelarReservaPage;

public class CancelarReservaForaPrazoSteps extends BasePage {
	
	CancelarReservaPage cancelarReserva = new CancelarReservaPage();
	MenuPage menuPage = new MenuPage();
		

	@Dado("^detalhe uma reserva que esteja confirmada fora do prazo de cancelamento$")
	public void detalhe_uma_reserva_que_esteja_confirmada_fora_do_prazo_de_cancelamento() throws Throwable {
	    cancelarReserva.detalharResevarForaPrazoCancelamento();
	}

	@Dado("^selecione a opção de Cancelar Reserva$")
	public void selecione_a_opção_de_Cancelar_Reserva() throws Throwable {
	    cancelarReserva.cancelarReserva();
	}

	@Dado("^selecione a quantidade de diárias da cobrança de penalidade$")
	public void selecione_a_quantidade_de_diárias_da_cobrança_de_penalidade() throws Throwable {
	    cancelarReserva.setDiariasPenalizar();
	}

	@Dado("^clique para aceitar as condições da penalidade$")
	public void clique_para_aceitar_as_condições_da_penalidade() throws Throwable {
	    //cancelarReserva.clicarCancelarReserva();
	}

	@Quando("^solicitar o cancelamento da reserva$")
	public void solicitar_o_cancelamento_da_reserva() throws Throwable {
	    cancelarReserva.confirmarCancelamentoReserva();
	}

	@Então("^minha reserva será cancelada com sucesso$")
	public void minha_reserva_será_cancelada_com_sucesso() throws Throwable {
	    cancelarReserva.mensagemSucesso();
	}


}
