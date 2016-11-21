package codebase;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjects.Testlinkobjecten;
import probeercode.GenerateData;
import pageObjects.navigeren;

public class Aanmaken_Testproject_Testplan {

public Boolean InloggenTestproject (String Omgeving, String Rol, String Browser) throws InterruptedException {
		
		LoginPortal PortalInloggen = new LoginPortal();
		
		WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
		
		driver.manage().window().maximize(); 
		
		Thread.sleep(500);
		
		navigeren.PijlRechts(driver).click();
		
		Thread.sleep(500);
		
		Testlinkobjecten.OpenTestLink(driver).click();
		
		Thread.sleep(500);
		
		// Voer Projectnaam in

		Testlinkobjecten.OpenTestSpecification(driver).click();
		
		Thread.sleep(500);
		
		// uitklappen treeframe + selectie
		
		driver.switchTo().frame("treeframe");
		
		Testlinkobjecten.Kroesuway3000project(driver).click();
		Thread.sleep(2000);
		
		// Jezus christus :o 
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainframe");
		driver.switchTo().frame("workframe");
		
		// Druk op Create-button 
		
		Testlinkobjecten.CreateTCButton(driver).click();
		
		// Invullen velden TC
		
		Testlinkobjecten.TCNaam_beschrijving(driver).sendKeys("Test Kees" + 
		Keys.TAB + "Kroesuway 3000 bot: " + GenerateData.generateRandomString(250) + Keys.TAB + GenerateData.generateRandomString(150));
		
		// Selectie dropdowns

		new Select(pageObjects.Testlinkobjecten.DropDown_status(driver)).selectByVisibleText("Future");

		new Select(pageObjects.Testlinkobjecten.DropDown_importance(driver)).selectByVisibleText("High");

		new Select(pageObjects.Testlinkobjecten.DropDown_execution(driver)).selectByVisibleText("Automated");

		// Tijdsduur TC
		
		Testlinkobjecten.Duration_field(driver).sendKeys(GenerateData.generateRandomNumber(2));
		
		
		// Create of Cancel TC 
		
		Testlinkobjecten.CreateTCinTP(driver).click();
		// Testlinkobjecten.CancelTCinTP(driver).click();
		
		Thread.sleep(1000);
		
		// Boolean check of TC is aangemaakt
		
		String pageSource = driver.getPageSource();
		String TC = "Test Kees";	
		Boolean returnvalue = null;

		if ((pageSource).contains(TC))
		{ 
			System.out.println("✔ Test Case aangemaakt (en verwijderd)" );
			returnvalue = true; 

			// Verwijderen van aangemaakt issue tbv duplicaten
			
			driver.findElement(By.name("delete_tc")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("do_delete")).click();
			Thread.sleep(1000);
			String url = "https://m.popkey.co/136a10/X03AG.gif";
			driver.get(url);
			driver.manage().window().setSize(new Dimension(400, 340));
			Thread.sleep(6500);
			driver.close();
			driver.quit();
			
		}	
		
		else
		{ 
			System.out.println("✖ Geen Test Case aangemaakt");
			returnvalue = false; 
			driver.close();
			driver.quit();
			
		}

		return returnvalue;
			
		
}
}
