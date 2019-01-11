package suite;

import org.openqa.selenium.WebDriver;

import tests.Assessment_Test;

public class Suite {

	public static void testTheSuite(WebDriver driver) {

		// Fetch all tests and run all
//		Login_Test.loginCorrectly(driver);
//		Login_Test.loginWithWrongUsernameAndWrongPassword(driver);
		Assessment_Test.test(driver);
//		TestCaseTemplate.templateTestCase(driver);

	}

}
