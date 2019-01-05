package suite;

import org.openqa.selenium.WebDriver;

import tests.KenJeClient_Test;
import tests.Assessment_Test;

public class Suite {

	public static void testTheSuite(WebDriver driver){
		// Fetch all tests and run all?
		Assessment_Test.test(driver);
	}

}
