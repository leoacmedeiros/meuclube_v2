package pageObjects.mapaHoteis;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;

public class VisualizarMapaHoteisPage extends BasePage {

	public void setPesquisa(String pesquisa) {
		escrever(By.xpath("//input[@aria-label='Digite a UF, cidade ou hotel']"), pesquisa);
		sleep(2);
		clicarBotao(By.xpath("(//div[contains(text(),'" + pesquisa + "')])[1]"));
	}
	
	public void clicarBotaoAplicar() {
		clicarBotao(By.xpath("//button//div[contains(text(),'Aplicar')]"));
	}
	
	public void visualizarMapa() {
		clicarBotao(By.xpath("//div[@class='v-btn__content'][text()='Mostrar mapa']"));
	}
	
	public void verificaPaginaMapa() {
		Assert.assertEquals("Onde vai se hospedar?", obterTexto(By.xpath("(//div[@class='v-toolbar__title title blue--text text--darken-4'])[1]")));
		cliqueDuplo(By.xpath("//div[@class='swiper-button-next']"));
	}
	
	public void visualizarHotelMapa() {
		clicarBotao(By.xpath("//div[@class='v-dialog__content v-dialog__content--active']//div[6]//div[1]//div[3]//button[1]//div[1]"));
	}

}
