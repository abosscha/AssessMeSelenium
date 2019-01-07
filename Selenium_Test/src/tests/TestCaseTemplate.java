package tests;

import static org.junit.Assert.assertEquals;

//standard imports
import org.openqa.selenium.WebDriver;

import data.LoginData;
import data.StudentData;
import modules.AssessmentScreenModules;
import modules.AssessmentSelectionModules;
//module imports
import modules.DefaultModules;

public class TestCaseTemplate {

	public static void templateTestCase(WebDriver driver) {

		// initialize testcase
		DefaultModules.startTestcase(driver);

		// Teststeps
		// init wait
		DefaultModules.startTestcase(driver);

		// login
		ReusableTestParts.loginToAssessMe(driver, LoginData.CorrectUserName, LoginData.CorrectPassword);

		// is page loaded?
		AssessmentSelectionModules.assessmeHeader(driver).isDisplayed();

		// is assessment available and correct?
		AssessmentSelectionModules.assessmentCard(driver).click();
		assertEquals(StudentData.studentName, AssessmentSelectionModules.assessmentStudent(driver).getText());
		System.out.println("geselecteerde assessment:" + AssessmentSelectionModules.assessmentCard(driver).getText());

		// open assessment
		AssessmentSelectionModules.assessmeButton(driver).click();

		AssessmentScreenModules.beherenZelfstandigheidSleutelwoordAanpakExcellent(driver).click();
		DefaultModules.waitForLoad(500);
		assertEquals(
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordAanpakExcellent(driver).getAttribute("class"),
				"SelectedP");

		// end testcase
		DefaultModules.endTestcase(driver);
	}

}
