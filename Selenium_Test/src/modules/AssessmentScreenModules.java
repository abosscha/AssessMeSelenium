package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssessmentScreenModules {

// PageNumber
	public static WebElement pageNumber(WebDriver driver) {
		return driver.findElement(By.cssSelector("#pageNumber"));
	}

// Button: Volgende
	public static WebElement beherenZelfstandigheidButtonVolgende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"buttonVolgende\"]"));
	}

// Tabbar
	public static WebElement tabbarZelfstandigheid(WebDriver driver) {
		return driver.findElement(By.cssSelector("#Zelfstandigheid-tablink"));
	}

	public static WebElement tabbarGedrag(WebDriver driver) {
		return driver.findElement(By.cssSelector("#Gedrag-tablink"));
	}

	public static WebElement selectedAssessmentStudent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div/div"));
	}

//Beheren -> Zelfstandigheid -> Sleutelwoorden
	public static WebElement beherenZelfstandigheidSleutelwoordAanpak(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[1]"));
	}

	public static WebElement beherenZelfstandigheidSleutelwoordInitiatief(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[1]"));
	}

	public static WebElement beherenZelfstandigheidSleutelwoordKeuzesMaken(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[1]"));
	}

// Beheren -> Zelfstandigheid -> Excellent (9+)
	public static WebElement beherenZelfstandigheidSleutelwoordAanpakExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[2]"));
	}

	public static WebElement beherenZelfstandigheidSleutelwoordInitiatiefExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[2]"));
	}

	public static WebElement beherenZelfstandigheidSleutelwoordKeuzesMakenExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[2]"));
	}

// Beheren -> Zelfstandigheid -> Goed (8)
	public static WebElement beherenZelfstandigheidSleutelwoordAanpakGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[3]"));
	}

	public static WebElement beherenZelfstandigheidSleutelwoordInitiatiefGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[3]"));
	}

	public static WebElement beherenZelfstandigheidSleutelwoordKeuzesMakenGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[3]"));
	}

// Beheren -> Zelfstandigheid -> Voldoende (6)
	public static WebElement beherenZelfstandigheidSleutelwoordAanpakVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[4]"));
	}

	public static WebElement beherenZelfstandigheidSleutelwoordInitiatiefVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[4]"));
	}

	public static WebElement beherenZelfstandigheidSleutelwoordKeuzesMakenVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[4]"));
	}

// Beheren -> Zelfstandigheid -> Niet voldaann (4-)
	public static WebElement beherenZelfstandigheidSleutelwoordAanpakNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[5]"));
	}

	public static WebElement beherenZelfstandigheidSleutelwoordInitiatiefNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[5]"));
	}

	public static WebElement beherenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[5]"));
	}

// Beheren -> Gedrag -> Sleutelwoorden
	public static WebElement beherenGedragSleutelwoordEffectiviteit(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[1]"));
	}

	public static WebElement beherenGedragSleutelwoordZelfkritisch(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[1]"));
	}

// Beheren -> Gedrag -> Excellent 9+
	public static WebElement beherenGedragSleutelwoordEffectiviteitExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[2]"));
	}

	public static WebElement beherenGedragSleutelwoordZelfkritischExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[2]"));
	}

// Beheren -> Gedrag -> Goed 8
	public static WebElement beherenGedragSleutelwoordEffectiviteitGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[3]"));
	}

	public static WebElement beherenGedragSleutelwoordZelfkritischGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[3]"));
	}

// Beheren -> Gedrag -> Voldoende 6
	public static WebElement beherenGedragSleutelwoordEffectiviteitVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[4]"));
	}

	public static WebElement beherenGedragSleutelwoordZelfkritischVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[4]"));
	}

// Beheren -> Gedrag -> Niet Voldaan 4-
	public static WebElement beherenGedragSleutelwoordEffectiviteitNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[5]"));
	}

	public static WebElement beherenGedragSleutelwoordZelfkritischNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[5]"));
	}

// Analyseren -> Zelfstandigheid -> Sleutelwoorden
	public static WebElement analyserenZelfstandigheidSleutelwoordAanpak(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[1]"));
	}

	public static WebElement analyserenZelfstandigheidSleutelwoordInitiatief(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[1]"));
	}

	public static WebElement analyserenZelfstandigheidSleutelwoordKeuzesMaken(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[1]"));
	}

