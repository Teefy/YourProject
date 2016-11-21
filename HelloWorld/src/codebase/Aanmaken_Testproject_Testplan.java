package codebase;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import pageObjects.Testlinkobjecten;
import probeercode.GenerateData;
import pageObjects.navigeren;

public class Aanmaken_Testproject_Testplan {

public String InloggenTestproject (String Omgeving, String Rol, String Browser) throws InterruptedException {
		
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
		
		/* driver.switchTo().frame("workframe");
		
		Testlinkobjecten.CreateTestSuite(driver).click();
			
		Testlinkobjecten.TestPlanNaam(driver).sendKeys(GenerateData.generateRandomAlphaNumeric(25) + Keys.TAB + GenerateData.generateRandomString(500));
		
		 */
		
		Thread.sleep(1000);
		
		// uitklappen treeframe + selectie
		
		driver.switchTo().frame("treeframe");
		
		driver.findElement(By.xpath("//*[@id='extdd-12']/span")).click();

		// Druk op Create-button 
		
		driver.switchTo().frame("titlebar");

		//driver.switchTo().defaultContent();
		
		List <WebElement> link=driver.findElements(By.tagName("a"));

		for(WebElement ele:link)
		{
		     System.out.println(ele.getText());
		} 
		
		
		driver.findElement(By.id("create_tc")).click();
		
		
		

		
		return null;
}
}