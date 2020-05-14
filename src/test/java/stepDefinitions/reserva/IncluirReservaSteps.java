package stepDefinitions.reserva;

import java.util.List;

import org.openqa.selenium.By;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.reserva.IncluirReservaPage;

public class IncluirReservaSteps extends BasePage {
	
	IncluirReservaPage incluirReserva = new IncluirReservaPage();
		
	@Dado("^que eu realize uma pesquisa válida na página inicial com os seguintes parâmetros$")
	public void que_eu_realize_uma_pesquisa_válida_na_página_inicial_com_os_seguintes_parâmetros(DataTable formData) throws Throwable {
		
		List<List<String>> data = formData.raw();
		incluirReserva.setPesquisa(data.get(0).get(1));
		selecionarDataInicioFim(20,23);
		incluirReserva.clicarBotaoAplicar();
	}

	@Dado("^clique no botão de Ver Quartos$")
	public void clique_no_botão_de_Ver_Quartos() throws Throwable {
	    incluirReserva.selecionarVerQuartos();
	}

	@Dado("^clique no botão de continuar$")
	public void clique_no_botão_de_continuar() throws Throwable {
	    incluirReserva.clicarBotaoContinuar();
	}

	@Dado("^selecione a quantidade de diárias$")
	public void selecione_a_quantidade_de_diárias() throws Throwable {
	    incluirReserva.informarQtdDiarias("3");
	}

	@Dado("^aceite os temos e políticas para reserva$")
	public void aceite_os_temos_e_políticas_para_reserva() throws Throwable {
	    incluirReserva.clicarCheckAceitoTermos();
	}

	@Quando("^clicar no botão Reservar$")
	public void clicar_no_botão_Reservar() throws Throwable {
		incluirReserva.clicarBotaoSolicitarReserva();
	    
	}

	@Então("^minha reserva será confirmada$")
	public void minha_reserva_será_confirmada() throws Throwable {
		sleep(2);
	    incluirReserva.mensagemSucesso();
	    incluirReserva.validarMenorPrecoVoo();
	    incluirReserva.validarMenorPrecoCarro();
	}


}
