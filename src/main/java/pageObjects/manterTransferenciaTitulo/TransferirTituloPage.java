package pageObjects.manterTransferenciaTitulo;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;

public class TransferirTituloPage extends BasePage {

	public void selecionarTitulo(String numeroTitulo) {
		clicarCheck(By.xpath("(.//div[contains(text(),'" + numeroTitulo
				+ "')])[2]//parent::div//parent::div//div[1]/div//div/div/div/div"));
	}

	public void setTipoPessoa(String tipoPessoa, String cpfCnpj) {
		clicarRadio(By.xpath("//label[contains(text(),'" + tipoPessoa + "')]//parent::div/div/div"));
		if (tipoPessoa.trim().equals("Pessoa Física")) {
			escrever(By.xpath("//input[@aria-label='CPF']"), cpfCnpj);
		} else if (tipoPessoa.trim().equals("Pessoa Jurídica")) {
			escrever(By.xpath("//input[@aria-label='CNPJ']"), cpfCnpj);
		}
	}

	public void setNome(String tipoPessoa, String nome) {
		if (tipoPessoa.trim().equals("Pessoa Física")) {
			escrever(By.xpath("//input[@aria-label='Nome Completo']"), nome);
		} else if (tipoPessoa.trim().equals("Pessoa Jurídica")) {
			escrever(By.xpath("//input[@aria-label='Nome Fantasia']"), nome);
		}
	} 

	public void setRg(String tipoPessoa, String orgaoExpedidor, String rg) {
		if (tipoPessoa.trim().equals("Pessoa Física")) {
			escrever(By.xpath("//input[@aria-label='Órgão Expedidor']"), orgaoExpedidor);
			escrever(By.xpath("//input[@aria-label='RG']"), rg);
		} else {
		}
	}

	public void setDataNascimento(String tipoPessoa, String dataNascimento) {
		if (tipoPessoa.trim().equals("Pessoa Física")) {
			escrever(By.xpath("//input[@aria-label='Data de Nascimento']"), dataNascimento);
		} else {
		}
	}

	public void setSexo(String tipoPessoa, String sexo) {
		if (tipoPessoa.trim().equals("Pessoa Física")) {
			clicarBotao(By.xpath("//div[@class='v-select__slot']/label[contains(text(), 'Sexo')]//parent::div"));
			clicarBotao(By.xpath("//div[contains(@class,'v-list__tile__title')][contains(text(),'" + sexo + "')]"));
		} else {
		}
	}

	public void setEstadoCivil(String tipoPessoa, String estadoCivil) {
		if (tipoPessoa.trim().equals("Pessoa Física")) {
			clicarBotao(
					By.xpath("//div[@class='v-select__slot']/label[contains(text(), 'Estado Civil')]//parent::div"));
			clicarBotao(
					By.xpath("//div[contains(@class,'v-list__tile__title')][contains(text(),'" + estadoCivil + "')]"));
		} else {
		}
	}

	public void setTelefoneCelular(String telefoneCelular) {
		escrever(By.xpath("//input[@aria-label='Telefone Celular']"), telefoneCelular);
	}

	public void setTelefone(String tipoPessoa, String telefone) {
		if (tipoPessoa.trim().equals("Pessoa Física")) {
			escrever(By.xpath("//input[@aria-label='Telefone Residencial']"), telefone);
		} else if (tipoPessoa.trim().equals("Pessoa Jurídica")) {
			escrever(By.xpath("//input[@aria-label='Telefone Comercial']"), telefone);
		}
	}

	public void setEmail(String email) {
		escrever(By.xpath("//input[@aria-label='E-mail']"), email);
	}

	public void setCep(String cep) {
		escrever(By.xpath("//input[@aria-label='CEP']"), cep);
	}

	public void setComplemento(String complemento) {
		escrever(By.xpath("//input[@aria-label='Complemento']"), complemento);
	}

	public void setCidadeNatural(String tipoPessoal, String cidadeNatural) {
		if (tipoPessoal.trim().equals("Pessoa Física")) {
			escrever(By.xpath("(//input[@aria-label='Cidade'])[2]"), cidadeNatural);
		} else {
		}
	}

	public void setUfNatural(String tipoPessoal, String ufNatural) {
		if (tipoPessoal.trim().equals("Pessoa Física")) {
			escrever(By.xpath("(//input[@aria-label='UF'])[2]"), ufNatural);
		} else {
		}
	}

	public void setTipoPagamento(String tipoPagamento, String banco, String cartaoCredito) {
		clicarRadio(By.xpath("//label[contains(text(),'" + tipoPagamento + "')]//parent::div/div/div"));
		if (tipoPagamento.trim().contains("Débito")) {
			clicarBotao(By.xpath("//div[@class='v-select__slot']/label[contains(text(), 'Banco')]//parent::div"));
			clicarBotao(By.xpath("//div[contains(@class,'v-list__tile__title')][contains(text(),'" + banco + "')]"));
		} else if (tipoPagamento.trim().equals("Cartão de Crédito")) {
			escrever(By.xpath("//input[@aria-label='Número do Cartão']"), cartaoCredito);
		}
	}

	public void setAgencia(String tipoPagamento, String agencia) {
		if (tipoPagamento.trim().contains("Débito")) {
			escrever(By.xpath("//input[@aria-label='Agência']"), agencia);
		} else {
		}
	}

	public void setConta(String tipoPagamento, String conta) {
		if (tipoPagamento.trim().contains("Débito")) {
			escrever(By.xpath("//input[@aria-label='Conta']"), conta);
		} else {
		}
	}

	public void setValidadeCartao(String tipoPagamento, String mes, String ano) {
		if (tipoPagamento.trim().equals("Cartão de Crédito")) {
			clicarBotao(
					By.xpath("//div[@class='v-select__slot']/label[contains(text(), 'Validade Mês')]//parent::div"));
			clicarBotao(By.xpath("//div[contains(@class,'v-list__tile__title')][text()='" + mes + "']"));
			clicarBotao(
					By.xpath("//div[@class='v-select__slot']/label[contains(text(), 'Validade Ano')]//parent::div"));
			clicarBotao(By.xpath("//div[contains(@class,'v-list__tile__title')][text()='" + ano + "']"));
		} else {
		}
	}

	public void setDiaDebito(String diaDebito) {
		clicarBotao(By.xpath("//div[@class='v-select__slot']/label[contains(text(), 'Dia para débito')]//parent::div"));
		clicarBotao(By.xpath("//div[contains(@class,'v-list__tile__title')][text()='" + diaDebito + "']"));
	}
	
	public void setObservacoes(String observacoes) {
		escrever(By.xpath("//div[contains(text(),'Observações')]//parent::div//parent::div//textarea"), observacoes);
	}
	
	public void avancar() {
		clicarBotao(By.xpath("//div[contains(text(),'AVANÇAR')]"));
	}
	
	public void confirmar() {
		clicarBotao(By.xpath("//div[contains(text(),'ACEITO')]"));
		clicarBotao(By.xpath("//div[contains(text(),'CIENTE')]"));
	}
	
	public void mensagemSucesso() {
		esperarElementoFicarVisivel2(By.xpath("//div[@class='snotifyToast__body']"));
		Assert.assertEquals("Arquivo Gerado com Sucesso", obterTexto(By.xpath("//div[@class='snotifyToast__body']")));
	}
	
}