// Analyseren -> Zelfstandigheid -> Excellent (9+)
	public static WebElement analyserenZelfstandigheidSleutelwoordAanpakExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[2]"));
	}

	public static WebElement analyserenZelfstandigheidSleutelwoordInitiatiefExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[2]"));
	}

	public static WebElement analyserenZelfstandigheidSleutelwoordKeuzesMakenExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[2]"));
	}

// Analyseren -> Zelfstandigheid -> Goed (8)
	public static WebElement analyserenZelfstandigheidSleutelwoordAanpakGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[3]"));
	}

	public static WebElement analyserenZelfstandigheidSleutelwoordInitiatiefGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[3]"));
	}

	public static WebElement analyserenZelfstandigheidSleutelwoordKeuzesMakenGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[3]"));
	}

// Analyseren -> Zelfstandigheid -> Voldoende (6)
	public static WebElement analyserenZelfstandigheidSleutelwoordAanpakVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[4]"));
	}

	public static WebElement analyserenZelfstandigheidSleutelwoordInitiatiefVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[4]"));
	}

	public static WebElement analyserenZelfstandigheidSleutelwoordKeuzesMakenVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[4]"));
	}

// Analyseren -> Zelfstandigheid -> Niet voldaann (4-)
	public static WebElement analyserenZelfstandigheidSleutelwoordAanpakNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[5]"));
	}

	public static WebElement analyserenZelfstandigheidSleutelwoordInitiatiefNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[5]"));
	}

	public static WebElement analyserenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[5]"));
	}

// Analyseren -> Gedrag -> Sleutelwoorden
	public static WebElement analyserenGedragSleutelwoordEffectiviteit(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[1]"));
	}

	public static WebElement analyserenGedragSleutelwoordZelfkritisch(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[1]"));
	}

// Analyseren -> Gedrag -> Excellent 9+
	public static WebElement analyserenGedragSleutelwoordEffectiviteitExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[2]"));
	}

	public static WebElement analyserenGedragSleutelwoordZelfkritischExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[2]"));
	}

// Analyseren -> Gedrag -> Goed 8
	public static WebElement analyserenGedragSleutelwoordEffectiviteitGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[3]"));
	}

	public static WebElement analyserenGedragSleutelwoordZelfkritischGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[3]"));
	}

// Analyseren -> Gedrag -> Voldoende 6
	public static WebElement analyserenGedragSleutelwoordEffectiviteitVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[4]"));
	}

	public static WebElement analyserenGedragSleutelwoordZelfkritischVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[4]"));
	}

// Analyseren -> Gedrag -> Niet Voldaan 4-
	public static WebElement analyserenGedragSleutelwoordEffectiviteitNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[5]"));
	}

	public static WebElement analyserenGedragSleutelwoordZelfkritischNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[5]"));
	}

// Adviseren -> Zelfstandigheid -> Sleutelwoorden
	public static WebElement adviserenZelfstandigheidSleutelwoordAanpak(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[1]"));
	}

	public static WebElement adviserenZelfstandigheidSleutelwoordInitiatief(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[1]"));
	}

	public static WebElement adviserenZelfstandigheidSleutelwoordKeuzesMaken(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[1]"));
	}

// Adviseren -> Zelfstandigheid -> Excellent (9+)
	public static WebElement adviserenZelfstandigheidSleutelwoordAanpakExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[2]"));
	}

	public static WebElement adviserenZelfstandigheidSleutelwoordInitiatiefExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[2]"));
	}

	public static WebElement adviserenZelfstandigheidSleutelwoordKeuzesMakenExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[2]"));
	}

// Adviseren -> Zelfstandigheid -> Goed (8)
	public static WebElement adviserenZelfstandigheidSleutelwoordAanpakGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[3]"));
	}

	public static WebElement adviserenZelfstandigheidSleutelwoordInitiatiefGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[3]"));
	}

	public static WebElement adviserenZelfstandigheidSleutelwoordKeuzesMakenGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[3]"));
	}

