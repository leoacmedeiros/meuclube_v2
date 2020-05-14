package pageObjects.manterFormaPagamento;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;
 
public class AlterarFormaPagamentoPage extends BasePage {

	public void selecionarTitulo(String numeroTitulo) {
		clicarBotao(By.xpath(
				"//span[contains(text(),'" + numeroTitulo + "')]//parent::div//parent::div//parent::div//button"));
	}

	public void alterarConta() {
		clicarBotao(By.xpath("(//div[@class='v-input--selection-controls__input']/div)[1]"));
	}

	public void selecionarNovoMeioPagamento(String formaPagamento, String banco, String agencia, String contaCorrente,
			String cartao, String validadeCartao) {
		if (formaPagamento.trim().contains("Débito")) {
			clicarBotao(By.xpath("//div[@class='flex xs10']//child::div//div[contains(text(),'" + banco
					+ "')]//parent::div//parent::div//div[contains(text(),'Ag " + agencia
					+ "')]//parent::div//parent::div//div[contains(text(),'Cc " + contaCorrente
					+ "')]//parent::div//parent::div//parent::div//div[@class='v-input--selection-controls__ripple']"));
		} else if (formaPagamento.trim().contains("Mastercard") || formaPagamento.trim().contains("Visa")) {
			clicarBotao(By.xpath("//div[@class='flex xs10']//child::div//div[contains(text(),'" + cartao
					+ "')]//parent::div//parent::div//div[contains(text(),'" + validadeCartao
					+ "')]//parent::div//parent::div//parent::div//div[@class='v-input--selection-controls__ripple']"));
		}
	} 

	public void alterar() {
		clicarBotao(By.xpath("//div[contains(text(),'ALTERAR')]"));
	}

	public void mensagemSucesso() {
		esperarElementoFicarVisivel2(By.xpath("//div[@class='snotifyToast__body']"));
		Assert.assertEquals("Conta Alterada com sucesso.", obterTexto(By.xpath("//div[@class='snotifyToast__body']")));
	}
}
