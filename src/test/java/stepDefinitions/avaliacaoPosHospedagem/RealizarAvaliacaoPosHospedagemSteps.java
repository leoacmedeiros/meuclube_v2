package stepDefinitions.avaliacaoPosHospedagem;

import java.util.List;

import core.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.avaliacaoPosHospedagem.RealizarAvaliacaoPosHospedagemPage;
import pageObjects.menu.MenuPage;


public class RealizarAvaliacaoPosHospedagemSteps extends BasePage {
	
	MenuPage menu = new MenuPage();
	RealizarAvaliacaoPosHospedagemPage realizarAvaliacao = new RealizarAvaliacaoPosHospedagemPage();
	
	@Dado("^que acesse o menu Minhas Reservas para realizar a Avaliação Pós Hospedagem$")
	public void que_acesse_o_menu_Minhas_Reservas_para_realizar_a_Avaliação_Pós_Hospedagem() throws Throwable {
	   menu.minhasReservas();
	}

	@Dado("^selecione uma Hospedagem para realizar a Avaliação da Experiência$")
	public void selecione_uma_Hospedagem_para_realizar_a_Avaliação_da_Experiência() throws Throwable {
	    realizarAvaliacao.selecionarHospedagemAvaliacaoExperiencia();
	}

	@Dado("^na pergunta (\\d+) - Qual o seu grau de satisfação das instalações do hotel marque as estrelas das opções$")
	public void na_pergunta_Qual_o_seu_grau_de_satisfação_das_instalações_do_hotel_marque_as_estrelas_das_opções(int arg1, DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		realizarAvaliacao.pergunta1(data.get(0).get(0), data.get(1).get(0), data.get(2).get(0), data.get(3).get(0));
	}

	@Dado("^na pergunta (\\d+) - Qual o seu grau de satisfação com os serviços prestados pelo hotel\\? marque as estrelas das opções$")
	public void na_pergunta_Qual_o_seu_grau_de_satisfação_com_os_serviços_prestados_pelo_hotel_marque_as_estrelas_das_opções(int arg1, DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		realizarAvaliacao.pergunta2(data.get(0).get(0), data.get(1).get(0), data.get(2).get(0), data.get(3).get(0), data.get(4).get(0), data.get(5).get(0));
	}

	@Dado("^na pergunta (\\d+) - Em relação ao apartamento utilizado, qual o seu grau de satisfação\\? marque as estrelas das opções$")
	public void na_pergunta_Em_relação_ao_apartamento_utilizado_qual_o_seu_grau_de_satisfação_marque_as_estrelas_das_opções(int arg1, DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		realizarAvaliacao.pergunta3(data.get(0).get(0), data.get(1).get(0), data.get(2).get(0), data.get(3).get(0));
	}

	@Dado("^na pergunta (\\d+) - Qual o seu grau de satisfação com o atendimento dos funcionários do hotel\\? marque as estrelas das opções$")
	public void na_pergunta_Qual_o_seu_grau_de_satisfação_com_o_atendimento_dos_funcionários_do_hotel_marque_as_estrelas_das_opções(int arg1, DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		realizarAvaliacao.pergunta4(data.get(0).get(0), data.get(1).get(0), data.get(2).get(0));
	}

	@Dado("^na pergunta (\\d+) - Em geral, como você avaliaria a sua hospedagem\\? marque as estrelas das opções$")
	public void na_pergunta_Em_geral_como_você_avaliaria_a_sua_hospedagem_marque_as_estrelas_das_opções(int arg1, DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		realizarAvaliacao.pergunta5(data.get(0).get(0));
	}

	@Dado("^na pergunta (\\d+) - Poderia nos informar qual numero do quarto\\? informar o número$")
	public void na_pergunta_Poderia_nos_informar_qual_numero_do_quarto_informar_o_número(int arg1, DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		realizarAvaliacao.pergunta6(data.get(0).get(0), data.get(0).get(1));
	}
	
	@Dado("^na pergunta (\\d+) - Caso deseje fazer comentários, use o campo abaixo\\. Selecionar a opção e inserir um comentário$")
	public void na_pergunta_Caso_deseje_fazer_comentários_use_o_campo_abaixo_Selecionar_a_opção_e_inserir_um_comentário(int arg1, DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		realizarAvaliacao.pergunta7(data.get(0).get(1), data.get(1).get(0), data.get(1).get(1));
	}

	@Dado("^na pergunta (\\d+) - Teria algum colaborador a ser elogiado\\? Inserir o nome do colaborador$")
	public void na_pergunta_Teria_algum_colaborador_a_ser_elogiado_Inserir_o_nome_do_colaborador(int arg1, DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		realizarAvaliacao.pergunta8(data.get(0).get(0), data.get(0).get(1));
	}

	@Quando("^clicar no botão de Enviar$")
	public void clicar_no_botão_de_Enviar() throws Throwable {
	    realizarAvaliacao.clicarEnviar();
	}

	@Então("^o sistema irá armazenar a avaliação$")
	public void o_sistema_irá_armazenar_a_avaliação() throws Throwable {
	    realizarAvaliacao.mensagemSucesso();
	    fecharBrowser();
	}
		
	

}
