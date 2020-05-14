package runners.login;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/login/Login.feature"
		,glue = {"stepDefinitions"}
		,plugin = {"pretty"
				,"html:target/report-html/login/EfetuarLogin"
				}
		,monochrome = true
//		,dryRun = true
		,dryRun = false
		)
public class LoginRunner {

}
