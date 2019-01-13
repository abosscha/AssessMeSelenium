package tests;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import data.CompanyData;
import data.LoginData;
import modules.AddCompanyModules;
import modules.AddCompanyPopUpModules;
import modules.DefaultModules;
import modules.MenuModules;

public class AddCompanies_Test {
	public static void checkCompanyScreenDataTestcase(WebDriver driver) {

		// initialize testcase
		DefaultModules.startTestcase(driver);

		// Login
		ReusableTestParts.loginToAssessMe(driver, LoginData.AdminUsername, LoginData.AdminPassword);
		System.out.println("Login geslaagd");
		// open menu for managing persons
		MenuModules.MenuDropdownBeheer(driver).click();
		MenuModules.MenuItemBedrijven(driver).click();
		AddCompanyModules.addCompanyButton(driver).isDisplayed();
		System.out.println("Pagina voor beheren bedrijven is geopend");

		// check screen data
		assertEquals("Naam", AddCompanyModules.availableCompaniesTableHeader(driver, 1, 1).getText());
		assertEquals("Straatnaam", AddCompanyModules.availableCompaniesTableHeader(driver, 1, 2).getText());
		assertEquals("Huisnummer", AddCompanyModules.availableCompaniesTableHeader(driver, 1, 3).getText());
		assertEquals("Toevoeging", AddCompanyModules.availableCompaniesTableHeader(driver, 1, 4).getText());
		assertEquals("Postcode", AddCompanyModules.availableCompaniesTableHeader(driver, 1, 5).getText());
		assertEquals("Plaats", AddCompanyModules.availableCompaniesTableHeader(driver, 1, 6).getText());
		assertEquals("Land", AddCompanyModules.availableCompaniesTableHeader(driver, 1, 7).getText());
		assertEquals("Telefoonnummer", AddCompanyModules.availableCompaniesTableHeader(driver, 1, 8).getText());

		// end testcase
		System.out.println("AddCompanies_Test checkCompanyScreenDataTestcase = OK");
		DefaultModules.endTestcase(driver);
	}

	public static void addCompanyOneTestcase(WebDriver driver) {

		// initialize testcase
		DefaultModules.startTestcase(driver);

		// Login
		ReusableTestParts.loginToAssessMe(driver, LoginData.AdminUsername, LoginData.AdminPassword);
		System.out.println("Login geslaagd");
		// open menu for managing persons
		MenuModules.MenuDropdownBeheer(driver).click();
		MenuModules.MenuItemBedrijven(driver).click();
		AddCompanyModules.addCompanyButton(driver).isDisplayed();
		System.out.println("Pagina voor beheren bedrijven is geopend");

		// add new company
		AddCompanyModules.addCompanyButton(driver).click();

		// check if popup is opened
		AddCompanyPopUpModules.countryField(driver).isDisplayed();

		// add company
		AddCompanyPopUpModules.nameField(driver).sendKeys(CompanyData.company1Name + "bedrijf");
		AddCompanyPopUpModules.streetNameField(driver).sendKeys(CompanyData.company1StreetName + "rare naam");
		AddCompanyPopUpModules.houseNumberField(driver).sendKeys(CompanyData.company1HouseNumber);
		AddCompanyPopUpModules.houseNumberAdditionField(driver).sendKeys(CompanyData.company1HouseNumberAddition);
		AddCompanyPopUpModules.postalCodeField(driver).sendKeys(CompanyData.company1PostalCode);
		AddCompanyPopUpModules.cityField(driver).sendKeys(CompanyData.company1City);
		AddCompanyPopUpModules.countryField(driver).sendKeys(CompanyData.company1Country);
		AddCompanyPopUpModules.phoneNumberField(driver).sendKeys(CompanyData.company1TelephoneNumber);
		DefaultModules.waitForLoad(1000);
		AddCompanyPopUpModules.saveCompanyButton(driver).click();

		// check if company has been added
		DefaultModules.waitForLoad(2000);
		driver.navigate().refresh();
		assertEquals(CompanyData.company1Name + "bedrijf", AddCompanyModules.selectedCompanyName(driver).getText());
		assertEquals(CompanyData.company1StreetName + "rare naam",
				AddCompanyModules.selectedCompanyStreetName(driver).getText());
		assertEquals(CompanyData.company1HouseNumber, AddCompanyModules.selectedCompanyHouseNumber(driver).getText());
		assertEquals(CompanyData.company1HouseNumberAddition,
				AddCompanyModules.selectedCompanyHouseNumberAddition(driver).getText());
		assertEquals(CompanyData.company1PostalCode, AddCompanyModules.selectedCompanyPostalCode(driver).getText());
		assertEquals(CompanyData.company1City, AddCompanyModules.selectedCompanyCity(driver).getText());
		assertEquals(CompanyData.company1Country, AddCompanyModules.selectedCompanyCountry(driver).getText());
		assertEquals(CompanyData.company1TelephoneNumber,
				AddCompanyModules.selectedCompanyPhoneNumber(driver).getText());

		// end testcase
		System.out.println("AddCompanies_Test addCompanyOneTestcase = OK");
		DefaultModules.endTestcase(driver);
	}

