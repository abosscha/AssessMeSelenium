package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	public static WebElement getUsernameTxt(WebDriver driver){
		return driver.findElement(By.cssSelector(".username"));
	}

	public static WebElement getPasswordTxt(WebDriver driver){
		return driver.findElement(By.cssSelector(".password"));
	}

	public static WebElement getLoginBtn(WebDriver driver){
		return driver.findElement(By.cssSelector(".loginForm input[type='submit']"));
	}

	public static WebElement getCurtain(WebDriver driver){
		return driver.findElement(By.cssSelector("#startupCurtain"));
	}

}
