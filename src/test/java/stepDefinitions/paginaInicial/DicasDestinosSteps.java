package stepDefinitions.paginaInicial;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.paginaInicial.DicasDestinosPage;

public class DicasDestinosSteps {
	
	DicasDestinosPage dicasDestinos = new DicasDestinosPage();
	
	@Dado("^que o usuário esteja na tela inicial$")
	public void que_o_usuário_esteja_na_tela_inicial() throws Throwable {
	}

	@Quando("^visualizar os melhores quartos e hotéis contidos no Título Superior$")
	public void visualizar_os_melhores_quartos_e_hotéis_contidos_no_Título_Superior() throws Throwable {
		dicasDestinos.melhoresHoteisTituloSuperior();
	}

	@Quando("^as Novidades do Clube$")
	public void as_Novidades_do_Clube() throws Throwable {
		dicasDestinos.novidadeClube();
	}

	@Quando("^onde as diárias valem mais$")
	public void onde_as_diárias_valem_mais() throws Throwable {
		dicasDestinos.diariasValemMais();
	}

	@Então("^os hóteis serão apresentados$")
	public void os_hóteis_serão_apresentados() throws Throwable {
	}

}
