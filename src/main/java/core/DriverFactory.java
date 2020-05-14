package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {
	private static WebDriver driver;

	private DriverFactory() {
	}

	public static WebDriver getDriver() {
		if (driver == null) {
			switch (Propriedades.browser) {
			case CHROME:
				String extensao = "";
				if (System.getProperty("os.name").startsWith("Win")) {
					extensao = ".exe";
				}
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver" + extensao);
				ChromeOptions optionsChrome = new ChromeOptions();
				optionsChrome.addArguments("start-maximized", "incognito");
				DesiredCapabilities capabilitiesChrome = new DesiredCapabilities();
				capabilitiesChrome.setCapability(ChromeOptions.CAPABILITY, optionsChrome);
				optionsChrome.merge(capabilitiesChrome);
				driver = new ChromeDriver(optionsChrome);
				break;
			case FIREFOX:
				driver = new FirefoxDriver();
				break;

			}
		}
		return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
