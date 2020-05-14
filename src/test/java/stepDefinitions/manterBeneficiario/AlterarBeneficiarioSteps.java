package stepDefinitions.manterBeneficiario;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.manterBeneficiario.AlterarBeneficiarioPage;
import pageObjects.menu.MenuPage;

public class AlterarBeneficiarioSteps extends BasePage {
	
	MenuPage menu = new MenuPage();
	AlterarBeneficiarioPage alterarBeneficiario = new AlterarBeneficiarioPage();
	
	@Dado("^que o usuário acesse o menu afim de alterar um beneficiario$")
	public void que_o_usuário_acesse_o_menu_afim_de_alterar_um_beneficiario() throws Throwable {
		menu.beneficiarios();
	}

	@Quando("^alterar o beneficiário$")
	public void alterar_o_beneficiário(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		alterarBeneficiario.selecionarBeneficiario(data.get(0).get(1));
	}

	@Quando("^editar os dados$")
	public void editar_os_dados(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		alterarBeneficiario.setNome				(data.get(0).get(1));
		alterarBeneficiario.setVinculo			(data.get(1).get(1));
		alterarBeneficiario.setCpf				(data.get(2).get(1));
		alterarBeneficiario.setDataNascimento	(data.get(3).get(1));
		alterarBeneficiario.setemail			(data.get(4).get(1));
		alterarBeneficiario.setTelefoneCelular	(data.get(5).get(1));
	}

	@Então("^será editado os dados beneficiario$")
	public void será_editado_os_dados_beneficiario() throws Throwable {
		alterarBeneficiario.mensagemSucesso();
	}

}
