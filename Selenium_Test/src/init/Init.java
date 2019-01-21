package init;

import org.openqa.selenium.WebDriver;

import data.LoginData;
import setup.Setup;

public class Init {

	public static WebDriver setupBeforeTest() {
		// initialize driver
		return Setup.setupDriverForTestRun(0);
	}

	public static void setupBeforeMethod(WebDriver driver) {
		// initialize testPage
		Setup.setupBrowserForTestRun(driver, LoginData.ApplicationUrl);
	}

	public static void tearDownAfterMethod(WebDriver driver) {
		// logout
		Setup.teardownLogoutAtEndOfTestRun(driver);
	}

	// close connections, close browser
	public static void tearDownAfterTest(WebDriver driver) {
		Setup.teardownAfterTestRun(driver);
	}

}
