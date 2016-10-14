import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class mantisoperaties {
	
	public String Nieuwebevinding() 
	{
		LoginPortal inloggen = new LoginPortal();
		WebDriver driver = inloggen.inloggen("PRO","testleader");
		driver.manage().window().maximize(); 
		driver.findElement(By.id("arrow-right-wrapper")).click();
		driver.findElement(By.linkText("Issues")).click();
		driver.findElement(By.linkText("Report Issue")).click();
		
		// Invul-sectie van velden en dropdowns
		new Select(driver.findElement(By.name("category_id"))).selectByVisibleText("Request for change"); 
		new Select(driver.findElement(By.name("reproducibility"))).selectByVisibleText("unable to reproduce"); 
		new Select(driver.findElement(By.name("severity"))).selectByVisibleText("Very High"); 
		new Select(driver.findElement(By.name("priority"))).selectByVisibleText("High"); 
		// Tekst invullen in 'normale' tekstvelden
		driver.findElement(By.name("platform")).sendKeys("Fisherman Friends");
		driver.findElement(By.name("os")).sendKeys("OS X Bakkeljauw");
		driver.findElement(By.name("os_build")).sendKeys("2017-alpha-beta");
		// Let op bij dropdowns 
		new Select(driver.findElement(By.name("handler_id"))).selectByVisibleText("rwahjad"); 
		// Tekst invullen in 'normale' tekstvelden
		driver.findElement(By.name("summary")).sendKeys("Ryan vist op het droge");
		driver.findElement(By.name("description")).sendKeys("Wanneer Ryan z'n hengel uitgooit wordt hij ineens (inclusief vis-attributen) uit een vliegtuig gegooid. Dit slaat natuurlijk nergens op. Vandaar een change-request.");
		driver.findElement(By.name("steps_to_reproduce")).sendKeys("1. Laat Ryan een willekeurige visplek uitzoeken. 2. Laat Ryan z'n hengel uitgooien. 3. Kijk omhoog. 4. Ryan is ineens aan het skydiven.");
		driver.findElement(By.name("additional_info")).sendKeys("Noot: Ryan is geen vliegende visser.");
		// Let op bij dropdowns
		new Select(driver.findElement(By.name("custom_field_5"))).selectByVisibleText("testleader (Test Leader)"); 
		new Select(driver.findElement(By.name("custom_field_1"))).selectByVisibleText("UAT"); 
		// Bestand en/of bijlage toevoegen - op deze manier werkt het zonder systeem-venster
		//driver.findElement(By.id("ufile[]")).sendKeys("vul hier systeempad en naam in van bijlage");
		// Radio-buttons (de)selecteren
		driver.findElement(By.cssSelector("input[value='50']")).click();
		driver.findElement(By.cssSelector("input[value='10']")).click();
		// Screenshot maken van huidige pagina en opslaan op locatie/bureaublad
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	//	FileUtils.copyFile(screenshot, new File("vul hier systeempad en naam + bestandstype (bijv: .png) in van screenshot"));
		// Console-log dat er een screenshot is genomen + locatie
		System.out.print("Screenshot van ingevulde velden gemaakt en opgeslagen op Desktop (CREATE)");
		// Wachten 5sec (tbv DEMO)
	//	TestNGThread.sleep(5000);
		// Issue submit
		driver.findElement(By.cssSelector("input[value='Submit Report']")).click();	
			
		String a = driver.findElement(By.linkText("View Issues")).getText();
		String b = "View Issues";
		String returnvalue = null;
		   
		   if ((a).equals(b)) 
		   {
			System.out.println("Nieuwe bevinding");
			returnvalue = "yes";
		   }
				
		returnvalue = "yes";
		driver.close();
		return returnvalue;
	}
}
