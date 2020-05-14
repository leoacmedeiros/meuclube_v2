package pageObjects.manterTitulos;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;
 
public class AdquirirTituloPage extends BasePage {

	public static final String NOVA_PROPOSTA = "//span[contains(text(),'Nova Proposta')]";
	public static final String EXECUTIVO_2 = "(//div/input[@class='el-input__inner'])[1]";
	public static final String EXECUTIVO_3 = "(//div/input[@class='el-input__inner'])[2]";
	public static final String SUPERIOR_2 = "(//div/input[@class='el-input__inner'])[3]";
	public static final String SUPERIOR_3 = "(//div/input[@class='el-input__inner'])[4]";

	public void criarProposta() {
		clicarBotao(By.xpath(NOVA_PROPOSTA));
	}

	public void setTitulo(String categoria, String quantidade) {
		if (categoria.trim().equals("Executivo 2")) {
			escrever(By.xpath(EXECUTIVO_2), quantidade);
		} else if (categoria.trim().equals("Executivo 3")) {
			escrever(By.xpath(EXECUTIVO_3), quantidade);
		} else if (categoria.trim().equals("Superior 2")) {
			escrever(By.xpath(SUPERIOR_2), quantidade);
		} else if (categoria.trim().equals("Superior 3")) {
			escrever(By.xpath(SUPERIOR_3), quantidade);
		}
	} 

	public void prosseguir() {
		clicarBotao(By.xpath("//div[contains(text(),'PROSSEGUIR')]"));
	}

	public void setDadoPagamento(String meioPagamento, String agencia, String contaCorrente, String finalCartao) {
		
		if (meioPagamento.trim().equals("BANCO DO BRASIL") 
				&& agencia.trim().equals("1230-0")
				&& contaCorrente.trim().equals("88.301.297-9")) {
			clicarRadio(By.xpath("(//div[@class='v-input--selection-controls__input']//div[@class='v-input--selection-controls__ripple'])[2]"));
		} else if (meioPagamento.trim().equals("BANCO DO BRASIL") 
				&& agencia.trim().equals("1230-0")
				&& contaCorrente.trim().equals("9110-3")) {
			clicarRadio(By.xpath("(//div[@class='v-input--selection-controls__input']//div[@class='v-input--selection-controls__ripple'])[3]"));
		} else if (meioPagamento.trim().equals("Visa") 
				&& finalCartao.trim().equals("6596")) {
			clicarRadio(By.xpath("(//div[@class='v-input--selection-controls__input']//div[@class='v-input--selection-controls__ripple'])[4]"));
		} else if (meioPagamento.trim().equals("Mastercard") 
				&& finalCartao.trim().equals("3290")) {
			clicarRadio(By.xpath("(//div[@class='v-input--selection-controls__input']//div[@class='v-input--selection-controls__ripple'])[6]"));
		}
	}
	
	public void setDiaDebito(String diaDebito) {
		clicarBotao(By.xpath("//div[@class='v-select__slot']"));
		clicarBotao(By.xpath("//div[contains(@class,'v-list__tile__title')][contains(text(),'"+ diaDebito + "')]"));
	}
	
	public void aceitarTermoAquisicao() {
		clicarCheck(By.xpath("//div[@class='flex pt-5 pb-5 xs12 sm12 md12']//div[@class='v-input--selection-controls__ripple']"));
	}
	
	public void avancar() {
		clicarBotao(By.xpath("//div[contains(text(),'AVANÇAR')]"));
	}
	
	public void aceitarRegimentoInterno() {
		scrollElementoClicar(By.xpath("(//div[@class='v-input--selection-controls__input']/input)[1]"));
		clicarBotao(By.xpath("//div[contains(text(),'ACEITO')]"));
	}
	
	public void confirmarAquisicao() {
		clicarBotao(By.xpath("//div[contains(text(),'CIENTE')]"));
	}
	
	public void mensagemSucesso() {
		esperarElementoFicarVisivel2(By.xpath("//div[@class='snotifyToast__body']"));
		Assert.assertEquals("Título adquirido com sucesso", obterTexto(By.xpath("//div[@class='snotifyToast__body']")));
	}

}