// Adviseren -> Zelfstandigheid -> Voldoende (6)
	public static WebElement adviserenZelfstandigheidSleutelwoordAanpakVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[4]"));
	}

	public static WebElement adviserenZelfstandigheidSleutelwoordInitiatiefVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[4]"));
	}

	public static WebElement adviserenZelfstandigheidSleutelwoordKeuzesMakenVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[4]"));
	}

// Adviseren -> Zelfstandigheid -> Niet voldaann (4-)
	public static WebElement adviserenZelfstandigheidSleutelwoordAanpakNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[5]"));
	}

	public static WebElement adviserenZelfstandigheidSleutelwoordInitiatiefNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[5]"));
	}

	public static WebElement adviserenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[5]"));
	}

// Adviseren -> Gedrag -> Sleutelwoorden
	public static WebElement adviserenGedragSleutelwoordEffectiviteit(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[1]"));
	}

	public static WebElement adviserenGedragSleutelwoordZelfkritisch(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[1]"));
	}

// Adviseren -> Gedrag -> Excellent 9+
	public static WebElement adviserenGedragSleutelwoordEffectiviteitExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[2]"));
	}

	public static WebElement adviserenGedragSleutelwoordZelfkritischExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[2]"));
	}

// Adviseren -> Gedrag -> Goed 8
	public static WebElement adviserenGedragSleutelwoordEffectiviteitGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[3]"));
	}

	public static WebElement adviserenGedragSleutelwoordZelfkritischGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[3]"));
	}

// Adviseren -> Gedrag -> Voldoende 6
	public static WebElement adviserenGedragSleutelwoordEffectiviteitVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[4]"));
	}

	public static WebElement adviserenGedragSleutelwoordZelfkritischVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[4]"));
	}

// Adviseren -> Gedrag -> Niet Voldaan 4-
	public static WebElement adviserenGedragSleutelwoordEffectiviteitNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[5]"));
	}

	public static WebElement adviserenGedragSleutelwoordZelfkritischNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[5]"));
	}

// Ontwerpen -> Zelfstandigheid -> Sleutelwoorden
	public static WebElement ontwerpenZelfstandigheidSleutelwoordAanpak(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[1]"));
	}

	public static WebElement ontwerpenZelfstandigheidSleutelwoordInitiatief(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[1]"));
	}

	public static WebElement ontwerpenZelfstandigheidSleutelwoordKeuzesMaken(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[1]"));
	}

// Ontwerpen -> Zelfstandigheid -> Excellent (9+)
	public static WebElement ontwerpenZelfstandigheidSleutelwoordAanpakExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[2]"));
	}

	public static WebElement ontwerpenZelfstandigheidSleutelwoordInitiatiefExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[2]"));
	}

	public static WebElement ontwerpenZelfstandigheidSleutelwoordKeuzesMakenExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[2]"));
	}

// Ontwerpen -> Zelfstandigheid -> Goed (8)
	public static WebElement ontwerpenZelfstandigheidSleutelwoordAanpakGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[3]"));
	}

	public static WebElement ontwerpenZelfstandigheidSleutelwoordInitiatiefGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[3]"));
	}

	public static WebElement ontwerpenZelfstandigheidSleutelwoordKeuzesMakenGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[3]"));
	}

// Ontwerpen -> Zelfstandigheid -> Voldoende (6)
	public static WebElement ontwerpenZelfstandigheidSleutelwoordAanpakVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[4]"));
	}

	public static WebElement ontwerpenZelfstandigheidSleutelwoordInitiatiefVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[4]"));
	}

	public static WebElement ontwerpenZelfstandigheidSleutelwoordKeuzesMakenVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[4]"));
	}

// Ontwerpen -> Zelfstandigheid -> Niet voldaann (4-)
	public static WebElement ontwerpenZelfstandigheidSleutelwoordAanpakNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[5]"));
	}

	public static WebElement ontwerpenZelfstandigheidSleutelwoordInitiatiefNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[5]"));
	}

	public static WebElement ontwerpenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[5]"));
	}

// Ontwerpen -> Gedrag -> Sleutelwoorden
	public static WebElement ontwerpenGedragSleutelwoordEffectiviteit(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[1]"));
	}

	public static WebElement ontwerpenGedragSleutelwoordZelfkritisch(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[1]"));
	}

