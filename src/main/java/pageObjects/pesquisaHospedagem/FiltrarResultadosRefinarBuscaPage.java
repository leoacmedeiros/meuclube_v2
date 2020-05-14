package pageObjects.pesquisaHospedagem;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import core.BasePage;
import core.DriverFactory;


public class FiltrarResultadosRefinarBuscaPage extends BasePage {

	public void setPesquisa(String pesquisa) {
		escrever(By.xpath("//input[@aria-label='Digite a UF, cidade ou hotel']"), pesquisa);
		sleep(2);
		clicarBotao(By.xpath("(//div[contains(text(),'"+pesquisa+"')])[1]"));
	}

	public void clicarBotaoAplicar() {
		clicarBotao(By.xpath("//button//div[contains(text(),'Aplicar')]"));
	}

	public void menuLateralFiltrarResultados() {
		if (DriverFactory.getDriver().findElements(By.xpath("//div[text()='FILTRAR RESULTADOS']")) != null) {
			System.out.println("Menu lateral Filtrar Resultados presente!");
		} else {
			System.out.println("Menu lateral Filtrar Resultado - Não exibido");
		}
	}
	

	 public void selecionarFiltro(String filtro) {
		esperarPresencaDoLoading();
		By seletor = By.xpath("(//div[@class='v-list__tile__content body-1'])");
		List<WebElement> elementos = DriverFactory.getDriver().findElements(seletor);
		for(WebElement e : elementos) {
		  //System.out.println(e.getText());
		  
		  if (e.getText().contains(filtro)) {
			  clicarElementoScrollVisivel(By.xpath("(.//div[contains(text(),'"+filtro+"')]/parent::div//div//div//div//div//div)[1]"));
			  System.out.println("Filtro selecionado: "+filtro);
		  }else {
			  //System.out.println("Filtro '"+filtro+"' - Não exibido");
		  }
		}

		
	}
		
	public void validarResultadoFiltro(String resultadoFiltro){
		esperarPresencaDoLoading();
		sleep(2);
		Assert.assertEquals(DriverFactory.getDriver().findElement(By.xpath("(.//div[contains(text(),'"+resultadoFiltro+"')]//parent::div//span)[2]")).getText().substring(0, 1), 
				DriverFactory.getDriver().findElement(By.xpath(".//div[contains(text(),'resultado(s) disponível(is)')]")).getText().substring(0, 1));
		
		String qtdFiltro = DriverFactory.getDriver().findElement(By.xpath("(.//div[contains(text(),'"+resultadoFiltro+"')]//parent::div//span)[2]")).getText();
		System.out.println("Qtd. de resultados: "+qtdFiltro);
		
		clicarElementoScrollVisivel(By.xpath("(.//div[contains(text(),'"+resultadoFiltro+"')]/parent::div//div//div//div//div//div)[1]"));
		sleep(3);
	}
	 	

}
	