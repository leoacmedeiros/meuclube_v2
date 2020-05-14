package pageObjects.manterBeneficiosParaVoce;

import org.openqa.selenium.By;

import core.BasePage;
 
public class AcessarMaisVantagensPage extends BasePage {

	public void acessarMaisVantagens() {
		clicarBotao(By.xpath("//span[contains(text(),'Mais Vantagens')]"));
	}
	
	public void obterMaisInformacoesBeneficio() {
		clicarBotao(By.xpath("//div[contains(text(),'Mais Informações')]"));
	}
	
	public void verificaPaginaMaisVantagens() {
		//implementar lógica para verificação de redirecionamento para página
	}

	public void acessarMinhasIndicacoes() {
	}

	public void acessarRegulamento() {
	}

} 