// Ontwerpen -> Gedrag -> Excellent 9+
	public static WebElement ontwerpenGedragSleutelwoordEffectiviteitExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[2]"));
	}

	public static WebElement ontwerpenGedragSleutelwoordZelfkritischExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[2]"));
	}

// Ontwerpen -> Gedrag -> Goed 8
	public static WebElement ontwerpenGedragSleutelwoordEffectiviteitGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[3]"));
	}

	public static WebElement ontwerpenGedragSleutelwoordZelfkritischGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[3]"));
	}

// Ontwerpen -> Gedrag -> Voldoende 6
	public static WebElement ontwerpenGedragSleutelwoordEffectiviteitVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[4]"));
	}

	public static WebElement ontwerpenGedragSleutelwoordZelfkritischVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[4]"));
	}

// Ontwerpen -> Gedrag -> Niet Voldaan 4-
	public static WebElement ontwerpenGedragSleutelwoordEffectiviteitNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[5]"));
	}

	public static WebElement ontwerpenGedragSleutelwoordZelfkritischNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[5]"));
	}

// Realiseren -> Zelfstandigheid -> Sleutelwoorden
	public static WebElement realiserenZelfstandigheidSleutelwoordAanpak(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[1]"));
	}

	public static WebElement realiserenZelfstandigheidSleutelwoordInitiatief(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[1]"));
	}

	public static WebElement realiserenZelfstandigheidSleutelwoordKeuzesMaken(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[1]"));
	}

// Realiseren -> Zelfstandigheid -> Excellent (9+)
	public static WebElement realiserenZelfstandigheidSleutelwoordAanpakExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[2]"));
	}

	public static WebElement realiserenZelfstandigheidSleutelwoordInitiatiefExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[2]"));
	}

	public static WebElement realiserenZelfstandigheidSleutelwoordKeuzesMakenExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[2]"));
	}

// Realiseren -> Zelfstandigheid -> Goed (8)
	public static WebElement realiserenZelfstandigheidSleutelwoordAanpakGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[3]"));
	}

	public static WebElement realiserenZelfstandigheidSleutelwoordInitiatiefGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[3]"));
	}

	public static WebElement realiserenZelfstandigheidSleutelwoordKeuzesMakenGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[3]"));
	}

// Realiseren -> Zelfstandigheid -> Voldoende (6)
	public static WebElement realiserenZelfstandigheidSleutelwoordAanpakVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[4]"));
	}

	public static WebElement realiserenZelfstandigheidSleutelwoordInitiatiefVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[4]"));
	}

	public static WebElement realiserenZelfstandigheidSleutelwoordKeuzesMakenVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[4]"));
	}

// Realiseren -> Zelfstandigheid -> Niet voldaann (4-)
	public static WebElement realiserenZelfstandigheidSleutelwoordAanpakNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[5]"));
	}

	public static WebElement realiserenZelfstandigheidSleutelwoordInitiatiefNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[5]"));
	}

	public static WebElement realiserenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[5]"));
	}

// Realiseren -> Gedrag -> Sleutelwoorden
	public static WebElement realiserenGedragSleutelwoordEffectiviteit(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[1]"));
	}

	public static WebElement realiserenGedragSleutelwoordZelfkritisch(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[1]"));
	}

// Realiseren -> Gedrag -> Excellent 9+
	public static WebElement realiserenGedragSleutelwoordEffectiviteitExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[2]"));
	}

	public static WebElement realiserenGedragSleutelwoordZelfkritischExcellent(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[2]"));
	}

// Realiseren -> Gedrag -> Goed 8
	public static WebElement realiserenGedragSleutelwoordEffectiviteitGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[3]"));
	}

	public static WebElement realiserenGedragSleutelwoordZelfkritischGoed(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[3]"));
	}

// Realiseren -> Gedrag -> Voldoende 6
	public static WebElement realiserenGedragSleutelwoordEffectiviteitVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[4]"));
	}

	public static WebElement realiserenGedragSleutelwoordZelfkritischVoldoende(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[4]"));
	}

// Realiseren -> Gedrag -> Niet Voldaan 4-
	public static WebElement realiserenGedragSleutelwoordEffectiviteitNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[5]"));
	}

	public static WebElement realiserenGedragSleutelwoordZelfkritischNietVoldaan(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[5]"));
	}

}
