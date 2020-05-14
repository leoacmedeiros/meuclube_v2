package pageObjects.manterBeneficiario;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage; 

public class AdicionarBeneficiarioPage extends BasePage {

	public void adicionar() {
		clicarBotao(By.xpath(
				"//button[@class='v-btn v-btn--bottom v-btn--floating v-btn--fixed v-btn--right theme--dark orange darken-2']//div[@class='v-btn__content']"));
	} 

	public void setNome(String nomeCompleto) {
		escrever(By.xpath("//input[@aria-label='Nome Completo']"), nomeCompleto);
	}

	public void setVinculo(String vinculo) {
		clicarBotao(By.xpath("//input[@aria-label='Vínculo']"));
		clicarBotao(By.xpath("//div[@class='v-list__tile__title'][text()='" + vinculo + "']"));
	}

	public void setCpf(String cpf) {
		escrever(By.xpath("//input[@aria-label='CPF']"), cpf);
	}

	public void setDataNascimento(String dataNascimento) {
		escrever(By.xpath("//input[@aria-label='Data de Nascimento']"), dataNascimento);
	}

	public void setemail(String email) {
		escrever(By.xpath("//input[@aria-label='E-mail']"), email);
	}

	public void setTelefoneCelular(String telefoneCelular) {
		escrever(By.xpath("//input[@aria-label='Telefone Celular']"), telefoneCelular);
	}
	
	public void salvarBeneficiario() {
		clicarBotao(By.xpath("//div[@class='v-btn__content'][text()='Salvar']"));
	}
	
	public void mensagemSucesso() {
		esperarElementoFicarVisivel2(By.xpath("//div[@class='snotifyToast__body']"));
		Assert.assertEquals("Beneficiário adicionado com sucesso", obterTexto(By.xpath("//div[@class='snotifyToast__body']")));
	}

}
