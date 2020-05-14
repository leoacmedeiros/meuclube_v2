package pageObjects.aereoNacional;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import core.BasePage;
import core.DriverFactory;

public class ComprarPassagemAereaComReservaPage extends BasePage {

	public void clicarVoos() {
		clicarBotao(By.xpath("//span//i[contains(text(),'flight')]"));
	}

	public void selecionarPassagemDesconto() {
		esperarPresencaDoLoading();
		clicarBotao(By.xpath("//input[@value='reservaConfirmada']//parent::div//div"));
	}

	public void selecionarReserva() {
		
		boolean existeReserva = DriverFactory.getDriver().findElements(By.xpath("(//div[text()='Minhas Reservas']//parent::div//div[@class='v-input--selection-controls__ripple'])[1]")).size() > 0;
	
		if (existeReserva == true) {
			scrollElementoClicar(By.xpath("(//div[text()='Minhas Reservas']//parent::div//div[@class='v-input--selection-controls__ripple'])[1]"));
		} else {
			System.out.println("Não existe reserva para o usuário!");
		}
		
	}

	public void selecionarAeroporto() {
		clicarBotao(By.xpath("//div//span[text()='Selecione o Aeroporto']//parent::div//parent::div//div[@class='v-input--selection-controls__ripple']"));
		clicarBotao(By.xpath("//button//div[contains(text(),'confirmar')]"));
	}

	public void clicarProximo() {
		scrollElementoClicar(By.xpath("//button//div[contains(text(),'Próximo')]"));
	}

	public void verificarOrigemDestino() {
		boolean situacao = DriverFactory.getDriver().findElement(By.xpath("(//div[contains(text(),'Origem/Destino')])[2]")).getText().contains("Origem/Destino");
		Assertions.assertTrue(situacao);
	}

	public void inserirOrigemVoo(String cidadeOrigemVoo) {
		escrever(By.xpath("//label[text()='Origem']//parent::div//input"), cidadeOrigemVoo);
		clicarBotao(By.xpath("//div[contains(text(),'"+cidadeOrigemVoo+"')]"));
	}

	public void inserirAdulto(String adulto) {
		scrollElementoClicar(By.id("qntAdultos"));
		scrollElementoClicar(By.xpath("((//div[@class='v-list v-list--dense theme--light'])[3]//div[@class='v-list__tile__title'])[1]"));
	}

	public void inserirCrianca(String crianca) {
		scrollElementoClicar(By.id("qntCriancas"));
		scrollElementoClicar(By.xpath("((//div[@class='v-list v-list--dense theme--light'])[2]//div[@class='v-list__tile__title'])[2]"));
	}

	public void verificarVoosDisponiveis() {
		esperarPresencaDoLoading();
		boolean situacao = DriverFactory.getDriver().findElement(By.xpath("(//div[contains(text(),'Voos Disponíveis')])")).getText().contains("Voos Disponíveis");
		Assertions.assertTrue(situacao);
	}

	public void selecionarIda() {
				
		boolean companhia = DriverFactory.getDriver().findElements(By.id("companhia-G3")).size() > 0;

		if (companhia == true) {
			scrollElementoClicar(By.id("companhia-G3"));

		} else {
			scrollElementoClicar(By.id("companhia-AD"));
		}
		
		esperarPresencaDoLoading();
		scrollElementoClicar(By.xpath("(((//div[contains(text(),'IDA')])[1]//parent::div//parent::div)[1]//div[@class='v-input--selection-controls__ripple'])[1]"));
	}
	

	public void selecionarVolta() {
		scrollElementoClicar(By.xpath("((//div[contains(text(),'VOLTA')])[1]//following::div//following::div//following::div//following::div)[1]"));
	}

	public void selecionarVoos() {
		scrollElementoClicar(By.xpath("(//div[contains(text(),'Selecionar')])[1]"));
	}

	public void selecionarPacote() {
		scrollElementoClicar(By.xpath("(//div//span[contains(text(),'Selecione seu pacote')]//parent::div//parent::div//input)[1]"));
	}

	public void comprarVoo() {
		scrollElementoClicar(By.xpath("//button//div[contains(text(),'Comprar')]"));
	}

	public void setCpfAdulto(String cpfAdulto) {
		esperarPresencaDoLoading();
		escrever(By.id("cpfAdulto-0"), cpfAdulto);	
	}

	public void setPrimeiroNomeAdulto(String primeiroNomeAdulto) {
		escrever(By.id("primeiroNome-0"), primeiroNomeAdulto);
	}

	public void setUltimoNomeAdulto(String ultimoNomeAdulto) {
		escrever(By.id("ultimoNome-0"), ultimoNomeAdulto);
	}

	public void setSexoAdulto(String sexoAdulto) {
		scrollElementoClicar(By.id("sexo-0"));
		scrollElementoClicar(By.xpath("(//div[text()='"+sexoAdulto+"'])[2]"));
	}

	public void setDtNascAdulto(String dtNascAdulto) {
		escrever(By.id("dtNascimento-0"), dtNascAdulto);
	}

