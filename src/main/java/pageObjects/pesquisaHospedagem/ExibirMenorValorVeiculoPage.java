package pageObjects.pesquisaHospedagem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import core.BasePage;
import core.DriverFactory;
import static core.DriverFactory.getDriver;
import java.util.List;
import org.junit.Assert;

public class ExibirMenorValorVeiculoPage extends BasePage {
	
	public void validarTextoMenorValorVeiculo() {
		esperarPresencaDoLoading();
		esperaElementoFicarVisivel(By.xpath("//div[contains(text(),'Encontre o veículo ideal')]"));
		Assert.assertEquals("Encontre o veículo ideal com o melhor preço para complementar sua viagem.", obterTexto(By.xpath("//div[contains(text(),'Encontre o veículo ideal')]")));
	
	}
	
	public void paginaInicial() {
		clicarBotao(By.xpath("(//img[@alt='Bancorbrás'])[2]"));
		sleep(3);
	}

}
