package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KenJeClient {

	public static WebElement getReanimeerBeleid(WebDriver driver){
		return driver.findElement(By.cssSelector(".resuscitation-answer"));
	}

	public static WebElement getOpstaanLabel(WebDriver driver){
		return driver.findElement(By.cssSelector(".wake-up .time"));
	}

	public static WebElement getSlapenGaanLabel(WebDriver driver){
		return driver.findElement(By.cssSelector(".bedtime .time"));
	}

	public static WebElement getAvatar(WebDriver driver){
		return driver.findElement(By.cssSelector(".avatar-and-bedtimes .avatar"));
	}

	public static WebElement getOverMij(WebDriver driver){
		return driver.findElement(By.cssSelector(".about-me-text .standard-text"));
	}

	public static WebElement getSluitenBtn(WebDriver driver){
		return driver.findElement(By.cssSelector(".closeSingletonModalButtonContainer a"));
	}

}