	public void setEmailAdulto(String emailAdulto) {
		escrever(By.id("email-0"), emailAdulto);
	}

	public void setCelularAdulto(String celularAdulto) {
		escrever(By.id("telefone-0"), celularAdulto);	
	}

	public void setPrimeiroNomeCrianca(String primeiroNomeCrianca) {
		escrever(By.id("primeiroNome-1"), primeiroNomeCrianca);
	}

	public void setUltimoNomeCrianca(String ultimoNomeCrianca) {
		escrever(By.id("ultimoNome-1"), ultimoNomeCrianca);
	}

	public void setSexoCrianca(String sexoCrianca) {
		scrollElementoClicar(By.id("sexo-1"));
		scrollElementoClicar(By.xpath("(//div[text()='"+sexoCrianca+"'])[1]"));
	}

	public void setDtNascCrianca(String dtNascCrianca) {
		escrever(By.id("dtNascimento-1"), dtNascCrianca);
	}

	public void setEmailCrianca(String emailCrianca) {
		escrever(By.id("email-1"), emailCrianca);
	}

	public void setCelularCrianca(String celularCrianca) {
		escrever(By.id("telefone-1"), celularCrianca);
	}

	public void clicarEstouCienteRegras() {
		scrollElementoClicar(By.id("checkboxTermoAceite"));
	}

	public void clicarInformeDadosPagamento() {
		scrollElementoClicar(By.id("btnDadosPagamento"));
	}

	public void setCpfPagante(String cpfPagante) {
		esperarPresencaDoLoading();
		escrever(By.id("cpfPagante"), cpfPagante);
	}

	public void setPrimeiroNomePagante(String primeiroNomePagante) {
		esperarPresencaDoLoading();
		escrever(By.id("primeiroNomePagante"), primeiroNomePagante);
	}

	public void setUltimoNomePagante(String ultimoNomePagante) {
		escrever(By.id("ultimoNomePagante"), ultimoNomePagante);
	}

	public void setSexoPagante(String sexoPagante) {
		scrollElementoClicar(By.id("sexoPagante"));
		scrollElementoClicar(By.xpath("(//div[text()='"+sexoPagante+"'])[1]"));
	}

	public void setDtNascPagante(String nascimentoPagante) {
		escrever(By.id("nascimentoPagante"), nascimentoPagante);
	}

	public void setCelularPagante(String telefonePagante) {
		escrever(By.id("telefonePagante"), telefonePagante);
	}

	public void setEmailPagante(String emailPagante) {
		escrever(By.id("emailPagante"), emailPagante);
	}

	public void setConfirmacaoEmailPagante(String confirmacaoEmailPagante) {
		escrever(By.id("confirmacaoEmailPagante"), confirmacaoEmailPagante);
	}

	public void setCepPagante(String cepPagante) {
		escrever(By.id("cepPagante"), cepPagante);
	}

	public void setNumEndPagante(String numeroEnderecoPagante) {
		escrever(By.id("numeroEnderecoPagante"), numeroEnderecoPagante);
	}

	public void setCompEndPagante(String complementoPagante) {
		escrever(By.id("complementoPagante"), complementoPagante);
	}

	public void selecionarCartaoPagante() {
		scrollElementoClicar(By.id("bandeiraCartao-visa"));
	}

	public void setTitularCartao(String nomeTitularCartao) {
		escrever(By.id("nomeTitularCartao"), nomeTitularCartao);
	}

	public void setNumCartao(String numeroCartao) {
		escrever(By.id("numeroCartao"), numeroCartao);
	}

	public void setCodCartao(String codigoCartao) {
		escrever(By.id("codigoCartao"), codigoCartao);
	}

	public void setMesCartao(String mesCartao) {
		scrollElementoClicar(By.id("mesCartao"));
		scrollElementoClicar(By.xpath("(//div[text()='"+mesCartao+"'])[1]"));
	}

	public void setAnoCartao(String anoCartao) {
		scrollElementoClicar(By.id("anoCartao"));
		scrollElementoClicar(By.xpath("(//div[text()='"+anoCartao+"'])[1]"));
	}

	public void clicarBotaoParcelar() {
		scrollElementoClicar(By.id("btnParcelamento"));
	}

	public void selecionarParcelas() {
		esperarPresencaDoLoading();
		scrollElementoClicar(By.id("numerosParcelas"));
		scrollElementoClicar(By.xpath("(//div[text()='2'])[1]"));
	}

	public void clicarRegras() {
		esperarPresencaDoLoading();
		scrollElementoClicar(By.id("regrasTarifarias"));
	}

	public void clicarAceitarRegrasTarifarias() {
		scrollElementoClicar(By.id("termoAceiteRegraTarifaria"));
	}

	public void clicarBotaoAceitar() {
		scrollElementoClicar(By.id("btnAceiteRegraTarifaria"));
	}

	public void clicarBotaoComprar() {
		scrollElementoClicar(By.id("comprarPassagem"));
	}
	
	
	



}
