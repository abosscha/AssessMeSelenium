package setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Setup {

	public static WebDriver setupDriverForTestRun(int iBrowser) {
		// Initialize driver and logger
		WebDriver driver = null;

		// Pick a browser driver
		switch (iBrowser) {
		case 0:
			driver = new ChromeDriver();
			break;
		case 1:
			driver = new FirefoxDriver();
			break;
		case 2:
			driver = new InternetExplorerDriver();
			break;
		default:
			System.out.println("Specify correct browser: Chrome (0), Firefox (1) or IE (2)");
			break;
		}
		return driver;
	}

	public static void setupBrowserForTestRun(WebDriver driver, String server) {
		// Eat cookies, set the wait, maximize window and GO!
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// driver.navigate().to(server);
		driver.get(server);

	}

	public static void teardownLogoutAtEndOfTestRun(WebDriver driver) {
		JavascriptExecutor js;
		js = (JavascriptExecutor) driver;
		js.executeScript(String.format("window.localStorage.clear();"));
	}

	public static void teardownAfterTestRun(WebDriver driver) {
		// cleanup
		driver.close();
		driver.quit();
	}

}
