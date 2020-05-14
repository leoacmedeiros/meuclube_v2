package pageObjects.reserva;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import core.BasePage;
import core.DriverFactory;

public class AdquirirDiariaAvulsaReservaPage extends BasePage {

	public void setPesquisa(String pesquisa) {
		escrever(By.xpath("//input[@aria-label='Digite a UF, cidade ou hotel']"), pesquisa);
		sleep(2);
		clicarBotao(By.xpath("(//div[contains(text(),'"+pesquisa+"')])[1]"));
		clicarBotao(By.xpath("//button//div[contains(text(),'Aplicar')]"));
	}

	public void selecionarDataDispHotel() {
		
		By seletor = By.xpath("//div[@class='vc-grid-container grid']");
		List<WebElement> elementos = DriverFactory.getDriver().findElements(seletor);
			
		for (WebElement element : elementos) {
	        List<WebElement> numDia = element.findElements(By.xpath("//div[@class='vc-h-full']//span[@class='vc-day-content vc-focusable vc-font-bold vc-text-blue-900 vc-font-medium vc-text-sm vc-cursor-pointer focus:vc-font-bold vc-rounded-full']"));
	        String selecionarDiaInicio = numDia.get(18).getText();
	        String selecionarDiaFim = numDia.get(19).getText();
	 
	        System.out.println("Dia início: "+selecionarDiaInicio);
	        System.out.println("Dia fim: "+selecionarDiaFim);

	        clicarBotao(By.xpath("(//div[@class='vc-h-full']//span[@class='vc-day-content vc-focusable vc-font-bold vc-text-blue-900 vc-font-medium vc-text-sm vc-cursor-pointer focus:vc-font-bold vc-rounded-full'][text()='"+selecionarDiaInicio+"'])[1]"));
			sleep(1);
			clicarBotao(By.xpath("(//div[@class='vc-h-full']//span[@class='vc-day-content vc-focusable vc-font-bold vc-text-blue-900 vc-font-medium vc-text-sm vc-cursor-pointer focus:vc-font-bold vc-rounded-full'][text()='"+selecionarDiaFim+"'])[1]"));

		}
	}
	
	
	public void clicarBuscarPeriodoSelecionado() {
		clicarBotao(By.xpath("//div[contains(text(),'Buscar Período Selecionado')]"));
	
	}
	
	public void clicarBotaoContinuar() {
		clicarBotao(By.xpath("//button//div[contains(text(),'CONTINUAR')]"));
	}
	
	public void informarQtdDiariasAvulsas(String qtdDias) {
		escrever(By.xpath("((//div[contains(text(),'Executivo 3')]//parent::div//parent::div//input)//parent::div//parent::div//parent::div//parent::div//parent::div//parent::div//parent::div//div[contains(text(),'Limite')]//parent::div//input)[1]"), qtdDias);
		DriverFactory.getDriver().findElement(By.xpath("(//div[contains(text(),'Executivo 3')]//parent::div//parent::div//input)[1]")).sendKeys(Keys.TAB);
		sleep(2);
		
		
	}
	
	public void verificarPromocao() {
		   
		Boolean elementoPresente = DriverFactory.getDriver().findElements(By.xpath("//div[contains(text(),'Período Especial')]")).size() > 0;
			
		if (elementoPresente == true) {
			System.out.println("Promoção: "+elementoPresente);
			sleep(1);
			WebElement clicarCheck = DriverFactory.getDriver().findElement(By.xpath("//div[contains(text(),'Período Especial')]//parent::div//div[@class='v-input--selection-controls__input']"));
			clicarCheck.click();
			
		} else {
			System.out.println("Promoção: "+elementoPresente);
		}
		
	}
	
	public void selecionarQtdParcelas(String textoParcela) {
		clicarBotao(By.xpath("//div[contains(text(),'Fique tranquilo, essa(s) despesa(s) pode(m)')]//parent::div//div[@role='combobox']"));
		clicarBotao(By.xpath("//div[contains(text(),'"+textoParcela+"')]"));
	}
	
	public void clicarCheckAceitoTermos() {
		scrollElementoClicar(By.xpath("//div[@class='v-input__control']//input[@aria-label='Aceito os termos e políticas para reserva.'][@type='checkbox']"));
		sleep(2);
	}
	
	public void clicarBotaoSolicitarReserva() {
		clicarElementoScrollVisivel(By.xpath("//button//div[contains(text(),'Reserva')]"));
	}
	
	public void mensagemSucesso() {
		
		esperarElementoFicarVisivel2(By.xpath("(//div[contains(text(),'Oba! A sua reserva está confirmada.')])"));
		if (DriverFactory.getDriver().findElement(By.xpath("(//div[contains(text(),'Oba! A sua reserva está confirmada.')])")).getText().contains("Oba! A sua reserva está confirmada.")) {
			
			Assert.assertEquals("Oba! A sua reserva está confirmada.", obterTexto(By.xpath("//div[contains(text(),'Oba! A sua reserva está confirmada.')]")));
			
		} else if (DriverFactory.getDriver().findElement(By.xpath("(//div[contains(text(),'reserva')])[1]")).getText().contains("Ops! A sua reserva ainda não foi confirmada.")){
			
			Assert.assertEquals("Ops! A sua reserva ainda não foi confirmada.", obterTexto(By.xpath("//div[contains(text(),'Ops! A sua reserva ainda não foi confirmada.')]")));
			

		}
		
	}
	

}