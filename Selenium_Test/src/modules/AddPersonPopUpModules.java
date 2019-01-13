package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddPersonPopUpModules {

	// Add person popup header
	public static WebElement editPersonButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[1]/div[2]/button"));
	}

	// add person popup name field
	public static WebElement nameField(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Naam\"]"));
	}

	// Add person studentnumber
	public static WebElement numberField(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Studentnummer\"]"));
	}

	// Add person telephoneNumber
	public static WebElement telephoneNumberField(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"TelefoonNr\"]"));
	}

	// Add person emailAddress
	public static WebElement emailAddressField(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Emailadres\"]"));
	}

	// Add person password
	public static WebElement passwordField(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Wachtwoord\"]"));
	}

	// selected person dropdown role: 1e examinator, 2e Examinator, Gecommitteerde,
	// Administrator, Student
	public static WebElement selectedPersonRoleDropdown(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Rollen\"]/div/div/input"));
	}

	// save person button
	public static WebElement savePersonButton(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[3]/div/div[1]"));
	}

	// cancel adding person button
	public static WebElement cancelAddingPersonButton(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[3]/div/div[2]/button"));
	}

}
