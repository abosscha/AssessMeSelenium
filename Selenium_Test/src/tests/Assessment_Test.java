package tests;

//standard imports
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

//module imports
import modules.AssessmentScreenModules;
import modules.AssessmentSelectionModules;
import modules.DefaultModules;

public class Assessment_Test {

	public static void test(WebDriver driver) {

		// init wait
		WebDriverWait wait = new WebDriverWait(driver, 10);

		// is page loaded?
		AssessmentSelectionModules.assessmeHeader(driver).isDisplayed();

		// is assessment available and correct?
		AssessmentSelectionModules.assessmentCard(driver).click();
		assertEquals("Andy Bosscha", AssessmentSelectionModules.assessmentStudent(driver).getText());
		System.out.println("geselecteerde assessment:" + AssessmentSelectionModules.assessmentCard(driver).getText());

		// open assessment
		AssessmentSelectionModules.assessmeButton(driver).click();

		// is assessmentscreen loaded?
		assertEquals(true, AssessmentScreenModules.homeButton(driver).isDisplayed());

		// Page: Beheren -> Zelfstandigheid. check keywords
		assertEquals(data.AssessmentScreenBeheren.ZelfstandigheidSleutelwoordAanpak,
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordAanpak(driver).getAttribute("innerText"));
		assertEquals(data.AssessmentScreenBeheren.ZelfstandigheidSleutelwoordInitiatief,
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordInitiatief(driver).getAttribute("innerText"));
		assertEquals(data.AssessmentScreenBeheren.ZelfstandigheidSleutelwoordKeuzesMaken, AssessmentScreenModules
				.beherenZelfstandigheidSleutelwoordKeuzesMaken(driver).getAttribute("innerText"));
		System.out.println("Beheren -> Zelfstandigheid: Sleutelwoorden aanwezig en correct");

		// Page: Beheren -> Zelfstandigheid. check excellent 9+
		assertEquals(data.AssessmentScreenBeheren.ZelfstandigheidSleutelwoordAanpakExcellent, AssessmentScreenModules
				.beherenZelfstandigheidSleutelwoordAanpakExcellent(driver).getAttribute("innerText"));
		assertEquals(data.AssessmentScreenBeheren.ZelfstandigheidSleutelwoordInitiatiefExcellent,
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordInitiatiefExcellent(driver)
						.getAttribute("innerText"));
		assertEquals(data.AssessmentScreenBeheren.ZelfstandigheidSleutelwoordKeuzesMakenExcellent,
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordKeuzesMakenExcellent(driver)
						.getAttribute("innerText"));
		System.out.println("Beheren -> Zelfstandigheid: beoordelingen onder Excellent(9+) aanwezig en correct");

		// Page: Beheren -> Zelfstandigheid. check Goed 8
		assertEquals(data.AssessmentScreenBeheren.ZelfstandigheidSleutelwoordAanpakGoed,
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordAanpakGoed(driver).getAttribute("innerText"));
		assertEquals(data.AssessmentScreenBeheren.ZelfstandigheidSleutelwoordInitiatiefGoed, AssessmentScreenModules
				.beherenZelfstandigheidSleutelwoordInitiatiefGoed(driver).getAttribute("innerText"));
		assertEquals(data.AssessmentScreenBeheren.ZelfstandigheidSleutelwoordKeuzesMakenGoed, AssessmentScreenModules
				.beherenZelfstandigheidSleutelwoordKeuzesMakenGoed(driver).getAttribute("innerText"));
		System.out.println("Beheren -> Zelfstandigheid: beoordelingen onder Goed(8) aanwezig en correct");

		// Page: Beheren -> Zelfstandigheid. check Voldoende 6
		assertEquals(data.AssessmentScreenBeheren.ZelfstandigheidSleutelwoordAanpakVoldoende, AssessmentScreenModules
				.beherenZelfstandigheidSleutelwoordAanpakVoldoende(driver).getAttribute("innerText"));
		assertEquals(data.AssessmentScreenBeheren.ZelfstandigheidSleutelwoordInitiatiefVoldoende,
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordInitiatiefVoldoende(driver)
						.getAttribute("innerText"));
		assertEquals(data.AssessmentScreenBeheren.ZelfstandigheidSleutelwoordKeuzesMakenVoldoende,
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordKeuzesMakenVoldoende(driver)
						.getAttribute("innerText"));
		System.out.println("Beheren -> Zelfstandigheid: beoordelingen onder Voldoende (6) aanwezig en correct");

		// Page: Beheren -> Zelfstandigheid. check Niet Voldaan 4-
		assertEquals(data.AssessmentScreenBeheren.ZelfstandigheidSleutelwoordAanpakNietVoldaan, AssessmentScreenModules
				.beherenZelfstandigheidSleutelwoordAanpakNietVoldaan(driver).getAttribute("innerText"));
		assertEquals(data.AssessmentScreenBeheren.ZelfstandigheidSleutelwoordInitiatiefNietVoldaan,
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordInitiatiefNietVoldaan(driver)
						.getAttribute("innerText"));
		assertEquals(data.AssessmentScreenBeheren.ZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan,
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan(driver)
						.getAttribute("innerText"));
		System.out.println("Beheren -> Zelfstandigheid: beoordelingen onder Niet Voldaan (4-) aanwezig en correct");

		// Check pageNumbert and click next to open page: Gedrag, then check pageNumber
		// again
		assertEquals("1", AssessmentScreenModules.pageNumber(driver).getAttribute("innerText"));
		DefaultModules.waitForLoad(2000);
		AssessmentScreenModules.beherenZelfstandigheidButtonVolgende(driver).click();
		assertEquals("2", AssessmentScreenModules.pageNumber(driver).getAttribute("innerText"));

//		 Page: Beheren -> Gedrag. check sleutelwoorden
		assertEquals(data.AssessmentScreenBeheren.GedragSleutelwoordEffectiviteit,
				AssessmentScreenModules.beherenGedragSleutelwoordEffectiviteit(driver).getAttribute("innerText"));
		assertEquals(data.AssessmentScreenBeheren.GedragSleutelwoordZelfkritisch,
				AssessmentScreenModules.beherenGedragSleutelwoordZelfkritisch(driver).getAttribute("innerText"));
		System.out.println("Beheren -> Gedrag: sleutelwoorden aanwezig en correct");

	}

}
