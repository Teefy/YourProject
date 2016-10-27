import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Rapportage {

	public String A (String Omgeving, String Rol, String Browser) {
		
		LoginPortal PortalInloggen = new LoginPortal();
		WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("arrow-right-wrapper")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Issues")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.linkText("View Issues")).click();
		
		//Selecteer filter Reporter: testleader
		driver.findElement(By.id("reporter_id_filter")).click();
		new Select(driver.findElement(By.name("reporter_id[]"))).selectByVisibleText("testleader");
		
			
		//Selecteer filter Category: issue
		driver.findElement(By.id("show_category_filter")).click();
		new Select(driver.findElement(By.name("show_category[]"))).selectByVisibleText("Issue");
		
		// Selecteer filter Servity: Low
		driver.findElement(By.id("show_severity_filter")).click();
		new Select(driver.findElement(By.name("show_severity[]"))).selectByVisibleText("Low");
		
		//  Klik op button 'apply filter'
		driver.findElement(By.name("filter")).click();
		
		// Klik op de button 'Print Reports'
		driver.findElement(By.linkText("Print Reports")).click();
		
		// Klik op het Word icoontje linksboven
		 driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr/td/a[1]/img")).click();
		
		return null ;
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
			
			//Selecteer filter Reporter: softwaredeveloper
			driver.findElement(By.id("reporter_id_filter")).click();
			new Select(driver.findElement(By.name("reporter_id[]"))).selectByVisibleText("softwaredeveloper");
			
				
			//Selecteer filter Category: question
			driver.findElement(By.id("show_category_filter")).click();
			new Select(driver.findElement(By.name("show_category[]"))).selectByVisibleText("Question");
			
			// Selecteer filter Servity: Low
			driver.findElement(By.id("show_severity_filter")).click();
			new Select(driver.findElement(By.name("show_severity[]"))).selectByVisibleText("Low");
			
			//  Klik op button 'apply filter'
			driver.findElement(By.name("filter")).click();
			
			// Klik op de button 'CSV reports'
			driver.findElement(By.linkText("CSV Export")).click();
			
			
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
			
				
			//Selecteer filter Category: question
			driver.findElement(By.id("show_category_filter")).click();
			new Select(driver.findElement(By.name("show_category[]"))).selectByVisibleText("Issue");
			
			// Selecteer filter Servity: Low
			driver.findElement(By.id("show_severity_filter")).click();
			new Select(driver.findElement(By.name("show_severity[]"))).selectByVisibleText("Low");
			
			//  Klik op button 'apply filter'
			driver.findElement(By.name("filter")).click();
			
			// Klik op de button 'XML export'
			driver.findElement(By.linkText("XML Export")).click();
			
			
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
	
	//Selecteer filter Reporter: softwaredeveloper
	driver.findElement(By.id("reporter_id_filter")).click();
	new Select(driver.findElement(By.name("reporter_id[]"))).selectByVisibleText("softwaredeveloper");
	
		
	//Selecteer filter Category: question
	driver.findElement(By.id("show_category_filter")).click();
	new Select(driver.findElement(By.name("show_category[]"))).selectByVisibleText("Question");
	
	// Selecteer filter Servity: Low
	driver.findElement(By.id("show_severity_filter")).click();
	new Select(driver.findElement(By.name("show_severity[]"))).selectByVisibleText("Low");
	
	//  Klik op button 'apply filter'
	driver.findElement(By.name("filter")).click();
	
	// Klik op de button 'Print Report'
	driver.findElement(By.linkText("Print Reports")).click();
	
 // Klik op het Word icoontje linksboven
	driver.findElement(By.xpath("/html/body/form[1]/table/tbody/tr/td/a[2]/img")).click();
	
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
	
	//Selecteer filter Reporter: softwaredeveloper
	driver.findElement(By.id("reporter_id_filter")).click();
	new Select(driver.findElement(By.name("reporter_id[]"))).selectByVisibleText("testleader");
	
		
	//Selecteer filter Category: question
	driver.findElement(By.id("show_category_filter")).click();
	new Select(driver.findElement(By.name("show_category[]"))).selectByVisibleText("Issue");
	
	// Selecteer filter Servity: Low
	driver.findElement(By.id("show_severity_filter")).click();
	new Select(driver.findElement(By.name("show_severity[]"))).selectByVisibleText("Low");
	
	//  Klik op button 'apply filter'
	driver.findElement(By.name("filter")).click();
	
	// Klik op de button 'CSV reports'
	driver.findElement(By.linkText("CSV Export")).click();
	
	
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
	
	//Selecteer filter Reporter: softwaredeveloper
	driver.findElement(By.id("reporter_id_filter")).click();
	new Select(driver.findElement(By.name("reporter_id[]"))).selectByVisibleText("softwaredeveloper");
	
		
	//Selecteer filter Category: question
	driver.findElement(By.id("show_category_filter")).click();
	new Select(driver.findElement(By.name("show_category[]"))).selectByVisibleText("Question");
	
	// Selecteer filter Servity: Low
	driver.findElement(By.id("show_severity_filter")).click();
	new Select(driver.findElement(By.name("show_severity[]"))).selectByVisibleText("Low");
	
	//  Klik op button 'apply filter'
	driver.findElement(By.name("filter")).click();
	
	// Klik op de button 'CSV reports'
	driver.findElement(By.linkText("XML Export")).click();
	
	
	return null ;
}
}

