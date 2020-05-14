package pageObjects.pesquisaHospedagem;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import core.BasePage;
import core.DriverFactory;


public class ListaHoteisPorCidadePage extends BasePage {

	public void setPesquisaCidade(String nomeCidade) {
		escrever(By.xpath("//input[@aria-label='Digite a UF, cidade ou hotel']"), nomeCidade);
		sleep(1);
		clicarBotao(By.xpath("(//div[contains(text(),'"+nomeCidade+"')])[1]"));
		
		clicarBotao(By.xpath("//button//div[contains(text(),'Aplicar')]"));
		sleep(4);
		
	}

	public void validarPesquisaCidade(String nomeCidadePesquisada) {
		esperarPresencaDoLoading();
		try {
			boolean validarCidade = DriverFactory.getDriver().getPageSource().contains(nomeCidadePesquisada);
			assertTrue(validarCidade);
			
			System.out.println("Cidade pesquisada: "+nomeCidadePesquisada);
			}

		catch (Exception e) {
			System.out.println("Cidade "+nomeCidadePesquisada+" não encontrada!");
		}
	}
	
	public void paginaInicial() {
		clicarBotao(By.xpath("(//img[@alt='Bancorbrás'])[2]"));
		sleep(3);
	}

	
}

