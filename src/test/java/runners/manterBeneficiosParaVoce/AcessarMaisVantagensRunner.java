package runners.manterBeneficiosParaVoce;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/manterBeneficiosParaVoce/AcessarMaisVantagens.feature"
		,glue = {"stepDefinitions"}
		,plugin = {"pretty"
				,"html:target/report-html/manterBeneficiosParaVoce/AcessarMaisVantagens"
				}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)

public class AcessarMaisVantagensRunner {

}
