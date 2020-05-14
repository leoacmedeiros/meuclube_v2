package pageObjects.avaliacaoPosHospedagem;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;
import core.DriverFactory;

public class RealizarAvaliacaoPosHospedagemPage extends BasePage {

	public void selecionarHospedagemAvaliacaoExperiencia() {
		scrollElementoClicar(By.xpath("(//div[text()='Avalie sua experiência']//parent::div//div[@class='v-rating v-rating--readonly'])[1]"));
		sleep(2);
	}

	public void pergunta1(String opcao1Pergunta1, String opcao2Pergunta1, String opcao3Pergunta1, String opcao4Pergunta1) {
		scrollElementoClicar(By.xpath("(//div//span[text()='"+opcao1Pergunta1+"']//parent::div//parent::div//div//i)[5]"));
		scrollElementoClicar(By.xpath("(//div//span[text()='"+opcao2Pergunta1+"']//parent::div//parent::div//div//i)[5]"));
		scrollElementoClicar(By.xpath("(//div//span[text()='"+opcao3Pergunta1+"']//parent::div//parent::div//div//i)[5]"));
		scrollElementoClicar(By.xpath("(//div//span[text()='"+opcao4Pergunta1+"']//parent::div//parent::div//div//i)[5]"));
	}

	public void pergunta2(String opcao1Pergunta2, String opcao2Pergunta2, String opcao3Pergunta2, String opcao4Pergunta2, String opcao5Pergunta2, String opcao6Pergunta2) {
		scrollElementoClicar(By.xpath("(//div//span[text()='"+opcao1Pergunta2+"']//parent::div//parent::div//div//i)[5]"));
		scrollElementoClicar(By.xpath("(//div//span[text()='"+opcao2Pergunta2+"']//parent::div//parent::div//div//i)[5]"));
		scrollElementoClicar(By.xpath("(//div//span[text()='"+opcao3Pergunta2+"']//parent::div//parent::div//div//i)[5]"));
		scrollElementoClicar(By.xpath("(//div//span[text()='"+opcao4Pergunta2+"']//parent::div//parent::div//div//i)[5]"));
		scrollElementoClicar(By.xpath("(//div//span[text()='"+opcao5Pergunta2+"']//parent::div//parent::div//div//i)[5]"));
		scrollElementoClicar(By.xpath("(//div//span[text()='"+opcao6Pergunta2+"']//parent::div//parent::div//div//i)[5]"));
		
	}

	public void pergunta3(String opcao1Pergunta3, String opcao2Pergunta3, String opcao3Pergunta3, String opcao4Pergunta3) {
		scrollElementoClicar(By.xpath("(//div//span[text()='"+opcao1Pergunta3+"']//parent::div//parent::div//div//i)[5]"));
		scrollElementoClicar(By.xpath("(//div//span[text()='"+opcao2Pergunta3+"']//parent::div//parent::div//div//i)[5]"));
		scrollElementoClicar(By.xpath("(//div//span[text()='"+opcao3Pergunta3+"']//parent::div//parent::div//div//i)[5]"));
		scrollElementoClicar(By.xpath("(//div//span[text()='"+opcao4Pergunta3+"']//parent::div//parent::div//div//i)[5]"));
		
	}

	public void pergunta4(String opcao1Pergunta4, String opcao2Pergunta4, String opcao3Pergunta4) {
		scrollElementoClicar(By.xpath("(//div//span[text()='"+opcao1Pergunta4+"']//parent::div//parent::div//div//i)[5]"));
		scrollElementoClicar(By.xpath("(//div//span[text()='"+opcao2Pergunta4+"']//parent::div//parent::div//div//i)[5]"));
		scrollElementoClicar(By.xpath("(//div//span[text()='"+opcao3Pergunta4+"']//parent::div//parent::div//div//i)[5]"));
		
	}

	public void pergunta5(String opcao1Pergunta5) {
		scrollElementoClicar(By.xpath("(//div[contains(text(),'"+opcao1Pergunta5+"')]//parent::div//div//i)[5]"));
	
	}

	public void pergunta6(String escrever1Pergunta6, String texto) {
		escrever(By.xpath("//div[contains(text(),'"+escrever1Pergunta6+"')]//parent::div//textarea"), texto);

	}

	public void pergunta7(String selecionarOpcao, String escrever1Pergunta7, String texto) {
		scrollElementoClicar(By.xpath("//label[text()='"+selecionarOpcao+"']"));
		escrever(By.xpath("//div[contains(text(),'"+escrever1Pergunta7+"')]//parent::div//parent::div//parent::div//textarea"), texto);
	
	}

	public void pergunta8(String escrever1Pergunta8, String texto) {
		escrever(By.xpath("//div[contains(text(),'"+escrever1Pergunta8+"')]//parent::div//textarea"), texto);
				
	}

	public void clicarEnviar() {
		scrollElementoClicar(By.xpath("(//button//div[text()='Enviar'])[1]"));
		
	}

	public void mensagemSucesso() {
		esperarElementoFicarVisivel2(By.xpath("//div[@class='v-snack__content']"));
		Assert.assertEquals("Avaliação Salva Com Sucesso".substring(0,15), obterTexto(By.xpath("//div[@class='v-snack__content'][contains(text(),'Avaliação Salva Com Sucesso')]")).substring(0,15));
		
	}




}
