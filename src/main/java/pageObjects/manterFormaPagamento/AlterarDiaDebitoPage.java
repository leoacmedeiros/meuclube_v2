package pageObjects.manterFormaPagamento;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;
 
public class AlterarDiaDebitoPage extends BasePage {

	public void alterarDiaDebito() {
		clicarBotao(By.xpath("(//div[@class='v-input--selection-controls__input']/div)[4]"));
	}

	public void setNovoDiaDebito(String novoDiaDebito) {
		clicarBotao(By.xpath("//div[@class='v-select__slot']"));
		clicarBotao(
				By.xpath("//div[contains(@class,'v-list__tile__title')][contains(text(),'" + novoDiaDebito + "')]"));
	}

	public void mensagemSucesso() {
		esperarElementoFicarVisivel2(By.xpath("//div[@class='snotifyToast__body']"));
		Assert.assertEquals("Sua solicitação será encaminhada ao setor responsável e processada em breve.",
				obterTexto(By.xpath("//div[@class='snotifyToast__body']")));
	}

}
 