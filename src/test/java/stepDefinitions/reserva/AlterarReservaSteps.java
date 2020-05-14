package stepDefinitions.reserva;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.reserva.AlterarReservaPage;


public class AlterarReservaSteps extends BasePage {
	
	AlterarReservaPage alterarReserva = new AlterarReservaPage();
		
	@Dado("^selecione uma reserva que esteja com a situação Reserva Confirmada$")
	public void selecione_uma_reserva_que_esteja_com_a_situação_Reserva_Confirmada() throws Throwable {
	    alterarReserva.detalharReservaConfirmada();
	}

	@Dado("^selecione a opção Alterar Reserva$")
	public void selecione_a_opção_Alterar_Reserva() throws Throwable {
		alterarReserva.clicarAlterarReserva();
	    
	}

	@Quando("^informar os dados para Alteração$")
	public void informar_os_dados_para_Alteração() throws Throwable {
		alterarReserva.selecionarData();
		alterarReserva.prosseguirRevisao();
		alterarReserva.continuar();
		alterarReserva.informarQtdDiarias("1");
		alterarReserva.clicarCheckAceitoTermos();
		alterarReserva.clicarReservar();
	}

	@Então("^o sistema irá salvar os dados alterados$")
	public void o_sistema_irá_salvar_os_dados_alterados() throws Throwable {
	    alterarReserva.mensagemSucesso();
	    alterarReserva.validarMenorPrecoVoo();
	    alterarReserva.validarMenorPrecoCarro();
	}

}
