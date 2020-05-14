package runners.paginaIncial;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/paginaInicial/DicasDestinos.feature"
		,glue = {"stepDefinitions"}
		,plugin = {"pretty"
				,"html:target/report-html/paginaInicial/DicasDestinos"
				}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class DicasDestinosRunner {

}
