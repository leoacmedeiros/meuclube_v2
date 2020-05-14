package stepDefinitions.pesquisaHospedagem;

import java.util.List;
import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import pageObjects.pesquisaHospedagem.OrdenacaoPersonalizadaPage;

public class OrdenacaoPersonalizadaSteps extends BasePage {

	OrdenacaoPersonalizadaPage ordenacaoPersonalizada = new OrdenacaoPersonalizadaPage();

	@Dado("^que realize uma pesquisa pelo nome da cidade na página inicial por Florianópolis$")
	public void que_realize_uma_pesquisa_pelo_nome_da_cidade_na_página_inicial_por_Florianópolis(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		ordenacaoPersonalizada.setPesquisaCidade(data.get(0).get(1));
	}

	@Dado("^na lista de resultados por Florianópolis faça a ordenação por$")
	public void na_lista_de_resultados_por_Florianópolis_faça_a_ordenação_por(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		ordenacaoPersonalizada.ordenarPorConfirmacaoImediata(data.get(2).get(1));
		ordenacaoPersonalizada.ordenarPorConfirmacaoImediata(data.get(3).get(1));
		ordenacaoPersonalizada.ordenarPorConfirmacaoImediata(data.get(1).get(1));
		ordenacaoPersonalizada.ordenarPorConfirmacaoImediata(data.get(0).get(1));		
	}

	@Dado("^que realize uma pesquisa pelo nome da cidade na página inicial por Aracaju$")
	public void que_realize_uma_pesquisa_pelo_nome_da_cidade_na_página_inicial_por_Aracaju(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		ordenacaoPersonalizada.paginaInicial();
		ordenacaoPersonalizada.setPesquisaCidade(data.get(0).get(1));
	}

	@Dado("^na lista de resultados por Aracaju faça a ordenação por$")
	public void na_lista_de_resultados_por_Aracaju_faça_a_ordenação_por(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		ordenacaoPersonalizada.ordenarPorConfirmacaoImediata(data.get(2).get(1));
		ordenacaoPersonalizada.ordenarPorConfirmacaoImediata(data.get(3).get(1));
		ordenacaoPersonalizada.ordenarPorConfirmacaoImediata(data.get(1).get(1));
		ordenacaoPersonalizada.ordenarPorConfirmacaoImediata(data.get(0).get(1));
	}

	@Dado("^que realize uma pesquisa pelo nome da cidade na página inicial por Porto Seguro$")
	public void que_realize_uma_pesquisa_pelo_nome_da_cidade_na_página_inicial_por_Porto_Seguro(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		ordenacaoPersonalizada.paginaInicial();
		ordenacaoPersonalizada.setPesquisaCidade(data.get(0).get(1));
	    
	}

	@Dado("^na lista de resultados por Porto Seguro faça a ordenação por$")
	public void na_lista_de_resultados_por_Porto_Seguro_faça_a_ordenação_por(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		ordenacaoPersonalizada.ordenarPorConfirmacaoImediata(data.get(2).get(1));
		ordenacaoPersonalizada.ordenarPorConfirmacaoImediata(data.get(3).get(1));
		ordenacaoPersonalizada.ordenarPorConfirmacaoImediata(data.get(1).get(1));
		ordenacaoPersonalizada.ordenarPorConfirmacaoImediata(data.get(0).get(1));
	    
	}

	@Então("^o sistema irá realizar a ordenação corretamente$")
	public void o_sistema_irá_realizar_a_ordenação_corretamente() throws Throwable {
	    //fecharBrowser();
	}


}
