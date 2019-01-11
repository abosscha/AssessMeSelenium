package tests;

import org.openqa.selenium.WebDriver;

import modules.DefaultModules;
import modules.LoginPageModules;

public class ReusableTestParts {

	public static void loginToAssessMe(WebDriver driver, String username, String password) {
		// initialize testcase
		DefaultModules.startTestcase(driver);

		// is page loaded
		LoginPageModules.assessMeLogo(driver).isDisplayed();
		LoginPageModules.userNameEmailField(driver).isDisplayed();
		LoginPageModules.passwordField(driver).isDisplayed();
		LoginPageModules.loginButton(driver).isDisplayed();

		// login with correct user
		LoginPageModules.userNameEmailField(driver).sendKeys(username);
		LoginPageModules.passwordField(driver).sendKeys(password);
		LoginPageModules.loginButton(driver).click();

		// check if user is logged in
		DefaultModules.logOutButton(driver).isDisplayed();
		DefaultModules.logOutButton(driver).isEnabled();
	}

}
