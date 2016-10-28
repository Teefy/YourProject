import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class mantisops_db {
	
	public String reportissue(String Omgeving, String Rol, String Browser, String BevId) 
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
		
		String[] connectionToMySql = ConnectMySQL.ConnectionToMySql("select * from tbl_bevinding where bevinding_id ="  + BevId);	
		
		// Invul-sectie van velden en dropdowns
		new Select(driver.findElement(By.name("category_id"))).selectByVisibleText(connectionToMySql[1]); 
		new Select(driver.findElement(By.name("reproducibility"))).selectByVisibleText(connectionToMySql[2]); 
		new Select(driver.findElement(By.name("severity"))).selectByVisibleText(connectionToMySql[3]); 
		new Select(driver.findElement(By.name("priority"))).selectByVisibleText(connectionToMySql[4]); 
		
		// Tekst invullen in 'normale' tekstvelden
		driver.findElement(By.name("platform")).sendKeys(connectionToMySql[5]);
		driver.findElement(By.name("os")).sendKeys(connectionToMySql[6]);
		driver.findElement(By.name("os_build")).sendKeys(connectionToMySql[7]);
			
		// Selecteren van item in dropdown 
		new Select(driver.findElement(By.name("handler_id"))).selectByVisibleText(connectionToMySql[8]); 
		
		// Tekst invullen in 'normale' tekstvelden
		driver.findElement(By.name("summary")).sendKeys(connectionToMySql[9]);
		driver.findElement(By.name("description")).sendKeys(connectionToMySql[10]);
		driver.findElement(By.name("steps_to_reproduce")).sendKeys(connectionToMySql[11]);
		driver.findElement(By.name("additional_info")).sendKeys(connectionToMySql[12]);
		
		// Selecteren van item in dropdown
		new Select(driver.findElement(By.name("custom_field_5"))).selectByVisibleText(connectionToMySql[13]); 
		new Select(driver.findElement(By.name("custom_field_1"))).selectByVisibleText(connectionToMySql[14]); 
		
		// Bestand en/of bijlage toevoegen - op deze manier werkt het zonder systeem-venster
		//driver.findElement(By.id("ufile[]")).sendKeys("vul hier systeempad en naam in van bijlage");
		
		// Radio-buttons (de)selecteren
		driver.findElement(By.cssSelector("input[value='50']")).click();
		driver.findElement(By.cssSelector("input[value='10']")).click();
		
		// Issue submit
		driver.findElement(By.cssSelector("input[value='Submit Report']")).click();	 
			
		String a = driver.findElement(By.linkText("View Issues")).getText();
		String b = "View Issues";
		String returnvalue = null;
		
		//driver.close();  
		//driver.quit();   
		
		   if ((a).equals(b)) 
		   {
			System.out.println("Geslaagd: nieuwe bevinding aangemaakt");
			returnvalue = "yes";
		   }
		   
		   else 
		   { 
				System.out.println("Fail: geen nieuwe bevinding aangemaakt");
		   }
			
		   return returnvalue; 
	}}

	//___________________________________________________________________________________________________

