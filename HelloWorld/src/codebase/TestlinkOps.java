package codebase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjects.Testlinkobjecten;

public class TestlinkOps {

public String createTestProject (String Omgeving, String Rol, String Browser) {
	
		// Guys - dit mijn klooi-bestand om elementen te inventariseren - graag even intact houden
		
		// Inloggen CP/T
	
		LoginPortal PortalInloggen = new LoginPortal();
	
		WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);

		driver.manage().window().maximize(); 
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		// Navigeren naar Testlink
		
		Testlinkobjecten.PijlRechts(driver).click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		Testlinkobjecten.OpenTestLink(driver).click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		// Navigeer naar Test Project Management
		
		driver.switchTo().frame("mainframe");
		driver.findElement(By.linkText("Test Project Management")).click();

		// Druk op Create-button
		
		driver.findElement(By.id("create")).click();
		
		// Invullen velden (later naar POM & SQL gooien) 

		driver.findElement(By.name("tprojectName")).sendKeys("My 1st Test Project");

		driver.findElement(By.name("tcasePrefix")).sendKeys("TEST");
		
		//driver.switchTo().frame("//*[@id='cke_contents_notes']/iframe/html/body/p");

		//driver.findElement(By.xpath("//*[@id='cke_notes']/span[2]/span/table/tbody/tr[2]/cke_contents_notes/iframe/html/body/p")).sendKeys("TEST TEST TEST");

		
		// Frenzy van radio-buttons aan/uit klikken
		
		// sectie: Enhanced features	
		
		driver.findElement(By.cssSelector("input[name='optInventory']")).click();
		
		driver.findElement(By.cssSelector("input[name='optReq']")).click();
		driver.findElement(By.cssSelector("input[name='optReq']")).click();
		
		driver.findElement(By.cssSelector("input[name='optPriority']")).click();
		driver.findElement(By.cssSelector("input[name='optAutomation']")).click();
		
		driver.findElement(By.cssSelector("input[name='optInventory']")).click();
		
		driver.findElement(By.cssSelector("input[name='optPriority']")).click();
		driver.findElement(By.cssSelector("input[name='optAutomation']")).click();

		// sectie: Issue Tracker Integration	
		
		driver.findElement(By.cssSelector("input[name='issue_tracker_enabled']")).click();
		driver.findElement(By.cssSelector("input[name='issue_tracker_enabled']")).click();
		
		new Select(driver.findElement(By.name("issue_tracker_id"))).selectByValue("1"); 
		new Select(driver.findElement(By.name("issue_tracker_id"))).selectByValue("0"); 
		
		// sectie: Availability

		driver.findElement(By.cssSelector("input[name='active']")).click();
		driver.findElement(By.cssSelector("input[name='active']")).click();
		
		driver.findElement(By.cssSelector("input[name='is_public']")).click();
		driver.findElement(By.cssSelector("input[name='is_public']")).click();
		
		// sectie: Create of Cancel 
		
		driver.findElement(By.cssSelector("input[value='Cancel']")).click();
		// driver.findElement(By.cssSelector("input[value='Create']")).click();


		return null;
}
}

//Testlinkobjecten.OpenTestProjectManagement(driver).click();