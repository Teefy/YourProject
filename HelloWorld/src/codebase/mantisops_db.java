package codebase;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.Mantisobjecten;


public class mantisops_db {

	public String ReportIssue(String Omgeving, String Rol, String Browser, String BevId) 
	{
		LoginPortal PortalInloggen = new LoginPortal();
		WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("arrow-right-wrapper")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Issues")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Report Issue")).click();
		
		// verbinding met MySql database en specificatie (nu online sql-db van Michel) 
		String[] connectionToMySql = ConnectMySQL.ConnectionToMySql("select * from tbl_bevinding where bevinding_id =" + BevId);	
		
		// Invul-sectie van velden en dropdowns
		
		new Select(pageObjects.Mantisobjecten.DropDown_category(driver)).selectByVisibleText(connectionToMySql[1]);
		new Select(pageObjects.Mantisobjecten.DropDown_reproducibility(driver)).selectByVisibleText(connectionToMySql[2]); 
		new Select(pageObjects.Mantisobjecten.DropDown_severity(driver)).selectByVisibleText(connectionToMySql[3]); 
		new Select(pageObjects.Mantisobjecten.DropDown_priority(driver)).selectByVisibleText(connectionToMySql[4]); 
		
		// Tekst invullen in 'normale' tekstvelden
		
		pageObjects.Mantisobjecten.text_platform(driver).sendKeys(connectionToMySql[5]);
		pageObjects.Mantisobjecten.text_os(driver).sendKeys(connectionToMySql[6]);
		pageObjects.Mantisobjecten.text_os_build(driver).sendKeys(connectionToMySql[7]);
				
		// Selecteren van item in dropdown 
		
		new Select(pageObjects.Mantisobjecten.DropDown_handler_id(driver)).selectByVisibleText(connectionToMySql[8]); 
				
		// Tekst invullen in 'normale' tekstvelden
		
		pageObjects.Mantisobjecten.text_summary(driver).sendKeys(connectionToMySql[9]);
		pageObjects.Mantisobjecten.text_description(driver).sendKeys(connectionToMySql[10]);
		pageObjects.Mantisobjecten.text_steps_to_reproduce(driver).sendKeys(connectionToMySql[11]);
		pageObjects.Mantisobjecten.text_additional_info(driver).sendKeys(connectionToMySql[12]);
	
		// Selecteren van item in dropdown
		
		new Select(pageObjects.Mantisobjecten.DropDown_custom_field_5(driver)).selectByVisibleText(connectionToMySql[13]);
		new Select(pageObjects.Mantisobjecten.DropDown_custom_field_1(driver)).selectByVisibleText(connectionToMySql[14]);
				
		// Bestand en/of bijlage toevoegen - op deze manier werkt het zonder systeem-venster
		//driver.findElement(By.id("ufile[]")).sendKeys("vul hier systeempad en naam in van bijlage");
		
		// Radio-buttons (de)selecteren
		driver.findElement(By.cssSelector("input[value='50']")).click();
		driver.findElement(By.cssSelector("input[value='10']")).click();
		
		// Issue submit
		driver.findElement(By.cssSelector("input[value='Submit Report']")).click();	 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		String pageSource = driver.getPageSource();
		String expectedContent = "View Submitted Issue";
		String Error = "APPLICATION ERROR #11";
		String returnvalue = null;		

		if ((pageSource).contains(expectedContent))
		{ 
			System.out.println("TC GESLAAGD | Bevinding aangemaakt" );
			returnvalue = "yes";
		}
		
		else if ((pageSource).contains(Error))
		{ 
			System.out.println("TC MISLUKT | Foutmelding aanwezig" );
			returnvalue = "no";
		}
		
		else
		{ 
			System.out.println("TC MISLUKT | Paginabron (bekijk nader):" + " " + pageSource );
		
		}
		
		driver.close();
		driver.quit();
		
		return returnvalue;
		
	}

	//___________________________________________________________________________________________________


	public String ReportIssueSH(String Omgeving, String Rol, String Browser) 
	{
		LoginPortal PortalInloggen = new LoginPortal();
		WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
		driver.manage().window().maximize(); 

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("arrow-right-wrapper")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Verificatie van userrol in html
		
		System.out.println("Rol: " + driver.findElement(By.className("username")).getText());
		
		// Verificatie van userrol --> string Rol vs html
		
		String a = "stakeholder"; // maar kan ook string Rol invullen = generieker
		String b = driver.findElement(By.className("username")).getText();
		String returnvalue = null;
		
		driver.close();  
		driver.quit();   
		
		   if ((a).equals(b)) 
		   {
			System.out.println("TC GESLAAGD: userrol komt overeen (zie boven)");
			returnvalue = "no";
		   }
		   
		   else 
		   { 
				System.out.println("TC MISLUKT: userrol komt niet overeen (zie boven)");
		   }
			
		   
		return returnvalue;
	
		
	}
	
	//___________________________________________________________________________________________________
	
	
	public String ViewIssue(String Omgeving, String Rol, String Browser) {
		
		LoginPortal PortalInloggen = new LoginPortal();
		WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("arrow-right-wrapper")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Issues")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.findElement(By.linkText("My View")).click();
		driver.findElement(By.linkText("View Issues")).click();
		
		String title = driver.getTitle();
		System.out.println("Titel van pagina: " + title);
		
		// 'nieuwe code' 

		String actualTitle = driver.getTitle();
		String expectedTitle = "View Issues - MantisBT";
		String returnvalue = null;		
		
		driver.close();
		driver.quit();

		if ((actualTitle).equals(expectedTitle))
		{ 
			System.out.println("TC GESLAAGD: Paginatitel: View Issues - MantisBT");
			returnvalue = "yes";
		}
			else 
		{ 
			System.out.println("TC MISLUKT: Paginatitel komt niet overeen");
		}
		
		return returnvalue;
		
	}


	//___________________________________________________________________________________________________

	
	public String LoginError(String Omgeving, String Rol, String Browser) 
	{
		LoginPortal PortalInloggen = new LoginPortal();
		WebDriver driver = PortalInloggen.inloggenError(Omgeving,Rol,Browser);
		
		driver.manage().window().setSize(new Dimension(1280, 920));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Verificatie van foutmelding incl. substring waarbinnen de foutmelding staat
		
		System.out.println("Foutmelding: " + driver.findElement(By.id("information")).getText().substring(14,55));
		
		// Foutmelding te pakken middels substring (classes zitten namelijk verstopt achter hoofd-id)
		
		String a = "Sorry, unrecognized username or password.";
		String b = driver.findElement(By.id("information")).getText().substring(14,55);
		String returnvalue = null;
		
		driver.close();  
		driver.quit();   
		
		   if ((a).equals(b)) 
		   {
			System.out.println("TC GESLAAGD: juiste foutmelding");
			returnvalue = "yes";
		   }
		   
		   else 
		   { 
			System.out.println("TC MISLUKT: onjuiste foutmelding");
		   }
			
		   
		return returnvalue;
	
		
	}
	
	
	
}