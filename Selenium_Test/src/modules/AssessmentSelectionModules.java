package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssessmentSelectionModules {
 
	public static WebElement assessmeHeader(WebDriver driver){
		return driver.findElement(By.cssSelector(".App-header"));
	}

	public static WebElement assessmentCard(WebDriver driver){
		return driver.findElement(By.cssSelector("#cardInfoContainer-1110703"));
	}

	public static WebElement assessmentStudent(WebDriver driver){
		return driver.findElement(By.cssSelector(".studentname"));
	}
	
	public static WebElement assessmeButton(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id=\"cardContainer\"]/div[1]/div/div/button/span"));
	}
	
}