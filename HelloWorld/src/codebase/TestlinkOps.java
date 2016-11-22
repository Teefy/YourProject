package codebase;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjects.Testlinkobjecten;
import pageObjects.navigeren;
import probeercode.GenerateData;

public class TestlinkOps {

//----------------------------------- Create Test Project ------------------------------------------------
//------------------------------------------ TC01 --------------------------------------------------------	
		
public Boolean createTestProject (String Omgeving, String Rol, String Browser) throws InterruptedException {
			
		// Inloggen CP/T
	
		LoginPortal PortalInloggen = new LoginPortal();
	
		WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);

		driver.manage().window().maximize(); 
				
		// Navigeren naar Testlink
		
		navigeren.PijlRechts(driver).click();
		
		Testlinkobjecten.OpenTestLink(driver).click();
		
		// Navigeer naar Test Project Management
				
		Testlinkobjecten.OpenTestProjectManagement(driver).click();
		
		// Druk op Create-button
		
		Testlinkobjecten.CreateProjectButton(driver).click();
		
		// Invullen velden (later naar POM & SQL gooien) 

		Testlinkobjecten.ProjectNaam(driver).sendKeys("Automated Test Project");

		// Prefix + Description (bereikt middels TAB) 
		Testlinkobjecten.Prefix_en_Description(driver).sendKeys("TC" + Keys.TAB + GenerateData.generateRandomString(250));
		
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

		Testlinkobjecten.CreateProjectButton(driver).click();
		//Testlinkobjecten.CancelProjectButton(driver).click();
		
		
		// Verificatie van TC 

		String pageSource = driver.getPageSource();
		String expectedContent = "Automated Test Project";	
		Boolean returnvalue = null;

		if ((pageSource).contains(expectedContent))
		{ 
			System.out.println("✔ Test Project aangemaakt (en verwijderd)" );
			returnvalue = true; 
			// Verwijderen van aangemaakt issue tbv duplicaten
			driver.findElement(By.xpath("//*[@id='item_view']/tbody/tr[2]/td[8]/img")).click();
			driver.findElement(By.id("ext-gen20")).click();
			Thread.sleep(1000);
			String url = "https://m.popkey.co/136a10/X03AG.gif";
			driver.get(url);
			driver.manage().window().setSize(new Dimension(396, 333));
			Thread.sleep(4500);
			driver.close();
			driver.quit();
			
		}	
		
		else
		{ 
			System.out.println("✖ Geen Test Project aangemaakt");
			returnvalue = false; 
			driver.close();
			driver.quit();
			
		}

		return returnvalue;
			
}

//----------------------------------- Create Test Project ------------------------------------------------
//------------------------------------------ TC02 --------------------------------------------------------

public Boolean createTestProjectFail (String Omgeving, String Rol, String Browser) throws InterruptedException {
			
		// Inloggen CP/T
	
		LoginPortal PortalInloggen = new LoginPortal();
	
		WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);

		driver.manage().window().maximize(); 
				
		// Navigeren naar Testlink
		
		navigeren.PijlRechts(driver).click();
		
		Testlinkobjecten.OpenTestLink(driver).click();
		
		// Navigeer naar Test Project Management
		
		Testlinkobjecten.OpenTestProjectManagement(driver).click();
		
		// Druk op Create-button
		
		Testlinkobjecten.CreateProjectButton(driver).click();
		
		// Invullen velden (later naar POM & SQL gooien) 

		Testlinkobjecten.ProjectNaam(driver).sendKeys("");

		// Prefix + Description (bereikt middels TAB) 
		
		Testlinkobjecten.Prefix_en_Description(driver).sendKeys("TC" + Keys.TAB + GenerateData.generateRandomString(250));
				
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
		
		Testlinkobjecten.CreateProjectButton(driver).click();
		//Testlinkobjecten.CancelProjectButton(driver).click();
		
		
		// Verificatie van TC 
		
		String pageSource = driver.getPageSource();
		String expectedContent = "Automated Test Project";	
		String error = driver.findElement(By.id("error_icon_tprojectName")).getText();
		Boolean returnvalue = null;

		if ((pageSource).contains(expectedContent))
		{ 
			System.out.println("✖ Test Project aangemaakt (en verwijderd)" );
			returnvalue = true; 
			// Verwijderen van aangemaakt issue tbv duplicaten
			driver.findElement(By.xpath("//*[@id='item_view']/tbody/tr[2]/td[8]/img")).click();
			driver.findElement(By.id("ext-gen20")).click();	
			driver.close();
			driver.quit();			
		}	
		
		else if ((pageSource).contains(error))
		{ 
			System.out.println("✔ Geen Test Project aangemaakt (foutmelding getoont)");
			returnvalue = false; 
			Thread.sleep(1000);
			String url = "https://media.giphy.com/media/Y01jP8QeLOox2/giphy.gif";
			driver.get(url);
			driver.manage().window().setSize(new Dimension(358, 340));
			Thread.sleep(3400);
			driver.close();
			driver.quit();
			
			
		}

		return returnvalue;
			
}

//--------------------------- Create Test Specification & Test Case --------------------------------------
//------------------------------------------ TC01 --------------------------------------------------------


public Boolean createTestSpecsTC (String Omgeving, String Rol, String Browser) throws InterruptedException {
				
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
				
		Testlinkobjecten.TCNaam_beschrijving(driver).sendKeys("Test Kees" + Keys.TAB + "Kroesuway 3000 bot: " 
		+ GenerateData.generateRandomString(250) + Keys.TAB + GenerateData.generateRandomString(150));
				
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
					driver.manage().window().setSize(new Dimension(396, 333));
					Thread.sleep(4500);
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
	
//--------------------------- Create Test Specification & Test Case --------------------------------------
//------------------------------------------ TC02 --------------------------------------------------------

public Boolean createTestSpecsTCFail (String Omgeving, String Rol, String Browser) throws InterruptedException {
	
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
	
		Testlinkobjecten.TCNaam_beschrijving(driver).sendKeys("" + Keys.TAB + "Kroesuway 3000 bot: "
		+ GenerateData.generateRandomString(250) + Keys.TAB + GenerateData.generateRandomString(150));
	
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
		String error = driver.findElement(By.id("error_icon_testcase_name")).getText();
		Boolean returnvalue = null;

		if ((pageSource).contains(TC))
		{ 
			System.out.println("✖ Test Case aangemaakt (en verwijderd)" );
			returnvalue = true; 

			// Verwijderen van aangemaakt issue tbv duplicaten
		
			driver.findElement(By.name("delete_tc")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("do_delete")).click();
			driver.close();
			driver.quit();
		
		}	
 
		else if ((pageSource).contains(error))
		{ 
			System.out.println("✔ Geen Test Case aangemaakt (foutmelding getoont)");
			returnvalue = false; 
			Thread.sleep(1000);
			String url = "https://media.giphy.com/media/Y01jP8QeLOox2/giphy.gif";
			driver.get(url);
			driver.manage().window().setSize(new Dimension(358, 340));
			Thread.sleep(3400);
			driver.close();
			driver.quit();
			
		}
	
	return returnvalue;
	
}
}

//----------------------------------------- THE END ------------------------------------------------------