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

public class ExibirMenorValorVooPage extends BasePage {
	
	public void validarTextoCompleteReservaVoo() {
		esperarPresencaDoLoading();
		esperaElementoFicarVisivel(By.xpath("//div[contains(text(),'Complete sua reserva de hospedagem')]"));
		Assert.assertEquals("Complete sua reserva de hospedagem e tenha desconto exclusivo no aéreo.", obterTexto(By.xpath("//div[contains(text(),'Complete sua reserva de hospedagem')]")));
		
	}

}
