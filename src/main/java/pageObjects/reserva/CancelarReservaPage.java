package pageObjects.reserva;

import org.junit.Assert;
import org.openqa.selenium.By;
import core.BasePage;

public class CancelarReservaPage extends BasePage {

	public void detalharReservaConfirmada() {
		scrollElementoClicar(By.xpath(
				"(//span[contains(text(),'Prazo para cancelamento sem custos')]//parent::div//parent::div//div[contains(text(),'DETALHES')])[1]"));
	}

	public void detalharResevarForaPrazoCancelamento() {
		scrollElementoClicar(By.xpath(
				"(//span[contains(text(),'Cancelamento sujeito à cobrança de diárias e despesas adicionais.')]//parent::div//parent::div//div[contains(text(),'DETALHES')])[1]"));
	}

	public void cancelarReserva() {
		clicarBotao(By.xpath("//button[@target='_blank']//div[contains(text(),'Cancelar Reserva')]"));
	}
	
	public void setDiariasPenalizar() {
		String diariarPenalizar = obterTexto(By.xpath("//div[@class='font-weight-medium pa-4 pl-4']"));
		escrever(By.xpath("//input[@class='el-input__inner']"), diariarPenalizar.substring(0, 2));
		clicarElementoScrollVisivel(By.xpath("//div[@class='v-input--selection-controls__ripple']"));
	}
	
	public void clicarEstouDeAcordo() {
		clicarBotao(By.xpath("//input[@aria-label='Estou de acordo com as condições e quero prosseguir com o cancelamento desta reserva.']//parent::div//div"));
	}
	
	public void confirmarCancelamentoReserva() {
		clicarBotao(By.xpath("(//div[contains(text(),'Cancelar Reserva')])[1]"));
	}

	public void mensagemSucesso() {
		esperarElementoFicarVisivel2(By.xpath("//div[@class='snotifyToast__body']"));
		Assert.assertEquals("Sua reserva foi cancelada com sucesso.",
				obterTexto(By.xpath("//div[@class='snotifyToast__body']")));
	}
	

}