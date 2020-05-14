package stepDefinitions.manterDadosContato;

import core.BasePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import pageObjects.manterDadosContato.VerificarDadosContatoPage;
import pageObjects.menu.MenuPage;

public class VerificarDadosContatoSteps extends BasePage {
	
	MenuPage menu = new MenuPage();
	VerificarDadosContatoPage verificarDadosContato = new VerificarDadosContatoPage();

	@Dado("^que o usuário acesse o menu para verificar os dados de contato da Central de Atendimento$")
	public void que_o_usuário_acesse_o_menu_para_verificar_os_dados_de_contato_da_Central_de_Atendimento() throws Throwable {
		menu.faleConosco();
	}

	@Então("^será apresentado as informações da Central de Atendimento$")
	public void será_apresentado_as_informações_da_Central_de_Atendimento() throws Throwable {
		verificarDadosContato.verificarCentralAtendimento();
		verificarDadosContato.verificarSuporteHospedagem();
		verificarDadosContato.verificarSac();
	}

}
