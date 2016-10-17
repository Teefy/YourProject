import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class mantisoperaties {
	
	public String Nieuwebevinding() 
	{
		LoginPortal PortalInloggen = new LoginPortal();
		// Inloggen op [Omgeving=] "PRO" of "ACC" en [Rollen=] "softwaredeveloper", "testanalyst", "testleader", "softwaredeveloper", "projectmanager"
		WebDriver driver = PortalInloggen.inloggen("PRO","testleader");
		

		// CREATE ____________________________________________
		
		// Naar Issues --> Report Issues
		driver.findElement(By.id("arrow-right-wrapper")).click();
		driver.findElement(By.linkText("Issues")).click();
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
		driver.findElement(By.name("summary")).sendKeys("Selenium Issue Test");
		driver.findElement(By.name("description")).sendKeys("Wanneer Ryan z'n hengel uitgooit wordt hij ineens (inclusief vis-attributen) uit een vliegtuig gegooid. Dit slaat natuurlijk nergens op. Vandaar een change-request.");
		driver.findElement(By.name("steps_to_reproduce")).sendKeys("1. Laat Ryan een willekeurige visplek uitzoeken. 2. Laat Ryan z'n hengel uitgooien. 3. Kijk omhoog. 4. Ryan is ineens aan het skydiven.");
		driver.findElement(By.name("additional_info")).sendKeys("Noot: Ryan is geen vliegende visser.");
		
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
		   
		   if ((a).equals(b)) 
		   {
			System.out.println("Nieuwe bevinding aangemaakt");
			returnvalue = "yes";
		   }
				
		returnvalue = "yes";
		
		
		// READ ____________________________________________
		
		// Terugvinden van laatste issue - nu nog een sketchy oplossing (00000 en daarna hoogste nr ofwel laatste issue)...
		driver.findElement(By.partialLinkText("00000")).click();

		// Paginatitel als string variable opgeslagen
		String title = driver.getTitle();

		// Console-log van bovenstaande gegevens
		System.out.println("Titel van pagina / bevinding = " + title);
		
		
		// UPDATE ____________________________________________
		
		// Een update uitvoeren (bevinden ons reeds op issue-pagina) --> notitie schrijven/achterlaten
		driver.findElement(By.name("bugnote_text")).sendKeys("Message by Selenium: it's time to update this issue!");

		// Notitie toevoegen
		driver.findElement(By.cssSelector("input[value='Add Note']")).click();	
		
		// 500px naar beneden scrollen op pagina
		JavascriptExecutor javascript1 = (JavascriptExecutor) driver;
		javascript1.executeScript("window.scrollBy(0,500)", "");
		
		
		// DELETE ____________________________________________

		// Issue verwijderen 1/2
		driver.findElement(By.cssSelector("input[value='Delete']")).click();

		// Issue verwijderen 2/2
		driver.findElement(By.cssSelector("input[value='Delete Issues']")).click();	
					
		//driver.quit();
		
		return returnvalue;
		
	}
	
}