	public static void editCompanyOneTestcase(WebDriver driver) {

		// initialize testcase
		DefaultModules.startTestcase(driver);

		// Login
		ReusableTestParts.loginToAssessMe(driver, LoginData.AdminUsername, LoginData.AdminPassword);
		System.out.println("Login geslaagd");
		// open menu for managing persons
		MenuModules.MenuDropdownBeheer(driver).click();
		MenuModules.MenuItemBedrijven(driver).click();
		AddCompanyModules.addCompanyButton(driver).isDisplayed();
		System.out.println("Pagina voor beheren bedrijven is geopend");

		// edit company1
		AddCompanyModules.editCompanyButton(driver).click();

		// check if editpage is opened
		assertEquals("text", AddCompanyModules.editSelectedCompanyCity(driver).getAttribute("type"));

		// edit company
		AddCompanyModules.editSelectedCompanyName(driver).clear();
		AddCompanyModules.editSelectedCompanyName(driver).sendKeys(CompanyData.company1Name);
		AddCompanyModules.editSelectedCompanyStreetName(driver).clear();
		AddCompanyModules.editSelectedCompanyStreetName(driver).sendKeys(CompanyData.company1StreetName);
		AddCompanyModules.saveEditCompanyButton(driver).click();

		// check if company has been added
		DefaultModules.waitForLoad(2000);
		assertEquals(CompanyData.company1Name, AddCompanyModules.selectedCompanyName(driver).getText());
		assertEquals(CompanyData.company1StreetName, AddCompanyModules.selectedCompanyStreetName(driver).getText());
		assertEquals(CompanyData.company1HouseNumber, AddCompanyModules.selectedCompanyHouseNumber(driver).getText());
		assertEquals(CompanyData.company1HouseNumberAddition,
				AddCompanyModules.selectedCompanyHouseNumberAddition(driver).getText());
		assertEquals(CompanyData.company1PostalCode, AddCompanyModules.selectedCompanyPostalCode(driver).getText());
		assertEquals(CompanyData.company1City, AddCompanyModules.selectedCompanyCity(driver).getText());
		assertEquals(CompanyData.company1Country, AddCompanyModules.selectedCompanyCountry(driver).getText());
		assertEquals(CompanyData.company1TelephoneNumber,
				AddCompanyModules.selectedCompanyPhoneNumber(driver).getText());

		// end testcase
		System.out.println("AddCompanies_Test editCompanyOneTestcase = OK");
		DefaultModules.endTestcase(driver);
	}

