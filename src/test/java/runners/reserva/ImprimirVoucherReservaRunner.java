package runners.reserva;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				,"html:target/report-html/reserva/ImprimirVoucherReserva"
				}
		,features = "src/test/resources/features/reserva/ImprimirVoucherReserva.feature"
		,glue = {"stepDefinitions"}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class ImprimirVoucherReservaRunner {

}
