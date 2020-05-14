package stepDefinitions.manterFormaPagamento;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.manterFormaPagamento.AdicionarFormaPagamentoPage;
import pageObjects.menu.MenuPage;

public class AdicionarFormaPagamentoSteps extends BasePage {
	
	MenuPage menu = new MenuPage();
	AdicionarFormaPagamentoPage adicionarFormaPagamento = new AdicionarFormaPagamentoPage();
	
	@Dado("^que o usuário acesse o menu para cadastrar uma nova forma de pagamento$")
	public void que_o_usuário_acesse_o_menu_para_cadastrar_uma_nova_forma_de_pagamento() throws Throwable {
		menu.formaPagamento();
	}
	
	@Quando("^alterar o título$")
	public void alterar_o_título(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		adicionarFormaPagamento.selecionarTitulo(data.get(0).get(1));
	}

	@Quando("^adicionar nova forma de pagamento$")
	public void adicionar_nova_forma_de_pagamento(DataTable formData) throws Throwable {
		adicionarFormaPagamento.inserirNovaFormaPagamento();
		List<List<String>> data = formData.raw();
		adicionarFormaPagamento.setFormaPagamento	(data.get(0).get(1), data.get(1).get(1), data.get(4).get(1));
		adicionarFormaPagamento.setAgencia			(data.get(0).get(1), data.get(2).get(1));
		adicionarFormaPagamento.setConta			(data.get(0).get(1), data.get(3).get(1));
		adicionarFormaPagamento.setValidadeCartao	(data.get(0).get(1), data.get(5).get(1), data.get(6).get(1));
	}
	
	@Quando("^adicionar$")
	public void adicionar() throws Throwable {
		adicionarFormaPagamento.adicionar();
	}

	@Então("^será adicionado a nova forma de pagamento$")
	public void será_adicionado_a_nova_forma_de_pagamento() throws Throwable {
		adicionarFormaPagamento.mensagemSucesso();
	}

}
