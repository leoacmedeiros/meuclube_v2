package stepDefinitions.manterBeneficiario;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.manterBeneficiario.AlterarSituacaoBeneficiarioPage;
import pageObjects.menu.MenuPage;

public class AlterarSituacaoBeneficiarioSteps extends BasePage {

	MenuPage menu = new MenuPage();
	AlterarSituacaoBeneficiarioPage alterarSituacaoBeneficiario = new AlterarSituacaoBeneficiarioPage();

	@Dado("^que o usuário acesse o menu para altear a situação de um beneficiario$")
	public void que_o_usuário_acesse_o_menu_para_altear_a_situação_de_um_beneficiario() throws Throwable {
		menu.beneficiarios();
	}

	@Quando("^alterar a situação beneficiário$")
	public void alterar_a_situação_beneficiário(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		alterarSituacaoBeneficiario.alterarSituacao(data.get(0).get(1));

	}

	@Então("^será alterado a situação do beneficiario$")
	public void será_alterado_a_situação_do_beneficiario() throws Throwable {
		alterarSituacaoBeneficiario.mensagemSucesso();
	}

}
