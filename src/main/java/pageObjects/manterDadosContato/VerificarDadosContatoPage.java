package pageObjects.manterDadosContato;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;
 
public class VerificarDadosContatoPage extends BasePage {
	
	public void verificarSuporteHospedagem() {
		Assert.assertEquals("Suporte à Hospedagem", obterTexto(By.xpath("(//div[@class='subheading blue--text text--darken-4'])[1]")));
	}
	
	public void verificarCentralAtendimento() {
		Assert.assertEquals("Central de Atendimento", obterTexto(By.xpath("(//div[@class='subheading blue--text text--darken-4'])[2]")));
	}
	public void verificarSac() {
		Assert.assertEquals("SAC", obterTexto(By.xpath("(//div[@class='subheading blue--text text--darken-4'])[3]")));
	}

	
}
 