package pageObjects.reserva;

import org.openqa.selenium.By;
import core.BasePage;
import org.junit.Assert;

public class DetalharReservaPage extends BasePage {

	public void detalharReservaConfirmada() {
		clicarElementoScrollVisivel(By.xpath(
				"(//span[contains(text(),'Confirmada')]//parent::span//parent::div//parent::div//parent::div//parent::div//parent::div//parent::div//div[contains(text(),'DETALHES')])[1]"));
	}

	public void validarTituloHospedeResp() {
		
		esperarElementoFicarVisivel2(By.xpath("//div[contains(text(),'Hóspede responsável')]"));
		Assert.assertEquals("Hóspede responsável", obterTexto(By.xpath("//div[contains(text(),'Hóspede responsável')]")));
		
	}

}