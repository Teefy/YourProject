package codebase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageObjects.Mantisobjecten;
import pageObjects.Testlinkobjecten;

public class Aanmaken_Testproject_Testplan {

public String InloggenTestproject (String Omgeving, String Rol, String Browser) {
		
		LoginPortal PortalInloggen = new LoginPortal();
		WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		Testlinkobjecten.PijlRechts(driver).click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		Testlinkobjecten.OpenTestLink(driver).click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		// Voer Projectnaam in
		
		
		
		driver.findElement(By.xpath(".//*[@id='item_view']/tbody/tr[2]/td[2]/input")).sendKeys("Den");
		
		return null;
}
}