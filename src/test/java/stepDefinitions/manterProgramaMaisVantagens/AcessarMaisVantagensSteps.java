package stepDefinitions.manterProgramaMaisVantagens;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.manterBeneficiosParaVoce.AcessarMaisVantagensPage;
import pageObjects.menu.MenuPage;

public class AcessarMaisVantagensSteps {

	MenuPage menu = new MenuPage();
	AcessarMaisVantagensPage acessarMaisVantagens = new AcessarMaisVantagensPage();

	@Dado("^que o usuário acesse o menu Benefícios para você$")
	public void que_o_usuário_acesse_o_menu_Benefícios_para_voc_e() throws Throwable {
		menu.beneficiosParaVoce();
	}

	@Quando("^clicar na aba do programa Mais Vantagens$")
	public void clicar_na_aba_do_programa_Mais_Vantagens() throws Throwable {
		acessarMaisVantagens.acessarMaisVantagens();
	}

	@Quando("^obter Mais Informações$")
	public void obter_Mais_Informações() throws Throwable {
		acessarMaisVantagens.obterMaisInformacoesBeneficio();
	}
	
	@Então("^será direcionado para a tela do programa Mais Vantagens$")
	public void será_direcionado_para_a_tela_do_programa_Mais_Vantagens() throws Throwable {
	}
	//
	// @Dado("^que o usuário acesse o menu do programa Mais Vantagens$")
	// public void que_o_usuário_acesse_o_menu_do_programa_Mais_Vantagens() throws
	// Throwable {
	// menu.maisVantagens();
	// }
	//
	// @Quando("^clicar no card do programa$")
	// public void clicar_no_card_do_programa() throws Throwable {
	// acessarMaisVantagens.acessarMaisVantagens();
	// }
	//
	// @Então("^será direcionado para a tela do programa Mais Vantagens$")
	// public void será_direcionado_para_a_tela_do_programa_Mais_Vantagens() throws
	// Throwable {
	// }
	//
}