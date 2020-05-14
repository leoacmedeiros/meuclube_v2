package stepDefinitions.manterIndicacaoPremiada;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.manterIndicacaoPremiada.RealizarIndicacaoPremiadaPage;
import pageObjects.menu.MenuPage;

public class RealizarIndicacaoPremiadaSteps {
	
	MenuPage menu = new MenuPage();
	RealizarIndicacaoPremiadaPage realizarIndicacaoPremiada = new RealizarIndicacaoPremiadaPage();
	
	@Dado("^que o usuário acesse o menu para realizar uma indicação$")
	public void que_o_usuário_acesse_o_menu_para_realizar_uma_indicação() throws Throwable {
		menu.indicacaoPremiada();
	}

	@Quando("^clicar no card$")
	public void clicar_no_card() throws Throwable {
		realizarIndicacaoPremiada.acessarProgamaIndicacao();
	}

	@Então("^será direcionado para a tela do programa$")
	public void será_direcionado_para_a_tela_do_programa() throws Throwable {
	}
	
	@Quando("^preencher o formulario de indicação$")
	public void preencher_o_formulario_de_indicação(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		realizarIndicacaoPremiada.setTipoPessoaIndicado	(data.get(0).get(1));
		realizarIndicacaoPremiada.setNomeIndicado		(data.get(1).get(1));
		realizarIndicacaoPremiada.setEmailIndicado		(data.get(2).get(1));
		realizarIndicacaoPremiada.setDocumentoIndicado	(data.get(0).get(1), data.get(3).get(1));
		realizarIndicacaoPremiada.setTelefoneIndicado	(data.get(4).get(1));
		realizarIndicacaoPremiada.setCelularIndicado	(data.get(5).get(1));
		realizarIndicacaoPremiada.setUfIndicado			(data.get(6).get(1));
	}
	
}
