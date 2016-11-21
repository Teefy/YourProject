package codebase;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import pageObjects.Mantisobjecten;
import pageObjects.navigeren;

public class Rapportage {

	public boolean A (String Omgeving, String Rol, String Browser) throws InterruptedException {
		
		LoginPortal PortalInloggen = new LoginPortal();
		WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
		driver.manage().window().maximize(); 
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		navigeren.PijlRechts(driver).click();;
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		navigeren.NavigeerMantis(driver).click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		navigeren.BekijkBevindingen(driver).click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//Selecteer filter Reporter: testleader
		driver.findElement(By.id("reporter_id_filter")).click();
		new Select(driver.findElement(By.name("reporter_id[]"))).selectByVisibleText("testleader");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
		//Selecteer filter Category: issue
		Mantisobjecten.ToonCategoryFilter(driver).click();
		new Select(driver.findElement(By.name("show_category[]"))).selectByVisibleText("Issue");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		// Selecteer filter Servity: Low
		Mantisobjecten.ToonSeverity(driver).click();
		new Select(driver.findElement(By.name("show_severity[]"))).selectByVisibleText("Low");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//  Klik op button 'apply filter'
		Mantisobjecten.ApplyFilter(driver).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Klik op de button 'Print Reports'
		Thread.sleep(500);
		Mantisobjecten.ClickReport(driver).click();
		
		// Klik op het Word icoontje linksboven
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Mantisobjecten.ClickWordIcon(driver).click();
				 
		Thread.sleep(500);
		
		driver.quit ();
		boolean outcome = false;
		
		String home = System.getProperty("user.home");		
		File f = new File(home+"/Downloads/test.doc");
			if(f.exists()){
			    System.out.println("Success");
			    outcome = true;
			}
			else{
			    System.out.println("fail");
			    }
			f.delete();

		return outcome;
}

//--------------------------------------------------------------------------------------------------


		public String B (String Omgeving, String Rol, String Browser) {
			
			LoginPortal PortalInloggen = new LoginPortal();
			WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(By.id("arrow-right-wrapper")).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(By.linkText("Issues")).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(By.linkText("View Issues")).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			//Selecteer filter Reporter: softwaredeveloper
			driver.findElement(By.id("reporter_id_filter")).click();
			new Select(driver.findElement(By.name("reporter_id[]"))).selectByVisibleText("softwaredeveloper");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				
			//Selecteer filter Category: question
			driver.findElement(By.id("show_category_filter")).click();
			new Select(driver.findElement(By.name("show_category[]"))).selectByVisibleText("Question");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			// Selecteer filter Servity: Low
			driver.findElement(By.id("show_severity_filter")).click();
			new Select(driver.findElement(By.name("show_severity[]"))).selectByVisibleText("Low");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			//  Klik op button 'apply filter'
			driver.findElement(By.name("filter")).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			// Klik op de button 'CSV reports'
			driver.findElement(By.linkText("CSV Export")).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			// driver.quit ();
			
			return null ;
		}
//--------------------------------------------------------------------------------
public String C (String Omgeving, String Rol, String Browser) {
			
			LoginPortal PortalInloggen = new LoginPortal();
			WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(By.id("arrow-right-wrapper")).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(By.linkText("Issues")).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(By.linkText("View Issues")).click();
			
			//Selecteer filter Reporter: softwaredeveloper
			driver.findElement(By.id("reporter_id_filter")).click();
			new Select(driver.findElement(By.name("reporter_id[]"))).selectByVisibleText("testleader");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				
			//Selecteer filter Category: question
			driver.findElement(By.id("show_category_filter")).click();
			new Select(driver.findElement(By.name("show_category[]"))).selectByVisibleText("Issue");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			// Selecteer filter Servity: Low
			driver.findElement(By.id("show_severity_filter")).click();
			new Select(driver.findElement(By.name("show_severity[]"))).selectByVisibleText("Low");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			//  Klik op button 'apply filter'
			driver.findElement(By.name("filter")).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			// Klik op de button 'XML export'
			driver.findElement(By.linkText("XML Export")).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			driver.quit ();
			
			return null ;
		}
//--------------------------------------------------------------------------------
public String D (String Omgeving, String Rol, String Browser) {
	
	LoginPortal PortalInloggen = new LoginPortal();
	WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.id("arrow-right-wrapper")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Issues")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.linkText("View Issues")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	//Selecteer filter Reporter: softwaredeveloper
	driver.findElement(By.id("reporter_id_filter")).click();
	new Select(driver.findElement(By.name("reporter_id[]"))).selectByVisibleText("softwaredeveloper");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	//Selecteer filter Category: question
	driver.findElement(By.id("show_category_filter")).click();
	new Select(driver.findElement(By.name("show_category[]"))).selectByVisibleText("Question");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	// Selecteer filter Servity: Low
	driver.findElement(By.id("show_severity_filter")).click();
	new Select(driver.findElement(By.name("show_severity[]"))).selectByVisibleText("Low");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	//  Klik op button 'apply filter'
	driver.findElement(By.name("filter")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	// Klik op de button 'Print Report'
	driver.findElement(By.linkText("Print Reports")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
 // Klik op het Word icoontje linksboven
	driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr/td/a[2]/img")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	driver.quit ();
	return null ;
}
//--------------------------------------------------------------------------------------------------
public String E (String Omgeving, String Rol, String Browser) {
	
	LoginPortal PortalInloggen = new LoginPortal();
	WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.id("arrow-right-wrapper")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Issues")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.linkText("View Issues")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	//Selecteer filter Reporter: softwaredeveloper
	driver.findElement(By.id("reporter_id_filter")).click();
	new Select(driver.findElement(By.name("reporter_id[]"))).selectByVisibleText("testleader");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	//Selecteer filter Category: question
	driver.findElement(By.id("show_category_filter")).click();
	new Select(driver.findElement(By.name("show_category[]"))).selectByVisibleText("Issue");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	// Selecteer filter Servity: Low
	driver.findElement(By.id("show_severity_filter")).click();
	new Select(driver.findElement(By.name("show_severity[]"))).selectByVisibleText("Low");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	//  Klik op button 'apply filter'
	driver.findElement(By.name("filter")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	// Klik op de button 'CSV reports'
	driver.findElement(By.linkText("CSV Export")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	driver.quit ();
	
	return null ;
}
//---------------------------------------------------------------------------------
public String F (String Omgeving, String Rol, String Browser) {
	
	LoginPortal PortalInloggen = new LoginPortal();
	WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.id("arrow-right-wrapper")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Issues")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.linkText("View Issues")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	//Selecteer filter Reporter: softwaredeveloper
	driver.findElement(By.id("reporter_id_filter")).click();
	new Select(driver.findElement(By.name("reporter_id[]"))).selectByVisibleText("softwaredeveloper");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	//Selecteer filter Category: question
	driver.findElement(By.id("show_category_filter")).click();
	new Select(driver.findElement(By.name("show_category[]"))).selectByVisibleText("Question");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	// Selecteer filter Servity: Low
	driver.findElement(By.id("show_severity_filter")).click();
	new Select(driver.findElement(By.name("show_severity[]"))).selectByVisibleText("Low");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	//  Klik op button 'apply filter'
	driver.findElement(By.name("filter")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	// Klik op de button 'CSV reports'
	driver.findElement(By.linkText("XML Export")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	driver.quit ();
	return null ;
}
}

