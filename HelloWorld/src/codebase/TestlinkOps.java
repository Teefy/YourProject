package codebase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjects.Testlinkobjecten;

public class TestlinkOps {

public String createTestProject (String Omgeving, String Rol, String Browser) {
			
		// Inloggen CP/T
	
		LoginPortal PortalInloggen = new LoginPortal();
	
		WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);

		driver.manage().window().maximize(); 
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		// Navigeren naar Testlink
		
		Testlinkobjecten.PijlRechts(driver).click();
		
		Testlinkobjecten.OpenTestLink(driver).click();
		
		// Navigeer naar Test Project Management
		
		driver.switchTo().frame("mainframe");
		
		Testlinkobjecten.OpenTestProjectManagement(driver).click();
		
		// Druk op Create-button
		
		Testlinkobjecten.CreateProjectButton(driver).click();
		
		// Invullen velden (later naar POM & SQL gooien) 

		Testlinkobjecten.ProjectNaam(driver).sendKeys("Automated Test Project");

		// Prefix + Description (bereikt middels TAB) 
		Testlinkobjecten.Prefix_en_Description(driver).sendKeys("TC" + Keys.TAB + 
		"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		
		
		// Sectie: Enhanced features	
		
		Testlinkobjecten.InventoryRadiobutton(driver).click();

		Testlinkobjecten.RequirementsRadiobutton(driver).click();
		Testlinkobjecten.RequirementsRadiobutton(driver).click();
		
		Testlinkobjecten.PriorityRadiobutton(driver).click();
		Testlinkobjecten.AutomationRadiobutton(driver).click();
		
		Testlinkobjecten.InventoryRadiobutton(driver).click();
		
		Testlinkobjecten.PriorityRadiobutton(driver).click();
		Testlinkobjecten.AutomationRadiobutton(driver).click();

		// Sectie: Issue Tracker Integration	
		
		Testlinkobjecten.IssueTrackerRadiobutton(driver).click();
		Testlinkobjecten.IssueTrackerRadiobutton(driver).click();

		new Select(Testlinkobjecten.IssueTrackerDropdown(driver)).selectByValue("1"); 
		new Select(Testlinkobjecten.IssueTrackerDropdown(driver)).selectByValue("0"); 
		
		// Sectie: Availability
		
		Testlinkobjecten.ActiveRadiobutton(driver).click();
		Testlinkobjecten.ActiveRadiobutton(driver).click();

		Testlinkobjecten.PublicRadiobutton(driver).click();
		Testlinkobjecten.PublicRadiobutton(driver).click();

		// Sectie: Create of Cancel 
		

		//Testlinkobjecten.CreateNewProjectButton(driver).click();
		Testlinkobjecten.CancelProjectButton(driver).click();
		return null;
}
}
