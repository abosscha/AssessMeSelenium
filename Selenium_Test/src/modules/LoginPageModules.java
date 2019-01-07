package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageModules {

	public static WebElement assessMeLogo(WebDriver driver) {
		return driver.findElement(By.cssSelector(".dBNcSL"));
	}

	public static WebElement userNameEmailField(WebDriver driver) {
		return driver.findElement(By.cssSelector("#User"));
	}

	public static WebElement passwordField(WebDriver driver) {
		return driver.findElement(By.cssSelector("#Password"));
	}

	public static WebElement loginButton(WebDriver driver) {
		return driver.findElement(By.cssSelector(".btn"));
	}

	public static WebElement wrongLoginError(WebDriver driver) {
		return driver.findElement(By.cssSelector(".alert-danger"));
	}

}
