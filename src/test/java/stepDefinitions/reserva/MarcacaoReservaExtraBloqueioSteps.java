package stepDefinitions.reserva;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.reserva.MarcacaoReservaExtraBloqueioPage;


public class MarcacaoReservaExtraBloqueioSteps extends BasePage {
	
	MarcacaoReservaExtraBloqueioPage extraBloqueio = new MarcacaoReservaExtraBloqueioPage();
		
	@Dado("^que eu realize uma pesquisa válida na página inicial por$")
	public void que_eu_realize_uma_pesquisa_válida_na_página_inicial_por(DataTable formData) throws Throwable {
	   List<List<String>> data = formData.raw();
	   extraBloqueio.setPesquisa(data.get(0).get(1));
	   selecionarDataInicioFim(0, 1);
	   extraBloqueio.clicarBotaoAplicar();
	}

	@Dado("^selecione Ver Quartos de um Hotel que esteja com a situação$")
	public void selecione_Ver_Quartos_de_um_Hotel_que_esteja_com_a_situação(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		extraBloqueio.selecionarVerQuartos(data.get(0).get(1));
	   
	}

	@Dado("^na tela de detalhes da disponibilidade clique no botão Continuar$")
	public void na_tela_de_detalhes_da_disponibilidade_clique_no_botão_Continuar() throws Throwable {
	    extraBloqueio.clicarBotaoContinuar();
	}

	@Dado("^verifique se há promoção no hotel para a data selecionada$")
	public void verifique_se_há_promoção_no_hotel_para_a_data_selecionada() throws Throwable {
	    extraBloqueio.verificarPromocao();
	}

	@Dado("^informe a quantidade de diárias para a categoria do título$")
	public void informe_a_quantidade_de_diárias_para_a_categoria_do_título() throws Throwable {
	    extraBloqueio.informarQtdDiarias("1");
	}

	@Dado("^clique para aceitar os temos e políticas para reserva$")
	public void clique_para_aceitar_os_temos_e_políticas_para_reserva() throws Throwable {
	    extraBloqueio.clicarCheckAceitoTermos();
	}

	@Quando("^clicar no botão para Solicitar a Reserva$")
	public void clicar_no_botão_para_Solicitar_a_Reserva() throws Throwable {
	    extraBloqueio.clicarBotaoSolicitarReserva();
	}

	@Então("^o sistema irá apresentar a mensagem$")
	public void o_sistema_irá_apresentar_a_mensagem(DataTable arg1) throws Throwable {
	    extraBloqueio.mensagemSucesso();
	}



}
