package stepDefinitions.manterBeneficiario;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.manterBeneficiario.AdicionarBeneficiarioPage;
import pageObjects.menu.MenuPage;

public class AdicionarBeneficiarioSteps extends BasePage {
	
	MenuPage menu = new MenuPage();
	AdicionarBeneficiarioPage adicionarBeneficiario = new AdicionarBeneficiarioPage();
	
	@Dado("^que o usuário acesse o menu afim de adicionar um beneficiario$")
	public void que_o_usuário_acesse_o_menu_afim_de_adicionar_um_beneficiario() throws Throwable {
		menu.beneficiarios();
	}

	@Quando("^preencher o formulario$")
	public void preencher_o_formulario(DataTable formData) throws Throwable {
		adicionarBeneficiario.adicionar();
		List<List<String>> data = formData.raw();
		adicionarBeneficiario.setNome			(data.get(0).get(1));
		adicionarBeneficiario.setVinculo		(data.get(1).get(1));
		adicionarBeneficiario.setCpf			(data.get(2).get(1));
		adicionarBeneficiario.setDataNascimento	(data.get(3).get(1));
		adicionarBeneficiario.setemail			(data.get(4).get(1));
		adicionarBeneficiario.setTelefoneCelular(data.get(5).get(1));
	}
	
	@Quando("^salvar o beneficiario$")
	public void salvar_o_beneficiario() throws Throwable {
		adicionarBeneficiario.salvarBeneficiario();
	}

	@Então("^será adicionado o novo beneficiario$")
	public void será_adicionado_o_novo_beneficiario() throws Throwable {
		adicionarBeneficiario.mensagemSucesso();
	}

}
