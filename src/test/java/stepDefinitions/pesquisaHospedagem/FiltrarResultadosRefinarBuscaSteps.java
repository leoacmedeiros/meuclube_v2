package stepDefinitions.pesquisaHospedagem;

import java.util.List;
import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.pesquisaHospedagem.FiltrarResultadosRefinarBuscaPage;

public class FiltrarResultadosRefinarBuscaSteps extends BasePage {

	FiltrarResultadosRefinarBuscaPage refinarBusca = new FiltrarResultadosRefinarBuscaPage();

	@Dado("^que eu realize uma pesquisa válida na página inicial pela Capital$")
	public void que_eu_realize_uma_pesquisa_válida_na_página_inicial_pela_Capital(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		refinarBusca.setPesquisa(data.get(0).get(1));
		refinarBusca.clicarBotaoAplicar();
	}

	@Dado("^na tela com os resultados da pesquisa selecione os filtros para refinar a busca$")
	public void na_tela_com_os_resultados_da_pesquisa_selecione_os_filtros_para_refinar_a_busca() throws Throwable {
		refinarBusca.menuLateralFiltrarResultados();
	}

	@Quando("^clicar no filtro Academia$")
	public void clicar_no_filtro_Academia() throws Throwable {
		refinarBusca.selecionarFiltro("Academia");
	}

	@Então("^deverá exibir os resultados do filtro Academia$")
	public void deverá_exibir_os_resultados_do_filtro_Academia() throws Throwable {
		refinarBusca.validarResultadoFiltro("Academia");
	}

	@Quando("^clicar no filtro Ar-condicionado$")
	public void clicar_no_filtro_Ar_condicionado() throws Throwable {
		refinarBusca.selecionarFiltro("Ar-condicionado");
	}

	@Então("^deverá exibir os resultados do filtro Ar-condicionado$")
	public void deverá_exibir_os_resultados_do_filtro_Ar_condicionado() throws Throwable {
		refinarBusca.validarResultadoFiltro("Ar-condicionado");
	}

	@Quando("^clicar no filtro Baby Copa$")
	public void clicar_no_filtro_Baby_Copa() throws Throwable {
		refinarBusca.selecionarFiltro("Baby Copa");
	}

	@Então("^deverá exibir os resultados do filtro Baby Copa$")
	public void deverá_exibir_os_resultados_do_filtro_Baby_Copa() throws Throwable {
		refinarBusca.validarResultadoFiltro("Baby Copa");
	}

	@Quando("^clicar no filtro Brinquedoteca$")
	public void clicar_no_filtro_Brinquedoteca() throws Throwable {
		refinarBusca.selecionarFiltro("Brinquedoteca");
	}

	@Então("^deverá exibir os resultados do filtro Brinquedoteca$")
	public void deverá_exibir_os_resultados_do_filtro_Brinquedoteca() throws Throwable {
		refinarBusca.validarResultadoFiltro("Brinquedoteca");
	}

	@Quando("^clicar no filtro Calefação$")
	public void clicar_no_filtro_Calefação() throws Throwable {
		refinarBusca.selecionarFiltro("Calefação");
	}

	@Então("^deverá exibir os resultados do filtro Calefação$")
	public void deverá_exibir_os_resultados_do_filtro_Calefação() throws Throwable {
		refinarBusca.validarResultadoFiltro("Calefação");
	}

	@Quando("^clicar no filtro Cama extra$")
	public void clicar_no_filtro_Cama_extra() throws Throwable {
		refinarBusca.selecionarFiltro("Cama extra (Requer solicitação)");
	}

	@Então("^deverá exibir os resultados do filtro Cama extra$")
	public void deverá_exibir_os_resultados_do_filtro_Cama_extra() throws Throwable {
		refinarBusca.validarResultadoFiltro("Cama extra (Requer solicitação)");
	}

	@Quando("^clicar no filtro Cofre$")
	public void clicar_no_filtro_Cofre() throws Throwable {
		refinarBusca.selecionarFiltro("Cofre");
	}

	@Então("^deverá exibir os resultados do filtro Cofre$")
	public void deverá_exibir_os_resultados_do_filtro_Cofre() throws Throwable {
		refinarBusca.validarResultadoFiltro("Cofre");
	}

