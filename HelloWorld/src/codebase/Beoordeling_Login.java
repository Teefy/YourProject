package codebase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Beoordeling_Login {

	public boolean correctinloggen(String Omgeving, String Rol, String Browser) { 
	LoginPortal PortalInloggen = new LoginPortal();
	WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
	
	String a = driver.findElement(By.linkText("Log out")).getText();
	String b = "Log out";
	boolean returnvalue = false;
				
	driver.quit();
		if ((a).equals(b)) {
		returnvalue = true;
	   }

	return returnvalue;
	}
}
