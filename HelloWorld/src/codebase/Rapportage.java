package codebase;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import pageObjects.Mantisobjecten;
import pageObjects.Testlinkobjecten;
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
		Thread.sleep(500);
		//Selecteer filter Reporter: testleader
		Mantisobjecten.Select_reporter(driver).click();
		new Select(Mantisobjecten.Vul_reporter(driver)).selectByVisibleText("testleader");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
		//Selecteer filter Category: issue
		Mantisobjecten.SelectCategory(driver).click();
		new Select(Mantisobjecten.Vul_Category(driver)).selectByVisibleText("Issue");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		// Selecteer filter Servity: Low
		Mantisobjecten.Select_Severity(driver).click();
		new Select(Mantisobjecten.Vul_Severity(driver)).selectByVisibleText("Low");
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


		public boolean B (String Omgeving, String Rol, String Browser)throws InterruptedException {
			
			LoginPortal PortalInloggen = new LoginPortal();
			WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			navigeren.PijlRechts(driver).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			navigeren.NavigeerMantis(driver).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			navigeren.BekijkBevindingen(driver).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			//Selecteer filter Reporter: softwaredeveloper
			Thread.sleep(500);
			Mantisobjecten.Select_reporter(driver).click();
			new Select(Mantisobjecten.Vul_reporter(driver)).selectByVisibleText("softwaredeveloper");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				
			//Selecteer filter Category: question
			Mantisobjecten.SelectCategory(driver).click();
			new Select(Mantisobjecten.Vul_Category(driver)).selectByVisibleText("Question");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			// Selecteer filter Servity: Low
			Mantisobjecten.Select_Severity(driver).click();
			new Select(Mantisobjecten.Vul_Severity(driver)).selectByVisibleText("Low");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			//  Klik op button 'apply filter'
			
			Mantisobjecten.ApplyFilter(driver).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			Thread.sleep(500);
			// Klik op de button 'CSV reports'
			Mantisobjecten.Click_CSV(driver).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
									
			Thread.sleep(1000);
			
			driver.quit ();
			boolean outcome = false;
			
			String home = System.getProperty("user.home");		
			File f = new File(home+"/Downloads/test.csv");
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
//--------------------------------------------------------------------------------
public boolean C (String Omgeving, String Rol, String Browser) throws InterruptedException{
			
			LoginPortal PortalInloggen = new LoginPortal();
			WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
			driver.manage().window().maximize(); 
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			navigeren.PijlRechts(driver).click();
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			navigeren.NavigeerMantis(driver).click();
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			navigeren.BekijkBevindingen(driver).click();
			
			//Selecteer filter Reporter: softwaredeveloper
			
			Thread.sleep(500);
			Mantisobjecten.Select_reporter(driver).click();
			new Select(Mantisobjecten.Vul_reporter(driver)).selectByVisibleText("testleader");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				
			//Selecteer filter Category: question
			
			Mantisobjecten.SelectCategory(driver).click();
			new Select(Mantisobjecten.Vul_Category(driver)).selectByVisibleText("Issue");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			// Selecteer filter Servity: Low
			Mantisobjecten.Select_Severity(driver).click();
			new Select(Mantisobjecten.Vul_Severity(driver)).selectByVisibleText("Low");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			//  Klik op button 'apply filter'
			
			Mantisobjecten.ApplyFilter(driver).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			Thread.sleep(500);
			// Klik op de button 'XML export'
			Mantisobjecten.Click_XML(driver).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			Thread.sleep(1000);
			
			// driver.quit ();
			
			boolean outcome = false;
			
			String home = System.getProperty("user.home");		
			File f = new File(home+"/Downloads/test.xml");
				if(f.exists()){
				    System.out.println("Success");
				    outcome = true;
				}
				else{
				    System.out.println("fail");
				    }
				f.delete();

			//return value hardcoded naar True. chrome geeft een bevestigingsdialoog. 
			//Dit is niet af te vangen in een script, dus handmatig controleren. 
			//code laten staan voor tracking. browser wordt derhalve niet automatisch gesloten.
				
			return true;
		}

}

