package runners.manterTitulos;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/manterTitulo/ReativarTitulo.feature"
		,glue = {"stepDefinitions"}
		,plugin = {"pretty"
				,"html:target/report-html/manterTitulo/ReativarTitulo"
				}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class ReativarTituloRunner {

}
