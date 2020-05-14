package stepDefinitions.manterTitulos;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.manterTitulos.AdquirirTituloPage;
import pageObjects.menu.MenuPage;

public class AdquirirTituloSteps extends BasePage {

	MenuPage menu = new MenuPage();
	AdquirirTituloPage adquirirTitulo = new AdquirirTituloPage();

	@Dado("^que o usuario acesse o menu para aquisição de títulos$")
	public void que_o_usuario_acesse_o_menu_para_aquisição_de_títulos() throws Throwable {
		menu.adquirirTitulo();
	}

	@Dado("^crie uma nova proposta$")
	public void crie_uma_nova_proposta() throws Throwable {
		adquirirTitulo.criarProposta();
	}

	@Quando("^informar a categoria e quantidade de títulos que deseja adquirir$")
	public void informar_a_categoria_e_quantidade_de_títulos_que_deseja_adquirir(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		adquirirTitulo.setTitulo(data.get(0).get(1), data.get(1).get(1));
	}

	@Então("^prosseguir$")
	public void prosseguir() throws Throwable {
		adquirirTitulo.prosseguir();
	}

	@Quando("^selecionar os dados para pagamento$")
	public void selecionar_os_dados_para_pagamento(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		adquirirTitulo.setDadoPagamento(data.get(0).get(1), data.get(1).get(1), data.get(2).get(1), data.get(3).get(1));		
	}

	@Quando("^selecionar o dia de débito$")
	public void selecionar_o_dia_de_débito(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		adquirirTitulo.setDiaDebito(data.get(0).get(1));
	}

	@Quando("^avançar e aceitar os termos de uso$")
	public void avançar_e_aceitar_os_termos_de_uso() throws Throwable {
		adquirirTitulo.aceitarTermoAquisicao();
		adquirirTitulo.avancar();
		adquirirTitulo.aceitarRegimentoInterno();
		adquirirTitulo.confirmarAquisicao();
	}

	@Então("^será criada a proposta$")
	public void será_criada_a_proposta() throws Throwable {
		adquirirTitulo.mensagemSucesso();
	}

}
