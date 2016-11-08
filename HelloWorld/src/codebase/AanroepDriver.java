package codebase;
import org.openqa.selenium.WebDriver;

public class AanroepDriver {
	
	public static void main(String[] args) {
		WebDriver driver = roepdriver("Chrome");
		String url = "http://yourtestprojects.com/";
		driver.get(url);
		driver.quit();
		
	}
	
	public static WebDriver roepdriver (String Browser) {
		
		if (Browser == "Chrome") {
		WebDriver driver = HaalDriver.MaakChrome();
		return driver;
		}
		
		if (Browser == "Firefox") {
		WebDriver driver = HaalDriver.MaakFirefox();
		return driver;
		}
		
		if (Browser == "IE") {
		WebDriver driver = HaalDriver.MaakIE();
		return driver;
		}		
		return null;
	}
}
