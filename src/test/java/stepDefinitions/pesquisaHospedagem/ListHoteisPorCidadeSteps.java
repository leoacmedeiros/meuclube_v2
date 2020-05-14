package stepDefinitions.pesquisaHospedagem;

import java.util.List;
import core.BasePage;
import core.DriverFactory;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import pageObjects.pesquisaHospedagem.ListaHoteisPorCidadePage;

public class ListHoteisPorCidadeSteps extends BasePage {

	ListaHoteisPorCidadePage listaHoteisCidade = new ListaHoteisPorCidadePage();


@Dado("^que eu realize a pesquisa por São Paulo$")
public void que_eu_realize_a_pesquisa_por_São_Paulo(DataTable formData) throws Throwable {
	List<List<String>> data = formData.raw();
	listaHoteisCidade.setPesquisaCidade(data.get(0).get(1));
}

@Então("^o sistema apresentará a lista de hotéis por São Paulo$")
public void o_sistema_apresentará_a_lista_de_hotéis_por_São_Paulo() throws Throwable {
	listaHoteisCidade.validarPesquisaCidade("São Paulo");
	listaHoteisCidade.paginaInicial();
    
}

@Então("^realize a pesquisa por Maceió$")
public void realize_a_pesquisa_por_Maceió(DataTable formData) throws Throwable {
	List<List<String>> data = formData.raw();
	listaHoteisCidade.setPesquisaCidade(data.get(0).get(1));
  
}

@Então("^o sistema apresentará a lista de hotéis por Maceió$")
public void o_sistema_apresentará_a_lista_de_hotéis_por_Maceió() throws Throwable {
	listaHoteisCidade.validarPesquisaCidade("Maceió");
	listaHoteisCidade.paginaInicial();
}

@Então("^realize a pesquisa por Salvador$")
public void realize_a_pesquisa_por_Salvador(DataTable formData) throws Throwable {
	List<List<String>> data = formData.raw();
	listaHoteisCidade.setPesquisaCidade(data.get(0).get(1));
}

@Então("^o sistema apresentará a lista de hotéis por Salvador$")
public void o_sistema_apresentará_a_lista_de_hotéis_por_Salvador() throws Throwable {
	listaHoteisCidade.validarPesquisaCidade("Salvador");
	listaHoteisCidade.paginaInicial();
}

@Então("^realize a pesquisa por São Luis$")
public void realize_a_pesquisa_por_São_Luis(DataTable formData) throws Throwable {
	List<List<String>> data = formData.raw();
	listaHoteisCidade.setPesquisaCidade(data.get(0).get(1));
}

@Então("^o sistema apresentará a lista de hotéis por São Luis$")
public void o_sistema_apresentará_a_lista_de_hotéis_por_São_Luis() throws Throwable {
	listaHoteisCidade.validarPesquisaCidade("São Luís");
	listaHoteisCidade.paginaInicial();
}

@Então("^realize a pesquisa por Caldas Novas$")
public void realize_a_pesquisa_por_Caldas_Novas(DataTable formData) throws Throwable {
	List<List<String>> data = formData.raw();
	listaHoteisCidade.setPesquisaCidade(data.get(0).get(1));
}

@Então("^o sistema apresentará a lista de hotéis por Caldas Novas$")
public void o_sistema_apresentará_a_lista_de_hotéis_por_Caldas_Novas() throws Throwable {
	listaHoteisCidade.validarPesquisaCidade("Caldas Novas");
	listaHoteisCidade.paginaInicial();
}

@Então("^realize a pesquisa por Fortaleza$")
public void realize_a_pesquisa_por_Fortaleza(DataTable formData) throws Throwable {
	List<List<String>> data = formData.raw();
	listaHoteisCidade.setPesquisaCidade(data.get(0).get(1));
}

@Então("^o sistema apresentará a lista de hotéis por Fortaleza$")
public void o_sistema_apresentará_a_lista_de_hotéis_por_Fortaleza() throws Throwable {
	listaHoteisCidade.validarPesquisaCidade("Fortaleza");
	listaHoteisCidade.paginaInicial();
}

@Então("^realize a pesquisa por Recife$")
public void realize_a_pesquisa_por_Recife(DataTable formData) throws Throwable {
	List<List<String>> data = formData.raw();
	listaHoteisCidade.setPesquisaCidade(data.get(0).get(1));
}

@Então("^o sistema apresentará a lista de hotéis por Recife$")
public void o_sistema_apresentará_a_lista_de_hotéis_por_Recife() throws Throwable {
	listaHoteisCidade.validarPesquisaCidade("Recife");
	listaHoteisCidade.paginaInicial();
	//fecharBrowser();
}


}
