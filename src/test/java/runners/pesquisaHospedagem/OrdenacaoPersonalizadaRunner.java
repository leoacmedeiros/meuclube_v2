package runners.pesquisaHospedagem;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/pesquisaHospedagem/OrdenacaoPersonalizada"
				}
		,features = "src/test/resources/features/pesquisaHospedagem/OrdenacaoPersonalizada.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class OrdenacaoPersonalizadaRunner {

}
