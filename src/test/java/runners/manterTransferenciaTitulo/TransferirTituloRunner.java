package runners.manterTransferenciaTitulo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/manterTransferenciaTitulo/TransferirTitulo.feature"
		,glue = {"stepDefinitions"}
		,plugin = {"pretty"
				,"html:target/report-html/manterTransferenciaTitulo/TransferirTitulo"
				}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class TransferirTituloRunner {

}
