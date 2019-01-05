package init;

import setup.Setup;
import org.openqa.selenium.WebDriver;

public class Init {

	public static WebDriver setupBeforeTest(){
		// initialize driver
		return Setup.setupDriverForTestRun(0);
	}

	public static void setupBeforeMethod(WebDriver driver){
		// initialize testPage
		Setup.setupBrowserForTestRun(driver, "https://assessme-accp.it-joost.nl/");
	}

	public static void tearDownAfterMethod(WebDriver driver){
		// logout
		Setup.teardownLogoutAtEndOfTestRun(driver);
	}

	public static void tearDownAfterTest(WebDriver driver){
		// close connections, close browser
		Setup.teardownAfterTestRun(driver);
	}

}
