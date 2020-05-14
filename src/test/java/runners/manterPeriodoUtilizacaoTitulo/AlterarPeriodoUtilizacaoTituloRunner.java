package runners.manterPeriodoUtilizacaoTitulo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/manterPeriodoUtilizacaoTitulo/AlterarPeriodoUtilizacaoTitulo.feature"
		,glue = {"stepDefinitions"}
		,plugin = {"pretty"
				,"html:target/report-html/manterPeriodoUtilizacaoTitulo/AlterarPeriodoUtilizacaoTitulo"
				}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class AlterarPeriodoUtilizacaoTituloRunner {

}
