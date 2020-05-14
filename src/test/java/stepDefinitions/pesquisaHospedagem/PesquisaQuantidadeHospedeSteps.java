package stepDefinitions.pesquisaHospedagem;

import java.util.List;
import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import pageObjects.pesquisaHospedagem.PesquisaQuantidadeHospedePage;

public class PesquisaQuantidadeHospedeSteps extends BasePage {

	PesquisaQuantidadeHospedePage quantidadeHospede = new PesquisaQuantidadeHospedePage();

	@Dado("^que insira uma nome da Cidade para pesquisar$")
	public void que_insira_uma_nome_da_Cidade_para_pesquisar(DataTable formData) throws Throwable {
	    List<List<String>> data = formData.raw();
	    quantidadeHospede.setPesquisaCidade(data.get(0).get(1));
	}

	@Dado("^no campo de pesquisa de quartos e hóspedes informe a quantidade de adultos, menores de (\\d+) anos e idade dos menores no quarto (\\d+)$")
	public void no_campo_de_pesquisa_de_quartos_e_hóspedes_informe_a_quantidade_de_adultos_menores_de_anos_e_idade_dos_menores_no_quarto(int arg1, int arg2, DataTable formData) throws Throwable {
	    List<List<String>> data = formData.raw();
		quantidadeHospede.hospedeQuarto1(data.get(0).get(1), data.get(1).get(1), data.get(2).get(1), data.get(3).get(1));
		
	}

	@Dado("^acione a opção de Adicionar Quarto$")
	public void acione_a_opção_de_Adicionar_Quarto() throws Throwable {
	    quantidadeHospede.adicionarQuarto();
	}

	@Dado("^informe a quantidade de adultos, menores de (\\d+) anos e idade do menor no quarto (\\d+)$")
	public void informe_a_quantidade_de_adultos_menores_de_anos_e_idade_do_menor_no_quarto(int arg1, int arg2, DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		quantidadeHospede.hospedeQuarto2(data.get(0).get(1), data.get(1).get(1), data.get(2).get(1));
	    
	}

	@Dado("^acione a opção de Adicionar mais um Quarto$")
	public void acione_a_opção_de_Adicionar_mais_um_Quarto() throws Throwable {
		quantidadeHospede.adicionarQuarto();
	}

	@Dado("^informe a quantidade de adultos, menores de (\\d+) anos e idade dos menores no quarto (\\d+)$")
	public void informe_a_quantidade_de_adultos_menores_de_anos_e_idade_dos_menores_no_quarto(int arg1, int arg2, DataTable formData) throws Throwable {
	    List<List<String>> data = formData.raw();
	    quantidadeHospede.hospedeQuarto3(data.get(0).get(1), data.get(1).get(1), data.get(2).get(1), data.get(3).get(1));
	}

	@Dado("^clique no botão para Fechar as opções de adição dos quartos$")
	public void clique_no_botão_para_Fechar_as_opções_de_adição_dos_quartos() throws Throwable {
	    quantidadeHospede.clicarFecharHospedeQuarto();
	}

	@Dado("^clique no botão Aplicar para realizar a pesquisa$")
	public void clique_no_botão_Aplicar_para_realizar_a_pesquisa() throws Throwable {
	    quantidadeHospede.clicarBotaoAplicar();
	}

	@Então("^o sistema irá exibir os resultados dos hotéis disponíveis para a pesquisa realizada$")
	public void o_sistema_irá_exibir_os_resultados_dos_hotéis_disponíveis_para_a_pesquisa_realizada() throws Throwable {
	    quantidadeHospede.verificarResultadosPesquisa();
	    //fecharBrowser();
	}



}
