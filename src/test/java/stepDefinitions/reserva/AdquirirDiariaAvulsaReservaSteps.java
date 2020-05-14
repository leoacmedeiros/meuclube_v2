package stepDefinitions.reserva;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.reserva.AdquirirDiariaAvulsaReservaPage;
import pageObjects.reserva.IncluirReservaPage;

public class AdquirirDiariaAvulsaReservaSteps extends BasePage {
	
	IncluirReservaPage incluirReserva = new IncluirReservaPage();
	AdquirirDiariaAvulsaReservaPage adquirirDiariaAvulsa = new AdquirirDiariaAvulsaReservaPage();
		
	@Dado("^que eu realize uma pesquisa de Hotel para adquirir uma Reserva$")
	public void que_eu_realize_uma_pesquisa_de_Hotel_para_adquirir_uma_Reserva(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		adquirirDiariaAvulsa.setPesquisa(data.get(0).get(1));
	}

	@Dado("^selecione a Data Inicial e a Data Final para confirmar a Reserva$")
	public void selecione_a_Data_Inicial_e_a_Data_Final_para_confirmar_a_Reserva() throws Throwable {
		adquirirDiariaAvulsa.selecionarDataDispHotel();
	    
	}

	@Dado("^clique no botão para Buscar o Período Selecionado$")
	public void clique_no_botão_para_Buscar_o_Período_Selecionado() throws Throwable {
	    adquirirDiariaAvulsa.clicarBuscarPeriodoSelecionado();
	}

	@Dado("^na tela de detalhes da Reserva clique em Continuar$")
	public void na_tela_de_detalhes_da_Reserva_clique_em_Continuar() throws Throwable {
	    adquirirDiariaAvulsa.clicarBotaoContinuar();
	}

	@Dado("^informe a quantidade de Diárias Avulas que desejo adquirir$")
	public void informe_a_quantidade_de_Diárias_Avulas_que_desejo_adquirir(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		adquirirDiariaAvulsa.informarQtdDiariasAvulsas(data.get(0).get(1));
	}

	@Dado("^verifique se tem alguma promoção para aceitar$")
	public void verifique_se_tem_alguma_promoção_para_aceitar() throws Throwable {
	    adquirirDiariaAvulsa.verificarPromocao();
	}

	@Dado("^selecione o número de parcelas das Diárias Avulsas para pagamento$")
	public void selecione_o_número_de_parcelas_das_Diárias_Avulsas_para_pagamento(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		adquirirDiariaAvulsa.selecionarQtdParcelas(data.get(0).get(1));
	}

	@Dado("^aceite os temos e políticas$")
	public void aceite_os_temos_e_políticas() throws Throwable {
	    adquirirDiariaAvulsa.clicarCheckAceitoTermos();
	}

	@Dado("^clique no botão Reservar para finalizar a Reserva$")
	public void clique_no_botão_Reservar_para_finalizar_a_Reserva() throws Throwable {
	    adquirirDiariaAvulsa.clicarBotaoSolicitarReserva();
	}

	@Então("^exibirá mensagem de confirmação da Reserva$")
	public void exibirá_mensagem_de_confirmação_da_Reserva() throws Throwable {
	    adquirirDiariaAvulsa.mensagemSucesso();
	}


}
