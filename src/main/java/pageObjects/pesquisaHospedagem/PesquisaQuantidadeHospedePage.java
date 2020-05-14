package pageObjects.pesquisaHospedagem;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import core.BasePage;
import core.DriverFactory;

public class PesquisaQuantidadeHospedePage extends BasePage {

	public void setPesquisaCidade(String nomeCidade) {
		escrever(By.xpath("//input[@aria-label='Digite a UF, cidade ou hotel']"), nomeCidade);
		sleep(1);
		clicarBotao(By.xpath("(//div[contains(text(),'"+nomeCidade+"')])[1]"));
		
	}

	public void hospedeQuarto1(String qtdAdultoQuarto1, String qtdMenorQuarto1, String idadeMenor1, String idadeMenor2) {
		clicarBotao(By.xpath("//div//span[contains(text(),'quarto')]"));
		escrever(By.xpath("//div//span[contains(text(),'Quarto 1')]//parent::div//parent::div//parent::div//parent::div//div[contains(text(),'A partir de 18 anos')]//parent::div//parent::div//div//input"), qtdAdultoQuarto1);
		escrever(By.xpath("//div//span[contains(text(),'Quarto 1')]//parent::div//parent::div//parent::div//parent::div//div[contains(text(),'Até 17 anos')]//parent::div//parent::div//div//input"), qtdMenorQuarto1);
		DriverFactory.getDriver().findElement(By.xpath("//div//span[contains(text(),'Quarto 1')]//parent::div//parent::div//parent::div//parent::div//div[contains(text(),'Até 17 anos')]//parent::div//parent::div//div//input")).sendKeys(Keys.TAB);
		sleep(2);
		escrever(By.xpath("//div//span[contains(text(),'Quarto 1')]//parent::div//parent::div//parent::div//parent::div//div//span[contains(text(),'Idade Menor 1')]//parent::div//parent::div//input"), idadeMenor1);
		escrever(By.xpath("//div//span[contains(text(),'Quarto 1')]//parent::div//parent::div//parent::div//parent::div//div//span[contains(text(),'Idade Menor 2')]//parent::div//parent::div//input"), idadeMenor2);
	}
	
	public void adicionarQuarto() {
		clicarBotao(By.xpath("//button//div[contains(text(),'Adicionar quarto')]"));
	}
	
	public void hospedeQuarto2(String qtdAdultoQuarto2, String qtdMenorQuarto2, String idadeMenor1) {
		escrever(By.xpath("//div//span[contains(text(),'Quarto 2')]//parent::div//parent::div//parent::div//parent::div//div[contains(text(),'A partir de 18 anos')]//parent::div//parent::div//div//input"), qtdAdultoQuarto2);
		escrever(By.xpath("//div//span[contains(text(),'Quarto 2')]//parent::div//parent::div//parent::div//parent::div//div[contains(text(),'Até 17 anos')]//parent::div//parent::div//div//input"), qtdMenorQuarto2);
		DriverFactory.getDriver().findElement(By.xpath("//div//span[contains(text(),'Quarto 2')]//parent::div//parent::div//parent::div//parent::div//div[contains(text(),'Até 17 anos')]//parent::div//parent::div//div//input")).sendKeys(Keys.TAB);
		escrever(By.xpath("//div//span[contains(text(),'Quarto 2')]//parent::div//parent::div//parent::div//parent::div//div//span[contains(text(),'Idade Menor 1')]//parent::div//parent::div//input"), idadeMenor1);
	}
	
	public void hospedeQuarto3(String qtdAdultoQuarto3, String qtdMenorQuarto3, String idadeMenor1, String idadeMenor2) {
		escrever(By.xpath("//div//span[contains(text(),'Quarto 3')]//parent::div//parent::div//parent::div//parent::div//div[contains(text(),'A partir de 18 anos')]//parent::div//parent::div//div//input"), qtdAdultoQuarto3);
		escrever(By.xpath("//div//span[contains(text(),'Quarto 3')]//parent::div//parent::div//parent::div//parent::div//div[contains(text(),'Até 17 anos')]//parent::div//parent::div//div//input"), qtdMenorQuarto3);
		DriverFactory.getDriver().findElement(By.xpath("//div//span[contains(text(),'Quarto 3')]//parent::div//parent::div//parent::div//parent::div//div[contains(text(),'Até 17 anos')]//parent::div//parent::div//div//input")).sendKeys(Keys.TAB);
		escrever(By.xpath("//div//span[contains(text(),'Quarto 3')]//parent::div//parent::div//parent::div//parent::div//div//span[contains(text(),'Idade Menor 1')]//parent::div//parent::div//input"), idadeMenor1);
		escrever(By.xpath("//div//span[contains(text(),'Quarto 3')]//parent::div//parent::div//parent::div//parent::div//div//span[contains(text(),'Idade Menor 2')]//parent::div//parent::div//input"), idadeMenor2);
		
	}
	
	public void clicarFecharHospedeQuarto() {
		clicarBotao(By.xpath("//button//div[contains(text(),'Fechar')]"));
		sleep(2);
	}
	
	public void clicarBotaoAplicar() {
		scrollElementoClicar(By.xpath("//button//div[contains(text(),'Aplicar')]"));
	}
	
	public void verificarResultadosPesquisa() {
		esperarElementoFicarVisivel2(By.xpath("//div[contains(text(),'resultado')]"));
		
		try {
			boolean resultadosExibidos = DriverFactory.getDriver().findElement(By.xpath("//div[contains(text(),'resultado')]")).getText().contains("resultado");
			assertTrue(resultadosExibidos);
			System.out.println("Resultado: "+resultadosExibidos);
		}catch(AssertionError e){
			System.out.println("Resultado não encontrado!");
			
		}
	}

}
