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
		new Select(driver.findElement(By.name("reproducibility"))).selectByVisibleText("random");
		new Select(driver.findElement(By.name("severity"))).selectByVisibleText("High");
		new Select(driver.findElement(By.name("Priority"))).selectByVisibleText("Medium");
		
		return null;
		
	}
}