	public static void addCompanyTwoTestcase(WebDriver driver) {

		// initialize testcase
		DefaultModules.startTestcase(driver);

		// Login
		ReusableTestParts.loginToAssessMe(driver, LoginData.AdminUsername, LoginData.AdminPassword);
		System.out.println("Login geslaagd");
		// open menu for managing persons
		MenuModules.MenuDropdownBeheer(driver).click();
		MenuModules.MenuItemBedrijven(driver).click();
		AddCompanyModules.addCompanyButton(driver).isDisplayed();
		System.out.println("Pagina voor beheren bedrijven is geopend");

		// add new company
		AddCompanyModules.addCompanyButton(driver).click();

		// check if popup is opened
		AddCompanyPopUpModules.countryField(driver).isDisplayed();

		// add company
		AddCompanyPopUpModules.nameField(driver).sendKeys(CompanyData.company2Name);
		AddCompanyPopUpModules.streetNameField(driver).sendKeys(CompanyData.company2StreetName);
		AddCompanyPopUpModules.houseNumberField(driver).sendKeys(CompanyData.company2HouseNumber);
		AddCompanyPopUpModules.houseNumberAdditionField(driver).sendKeys(CompanyData.company2HouseNumberAddition);
		AddCompanyPopUpModules.postalCodeField(driver).sendKeys(CompanyData.company2PostalCode);
		AddCompanyPopUpModules.cityField(driver).sendKeys(CompanyData.company2City);
		AddCompanyPopUpModules.countryField(driver).sendKeys(CompanyData.company2Country);
		AddCompanyPopUpModules.phoneNumberField(driver).sendKeys(CompanyData.company2TelephoneNumber);
		DefaultModules.waitForLoad(1000);
		AddCompanyPopUpModules.saveCompanyButton(driver).click();

		// check if company has been added
		DefaultModules.waitForLoad(2000);
		assertEquals(CompanyData.company2Name, AddCompanyModules.selectedCompanyName(driver).getText());
		assertEquals(CompanyData.company2StreetName, AddCompanyModules.selectedCompanyStreetName(driver).getText());
		assertEquals(CompanyData.company2HouseNumber, AddCompanyModules.selectedCompanyHouseNumber(driver).getText());
		assertEquals(CompanyData.company2HouseNumberAddition,
				AddCompanyModules.selectedCompanyHouseNumberAddition(driver).getText());
		assertEquals(CompanyData.company2PostalCode, AddCompanyModules.selectedCompanyPostalCode(driver).getText());
		assertEquals(CompanyData.company2City, AddCompanyModules.selectedCompanyCity(driver).getText());
		assertEquals(CompanyData.company2Country, AddCompanyModules.selectedCompanyCountry(driver).getText());
		assertEquals(CompanyData.company2TelephoneNumber,
				AddCompanyModules.selectedCompanyPhoneNumber(driver).getText());

		// end testcase
		System.out.println("AddCompanies_Test addCompanyTwoTestcase = OK");
		DefaultModules.endTestcase(driver);
	}

