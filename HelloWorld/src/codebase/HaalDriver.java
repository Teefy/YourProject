import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HaalDriver {

	public static  WebDriver MaakChrome()
	{
		if (OsUtils.getOsName().equals("Windows 10")) {
			System.setProperty("webdriver.chrome.driver", "c://windows//chromedriver.exe");	
			}
			
	    if (OsUtils.getOsName().equals("Linux")) {
	        System.setProperty("webdriver.chrome.driver", "/home/youradministrator/eclipse/chromedriver");
	        } 

	    WebDriver driver = new ChromeDriver();	
 		return driver;
	}
	
	public static  WebDriver MaakFirefox() {
		
		if (OsUtils.getOsName().equals("Windows 10")) {
			System.setProperty("webdriver.gecko.driver", "c://windows//geckodriver.exe");	
			}
		
		if (OsUtils.getOsName().equals("Linux")) {
			System.setProperty("webdriver.gecko.driver", "/home/youradministrator/eclipse/geckodriver");
			 
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			 
			capabilities.setCapability("marionette", true);
			}
		
		WebDriver driver = new FirefoxDriver();	
 		return driver;
	
	}
	
	public static  WebDriver MaakIE()
	{
		WebDriver driver = new InternetExplorerDriver();	
 		return driver;
	}
}
