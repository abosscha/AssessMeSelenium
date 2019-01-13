package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddAssessmentModules {

	// tableheader
	public static WebElement availableAssessmentsTableHeader(WebDriver driver, int row, int col) {
		return driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[" + row + "]/div/div/div[" + col + "]"));
	}

	// TableData
	public static WebElement availableAssessmentsTableData(WebDriver driver, int row, int col) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]/div/div/div/div"
				+ row + "]/div[" + col + "]"));
	}

	// add new assessment button
	public static WebElement buttonAddNewAssessment(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[1]/div[1]/button"));
	}

	// edit selected assessment button
	public static WebElement buttonEditSelectedAssessment(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[1]/div[2]/button"));
	}

	// update edited assessment button
	public static WebElement buttonUpdateEditedAssessment(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
	}

	// cancel editing assessment button
	public static WebElement buttonCancelEditingAssessment(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Submit\"]"));
	}

	// selected assessmentID
	public static WebElement selectedAssessmentID(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[2]/div[1]/div[1]/div"));
	}

	// selected assessment Student
	public static WebElement selectedAssessmentStudent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[2]/div[2]/div[2]/div"));
	}

	// selected assessment EditStudent
	public static WebElement selectedAssessmentEditStudent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"ManageAssessmentScreen.ManageAssessment.StudentID\"]"));
	}

	// selected assessment VOE code
	public static WebElement selectedAssessmentVOECode(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[2]/div[3]/div[2]/div"));
	}

	// selected assessment edit VOE code
	public static WebElement selectedAssessmentEditVOECode(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"ManageAssessmentScreen.ManageAssessment.VOEcode\"]"));
	}

	// selected assessment company
	public static WebElement selectedAssessmentCompany(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[2]/div[4]/div[2]/div"));
	}

	// selected assessment edit company
	public static WebElement selectedAssessmentEditCompany(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"ManageAssessmentScreen.ManageAssessment.BedrijfsID\"]"));
	}

	// selected assessment periodFrom
	public static WebElement selectedAssessmentPeriodFrom(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[2]/div[5]/div[2]/div"));
	}

	// selected assessment editPeriodFrom
	public static WebElement selectedAssessmentEditPeriodFrom(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"PeriodeVan_input\"]"));
	}

	// selected assessment periodTo
	public static WebElement selectedAssessmentPeriodTo(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[2]/div[6]/div[2]/div"));
	}

	// selected assessment editperiodTo
	public static WebElement selectedAssessmentEditPeriodTo(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"PeriodeTot_input\"]"));
	}

	// selected assessment assessmentDate
	public static WebElement selectedAssessmentDate(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[2]/div[7]/div[2]/div"));
	}

	// selected assessment editassessmentDate
	public static WebElement selectedAssessmentEditDate(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"DatumAssessment_input\"]"));
	}

	// selected assessment EersteExaminator
	public static WebElement selectedAssessmentEersteExaminator(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[3]/div[1]/div[2]/div"));
	}

	// selected assessment EditEersteExaminator
	public static WebElement selectedAssessmentEditEersteExaminator(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"ManageAssessmentScreen.ManageAssessment.Examinator1\"]"));
	}

	// selected assessment TweedeExaminator
	public static WebElement selectedAssessmentTweedeExaminator(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[3]/div[2]/div[2]/div"));
	}

	// selected assessment EditTweedeExaminator
	public static WebElement selectedAssessmentEditTweedeExaminator(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"ManageAssessmentScreen.ManageAssessment.Examinator2\"]"));
	}

	// selected assessment Gecommitteerde
	public static WebElement selectedAssessmentGecommitteerde(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/form/div[3]/div[3]/div[2]/div"));
	}

	// selected assessment EditGecommitteerde
	public static WebElement selectedAssessmentEditGecommitteerde(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"ManageAssessmentScreen.ManageAssessment.Gecommiteerde\"]"));
	}
}
