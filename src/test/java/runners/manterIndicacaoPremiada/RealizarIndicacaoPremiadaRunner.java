package runners.manterIndicacaoPremiada;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/manterIndicacaoPremiada/RealizarIndicacaoPremiada.feature"
		,glue = {"stepDefinitions"}
		,plugin = {"pretty"
				,"html:target/report-html/manterIndicacaoPremiada/RealizarIndicacaoPremiada"
				}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)

public class RealizarIndicacaoPremiadaRunner {

}
