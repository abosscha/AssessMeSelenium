package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AssessmentScreenModules {

	public static WebElement homeButton(WebDriver driver){
		return driver.findElement(By.cssSelector("#buttonHome"));
	}
	
	public static WebElement selectedAssessmentStudent(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div/div"));
	}
	
//Beheren -> Zelfstandigheid -> Sleutelwoorden
	public static WebElement beherenZelfstandigheidSleutelwoordAanpak(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[1]"));
	}
	
	public static WebElement beherenZelfstandigheidSleutelwoordInitiatief(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[1]"));
	}
	
	public static WebElement beherenZelfstandigheidSleutelwoordKeuzesMaken(WebDriver driver){
		return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[1]"));
	}
	
	
	//Beheren -> Zelfstandigheid -> Excellent (9+)
		public static WebElement beherenZelfstandigheidSleutelwoordAanpakExcellent(WebDriver driver){
			return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[2]"));
		}
		
		public static WebElement beherenZelfstandigheidSleutelwoordInitiatiefExcellent(WebDriver driver){
			return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[2]"));
		}
		
		public static WebElement beherenZelfstandigheidSleutelwoordKeuzesMakenExcellent(WebDriver driver){
			return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[2]"));
		}
		
		
		//Beheren -> Zelfstandigheid -> Goed (8)
		public static WebElement beherenZelfstandigheidSleutelwoordAanpakGoed(WebDriver driver){
			return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[3]"));
		}
		
		public static WebElement beherenZelfstandigheidSleutelwoordInitiatiefGoed(WebDriver driver){
			return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[3]"));
		}
		
		public static WebElement beherenZelfstandigheidSleutelwoordKeuzesMakenGoed(WebDriver driver){
			return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[3]"));
		}
		
		//Beheren -> Zelfstandigheid -> Voldoende (6)
		public static WebElement beherenZelfstandigheidSleutelwoordAanpakVoldoende(WebDriver driver){
			return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[4]"));
		}
		
		public static WebElement beherenZelfstandigheidSleutelwoordInitiatiefVoldoende(WebDriver driver){
			return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[4]"));
		}
		
		public static WebElement beherenZelfstandigheidSleutelwoordKeuzesMakenVoldoende(WebDriver driver){
			return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[4]"));
		}
		
		//Beheren -> Zelfstandigheid -> Niet voldaann (4-)
		public static WebElement beherenZelfstandigheidSleutelwoordAanpakNietVoldaan(WebDriver driver){
			return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[2]/td[5]"));
		}
		
		public static WebElement beherenZelfstandigheidSleutelwoordInitiatiefNietVoldaan(WebDriver driver){
			return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[3]/td[5]"));
		}
		
		public static WebElement beherenZelfstandigheidSleutelwoordKeuzesMakenNietVoldaan(WebDriver driver){
			return driver.findElement(By.xpath("//*[@id=\"Zelfstandigheid\"]/table/tbody/tr[4]/td[5]"));
		}
		
		//PageNumber
		public static WebElement pageNumber(WebDriver driver){
			return driver.findElement(By.cssSelector("#pageNumber"));
		}
		
		//Button: Volgende
		public static WebElement beherenZelfstandigheidButtonVolgende(WebDriver driver){
			return driver.findElement(By.xpath("//*[@id=\"buttonVolgende\"]"));
		}

		//Tabbar
		public static WebElement tabbarZelfstandigheid(WebDriver driver){
			return driver.findElement(By.cssSelector("#Zelfstandigheid-tablink"));
		}
		
		public static WebElement tabbarGedrag(WebDriver driver){
			return driver.findElement(By.cssSelector("#Gedrag-tablink"));
		}
		
		//Beheren -> Gedrag -> Sleutelwoorden
		public static WebElement beherenGedragSleutelwoordEffectiviteit(WebDriver driver){
			return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[2]/td[1]"));
		}
		
		public static WebElement beherenGedragSleutelwoordZelfkritisch(WebDriver driver){
			return driver.findElement(By.xpath("//*[@id=\"Gedrag\"]/table/tbody/tr[3]/td[1]"));
		}



}
