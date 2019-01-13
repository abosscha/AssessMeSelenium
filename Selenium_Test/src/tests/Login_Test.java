package tests;

import static org.junit.Assert.assertEquals;

//standard imports
import org.openqa.selenium.WebDriver;

//import testdata
import data.LoginData;
//module imports
import modules.DefaultModules;
import modules.LoginPageModules;

public class Login_Test {

	public static void loginCorrectly(WebDriver driver) {

		// initialize testcase
		DefaultModules.startTestcase(driver);

		// is page loaded
		LoginPageModules.assessMeLogo(driver).isDisplayed();
		LoginPageModules.userNameEmailField(driver).isDisplayed();
		LoginPageModules.passwordField(driver).isDisplayed();
		LoginPageModules.loginButton(driver).isDisplayed();

		// login with correct user
		LoginPageModules.userNameEmailField(driver).sendKeys(LoginData.AdminUsername);
		LoginPageModules.passwordField(driver).sendKeys(LoginData.AdminPassword);
		LoginPageModules.loginButton(driver).click();

		// check if user is logged in
		DefaultModules.logOutButton(driver).isDisplayed();
		DefaultModules.logOutButton(driver).isEnabled();

		// log testoutcome
		System.out.println("Login_Test loginCorrectly = OK");

		// end testcase
		DefaultModules.endTestcase(driver);
	}

	public static void loginWithWrongUsernameAndWrongPassword(WebDriver driver) {

		// initialize testcase
		DefaultModules.startTestcase(driver);

		// is page loaded
		LoginPageModules.assessMeLogo(driver).isDisplayed();
		LoginPageModules.userNameEmailField(driver).isDisplayed();
		LoginPageModules.passwordField(driver).isDisplayed();
		LoginPageModules.loginButton(driver).isDisplayed();

		// login with correct user
		LoginPageModules.userNameEmailField(driver).sendKeys(LoginData.WrongUserName);
		LoginPageModules.passwordField(driver).sendKeys(LoginData.WrongPassword);
		LoginPageModules.loginButton(driver).click();

		// check if errormessage is shown
		assertEquals(LoginData.MessageForWrongLogin, LoginPageModules.wrongLoginError(driver).getText());

		// log testoutcome
		System.out.println("Login_Test loginWithWrongUsernameAndWrongPassword = OK");

		// end testcase
		DefaultModules.endTestcase(driver);
	}

}
