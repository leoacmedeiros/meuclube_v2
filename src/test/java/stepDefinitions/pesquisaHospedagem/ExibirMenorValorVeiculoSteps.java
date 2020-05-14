package stepDefinitions.pesquisaHospedagem;

import java.util.List;

import org.junit.AfterClass;
import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import pageObjects.pesquisaHospedagem.ExibirMenorValorVeiculoPage;
import pageObjects.reserva.IncluirReservaPage;


public class ExibirMenorValorVeiculoSteps extends BasePage {
	
	ExibirMenorValorVeiculoPage menorValorVeiculo = new ExibirMenorValorVeiculoPage();
	IncluirReservaPage incluirReserva = new IncluirReservaPage();
	
	@Dado("^que eu realize umaa consulta na página inicial por nome da Cidade e Data$")
	public void que_eu_realize_umaa_consulta_na_página_inicial_por_nome_da_Cidade_e_Data(DataTable formData) throws Throwable {
		
		//menorValorVeiculo.paginaInicial();
		List<List<String>> data = formData.raw();
		incluirReserva.setPesquisa(data.get(0).get(1));
		selecionarDataInicioFim(25,28);
		
	}

	@Dado("^acione o botão aplicar para realizar a pesquisa$")
	public void acione_o_botão_aplicar_para_realizar_a_pesquisa() throws Throwable {
		 incluirReserva.clicarBotaoAplicar();
	}

	@Então("^na lista de resultados de hotéis o sistema apresenta o menor valor de locação de veículo$")
	public void na_lista_de_resultados_de_hotéis_o_sistema_apresenta_o_menor_valor_de_locação_de_veículo() throws Throwable {
	    menorValorVeiculo.validarTextoMenorValorVeiculo();
	}


}
