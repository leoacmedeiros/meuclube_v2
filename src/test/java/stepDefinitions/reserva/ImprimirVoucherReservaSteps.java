package stepDefinitions.reserva;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.reserva.ImprimirVoucherReservaPage;
import pageObjects.reserva.IncluirReservaPage;


public class ImprimirVoucherReservaSteps extends BasePage {
	
	IncluirReservaPage incluirReserva = new IncluirReservaPage();
	ImprimirVoucherReservaPage imprimirVoucher = new ImprimirVoucherReservaPage();
	MenuPage menuPage = new MenuPage();
	

	@Dado("^que acesse a página inicial e realize uma pesquisa por Hotel$")
	public void que_acesse_a_página_inicial_e_realize_uma_pesquisa_por_Hotel(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirReserva.setPesquisa(data.get(0).get(1));
		incluirReserva.clicarBotaoAplicar();
	}


	@Dado("^nos detalhes do hotel selecione a Data de Início e Fim$")
	public void nos_detalhes_do_hotel_selecione_a_Data_de_Início_e_Fim() throws Throwable {
	    imprimirVoucher.selecionarDataDispHotel();
	}


	@Dado("^clique em Buscar Período Selecionado$")
	public void clique_em_Buscar_Período_Selecionado() throws Throwable {
	    imprimirVoucher.clicarBuscarPeriodoSelecionado();
	}

	@Dado("^selecione a opção Continuar$")
	public void selecione_a_opção_Continuar() throws Throwable {
	    incluirReserva.clicarBotaoContinuar();
	}
	
	@Dado("^informe a quantidade de diárias$")
	public void informe_a_quantidade_de_diárias(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		incluirReserva.informarQtdDiarias(data.get(0).get(1));
	}

	@Dado("^verifique se tem alguma promoção e caso tenha clicar para aceitar$")
	public void verifique_se_tem_alguma_promoção_e_caso_tenha_clicar_para_aceitar() throws Throwable {
		imprimirVoucher.verificarPromocao();
	    
	}

	@Dado("^clique para aceitar os termos e políticas para a reserva$")
	public void clique_para_aceitar_os_termos_e_políticas_para_a_reserva() throws Throwable {
	    incluirReserva.clicarCheckAceitoTermos();
	}

	@Dado("^acione a o botão para Reservar$")
	public void acione_a_o_botão_para_Reservar() throws Throwable {
	    incluirReserva.clicarBotaoSolicitarReserva();
	}

	@Então("^irá exibir a mensagem de confirmação da Reserva$")
	public void irá_exibir_a_mensagem_de_confirmação_da_Reserva() throws Throwable {
	    incluirReserva.mensagemSucesso();
	}

	@Então("^acione o menu Minhas Reservas para verificar a confirmação da Reserva$")
	public void acione_o_menu_Minhas_Reservas_para_verificar_a_confirmação_da_Reserva() throws Throwable {
		 menuPage.minhasReservas();
	}

	@Então("^clique em Detalhes para detalhar a Reserva do hotel da pesquisa$")
	public void clique_em_Detalhes_para_detalhar_a_Reserva_do_hotel_da_pesquisa(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		imprimirVoucher.detalharReservaHotel(data.get(0).get(1));
	}

	@Então("^clique para Imprimir o Voucher$")
	public void clique_para_Imprimir_o_Voucher() throws Throwable {
	    imprimirVoucher.clicarBotaoVoucher();
	}

	@Então("^o sistema irá gerar o Voucher$")
	public void o_sistema_irá_gerar_o_Voucher() throws Throwable {
	    //ImprimirVoucherReservaPage.verificaDownloadArquivo("C:\\Users\\Leonardo Medeiros\\Downloads");
		imprimirVoucher.isFileDownloaded("C:\\\\Users\\\\Leonardo Medeiros\\\\Downloads", "voucher");
	}

}
