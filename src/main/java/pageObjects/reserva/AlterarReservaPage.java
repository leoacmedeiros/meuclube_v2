package pageObjects.reserva;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import core.BasePage;
import core.DriverFactory;


public class AlterarReservaPage extends BasePage {

	public void detalharReservaConfirmada() {
		scrollElementoClicar(By.xpath("(//span[contains(text(),'Confirmada')]//parent::span//parent::div//parent::div//parent::div//parent::div//parent::div//parent::div//div[contains(text(),'DETALHES')])[1]"));
	}
	
	public void clicarAlterarReserva() {
		esperarPresencaDoLoading();
		scrollElementoClicar(By.xpath("//button//div[contains(text(),'Alterar Reserva')]"));
	}

	public void selecionarData() {
		By seletor = By.xpath("//div[@class='vc-grid-container grid']");
		List<WebElement> elementos = DriverFactory.getDriver().findElements(seletor);
			
		for (WebElement element : elementos) {
	        List<WebElement> numDia = element.findElements(By.xpath("//div[@class='vc-h-full']//span[@class='vc-day-content vc-focusable vc-font-bold vc-text-blue-900 vc-font-medium vc-text-sm vc-cursor-pointer focus:vc-font-bold vc-rounded-full']"));
	        String selecionarDiaInicio = numDia.get(26).getText();
	        String selecionarDiaFim = numDia.get(27).getText();
	 
	        System.out.println("Dia início: "+selecionarDiaInicio);
	        System.out.println("Dia fim: "+selecionarDiaFim);

	        clicarBotao(By.xpath("(//div[@class='vc-h-full']//span[@class='vc-day-content vc-focusable vc-font-bold vc-text-blue-900 vc-font-medium vc-text-sm vc-cursor-pointer focus:vc-font-bold vc-rounded-full'][text()="+selecionarDiaInicio+"])[2]"));
			sleep(1);
			clicarBotao(By.xpath("(//div[@class='vc-h-full']//span[@class='vc-day-content vc-focusable vc-font-bold vc-text-blue-900 vc-font-medium vc-text-sm vc-cursor-pointer focus:vc-font-bold vc-rounded-full'][text()="+selecionarDiaFim+"])[2]"));

		}
	}

	public void prosseguirRevisao() {
		clicarBotao(By.xpath("//button//div[contains(text(),'Prosseguir Revisão')]"));
	}

	public void continuar() {
		scrollElementoClicar(By.xpath("//button//div[contains(text(),'CONTINUAR')]"));
	}
	
	public void informarQtdDiarias(String qtdDias) {
		escrever(By.xpath("(//div[contains(text(),'Executivo 3')]//parent::div//parent::div//input)[1]"), qtdDias);
		DriverFactory.getDriver().findElement(By.xpath("(//div[contains(text(),'Executivo 3')]//parent::div//parent::div//input)[1]")).sendKeys(Keys.TAB);;
		
	}
	
	public void clicarCheckAceitoTermos() {
		scrollElementoClicar(By.xpath("//div[@class='v-input__control']//input[@aria-label='Aceito os termos e políticas para reserva.'][@type='checkbox']"));
		sleep(2);
	}

	public void clicarReservar() {
		scrollElementoClicar(By.xpath("//button//div[contains(text(),'Revisar')]"));
		
	}
	
	public void mensagemSucesso() {
		esperarElementoFicarVisivel2(By.xpath("(//div[contains(text(),'revisão')])[1]"));
		Boolean mensagemConfRevisao = DriverFactory.getDriver().findElements(By.xpath("(//div[contains(text(),'revisão')])[1]")).size() > 0;
		
		if (mensagemConfRevisao == true) {
			Assert.assertEquals("Tudo pronto! A sua revisão foi realizada com sucesso.", obterTexto(By.xpath("(//div[contains(text(),'revisão')])[1]")));
				System.out.println("Texto revisão: "+obterTexto(By.xpath("(//div[contains(text(),'revisão')])[1]")));
			} else {
				Assert.assertEquals("Ops! A sua reserva ainda não foi confirmada.", obterTexto(By.xpath("//div[contains(text(),'Ops! A sua reserva ainda não foi confirmada.')]")));
				System.out.println("Caiu no else: " + obterTexto(By.xpath("//div[contains(text(),'Ops! A sua reserva ainda não foi confirmada.')]")));
			}
			
		} 	
	
	public void validarMenorPrecoVoo() {
		sleep(3);
		Boolean elementoVooPresente = DriverFactory.getDriver().findElements(By.xpath("//span[contains(text(),'Voos com descontos exclusivos!')]")).size() > 0;
		
		if (elementoVooPresente == true) {
			System.out.println("Menor Preço Voos: "+elementoVooPresente);
			sleep(3);
			Assert.assertEquals("Voos com descontos exclusivos!", obterTexto(By.xpath("//span[contains(text(),'Voos com descontos exclusivos!')]")));
			System.out.println("Ofertas de voos exibida: " + obterTexto(By.xpath("//span[contains(text(),'Voos com descontos exclusivos!')]")));
			
		} else {
			System.out.println("Menor Preço Voos: "+elementoVooPresente);
		}
	}
		
		
	public void validarMenorPrecoCarro() {
			sleep(3);
			Boolean elementoCarroPresente = DriverFactory.getDriver().findElements(By.xpath("//span[contains(text(),'Temos o carro ideal para sua viagem!')]")).size() > 0;
			
			if (elementoCarroPresente == true) {
				System.out.println("Menor Preço Carro: "+elementoCarroPresente);
				sleep(3);
				Assert.assertEquals("Temos o carro ideal para sua viagem!", obterTexto(By.xpath("//span[contains(text(),'Temos o carro ideal para sua viagem!')]")));
				System.out.println("Ofertas de Carro exibida: " + obterTexto(By.xpath("//span[contains(text(),'Temos o carro ideal para sua viagem!')]")));
				
			} else {
				System.out.println("Menor Preço Carro: "+elementoCarroPresente);
			}

		}

	
	
	
	
	

	}