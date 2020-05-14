package stepDefinitions.manterCategoriaTitulo;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.manterCategoriaTitulo.AlterarCategoriaTituloPage;
import pageObjects.menu.MenuPage;

public class AlterarCategoriaTituloSteps extends BasePage {

	MenuPage menu = new MenuPage();
	AlterarCategoriaTituloPage alterarCategoriaTitulo = new AlterarCategoriaTituloPage();

	@Dado("^que o usuário acesse o menu para alterar a categoria do título$")
	public void que_o_usuário_acesse_o_menu_para_alterar_a_categoria_do_título() throws Throwable {
		menu.alterarCategoriaTitulo();
	}

	@Quando("^alterar a categoria do título selecionado$")
	public void alterar_a_categoria_do_título_selecionado(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		alterarCategoriaTitulo.selecionarTitulo			(data.get(0).get(1));
		alterarCategoriaTitulo.setCategoriaPretendida	(data.get(0).get(1), data.get(1).get(1));
	}

	@Quando("^confirmar a alteração de categoria do título$")
	public void confirmar_a_alteração_de_categoria_do_título() throws Throwable {
		alterarCategoriaTitulo.confirmarAlteracao();
	}

	@Então("^será criado a solicitação de alteração da categoria do título$")
	public void será_criado_a_solicitação_de_alteração_da_categoria_do_título() throws Throwable {
		alterarCategoriaTitulo.mensagemSucesso();
	}

}
