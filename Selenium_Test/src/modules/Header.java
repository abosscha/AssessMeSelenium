package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header {

	public static WebElement getClientLink(WebDriver driver){
		return driver.findElement(By.cssSelector(".toClientLink"));
	}

}
