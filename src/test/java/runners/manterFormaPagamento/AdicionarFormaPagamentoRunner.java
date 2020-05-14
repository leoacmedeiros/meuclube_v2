package runners.manterFormaPagamento;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/manterFormaPagamento/AdicionarFormaPagamento.feature"
		,glue = {"stepDefinitions"}
		,plugin = {"pretty"
				,"html:target/report-html/manterFormaPagamento/AdicionarFormaPagamento"
				}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class AdicionarFormaPagamentoRunner {

}