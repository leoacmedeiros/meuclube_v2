package stepDefinitions.pesquisaHospedagem;

import java.util.List;
import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.pesquisaHospedagem.ExibirHoteisPromocaoPage;

public class ExibirHoteisPromocaoSteps extends BasePage {
	
	ExibirHoteisPromocaoPage exibirHoteisPromocao = new ExibirHoteisPromocaoPage();
		
	@Dado("^que eu realize uma pesquisa$")
	public void que_eu_realize_uma_pesquisa(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		exibirHoteisPromocao.setLocalidade(data.get(0).get(1));
		selecionarDataInicioFim(6,9);
		exibirHoteisPromocao.aplicarBusca();
//		exibirHoteisPromocao.setPeriodoInicio(data.get(1).get(1), data.get(2).get(1));
	}
	
	@Quando("^refinar a busca por hóteis que estejam com Promoção$")
	public void refinar_a_busca_por_hóteis_que_estejam_com_Promoção() throws Throwable {
		exibirHoteisPromocao.refinarResultadoPromocao();
	}

	@Então("^serão exibidos hóteis que possuem promoção ativa$")
	public void serão_exibidos_hóteis_que_possuem_promoção_ativa() throws Throwable {
		exibirHoteisPromocao.verificarHoteisPromocao();
	
	}
		

}
