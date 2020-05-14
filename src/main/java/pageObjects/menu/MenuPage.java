package pageObjects.menu;

import org.openqa.selenium.By;

import core.BasePage;

public class MenuPage extends BasePage {

	public static final String ABRIRMENU = "//button[@class='hamburger close-sidebar-btn hamburger--elastic mt-2']";
	public static final String ADQUIRIR_TITULO = "//span[@class='vsm-title'][contains(text(),'Adquirir')]";
	public static final String TRANSFERIR_TITULO = "//span[@class='vsm-title'][contains(text(),'Transferir')]";
	public static final String ALTERAR_CATEGORIA = "//span[@class='vsm-title'][contains(text(),'Alterar Categoria')]";
	public static final String PERIODO_UTILIZACAO = "//span[@class='vsm-title'][contains(text(),'Período de Utilização')]";
	public static final String FORMA_PAGAMENTO = "//span[@class='vsm-title'][contains(text(),'Forma de Pagamento')]";
	public static final String MINHAS_RESERVAS = "//span[@class='vsm-title'][contains(text(),'Minhas Reservas')]";
	public static final String BENEFICIARIOS = "//span[@class='vsm-title'][contains(text(),'Beneficiários')]";
	public static final String REATIVAR = "//span[@class='vsm-title'][contains(text(),'Reativar')]";
	public static final String INDICACAO_PREMIADA = "//span[@class='vsm-title'][contains(text(),'Programa de Indicação')]";
	public static final String BENEFICIOS_PARA_VOCE = "//span[@class='vsm-title'][contains(text(),'Benefícios para você')]";
	public static final String FALE_CONOSCO = "//span[@class='vsm-title'][contains(text(),'Fale Conosco')]";

	public void adquirirTitulo() {
		clicarBotao(By.xpath(ABRIRMENU));
		scrollElementoClicar(By.xpath(ADQUIRIR_TITULO));
	}

	public void transferirTitulo() {
		clicarBotao(By.xpath(ABRIRMENU));
		scrollElementoClicar(By.xpath(TRANSFERIR_TITULO));
	}

	public void alterarCategoriaTitulo() {
		clicarBotao(By.xpath(ABRIRMENU));
		scrollElementoClicar(By.xpath(ALTERAR_CATEGORIA));
	}

	public void periodoUtilizacao() {
		clicarBotao(By.xpath(ABRIRMENU));
		scrollElementoClicar(By.xpath(PERIODO_UTILIZACAO));
	}

	public void minhasReservas() {
		clicarBotao(By.xpath(ABRIRMENU));
		sleep(2);
		clicarElementoScrollVisivel(By.xpath(MINHAS_RESERVAS));

	}

	public void formaPagamento() {
		clicarBotao(By.xpath(ABRIRMENU));
		scrollElementoClicar(By.xpath(FORMA_PAGAMENTO));
	}

	public void beneficiarios() {
		clicarBotao(By.xpath(ABRIRMENU));
		scrollElementoClicar(By.xpath(BENEFICIARIOS));
	}

	public void reativarTitulo() {
		clicarBotao(By.xpath(ABRIRMENU));
		scrollElementoClicar(By.xpath(REATIVAR));
	}

	public void indicacaoPremiada() {
		clicarBotao(By.xpath(ABRIRMENU));
		scrollElementoClicar(By.xpath(INDICACAO_PREMIADA));
	}

	public void beneficiosParaVoce() {
		clicarBotao(By.xpath(ABRIRMENU));
		scrollElementoClicar(By.xpath(BENEFICIOS_PARA_VOCE));
	}
	public void faleConosco() {
		clicarBotao(By.xpath(ABRIRMENU));
		scrollElementoClicar(By.xpath(FALE_CONOSCO));
	}

}
