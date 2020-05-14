package pageObjects.paginaInicial;

import org.openqa.selenium.By;

import core.BasePage;

public class DicasDestinosPage extends BasePage {

	public boolean verificaPaginaInicial() {
		String cabecalho = obterTexto(By.xpath("//div[@class='app-header__mobile-menu']//img"));
		return cabecalho.contains("Bancorbrás");
	}

	public void melhoresHoteisTituloSuperior() {
		scrollAteElemento(By.xpath("//div[contains(text(),'Os melhores quartos e hotéis estão no')]"));
		clicarBotao(By.xpath("(//div[@aria-label='Next slide'])[1]"));
	}

	public void novidadeClube() {
		scrollAteElemento(By.xpath("//div[contains(text(),'Novidades do Clube')]"));
		clicarBotao(By.xpath("(//div[@aria-label='Next slide'])[2]"));
//		scrollAteElemento(By.xpath("(//div[@aria-label='Next slide'])[2]"));
	}

	public void diariasValemMais() {
		scrollAteElemento(By.xpath("//div[contains(text(),'Aqui suas diárias valem mais')]"));
		clicarBotao(By.xpath("(//div[@aria-label='Next slide'])[3]"));
//		scrollAteElemento(By.xpath("(//div[@aria-label='Next slide'])[3]"));
	}

}
