import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Opvoeren_bevinding {

	public String Bevinding(String Omgeving, String Rol, String Browser) 
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

		// voer reportdetails in
		
		new Select(driver.findElement(By.name("category_id"))).selectByVisibleText("Issue");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		new Select(driver.findElement(By.name("reproducibility"))).selectByVisibleText("random");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		new Select(driver.findElement(By.name("severity"))).selectByVisibleText("High");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		new Select(driver.findElement(By.name("priority"))).selectByVisibleText("Medium");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		// Assign to
		
		new Select(driver.findElement(By.name("handler_id"))).selectByVisibleText("rwahjad");
		
		
		// Summary
		
		driver.findElement(By.name("summary")).sendKeys("Bevinding A");
		
		
		// Description
		
		driver.findElement(By.name("description")).sendKeys("Dit is een test A");
		
		
		// Steps to reproduce
		
		driver.findElement(By.name("steps_to_reproduce")).sendKeys("stappen 1 t/m 10");
				
		// Additional info
		
		driver.findElement(By.name("additional_info")).sendKeys("Via bepaalde routing gelopen");
		
		
		// Discovered by ??
		
		// Testcase ID
		driver.findElement(By.name("custom_field_2")).sendKeys("SD-01");
	
		
		// Test type
		
		new Select(driver.findElement(By.name("custom_field_1"))).selectByVisibleText("ST");
		
		
		// Upload file < 5000 KB
		
		driver.findElement(By.id("ufile[]")).sendKeys("C:/Users/dennis/Pictures/nederlandse vlag.png");
				
		
		// klik op 'Submit button'
		
		driver.findElement(By.cssSelector("input[value='Submit Report']")).click();
		
		
		String title = driver.getTitle(); 
		System.out.println("Paginatie :" + title);
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "MantisBT";

		String returnvalue = null;
		
		
		driver.close();  
		driver.quit();   
		
		
		   if ((actualTitle).equals(expectedTitle)) 
		   {
			System.out.println("Nieuwe bevinding aangemaakt door " + Rol + " in " + Omgeving + " omgeving " + " in browswer " + Browser);
			returnvalue = "yes";
		   }
		   else {
			   System.out.println("Bevinding opvoeren gefaalfd");
			   returnvalue = "no";
		   }
		   
		  
		   			return returnvalue;
		
	}
		
}