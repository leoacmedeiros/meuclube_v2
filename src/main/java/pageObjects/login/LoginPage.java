package pageObjects.login;

import org.junit.Assert;
import org.openqa.selenium.By;
 
import core.BasePage;
import core.DriverFactory;

public class LoginPage extends BasePage {

	private static String TST = "http://tst01-cbtur.bancorbras.com.br";
	private static String HML01 = "http://hml01-cbtur.bancorbras.com.br";
	private static String HML02 = "http://hml02-cbtur.bancorbras.com.br";

	public void acessarMeuClube() {
		DriverFactory.getDriver().get(TST);
	}

	public void setUsuario(String usuario) {
		escrever("iptUser", usuario);
	}

	public void setSenha(String senha) {
		escrever("iptpass", senha);
	}

	public void entrar() {
		clicarBotao(By.xpath("//button[@class='btn btnEnviar']"));
		sleep(5);
		esperarElementoFicarVisivel2(By.xpath("//button//div[contains(text(),'Ciente')]"));	
		
		Boolean cienteCovid = DriverFactory.getDriver().findElements(By.xpath("//button//div[contains(text(),'Ciente')]")).size() > 0;			
			
			if (cienteCovid == true) {
				clicarBotao(By.xpath("//button//div[contains(text(),'Ciente')]"));
			} else {
				
			}
	
		Boolean pular = DriverFactory.getDriver().findElements(By.xpath("//button[contains(text(),'Pular')]")).size() > 0;			
			
			if (pular == true) {
				clicarBotao(By.xpath("//button[contains(text(),'Pular')]"));
			} else {
				
			}
		
	}
	
	public boolean verificaPaginaInicial() {
		String cabecalho = obterTexto(By.xpath("//div[@class='app-header__mobile-menu']//img"));
		return cabecalho.contains("Bancorbrás");
	}

}


