package runners.manterDadosContato;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/manterDadosContato/VerificarDadosContato"
				}
		,features = "src/test/resources/features/manterDadosContato/VerificarDadosContato.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class VerificarDadosContatoRunner {

}
