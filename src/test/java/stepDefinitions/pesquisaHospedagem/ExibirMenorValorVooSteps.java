package stepDefinitions.pesquisaHospedagem;

import java.util.List;
import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import pageObjects.pesquisaHospedagem.ExibirMenorValorVooPage;
import pageObjects.reserva.IncluirReservaPage;

public class ExibirMenorValorVooSteps extends BasePage {

	IncluirReservaPage incluirReserva = new IncluirReservaPage();
	ExibirMenorValorVooPage menorValorVoo = new ExibirMenorValorVooPage();
	
	@Dado("^que eu realize a consulta na página inicial por nome da Cidade e Data$")
	public void que_eu_realize_a_consulta_na_página_inicial_por_nome_da_Cidade_e_Data(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirReserva.setPesquisa(data.get(0).get(1));
		selecionarDataInicioFim(25,28);
		
	}

	@Dado("^acione a pesquisa$")
	public void acione_a_pesquisa() throws Throwable {
	    incluirReserva.clicarBotaoAplicar();
	}

	@Então("^na lista de resultados de hotéis o sistema apresenta o menor valor de voo$")
	public void na_lista_de_resultados_de_hotéis_o_sistema_apresenta_o_menor_valor_de_voo() throws Throwable {
	    menorValorVoo.validarTextoCompleteReservaVoo();
	    //fecharBrowser();
	}


}
