package stepDefinitions.manterFormaPagamento;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pageObjects.manterFormaPagamento.AlterarDiaDebitoPage;

public class AlterarDiaDebitoSteps {
	
	AlterarDiaDebitoPage alterarDiaDebito = new AlterarDiaDebitoPage();
	
	@Quando("^selecionar outra dia de débito$")
	public void selecionar_outra_dia_de_débito(DataTable formData) throws Throwable {
		List<List<String>> data = formData.raw();
		alterarDiaDebito.alterarDiaDebito();
		alterarDiaDebito.setNovoDiaDebito(data.get(0).get(1));
	}

	@Então("^será modificado o dia de débito do título$")
	public void será_modificado_o_dia_de_débito_do_título() throws Throwable {
		alterarDiaDebito.mensagemSucesso();
	}

}
