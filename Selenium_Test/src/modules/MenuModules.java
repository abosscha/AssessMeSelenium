package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuModules {

	// homebutton after opening assessment
	public static WebElement homeButtonInOpenedAssessment(WebDriver driver) {
		return driver.findElement(By.cssSelector("#buttonHome"));
	}

	// homebutton on assessmentSelectionscreen
	public static WebElement homeButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"toolbar\"]/div/ul/li[1]"));
	}

	// MenuDropdown Beheer
	public static WebElement MenuDropdownBeheer(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"toolbar\"]/div/ul/li[2]"));
	}

	// menuitem in dropdown Beheer: Assessments
	public static WebElement MenuItemAssessments(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"toolbar\"]/div/ul/li[2]/ul/li[1]"));
	}

	// menuitem in dropdown Beheer: Bedrijven
	public static WebElement MenuItemBedrijven(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"toolbar\"]/div/ul/li[2]/ul/li[2]"));
	}

	// menuitem in dropdown Beheer: Personen
	public static WebElement MenuItemPersonen(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"toolbar\"]/div/ul/li[2]/ul/li[3]"));
	}

	// Log out button
	public static WebElement ButtonLogOut(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"toolbar\"]/div/ul/li[3]"));
	}
}
