package stepDefinitions.aereoNacional;
import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.aereoNacional.ComprarPassagemAereaComReservaPage;
import pageObjects.menu.MenuPage;
import utils.GeraCpfCnpj;


public class ComprarPassagemAereaComReservaSteps extends BasePage {
	
	MenuPage menu = new MenuPage();
	ComprarPassagemAereaComReservaPage comprarPassagem = new ComprarPassagemAereaComReservaPage();
	GeraCpfCnpj gerador = new GeraCpfCnpj();
	

	@Dado("^que o usuário clique em voos para comprar passagem aérea nacional$")
	public void que_o_usuário_clique_em_voos_para_comprar_passagem_aérea_nacional() throws Throwable {
	    comprarPassagem.clicarVoos();
	}

	@Dado("^escolha a opção para comprar passagem com (\\d+)% de desconto$")
	public void escolha_a_opção_para_comprar_passagem_com_de_desconto(int arg1) throws Throwable {
	    comprarPassagem.selecionarPassagemDesconto();
	}

	@Dado("^escolha a reserva para a qual deseja comprar a passagem$")
	public void escolha_a_reserva_para_a_qual_deseja_comprar_a_passagem() throws Throwable {
	    comprarPassagem.selecionarReserva();
	}

	@Dado("^selecione o aeroporto de destino e clique em confirmar$")
	public void selecione_o_aeroporto_de_destino_e_clique_em_confirmar() throws Throwable {
	    comprarPassagem.selecionarAeroporto();
	}

	@Dado("^clique em próximo para avançar para a tela Origem/Destino$")
	public void clique_em_próximo_para_avançar_para_a_tela_Origem_Destino() throws Throwable {
	    comprarPassagem.clicarProximo();
	}

	@Então("^irá exibir a tela de origem e destino$")
	public void irá_exibir_a_tela_de_origem_e_destino() throws Throwable {
	    comprarPassagem.verificarOrigemDestino();
	}

	@Então("^selecione o aeroporto de origem$")
	public void selecione_o_aeroporto_de_origem(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		comprarPassagem.inserirOrigemVoo(data.get(0).get(1));
	}

	@Então("^selecione a quantidade de passageiros$")
	public void selecione_a_quantidade_de_passageiros(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		comprarPassagem.inserirAdulto(data.get(0).get(1));
		comprarPassagem.inserirCrianca(data.get(1).get(1));
	}

	@Então("^clique em próximo para avançar para a tela Trecho$")
	public void clique_em_próximo_para_avançar_para_a_tela_Trecho() throws Throwable {
	    comprarPassagem.clicarProximo();
	}

	@Então("^irá exibir as cotações das companhias aéreas$")
	public void irá_exibir_as_cotações_das_companhias_aéreas() throws Throwable {
	    comprarPassagem.verificarVoosDisponiveis();
	}

	@Então("^selecione os trechos de ida e volta$")
	public void selecione_os_trechos_de_ida_e_volta() throws Throwable {
	    comprarPassagem.selecionarIda();
	    comprarPassagem.selecionarVolta();
	}

	@Então("^clique para selecionar$")
	public void clique_para_selecionar() throws Throwable {
	    comprarPassagem.selecionarVoos();
	}

	@Então("^escolha o pacote e clique em comprar$")
	public void escolha_o_pacote_e_clique_em_comprar() throws Throwable {
	   comprarPassagem.selecionarPacote();
	   comprarPassagem.comprarVoo();
	}

	@Então("^irá exibir os detalhes da compra$")
	public void irá_exibir_os_detalhes_da_compra() throws Throwable {
	    
	}

	@Então("^preencha os dados do passageiro Adulto$")
	public void preencha_os_dados_do_passageiro_Adulto(DataTable formData) throws Throwable {
		String cpf = gerador.cpf(false);
		List<List<String>> data = formData.raw();
		comprarPassagem.setCpfAdulto(cpf);
		comprarPassagem.setPrimeiroNomeAdulto(data.get(1).get(1)+ " " + geraNome()) ;
		comprarPassagem.setUltimoNomeAdulto(data.get(2).get(1));
		comprarPassagem.setSexoAdulto(data.get(3).get(1));
		comprarPassagem.setDtNascAdulto(data.get(4).get(1));
		comprarPassagem.setEmailAdulto(geraEmailAuto());
		comprarPassagem.setCelularAdulto(data.get(6).get(1));
	}

