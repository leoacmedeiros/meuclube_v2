package pageObjects.manterFormaPagamento;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;
 
public class AdicionarFormaPagamentoPage extends BasePage {

	public void selecionarTitulo(String numeroTitulo) {
		clicarBotao(By.xpath(
				"//span[contains(text(),'" + numeroTitulo + "')]//parent::div//parent::div//parent::div//button"));
	}

	public void inserirNovaFormaPagamento() {
		clicarBotao(By.xpath("(//div[@class='v-input--selection-controls__input']/div)[1]"));
		clicarRadio(By.xpath(
				"//div[@class='flex pb-3 xs10']//parent::div//div[@class='v-input--selection-controls__ripple']"));
	}
 
	public void setFormaPagamento(String formaPagamento, String banco, String cartaoCredito) {
		clicarRadio(By.xpath("//label[contains(text(),'" + formaPagamento + "')]//parent::div/div/div"));
		if (formaPagamento.trim().contains("Débito")) {
			clicarBotao(By.xpath("//div[@class='v-select__slot']/label[contains(text(), 'Banco')]//parent::div"));
			clicarBotao(By.xpath("//div[contains(@class,'v-list__tile__title')][contains(text(),'" + banco + "')]"));
		} else if (formaPagamento.trim().contains("Cartão")) {
			escrever(By.xpath("//input[@aria-label='Número do Cartão']"), cartaoCredito);
		}
	}
	// div[contains(text(),'alterar a conta')]//parent::div//parent::div

	public void setAgencia(String tipoPagamento, String agencia) {
		if (tipoPagamento.trim().contains("Débito")) {
			escrever(By.xpath("//input[@aria-label='Agência']"), agencia);
		} else {
		}
	}

	public void setConta(String tipoPagamento, String conta) {
		if (tipoPagamento.trim().contains("Débito")) {
			escrever(By.xpath("//input[@aria-label='Conta']"), conta);
		} else {
		}
	}

	public void setValidadeCartao(String tipoPagamento, String mes, String ano) {
		if (tipoPagamento.trim().contains("Cartão")) {
			clicarBotao(
					By.xpath("//div[@class='v-select__slot']/label[contains(text(), 'Validade Mês')]//parent::div"));
			clicarBotao(By.xpath("//div[contains(@class,'v-list__tile__title')][text()='" + mes + "']"));
			clicarBotao(
					By.xpath("//div[@class='v-select__slot']/label[contains(text(), 'Validade Ano')]//parent::div"));
			clicarBotao(By.xpath("//div[contains(@class,'v-list__tile__title')][text()='" + ano + "']"));
		} else {
		}
	}

	public void adicionar() {
		clicarBotao(By.xpath("//div[contains(text(),'ADICIONAR')]"));
	}

	public void mensagemSucesso() {
		esperarElementoFicarVisivel2(By.xpath("//div[@class='snotifyToast__body']"));
		Assert.assertEquals("Dados Salvos com Sucesso", obterTexto(By.xpath("//div[@class='snotifyToast__body']")));
	}

}
