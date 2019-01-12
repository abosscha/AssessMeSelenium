package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCompanyPopUpModules {

	// AddCompany nameField
	public static WebElement nameField(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Naam\"]"));
	}

	// AddCompany streetNameField
	public static WebElement streetNameField(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Straatnaam\"]"));
	}

	// AddCompany houseNumberField
	public static WebElement houseNumberField(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Huisnummer\"]"));
	}

	// AddCompany houseNumberAdditionField
	public static WebElement houseNumberAdditionField(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Toevoeging\"]"));
	}

	// AddCompany postalCodeField
	public static WebElement postalCodeField(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Postcode\"]"));
	}

	// AddCompany cityField
	public static WebElement cityField(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Plaats\"]"));
	}

	// AddCompany countryField
	public static WebElement countryField(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Land\"]"));
	}

	// AddCompany phoneNumberField
	public static WebElement phoneNumberField(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Telefoonnummer\"]"));
	}

	// AddCompany saveCompanyButton
	public static WebElement saveCompanyButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
	}

	// AddCompany cancelAddingCompanyButton
	public static WebElement cancelAddingCompanyButton(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[3]/div/div[2]/button"));
	}
}
