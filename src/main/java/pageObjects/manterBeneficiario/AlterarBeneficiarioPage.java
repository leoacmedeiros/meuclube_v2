package pageObjects.manterBeneficiario;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage; 

public class AlterarBeneficiarioPage extends BasePage {

	public void selecionarBeneficiario(String beneficiario) {
		clicarBotao(By.xpath("(//div[contains(text(),'" + beneficiario + "')]//parent::div//parent::div//button)[2]"));
	}

	public void setNome(String nomeCompleto) {
		forcarLimparTexto(By.xpath("//input[@aria-label='Nome Completo']"));
		escrever(By.xpath("//input[@aria-label='Nome Completo']"), nomeCompleto);
	}

	public void setVinculo(String vinculo) {
		clicarBotao(By.xpath("//input[@aria-label='Vínculo']"));
		clicarBotao(By.xpath("//div[@class='v-list__tile__title'][text()='" + vinculo + "']"));
	}

	public void setCpf(String cpf) {
		forcarLimparTexto(By.xpath("//input[@aria-label='CPF']"));
		escrever(By.xpath("//input[@aria-label='CPF']"), cpf);
	}

	public void setDataNascimento(String dataNascimento) {
		forcarLimparTexto(By.xpath("//input[@aria-label='Data de Nascimento']"));
		escrever(By.xpath("//input[@aria-label='Data de Nascimento']"), dataNascimento);
	}

	public void setemail(String email) {
		forcarLimparTexto(By.xpath("//input[@aria-label='E-mail']"));
		escrever(By.xpath("//input[@aria-label='E-mail']"), email);
	}

	public void setTelefoneCelular(String telefoneCelular) {
		forcarLimparTexto(By.xpath("//input[@aria-label='Telefone Celular']"));
		escrever(By.xpath("//input[@aria-label='Telefone Celular']"), telefoneCelular);
	}

	public void salvarBeneficiario() {
		clicarBotao(By.xpath("//div[@class='v-btn__content'][text()='Salvar']"));
	}

	public void mensagemSucesso() {
		esperarElementoFicarVisivel2(By.xpath("//div[@class='snotifyToast__body']"));
		Assert.assertEquals("Beneficiário Atualizado com sucesso.", obterTexto(By.xpath("//div[@class='snotifyToast__body']")));
	}

}
