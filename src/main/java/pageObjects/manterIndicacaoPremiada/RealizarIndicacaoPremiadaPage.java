package pageObjects.manterIndicacaoPremiada;

import org.openqa.selenium.By;

import core.BasePage;
 
public class RealizarIndicacaoPremiadaPage extends BasePage {

	public void acessarProgamaIndicacao() {
		clicarBotao(By.xpath(
				"//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//div[@class='v-responsive__content']"));
		mudarAba(1);
	}

	public void acessarMinhasIndicacoes() {
		clicarBotao(By.xpath(
				"//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//div[@class='v-btn__content'][contains(text(),'Minhas Indicações')]"));
	}

	public void acessarRegulamento() {
		clicarBotao(By.xpath(
				"//div[@class='v-dialog v-dialog--active v-dialog--scrollable']//div[@class='v-btn__content'][contains(text(),'Regulamento')]"));
	}
 
	public void setTipoPessoaIndicado(String tipoPessoa) {
		if (tipoPessoa.trim().contains("Física")) {
			clicarRadio(By.id("rdpessoafisica"));
		} else if (tipoPessoa.trim().contains("Jurídica")) {
			clicarBotao(By.id("rdpessoajuridica"));
		}
	}
	
	public void setNomeIndicado(String nome) {
		escrever(By.xpath("//div[@id='camposAmigo']//input[@id='Nome']"), nome);
	}

	public void setEmailIndicado(String email) {
		escrever(By.id("EmailIndicado"), email);
	}

	public void setDocumentoIndicado(String tipoPessoa, String documento) {
		if (tipoPessoa.trim().contains("Física")) {
			escrever(By.id("FieldCpf"), documento);
		} else if (tipoPessoa.trim().contains("Jurídica")) {
			escrever(By.id("FieldCnpj"), documento);
		}
	}

	public void setTelefoneIndicado(String telefone) {
		escrever(By.id("TelefoneIndicado"), telefone);
	}

	public void setCelularIndicado(String celular) {
		escrever(By.id("CelularIndicado"), celular);
	}

	public void setUfIndicado(String uf) {
		clicarBotao(By.xpath("//span[@id='select2-ListUfIndicador-container']"));
		escrever(By.xpath("//input[@class='select2-search__field']"), uf);
		clicarBotao(By.xpath("//ul[@id='select2-ListUfIndicador-results']/li[contains(text(),'" + uf + "')]"));

	}

	public void enviarIndicado() {
		// clicarBotao(By.id("btnEnviarIndicacao"));
	}

}
