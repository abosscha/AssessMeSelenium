package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Menu {

	public static String clientSearchElements = ".clientSearchPanel .clientSearch .clientList .dropdownContent .itemsList .listItem";

	public static WebElement getClientMenu(WebDriver driver){
		return driver.findElement(By.cssSelector(".clientSearch"));
	}

	public static WebElement getClient(WebDriver driver){
		return driver.findElement(By.cssSelector(".clientSearch .clientList .clientDropdown .itemsList div[data-id='0']"));
	}

	public static WebElement getAllClientsToggle(WebDriver driver) {
		return driver.findElement(By.cssSelector(".clientSearchPanel .advancedOptions .button_all"));
	}

	public static WebElement getClientSearchField(WebDriver driver) {
		return driver.findElement(By.cssSelector(".clientSearchPanel .clientSearch .searchTextField .searchable"));
	}

	public static String getClientSearchElements() {
		return clientSearchElements;
	}

}