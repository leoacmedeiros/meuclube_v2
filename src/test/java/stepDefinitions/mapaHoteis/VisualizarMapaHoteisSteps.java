package stepDefinitions.mapaHoteis;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.mapaHoteis.VisualizarMapaHoteisPage;

public class VisualizarMapaHoteisSteps {

	VisualizarMapaHoteisPage visualizarMapaHoteis = new VisualizarMapaHoteisPage();

	@Dado("^que eu realize uma pesquisa por localidade$")
	public void que_eu_realize_uma_pesquisa_por_localidade(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		visualizarMapaHoteis.setPesquisa(data.get(0).get(1));
		visualizarMapaHoteis.clicarBotaoAplicar();
	}

	@Quando("^clicar para visualizar mapa$")
	public void clicar_para_visualizar_mapa() throws Throwable {
		visualizarMapaHoteis.visualizarMapa();
	}

	@Então("^será exibido no mapa os hotéis da localidade pesquisada$")
	public void será_exibido_no_mapa_os_hotéis_da_localidade_pesquisada() throws Throwable {
		visualizarMapaHoteis.verificaPaginaMapa();
		visualizarMapaHoteis.visualizarHotelMapa();
	}

}
