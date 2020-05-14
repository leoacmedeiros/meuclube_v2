package stepDefinitions.manterTransferenciaTitulo;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.manterTransferenciaTitulo.TransferirTituloPage;
import pageObjects.menu.MenuPage;

public class TransferirTituloSteps extends BasePage {
	
	MenuPage menu = new MenuPage();
	TransferirTituloPage transferirTitulo = new TransferirTituloPage();

	@Dado("^que o usuário acesse o menu para transferir títulos$")
	public void que_o_usuário_acesse_o_menu_para_transferir_títulos() throws Throwable {
		menu.transferirTitulo();
	}

	@Quando("^selecionar o título que deseja transferir$")
	public void selecionar_o_título_que_deseja_transferir(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		transferirTitulo.selecionarTitulo(data.get(0).get(1));
	}

	@Quando("^informar os dados para quem quer transferir$")
	public void informar_os_dados_para_quem_quer_transferir(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		transferirTitulo.setTipoPessoa		(data.get(0).get(1), data.get(1).get(1));
		transferirTitulo.setNome			(data.get(0).get(1), data.get(2).get(1));
		transferirTitulo.setRg				(data.get(0).get(1), data.get(3).get(1), data.get(4).get(1));
		transferirTitulo.setDataNascimento	(data.get(0).get(1), data.get(5).get(1));
		transferirTitulo.setSexo			(data.get(0).get(1), data.get(6).get(1));
		transferirTitulo.setEstadoCivil		(data.get(0).get(1), data.get(7).get(1));
		transferirTitulo.setTelefoneCelular	(data.get(8).get(1));
		transferirTitulo.setTelefone		(data.get(0).get(1), data.get(9).get(1));
		transferirTitulo.setEmail			(data.get(10).get(1));
		transferirTitulo.setCep				(data.get(11).get(1));
		transferirTitulo.setComplemento		(data.get(12).get(1));
		transferirTitulo.setCidadeNatural	(data.get(0).get(1), data.get(13).get(1));
		transferirTitulo.setUfNatural		(data.get(0).get(1), data.get(14).get(1));
	}

	@Quando("^informar os dados para pagamento$")
	public void informar_os_dados_para_pagamento(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		transferirTitulo.setTipoPagamento	(data.get(0).get(1), data.get(1).get(1), data.get(4).get(1));
		transferirTitulo.setAgencia			(data.get(0).get(1), data.get(2).get(1));
		transferirTitulo.setConta			(data.get(0).get(1), data.get(3).get(1));
		transferirTitulo.setValidadeCartao	(data.get(0).get(1), data.get(5).get(1), data.get(6).get(1));
		transferirTitulo.setDiaDebito		(data.get(7).get(1));
	}

	@Quando("^inserir observações$")
	public void inserir_observações(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		transferirTitulo.setObservacoes		(data.get(0).get(1));
	}

	@Quando("^avançar$")
	public void avançar() throws Throwable {
		transferirTitulo.avancar();
	}
	
	@Quando("^confirmar Transferência de título$")
	public void confirmar_Transferência_de_título() throws Throwable {
	 	transferirTitulo.confirmar();
	}
	
	@Então("^será criado o termo para Transferir o título$")
	public void será_criado_o_termo_para_Transferir_o_título() throws Throwable {
		transferirTitulo.mensagemSucesso();
	}

}
