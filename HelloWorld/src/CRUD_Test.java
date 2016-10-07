import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.internal.thread.TestNGThread;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
// hi  
public class CRUD_Test {
			
			// Testcase gericht op inloggen op CP/T + een issue aanmaken in Mantis

			public static void main(String[] args) throws IOException, InterruptedException {

			// Opgave van het systeempad naar chromedriver
			System.setProperty("webdriver.chrome.driver", "vul hier lokale systeempad naar chromedriver in");

			// Openen van nieuwe browservenster (Chrome)
		    WebDriver driver = new ChromeDriver();
		    
		    // Browser formaat: maximaliseren
		    driver.manage().window().maximize(); 

			// URL van website of applicatie als variable string opgeslagen
			String url = "http://accept.yourtestprojects.com/";

			// Openen van website of applicatie in browser
			driver.get(url);
			
			// Inloggen - username en password invoeren op CP/T 
			driver.findElement(By.name("name")).sendKeys("vul username hier in");
			driver.findElement(By.name("pass")).sendKeys("vul wachtwoord hier in");
			
			// Inloggen - submit button
			driver.findElement(By.name("op")).click();
			
			// Inloggen - naar Selenium projectomgeving
			driver.findElement(By.linkText("Selenium CP/T ACC")).click();
			
			// Klik op 'Issues'
			driver.findElement(By.linkText("Issues")).click();
			
			// Klik op 'Report Issue'
			driver.findElement(By.linkText("Report Issue")).click();
			
			// Invul-sectie van velden en dropdowns
			
			// Let op bij dropdowns 
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
			new Select(driver.findElement(By.name("custom_field_5"))).selectByVisibleText("rpreschel (Ruben Preschel)"); 
			
			new Select(driver.findElement(By.name("custom_field_1"))).selectByVisibleText("UAT"); 
			
			// Bestand en/of bijlage toevoegen - op deze manier werkt het zonder systeem-venster
			driver.findElement(By.id("ufile[]")).sendKeys("vul hier systeempad en naam in van bijlage");
			
			// Radio-buttons (de)selecteren
			driver.findElement(By.cssSelector("input[value='50']")).click();
			driver.findElement(By.cssSelector("input[value='10']")).click();
			
			// Screenshot maken van huidige pagina en opslaan op locatie/bureaublad
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File("vul hier systeempad en naam + bestandstype (bijv: .png) in van screenshot"));

			// Console-log dat er een screenshot is genomen + locatie
			System.out.print("Screenshot van ingevulde velden gemaakt en opgeslagen op Desktop (CREATE)");

			// Wachten 5sec (tbv DEMO)
			TestNGThread.sleep(5000);
			
			// Issue submit
			driver.findElement(By.cssSelector("input[value='Submit Report']")).click();	
			
			driver.findElement(By.linkText("View Issues")).click();
			
			// Wachten 3sec (tbv DEMO)
			TestNGThread.sleep(3000);				
			
			// Issue bekijken
			driver.findElement(By.linkText("0000009")).click();
			
			// Naar beneden scrollen op pagina, 200px in dit geval
			JavascriptExecutor javascript = (JavascriptExecutor) driver;
			javascript.executeScript("window.scrollBy(0,200)", "");
			
			// Screenshot maken van huidige pagina en opslaan op locatie/bureaublad
			File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot2, new File("vul hier systeempad en naam + bestandstype in van screenshot"));

			// Console-log dat er een screenshot is genomen + locatie
			System.out.print("Screenshot van aangemaakt issue gemaakt en opgeslagen op Desktop (READ)");

			// Wachten 5sec (tbv DEMO)
			TestNGThread.sleep(5000);		
						
			// Een update uitvoeren - notitie schrijven/achterlaten
			driver.findElement(By.name("bugnote_text")).sendKeys("Message by Selenium: it's time to update this issue!");

			// Wachten 5sec (tbv DEMO)
			TestNGThread.sleep(5000);		
			
			// Notitie submitten
			driver.findElement(By.cssSelector("input[value='Add Note']")).click();	

			// Naar beneden scrollen op pagina, 700px in dit geval
			JavascriptExecutor javascript1 = (JavascriptExecutor) driver;
			javascript1.executeScript("window.scrollBy(0,700)", "");
			
			
			// Screenshot maken van huidige pagina en opslaan op locatie/bureaublad
			File screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot3, new File("vul hier systeempad en naam + bestandstype in van screenshot"));

			// Issue verwijderen
			driver.findElement(By.cssSelector("input[value='Delete']")).click();	
			
			// Screenshot maken van huidige pagina en opslaan op locatie/bureaublad
			File screenshot4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot4, new File("vul hier systeempad en naam + bestandstype in van screenshot"));

			// Wachten 3sec (tbv DEMO)
			TestNGThread.sleep(3000);	
			
			// Issue verwijderen
			driver.findElement(By.cssSelector("input[value='Delete Issues']")).click();	
						
			// Screenshot maken van huidige pagina en opslaan op locatie/bureaublad
			File screenshot5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot5, new File("vul hier systeempad en naam + bestandstype in van screenshot"));
		}
	}
	
	