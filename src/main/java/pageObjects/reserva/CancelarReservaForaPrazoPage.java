package pageObjects.reserva;

import org.openqa.selenium.By;
import core.BasePage;


public class CancelarReservaForaPrazoPage extends BasePage {

	public void detalharReservaConfirmada() {
		clicarElementoScrollVisivel(By.xpath("(//span[contains(text(),'Confirmada')]//parent::span//parent::div//parent::div//parent::div//parent::div//parent::div//parent::div//div[contains(text(),'DETALHES')])[1]"));
	}
	
	public void cancelarReserva() {
		clicarElementoScrollVisivel(By.xpath("//button[@target='_blank']//div[contains(text(),'Cancelar Reserva')]"));
	}
	
	public void clicarCancelarReserva() {
		clicarBotao(By.xpath("//div[@class='v-input--selection-controls__ripple']"));
	}

}