package pageObjects.manterBeneficiario;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;

public class AlterarSituacaoBeneficiarioPage extends BasePage {
	
	public void alterarSituacao(String beneficiario) {
		clicarBotao(By.xpath("(//div[contains(text(),'" + beneficiario + "')]//parent::div//parent::div//button)[1]"));
	}
	
	public void mensagemSucesso() {
		esperarElementoFicarVisivel2(By.xpath("//div[@class='snotifyToast__body']"));
		Assert.assertEquals("Alteração de situação realizada com sucesso.", obterTexto(By.xpath("//div[@class='snotifyToast__body']")));
	}

}
 