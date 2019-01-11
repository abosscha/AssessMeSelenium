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

	public static WebElement studentSelectionDropdown(WebDriver driver) {
		return driver.findElement(By.cssSelector("#AddAssessmentScreen.AddAssessment.StudentID"));
	}

}