	public static void addCompanyThreeTestcase(WebDriver driver) {

		// initialize testcase
		DefaultModules.startTestcase(driver);

		// Login
		ReusableTestParts.loginToAssessMe(driver, LoginData.AdminUsername, LoginData.AdminPassword);
		System.out.println("Login geslaagd");
		// open menu for managing persons
		MenuModules.MenuDropdownBeheer(driver).click();
		MenuModules.MenuItemBedrijven(driver).click();
		AddCompanyModules.addCompanyButton(driver).isDisplayed();
		System.out.println("Pagina voor beheren bedrijven is geopend");

		// add new company
		AddCompanyModules.addCompanyButton(driver).click();

		// check if popup is opened
		AddCompanyPopUpModules.countryField(driver).isDisplayed();

		// add company
		AddCompanyPopUpModules.nameField(driver).sendKeys(CompanyData.company3Name);
		AddCompanyPopUpModules.streetNameField(driver).sendKeys(CompanyData.company3StreetName);
		AddCompanyPopUpModules.houseNumberField(driver).sendKeys(CompanyData.company3HouseNumber);
		AddCompanyPopUpModules.houseNumberAdditionField(driver).sendKeys(CompanyData.company3HouseNumberAddition);
		AddCompanyPopUpModules.postalCodeField(driver).sendKeys(CompanyData.company3PostalCode);
		AddCompanyPopUpModules.cityField(driver).sendKeys(CompanyData.company3City);
		AddCompanyPopUpModules.countryField(driver).sendKeys(CompanyData.company3Country);
		AddCompanyPopUpModules.phoneNumberField(driver).sendKeys(CompanyData.company3TelephoneNumber);
		DefaultModules.waitForLoad(1000);
		AddCompanyPopUpModules.saveCompanyButton(driver).click();

		// check if company has been added
		DefaultModules.waitForLoad(2000);
		assertEquals(CompanyData.company3Name, AddCompanyModules.selectedCompanyName(driver).getText());
		assertEquals(CompanyData.company3StreetName, AddCompanyModules.selectedCompanyStreetName(driver).getText());
		assertEquals(CompanyData.company3HouseNumber, AddCompanyModules.selectedCompanyHouseNumber(driver).getText());
		assertEquals(CompanyData.company3HouseNumberAddition,
				AddCompanyModules.selectedCompanyHouseNumberAddition(driver).getText());
		assertEquals(CompanyData.company3PostalCode, AddCompanyModules.selectedCompanyPostalCode(driver).getText());
		assertEquals(CompanyData.company3City, AddCompanyModules.selectedCompanyCity(driver).getText());
		assertEquals(CompanyData.company3Country, AddCompanyModules.selectedCompanyCountry(driver).getText());
		assertEquals(CompanyData.company3TelephoneNumber,
				AddCompanyModules.selectedCompanyPhoneNumber(driver).getText());

		// end testcase
		System.out.println("AddCompanies_Test addCompanyThreeTestcase = OK");
		DefaultModules.endTestcase(driver);
	}

	public static void addCompanyFourTestcase(WebDriver driver) {

		// initialize testcase
		DefaultModules.startTestcase(driver);

		// Login
		ReusableTestParts.loginToAssessMe(driver, LoginData.AdminUsername, LoginData.AdminPassword);
		System.out.println("Login geslaagd");
		// open menu for managing persons
		MenuModules.MenuDropdownBeheer(driver).click();
		MenuModules.MenuItemBedrijven(driver).click();
		AddCompanyModules.addCompanyButton(driver).isDisplayed();
		System.out.println("Pagina voor beheren bedrijven is geopend");

		// add new company
		AddCompanyModules.addCompanyButton(driver).click();

		// check if popup is opened
		AddCompanyPopUpModules.countryField(driver).isDisplayed();

		// add company
		AddCompanyPopUpModules.nameField(driver).sendKeys(CompanyData.company4Name);
		AddCompanyPopUpModules.streetNameField(driver).sendKeys(CompanyData.company4StreetName);
		AddCompanyPopUpModules.houseNumberField(driver).sendKeys(CompanyData.company4HouseNumber);
		AddCompanyPopUpModules.houseNumberAdditionField(driver).sendKeys(CompanyData.company4HouseNumberAddition);
		AddCompanyPopUpModules.postalCodeField(driver).sendKeys(CompanyData.company4PostalCode);
		AddCompanyPopUpModules.cityField(driver).sendKeys(CompanyData.company4City);
		AddCompanyPopUpModules.countryField(driver).sendKeys(CompanyData.company4Country);
		AddCompanyPopUpModules.phoneNumberField(driver).sendKeys(CompanyData.company4TelephoneNumber);
		DefaultModules.waitForLoad(1000);
		AddCompanyPopUpModules.saveCompanyButton(driver).click();

		// check if company has been added
		DefaultModules.waitForLoad(2000);
		assertEquals(CompanyData.company4Name, AddCompanyModules.selectedCompanyName(driver).getText());
		assertEquals(CompanyData.company4StreetName, AddCompanyModules.selectedCompanyStreetName(driver).getText());
		assertEquals(CompanyData.company4HouseNumber, AddCompanyModules.selectedCompanyHouseNumber(driver).getText());
		assertEquals(CompanyData.company4HouseNumberAddition,
				AddCompanyModules.selectedCompanyHouseNumberAddition(driver).getText());
		assertEquals(CompanyData.company4PostalCode, AddCompanyModules.selectedCompanyPostalCode(driver).getText());
		assertEquals(CompanyData.company4City, AddCompanyModules.selectedCompanyCity(driver).getText());
		assertEquals(CompanyData.company4Country, AddCompanyModules.selectedCompanyCountry(driver).getText());
		assertEquals(CompanyData.company4TelephoneNumber,
				AddCompanyModules.selectedCompanyPhoneNumber(driver).getText());

		// end testcase
		System.out.println("AddCompanies_Test addCompanyFourTestcase = OK");
		DefaultModules.endTestcase(driver);
	}

