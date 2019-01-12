package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddPersonModules {

	// tableheader
	public static WebElement availablePersonsTableHeader(WebDriver driver, int row, int col) {
		return driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[" + row + "]/div/div/div[" + col + "]"));
	}

	// tabledata
	public static WebElement availablePersonsTable(WebDriver driver, int row, int col) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div["
				+ row + "]/div[" + col + "]"));
	}

	// Add person button
	public static WebElement addPersonButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[1]/div[1]/button"));
	}

	// edit person button
	public static WebElement editPersonButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[1]/div[2]/button"));
	}

	// Save edit person button
	public static WebElement saveEditPersonButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
	}

	// cancel edit person button
	public static WebElement cancelEditPersonButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[1]/div[2]/button"));
	}

	// selected person overview PersonID
	public static WebElement selectedPersonID(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[2]/div[1]/div[2]/div"));
	}

	// selected person overview Person Name
	public static WebElement selectedPersonName(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[2]/div[2]/div[2]/div"));
	}

	// selected person editviewName
	public static WebElement selectedPersonEditName(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Naam\"]"));
	}

	// selected person overview PersonNumber
	public static WebElement selectedPersonNumber(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[2]/div[3]/div[2]/div"));
	}

	// selected person overview editViewPersonNumber
	public static WebElement selectedPersonEditNumber(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Studentnummer\"]"));
	}

	// selected person overview telephoneNumber
	public static WebElement selectedPersonTelephoneNumber(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[2]/div[4]/div[2]/div"));
	}

	// selected person overview editTelephoneNumber
	public static WebElement selectedPersonEditTelephoneNumber(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"TelefoonNr\"]"));
	}

	// selected person overview EmailAddress
	public static WebElement selectedPersonEmailAddress(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[2]/div[5]/div[2]/div"));
	}

	// selected person overview EditEmailAddress
	public static WebElement selectedPersonEditEmailAddress(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Emailadres\"]"));
	}

	// selected person overview Password
	public static WebElement selectedPersonPassword(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[2]/div[6]/div[2]/div"));
	}

	// selected person overview EditPassword
	public static WebElement selectedPersonEditPassword(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Wachtwoord\"]"));
	}

	// selected person overview Role
	public static WebElement selectedPersonRole(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[2]/div[7]/div[2]/div"));
	}

	// selected person overview EditRole
	public static WebElement selectedPersonEditRole(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Rollen\"]/div[1]/div/input"));
	}

}
