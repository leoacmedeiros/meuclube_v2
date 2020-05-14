package pageObjects.pesquisaHospedagem;

import static core.DriverFactory.getDriver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import core.BasePage;
import core.DriverFactory;

public class ExibirHoteisPromocaoPage extends BasePage {

	public void setLocalidade(String localidade) {
		escrever(By.xpath("//input[@aria-label='Digite a UF, cidade ou hotel']"), localidade);
		sleep(2);
		clicarBotao(By.xpath("(//div[contains(text(),'" + localidade + "')])[1]"));
	}

	public void aplicarBusca() {
		clicarBotao(By.xpath("//div[contains(text(),'Aplicar')]"));
	}

	public void refinarResultadoPromocao() {
		sleep(4);
		JavascriptExecutor js = (JavascriptExecutor) getDriver();		
        js.executeScript("javascript:window.scrollBy(0,350)");
        
        scrollElementoClicar(By.xpath("//div[contains(text(),'Promoção')]//parent::div//div[@class='v-input--selection-controls__ripple']"));
		
	}

	public void verificarHoteisPromocao() {
		sleep(3);
		Assert.assertEquals(
				DriverFactory.getDriver()
						.findElement(By.xpath("(.//div[contains(text(),'Promoção')]//parent::div//span)[2]")).getText()
						.substring(0, 1),
				DriverFactory.getDriver()
						.findElement(By.xpath(".//div[contains(text(),'resultado(s) disponível(is)')]")).getText()
						.substring(0, 1));

		String qtdFiltro = DriverFactory.getDriver()
				.findElement(By.xpath("(.//div[contains(text(),'Promoção')]//parent::div//span)[2]")).getText();
		//System.out.println("Qtd. de resultados: " + qtdFiltro);
		
	}

}
