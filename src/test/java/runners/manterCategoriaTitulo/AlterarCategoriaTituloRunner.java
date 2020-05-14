package runners.manterCategoriaTitulo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/manterCategoriaTitulo/AlterarCategoriaTitulo.feature"
		,glue = {"stepDefinitions"}
		,plugin = {"pretty"
				,"html:target/report-html/manterCategoriaTitulo/AlterarCategoriaTitulo"
				}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class AlterarCategoriaTituloRunner {

}
