import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Beoordeling_Testcases {

	public String correctinloggen(String Omgeving, String Rol, String Browser) { 
	LoginPortal PortalInloggen = new LoginPortal();
	WebDriver driver = PortalInloggen.inloggen(Omgeving,Rol,Browser);
	
	String a = driver.findElement(By.linkText("Log out")).getText();
	String b = "Log out";
	String returnvalue = null;
				
	driver.quit();
		if ((a).equals(b)) {
		System.out.println("doet het");
		returnvalue = "true";
	   }

	return returnvalue;
	}
	}
