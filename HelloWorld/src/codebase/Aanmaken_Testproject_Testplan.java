package codebase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pageObjects.Testlinkobjecten;
import probeercode.GenerateData;
import pageObjects.navigeren;

public class Aanmaken_Testproject_Testplan {

public String InloggenTestproject (String Omgeving, String Rol, String Browser) {
		
		LoginPortal PortalInloggen = new LoginPortal();
		WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		navigeren.PijlRechts(driver).click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		Testlinkobjecten.OpenTestLink(driver).click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		// Voer Projectnaam in

		Testlinkobjecten.OpenTestSpecification(driver).click();
		
		driver.switchTo().frame("workframe");
		
		Testlinkobjecten.CreateTestSuite(driver).click();
			
		Testlinkobjecten.TestPlanNaam(driver).sendKeys(GenerateData.generateRandomAlphaNumeric(25) + Keys.TAB + GenerateData.generateRandomString(500));
		
		return null;
}
}