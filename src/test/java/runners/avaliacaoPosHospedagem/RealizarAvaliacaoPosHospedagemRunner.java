package runners.avaliacaoPosHospedagem;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/avaliacaoPosHospedagem/RealizarAvaliacaoPosHospedagem"
				}
		,features = "src/test/resources/features/avaliacaoPosHospedagem/RealizarAvaliacaoPosHospedagem.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class RealizarAvaliacaoPosHospedagemRunner {

}
