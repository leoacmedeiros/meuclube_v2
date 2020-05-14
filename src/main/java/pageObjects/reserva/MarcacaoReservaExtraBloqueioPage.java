package pageObjects.reserva;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import core.BasePage;
import core.DriverFactory;

public class MarcacaoReservaExtraBloqueioPage extends BasePage {

	public void setPesquisa(String pesquisa) {
		escrever(By.xpath("//input[@aria-label='Digite a UF, cidade ou hotel']"), pesquisa);
		sleep(2);
		clicarBotao(By.xpath("(//div[contains(text(),'"+pesquisa+"')])[1]"));
	}

	public void clicarBotaoAplicar() {
		clicarBotao(By.xpath("//button//div[contains(text(),'Aplicar')]"));
	}
	
	public void selecionarVerQuartos(String situacaoHotel) {
		scrollElementoClicar(By.xpath("(//div[@class='layout pb-4 px-3 row']//span[contains(text(),'"+situacaoHotel+"')]//parent::div//parent::div//parent::div//parent::div//parent::div//parent::div//div[contains(text(),'Ver quartos')])[4]"));
	}
	
	public void clicarBotaoContinuar() {
		clicarBotao(By.xpath("//button//div[contains(text(),'CONTINUAR')]"));
	}
	
	public void verificarPromocao() {
		   
		Boolean elementoPresente = DriverFactory.getDriver().findElements(By.xpath("//div[contains(text(),'Período Especial')]")).size() > 0;
			
		if (elementoPresente == true) {
			System.out.println("Promoção: "+elementoPresente);
			sleep(3);
			WebElement clicarCheck = DriverFactory.getDriver().findElement(By.xpath("//div[contains(text(),'Período Especial')]//parent::div//div[@class='v-input--selection-controls__input']"));
			clicarCheck.click();
			
		} else {
			System.out.println("Promoção: "+elementoPresente);
		}
		
	}
	
	public void informarQtdDiarias(String qtdDias) {
		escrever(By.xpath("(//div[contains(text(),'Executivo 3')]//parent::div//parent::div//input)[1]"), qtdDias);
		DriverFactory.getDriver().findElement(By.xpath("(//div[contains(text(),'Executivo 3')]//parent::div//parent::div//input)[1]")).sendKeys(Keys.TAB);;
		
	}
	
	public void clicarCheckAceitoTermos() {
		scrollElementoClicar(By.xpath("//div[@class='v-input__control']//input[@aria-label='Aceito os termos e políticas para reserva.'][@type='checkbox']"));
		sleep(2);
	}
	
	public void clicarBotaoSolicitarReserva() {
		clicarElementoScrollVisivel(By.xpath("//button//div[contains(text(),'Reserva')]"));
	}
	
	public void mensagemSucesso() {
		esperarElementoFicarVisivel2(By.xpath("//div[contains(text(),'Ops! A sua reserva ainda não foi confirmada.')]"));
		Assert.assertEquals("Ops! A sua reserva ainda não foi confirmada.", obterTexto(By.xpath("//div[contains(text(),'Ops! A sua reserva ainda não foi confirmada.')]")));
	}
	
		
	
}