package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCompanyModules {

	// tableheader
	public static WebElement availableCompaniesTableHeader(WebDriver driver, int row, int col) {
		return driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[" + row + "]/div/div/div[" + col + "]"));
	}

	// tabledata
	public static WebElement availablePersonsTable(WebDriver driver, int row, int col) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div["
				+ row + "]/div[" + col + "]"));
	}

	// Edit Company button
	public static WebElement editCompanyButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[1]/div[2]/button"));
	}

	// save edited company
	public static WebElement saveEditCompanyButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
	}

	// add Company button
	public static WebElement addCompanyButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[1]/div[1]/button"));
	}

	// selected company overview CompanyID
	public static WebElement selectedCompanyID(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[2]/div[1]/div[2]/div"));
	}

	// selected company overview CompanyName
	public static WebElement selectedCompanyName(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[2]/div[2]/div[2]/div"));
	}

	// selected company overview edit CompanyName
	public static WebElement editSelectedCompanyName(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Naam\"]"));
	}

	// selected company overview CompanyStreetName
	public static WebElement selectedCompanyStreetName(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[2]/div[3]/div[2]/div"));
	}

	// selected company overview editCompanyStreetName
	public static WebElement editSelectedCompanyStreetName(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Straatnaam\"]"));
	}

	// selected company overview HouseNumber
	public static WebElement selectedCompanyHouseNumber(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[2]/div[4]/div[2]/div"));
	}

	// selected company overview editHouseNumber
	public static WebElement editSelectedCompanyHouseNumber(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Huisnummer\"]"));
	}

	// selected company overview HouseNumberAddition
	public static WebElement selectedCompanyHouseNumberAddition(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[2]/div[5]/div[2]/div"));
	}

	// selected company overview editHouseNumberAddition
	public static WebElement editSelectedCompanyHouseNumberAddition(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Toevoeging\"]"));
	}

	// selected company overview PostalCode
	public static WebElement selectedCompanyPostalCode(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[2]/div[6]/div[2]/div"));
	}

	// selected company overview editPostalCode
	public static WebElement editSelectedCompanyPostalCode(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Postcode\"]"));
	}

	// selected company overview City
	public static WebElement selectedCompanyCity(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[2]/div[7]/div[2]/div"));
	}

	// selected company overview edit City
	public static WebElement editSelectedCompanyCity(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Plaats\"]"));
	}

	// selected company overview Country
	public static WebElement selectedCompanyCountry(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[2]/div[8]/div[2]/div"));
	}

	// selected company overview editCountry
	public static WebElement editSelectedCompanyCountry(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Land\"]"));
	}

	// selected company overview PhoneNumber
	public static WebElement selectedCompanyPhoneNumber(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[2]/div[9]/div[2]/div"));
	}

	// selected company overview editPhoneNumber
	public static WebElement editSelectedCompanyPhoneNumber(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Telefoonnummer\"]"));
	}
}
