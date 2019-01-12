package tests;

//standard imports
import org.openqa.selenium.WebDriver;

//module imports
import modules.DefaultModules;

public class TestCaseTemplate {

	public static void templateTestCase(WebDriver driver) {

		// initialize testcase
		DefaultModules.startTestcase(driver);

		// Teststeps

		// end testcase
		DefaultModules.endTestcase(driver);
	}

}
