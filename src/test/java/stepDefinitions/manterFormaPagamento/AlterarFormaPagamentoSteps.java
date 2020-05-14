package stepDefinitions.manterFormaPagamento;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.manterFormaPagamento.AlterarFormaPagamentoPage;
import pageObjects.menu.MenuPage;

public class AlterarFormaPagamentoSteps extends BasePage {

	MenuPage menu = new MenuPage();
	AlterarFormaPagamentoPage alterarFormaPagamento = new AlterarFormaPagamentoPage();

	@Dado("^que o usuário acesse o menu para alterar a forma de pagamento$")
	public void que_o_usuário_acesse_o_menu_para_alterar_a_forma_de_pagamento() throws Throwable {
		menu.formaPagamento();
	}

	@Quando("^selecionar outra forma de pagamento$")
	public void selecionar_outra_forma_de_pagamento(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		alterarFormaPagamento.alterarConta();
		alterarFormaPagamento.selecionarNovoMeioPagamento(data.get(0).get(1), data.get(1).get(1), data.get(2).get(1),
														  data.get(3).get(1), data.get(0).get(1), data.get(5).get(1));
	}
	
	@Quando("^alterar$")
	public void alterar() throws Throwable {
		alterarFormaPagamento.alterar();
	}

	@Então("^será modificado a forma de pagamento do título$")
	public void será_modificado_a_forma_de_pagamento_do_título() throws Throwable {
		alterarFormaPagamento.mensagemSucesso();
	}

}