	@Quando("^clicar no filtro Cozinha$")
	public void clicar_no_filtro_Cozinha() throws Throwable {
		refinarBusca.selecionarFiltro("Cozinha");
	}

	@Então("^deverá exibir os resultados do filtro Cozinha$")
	public void deverá_exibir_os_resultados_do_filtro_Cozinha() throws Throwable {
		refinarBusca.validarResultadoFiltro("Cozinha");
	}

	@Quando("^clicar no filtro Criança acomodada em cama extra$")
	public void clicar_no_filtro_Criança_acomodada_em_cama_extra() throws Throwable {
		refinarBusca.selecionarFiltro("Criança acomodada em cama extra");
	}

	@Então("^deverá exibir os resultados do filtro Criança acomodada em cama extra$")
	public void deverá_exibir_os_resultados_do_filtro_Criança_acomodada_em_cama_extra() throws Throwable {
		refinarBusca.validarResultadoFiltro("Criança acomodada em cama extra");
	}

	@Quando("^clicar no filtro Criança acomodada na cama dos pais$")
	public void clicar_no_filtro_Criança_acomodada_na_cama_dos_pais() throws Throwable {
		refinarBusca.selecionarFiltro("Criança acomodada na cama dos pais");
	}

	@Então("^deverá exibir os resultados do filtro Criança acomodada na cama dos pais$")
	public void deverá_exibir_os_resultados_do_filtro_Criança_acomodada_na_cama_dos_pais() throws Throwable {
		refinarBusca.validarResultadoFiltro("Criança acomodada na cama dos pais");
	}

	@Quando("^clicar no filtro Elevador$")
	public void clicar_no_filtro_Elevador() throws Throwable {
		refinarBusca.selecionarFiltro("Elevador");
	}

	@Então("^deverá exibir os resultados do filtro Elevador$")
	public void deverá_exibir_os_resultados_do_filtro_Elevador() throws Throwable {
		refinarBusca.validarResultadoFiltro("Elevador");
	}

	@Quando("^clicar no filtro Estacionamento$")
	public void clicar_no_filtro_Estacionamento() throws Throwable {
		refinarBusca.selecionarFiltro("Estacionamento");
	}

	@Então("^deverá exibir os resultados do filtro Estacionamento$")
	public void deverá_exibir_os_resultados_do_filtro_Estacionamento() throws Throwable {
		refinarBusca.validarResultadoFiltro("Estacionamento");
	}

	@Quando("^clicar no filtro Frigobar$")
	public void clicar_no_filtro_Frigobar() throws Throwable {
		refinarBusca.selecionarFiltro("Frigobar");
	}

	@Então("^deverá exibir os resultados do filtro Frigobar$")
	public void deverá_exibir_os_resultados_do_filtro_Frigobar() throws Throwable {
		refinarBusca.validarResultadoFiltro("Frigobar");
	}

	@Quando("^clicar no filtro Internet$")
	public void clicar_no_filtro_Internet() throws Throwable {
		refinarBusca.selecionarFiltro("Internet");
	}

	@Então("^deverá exibir os resultados do filtro Internet$")
	public void deverá_exibir_os_resultados_do_filtro_Internet() throws Throwable {
		refinarBusca.validarResultadoFiltro("Internet");
	}

	@Quando("^clicar no filtro Kids Club$")
	public void clicar_no_filtro_Kids_Club() throws Throwable {
		refinarBusca.selecionarFiltro("Kids Club");
	}

	@Então("^deverá exibir os resultados do filtro Kids Club$")
	public void deverá_exibir_os_resultados_do_filtro_Kids_Club() throws Throwable {
		refinarBusca.validarResultadoFiltro("Kids Club");
	}

	@Quando("^clicar no filtro Micro-ondas$")
	public void clicar_no_filtro_Micro_ondas() throws Throwable {
		refinarBusca.selecionarFiltro("Micro-ondas");
	}

	@Então("^deverá exibir os resultados do filtro Micro-ondas$")
	public void deverá_exibir_os_resultados_do_filtro_Micro_ondas() throws Throwable {
		refinarBusca.validarResultadoFiltro("Micro-ondas");
	}

