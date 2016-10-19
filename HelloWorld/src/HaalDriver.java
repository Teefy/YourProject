import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HaalDriver {

	public static  WebDriver MaakChrome()
	{
		System.setProperty("webdriver.chrome.driver", "c://windows//chromedriver.exe");	
		WebDriver driver = new ChromeDriver();	
 		return driver;
	}
	
	public static  WebDriver MaakFirefox()
	{
		WebDriver driver = new FirefoxDriver();	
 		return driver;
	}
	
	public static  WebDriver MaakIE()
	{
		WebDriver driver = new InternetExplorerDriver();	
 		return driver;
	}
}
