package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddAssessmentPopUpModules {

	// Pop-up new assessment studentdropdown
	public static WebElement selectStudentDropdown(WebDriver driver) {
		return driver.findElement(
				By.xpath("//*[@id=\"ManageAssessmentScreen.NewAssessmentDialog.ManageAssessment.StudentID\"]"));
	}

	// Pop-up new assessment VOECodeDropdown
	public static WebElement selectVOECodeDropdown(WebDriver driver) {
		return driver.findElement(
				By.xpath("//*[@id=\"ManageAssessmentScreen.NewAssessmentDialog.ManageAssessment.VOEcode\"]"));
	}

	// Pop-up new assessment CompanyDropdown
	public static WebElement selectCompanyDropdown(WebDriver driver) {
		return driver.findElement(
				By.xpath("//*[@id=\"ManageAssessmentScreen.NewAssessmentDialog.ManageAssessment.BedrijfsID\"]"));
	}

	// Pop-up new assessment PeriodFrom
	public static WebElement selectPeriodFrom(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"PeriodeVan_input\"]"));
	}

	// Pop-up new assessment PeriodTo
	public static WebElement selectPeriodTo(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"PeriodeTot_input\"]"));
	}

	// Pop-up new assessment DateAssessment
	public static WebElement selectDateAssessment(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"DatumAssessment_input\"]"));
	}

	// Pop-up new assessment SaveAssessmentButton
	public static WebElement saveAssessmentButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
	}

	// Pop-up new assessment CancelsaveAssessmentButton
	public static WebElement cancelSaveAssessmentButton(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[3]/div/div[2]/button"));
	}

	// Pop-up new assessment EersteExaminator
	public static WebElement selectEersteExaminator(WebDriver driver) {
		return driver.findElement(
				By.xpath("//*[@id=\"ManageAssessmentScreen.NewAssessmentDialog.ManageAssessment.Examinator1\"]"));
	}

	// Pop-up new assessment TweedeExaminator
	public static WebElement selectTweedeExaminator(WebDriver driver) {
		return driver.findElement(
				By.xpath("//*[@id=\"ManageAssessmentScreen.NewAssessmentDialog.ManageAssessment.Examinator2\"]"));
	}

	// Pop-up new assessment EersteExaminator
	public static WebElement selectGecommitteerde(WebDriver driver) {
		return driver.findElement(
				By.xpath("//*[@id=\"ManageAssessmentScreen.NewAssessmentDialog.ManageAssessment.Gecommiteerde\"]"));
	}

}
