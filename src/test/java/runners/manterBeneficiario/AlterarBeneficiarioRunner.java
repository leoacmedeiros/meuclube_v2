package runners.manterBeneficiario;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/manterBeneficiario/AlterarBeneficiario.feature"
		,glue = {"stepDefinitions"}
		,plugin = {"pretty"
				,"html:target/report-html/manterBeneficiario/AlterarBeneficiario"
				}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)

public class AlterarBeneficiarioRunner {
	

}
