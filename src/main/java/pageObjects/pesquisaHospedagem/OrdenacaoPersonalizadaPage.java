package pageObjects.pesquisaHospedagem;

import org.openqa.selenium.By;
import core.BasePage;

public class OrdenacaoPersonalizadaPage extends BasePage {

	public void setPesquisaCidade(String nomeCidade) {
		escrever(By.xpath("//input[@aria-label='Digite a UF, cidade ou hotel']"), nomeCidade);
		sleep(1);
		clicarBotao(By.xpath("(//div[contains(text(),'" + nomeCidade + "')])[1]"));
		clicarBotao(By.xpath("//button//div[contains(text(),'Aplicar')]"));
		sleep(2);

	}

	public void ordenarPorConfirmacaoImediata(String valorFiltro) {
		clicarBotao(By.xpath(".//span[contains(text(),'Classificar')]"));
		clicarBotao(By.xpath(".//div[@class='v-list__tile__title'][contains(text(),'" + valorFiltro + "')]"));

	}

	public void paginaInicial() {
		clicarBotao(By.xpath("(//img[@alt='Bancorbrás'])[2]"));
	}

}
