package tests;

//standard imports
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import data.AssessmentTableData;
import data.LoginData;
import data.PersonData;
//module imports
import modules.AssessmentScreenModules;
import modules.AssessmentSelectionModules;
import modules.DefaultModules;
import modules.MenuModules;

public class Assessment_Test {

	public static void test(WebDriver driver) {

		// init wait
		DefaultModules.startTestcase(driver);

		// login
		ReusableTestParts.loginToAssessMe(driver, LoginData.CorrectUserName, LoginData.CorrectPassword);

		// is page loaded?
		AssessmentSelectionModules.assessmeHeader(driver).isDisplayed();

		// is assessment available and correct?
		AssessmentSelectionModules.assessmentCard(driver).click();
		assertEquals(PersonData.person1Name, AssessmentSelectionModules.assessmentStudent(driver).getText());
		System.out.println("geselecteerde assessment:" + AssessmentSelectionModules.assessmentCard(driver).getText());

		// open assessment
		AssessmentSelectionModules.assessmeButton(driver).click();

		// is assessmentscreen loaded?
		assertEquals(true, MenuModules.homeButtonInOpenedAssessment(driver).isDisplayed());

// Page: Beheren -> Zelfstandigheid. check keywords
		assertEquals(data.AssessmentTableData.BeherenZelfstandigheidSleutelwoordAanpak,
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordAanpak(driver).getAttribute("innerText"));
		assertEquals(data.AssessmentTableData.BeherenZelfstandigheidSleutelwoordInitiatief,
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordInitiatief(driver).getAttribute("innerText"));
		assertEquals(data.AssessmentTableData.BeherenZelfstandigheidSleutelwoordKeuzesMaken, AssessmentScreenModules
				.beherenZelfstandigheidSleutelwoordKeuzesMaken(driver).getAttribute("innerText"));
		System.out.println("Beheren -> Zelfstandigheid: Sleutelwoorden aanwezig en correct");

// Page: Beheren -> Zelfstandigheid. check excellent 9+
		assertEquals(data.AssessmentTableData.BeherenZelfstandigheidSleutelwoordAanpakExcellent, AssessmentScreenModules
				.beherenZelfstandigheidSleutelwoordAanpakExcellent(driver).getAttribute("innerText"));
		AssessmentScreenModules.beherenZelfstandigheidSleutelwoordAanpakExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordAanpakExcellent(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.BeherenZelfstandigheidSleutelwoordInitiatiefExcellent,
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordInitiatiefExcellent(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.beherenZelfstandigheidSleutelwoordInitiatiefExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.beherenZelfstandigheidSleutelwoordInitiatiefExcellent(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.BeherenZelfstandigheidSleutelwoordKeuzesMakenExcellent,
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordKeuzesMakenExcellent(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.beherenZelfstandigheidSleutelwoordKeuzesMakenExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.beherenZelfstandigheidSleutelwoordKeuzesMakenExcellent(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		System.out.println("Beheren -> Zelfstandigheid: beoordelingen onder Excellent(9+) aanwezig en correct");

// Page: Beheren -> Zelfstandigheid. check Goed 8
		assertEquals(data.AssessmentTableData.BeherenZelfstandigheidSleutelwoordAanpakGoed,
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordAanpakGoed(driver).getAttribute("innerText"));
		AssessmentScreenModules.beherenZelfstandigheidSleutelwoordAanpakGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.beherenZelfstandigheidSleutelwoordAanpakGoed(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.BeherenZelfstandigheidSleutelwoordInitiatiefGoed, AssessmentScreenModules
				.beherenZelfstandigheidSleutelwoordInitiatiefGoed(driver).getAttribute("innerText"));
		AssessmentScreenModules.beherenZelfstandigheidSleutelwoordInitiatiefGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordInitiatiefGoed(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.BeherenZelfstandigheidSleutelwoordKeuzesMakenGoed, AssessmentScreenModules
				.beherenZelfstandigheidSleutelwoordKeuzesMakenGoed(driver).getAttribute("innerText"));
		AssessmentScreenModules.beherenZelfstandigheidSleutelwoordKeuzesMakenGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordKeuzesMakenGoed(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		System.out.println("Beheren -> Zelfstandigheid: beoordelingen onder Goed(8) aanwezig en correct");

// Page: Beheren -> Zelfstandigheid. check Voldoende 6
		assertEquals(data.AssessmentTableData.BeherenZelfstandigheidSleutelwoordAanpakVoldoende, AssessmentScreenModules
				.beherenZelfstandigheidSleutelwoordAanpakVoldoende(driver).getAttribute("innerText"));
		AssessmentScreenModules.beherenZelfstandigheidSleutelwoordAanpakVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordAanpakVoldoende(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.BeherenZelfstandigheidSleutelwoordInitiatiefVoldoende,
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordInitiatiefVoldoende(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.beherenZelfstandigheidSleutelwoordInitiatiefVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.beherenZelfstandigheidSleutelwoordInitiatiefVoldoende(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.BeherenZelfstandigheidSleutelwoordKeuzesMakenVoldoende,
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordKeuzesMakenVoldoende(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.beherenZelfstandigheidSleutelwoordKeuzesMakenVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.beherenZelfstandigheidSleutelwoordKeuzesMakenVoldoende(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		System.out.println("Beheren -> Zelfstandigheid: beoordelingen onder Voldoende (6) aanwezig en correct");

// Page: Beheren -> Zelfstandigheid. check Niet Voldaan 4-
		assertEquals(data.AssessmentTableData.BeherenZelfstandigheidSleutelwoordAanpakNietVoldaan,
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordAanpakNietVoldaan(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.beherenZelfstandigheidSleutelwoordAanpakNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.beherenZelfstandigheidSleutelwoordAanpakNietVoldaan(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassNegative);

		assertEquals(data.AssessmentTableData.BeherenZelfstandigheidSleutelwoordInitiatiefNietVoldaan,
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordInitiatiefNietVoldaan(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.beherenZelfstandigheidSleutelwoordInitiatiefNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.beherenZelfstandigheidSleutelwoordInitiatiefNietVoldaan(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassNegative);

		assertEquals(data.AssessmentTableData.BeherenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan,
				AssessmentScreenModules.beherenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.beherenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.beherenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassNegative);

		System.out.println("Beheren -> Zelfstandigheid: beoordelingen onder Niet Voldaan (4-) aanwezig en correct");

		// Check pageNumbert and click next to open page: Gedrag, then check pageNumber
		// again
		assertEquals("1", AssessmentScreenModules.pageNumber(driver).getAttribute("innerText"));
		DefaultModules.waitForLoad(1000);
		AssessmentScreenModules.beherenZelfstandigheidButtonVolgende(driver).click();
		assertEquals("1", AssessmentScreenModules.pageNumber(driver).getAttribute("innerText"));
		DefaultModules.waitForLoad(300);

//Page: Beheren -> Gedrag. check sleutelwoorden
		assertEquals(data.AssessmentTableData.BeherenGedragSleutelwoordEffectiviteit,
				AssessmentScreenModules.beherenGedragSleutelwoordEffectiviteit(driver).getAttribute("innerText"));
		assertEquals(data.AssessmentTableData.BeherenGedragSleutelwoordZelfkritisch,
				AssessmentScreenModules.beherenGedragSleutelwoordZelfkritisch(driver).getAttribute("innerText"));
		System.out.println("Beheren -> Gedrag: sleutelwoorden aanwezig en correct");

		// Page: Beheren -> Gedrag. check excellent 9+
		assertEquals(AssessmentTableData.BeherenGedragSleutelwoordEffectiviteitExcellent, AssessmentScreenModules
				.beherenGedragSleutelwoordEffectiviteitExcellent(driver).getAttribute("innerText"));
		AssessmentScreenModules.beherenGedragSleutelwoordEffectiviteitExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.beherenGedragSleutelwoordEffectiviteitExcellent(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		assertEquals(AssessmentTableData.BeherenGedragSleutelwoordZelfkritischExcellent, AssessmentScreenModules
				.beherenGedragSleutelwoordZelfkritischExcellent(driver).getAttribute("innerText"));
		AssessmentScreenModules.beherenGedragSleutelwoordZelfkritischExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.beherenGedragSleutelwoordZelfkritischExcellent(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		// Page: Beheren -> Gedrag. check Goed 8
		assertEquals(AssessmentTableData.BeherenGedragSleutelwoordEffectiviteitGoed,
				AssessmentScreenModules.beherenGedragSleutelwoordEffectiviteitGoed(driver).getAttribute("innerText"));
		AssessmentScreenModules.beherenGedragSleutelwoordEffectiviteitGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.beherenGedragSleutelwoordEffectiviteitGoed(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		assertEquals(AssessmentTableData.BeherenGedragSleutelwoordZelfkritischGoed,
				AssessmentScreenModules.beherenGedragSleutelwoordZelfkritischGoed(driver).getAttribute("innerText"));
		AssessmentScreenModules.beherenGedragSleutelwoordZelfkritischGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.beherenGedragSleutelwoordZelfkritischGoed(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		// Page: Beheren -> Gedrag. check Voldoende 6
		assertEquals(AssessmentTableData.BeherenGedragSleutelwoordEffectiviteitVoldoende, AssessmentScreenModules
				.beherenGedragSleutelwoordEffectiviteitVoldoende(driver).getAttribute("innerText"));
		AssessmentScreenModules.beherenGedragSleutelwoordEffectiviteitVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.beherenGedragSleutelwoordEffectiviteitVoldoende(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		assertEquals(AssessmentTableData.BeherenGedragSleutelwoordZelfkritischVoldoende, AssessmentScreenModules
				.beherenGedragSleutelwoordZelfkritischVoldoende(driver).getAttribute("innerText"));
		AssessmentScreenModules.beherenGedragSleutelwoordZelfkritischVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.beherenGedragSleutelwoordZelfkritischVoldoende(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		// Page: Beheren -> Gedrag. check Voldoende 6
		assertEquals(AssessmentTableData.BeherenGedragSleutelwoordEffectiviteitNietVoldaan, AssessmentScreenModules
				.beherenGedragSleutelwoordEffectiviteitNietVoldaan(driver).getAttribute("innerText"));
		AssessmentScreenModules.beherenGedragSleutelwoordEffectiviteitNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.beherenGedragSleutelwoordEffectiviteitNietVoldaan(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassNegative);

		assertEquals(AssessmentTableData.BeherenGedragSleutelwoordZelfkritischNietVoldaan, AssessmentScreenModules
				.beherenGedragSleutelwoordZelfkritischNietVoldaan(driver).getAttribute("innerText"));
		AssessmentScreenModules.beherenGedragSleutelwoordZelfkritischNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.beherenGedragSleutelwoordZelfkritischNietVoldaan(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassNegative);

		// Check pageNumbert and click next to open page: Analyseren -> Zelfstandigheid,
		// then check pageNumber again
		assertEquals("1", AssessmentScreenModules.pageNumber(driver).getAttribute("innerText"));
		DefaultModules.waitForLoad(1000);
		AssessmentScreenModules.beherenZelfstandigheidButtonVolgende(driver).click();
		assertEquals("2", AssessmentScreenModules.pageNumber(driver).getAttribute("innerText"));
		DefaultModules.waitForLoad(300);

// Page: Analyseren -> Zelfstandigheid. check keywords
		assertEquals(data.AssessmentTableData.AnalyserenZelfstandigheidSleutelwoordAanpak,
				AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordAanpak(driver).getAttribute("innerText"));
		assertEquals(data.AssessmentTableData.AnalyserenZelfstandigheidSleutelwoordInitiatief, AssessmentScreenModules
				.analyserenZelfstandigheidSleutelwoordInitiatief(driver).getAttribute("innerText"));
		assertEquals(data.AssessmentTableData.AnalyserenZelfstandigheidSleutelwoordKeuzesMaken, AssessmentScreenModules
				.analyserenZelfstandigheidSleutelwoordKeuzesMaken(driver).getAttribute("innerText"));
		System.out.println("Analyseren -> Zelfstandigheid: Sleutelwoorden aanwezig en correct");

// Page: Analyseren -> Zelfstandigheid. check excellent 9+
		assertEquals(data.AssessmentTableData.AnalyserenZelfstandigheidSleutelwoordAanpakExcellent,
				AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordAanpakExcellent(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordAanpakExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordAanpakExcellent(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.AnalyserenZelfstandigheidSleutelwoordInitiatiefExcellent,
				AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordInitiatiefExcellent(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordInitiatiefExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordInitiatiefExcellent(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.AnalyserenZelfstandigheidSleutelwoordKeuzesMakenExcellent,
				AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordKeuzesMakenExcellent(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordKeuzesMakenExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordKeuzesMakenExcellent(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		System.out.println("Analyseren -> Zelfstandigheid: beoordelingen onder Excellent(9+) aanwezig en correct");

		// Page: Analyseren -> Zelfstandigheid. check Goed 8
		assertEquals(data.AssessmentTableData.AnalyserenZelfstandigheidSleutelwoordAanpakGoed, AssessmentScreenModules
				.analyserenZelfstandigheidSleutelwoordAanpakGoed(driver).getAttribute("innerText"));
		AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordAanpakGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordAanpakGoed(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.AnalyserenZelfstandigheidSleutelwoordInitiatiefGoed,
				AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordInitiatiefGoed(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordInitiatiefGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordInitiatiefGoed(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.AnalyserenZelfstandigheidSleutelwoordKeuzesMakenGoed,
				AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordKeuzesMakenGoed(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordKeuzesMakenGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordKeuzesMakenGoed(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		System.out.println("Analyseren -> Zelfstandigheid: beoordelingen onder Goed(8) aanwezig en correct");

		// Page: Analyseren -> Zelfstandigheid. check Voldoende 6
		assertEquals(data.AssessmentTableData.AnalyserenZelfstandigheidSleutelwoordAanpakVoldoende,
				AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordAanpakVoldoende(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordAanpakVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordAanpakVoldoende(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.AnalyserenZelfstandigheidSleutelwoordInitiatiefVoldoende,
				AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordInitiatiefVoldoende(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordInitiatiefVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordInitiatiefVoldoende(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.AnalyserenZelfstandigheidSleutelwoordKeuzesMakenVoldoende,
				AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordKeuzesMakenVoldoende(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordKeuzesMakenVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordKeuzesMakenVoldoende(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		System.out.println("Analyseren -> Zelfstandigheid: beoordelingen onder Voldoende (6) aanwezig en correct");

		// Page: Analyseren -> Zelfstandigheid. check Niet Voldaan 4-
		assertEquals(data.AssessmentTableData.AnalyserenZelfstandigheidSleutelwoordAanpakNietVoldaan,
				AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordAanpakNietVoldaan(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordAanpakNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordAanpakNietVoldaan(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassNegative);

		assertEquals(data.AssessmentTableData.AnalyserenZelfstandigheidSleutelwoordInitiatiefNietVoldaan,
				AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordInitiatiefNietVoldaan(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordInitiatiefNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordInitiatiefNietVoldaan(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassNegative);

		assertEquals(data.AssessmentTableData.AnalyserenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan,
				AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassNegative);

		System.out.println("Analyseren -> Zelfstandigheid: beoordelingen onder Niet Voldaan (4-) aanwezig en correct");

		// Check pageNumbert and click next to open page: Gedrag, then check pageNumber
		// again
		assertEquals("2", AssessmentScreenModules.pageNumber(driver).getAttribute("innerText"));
		DefaultModules.waitForLoad(1000);
		AssessmentScreenModules.beherenZelfstandigheidButtonVolgende(driver).click();
		assertEquals("2", AssessmentScreenModules.pageNumber(driver).getAttribute("innerText"));
		DefaultModules.waitForLoad(300);

		// Page: Analyseren -> Gedrag. check sleutelwoorden
		assertEquals(data.AssessmentTableData.AnalyserenGedragSleutelwoordEffectiviteit,
				AssessmentScreenModules.analyserenGedragSleutelwoordEffectiviteit(driver).getAttribute("innerText"));
		assertEquals(data.AssessmentTableData.AnalyserenGedragSleutelwoordZelfkritisch,
				AssessmentScreenModules.analyserenGedragSleutelwoordZelfkritisch(driver).getAttribute("innerText"));
		System.out.println("Analyseren -> Gedrag: sleutelwoorden aanwezig en correct");

		// Page: Analyseren -> Gedrag. check excellent 9+
		assertEquals(AssessmentTableData.AnalyserenGedragSleutelwoordEffectiviteitExcellent, AssessmentScreenModules
				.analyserenGedragSleutelwoordEffectiviteitExcellent(driver).getAttribute("innerText"));
		AssessmentScreenModules.analyserenGedragSleutelwoordEffectiviteitExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.analyserenGedragSleutelwoordEffectiviteitExcellent(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(AssessmentTableData.AnalyserenGedragSleutelwoordZelfkritischExcellent, AssessmentScreenModules
				.analyserenGedragSleutelwoordZelfkritischExcellent(driver).getAttribute("innerText"));
		AssessmentScreenModules.analyserenGedragSleutelwoordZelfkritischExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.analyserenGedragSleutelwoordZelfkritischExcellent(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		// Page: Analyseren -> Gedrag. check Goed 8
		assertEquals(AssessmentTableData.AnalyserenGedragSleutelwoordEffectiviteitGoed, AssessmentScreenModules
				.analyserenGedragSleutelwoordEffectiviteitGoed(driver).getAttribute("innerText"));
		AssessmentScreenModules.analyserenGedragSleutelwoordEffectiviteitGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.analyserenGedragSleutelwoordEffectiviteitGoed(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		assertEquals(AssessmentTableData.AnalyserenGedragSleutelwoordZelfkritischGoed,
				AssessmentScreenModules.analyserenGedragSleutelwoordZelfkritischGoed(driver).getAttribute("innerText"));
		AssessmentScreenModules.analyserenGedragSleutelwoordZelfkritischGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.analyserenGedragSleutelwoordZelfkritischGoed(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		// Page: Analyseren -> Gedrag. check Voldoende 6
		assertEquals(AssessmentTableData.AnalyserenGedragSleutelwoordEffectiviteitVoldoende, AssessmentScreenModules
				.analyserenGedragSleutelwoordEffectiviteitVoldoende(driver).getAttribute("innerText"));
		AssessmentScreenModules.analyserenGedragSleutelwoordEffectiviteitVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.analyserenGedragSleutelwoordEffectiviteitVoldoende(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(AssessmentTableData.AnalyserenGedragSleutelwoordZelfkritischVoldoende, AssessmentScreenModules
				.analyserenGedragSleutelwoordZelfkritischVoldoende(driver).getAttribute("innerText"));
		AssessmentScreenModules.analyserenGedragSleutelwoordZelfkritischVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.analyserenGedragSleutelwoordZelfkritischVoldoende(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		// Page: Analyseren -> Gedrag. check Voldoende 6
		assertEquals(AssessmentTableData.AnalyserenGedragSleutelwoordEffectiviteitNietVoldaan, AssessmentScreenModules
				.analyserenGedragSleutelwoordEffectiviteitNietVoldaan(driver).getAttribute("innerText"));
		AssessmentScreenModules.analyserenGedragSleutelwoordEffectiviteitNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.analyserenGedragSleutelwoordEffectiviteitNietVoldaan(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassNegative);

		assertEquals(AssessmentTableData.AnalyserenGedragSleutelwoordZelfkritischNietVoldaan, AssessmentScreenModules
				.analyserenGedragSleutelwoordZelfkritischNietVoldaan(driver).getAttribute("innerText"));
		AssessmentScreenModules.analyserenGedragSleutelwoordZelfkritischNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.analyserenGedragSleutelwoordZelfkritischNietVoldaan(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassNegative);

		// Check pageNumbert and click next to open page: Analyseren -> Zelfstandigheid,
		// then check pageNumber again
		assertEquals("2", AssessmentScreenModules.pageNumber(driver).getAttribute("innerText"));
		DefaultModules.waitForLoad(1000);
		AssessmentScreenModules.beherenZelfstandigheidButtonVolgende(driver).click();
		assertEquals("3", AssessmentScreenModules.pageNumber(driver).getAttribute("innerText"));
		DefaultModules.waitForLoad(300);

		// Page: Adviseren -> Zelfstandigheid. check keywords
		assertEquals(data.AssessmentTableData.AdviserenZelfstandigheidSleutelwoordAanpak,
				AssessmentScreenModules.analyserenZelfstandigheidSleutelwoordAanpak(driver).getAttribute("innerText"));
		assertEquals(data.AssessmentTableData.AdviserenZelfstandigheidSleutelwoordInitiatief, AssessmentScreenModules
				.analyserenZelfstandigheidSleutelwoordInitiatief(driver).getAttribute("innerText"));
		assertEquals(data.AssessmentTableData.AdviserenZelfstandigheidSleutelwoordKeuzesMaken, AssessmentScreenModules
				.analyserenZelfstandigheidSleutelwoordKeuzesMaken(driver).getAttribute("innerText"));
		System.out.println("Adviseren-> Zelfstandigheid: Sleutelwoorden aanwezig en correct");

		// Page: Adviseren -> Zelfstandigheid. check excellent 9+
		assertEquals(data.AssessmentTableData.AdviserenZelfstandigheidSleutelwoordAanpakExcellent,
				AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordAanpakExcellent(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordAanpakExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordAanpakExcellent(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.AdviserenZelfstandigheidSleutelwoordInitiatiefExcellent,
				AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordInitiatiefExcellent(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordInitiatiefExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordInitiatiefExcellent(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.AdviserenZelfstandigheidSleutelwoordKeuzesMakenExcellent,
				AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordKeuzesMakenExcellent(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordKeuzesMakenExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordKeuzesMakenExcellent(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		System.out.println("Analyseren -> Zelfstandigheid: beoordelingen onder Excellent(9+) aanwezig en correct");

		// Page: Adviseren -> Zelfstandigheid. check Goed 8
		assertEquals(data.AssessmentTableData.AdviserenZelfstandigheidSleutelwoordAanpakGoed, AssessmentScreenModules
				.adviserenZelfstandigheidSleutelwoordAanpakGoed(driver).getAttribute("innerText"));
		AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordAanpakGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordAanpakGoed(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.AdviserenZelfstandigheidSleutelwoordInitiatiefGoed,
				AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordInitiatiefGoed(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordInitiatiefGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordInitiatiefGoed(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.AdviserenZelfstandigheidSleutelwoordKeuzesMakenGoed,
				AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordKeuzesMakenGoed(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordKeuzesMakenGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordKeuzesMakenGoed(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		System.out.println("Adviseren -> Zelfstandigheid: beoordelingen onder Goed(8) aanwezig en correct");

		// Page: Adviseren -> Zelfstandigheid. check Voldoende 6
		assertEquals(data.AssessmentTableData.AdviserenZelfstandigheidSleutelwoordAanpakVoldoende,
				AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordAanpakVoldoende(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordAanpakVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordAanpakVoldoende(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.AdviserenZelfstandigheidSleutelwoordInitiatiefVoldoende,
				AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordInitiatiefVoldoende(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordInitiatiefVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordInitiatiefVoldoende(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.AdviserenZelfstandigheidSleutelwoordKeuzesMakenVoldoende,
				AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordKeuzesMakenVoldoende(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordKeuzesMakenVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordKeuzesMakenVoldoende(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		System.out.println("Adviseren -> Zelfstandigheid: beoordelingen onder Voldoende (6) aanwezig en correct");

		// Page: Adviseren -> Zelfstandigheid. check Niet Voldaan 4-
		assertEquals(data.AssessmentTableData.AdviserenZelfstandigheidSleutelwoordAanpakNietVoldaan,
				AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordAanpakNietVoldaan(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordAanpakNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordAanpakNietVoldaan(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassNegative);

		assertEquals(data.AssessmentTableData.AdviserenZelfstandigheidSleutelwoordInitiatiefNietVoldaan,
				AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordInitiatiefNietVoldaan(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordInitiatiefNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordInitiatiefNietVoldaan(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassNegative);

		assertEquals(data.AssessmentTableData.AdviserenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan,
				AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.adviserenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassNegative);

		System.out.println("Adviseren -> Zelfstandigheid: beoordelingen onder Niet Voldaan (4-) aanwezig en correct");

		// Check pageNumber and click next to open page: Gedrag, then check pageNumber
		// again
		assertEquals("3", AssessmentScreenModules.pageNumber(driver).getAttribute("innerText"));
		DefaultModules.waitForLoad(1000);
		AssessmentScreenModules.beherenZelfstandigheidButtonVolgende(driver).click();
		assertEquals("3", AssessmentScreenModules.pageNumber(driver).getAttribute("innerText"));
		DefaultModules.waitForLoad(300);

		// Page: Adviseren -> Gedrag. check sleutelwoorden
		assertEquals(data.AssessmentTableData.AdviserenGedragSleutelwoordEffectiviteit,
				AssessmentScreenModules.analyserenGedragSleutelwoordEffectiviteit(driver).getAttribute("innerText"));
		assertEquals(data.AssessmentTableData.AdviserenGedragSleutelwoordZelfkritisch,
				AssessmentScreenModules.analyserenGedragSleutelwoordZelfkritisch(driver).getAttribute("innerText"));
		System.out.println("Adviseren -> Gedrag: sleutelwoorden aanwezig en correct");

		// Page: Adviseren -> Gedrag. check excellent 9+
		assertEquals(AssessmentTableData.AdviserenGedragSleutelwoordEffectiviteitExcellent, AssessmentScreenModules
				.adviserenGedragSleutelwoordEffectiviteitExcellent(driver).getAttribute("innerText"));
		AssessmentScreenModules.adviserenGedragSleutelwoordEffectiviteitExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.adviserenGedragSleutelwoordEffectiviteitExcellent(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		assertEquals(AssessmentTableData.AdviserenGedragSleutelwoordZelfkritischExcellent, AssessmentScreenModules
				.adviserenGedragSleutelwoordZelfkritischExcellent(driver).getAttribute("innerText"));
		AssessmentScreenModules.adviserenGedragSleutelwoordZelfkritischExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.adviserenGedragSleutelwoordZelfkritischExcellent(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		// Page: Adviseren -> Gedrag. check Goed 8
		assertEquals(AssessmentTableData.AdviserenGedragSleutelwoordEffectiviteitGoed,
				AssessmentScreenModules.adviserenGedragSleutelwoordEffectiviteitGoed(driver).getAttribute("innerText"));
		AssessmentScreenModules.adviserenGedragSleutelwoordEffectiviteitGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.adviserenGedragSleutelwoordEffectiviteitGoed(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		assertEquals(AssessmentTableData.AdviserenGedragSleutelwoordZelfkritischGoed,
				AssessmentScreenModules.adviserenGedragSleutelwoordZelfkritischGoed(driver).getAttribute("innerText"));
		AssessmentScreenModules.adviserenGedragSleutelwoordZelfkritischGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.adviserenGedragSleutelwoordZelfkritischGoed(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		// Page: Adviseren -> Gedrag. check Voldoende 6
		assertEquals(AssessmentTableData.AdviserenGedragSleutelwoordEffectiviteitVoldoende, AssessmentScreenModules
				.adviserenGedragSleutelwoordEffectiviteitVoldoende(driver).getAttribute("innerText"));
		AssessmentScreenModules.adviserenGedragSleutelwoordEffectiviteitVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.adviserenGedragSleutelwoordEffectiviteitVoldoende(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		assertEquals(AssessmentTableData.AdviserenGedragSleutelwoordZelfkritischVoldoende, AssessmentScreenModules
				.adviserenGedragSleutelwoordZelfkritischVoldoende(driver).getAttribute("innerText"));
		AssessmentScreenModules.adviserenGedragSleutelwoordZelfkritischVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.adviserenGedragSleutelwoordZelfkritischVoldoende(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		// Page: Adviseren -> Gedrag. check Voldoende 6
		assertEquals(AssessmentTableData.AdviserenGedragSleutelwoordEffectiviteitNietVoldaan, AssessmentScreenModules
				.adviserenGedragSleutelwoordEffectiviteitNietVoldaan(driver).getAttribute("innerText"));
		AssessmentScreenModules.adviserenGedragSleutelwoordEffectiviteitNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.adviserenGedragSleutelwoordEffectiviteitNietVoldaan(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassNegative);

		assertEquals(AssessmentTableData.AdviserenGedragSleutelwoordZelfkritischNietVoldaan, AssessmentScreenModules
				.adviserenGedragSleutelwoordZelfkritischNietVoldaan(driver).getAttribute("innerText"));
		AssessmentScreenModules.adviserenGedragSleutelwoordZelfkritischNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.adviserenGedragSleutelwoordZelfkritischNietVoldaan(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassNegative);

		// Check pageNumbert and click next to open page: Analyseren -> Zelfstandigheid,
		// then check pageNumber again
		assertEquals("3", AssessmentScreenModules.pageNumber(driver).getAttribute("innerText"));
		DefaultModules.waitForLoad(1000);
		AssessmentScreenModules.beherenZelfstandigheidButtonVolgende(driver).click();
		assertEquals("4", AssessmentScreenModules.pageNumber(driver).getAttribute("innerText"));
		DefaultModules.waitForLoad(300);

		// Page: Ontwerpen -> Zelfstandigheid. check keywords
		assertEquals(data.AssessmentTableData.OntwerpenZelfstandigheidSleutelwoordAanpak,
				AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordAanpak(driver).getAttribute("innerText"));
		assertEquals(data.AssessmentTableData.OntwerpenZelfstandigheidSleutelwoordInitiatief, AssessmentScreenModules
				.ontwerpenZelfstandigheidSleutelwoordInitiatief(driver).getAttribute("innerText"));
		assertEquals(data.AssessmentTableData.OntwerpenZelfstandigheidSleutelwoordKeuzesMaken, AssessmentScreenModules
				.ontwerpenZelfstandigheidSleutelwoordKeuzesMaken(driver).getAttribute("innerText"));
		System.out.println("Ontwerpen-> Zelfstandigheid: Sleutelwoorden aanwezig en correct");

		// Page: Ontwerpen -> Zelfstandigheid. check excellent 9+
		assertEquals(data.AssessmentTableData.OntwerpenZelfstandigheidSleutelwoordAanpakExcellent,
				AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordAanpakExcellent(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordAanpakExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordAanpakExcellent(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.OntwerpenZelfstandigheidSleutelwoordInitiatiefExcellent,
				AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordInitiatiefExcellent(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordInitiatiefExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordInitiatiefExcellent(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.OntwerpenZelfstandigheidSleutelwoordKeuzesMakenExcellent,
				AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordKeuzesMakenExcellent(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordKeuzesMakenExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordKeuzesMakenExcellent(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		System.out.println("Ontwerpen -> Zelfstandigheid: beoordelingen onder Excellent(9+) aanwezig en correct");

		// Page: Ontwerpen -> Zelfstandigheid. check Goed 8
		assertEquals(data.AssessmentTableData.OntwerpenZelfstandigheidSleutelwoordAanpakGoed, AssessmentScreenModules
				.ontwerpenZelfstandigheidSleutelwoordAanpakGoed(driver).getAttribute("innerText"));
		AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordAanpakGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordAanpakGoed(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.OntwerpenZelfstandigheidSleutelwoordInitiatiefGoed,
				AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordInitiatiefGoed(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordInitiatiefGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordInitiatiefGoed(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.OntwerpenZelfstandigheidSleutelwoordKeuzesMakenGoed,
				AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordKeuzesMakenGoed(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordKeuzesMakenGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordKeuzesMakenGoed(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		System.out.println("Ontwerpen -> Zelfstandigheid: beoordelingen onder Goed(8) aanwezig en correct");

		// Page: Ontwerpen -> Zelfstandigheid. check Voldoende 6
		assertEquals(data.AssessmentTableData.OntwerpenZelfstandigheidSleutelwoordAanpakVoldoende,
				AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordAanpakVoldoende(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordAanpakVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordAanpakVoldoende(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.OntwerpenZelfstandigheidSleutelwoordInitiatiefVoldoende,
				AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordInitiatiefVoldoende(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordInitiatiefVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordInitiatiefVoldoende(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.OntwerpenZelfstandigheidSleutelwoordKeuzesMakenVoldoende,
				AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordKeuzesMakenVoldoende(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordKeuzesMakenVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordKeuzesMakenVoldoende(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		System.out.println("Ontwerpen -> Zelfstandigheid: beoordelingen onder Voldoende (6) aanwezig en correct");

		// Page: Ontwerpen -> Zelfstandigheid. check Niet Voldaan 4-
		assertEquals(data.AssessmentTableData.OntwerpenZelfstandigheidSleutelwoordAanpakNietVoldaan,
				AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordAanpakNietVoldaan(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordAanpakNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordAanpakNietVoldaan(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassNegative);

		assertEquals(data.AssessmentTableData.OntwerpenZelfstandigheidSleutelwoordInitiatiefNietVoldaan,
				AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordInitiatiefNietVoldaan(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordInitiatiefNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordInitiatiefNietVoldaan(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassNegative);

		assertEquals(data.AssessmentTableData.OntwerpenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan,
				AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.ontwerpenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassNegative);

		System.out.println("Ontwerpen -> Zelfstandigheid: beoordelingen onder Niet Voldaan (4-) aanwezig en correct");

		// Check pageNumber and click next to open page: Gedrag, then check pageNumber
		// again
		assertEquals("4", AssessmentScreenModules.pageNumber(driver).getAttribute("innerText"));
		DefaultModules.waitForLoad(1000);
		AssessmentScreenModules.beherenZelfstandigheidButtonVolgende(driver).click();
		assertEquals("4", AssessmentScreenModules.pageNumber(driver).getAttribute("innerText"));
		DefaultModules.waitForLoad(300);

		// Page: Ontwerpen -> Gedrag. check sleutelwoorden
		assertEquals(data.AssessmentTableData.OntwerpenGedragSleutelwoordEffectiviteit,
				AssessmentScreenModules.ontwerpenGedragSleutelwoordEffectiviteit(driver).getAttribute("innerText"));
		assertEquals(data.AssessmentTableData.OntwerpenGedragSleutelwoordZelfkritisch,
				AssessmentScreenModules.ontwerpenGedragSleutelwoordZelfkritisch(driver).getAttribute("innerText"));
		System.out.println("Ontwerpen -> Gedrag: sleutelwoorden aanwezig en correct");

		// Page: Ontwerpen -> Gedrag. check excellent 9+
		assertEquals(AssessmentTableData.OntwerpenGedragSleutelwoordEffectiviteitExcellent, AssessmentScreenModules
				.ontwerpenGedragSleutelwoordEffectiviteitExcellent(driver).getAttribute("innerText"));
		AssessmentScreenModules.ontwerpenGedragSleutelwoordEffectiviteitExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.ontwerpenGedragSleutelwoordEffectiviteitExcellent(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		assertEquals(AssessmentTableData.OntwerpenGedragSleutelwoordZelfkritischExcellent, AssessmentScreenModules
				.ontwerpenGedragSleutelwoordZelfkritischExcellent(driver).getAttribute("innerText"));
		AssessmentScreenModules.ontwerpenGedragSleutelwoordZelfkritischExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.ontwerpenGedragSleutelwoordZelfkritischExcellent(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		// Page: Ontwerpen -> Gedrag. check Goed 8
		assertEquals(AssessmentTableData.OntwerpenGedragSleutelwoordEffectiviteitGoed,
				AssessmentScreenModules.ontwerpenGedragSleutelwoordEffectiviteitGoed(driver).getAttribute("innerText"));
		AssessmentScreenModules.ontwerpenGedragSleutelwoordEffectiviteitGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.ontwerpenGedragSleutelwoordEffectiviteitGoed(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		assertEquals(AssessmentTableData.OntwerpenGedragSleutelwoordZelfkritischGoed,
				AssessmentScreenModules.ontwerpenGedragSleutelwoordZelfkritischGoed(driver).getAttribute("innerText"));
		AssessmentScreenModules.ontwerpenGedragSleutelwoordZelfkritischGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.ontwerpenGedragSleutelwoordZelfkritischGoed(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		// Page: Ontwerpen-> Gedrag. check Voldoende 6
		assertEquals(AssessmentTableData.OntwerpenGedragSleutelwoordEffectiviteitVoldoende, AssessmentScreenModules
				.ontwerpenGedragSleutelwoordEffectiviteitVoldoende(driver).getAttribute("innerText"));
		AssessmentScreenModules.ontwerpenGedragSleutelwoordEffectiviteitVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.ontwerpenGedragSleutelwoordEffectiviteitVoldoende(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		assertEquals(AssessmentTableData.OntwerpenGedragSleutelwoordZelfkritischVoldoende, AssessmentScreenModules
				.ontwerpenGedragSleutelwoordZelfkritischVoldoende(driver).getAttribute("innerText"));
		AssessmentScreenModules.ontwerpenGedragSleutelwoordZelfkritischVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.ontwerpenGedragSleutelwoordZelfkritischVoldoende(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		// Page: Ontwerpen -> Gedrag. check Voldoende 6
		assertEquals(AssessmentTableData.OntwerpenGedragSleutelwoordEffectiviteitNietVoldaan, AssessmentScreenModules
				.ontwerpenGedragSleutelwoordEffectiviteitNietVoldaan(driver).getAttribute("innerText"));
		AssessmentScreenModules.ontwerpenGedragSleutelwoordEffectiviteitNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.ontwerpenGedragSleutelwoordEffectiviteitNietVoldaan(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassNegative);

		assertEquals(AssessmentTableData.OntwerpenGedragSleutelwoordZelfkritischNietVoldaan, AssessmentScreenModules
				.ontwerpenGedragSleutelwoordZelfkritischNietVoldaan(driver).getAttribute("innerText"));
		AssessmentScreenModules.ontwerpenGedragSleutelwoordZelfkritischNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.ontwerpenGedragSleutelwoordZelfkritischNietVoldaan(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassNegative);

		// Check pageNumbert and click next to open page: Analyseren -> Zelfstandigheid,
		// then check pageNumber again
		assertEquals("4", AssessmentScreenModules.pageNumber(driver).getAttribute("innerText"));
		DefaultModules.waitForLoad(1000);
		AssessmentScreenModules.beherenZelfstandigheidButtonVolgende(driver).click();
		assertEquals("5", AssessmentScreenModules.pageNumber(driver).getAttribute("innerText"));
		DefaultModules.waitForLoad(300);

		// Page: Realiseren -> Zelfstandigheid. check keywords
		assertEquals(data.AssessmentTableData.RealiserenZelfstandigheidSleutelwoordAanpak,
				AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordAanpak(driver).getAttribute("innerText"));
		assertEquals(data.AssessmentTableData.RealiserenZelfstandigheidSleutelwoordInitiatief, AssessmentScreenModules
				.realiserenZelfstandigheidSleutelwoordInitiatief(driver).getAttribute("innerText"));
		assertEquals(data.AssessmentTableData.RealiserenZelfstandigheidSleutelwoordKeuzesMaken, AssessmentScreenModules
				.realiserenZelfstandigheidSleutelwoordKeuzesMaken(driver).getAttribute("innerText"));
		System.out.println("Realiseren-> Zelfstandigheid: Sleutelwoorden aanwezig en correct");

		// Page: Realiseren -> Zelfstandigheid. check excellent 9+
		assertEquals(data.AssessmentTableData.RealiserenZelfstandigheidSleutelwoordAanpakExcellent,
				AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordAanpakExcellent(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordAanpakExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordAanpakExcellent(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.RealiserenZelfstandigheidSleutelwoordInitiatiefExcellent,
				AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordInitiatiefExcellent(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordInitiatiefExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordInitiatiefExcellent(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.RealiserenZelfstandigheidSleutelwoordKeuzesMakenExcellent,
				AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordKeuzesMakenExcellent(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordKeuzesMakenExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordKeuzesMakenExcellent(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		System.out.println("Realiseren -> Zelfstandigheid: beoordelingen onder Excellent(9+) aanwezig en correct");

		// Page: Realiseren -> Zelfstandigheid. check Goed 8
		assertEquals(data.AssessmentTableData.RealiserenZelfstandigheidSleutelwoordAanpakGoed, AssessmentScreenModules
				.realiserenZelfstandigheidSleutelwoordAanpakGoed(driver).getAttribute("innerText"));
		AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordAanpakGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordAanpakGoed(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.RealiserenZelfstandigheidSleutelwoordInitiatiefGoed,
				AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordInitiatiefGoed(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordInitiatiefGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordInitiatiefGoed(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.RealiserenZelfstandigheidSleutelwoordKeuzesMakenGoed,
				AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordKeuzesMakenGoed(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordKeuzesMakenGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordKeuzesMakenGoed(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		System.out.println("Realiseren -> Zelfstandigheid: beoordelingen onder Goed(8) aanwezig en correct");

		// Page: Realiseren -> Zelfstandigheid. check Voldoende 6
		assertEquals(data.AssessmentTableData.RealiserenZelfstandigheidSleutelwoordAanpakVoldoende,
				AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordAanpakVoldoende(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordAanpakVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordAanpakVoldoende(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.RealiserenZelfstandigheidSleutelwoordInitiatiefVoldoende,
				AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordInitiatiefVoldoende(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordInitiatiefVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordInitiatiefVoldoende(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(data.AssessmentTableData.RealiserenZelfstandigheidSleutelwoordKeuzesMakenVoldoende,
				AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordKeuzesMakenVoldoende(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordKeuzesMakenVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordKeuzesMakenVoldoende(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		System.out.println("Realiseren -> Zelfstandigheid: beoordelingen onder Voldoende (6) aanwezig en correct");

		// Page: Realiseren -> Zelfstandigheid. check Niet Voldaan 4-
		assertEquals(data.AssessmentTableData.RealiserenZelfstandigheidSleutelwoordAanpakNietVoldaan,
				AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordAanpakNietVoldaan(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordAanpakNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordAanpakNietVoldaan(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassNegative);

		assertEquals(data.AssessmentTableData.RealiserenZelfstandigheidSleutelwoordInitiatiefNietVoldaan,
				AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordInitiatiefNietVoldaan(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordInitiatiefNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordInitiatiefNietVoldaan(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassNegative);

		assertEquals(data.AssessmentTableData.RealiserenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan,
				AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan(driver)
						.getAttribute("innerText"));
		AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.realiserenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassNegative);

		System.out.println("Realiseren -> Zelfstandigheid: beoordelingen onder Niet Voldaan (4-) aanwezig en correct");

		// Check pageNumber and click next to open page: Gedrag, then check pageNumber
		// again
		assertEquals("5", AssessmentScreenModules.pageNumber(driver).getAttribute("innerText"));
		DefaultModules.waitForLoad(1000);
		AssessmentScreenModules.beherenZelfstandigheidButtonVolgende(driver).click();
		assertEquals("5", AssessmentScreenModules.pageNumber(driver).getAttribute("innerText"));
		DefaultModules.waitForLoad(300);

		// Page: Realiseren -> Gedrag. check sleutelwoorden
		assertEquals(data.AssessmentTableData.RealiserenGedragSleutelwoordEffectiviteit,
				AssessmentScreenModules.realiserenGedragSleutelwoordEffectiviteit(driver).getAttribute("innerText"));
		assertEquals(data.AssessmentTableData.RealiserenGedragSleutelwoordZelfkritisch,
				AssessmentScreenModules.realiserenGedragSleutelwoordZelfkritisch(driver).getAttribute("innerText"));
		System.out.println("Realiseren -> Gedrag: sleutelwoorden aanwezig en correct");

		// Page: Realiseren -> Gedrag. check excellent 9+
		assertEquals(AssessmentTableData.RealiserenGedragSleutelwoordEffectiviteitExcellent, AssessmentScreenModules
				.realiserenGedragSleutelwoordEffectiviteitExcellent(driver).getAttribute("innerText"));
		AssessmentScreenModules.realiserenGedragSleutelwoordEffectiviteitExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.realiserenGedragSleutelwoordEffectiviteitExcellent(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(AssessmentTableData.RealiserenGedragSleutelwoordZelfkritischExcellent, AssessmentScreenModules
				.realiserenGedragSleutelwoordZelfkritischExcellent(driver).getAttribute("innerText"));
		AssessmentScreenModules.realiserenGedragSleutelwoordZelfkritischExcellent(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.realiserenGedragSleutelwoordZelfkritischExcellent(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		// Page: Realiseren -> Gedrag. check Goed 8
		assertEquals(AssessmentTableData.RealiserenGedragSleutelwoordEffectiviteitGoed, AssessmentScreenModules
				.realiserenGedragSleutelwoordEffectiviteitGoed(driver).getAttribute("innerText"));
		AssessmentScreenModules.realiserenGedragSleutelwoordEffectiviteitGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.realiserenGedragSleutelwoordEffectiviteitGoed(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		assertEquals(AssessmentTableData.RealiserenGedragSleutelwoordZelfkritischGoed,
				AssessmentScreenModules.realiserenGedragSleutelwoordZelfkritischGoed(driver).getAttribute("innerText"));
		AssessmentScreenModules.realiserenGedragSleutelwoordZelfkritischGoed(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.realiserenGedragSleutelwoordZelfkritischGoed(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		// Page: Realiseren-> Gedrag. check Voldoende 6
		assertEquals(AssessmentTableData.RealiserenGedragSleutelwoordEffectiviteitVoldoende, AssessmentScreenModules
				.realiserenGedragSleutelwoordEffectiviteitVoldoende(driver).getAttribute("innerText"));
		AssessmentScreenModules.realiserenGedragSleutelwoordEffectiviteitVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.realiserenGedragSleutelwoordEffectiviteitVoldoende(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassPositive);

		assertEquals(AssessmentTableData.RealiserenGedragSleutelwoordZelfkritischVoldoende, AssessmentScreenModules
				.realiserenGedragSleutelwoordZelfkritischVoldoende(driver).getAttribute("innerText"));
		AssessmentScreenModules.realiserenGedragSleutelwoordZelfkritischVoldoende(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(
				AssessmentScreenModules.realiserenGedragSleutelwoordZelfkritischVoldoende(driver).getAttribute("class"),
				AssessmentTableData.ActiveClassPositive);

		// Page: Realiseren -> Gedrag. check Voldoende 6
		assertEquals(AssessmentTableData.RealiserenGedragSleutelwoordEffectiviteitNietVoldaan, AssessmentScreenModules
				.realiserenGedragSleutelwoordEffectiviteitNietVoldaan(driver).getAttribute("innerText"));
		AssessmentScreenModules.realiserenGedragSleutelwoordEffectiviteitNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.realiserenGedragSleutelwoordEffectiviteitNietVoldaan(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassNegative);

		assertEquals(AssessmentTableData.RealiserenGedragSleutelwoordZelfkritischNietVoldaan, AssessmentScreenModules
				.realiserenGedragSleutelwoordZelfkritischNietVoldaan(driver).getAttribute("innerText"));
		AssessmentScreenModules.realiserenGedragSleutelwoordZelfkritischNietVoldaan(driver).click();
		DefaultModules.waitForLoad(300);
		assertEquals(AssessmentScreenModules.realiserenGedragSleutelwoordZelfkritischNietVoldaan(driver)
				.getAttribute("class"), AssessmentTableData.ActiveClassNegative);

		// Check pageNumbert and click next to open page: Analyseren -> Zelfstandigheid,
		// then check pageNumber again
		assertEquals("5", AssessmentScreenModules.pageNumber(driver).getAttribute("innerText"));

		// end testcase
		DefaultModules.endTestcase(driver);
	}

}
