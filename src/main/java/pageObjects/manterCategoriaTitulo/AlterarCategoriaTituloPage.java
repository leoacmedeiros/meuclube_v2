package pageObjects.manterCategoriaTitulo;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;
 
public class AlterarCategoriaTituloPage extends BasePage {

	public void selecionarTitulo(String numeroTitulo) {
		clicarRadio(By.xpath("(.//div[contains(text(),'" + numeroTitulo
				+ "')])[2]//parent::div//parent::div//div[1]//div//div//div//div//div//div//div"));
	}

	public void setCategoriaPretendida(String numeroTitulo, String novaCategoria) {
		clicarBotao(By.xpath("((.//div[contains(text(),'" + numeroTitulo
				+ "')])[2]//parent::div//parent::div//parent::div//parent::div)[1]/div[2]//div[@class='v-input__control']"));
		clicarBotao(By.xpath("//div[contains(@class,'v-list__tile__title')][text()='" + novaCategoria + "']"));
	}
	
	public void confirmarAlteracao() {
		clicarBotao(By.xpath("//div[contains(text(),'ACEITO')]"));
		clicarBotao(By.xpath("//div[contains(text(),'CIENTE')]"));
	}
	
	public void mensagemSucesso() {
		esperarElementoFicarVisivel2(By.xpath("//div[@class='snotifyToast__body']"));
		Assert.assertEquals("Solicitação registrada com sucesso", obterTexto(By.xpath("//div[@class='snotifyToast__body']")));
	}
 
}