	@Então("^preencha os dados do passageiro Criança$")
	public void preencha_os_dados_do_passageiro_Criança(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		comprarPassagem.setPrimeiroNomeCrianca(data.get(0).get(1)+ " " + geraNome());
		comprarPassagem.setUltimoNomeCrianca(data.get(1).get(1));
		comprarPassagem.setSexoCrianca(data.get(2).get(1));
		comprarPassagem.setDtNascCrianca(data.get(3).get(1));
		comprarPassagem.setEmailCrianca(geraEmailAuto());
		comprarPassagem.setCelularCrianca(data.get(5).get(1));
	    
	}

	@Então("^clique na opção estou ciente das regras acima$")
	public void clique_na_opção_estou_ciente_das_regras_acima() throws Throwable {
	   comprarPassagem.clicarEstouCienteRegras();
	}

	@Então("^clique no botão informe os dados de pagamento$")
	public void clique_no_botão_informe_os_dados_de_pagamento() throws Throwable {
	   comprarPassagem.clicarInformeDadosPagamento();
	}

	@Então("^irá exibir o formulário dos dados do pagante$")
	public void irá_exibir_o_formulário_dos_dados_do_pagante() throws Throwable {
	    
	}

	@Então("^preencher os dados do pagante$")
	public void preencher_os_dados_do_pagante(DataTable formData) throws Throwable {
		String cpf = gerador.cpf(false);
		List<List<String>> data = formData.raw();
	    comprarPassagem.setCpfPagante(cpf);
	    comprarPassagem.setPrimeiroNomePagante(data.get(1).get(1));
	    comprarPassagem.setUltimoNomePagante(data.get(2).get(1));
	    comprarPassagem.setSexoPagante(data.get(3).get(1));
	    comprarPassagem.setDtNascPagante(data.get(4).get(1));
	    comprarPassagem.setCelularPagante(data.get(5).get(1));
	    comprarPassagem.setEmailPagante(data.get(6).get(1));
	    comprarPassagem.setConfirmacaoEmailPagante(data.get(7).get(1));
	    comprarPassagem.setCepPagante(data.get(8).get(1));
	    comprarPassagem.setNumEndPagante(data.get(9).get(1));
	    comprarPassagem.setCompEndPagante(data.get(10).get(1));
	    comprarPassagem.selecionarCartaoPagante();
	    comprarPassagem.setTitularCartao(data.get(12).get(1));
	    comprarPassagem.setNumCartao(data.get(13).get(1));
	    comprarPassagem.setCodCartao(data.get(14).get(1));
	    comprarPassagem.setMesCartao(data.get(15).get(1));
	    comprarPassagem.setAnoCartao(data.get(16).get(1));
	}

	@Quando("^clicar no botão Parcelar$")
	public void clicar_no_botão_Parcelar() throws Throwable {
	    comprarPassagem.clicarBotaoParcelar();
	}

	@Então("^irá exibir a quantidade de parcelas$")
	public void irá_exibir_a_quantidade_de_parcelas() throws Throwable {
	    
	}

	@Então("^selecionar a quantidade de parcelas$")
	public void selecionar_a_quantidade_de_parcelas() throws Throwable {
	    comprarPassagem.selecionarParcelas();
	}

	@Então("^clicar no botão de Regras$")
	public void clicar_no_botão_de_Regras() throws Throwable {
	    comprarPassagem.clicarRegras();	    
	}

	@Então("^clicar para aceitar as regras tarifárias$")
	public void clicar_para_aceitar_as_regras_tarifárias() throws Throwable {
	    comprarPassagem.clicarAceitarRegrasTarifarias();	    
	}

	@Então("^clicar no botão Aceitar$")
	public void clicar_no_botão_Aceitar() throws Throwable {
	   comprarPassagem.clicarBotaoAceitar();
	}

	@Quando("^clicar no botão Comprar$")
	public void clicar_no_botão_Comprar() throws Throwable {
	   comprarPassagem.clicarBotaoComprar(); 
	}

	@Então("^irá finalizar a compra da passagem aérea$")
	public void irá_finalizar_a_compra_da_passagem_aérea() throws Throwable {
	    
	}

	
	

}
