package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import init.Init;

public class DefaultModules {

	public static void waitForLoad(int miliSeconds) {
		try {
			Thread.sleep(miliSeconds);
		} catch (InterruptedException ie) {
		}
	}

	public static WebElement logOutButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"toolbar\"]/div/ul/li[3]"));
	}

	public static void startTestcase(WebDriver driver) {
		Init.setupBeforeMethod(driver);
		waitForLoad(2000);
	}

	public static void endTestcase(WebDriver driver) {
		Init.tearDownAfterMethod(driver);
	}

}