	@Quando("^clicar no filtro Permite Animais$")
	public void clicar_no_filtro_Permite_Animais() throws Throwable {
		refinarBusca.selecionarFiltro("Permite Animais");
	}

	@Então("^deverá exibir os resultados do filtro Permite Animais$")
	public void deverá_exibir_os_resultados_do_filtro_Permite_Animais() throws Throwable {
		refinarBusca.validarResultadoFiltro("Permite Animais");
	}

	@Quando("^clicar no filtro Piscina$")
	public void clicar_no_filtro_Piscina() throws Throwable {
		refinarBusca.selecionarFiltro("Piscina");
	}

	@Então("^deverá exibir os resultados do filtro Piscina$")
	public void deverá_exibir_os_resultados_do_filtro_Piscina() throws Throwable {
		refinarBusca.validarResultadoFiltro("Piscina");
	}

	@Quando("^clicar no filtro Piso Frio$")
	public void clicar_no_filtro_Piso_Frio() throws Throwable {
		refinarBusca.selecionarFiltro("Piso Frio");
	}

	@Então("^deverá exibir os resultados do filtro Piso Frio$")
	public void deverá_exibir_os_resultados_do_filtro_Piso_Frio() throws Throwable {
		refinarBusca.validarResultadoFiltro("Piso Frio");
	}

	@Quando("^clicar no filtro Quarto Adaptado$")
	public void clicar_no_filtro_Quarto_Adaptado() throws Throwable {
		refinarBusca.selecionarFiltro("Quarto Adaptado");
	}

	@Então("^deverá exibir os resultados do filtro Quarto Adaptado$")
	public void deverá_exibir_os_resultados_do_filtro_Quarto_Adaptado() throws Throwable {
		refinarBusca.validarResultadoFiltro("Quarto Adaptado");
	}

	@Quando("^clicar no filtro Restaurante$")
	public void clicar_no_filtro_Restaurante() throws Throwable {
		refinarBusca.selecionarFiltro("Restaurante");
	}

	@Então("^deverá exibir os resultados do filtro Restaurante$")
	public void deverá_exibir_os_resultados_do_filtro_Restaurante() throws Throwable {
		refinarBusca.validarResultadoFiltro("Restaurante");
	}

	@Quando("^clicar no filtro Sala de Jogos$")
	public void clicar_no_filtro_Sala_de_Jogos() throws Throwable {
		refinarBusca.selecionarFiltro("Sala de Jogos");
	}

	@Então("^deverá exibir os resultados do filtro Sala de Jogos$")
	public void deverá_exibir_os_resultados_do_filtro_Sala_de_Jogos() throws Throwable {
		refinarBusca.validarResultadoFiltro("Sala de Jogos");
	}

	@Quando("^clicar no filtro Serviço de piscina$")
	public void clicar_no_filtro_Serviço_de_piscina() throws Throwable {
		refinarBusca.selecionarFiltro("Serviço de piscina");
	}

	@Então("^deverá exibir os resultados do filtro Serviço de piscina$")
	public void deverá_exibir_os_resultados_do_filtro_Serviço_de_piscina() throws Throwable {
		refinarBusca.validarResultadoFiltro("Serviço de piscina");
	}

	@Quando("^clicar no filtro Serviço de praia$")
	public void clicar_no_filtro_Serviço_de_praia() throws Throwable {
		refinarBusca.selecionarFiltro("Serviço de praia");
	}

	@Então("^deverá exibir os resultados do filtro Serviço de praia$")
	public void deverá_exibir_os_resultados_do_filtro_Serviço_de_praia() throws Throwable {
		refinarBusca.validarResultadoFiltro("Serviço de praia");
	}

	@Quando("^clicar no filtro Serviço de praia/piscina$")
	public void clicar_no_filtro_Serviço_de_praia_piscina() throws Throwable {
		//refinarBusca.selecionarFiltro("Serviço de praia/piscina");
	}

	@Então("^deverá exibir os resultados do filtro Serviço de praia/piscina$")
	public void deverá_exibir_os_resultados_do_filtro_Serviço_de_praia_piscina() throws Throwable {
		//refinarBusca.validarResultadoFiltro("Serviços de praia/piscina");
		//fecharBrowser();
	}

}
