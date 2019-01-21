package main;

//Standard imports
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import init.Init;
import suite.Suite;

public class Main {

	static WebDriver driver = null;

	@Test
	public void Run() {

		// Initialize the Test Run
		driver = Init.setupBeforeTest();

		// Run the suite
		Suite.testTheSuite(driver);

		// And tear it down...
		Init.tearDownAfterMethod(driver);
		Init.tearDownAfterTest(driver);

	}

}
