package runners.pesquisaHospedagem;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/pesquisaHospedagem/FiltrarResultadosRefinarBusca"
				}
		,features = "src/test/resources/features/pesquisaHospedagem/FiltrarResultadosRefinarBusca.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class FiltrarResultadosRefinarBuscaRunner {

}
