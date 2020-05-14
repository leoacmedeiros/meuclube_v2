package stepDefinitions.manterTitulos;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.manterTitulos.ReativarTituloPage;
import pageObjects.menu.MenuPage;

public class ReativarTituloSteps extends BasePage {
	
	MenuPage menu = new MenuPage();
	ReativarTituloPage reativarTitulo = new ReativarTituloPage();
	
	@Dado("^que o usuário acesse o menu para reativar um título cancelado$")
	public void que_o_usuário_acesse_o_menu_para_reativar_um_título_cancelado() throws Throwable {
		menu.reativarTitulo();
	}

	@Quando("^selecionar o título$")
	public void selecionar_o_título(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		reativarTitulo.selecionarTitulo(data.get(0).get(1));
	}

	@Quando("^selecionar forma de pagamento$")
	public void selecionar_forma_de_pagamento(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		reativarTitulo.setDadoPagamento	(data.get(0).get(1), data.get(1).get(1), data.get(2).get(1),
				  						 data.get(3).get(1), data.get(0).get(1), data.get(5).get(1));
	}

	@Quando("^selecionar dia de débito$")
	public void selecionar_dia_de_débito(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		reativarTitulo.setDiaDebito(data.get(0).get(1));
	}

	@Quando("^aceitar termo de ciencia$")
	public void aceitar_termo_de_ciencia() throws Throwable {
		reativarTitulo.setSolicitarAnalise();
		reativarTitulo.avancar();
		reativarTitulo.cienteAviso();
	}

	@Então("^será criado a solicitação para reativar o título$")
	public void será_criado_a_solicitação_para_reativar_o_título() throws Throwable {
	}

}
