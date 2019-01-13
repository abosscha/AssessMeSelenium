package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddAssessmentPopUpModules {

	// Tab assessmentInfo
	public static WebElement tabAssessmentInfo(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[2]/div/ul/li[1]/a"));
	}

	// Tab BetrokkenPersonen
	public static WebElement tabBetrokkenPersonen(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[2]/div/ul/li[2]/a"));
	}

	// Tab assessmentInfo studentdropdown
	public static WebElement selectStudentDropdown(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"ManageAssessmentScreen.NewAssessmentDialog.StudentID\"]"));
	}

	// Tab assessmentInfo VOECodeDropdown
	public static WebElement selectVOECodeDropdown(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"ManageAssessmentScreen.NewAssessmentDialog.VOEcode\"]"));
	}

	// Tab assessmentInfo CompanyDropdown
	public static WebElement selectCompanyDropdown(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"ManageAssessmentScreen.NewAssessmentDialog.BedrijfsID\"]"));
	}

	// Tab assessmentInfo PeriodFrom
	public static WebElement selectPeriodFrom(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"PeriodeVan_input\"]"));
	}

	// Tab assessmentInfo PeriodTo
	public static WebElement selectPeriodTo(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"PeriodeTot_input\"]"));
	}

	// Tab assessmentInfo DateAssessment
	public static WebElement selectDateAssessment(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"DatumAssessment_input\"]"));
	}

	// Tab assessmentInfo SaveAssessmentButton
	public static WebElement saveAssessmentButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
	}

	// Tab assessmentInfo CancelsaveAssessmentButton
	public static WebElement cancelSaveAssessmentButton(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[3]/div/div[2]/button"));
	}

	// Tab BetrokkenPersonen EersteExaminator
	public static WebElement selectEersteExaminator(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"ManageAssessmentScreen.NewAssessmentDialog.Examinator1\"]"));
	}

	// Tab BetrokkenPersonen TweedeExaminator
	public static WebElement selectTweedeExaminator(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"ManageAssessmentScreen.NewAssessmentDialog.Examinator2\"]"));
	}

	// Tab BetrokkenPersonen EersteExaminator
	public static WebElement selectGecommitteerde(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"ManageAssessmentScreen.NewAssessmentDialog.Gecommiteerde\"]"));
	}

}
