package tests;

// standard imports
import static org.junit.Assert.*;

import java.io.Console;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// module imports
import modules.AssessmentSelectionModules;

public class KenJeClient_Test {

	public static void test(WebDriver driver) {

//		// init wait
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//
//		//is page loaded?
//		AssessmentSelectionModules.assessmeHeader(driver).isDisplayed();
//		
//		//is assessment available?
//		AssessmentSelectionModules.assessmentCard(driver).click();
//		System.out.println("geselecteerde assessment:" + AssessmentSelectionModules.assessmentCard(driver).getText());
//		
//
//		
//
//		
		
//		// Find the elements and login
//		Login.getUsernameTxt(driver).sendKeys("Lars");
//		Login.getPasswordTxt(driver).sendKeys("Welkom01!");
//
//		// wait until startupCurtain is gone
//		//wait.until(ExpectedConditions.invisibilityOf(Login.getCurtain(driver)));
//		Login.getLoginBtn(driver).click();
//
//		// Find the elements and pick a client
//		Menu.getClientMenu(driver).click();
//
//		// Select All clients
//		Menu.getAllClientsToggle(driver).click();
//
//		// Type the name
//		Menu.getClientSearchField(driver).sendKeys("CodeTester");
//
//		// Wait until only one item remains (query is done)
//		wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector( Menu.getClientSearchElements()), 1));
//
//		// Select first client in list
//		Menu.getClient(driver).click();
//
//		// Select KenJeClient
//		wait.until(ExpectedConditions.visibilityOf(Header.getClientLink(driver)));
//		Header.getClientLink(driver).click();
//
//		// Check KenJeClient
//		assertEquals("favorite Geen reanimeerbeleid bekend!", KenJeClient.getReanimeerBeleid(driver).getText());
//		assertNotEquals("-", KenJeClient.getOpstaanLabel(driver).getText());
//		assertNotEquals("-", KenJeClient.getSlapenGaanLabel(driver).getText());
//		assertNotEquals("Er is nog geen informatie ingevuld", KenJeClient.getOverMij(driver).getText());
//
//		// Close KenJeClient
//		KenJeClient.getSluitenBtn(driver).click();

	}

}
