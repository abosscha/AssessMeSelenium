package tests;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import data.CompanyData;
import data.LoginData;
import data.PersonData;
import modules.AddAssessmentModules;
import modules.AddAssessmentPopUpModules;
import modules.DefaultModules;
import modules.MenuModules;

public class AddAssessments_Test {

	public static void checkScreenData(WebDriver driver) {

		// initialize testcase
		DefaultModules.startTestcase(driver);

		// Login
		ReusableTestParts.loginToAssessMe(driver, LoginData.AdminUsername, LoginData.AdminPassword);
		System.out.println("Login geslaagd");

		// open assessment management menu
		MenuModules.MenuDropdownBeheer(driver).click();
		MenuModules.MenuItemAssessments(driver).click();

		// check screendata
		assertEquals("Naam student", AddAssessmentModules.availableAssessmentsTableHeader(driver, 1, 1).getText());
		assertEquals("Studentnummer", AddAssessmentModules.availableAssessmentsTableHeader(driver, 1, 2).getText());
		assertEquals("Profielnaam", AddAssessmentModules.availableAssessmentsTableHeader(driver, 1, 3).getText());
		assertEquals("Periode van", AddAssessmentModules.availableAssessmentsTableHeader(driver, 1, 4).getText());
		assertEquals("Periode tot", AddAssessmentModules.availableAssessmentsTableHeader(driver, 1, 5).getText());
		assertEquals("Datum assessment", AddAssessmentModules.availableAssessmentsTableHeader(driver, 1, 6).getText());
		assertEquals("Bedrijfsnaam", AddAssessmentModules.availableAssessmentsTableHeader(driver, 1, 7).getText());
		assertEquals("Bedrijfsplaats", AddAssessmentModules.availableAssessmentsTableHeader(driver, 1, 8).getText());

		// end testcase
		DefaultModules.endTestcase(driver);
	}

	public static void addFirstAssessment(WebDriver driver) {

		// initialize testcase
		DefaultModules.startTestcase(driver);

		// Login
		ReusableTestParts.loginToAssessMe(driver, LoginData.AdminUsername, LoginData.AdminPassword);
		System.out.println("Login geslaagd");

		// open assessment management menu
		MenuModules.MenuDropdownBeheer(driver).click();
		MenuModules.MenuItemAssessments(driver).click();

		// Open new assessmentPopup
		AddAssessmentModules.buttonAddNewAssessment(driver).click();

		// check if new assessmentPopup is shown
		DefaultModules.waitForLoad(1000);
		assertEquals(true, AddAssessmentPopUpModules.selectStudentDropdown(driver).isDisplayed());

		// add assessment
		AddAssessmentPopUpModules.selectStudentDropdown(driver)
				.sendKeys(PersonData.person1Name + " " + PersonData.person1Number);
		AddAssessmentPopUpModules.selectVOECodeDropdown(driver).sendKeys("ICT.AFSTSE.D17 (dt)");
		AddAssessmentPopUpModules.selectCompanyDropdown(driver).sendKeys(CompanyData.company1Name);
		AddAssessmentPopUpModules.selectPeriodFrom(driver).sendKeys("01/02/2019");
		AddAssessmentPopUpModules.selectPeriodTo(driver).sendKeys("01/02/2019");
		AddAssessmentPopUpModules.selectDateAssessment(driver).sendKeys("01/02/2019");
		AddAssessmentPopUpModules.selectEersteExaminator(driver)
				.sendKeys(PersonData.person3Name + " " + PersonData.person3Number);
		AddAssessmentPopUpModules.selectTweedeExaminator(driver)
				.sendKeys(PersonData.person4Name + " " + PersonData.person4Number);
		AddAssessmentPopUpModules.selectGecommitteerde(driver)
				.sendKeys(PersonData.person5Name + " " + PersonData.person5Number);
		AddAssessmentPopUpModules.saveAssessmentButton(driver).click();

		// check if assessment is created
		DefaultModules.waitForLoad(1000);
		driver.navigate().refresh();
		assertEquals(PersonData.person1Name + " " + PersonData.person1Number,
				AddAssessmentModules.selectedAssessmentStudent(driver).getText());
		assertEquals("ICT.AFSTSE.D17 (dt) | Software Engineering (SE)",
				AddAssessmentModules.selectedAssessmentVOECode(driver).getText());
		assertEquals(CompanyData.company1Name + " " + CompanyData.company1City,
				AddAssessmentModules.selectedAssessmentCompany(driver).getText());
		assertEquals("02/02/2019", AddAssessmentModules.selectedAssessmentPeriodFrom(driver).getText());
		assertEquals("02/02/2019", AddAssessmentModules.selectedAssessmentPeriodTo(driver).getText());
		assertEquals("02/02/2019", AddAssessmentModules.selectedAssessmentDate(driver).getText());
		assertEquals(PersonData.person3Name + " " + PersonData.person3Number,
				AddAssessmentModules.selectedAssessmentEersteExaminator(driver).getText());
		assertEquals(PersonData.person4Name + " " + PersonData.person4Number,
				AddAssessmentModules.selectedAssessmentTweedeExaminator(driver).getText());
		assertEquals(PersonData.person5Name + " " + PersonData.person5Number,
				AddAssessmentModules.selectedAssessmentGecommitteerde(driver).getText());
		// end testcase
		DefaultModules.endTestcase(driver);
	}

}
