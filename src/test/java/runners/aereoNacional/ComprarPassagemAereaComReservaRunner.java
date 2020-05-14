package runners.aereoNacional;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/aereoNacional/ComprarPassagemAereaComReserva.feature"
		,glue = {"stepDefinitions"}
		,plugin = {"pretty"
				,"html:target/report-html/aereoNacional/ComprarPassagemAereaComReserva"
				}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)

public class ComprarPassagemAereaComReservaRunner {
	

}
