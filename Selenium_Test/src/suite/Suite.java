package suite;

import org.openqa.selenium.WebDriver;

import tests.AddAssessments_Test;
import tests.AddCompanies_Test;
import tests.AddPerson_Test;
import tests.Login_Test;

public class Suite {

	public static void testTheSuite(WebDriver driver) {

		// Fetch all tests and run all

		// test Login
		Login_Test.loginCorrectly(driver);
		Login_Test.loginWithWrongUsernameAndWrongPassword(driver);

		// Add testdata --> Persons
		AddPerson_Test.checkScreenData(driver);
		AddPerson_Test.addStudent1Testcase(driver);
		AddPerson_Test.addStudent2Testcase(driver);
		AddPerson_Test.editStudent2Testcase(driver);
		AddPerson_Test.addEersteExaminatorTestcase(driver);
		AddPerson_Test.addTweedeExaminatorTestcase(driver);
		AddPerson_Test.addGecommitteerdeTestcase(driver);

		// Add testdata --> Companies
		AddCompanies_Test.checkCompanyScreenDataTestcase(driver);
		AddCompanies_Test.addCompanyOneTestcase(driver);
		AddCompanies_Test.editCompanyOneTestcase(driver);
		AddCompanies_Test.addCompanyTwoTestcase(driver);
		AddCompanies_Test.addCompanyThreeTestcase(driver);
		AddCompanies_Test.addCompanyFourTestcase(driver);
		AddCompanies_Test.addCompanyFiveTestcase(driver);

		// Add testdata --> Assessments
		AddAssessments_Test.checkScreenData(driver);
		AddAssessments_Test.addFirstAssessment(driver);

		// test assessment table
//		Assessment_Test.test(driver);

	}

}
