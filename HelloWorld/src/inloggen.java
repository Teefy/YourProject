import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class inloggen {
	
public  WebDriver InternInloggen()
	{
		System.setProperty("webdriver.chrome.driver", "c://windows/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://yourtestprojects.com/";
		driver.get(url);
		driver.findElement(By.name("name")).sendKeys("mvdweetering");
		driver.findElement(By.name("pass")).sendKeys("Grand000");
		driver.findElement(By.name("op")).click();
		return driver;
	}
} 