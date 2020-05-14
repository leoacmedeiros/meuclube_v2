package stepDefinitions.manterPeriodoUtilizacaoTitulo;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.manterPeriodoUtilizacaoTitulo.AlterarPeriodoUtilizacaoTituloPage;
import pageObjects.menu.MenuPage;

public class AlterarPeriodoUtilizacaoTituloSteps extends BasePage {

	MenuPage menu = new MenuPage();
	AlterarPeriodoUtilizacaoTituloPage alterarPeriodoUtilizacaoTitulo = new AlterarPeriodoUtilizacaoTituloPage();

	@Dado("^que o usuário acesse o menu para alterar o período de utilização do título$")
	public void que_o_usuário_acesse_o_menu_para_alterar_o_período_de_utilização_do_título() throws Throwable {
		menu.periodoUtilizacao();
	}

	@Quando("^alterar o período do título selecionado$")
	public void alterar_o_período_do_título_selecionado(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		alterarPeriodoUtilizacaoTitulo.selecionarTitulo(data.get(0).get(1));
		alterarPeriodoUtilizacaoTitulo.setNovoPeriodo(data.get(0).get(1));
	}

	@Quando("^confirmar a alteração do período do título$")
	public void confirmar_a_alteração_do_período_do_título() throws Throwable {
		alterarPeriodoUtilizacaoTitulo.confirmarAlteracao();
	}

	@Então("^será criado a solicitação de alteração do período do título$")
	public void será_criado_a_solicitação_de_alteração_do_período_do_título() throws Throwable {
		alterarPeriodoUtilizacaoTitulo.mensagemSucesso();
	}

}
