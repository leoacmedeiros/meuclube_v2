package stepDefinitions.login;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.login.LoginPage;

public class LoginSteps extends BasePage {
	
	LoginPage loginPage = new LoginPage();

	@Dado("^que eu acesse o sistema Meu Clube$")
	public void que_eu_acesse_o_sistema_Meu_Clube() throws Throwable {
		loginPage.acessarMeuClube();
	}
	
	@Quando("^informar os dados de logon$")
	public void informar_os_dados_de_logon(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		loginPage.setUsuario(data.get(0).get(1));
		loginPage.setSenha(data.get(1).get(1));
		loginPage.entrar();
	}

	@Então("^deverá exibir a tela inicial do sistema$")
	public void deverá_exibir_a_tela_inicial_do_sistema() throws Throwable {
		loginPage.verificaPaginaInicial();
	}

}
