package tests;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import data.LoginData;
import data.PersonData;
import modules.AddPersonModules;
import modules.AddPersonPopUpModules;
import modules.DefaultModules;
import modules.MenuModules;

public class AddPerson_Test {
	public static void checkScreenData(WebDriver driver) {

		// initialize testcase
		DefaultModules.startTestcase(driver);

		// Login
		ReusableTestParts.loginToAssessMe(driver, LoginData.AdminUsername, LoginData.AdminPassword);
		System.out.println("Login geslaagd");
		// open menu for managing persons
		MenuModules.MenuDropdownBeheer(driver).click();
		MenuModules.MenuItemPersonen(driver).click();
		AddPersonModules.addPersonButton(driver).isDisplayed();
		System.out.println("Pagina voor beheren personen is geopend");

		// Controleer inhoud pagina
		assertEquals("Naam", AddPersonModules.availablePersonsTableHeader(driver, 1, 1).getText());
		assertEquals("Studentnummer", AddPersonModules.availablePersonsTableHeader(driver, 1, 2).getText());
		assertEquals("Telefoonnummer", AddPersonModules.availablePersonsTableHeader(driver, 1, 3).getText());
		assertEquals("Emailadres", AddPersonModules.availablePersonsTableHeader(driver, 1, 4).getText());
		AddPersonModules.addPersonButton(driver).isDisplayed();
		AddPersonModules.editPersonButton(driver).isDisplayed();
		AddPersonModules.selectedPersonID(driver).isDisplayed();
		AddPersonModules.selectedPersonName(driver).isDisplayed();
		AddPersonModules.selectedPersonNumber(driver).isDisplayed();
		AddPersonModules.selectedPersonTelephoneNumber(driver).isDisplayed();
		AddPersonModules.selectedPersonEmailAddress(driver).isDisplayed();
		assertEquals("", AddPersonModules.selectedPersonPassword(driver).getText());

		// end testcase
		DefaultModules.endTestcase(driver);
	}

