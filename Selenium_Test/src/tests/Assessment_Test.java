package tests;

//standard imports
import static org.junit.Assert.*;

import java.io.Console;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//module imports
import modules.AssessmentSelectionModules;
import modules.AssessmentScreenModules;

public class Assessment_Test {

	public static void test(WebDriver driver) {

		// init wait
		WebDriverWait wait = new WebDriverWait(driver, 10);

		//is page loaded?
		AssessmentSelectionModules.assessmeHeader(driver).isDisplayed();
		
		//is assessment available and correct?
		AssessmentSelectionModules.assessmentCard(driver).click();
		assertEquals("Andy Bosscha", AssessmentSelectionModules.assessmentStudent(driver).getText());
		System.out.println("geselecteerde assessment:" + AssessmentSelectionModules.assessmentCard(driver).getText());
		
		//open assessment
		AssessmentSelectionModules.assessmeButton(driver).click();

		//is assessmentscreen loaded?
		assertEquals(true, AssessmentScreenModules.homeButton(driver).isDisplayed());
//		System.out.println(AssessmentScreenModules.selectedAssessmentStudent(driver).getText());
//		assertEquals("Student: Andy Bosscha (S1110703)", AssessmentScreenModules.selectedAssessmentStudent(driver).getText());
		
		//Page: Beheren -> Zelfstandigheid. check keywords
		assertEquals("Aanpak. gestructureerdheid, samenhang, flexibiliteit", AssessmentScreenModules.beherenZelfstandigheidSleutelwoordAanpak(driver).getAttribute("innerText"));
		assertEquals("Initiatief. grip, sturing, omgaan met risico’s", AssessmentScreenModules.beherenZelfstandigheidSleutelwoordInitiatief(driver).getAttribute("innerText"));
		assertEquals("Keuzes maken. bronnen, methoden, technieken", AssessmentScreenModules.beherenZelfstandigheidSleutelwoordKeuzesMaken(driver).getAttribute("innerText"));
		System.out.println("Beheren -> Zelfstandigheid: Sleutelwoorden aanwezig en correct");
		
		//Page: Beheren -> Zelfstandigheid. check excellent 9+
		assertEquals("Werkt volgens geplande stappen naar een mijlpaal, verwerkt nieuwe inzichten; blijft beheeraanpak valideren", AssessmentScreenModules.beherenZelfstandigheidSleutelwoordAanpakExcellent(driver).getAttribute("innerText"));
//		AssessmentScreenModules.beherenZelfstandigheidSleutelwoordAanpakExcellent(driver).isEnabled();
//		AssessmentScreenModules.beherenZelfstandigheidSleutelwoordAanpakExcellent(driver).click();
		assertEquals("Reageert en anticipeert uit zichzelf op knelpunten en meevallers en vangt onverwachte situaties op", AssessmentScreenModules.beherenZelfstandigheidSleutelwoordInitiatiefExcellent(driver).getAttribute("innerText"));
		assertEquals("Verzamelt alternatieven, onderzoekt de impact, maakt onderbouwde keuzes; blijft gekozen routes en kaders valideren", AssessmentScreenModules.beherenZelfstandigheidSleutelwoordKeuzesMakenExcellent(driver).getAttribute("innerText"));
		System.out.println("Beheren -> Zelfstandigheid: beoordelingen onder Excellent(9+) aanwezig en correct");
		
		//Page: Beheren -> Zelfstandigheid. check Goed 8
		assertEquals("Werkt volgens geplande stappen naar een mijlpaal en verwerkt nieuwe inzichten", AssessmentScreenModules.beherenZelfstandigheidSleutelwoordAanpakGoed(driver).getAttribute("innerText"));
		assertEquals("Reageert en anticipeert uit zichzelf op knelpunten en meevallers", AssessmentScreenModules.beherenZelfstandigheidSleutelwoordInitiatiefGoed(driver).getAttribute("innerText"));
		assertEquals("Verzamelt alternatieven, onderzoekt de impact en maakt goed onderbouwde keuzes", AssessmentScreenModules.beherenZelfstandigheidSleutelwoordKeuzesMakenGoed(driver).getAttribute("innerText"));
		System.out.println("Beheren -> Zelfstandigheid: beoordelingen onder Goed(8) aanwezig en correct");
		
		//Page: Beheren -> Zelfstandigheid. check Voldoende 6
		assertEquals("Werkt volgens geplande stappen naar een mijlpaal", AssessmentScreenModules.beherenZelfstandigheidSleutelwoordAanpakVoldoende(driver).getAttribute("innerText"));
		assertEquals("Reageert uit zichzelf op knelpunten en meevallers", AssessmentScreenModules.beherenZelfstandigheidSleutelwoordInitiatiefVoldoende(driver).getAttribute("innerText"));
		assertEquals("Verzamelt alternatieven, onderzoekt de impact en maakt keuzes", AssessmentScreenModules.beherenZelfstandigheidSleutelwoordKeuzesMakenVoldoende(driver).getAttribute("innerText"));
		System.out.println("Beheren -> Zelfstandigheid: beoordelingen onder Voldoende (6) aanwezig en correct");
		
		//Page: Beheren -> Zelfstandigheid. check Niet Voldaan 4-
		assertEquals("Ongestructureerde beheeraanpak leidt tot weinig grip en sturing", AssessmentScreenModules.beherenZelfstandigheidSleutelwoordAanpakNietVoldaan(driver).getAttribute("innerText"));
		assertEquals("Is uit zichzelf weinig geneigd eigen project en proces te beheren", AssessmentScreenModules.beherenZelfstandigheidSleutelwoordInitiatiefNietVoldaan(driver).getAttribute("innerText"));
		assertEquals("Toont weinig vaardigheid in het maken van geschikte keuzes", AssessmentScreenModules.beherenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan(driver).getAttribute("innerText"));
		System.out.println("Beheren -> Zelfstandigheid: beoordelingen onder Niet Voldaan (4-) aanwezig en correct");
		
		//Check pageNumbert and click next to open page: Gedrag, then check pageNumber again
		assertEquals("1", AssessmentScreenModules.pageNumber(driver).getAttribute("innerText"));
		AssessmentScreenModules.tabbarGedrag(driver).sendKeys(Keys.RETURN);
		assertEquals("2", AssessmentScreenModules.pageNumber(driver).getAttribute("innerText"));

		
		//Page: Beheren -> Gedrag. check sleutelwoorden
		assertEquals("Effectiviteit. mate van bijdrage aan de oplossing van de gegeven situatie", AssessmentScreenModules.beherenGedragSleutelwoordEffectiviteit(driver).getAttribute("innerText"));
		assertEquals("Zelfkritisch. professioneel functioneren", AssessmentScreenModules.beherenGedragSleutelwoordZelfkritisch(driver).getAttribute("innerText"));
		System.out.println("Beheren -> Gedrag: sleutelwoorden aanwezig en correct");

	}
	
}
