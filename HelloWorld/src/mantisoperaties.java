import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class mantisoperaties {

	public String Nieuwebevinding(String Omgeving, String Rol, String Browser) 
	{
		LoginPortal PortalInloggen = new LoginPortal();
		WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("arrow-right-wrapper")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Issues")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Report Issue")).click();
		
		// Invul-sectie van velden en dropdowns
		new Select(driver.findElement(By.name("category_id"))).selectByVisibleText("Question"); 
		new Select(driver.findElement(By.name("reproducibility"))).selectByVisibleText("random"); 
		new Select(driver.findElement(By.name("severity"))).selectByVisibleText("Low"); 
		new Select(driver.findElement(By.name("priority"))).selectByVisibleText("Medium"); 
		
		// Tekst invullen in 'normale' tekstvelden
		driver.findElement(By.name("platform")).sendKeys("Linux");
		driver.findElement(By.name("os")).sendKeys("Ubuntu");
		driver.findElement(By.name("os_build")).sendKeys("16.04 LTS");
		
		// Selecteren van item in dropdown 
		new Select(driver.findElement(By.name("handler_id"))).selectByVisibleText("testanalyst"); 
		
		// Tekst invullen in 'normale' tekstvelden
		driver.findElement(By.name("summary")).sendKeys("Bevinding aanmaken | Demo");
		driver.findElement(By.name("description")).sendKeys("Hier staat een demostratieve beschrijving van het probleem en/of ongewenst gedrag.");
		driver.findElement(By.name("steps_to_reproduce")).sendKeys("1. Dit is de eerste handeling. 2. Dit is de tweede handeling. 3. Dit is de derde handeling.");
		driver.findElement(By.name("additional_info")).sendKeys("Noot: deze informatie kan hierbij nuttig zijn.");
		
		// Selecteren van item in dropdown
		new Select(driver.findElement(By.name("custom_field_5"))).selectByVisibleText("testleader (Test Leader)"); 
		new Select(driver.findElement(By.name("custom_field_1"))).selectByVisibleText("OAT"); 
		
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
		
		driver.close();  
		driver.quit();   
		
		   if ((a).equals(b)) 
		   {
			System.out.println("Nieuwe bevinding aangemaakt");
			returnvalue = "yes";
		   }

		return returnvalue;
	}
	
	public String ViewBevindingen(String Omgeving, String Rol, String Browser) {
		
		LoginPortal PortalInloggen = new LoginPortal();
		WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("arrow-right-wrapper")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Issues")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.linkText("View Issues")).click();
		
		// 'nieuwe code' 

		String actualTitle = driver.getTitle();
		String expectedTitle = "View Issues - MantisBT";
		String returnvalue = null;		

		if ((actualTitle).equals(expectedTitle))
		{ 
			System.out.println("Bevindingen aan het bekijken | Paginatitel: View Issues - MantisBT");
			returnvalue = "yes";
		}
			else 
		{ 
			System.out.println("Paginatitel komt niet overeen");
		}
		
		return returnvalue;
		
		// 'oude code' 
		
		/* String s = driver.findElement(By.className("floatleft")).getText();
		String a=s.substring(0,14);
				
		String b = "Viewing Issues";
		String returnvalue = null;
		driver.quit();
		
		if ((a).equals(b)) 
		   {
			System.out.println("Bevindingen aan het bekijken");
			returnvalue = "yes";
		   }
		return returnvalue;
		
		*/
	}
}
