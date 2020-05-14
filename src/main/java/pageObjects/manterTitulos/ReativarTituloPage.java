package pageObjects.manterTitulos;

import org.openqa.selenium.By;
 
import core.BasePage;

public class ReativarTituloPage extends BasePage {

	public void selecionarTitulo(String titulo) {
		clicarRadio(By.xpath(".//div[contains(text(),'" + titulo
				+ "')]//parent::div//parent::div//div[1]//div//div//div//div//div//div//div"));
	}

	public void setDadoPagamento(String formaPagamento, String banco, String agencia, String contaCorrente,
			String cartao, String validadeCartao) {
		if (formaPagamento.trim().contains("Débito")) {
			clicarRadio(By.xpath("//div[@class='flex xs10']//child::div//div[contains(text(),'" + banco
					+ "')]//parent::div//parent::div//div[contains(text(),'Ag " + agencia
					+ "')]//parent::div//parent::div//div[contains(text(),'Cc " + contaCorrente
					+ "')]//parent::div//parent::div//parent::div//div[@class='v-input--selection-controls__ripple']"));
		} else if (formaPagamento.trim().contains("Mastercard") || formaPagamento.trim().contains("Visa")) {
			clicarRadio(By.xpath("//div[@class='flex xs10']//child::div//div[contains(text(),'" + cartao
					+ "')]//parent::div//parent::div//div[contains(text(),'" + validadeCartao
					+ "')]//parent::div//parent::div//parent::div//div[@class='v-input--selection-controls__ripple']"));
		}
	}

	public void setDiaDebito(String diaDebito) {
		clicarBotao(By.xpath("//div[@class='v-select__slot']"));
		clicarBotao(By.xpath("//div[@class='v-list__tile__title'][contains(text(),'" + diaDebito + "')]"));
	} 
		
	public void setSolicitarAnalise() {
		clicarCheck(By.xpath("//label[contains(text(),'ciente')]//parent::div/div/div"));
	}
	
	public void avancar() {
		clicarBotao(By.xpath("//div[contains(text(),'AVANÇAR')]"));
	}
	
	public void cienteAviso() {
		clicarBotao(By.xpath("//div[contains(text(),'CIENTE')]"));
	}

}
