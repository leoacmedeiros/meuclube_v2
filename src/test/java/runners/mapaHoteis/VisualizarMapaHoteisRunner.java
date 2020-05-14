package runners.mapaHoteis;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/mapaHoteis/VisualizarMapaHoteis"
				}
		,features = "src/test/resources/features/mapaHoteis/VisualizarMapaHoteis.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class VisualizarMapaHoteisRunner {

}