	public static void addCompanyFiveTestcase(WebDriver driver) {

		// initialize testcase
		DefaultModules.startTestcase(driver);

		// Login
		ReusableTestParts.loginToAssessMe(driver, LoginData.AdminUsername, LoginData.AdminPassword);
		System.out.println("Login geslaagd");
		// open menu for managing persons
		MenuModules.MenuDropdownBeheer(driver).click();
		MenuModules.MenuItemBedrijven(driver).click();
		AddCompanyModules.addCompanyButton(driver).isDisplayed();
		System.out.println("Pagina voor beheren bedrijven is geopend");

		// add new company
		AddCompanyModules.addCompanyButton(driver).click();

		// check if popup is opened
		AddCompanyPopUpModules.countryField(driver).isDisplayed();

		// add company
		AddCompanyPopUpModules.nameField(driver).sendKeys(CompanyData.company5Name);
		AddCompanyPopUpModules.streetNameField(driver).sendKeys(CompanyData.company5StreetName);
		AddCompanyPopUpModules.houseNumberField(driver).sendKeys(CompanyData.company5HouseNumber);
		AddCompanyPopUpModules.houseNumberAdditionField(driver).sendKeys(CompanyData.company5HouseNumberAddition);
		AddCompanyPopUpModules.postalCodeField(driver).sendKeys(CompanyData.company5PostalCode);
		AddCompanyPopUpModules.cityField(driver).sendKeys(CompanyData.company5City);
		AddCompanyPopUpModules.countryField(driver).sendKeys(CompanyData.company5Country);
		AddCompanyPopUpModules.phoneNumberField(driver).sendKeys(CompanyData.company5TelephoneNumber);
		DefaultModules.waitForLoad(1000);
		AddCompanyPopUpModules.saveCompanyButton(driver).click();

		// check if company has been added
		DefaultModules.waitForLoad(2000);
		assertEquals(CompanyData.company5Name, AddCompanyModules.selectedCompanyName(driver).getText());
		assertEquals(CompanyData.company5StreetName, AddCompanyModules.selectedCompanyStreetName(driver).getText());
		assertEquals(CompanyData.company5HouseNumber, AddCompanyModules.selectedCompanyHouseNumber(driver).getText());
		assertEquals(CompanyData.company5HouseNumberAddition,
				AddCompanyModules.selectedCompanyHouseNumberAddition(driver).getText());
		assertEquals(CompanyData.company5PostalCode, AddCompanyModules.selectedCompanyPostalCode(driver).getText());
		assertEquals(CompanyData.company5City, AddCompanyModules.selectedCompanyCity(driver).getText());
		assertEquals(CompanyData.company5Country, AddCompanyModules.selectedCompanyCountry(driver).getText());
		assertEquals(CompanyData.company5TelephoneNumber,
				AddCompanyModules.selectedCompanyPhoneNumber(driver).getText());

		// end testcase
		System.out.println("AddCompanies_Test addCompanyFiveTestcase = OK");
		DefaultModules.endTestcase(driver);
	}

}