	public static void addStudent1Testcase(WebDriver driver) {

		// initialize testcase
		DefaultModules.startTestcase(driver);

		// Login
		ReusableTestParts.loginToAssessMe(driver, LoginData.AdminUsername, LoginData.AdminPassword);
		System.out.println("Login geslaagd");

		// open menu for managing persons
		MenuModules.MenuDropdownBeheer(driver).click();
		MenuModules.MenuItemPersonen(driver).click();
		AddPersonModules.addPersonButton(driver).isDisplayed();
		System.out.println("Pagina voor beheren personen is geopend");

		// open add person popup
		AddPersonModules.addPersonButton(driver).click();

		// check if popup is open
		AddPersonPopUpModules.savePersonButton(driver).isDisplayed();
		AddPersonPopUpModules.cancelAddingPersonButton(driver).isDisplayed();
		System.out.println("Popup voor het toevoegen van een persoon is geopend");

		// add new person
		AddPersonPopUpModules.nameField(driver).sendKeys(PersonData.person1Name);
		AddPersonPopUpModules.numberField(driver).sendKeys(PersonData.person1Number);
		AddPersonPopUpModules.telephoneNumberField(driver).sendKeys(PersonData.person1TelephoneNumber);
		AddPersonPopUpModules.emailAddressField(driver).sendKeys(PersonData.person1Emailadress);
		AddPersonPopUpModules.passwordField(driver).sendKeys(PersonData.person1Password);
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).click();
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).sendKeys(PersonData.person1Role);
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).sendKeys(Keys.ARROW_DOWN);
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).sendKeys(Keys.ENTER);
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).sendKeys(Keys.ESCAPE);
		DefaultModules.waitForLoad(500);
		AddPersonPopUpModules.savePersonButton(driver).click();

		// check if student is added
		DefaultModules.waitForLoad(3000);
		assertEquals(PersonData.person1Name, AddPersonModules.selectedPersonName(driver).getText());
		assertEquals(PersonData.person1Number, AddPersonModules.selectedPersonNumber(driver).getText());
		assertEquals(PersonData.person1TelephoneNumber,
				AddPersonModules.selectedPersonTelephoneNumber(driver).getText());
		assertEquals(PersonData.person1Emailadress, AddPersonModules.selectedPersonEmailAddress(driver).getText());
		assertEquals("", AddPersonModules.selectedPersonPassword(driver).getText());
		assertEquals(PersonData.person1Role, AddPersonModules.selectedPersonRole(driver).getText());

		// end testcase
		DefaultModules.endTestcase(driver);
	}

	public static void addStudent2Testcase(WebDriver driver) {

		// initialize testcase
		DefaultModules.startTestcase(driver);

		// Login
		ReusableTestParts.loginToAssessMe(driver, LoginData.AdminUsername, LoginData.AdminPassword);
		System.out.println("Login geslaagd");
		// open menu for managing persons
		MenuModules.MenuDropdownBeheer(driver).click();
		MenuModules.MenuItemPersonen(driver).click();
		AddPersonModules.addPersonButton(driver).isDisplayed();
		System.out.println("Pagina voor beheren personen is geopend");

		// open add person popup
		AddPersonModules.addPersonButton(driver).click();

		// check if popup is open
		AddPersonPopUpModules.savePersonButton(driver).isDisplayed();
		AddPersonPopUpModules.cancelAddingPersonButton(driver).isDisplayed();
		System.out.println("Popup voor het toevoegen van een persoon is geopend");

		// add new student
		AddPersonPopUpModules.nameField(driver).sendKeys("aaaaaaaaaaaaa");
		AddPersonPopUpModules.numberField(driver).sendKeys(PersonData.person2Number + "1");
		AddPersonPopUpModules.telephoneNumberField(driver).sendKeys(PersonData.person2TelephoneNumber + "1234");
		AddPersonPopUpModules.emailAddressField(driver).sendKeys(PersonData.person2Emailadress + "com");
		AddPersonPopUpModules.passwordField(driver).sendKeys(PersonData.person2Password);
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).click();
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).sendKeys(PersonData.person2Role);
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).sendKeys(Keys.ARROW_DOWN);
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).sendKeys(Keys.ENTER);
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).sendKeys(Keys.ESCAPE);
		DefaultModules.waitForLoad(500);
		AddPersonPopUpModules.savePersonButton(driver).click();

		// check if student is added
		DefaultModules.waitForLoad(3000);
		assertEquals("aaaaaaaaaaaaa", AddPersonModules.selectedPersonName(driver).getText());
		assertEquals(PersonData.person2Number + "1", AddPersonModules.selectedPersonNumber(driver).getText());
		assertEquals(PersonData.person2TelephoneNumber + "1234",
				AddPersonModules.selectedPersonTelephoneNumber(driver).getText());
		assertEquals(PersonData.person2Emailadress + "com",
				AddPersonModules.selectedPersonEmailAddress(driver).getText());
		assertEquals("", AddPersonModules.selectedPersonPassword(driver).getText());
		assertEquals(PersonData.person2Role, AddPersonModules.selectedPersonRole(driver).getText());

		// end testcase
		DefaultModules.endTestcase(driver);
	}

	public static void editStudent2Testcase(WebDriver driver) {

		// initialize testcase
		DefaultModules.startTestcase(driver);

		// Login
		ReusableTestParts.loginToAssessMe(driver, LoginData.AdminUsername, LoginData.AdminPassword);
		System.out.println("Login geslaagd");
		// open menu for managing persons
		MenuModules.MenuDropdownBeheer(driver).click();
		MenuModules.MenuItemPersonen(driver).click();
		AddPersonModules.addPersonButton(driver).isDisplayed();
		System.out.println("Pagina voor beheren personen is geopend");

		// select student to be edited
		assertEquals("aaaaaaaaaaaaa", AddPersonModules.availablePersonsTable(driver, 1, 1).getText());

		// Open edit person functionality
		AddPersonModules.editPersonButton(driver).click();

		// check if person can be edited
		assertEquals("text", AddPersonModules.selectedPersonEditName(driver).getAttribute("type"));

		// edit values
		AddPersonModules.selectedPersonEditName(driver).clear();
		AddPersonModules.selectedPersonEditName(driver).sendKeys(PersonData.person2Name);
		AddPersonModules.selectedPersonEditNumber(driver).clear();
		AddPersonModules.selectedPersonEditNumber(driver).sendKeys(PersonData.person2Number);
		AddPersonModules.selectedPersonEditTelephoneNumber(driver).clear();
		AddPersonModules.selectedPersonEditTelephoneNumber(driver).sendKeys(PersonData.person2TelephoneNumber);
		AddPersonModules.selectedPersonEditEmailAddress(driver).clear();
		AddPersonModules.selectedPersonEditEmailAddress(driver).sendKeys(PersonData.person2Emailadress);
		AddPersonModules.selectedPersonEditRole(driver).click();
		AddPersonModules.selectedPersonEditRole(driver).sendKeys(PersonData.person2Role2);
		AddPersonModules.selectedPersonEditRole(driver).sendKeys(Keys.ARROW_DOWN);
		AddPersonModules.selectedPersonEditRole(driver).sendKeys(Keys.ENTER);
		AddPersonModules.selectedPersonEditRole(driver).sendKeys(Keys.ESCAPE);

		// save edited person
		AddPersonModules.saveEditPersonButton(driver).click();

		// Verify if values are edited
		DefaultModules.waitForLoad(3000);
		assertEquals(PersonData.person2Name, AddPersonModules.selectedPersonName(driver).getText());
		assertEquals(PersonData.person2Number, AddPersonModules.selectedPersonNumber(driver).getText());
		assertEquals(PersonData.person2TelephoneNumber,
				AddPersonModules.selectedPersonTelephoneNumber(driver).getText());
		assertEquals(PersonData.person2Emailadress, AddPersonModules.selectedPersonEmailAddress(driver).getText());
		assertEquals("", AddPersonModules.selectedPersonPassword(driver).getText());
		assertEquals(PersonData.person2Role2 + ", " + PersonData.person2Role,
				AddPersonModules.selectedPersonRole(driver).getText());
		// end testcase
		DefaultModules.endTestcase(driver);
	}

	public static void addEersteExaminatorTestcase(WebDriver driver) {

		// initialize testcase
		DefaultModules.startTestcase(driver);

		// Login
		ReusableTestParts.loginToAssessMe(driver, LoginData.AdminUsername, LoginData.AdminPassword);
		System.out.println("Login geslaagd");
		// open menu for managing persons
		MenuModules.MenuDropdownBeheer(driver).click();
		MenuModules.MenuItemPersonen(driver).click();
		AddPersonModules.addPersonButton(driver).isDisplayed();
		System.out.println("Pagina voor beheren personen is geopend");

		// open add person popup
		AddPersonModules.addPersonButton(driver).click();

		// check if popup is open
		AddPersonPopUpModules.savePersonButton(driver).isDisplayed();
		AddPersonPopUpModules.cancelAddingPersonButton(driver).isDisplayed();
		System.out.println("Popup voor het toevoegen van een persoon is geopend");

		// add new student
		AddPersonPopUpModules.nameField(driver).sendKeys(PersonData.person3Name);
		AddPersonPopUpModules.numberField(driver).sendKeys(PersonData.person3Number);
		AddPersonPopUpModules.telephoneNumberField(driver).sendKeys(PersonData.person3TelephoneNumber);
		AddPersonPopUpModules.emailAddressField(driver).sendKeys(PersonData.person3Emailadress);
		AddPersonPopUpModules.passwordField(driver).sendKeys(PersonData.person3Password);
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).click();
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).sendKeys(PersonData.person3Role);
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).sendKeys(Keys.ARROW_DOWN);
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).sendKeys(Keys.ENTER);
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).sendKeys(Keys.ESCAPE);
		DefaultModules.waitForLoad(500);
		AddPersonPopUpModules.savePersonButton(driver).click();

		// check if student is added
		DefaultModules.waitForLoad(3000);
		assertEquals(PersonData.person3Name, AddPersonModules.selectedPersonName(driver).getText());
		assertEquals(PersonData.person3Number, AddPersonModules.selectedPersonNumber(driver).getText());
		assertEquals(PersonData.person3TelephoneNumber,
				AddPersonModules.selectedPersonTelephoneNumber(driver).getText());
		assertEquals(PersonData.person3Emailadress, AddPersonModules.selectedPersonEmailAddress(driver).getText());
		assertEquals("", AddPersonModules.selectedPersonPassword(driver).getText());
		assertEquals(PersonData.person3Role, AddPersonModules.selectedPersonRole(driver).getText());

		// end testcase
		DefaultModules.endTestcase(driver);
	}

	public static void addTweedeExaminatorTestcase(WebDriver driver) {

		// initialize testcase
		DefaultModules.startTestcase(driver);

		// Login
		ReusableTestParts.loginToAssessMe(driver, LoginData.AdminUsername, LoginData.AdminPassword);
		System.out.println("Login geslaagd");
		// open menu for managing persons
		MenuModules.MenuDropdownBeheer(driver).click();
		MenuModules.MenuItemPersonen(driver).click();
		AddPersonModules.addPersonButton(driver).isDisplayed();
		System.out.println("Pagina voor beheren personen is geopend");

		// open add person popup
		AddPersonModules.addPersonButton(driver).click();

		// check if popup is open
		AddPersonPopUpModules.savePersonButton(driver).isDisplayed();
		AddPersonPopUpModules.cancelAddingPersonButton(driver).isDisplayed();
		System.out.println("Popup voor het toevoegen van een persoon is geopend");

		// add new student
		AddPersonPopUpModules.nameField(driver).sendKeys(PersonData.person4Name);
		AddPersonPopUpModules.numberField(driver).sendKeys(PersonData.person4Number);
		AddPersonPopUpModules.telephoneNumberField(driver).sendKeys(PersonData.person4TelephoneNumber);
		AddPersonPopUpModules.emailAddressField(driver).sendKeys(PersonData.person4Emailadress);
		AddPersonPopUpModules.passwordField(driver).sendKeys(PersonData.person4Password);
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).click();
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).sendKeys(PersonData.person4Role);
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).sendKeys(Keys.ARROW_DOWN);
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).sendKeys(Keys.ENTER);
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).sendKeys(Keys.ESCAPE);
		DefaultModules.waitForLoad(500);
		AddPersonPopUpModules.savePersonButton(driver).click();

		// check if student is added
		DefaultModules.waitForLoad(3000);
		assertEquals(PersonData.person4Name, AddPersonModules.selectedPersonName(driver).getText());
		assertEquals(PersonData.person4Number, AddPersonModules.selectedPersonNumber(driver).getText());
		assertEquals(PersonData.person4TelephoneNumber,
				AddPersonModules.selectedPersonTelephoneNumber(driver).getText());
		assertEquals(PersonData.person4Emailadress, AddPersonModules.selectedPersonEmailAddress(driver).getText());
		assertEquals("", AddPersonModules.selectedPersonPassword(driver).getText());
		assertEquals(PersonData.person4Role, AddPersonModules.selectedPersonRole(driver).getText());

		// end testcase
		DefaultModules.endTestcase(driver);
	}

	public static void addGecommitteerdeTestcase(WebDriver driver) {

		// initialize testcase
		DefaultModules.startTestcase(driver);

		// Login
		ReusableTestParts.loginToAssessMe(driver, LoginData.AdminUsername, LoginData.AdminPassword);
		System.out.println("Login geslaagd");
		// open menu for managing persons
		MenuModules.MenuDropdownBeheer(driver).click();
		MenuModules.MenuItemPersonen(driver).click();
		AddPersonModules.addPersonButton(driver).isDisplayed();
		System.out.println("Pagina voor beheren personen is geopend");

		// open add person popup
		AddPersonModules.addPersonButton(driver).click();

		// check if popup is open
		AddPersonPopUpModules.savePersonButton(driver).isDisplayed();
		AddPersonPopUpModules.cancelAddingPersonButton(driver).isDisplayed();
		System.out.println("Popup voor het toevoegen van een persoon is geopend");

		// add new student
		AddPersonPopUpModules.nameField(driver).sendKeys(PersonData.person5Name);
		AddPersonPopUpModules.numberField(driver).sendKeys(PersonData.person5Number);
		AddPersonPopUpModules.telephoneNumberField(driver).sendKeys(PersonData.person5TelephoneNumber);
		AddPersonPopUpModules.emailAddressField(driver).sendKeys(PersonData.person5Emailadress);
		AddPersonPopUpModules.passwordField(driver).sendKeys(PersonData.person5Password);
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).click();
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).sendKeys(PersonData.person5Role);
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).sendKeys(Keys.ARROW_DOWN);
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).sendKeys(Keys.ENTER);
		AddPersonPopUpModules.selectedPersonRoleDropdown(driver).sendKeys(Keys.ESCAPE);
		DefaultModules.waitForLoad(500);
		AddPersonPopUpModules.savePersonButton(driver).click();

		// check if student is added
		DefaultModules.waitForLoad(3000);
		assertEquals(PersonData.person5Name, AddPersonModules.selectedPersonName(driver).getText());
		assertEquals(PersonData.person5Number, AddPersonModules.selectedPersonNumber(driver).getText());
		assertEquals(PersonData.person5TelephoneNumber,
				AddPersonModules.selectedPersonTelephoneNumber(driver).getText());
		assertEquals(PersonData.person5Emailadress, AddPersonModules.selectedPersonEmailAddress(driver).getText());
		assertEquals("", AddPersonModules.selectedPersonPassword(driver).getText());
		assertEquals(PersonData.person5Role, AddPersonModules.selectedPersonRole(driver).getText());

		// end testcase
		DefaultModules.endTestcase(driver);
	}

}
